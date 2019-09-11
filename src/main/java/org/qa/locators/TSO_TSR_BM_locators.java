package org.qa.locators;

import org.gs4tr.qa.utility.BrowserFactory;

public class TSO_TSR_BM_locators {
	private static TSO_TSR_BM_locators ue;
	public static synchronized TSO_TSR_BM_locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new TSO_TSR_BM_locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new TSO_TSR_BM_locators();
		}
		return ue;
	}
	
	
	public final String loginButton ="//button//span[contains(text(),'Login')]";//"//span[text()='Log in' or text()='Login']";// "//span[text()='Login']//ancestor::button";
	public final String loginButton_disabled = "//a[contains(@class,'disabled')]//span[text()='Log in']";//div[starts-with(@id,'gs4trloginwindow')]//div[starts-with(@id,'button') and contains(@class,'x-item-disabled')]//span[contains(text(),'Login')]/..";
	public final String logoutButton = "//span[text()='Logout']/following-sibling::div";
	public final String inputLoginUsername = "//input[contains(@name,'username')]";//"//input[@name='userName']";
	public final String inputLoginPassword = "//input[contains(@name,'password')]";//"//input[@name='password']";
	public final String inputLoginOldPassword = "//input[@name='oldPassword']";
	public final String inputLoginNewPassword = "//input[@name='newPassword']";//"//div[@name='newPassword']//input[@name='newPassword']";
	public final String inputLoginNewPasswordRepeat = "//input[@name='repeatpassword']";//"//div[@name='repeatNewPassword']//input[@name='repeatNewPassword']";
	

	public final String admin_accountButton = "//div[contains(@id,'appsettingstool')]//span[contains(@id,'AppSettingsAccountButton')]";
	public final String admin_accountButton_impersonate = "//div//a//span[text()='Impersonate']";
	public final String admin_accountButton_switchBack_button = "//span[contains(text(),'Switch Back')]";
	public final String admin_accountButton_impersonate_searchInput = "//div[contains(@name,'userFilter')]//input[contains(@name,'userFilter')]";//"//div[contains(@name,'userFilter')]//input";//"//table[starts-with(@name,'textfield')]//input";
	public final String admin_accountButton_impersonate_yesButton = "//div[contains(@id,'warningdialog')]//span[text()='Yes']";//"//div[contains(@id,'warningdialog')]//span[text()='Yes']/following-sibling::span";
	public final String admin_accountButton_impersonate_noButton = "//div[contains(@id,'warningdialog')]//span[text()='No']";//"//div[contains(@id,'warningdialog')]//span[text()='No']/following-sibling::span";

	public final String logOut_yesButton = "//div[contains(@id,'warningdialog')]//div[contains(@id,'toolbar')]//span[text()='Yes']";
	public final String cacheRefresh_yesButton = "//div[contains(@id,'warningdialog')]//a//span[text()='Yes']";

	
	public final String WarningWithTextPasswExpired ="//div[contains(@class,'expiredwindow')]//p[contains(text(),'Your password has expired. Please change it using the form below.')]";//"//div[contains(@class,'PasswordExpired')]//div[text()='Your password has expired. Please change it using the form below.']";
	public final String preferences_general_inputRpeatNewPassword = "//div[@name='newPasswordRepeat']//input[@name='newPasswordRepeat']";	
	public final String preferences_expiredPassword_OkButton ="//div[contains(@id,'expiredwindow')]//button//span[contains(text(),'OK')]";//"//div[contains(@class,'PasswordExpired')]//a//span[text()='OK']";
	public final String preferences_ChangePassword_OkButton ="//div[contains(@class,'ChangePassword')]//a//span[text()='OK']";//"//div[contains(@class,'PasswordExpired')]//div//span[text()='OK']";//"//div[contains(@class,'ChangePassword')]//div//span[text()='OK']";//"//div[contains(@id,'passwordexpired')]//div//span[text()='OK']";//"//div[contains(@id,'ext-comp')][contains(@class,'ChangePassword')]//span[text()='OK']";
	public final String preferences_ChangePassword_OkButton_enabled ="//div[contains(@class,'ChangePassword')]//a[not(contains(@class,'disabled'))]//span[text()='OK']";
	public final String preferences_ChangePassword_warning_close_btn ="//div[contains(@id,'warningdialog')]//div[contains(@id,'toolbar')]//a//span[text()='Close']";
	public final String preferences_ChangePassword_terminateAllSession_warning_no_btn ="//div[contains(@class,' x-toolbar-footer')]//a//span[contains(text(),'No')]";
	public final String passwordExpired_okButton="//div[contains(@id,'expiredwindow')]//button//span[contains(text(),'OK')]";//"//div[contains(@id,'passwordexpired')]//a//span[text()='OK']";
	
	public final String preferencesButton = "//span[text()='Preferences']";
	public final String preferences_changePasswordButton = "//span[text()='Change Password']";
	public final String preferences_general_inputOldPassword = "//div[@name='oldPassword']//input[@name='oldPassword']";
	public final String preferences_general_inputNewPassword = "//div[@name='newPassword']//input[@name='newPassword']";
	public final String preferences_OkButton = "//div[contains(@id,'gs4trpreferences')]//span[contains(@id,'button') and contains(text(),'OK')]";	
	public final String preferences_OkButton_disabled ="//div[contains(@id,'gs4trpreferences')]//a[contains(@class,'disabled')]//span[contains(@id,'button') and contains(text(),'OK')]";//"//div[contains(@id,'gs4trpreferences')]//a[contains(@class,'disabled')]//span[contains(@id,'button') and contains(text(),'OK')]/following-sibling::span";

	
	public final String refreshButton = "//span[contains(text(),'Refresh')]";
	public final String trpRefreshButton="//button[contains(text(),'Refresh')]";
	public final String helpButton = "//span[contains(@class,'medium help')]";//"//span[contains(@class,'x-btn-icon-el help ')]";
	public final String helpWindow="//title[contains(text(),'GlobalLink_Project_Director_Help')]";
	
	//a[@data-qtip='Inbox']
	//Available Folder
		public final String workflow_availableSubmissionsFolder = "//a[contains(@id,'gs4trnavigationgroupfolderbutton')]//span[text()='Available']";
		public final String available_claimSubmissionButton = "//a[contains(@id,'claim')]//span[contains(text(),'Claim')]";//"//a[contains(@id,'claim_action')]//span[contains(text(),'Claim')]";//"//a[contains(@id,'claim_submission')]//span[contains(text(),'Claim')]/following-sibling::span";
		public final String available_claimSubmissionDTP_QM_Button = "//span[contains(@id,'pd_claim_source_submission_action')]/following-sibling::span";
		public final String inbox_uploadSubmission_message ="//div[contains(@id,'SubmissionUpload')]//span[text()='Please make sure you have run a Transcheck and spellcheck on all files before uploading.']";
		public final String available_PMclaimSubmissionButton = "//a[contains(@id,'claim_pm_action')]//span[contains(text(),'Claim')]";//"//a[contains(@id,'claim_action')]//span[contains(text(),'Claim')]";
		
		public final String available_claimCombSubmission_QmButton = "//span[contains(@id,'pd_download')][contains(text(),'Get Files')]";
		public final String available_reserveSubmissionButton = "//span[contains(@id,'reserve')]//span[contains(text(),'Reserve')]";//span[contains(@id,'pd_reserve_submission')]//span[contains(text(),'Reserve')]/following-sibling::span";//button[starts-with(@id,'pd_reserve_submission_action-')]";
		public final String available_reserveSubmissionButtonQm ="//span[contains(@id,'pd_reserve_submission_action')]//span[contains(text(),'Reserve')]/following-sibling::span";
		public final String available_claimSubmission_claimButton ="//div[contains(@class,'x-toolbar-footer')]//a//span[contains(text(),'Claim and get files')]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//span[contains(@class,'x-btn-inner') and contains(text(),'Claim and get files')]";// "//div[contains(@id,'Submission') or contains(@id,'submission')]//span[contains(@class,'x-btn-inner') and contains(text(),'Claim')]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//span[contains(@class,'x-btn-inner') and contains(text(),'Claim  translation')]/following-sibling::span";
		public final String available_claimSubmission_claimAnfGetFilesButton = "//div[contains(@class,'x-toolbar-footer')]//a//span[contains(text(),'Claim and get files')]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//span[contains(@class,'x-btn-inner') and contains(text(),'Claim and get files')]";
		
		public final String available_claimSubmission_claimTranslationOnlineButton = "//div[contains(@id,'submission') or contains(@id,'Submission')]//div[contains(@id,'toolbar')]//span[contains(text(),'Open')]";//div[contains(@id,'submission') or contains(@id,'Submission')]//div[contains(@id,'toolbar')]//span[contains(text(),'Online')]/following-sibling::span";//"//div[contains(@id,'submission') or contains(@id,'Submission')]//span[contains(text(),'Online')]";//"//div[contains(@id,'dialog')]//span[contains(text(),'Online')]";
		public final String available_claimSubmission_claimTranslationOfflineButton = "//div[contains(@id,'submission') or contains(@id,'Submission')]//span[contains(text(),'Download')]";//"//div[contains(@id,'submission') or contains(@id,'Submission')]//span[contains(text(),'Offline')]/following-sibling::span";
		public final String available_claimSubmission_checkTransStudioAvailability="//a//span[text()='Check TransStudio Availability']/following-sibling::span";
		public final String available_claimSubmission_greenTick="//span[text()='Check TransStudio Availability']/following-sibling::span[contains(@class,'checkedsign')]";
		public final String available_claimSubmission_redCross="//span[text()='Check TransStudio Availability']/following-sibling::span[contains(@class,'xsign')]";
		public final String available_claimSubmission_headerCheckboxChecked="//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@id,'grid')][contains(@class,'checker-on')]//div[contains(@class,'header-text')]/div/div";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@class,'header-last')][contains(@class,'checker-on')]";	
		public final String available_claimSubmission_headerCheckbox="//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@id,'grid')]//div[contains(@class,'header-text')]/div/div";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@class,'header-last')]//span";	
		
		public final String available_claimSubmission_Preview_Files_Button="//span[contains(text(),'Preview Files')]";//"//div[contains(@id,'submission') or contains(@id,'Submission')]//span[contains(text(),'Preview Files')]";//"//div[contains(@id,'submission') or contains(@id,'Submission')]//span[contains(text(),'Preview Files')]/following-sibling::span";
		public final String available_claimSubmission_Preview_Files_InfoMsg_check="//div[contains(@id,'PreviewInfoMessage')]//div[contains(@class,'checkBoxPosition')]//span[contains(@class,'x-form-checkbox-default')]";
		public final String available_claimSubmission_Preview_Files_InfoMsgClose_btn="//div[contains(@id,'PreviewInfoMessage')]//span[contains(text(),'Close')]";
		public final String available_claimReview_previewFiles_Button="//span[text()='Preview Files']";//div[contains(@id,'ClaimDialog')]//div[contains(@id,'toolbar')]//span[text()='Preview Files']";//"//div[contains(@id,'ActionWindow')]//a[not(contains(@class,'x-btn-disabled'))]//span[text()='Preview Files']/following-sibling::span";
		public final String available_claimReview_previewFilesButton_NotAvailable="//div[contains(@class,' x-toolbar-footer')]//a[contains(@class,'disable')]//span[contains(text(),'Preview Files')]";//"//div[contains(@id,'ActionWindow')]//a[contains(@class,'x-btn-disabled')]//span[text()='Preview Files']/following-sibling::span";
		public final String available_claimSubmission_Preview_Files_Button_Disabled="//a[contains(@class,'disabled')]//span[contains(text(),'Preview Files')]";//div[contains(@id,'submission') or contains(@id,'Submission')]//div[contains(@id,'toolbar')]//a[contains(@class,'disabled')]//span[contains(text(),'Preview Files')]";//"//div[contains(@id,'submission') or contains(@id,'Submission')]//div[contains(@id,'toolbar')]//a[contains(@class,'disabled')]//span[contains(text(),'Preview Files')]/following-sibling::span";
		public final String available_claimSubmission_Preview_FilesWindow_Download_Button="//a[contains(@id,'splitbutton')]/../a//span[contains(text(),'Download')]";//"//a[contains(@id,'SplitButton')]//span[text()='Download']";//"//a[contains(@id,'splitbutton')]//span[text()='Download']";//"//div[contains(@id,'previewfiles')]//span[text()='Download']/following-sibling::span";
		public final String available_claimReview_downloadFilesWindow="//div[contains(@id,'previewfilesdialog') ]//span[text()='Download File(s)']";
		public final String available_claimReview_previewFile_informationMessage_checkbox_checked="//div[contains(@id,'SubmissionPreviewInfoMessage')]//div[contains(@id,'checkbox')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
		public final String available_claimReview_previewFile_informationMessage_checkbox="//div[contains(@id,'SubmissionPreviewInfoMessage')]//div[contains(@id,'checkbox')]//span[contains(@class,'form-checkbox')]";
		public final String available_claimReview_previewFile_informationMessage_closeButton="//div[contains(@id,'SubmissionPreviewInfoMessage')]//div[contains(@id,'toolbar')]//span[contains(text(),'Close')]";
		public final String available_claimReview_previewFileDialog_sourceFilesTab="//a[contains(@id,'tab')]//span[contains(text(),'Source Files')]";
		
		
		public final String available_claimSubmission_claimTranslationOnline_selectFirstLanguage = "//div[contains(@id,'submission') or contains(@id,'Submission')]//div[contains(@id,'gridview')]//table//tr[1]//table//td//div";
		public final String available_claimSubmission_claimTranslationOnline_select_FirstLanguage = "//div[contains(@id,'submission') or contains(@id,'Submission')]//div[contains(@id,'gridview')]//table//tr[1]//td";
		public final String available_claimSubmission_fileManagement_downloadButton="//a[contains(@id,'SplitButton') or contains(@id,'splitbutton')]//span[text()='Download']";//"//a[contains(@id,'splitbutton')]//span[contains(text(),'Download')]";//"//div[contains(@id,'SubmissionManagementLinguist')]//a//span[contains(text(),'Download')]";
		public final String available_claimSubmission_fileManagement_downloadTXLF_Button="//a[contains(@id,'SplitButton')]//span[text()='Download TXLF']";
		public final String available_previewSubmission_fileManagement_downloadButton="//a[contains(@id,'splitbutton')]//span[contains(text(),'Download')]";//"//div[contains(@id,'SubmissionManagementLinguist')]//a//span[contains(text(),'Download')]";
		//Main Pane
		public final String chooseFirstSubmissionRow ="//div[contains(@id,'pdmaingrid') or contains(@id,'pdMainGrid')]//table[1]//tr[1]";//"//div[contains(@id,'pdmaingrid') or contains(@id,'pdMainGrid')]//table//tr[1]//td[2]";//"//div[contains(@id,'pdmaingrid') or contains(@id,'pdMainGrid')]//table//tr[1]";
		public final String chooseSecondSubmissionRow = "//div[contains(@id,'pdmaingrid') or contains(@id,'pdMainGrid')]//table[2]//tr[1]";
		public final String clickHere = "//div[contains(text(),'The files are now ready for download')]//a";//span[contains(text(),'Your file is now ready for download')]//a";
		public final String clickHereClose = "//div[contains(@id,'ext-comp')][contains(@class,'infomessages')]//div//img[contains(@class,'tool-close')]";	
		public final String uploadReport_close = "//div[contains(@class,'uploadReport')]//div[contains(@class,'tool-close')]";	
		//Inbox Folder
		public final String workflow_inboxSubmissionsFolder = "//*[@id='gs4trnavigationgroupfolderbutton-1207-btnIconEl']";
		public final String inbox_downloadSubmissionButton = "//span[contains(@id,'pd_download_submission_action')][contains(@class,'x-btn-inner-center')]/following-sibling::span";	
		public final String inbox_downloadCombinedSubmissionButoon="//span[contains(@class,'downloadcombinedsubmission')]/following-sibling::span";//div[starts-with(@id,'pd_download_combined_submission_action-')]";	
		public final String inbox_uploadCombinedSubmissionButton="//span[contains(@id,'upload_combined_submission')]//span[contains(@class,'uploadcombinedsubmission ')]";//div[starts-with(@id,'pd_upload_combined_submission_action-')]";
		public final String dtpInbox_downloadSubmissionButton = "//span[contains(@id,'pd_download_source_submission_action')]/following-sibling::span";
		public final String Inbox_get_deliver_translation_button = "//a[contains(@data-qtip,'Get/Deliver')]";

		
		//Vendor Dashboard Locators
		public final String firstDataRowName = "//tbody//tr//td[2]//div";
		public final String firstDataRowStatus = "//tbody//tr//td[15]//div";
		public final String firstDataRowProject = "//tbody//tr//td[10]//div";
		public final String sentFolder_firstDataRowStatus = "//table//tr[contains(@class,'x-grid-row')]"; //"css=table>tbody>tr>td:nth-child(10)>div>div";
		public final String my_submission = "//div//a//span//span//span[text()='My Submissions']";
		

		
		//PD5 LOCATORS	
		public final String fileManagementWizard_Tilte="//div[contains(@id,'SubmissionManagement')]//div[contains(text(),'File Management')]";//"//div[contains(@id,'ManagementLinguistDialog')]//div[contains(text(),'File Management')][contains(@class,'title-item')]";//"//div[contains(@id,'ManagementLinguistDialog')]//div[contains(text(),'File Management')]";
		public final String fileManagementWizard_openButton="//div[contains(@id,'Submission')]//a//span[text()='Open']";
		public final String fileManagementWizard_open_button_disabled="//div[contains(@id,'Submission')]//a[contains(@class,'disabled')]//span[text()='Open']";
		public final String fileManagementWizard_completeButton="//div[contains(@id,'Submission')]//a//span[contains(text(),'Complete All')]";
		public final String fileManagementWizard_completeButton_dropdown="//div[contains(@id,'Submission')]//a[contains(@id,'ManagementActiveSubSplitButton')]//span[contains(text(),'Complete All')]/../../following-sibling::span[contains(@class,'arrow')]";
		public final String fileManagementWizard_UploadButton="//div[contains(@id,'Submission')]//a//span[text()='Upload']";
		public final String fileManagementWizard_saveButton="//div[contains(@id,'Submission')]//a//span[text()='Save']";
		public final String fileManagementWizard_closeButton="//div[contains(@id,'Submission')]//a//span[text()='Close']";//"//div[contains(@id,'Submission')]//a//span[text()='Close']";
		public final String WarningDialogueWindow_Continue_button="//div[contains(@id,'SubmissionManagementDisclaimerWarningDialog')]//a[@tabindex='0']//span[text()='Complete']";//"//div[contains(@id,'SubmissionManagementDisclaimerDialog')]//a[@tabindex='0']//span[text()='Complete']";//div[contains(@id,'DisclaimerDialog')]//span[contains(text(),'Complete')]";//"//div[contains(@id,'warningdialog')]//span[contains(text(),'Continue') or contains(text(),'continue')]";
		public final String DialogueWindow_Complete_button="//div[contains(@class,' WarningDialog')][contains(@aria-hidden,'false')]//a//span[contains(text(),'Complete')]";
		public final String NormalReview_Complete_button="//span[contains(@class,' x-btn-inner')][text()='Complete']";
		public final String fileManagementWizard_closeButton_="//div[contains(@id,'SubmissionManagementLinguistDialog')]//a//span[text()='Close']";
		public final String WarningDialogueWindow_completeFiles_continue_button="//div[contains(@id,'SubmissionManagement')][not(contains(@class,'hidden-offsets'))][contains(@class,'WarningDialog')]//span[contains(text(),'Complete')]";//"//div[contains(@id,'SubmissionManagement')][not(contains(@class,'hidden-offsets'))][contains(@class,'WarningDialog')]//a[not(contains(@style,'display: none;'))]//span[contains(text(),'Complete')]";
		public final String WarningDialogueWindow_uploadStatus_closeButton="//div[contains(@id,'warningdialog')]//a[not(contains(@style,'display: none;'))]//span[contains(text(),'Close')]";//"//div[contains(@id,'toolbar')]//a[not(contains(@style,'display: none;'))]//span[contains(text(),'Close')]";//"//div[contains(@id,'warningdialog')]//a[not(contains(@style,'display: none;'))]//span[contains(text(),'Close')]";
		public final String DisclamerWindow_Complete_button="//div[contains(@id,'SubmissionManagement')][contains(@class,'WarningDialog')]//a[@tabindex='0']//span[text()='Complete']";//"//div[contains(@id,'SubmissionManagementDisclaimerDialog')][contains(@class,'WarningDialog')]//a[@tabindex='0']//span[text()='Complete']";

		
		
		
		
		//Filters Panel Locators//Filters Panel Locators
		public final String filters_saveFilterButton = "//span[text()='Save Filter']";//"//span[text()='Save Filter']/following-sibling::span";
		public final String filters_saveFilterButton_disabled = "//a[starts-with(@id,'button') and contains(@class,'x-btn-disabled')]//span[text()='Save']";
		public final String filters_removeButton = "//div[starts-with(@id,'gs4trnavigationsplitmenuitem') and contains(@class,'x-component-default')]//img[contains(@class,'gs4trsplit')]";
		public final String filters_removeButton(String filterName){
			return "//span[text()='"+filterName+"']/../div[contains(@class,'split')]";
		}
		public final String filters_errorCloseButton = "//div[contains(@id,'warningdialog')]//span[contains(text(),'Close')]";
		public final String filters_findButton = "//span[contains(@class,'find')]";
		public final String filters_clearButton = "//span[text()='Clear']";
		public final String filters_customizeButton = "//img[@data-qtip='Click to customize filter']";	
		public final String filters_saveFilter_inputFilterName = "//input[@name='filterName']";
		public final String filters_inputFilterSave_button = "//div[contains(@class,'x-window-default-closable')]/div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Save')]";//"//div[contains(@class,'x-window-default-closable')]/div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Save')]/following-sibling::span";
		public final String filters_inputFilterCancel_button = "//div[contains(@id,'navigations')]//span[contains(text(),'Cancel')]";
		public final String filters_removeCustomFilter_yesButton = "//div[contains(@id,'warning')]//span[contains(text(),'Yes')]/..";
		public final String filters_selectCustomFilter_dropDownMenu(String nameMenu){
			String result = "//em[starts-with(@id,'splitbutton')][child::button/span[text()='"+nameMenu+"']]";
			return result;
			
		}

		//pass the name of applied filter to be cleared
		public final String  filters_clearAppliedFilter(String filterWithTextToClear){
			String result = "//td[contains(@class,'gs4trfiltervaluespan ')][//div[contains(text(),'"+filterWithTextToClear+"')]]/following-sibling::td"; //"//div[contains(@class,'gs4trfiltervaluespan ') and contains(text(),'"+filterWithTextToClear+"')]/following-sibling::div"
			return result;
		}
		
		//new for PD 4.6
		public final String filters_chooseFilter_trigger = "//div[@name='fieldLabelCombo']//div[contains(@class,'x-form-arrow-trigger')]";
		public final String filters_chooseFilter_firstFilter = "//div[@name='fieldLabelCombo-boundlist']/div/ul/li";
		public final String filters_chooseFilter_secondFilter="//div[@name='fieldLabelCombo-boundlist']/div/ul/li[2]";
		public final String filters_chooseFilter_thirdFilter="//div[@name='fieldLabelCombo-boundlist']/div/ul/li[3]";
		
		public final String filters_chooseFilter_triggerFromDate = "//div[@name='fromDateFilter']//div[contains(@class,'trigger')]//div[2]";//"//table[@name='fromDateFilter']//table//div[contains(@class,'trigger')]";
		public final String filters_chooseFilter_comboTriggerFromDate = "//table[@name='comboFieldFilter']//table//div[@role='button']";
		public final String filters_chooseFilter_triggerToDate = "//div[@name='toDateFilter']//div[contains(@class,'date-trigger')]";//"//table[@name='toDateFilter']//table//div[contains(@class,'trigger')]";
		public final String filters_chooseFilter_valueFirstFilter (String text) {
		    	String result = "//div[contains(@name,'fieldLabelCombo-boundlist')]//div//li[text()='"+text+"']";
			return result;
		}
		public final String filters_firstInput = "//input[@name='textFieldFilter']";
		public final String filters_secondInput = "//input[contains(@name,'ComboFieldFilter')]";//"//input[@name='comboFieldFilter']";
		public final String filters_summaryfieldInput = "//input[@name='summaryField']";
		public final String filters_numberFieldInput = "//input[@name='numberFieldFilter']";
		public final String filters_popUpText_summaryfieldInput(String textFirstFilter)
		{
			return "//div[contains(@class,'x-container-default gs4trfullfiltercontainer')]//b[contains(text(),'"+textFirstFilter+"')]";
		}
		
		public final String filters_comboFieldSelectButton="//div[contains(@name,'ComboFieldFilter')and not(contains(@style,'display: none;'))]//div[2]";//"//table[contains(@name,'ComboFieldFilter') and not(contains(@style,'display: none;'))]//td/div[contains(@class,'x-form-trigger-first')]";
		public final String filters_comboFieldSelectButton2="//table[@name='firstComboFieldFilter' and not(contains(@style,'display: none;'))]//td/div[@role='button']";
		public final String filters_mySubmissions_pressed="//span[text()='My Submissions']//ancestor::button[ancestor::div[contains(@class,'x-btn-pressed')]/em]";
		public final String filters_mySubmissions="//span[text()='My Submissions']";//"//span[text()='My Submissions']/following-sibling::span";
		
		public final String filters_selectComboFieldValue(String filterValue) throws Exception {
			
			if(BrowserFactory.SystemEngine().verifyElementPresent("//div[contains(@name,'ComboFieldFilter')]//span[contains(text(),'"+filterValue+"')]", 5)){
				return "//div[contains(@name,'ComboFieldFilter')]//span[contains(text(),'"+filterValue+"')]";
			}else{
				return "//div[contains(@name,'ComboFieldFilter')]//li[contains(text(),'"+filterValue+"')]";
			}
			
			//"//div[contains(@name,'ComboFieldFilter')]//li[contains(text(),'"+filterValue+"')]";//"//div[contains(@id,'FieldComboBoundList')]//span[text()='"+filterValue+"']";
			//return "//span[text()='"+filterValue+"']";//"//li[text()='"+filterValue+"']";//""//span[text()='"+filterValue+"']";";
		}
		
		public final String filters_selectComboFieldValue_X(String filterValue)
		{
					
			return "//div[contains(@name,'fieldLabelCombo')]//li[contains(text(),'"+filterValue+"')]";//"//div[contains(@name,'ComboFieldFilter')]//li[contains(text(),'"+filterValue+"')]";//"//div[contains(@id,'FieldComboBoundList')]//span[text()='"+filterValue+"']";

			//return "//span[text()='"+filterValue+"']";//"//li[text()='"+filterValue+"']";//""//span[text()='"+filterValue+"']";";
		}
		
		
		public final String filters_popUpText_filterName(String filter)
		{
			return "//div[contains(@id,'gs4trfilterssummaryfullfielditemtext')]/div/div[text()='"+filter+"']";
		}
		public final String filters_MainTabsSplitName(String filter)
		{
			return "//span[text()='"+filter+"']/../preceding-sibling::button[contains(@class,'x-btn-split-right')]";
		}
		
		
		public final String addSubmission_calendarSelectDayX(String day)
		{	
			 return "//div[contains(@name,'DateFilter')][@aria-hidden='false']//table[contains(@class,'x-datepicker-inner')]//td[contains(@class,'active')]//div[text()='"+day+"']";
			//return "//div[contains(@name,'DateFilter')][not(contains(@style,'none'))]//table[@class='x-datepicker-inner']//td[not(contains(@class,'disabled'))]//a[text()='"+day+"']";
		}
}
