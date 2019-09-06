package org.qa.actions;

import org.gs4tr.qa.utility.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.qa.locators.TSO_TSR_BM_locators;

/*
@author: Mayureshwar

*/

public class common_methods {
	public static WebDriver driver;
	
	private static common_methods ue;
	public static synchronized common_methods exts(){
		try{
			if(ue.equals(null))
			{
				ue = new common_methods();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new common_methods();
		}
		return ue;
	}
	

	public void login() throws Exception
	{
		BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().inputLoginUsername).sendKeys("admin");
		BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().inputLoginPassword).sendKeys("password1!");
		BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().loginButton).click();
		Thread.sleep(4000);
	}
	
	
	
	
}
