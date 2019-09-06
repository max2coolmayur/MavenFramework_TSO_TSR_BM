package org.gs4tr.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/*
 * author-Mayureshwar

*/
public class BrowserFactory {
	public static  WebDriver driver;
	private static BrowserFactory testSystem;
	public static Properties prop;
	public Properties properties = new Properties();
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public static synchronized BrowserFactory SystemEngine() {
		try {
			if (testSystem.equals(null)) {
				testSystem = new BrowserFactory();
			}
		} catch (Exception NOSYSTEM) {
			testSystem = new BrowserFactory();
		}
		return testSystem;
	}
	
	public BrowserFactory(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/org/"
					+ "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static WebDriver startApplication()
	{
		String browName = prop.getProperty("browser");
		
		try {
			if(browName.equals("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-infobars");
				driver=new ChromeDriver(options);
				driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
				
			}
			else if(browName.equals("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
				driver=new FirefoxDriver();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			}
			else if(browName.equals("IE"))
			{
				System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
				driver=new InternetExplorerDriver();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			}
			else if(browName.equals("Edge"))
			{
				System.setProperty("webdriver.edge.driver", "./Drivers/MicrosoftWebDriver.exe");
				driver=new EdgeDriver();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			}
			else
			{
				System.out.println("We do not support this browser yet");
			}
			
			e_driver = new EventFiringWebDriver(driver);
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver = e_driver;
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;	
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
	/**
	 *  Finds an element using driver object
	 *  
	 * @param locator
	 * @return WebElement
	 */
	public  WebElement findElement(String locator)
	{
		return driver.findElement(By.xpath(locator));
	}
	
	public WebElement findElementByName(String locator)
	{
		return driver.findElement(By.name(locator));
	}

	public static boolean verifyElementPresent(String tagName, int second)
			throws Exception {
		boolean result = false;
		try{
			WebDriverWait wait = new WebDriverWait(BrowserFactory.driver,second);
			if(tagName.indexOf("/")!=0)
			{
				System.out.println("//");
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(tagName)));
			}
			else
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tagName)));
			}
			result=true;
		}
		catch(Exception e)
		{
			System.err.print(e);
			//throw new Exception(e);
		}
		return result;
	}

	
	@SuppressWarnings("static-access")
	public void writeToLog(String message)
	{
	((JavascriptExecutor)BrowserFactory.SystemEngine().driver).executeScript("type=\""+message+"\"");
	}
	
	@SuppressWarnings("static-access")
	public void writeVerifyToLog(String command,String element,String expectedValue,String result)
	{
	((JavascriptExecutor)BrowserFactory.SystemEngine().driver).executeScript("type=\""+"Verify|"+command+"|"+element+"|"+expectedValue+"|"+result+"|\"");
	}
	
	
	
	
	
}