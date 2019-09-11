package demoTest;

import java.util.LinkedHashMap;

import org.gs4tr.qa.utility.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.qa.actions.common_methods;
import org.qa.locators.TSO_TSR_BM_locators;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*********************************************************************************************************************
 * TSO_BM_Chrome : Demo template for BM test cases
 * 
 * Summary 		 : Summary of test case
 * 
 * Preconditions : Pre-conditions if any
 * 
 * @author Mayureshwar
 ***********************************************************************************************************************/


public class logintest extends BrowserFactory{

	public WebDriver driver;
	LinkedHashMap<String, String> dataSet = new LinkedHashMap<String, String>();	
	
	//Browser initialization and pre-conditions if any related to tcs.
	@BeforeClass
	public void setup()
	{
		dataSet.put("TL_test_case_description",
				" TSO-8175:Disable Preview Translation checked/unchecked");
		dataSet.put("TL_internal_testCase_ID", "8175");
		driver=BrowserFactory.SystemEngine().startApplication();
	}
	
	//Actual test case validations
	@Test
	@Parameters({"browser"})
	public void login() throws InterruptedException
	{
		try{
		//Login to PD	
				Assert.assertTrue(BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().inputLoginUsername, 5));
			

			common_methods.exts().login("admin", "password1!");
			
		
	} 	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
   }
		
	//After execution post settings if any & close the browser.
		@AfterClass
		public void teardown()
		{
			BrowserFactory.quitBrowser(driver);
			
		}
		
	}
