package tso.help_tab;

import org.gs4tr.qa.utility.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.qa.actions.common_methods;
import org.qa.locators.TSO_TSR_BM_locators;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*********************************************************************************************************************
 * 830638 : Verify Online Help and About dialog 
 * 
 * Summary 		 : This test case verifies Help tab options.
 * 
 * Preconditions : For TSO:
- Create a TXLF file format submission with one-step workflow using any doc file.
- Claim file online in TSO. TXLF editor should be opened.
 * 
 * @author Mayureshwar
 ***********************************************************************************************************************/


public class BM_TSO_830638 extends BrowserFactory
{

	public WebDriver driver;
	public String TL_test_case_description="830638:Disable Preview Translation checked/unchecked";
	public String TL_internal_testCase_ID="830638";
	
	String translator = "gla_common_user_translator";
	String password = "password1!";
	String submissionName = "gla_common_submission_tso";
	
	@BeforeClass
	public void setup()
	{
		driver=BrowserFactory.SystemEngine().startApplication();
	}
	
	@Test
	public void testcase() throws InterruptedException
	{
		try{
			common_methods.exts().login(translator, password);
			common_methods.exts().filterSubmission(submissionName, "Inbox", 10);
			
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().Inbox_get_deliver_translation_button).click();
			Thread.sleep(3000);
			
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().fileManagementWizard_openButton).click();
			Thread.sleep(5000);

			OpenTSO();
			
		
	       }
		catch (Exception e) {
	    	   e.printStackTrace();
	    	   }
	
   }
		
	public void OpenTSO() throws Exception {
		
		try {
			Thread.sleep(10000);
			System.out.println("\n In - translatewithTSO_allSegment() \n");
			
			common_methods.exts().switchToPopupWindow(1);

			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	}

	@AfterClass
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver);
			
	}
		
}
