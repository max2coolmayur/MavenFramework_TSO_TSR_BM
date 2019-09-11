package org.qa.actions;

import org.gs4tr.qa.utility.BrowserFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.qa.locators.TSO_TSR_BM_locators;

/*
@author: Mayureshwar

*/

public class common_methods {
	public static WebDriver driver;

	private static common_methods ue;

	public static synchronized common_methods exts() {
		try {
			if (ue.equals(null)) {
				ue = new common_methods();
			}
		} catch (Exception NOSYSTEM) {
			ue = new common_methods();
		}
		return ue;
	}

	public void login(String user, String passw) throws Exception {
		try {
			BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().inputLoginUsername, 80);
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().inputLoginUsername).sendKeys(user);
			Thread.sleep(2000);
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().inputLoginPassword).sendKeys(passw);
			Thread.sleep(2000);
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().loginButton).click();
			Thread.sleep(3000);

			BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().admin_accountButton, 5);
			System.out.println("\nLogin by -> " + user + "\n");
			Thread.sleep(2000);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void logout() throws Exception {
		System.out.println("In Method-logOut()-- \n");
		Thread.sleep(2000);
		BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().admin_accountButton, 60);
		BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().admin_accountButton).click();
		Thread.sleep(2000);
		BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().logoutButton, 10);
		BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().logoutButton).click();
		Thread.sleep(2000);
		BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().logOut_yesButton).click();
		Thread.sleep(3000);
		System.out.println("Logged Out...");
	}

	public void pd_logIn(String user, String passw) throws Exception {
		System.out.println("In Method-  pd4_logIn() \n");
		BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().inputLoginUsername, 80);
		BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().inputLoginUsername).sendKeys(user);
		Thread.sleep(2000);
		BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().inputLoginPassword).sendKeys(passw);
		Thread.sleep(2000);
		BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().loginButton).click();
		Thread.sleep(3000);

		if (BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().WarningWithTextPasswExpired,
				10) == true) {
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().inputLoginOldPassword).sendKeys(passw);
			Thread.sleep(2000);
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().inputLoginNewPassword)
					.sendKeys("password2!");
			Thread.sleep(2000);
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().inputLoginNewPasswordRepeat)
					.sendKeys("password2!");
			Thread.sleep(2000);
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().passwordExpired_okButton).click();
			Thread.sleep(4000);

			if (BrowserFactory.SystemEngine()
					.verifyElementPresent(TSO_TSR_BM_locators.exts().preferences_ChangePassword_warning_close_btn, 5)) {
				BrowserFactory.SystemEngine()
						.findElement(TSO_TSR_BM_locators.exts().preferences_ChangePassword_warning_close_btn).click();
				Thread.sleep(2000);
			}
			// General.action().cacheRefresh();
			BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().admin_accountButton, 30);
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().admin_accountButton).click();
			Thread.sleep(2000);
			BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().preferencesButton, 10);
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().preferencesButton).click();
			Thread.sleep(2000);
			BrowserFactory.SystemEngine()
					.verifyElementPresent(TSO_TSR_BM_locators.exts().preferences_changePasswordButton, 10);
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().preferences_changePasswordButton)
					.click();
			Thread.sleep(2000);
			BrowserFactory.SystemEngine()
					.verifyElementPresent(TSO_TSR_BM_locators.exts().preferences_general_inputOldPassword, 10);
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().preferences_general_inputOldPassword)
					.sendKeys("password2!");
			Thread.sleep(500);
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().preferences_general_inputNewPassword)
					.sendKeys("password1!");
			Thread.sleep(500);
			BrowserFactory.SystemEngine()
					.findElement(TSO_TSR_BM_locators.exts().preferences_general_inputRpeatNewPassword)
					.sendKeys("password1!");
			Thread.sleep(2000);
			// BrowserFactory.SystemEngine().selenium.fireEvent(TSO_TSR_BM_locators.exts().preferences_general_inputRpeatNewPassword,
			// "blur");

			if (BrowserFactory.SystemEngine()
					.verifyElementPresent(TSO_TSR_BM_locators.exts().preferences_ChangePassword_OkButton, 10)) {
				BrowserFactory.SystemEngine()
						.findElement(TSO_TSR_BM_locators.exts().preferences_ChangePassword_OkButton).click();
				Thread.sleep(2000);
			}
			// <s> Click 'Close' and then 'OK' </s>
			BrowserFactory.SystemEngine()
					.verifyElementPresent(TSO_TSR_BM_locators.exts().preferences_ChangePassword_warning_close_btn, 10);
			BrowserFactory.SystemEngine()
					.findElement(TSO_TSR_BM_locators.exts().preferences_ChangePassword_warning_close_btn).click();
			Thread.sleep(2000);
			BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().preferences_OkButton, 10);
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().preferences_OkButton).click();
			Thread.sleep(2000);
		}

		if (BrowserFactory.SystemEngine()
				.verifyElementPresent(TSO_TSR_BM_locators.exts().preferences_ChangePassword_warning_close_btn, 5)) {
			BrowserFactory.SystemEngine()
					.findElement(TSO_TSR_BM_locators.exts().preferences_ChangePassword_warning_close_btn).click();
			Thread.sleep(2000);
		}

		BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().admin_accountButton, 5);
		System.out.println("\nLogin by -> " + user + "\n");
		Thread.sleep(2000);
	}

	/**
	 * Go to specified folder, filter out submission and refresh until Status(if
	 * specified) is same as expected<br>
	 * select the submission
	 * 
	 * @param submissionName
	 *            name of the submission to be processed
	 * 
	 * @param folderName
	 *            name of the folder to process the submission in<br>
	 *            (Available,Inbox,
	 * 
	 * @throws Exception
	 *             used by Thread.sleep, which requires an exception handler.
	 */
	public boolean filterSubmission(String submissionName, String folderName,Integer second)
			throws Exception {
		
		if (folderName == "Available") {
			BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().workflow_availableSubmissionsFolder,10);
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().workflow_availableSubmissionsFolder).click();
			Thread.sleep(4000);
		    filterByFirstFilterType(submissionName);
			
				try {
					if (BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().chooseFirstSubmissionRow, second)) {
						BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().chooseFirstSubmissionRow).click();
						System.out.println("Submission Filter and Selected - Available Folder");
						return true;
					}
					
				} catch (Exception e) {
			}
		}
		else if (folderName == "Inbox") {
		
			
			BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().workflow_inboxSubmissionsFolder,10);
			BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().workflow_inboxSubmissionsFolder).click();
			Thread.sleep(2000);
	        filterByFirstFilterType(submissionName);
			
				try {
					if (BrowserFactory.SystemEngine().verifyElementPresent(TSO_TSR_BM_locators.exts().chooseFirstSubmissionRow, second)) {
						BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().chooseFirstSubmissionRow).click();
						System.out.println("Submission Filter and Selected - Inbox Folder");
						return true;
					}
				} catch (Exception e) {
			}
		}

		BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().firstDataRowName).click();
		Thread.sleep(3000);
		return true;
	}

	public final void filterByFirstFilterType(String filter) throws Exception {

		System.out.println("\nIn vendor.java -  filterByFirstFilterType()\n");
		Thread.sleep(1000);
		BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().filters_clearButton).click();
		Thread.sleep(2000);
		BrowserFactory.SystemEngine()
				.verifyElementPresent(TSO_TSR_BM_locators.exts().filters_chooseFilter_trigger, 10);
		Thread.sleep(1000);
		BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().filters_chooseFilter_trigger)
				.click();
		Thread.sleep(500);

		BrowserFactory.SystemEngine().verifyElementPresent(
				TSO_TSR_BM_locators.exts().filters_chooseFilter_valueFirstFilter("Submission Name"), 10);
		BrowserFactory.SystemEngine()
				.findElement(TSO_TSR_BM_locators.exts().filters_chooseFilter_valueFirstFilter("Submission Name"))
				.click();

		Thread.sleep(1000);
		BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().filters_firstInput)
				.sendKeys(filter);
		Thread.sleep(500);
		BrowserFactory.SystemEngine().findElement(TSO_TSR_BM_locators.exts().filters_findButton).click();
		Thread.sleep(1000);

		System.out.println("\nEOM - filterByFirstFilterType() - Option Filtered.\n");

	}
	
	
	public void switchToPopupWindow(int windowIndex) throws Exception{
		System.out.println("\nIn switchToPopupWindow()\n");
		BrowserFactory.SystemEngine();
		int noOfWindows=BrowserFactory.driver.getWindowHandles().toArray().length;
		System.out.println("No of Windows - "+noOfWindows);
		for(int i=0;i<noOfWindows;i++)
		{
			BrowserFactory.SystemEngine();
			System.out.println("Printing window handles - "+BrowserFactory.driver.getWindowHandles().toArray()[i]);
		}
		
		BrowserFactory.SystemEngine();
		BrowserFactory.SystemEngine();
		BrowserFactory.driver.switchTo().window(BrowserFactory.driver.getWindowHandles().toArray()[windowIndex].toString());
		Thread.sleep(2000);
		  System.out.println("\nEOM - switchToPopupWindow().\n");
	}
	


}
