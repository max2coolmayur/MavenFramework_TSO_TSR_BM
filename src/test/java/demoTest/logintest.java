package demoTest;

import java.util.LinkedHashMap;

import org.gs4tr.qa.utility.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.qa.actions.common_methods;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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
		
		driver=BrowserFactory.startApplication();
	}
	
	//Actual test case validations
	@Test
	public void login() throws InterruptedException
	{
		try{
		//Login to PD	
		common_methods.exts().login();
		
		Assert.assertTrue(driver.getTitle().contains("Project Director"));
		
		
	} 	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
   }
	@Test
	public void login2() throws InterruptedException
	{
		try{
		//Login to PD	
		//common_methods.exts().login();
		
		Assert.assertTrue(driver.getTitle().contains("Project Director"));
		
		
	} 	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
   }
	
	/*
	 * //Report public void report(String result, String notes) throws Exception {
	 * TestRailClient.testRailReportByID_production(dataSet.get(
	 * "TL_internal_testCase_ID"),TSO_TSR_TestRail_Common_Properties.idTestPlan,
	 * TSO_TSR_TestRail_Common_Properties.idBuild,result,
	 * TSO_TSR_TestRail_Common_Properties.assignedTo,notes); if(result == "f")
	 * assertTrue(false, ""); }
	 */
	
	//After execution post settings if any & close the browser.
		@AfterClass
		public void teardown()
		{
			BrowserFactory.quitBrowser(driver);
			
		}
		
	}
