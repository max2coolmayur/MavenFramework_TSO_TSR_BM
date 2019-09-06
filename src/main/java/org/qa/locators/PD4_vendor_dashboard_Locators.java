package org.qa.locators;
/*Created by Alfonso Almanza
 * 01/27/11 translations.com
 */
public class PD4_vendor_dashboard_Locators {
	private static PD4_vendor_dashboard_Locators ue;
	
	public static synchronized PD4_vendor_dashboard_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_vendor_dashboard_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_vendor_dashboard_Locators();
		}
		return ue;
	}
	
	//Vendor Dashboard Locators
	public final String firstDataRowName = "//tbody//tr//td[2]//div";
	public final String firstDataRowStatus = "//tbody//tr//td[15]//div";
	public final String firstDataRowProject = "//tbody//tr//td[10]//div";
	public final String sentFolder_firstDataRowStatus = "//table//tr[contains(@class,'x-grid-row')]"; //"css=table>tbody>tr>td:nth-child(10)>div>div";
	public final String my_submission = "//div//a//span//span//span[text()='My Submissions']";
	
//Quote Folder
	public final String workflow_createSubmissionQuoteButton = "//span[contains(@id,'pd_create_submission_quote_action')]";
	public final String quote_previewFilesButton = "//span[contains(@id,'pd_download_available_submission_action')]";
	public final String quote_quoteSubmissionsFolder = "//div[starts-with(@id,'pdnavigationtoolbar') and contains(@class,'x-toolbar-default')]//span[text()='Quote']";
	public final String quote_proceedQuote = "//span[contains(text(),'Proceed')]/following-sibling::span";
	public final String quote_BatchImg = "//div[contains(@id,'JobSelection')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String quote_AutoProp = "//label[text()='Auto-Propagate Line Items']/../input";
	public final String createQuoteWizard="//span[text()='Create Quote']";
	public final String quote_jobselection_cancelButton="//div[contains(@id,'JobSelection')]//span[text()='Cancel']/following-sibling::span";
	
	public final String quote_Discount = "//div[contains(@class,'CreateQuote')][not(contains(@style,'display: none'))]//table[contains(@name,'discountField')]//input[contains(@name,'discountField')]";//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//input[@name='discountField0']";
	public final String quote_QuantityInput = "//div[contains(@class,'CreateQuoteSubmissionDialog-grid')]//input[@name='quantityEditor']";//css=table[name='quantity'] input[name='quantity']";
	public final String quote_PPUInput = "//div[contains(@class,'CreateQuoteSubmissionDialog-grid')]//input[@name='pricePerUnitEditor']";//css=table[name='pricePerUnit'] input[name='pricePerUnit']";
	public final String quote_clearLanguages = "//table[contains(@name,'languages')]//div[@class='x-superboxselect-btn-clear']";
	public final String quote_selectLanguages = "//table[contains(@name,'languages')]//div[contains(@class,'x-superboxselect-btn-expand')]";
	
	public final String createQuote_autoQuoteField = "//td[label[text()='Autoquote Total']]/following-sibling::td/div";
	public final String createQuote_QuoteField = "//td[label[text()='Quote Total']]/following-sibling::td/div";
	public final String quote_comboNameX(String name){
		return "//div[contains(@id,'boundlist')]//li//div[contains(text(),'"+name+"')]";
	}
	
	public final String quote_QuantityForNameX(String name){
		return "//div[contains(@id,'createquotesubmissiondialog')]//div[contains(@id,'ext-comp')][not(contains(@style,'display: none'))][contains(@class,'CreateQuoteSubmissionDialog')]//table//tr[td/div[text()='"+name+"']]/td[2]/div";//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//tr[td/div[text()='"+name+"']]/td[2]/div";
	}

	public final String quote_PPUForNameX(String name){
		return "//div[contains(@id,'createquotesubmissiondialog')]//div[contains(@id,'ext-comp')][not(contains(@style,'display: none'))][contains(@class,'CreateQuoteSubmissionDialog')]//table//tr[td/div[text()='"+name+"']]/td[4]/div";//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//tr[td/div[text()='"+name+"']]/td[4]/div";
	}

	public final String quote_totalForNameX(String name){
		return "//div[contains(@id,'pdcreatequotesubmissiondialog')]//table//tr//td[div[contains(text(),'"+name+"')]]/following-sibling::td[4]";
	}
	public final String quote_combobatchNameX(String name){
		return "//div[contains(@id,'boundlist')]//li//div[contains(text(),'"+name+"')]";
	}
	public final String quote_combolanguageNameX(String name){
		return "//div[contains(@id,'boundlist')]//li[contains(text(),'"+name+"')]";
	}
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
	
	public final String available_claimReview_previewFileDialog_sourceFilesTab_fileName(String fileName) 
	{
		return "//div[contains(@name,'sourceFiles')]//table//div[contains(text(),'"+fileName+"')]";
	}
	
	
	public final String claimTranslation_batchForSubmission_isChecked(String submissionName) 
	{
		return "//div[contains(@name,'grid0')][//span[contains(text(),'"+submissionName+"')]]//table[contains(@id,'ext')][contains(@class,'table-selected')]//div[contains(@class,'row-checker')]";
	}
	
	public final String claimTranslation_batchForSubmission_selectCheckbox(String submissionName) 
	{
		return "//div[contains(@name,'grid0')][//span[contains(text(),'"+submissionName+"')]]//table[contains(@id,'ext')][contains(@class,'table-selected')]//div[contains(@class,'row-checker')]";
	}
	
	public final String available_claimReview_downloadFiles_fileName(String fileName) 
	{
		return "//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@name,'filesGrid')]//a[text()='"+fileName+"']";
	}
	
	public final String available_claimSubmission_claimTranslationOnline_selectRowX(Integer num) 
	{
		return "//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@id,'gridview')]//table//tr["+num+"]//table//td/following-sibling::td//div[contains(@class,'checker')]";
	}
	
	public final String available_claimSubmission_claimTranslationOnline_selectRow_X(Integer num) 
	{
		return "//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@id,'gridview')]//table//tr["+num+"]//td/following-sibling::td//div[contains(@class,'checker')]";
	}
	
	public final String available_claimSubmission_claimTranslationOnline_selectRowWithLanguageX_isChecked(String language) 
	{
		return "//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@id,'gridview')]//table[contains(@class,'table-selected')]//tr//table//td[div[contains(text(),'"+language+"')]]/following-sibling::td//div[contains(@class,'checker')]";
		}
	
	public final String available_claimSubmission_claimTranslationOnline_selectRowWithLanguageX(String language) 
	{
		return "//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@id,'gridview')]//table//tr//table//td[div[contains(text(),'"+language+"')]]/following-sibling::td//div[contains(@class,'checker')]";
		}
	public final String available_claimSubmission_claimTranslationOnline_selectRowWithFilenameX(String filename) {
		return "//td[div[contains(text(),'"+filename+"')]]/preceding-sibling::td//div[contains(@class,'row-checker')]";//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@id,'gridview')]//table//tr//td//div[contains(text(),'"+filename+"')]";
	}
	
	public final String available_claimSubmission_claimReviewOnline_selectRowWithFilenameX(String filename) {
		return "//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@id,'gridview')]//table//tr//td//div[contains(text(),'"+filename+"')]";
	}
	public final String available_claimSubmission_claimOnline_claim = "//div[contains(@class,' x-toolbar-footer')]//a//span[contains(text(),'Claim')]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//span[contains(@class,'x-btn-inner') and (text()='Claim')]";
	public final String available_claimSubmission_claimTranslationOnline_claimTranslationButton = "//div[contains(@class,'x-toolbar-footer')]//a//span[contains(text(),'Claim and get files')]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//span[contains(@class,'x-btn-inner') and contains(text(),'Claim and get files')]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@id,'toolbar')]//a//span[contains(text(),'Claim')]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//a//span[text()='Claim  translation']/following-sibling::span";
	public final String available_claimSubmission_claimTranslationOnline_claimTranslation_closeButton ="//span[text()='Close']";//a[contains(@id,'splitbutton')]/../a//span[contains(text(),'Close')]";//"//div[contains(@id,'Submission')]//a//span[text()='Close']";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//a//span[text()='Close']/following-sibling::span";
	public final String available_claimSubmission_claimTranslationOnline_claimProofButton = "//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@id,'toolbar')]//a//span[contains(text(),'Claim  proof')]/following-sibling::span";
	public final String available_claimSubmission_claimTranslationOnline_claimTranslationButtonDisabled = "//a[contains(@class,'disabled')]//span[contains(text(),'Claim  translation')]/following-sibling::span";

	public final String prooferclaimTranslation_claimTranslationOfflineButton="//div[contains(@id,'Submission') or contains(@id,'submission')]//a//span[contains(text(),'Offline')]/following-sibling::span";
	public final String available_claimSubmission_claimTranslationForLanguageX(String targetLanguage)
	{
		return "//tbody[tr//div[contains(text(),'"+targetLanguage+"')]]/tr//td//div[@class='x-grid-row-checker']";
	}
	
	public final String available_claimSubmission_getDuedateFor_languageX(String language){
		return "//div[contains(@id,'SubmissionPreviewBatchFileContainer')]//table//div[contains(text(),'"+language+"')]/../../..//td[4]//div";//"//div[contains(@id,'pdSubmissionDefaultAction')]//table//tr//div[div[contains(text(),'"+language+"')]]/following-sibling::table//tr//td[3]//div";
	}
	//public final String available_claimProofButton = "//div[@class='x-window x-layer x-window-default x-plain x-window-plain x-window-default-plain x-closable x-window-closable x-window-default-closable']/div[contains(@id,'toolbar')]//div[@class='x-btn x-box-item x-toolbar-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon'][not(contains(@style,'display: none'))]//button/span[contains(text(),'Claim  Proof')]";
	public final String available_claimProofButton= "//div[contains(@class,'x-toolbar-footer')]//a//span[contains(text(),'Claim and get files')]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//span[(contains(text(),'claim') or contains(text(),'Claim and get files'))]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//span[(contains(text(),'claim') or contains(text(),'Claim'))]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//span[(contains(text(),'proof') or contains(text(),'Proof'))]/following-sibling::span";//div[starts-with(@id,'toolbar') and contains(@class,'x-toolbar-footer x-docked-bottom')]//span[contains(text(),'Claim Proof')]//ancestor::button";
	public final String available_claimProofOfflineButton= "//div[contains(@id,'Submission') or contains(@id,'submission')]//span[(contains(text(),'Offline') or contains(text(),'offline'))]/following-sibling::span";
	
	public final String available_claimandGetDtpButton="//div[contains(@class,'x-toolbar-footer')]//a//span[contains(text(),'Claim and get files')]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//span[(contains(text(),'claim') or contains(text(),'Claim and get files'))]";
	public final String available_claimDtpButton="//div[contains(@id,'toolbar')]//a//span[text()='Claim  DTP']/following-sibling::span";//	"//div[contains(@id,'pdSubmissionDefaultAction')]//a/span/span/span[text()='Claim  DTP']";//div[contains(@id,'pddefaultsubmissionactiondialog')]//div[contains(@class,'x-btn-default-small-noicon')]//span[text()='Claim DTP']/..";

	public final String available_claimQmButton="//div[contains(@id,'submission') or contains(@id,'Submission')]//div[a//span[text()='Preview Files']]/a//span[contains(text(),'Claim  QM')]";//div[contains(@id,'pddefaultsubmissionactiondialog')]//div[contains(@class,'x-btn-default-small-noicon')]//span[contains(text(),'Claim Q')]/..";
	public final String available_claimQmOffilneButton="//div[contains(@id,'submission') or contains(@id,'Submission')]//a//span[contains(text(),'Offline') or contains(text(),'offline')]/following-sibling::span";
	public final String available_claimAndGetQmButton="//div[contains(@class,'x-toolbar-footer')]//a//span[contains(text(),'Claim and get files')]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//span[(contains(text(),'claim') or contains(text(),'Claim and get files'))]";
	//Common offline locator to claim
	public final String available_claimOffilneButton="//div[contains(@id,'submission') or contains(@id,'Submission')]//a//span[contains(text(),'Offline') or contains(text(),'offline')]/following-sibling::span";
	
	public final String available_claimQaButton="//div[contains(@id,'submission') or contains(@id,'Submission')]//a//span[text()='Claim  QA']/following-sibling::span";
	public final String available_claimQA_claimQaOffline="//div[contains(@id,'submission') or contains(@id,'Submission')]//a//span[contains(text(),'Claim  QA Offline') or contains(text(),'claim  QA offline')]/following-sibling::span";


	

	public final String available_previewFilesButton = "//span[contains(text(),'Preview')]";//"//span[contains(text(),'Preview Files')]/following-sibling::span";
	public final String available_previewFilesButtonQm ="//span[contains(@id,'pd_download_available_submission_action')]//span[contains(text(),'Preview Files')]/following-sibling::span"; //for tab QM
	public final String available_previewFilesButtonQA ="//span[starts-with(@id,'pd_download_available_submission_action')]/following-sibling::span";
	public final String available_previewFilesConfirmButton = "//div[contains(@id,'submission') or contains(@id,'Submission')]//a[not(contains(@style,'display: none'))]//span[text()='Preview Files']/following-sibling::span";//div[contains(@id,'pddefaultsubmissionactiondialog')]/div[3]/div/div/div[5]/em/button/span[text()='Preview Files']";
	public final String claim_cancelButton="//a[contains(@id,'splitbutton')]/../a//span[contains(text(),'Close')]";//"//div[contains(@id,'Submission')]//span[contains(@class,'x-btn-inner') and contains(text(),'Cancel')]/following-sibling::span";//css=div[id*='pddefaultsubmissionactiondialog'] button>span:contains('Cancel')";
	public final String claimSub_FMD_closeButton="//a[contains(@id,'button')]/../a//span[contains(text(),'Close')]";//"//div[contains(@id,'Submission')]//a//span[text()='Close']";
	public final String available_previewFiles_online_Button ="//div[contains(@id,'Submission')]//span[contains(@class,'x-btn-inner') and contains(text(),'Preview Files Online')]/following-sibling::span"; //for Preview Online
	public final String available_previewFiles_offline_Button ="//div[contains(@id,'Submission')]//span[contains(@class,'x-btn-inner') and contains(text(),'Preview Files Offline')]/following-sibling::span"; //for preview Offline
	public final String previewFiles_window_previewFiles_Button ="//div[contains(@id,'pdtargetleveldialog')]//div[contains(@id,'toolbar')]//a/span/span/span[text()='Preview Files']/following-sibling::span"; 
	public final String previewFiles_window_warning_OK_Button ="//div[contains(@id,'warning')]//span[text()='OK']/following-sibling::span";

	public final String claim_byBatchButton="//div[contains(@id,'pdSubmission')]//a//span[text()='By Batch']/following-sibling::span";//css=div[id*='pddefaultsubmissionactiondialog'] div:has(button>span:contains('By Language'))+div:has(button>span:contains('By Batch'))";
	public final String claim_selectFirstLanguagePair = "//div[contains(@id,'pddefaultsubmissionactiondialog')]//tr[3]//table//td[contains(@class,'x-grid-cell-row-checker')]/div";
	public final String claim_selectSecondLanguagePair = "//div[contains(@id,'pddefaultsubmissionactiondialog')]//tr[5]//table//td[contains(@class,'x-grid-cell-row-checker')]/div";
	public final String jobInfo_previewFiles_downloadButton = "//div[contains(@id,'toolbar')]//span[text()='Download']";//"//div[contains(@id,'pdsubmissiondialogspreviewfilesdialog')]//span[text()='Download']/following-sibling::span";
	public final String available_inbox_previewFiles_dueDate_firstLanguage = "//div[contains(@id,'SubmissionPreviewBatch')]//table//tr//td[4]/div";//"//div[contains(@id,'pdSubmissionDefaultAction')]//tr//table//td[3]/div";
	public final String available_inbox_previewFiles_dueDate_secondLanguage = "//div[contains(@id,'pdSubmissionDefaultAction')]//tr[2]//table//td[3]/div";
	public final String inbox_review_getReviewButton="//div[contains(@id,'pdactionbar')]//a//span[contains(text(),'Get')]";//"//div[contains(@id,'pdactionbar')]//a//span[contains(text(),'Get')]/following-sibling::span";//"//div[contains(@id,'pdactionbar')]//a//span[contains(text(),'Get')]";
	public final String review_downloadReferenceFile_windowTitle="//div[contains(@id,'ReviewReferenceFilesDialog')]//div//span[text()='Download Reference Files']";
	public final String review_downloadReferenceFile_downloadAll="//div[contains(@name,'referenceFiles')]//div[contains(@id,'DownloadColumn')]//span[contains(@class,'Grid_download')]";//"//a[contains(@id,'SubmissionManagement')]//span[text()='Download']";//div[contains(@class,'x-docked-bottom')]//span[text()='Download All']/following-sibling::span";//"//div[contains(@class,'x-docked-bottom')]//span[text()='Download All']";
	
	public final String available_previewFiles_cancelButton = "css=div[id*='pddefaultsubmissionactiondialog'] button>span:contains('Cancel')";
	public final String available_lookUpQuote_button = "//span[starts-with(@id,'pd_quote_lookup_action-')]";
	public final String available_previewSource_button = "//a[contains(@id,'pd_download_available_source_submission')]";
	public final String available_previewSourceDTP_button = "//a[contains(@id,'pd_download_available_source_submission_action') and contains(@data-qtip,'Click to Preview Source DTP')]";
	
	public final String translator_available_claimSubmissionButton="//div[contains(@id,'pdactionbar')]/div[div//em/button/span[text()='proofing']]/following-sibling::div/div[not(contains(@style,'none'))]//div[contains(@id,'pd_claim_submission_action')]/em/button/span[contains(text(),'Claim')]";	
	public final String proofer_available_claimSubmissionButton="//div[contains(@id,'pdactionbar')]/div[div//em/button/span[text()='proofing']]/following-sibling::div/div[not(contains(@style,'none'))]//div[contains(@id,'pd_claim_submission_action')]/em/button/span[contains(text(),'Claim')]";
	
	
	//DTP-Review
	public final String available_claim_DTP_ReviewSubmissionButton = "css=a[id*='pd_claim_review_submission'] span:contains('DTP_review')";
	public final String available_claim_DTP_ReviewButton = "//a//span//span//span[text()='Claim  DTP_review']";
	
	//Available Review
	public final String available_reserveReviewWindow_reserveReviewButton="//div[contains(@id,'submission') or contains(@id,'Submission')]//a//span[contains(text(),'Reserve and get files')]";//"//div[contains(@id,'submission') or contains(@id,'Submission')]//a//span[contains(text(),'Reserve')]";//div[contains(@id,'submission') or contains(@id,'Submission')]//a//span[contains(text(),'Reserve')]/following-sibling::span";
	
	
	
	public final String columnHeader(Integer column) {
		return "//div["+column+"][contains(@id,'gridcolumn')]/div//span";//"//div["+column+"][contains(@id,'gridcolumn')]/div";
	}
	
	
	public final String claimSubmissionbatchNameLanguageX(String langauge)
	{
		return "//table/tbody/tr/td//div[contains(text(),'Language: "+langauge+"')]";//"css=table>tbody>tr>td:contains('Language: "+langauge+"')";
	}
	
	public final String claimSubmissionbatchNameLanguage(String language)
	{
		return "//div[contains(@id,'SubmissionDefaultAction')]//td/div/div[contains(@class,'grid-group-title') and contains(text(),'"+language+"')]";//"css=div[id*='pdSubmissionDefaultActionGrid'] td>div>div[class='x-grid-group-title']:contains('"+language+"')";
	}
	public final String claimSubmissionbatchNameBatchX(String fileformatName)
	{
		return "//table/tbody/tr/td//div[contains(text(),'Batch: "+fileformatName+"')]";//"css=table>tbody>tr>td:contains('Batch: "+fileformatName+"')";
	}
	
	public final String claimSubmission_verifyFile(String filename)
	{
		return "css=div[id*='pdsubmissiontargetleveldialog'] table>tbody>tr[class*='x-grid-row']>td:nth-child(5)>div:contains('"+filename+"')";
	}
	
//Claim Translation window
	public final String claim_translation_selectBatchX (String batchName) 
	{
		return "//div[contains(@id,'Submission')]//table//tr//td//div[div[contains(text(),'Batch: "+batchName+"')]]/../table//tr";
	}
	public final String claim_translation_firstRow_checkbox = "//div[contains(@id,'gridview') or contains(@id,'GridView')]//table//tr[1]//td//span[contains(@class,'grid')]";//div[contains(@id,'target') or contains(@id,'Target')]//div[contains(@id,'gridview')]//table//tr[1]//td//div[contains(@class,'checker')]";//div[contains(@id,'targetleveldialog')]//div[contains(@id,'gridview')]//table//tr[1]//td//div[contains(@class,'checker')]";
	public final String claim_translation_rowTable = "//div[starts-with(@id,'pdsubmissiontargetleveldialog')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-grid-body x-panel-body-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[starts-with(@class,'x-grid-row')]";
	public final String claim_translation_checkbox_rowX(int row) 
	{
		return "//div[contains(@id,'pdSubmissionTargetLevel')]//div[contains(@id,'gridview')]//table/tbody/tr["+row+"][contains(@class,'x-grid-row')]/td/following-sibling::td[last()]";
	}
	public final String claim_translation_checkbox_verifyChecked(int row)
	{
		//locator specific to FILE Level Submission
		return "//div[contains(@id,'target') or contains(@id,'Target')]//div[contains(@id,'gridview')]//table//tr["+row+"][contains(@class,'selected')]//td//div[contains(@class,'checker')]";
	}
	
	public final String claim_translationOnline_rowTable = "//div[contains(@id,'submission') or contains(@id,'Submission')]//div//table//tr[contains(@class,'x-grid-row')]";
	public final String claim_translationOnline_checkbox_rowX(int row) 
	{
		return "//div[contains(@id,'submission') or contains(@id,'Submission')]//div[contains(@id,'gridview')]//table//tr["+(row)+"]//table//td//div[contains(@class,'checker')]";
		//return "//div[contains(@id,'pdtargetleveldialog')]//div[contains(@id,'gridview')]//table/tbody/tr["+(row+1)+"][contains(@class,'x-grid-row')]/td/following-sibling::td[contains(@class,'x-grid-cell-last')]";
	}
	
	public final String claim_translationOnline_checkbox_verifyChecked(int row) 
	{
		return "//div[contains(@id,'submission') or contains(@id,'Submission')]//div[contains(@id,'gridview')]//table//tr["+(row)+"][contains(@class,'selected')]//table//td//div[contains(@class,'checker')]";
	}
	
//Reserve Proof window
	public final String reserveProof_reserveProofButton = "//div[contains(@id,'SubmissionDefault')]//a//span[contains(text(),'Reserve  proof')]/following-sibling::span";
	//Reserve QM window

	public final String reserveQm_reserveQmButton = "//div[contains(@id,'submission') or contains(@id,'Submission')]//a//span[contains(text(),'Reserve and get files')]";//"//div[contains(@id,'submission') or contains(@id,'Submission')]//a//span[contains(text(),'Reserve')]";

	
	//Reserve QM window

	public final String reserveDtp_reserveDtpButton = "//div[contains(@id,'submission') or contains(@id,'Submission')]//a//span[contains(text(),'Reserve')]/following-sibling::span";

	
//Inbox Folder
	public final String workflow_inboxSubmissionsFolder = "//span[text()='Inbox']";
	public final String inbox_downloadSubmissionButton = "//span[contains(@id,'pd_download_submission_action')][contains(@class,'x-btn-inner-center')]/following-sibling::span";	
	public final String inbox_downloadCombinedSubmissionButoon="//span[contains(@class,'downloadcombinedsubmission')]/following-sibling::span";//div[starts-with(@id,'pd_download_combined_submission_action-')]";	
	public final String inbox_uploadCombinedSubmissionButton="//span[contains(@id,'upload_combined_submission')]//span[contains(@class,'uploadcombinedsubmission ')]";//div[starts-with(@id,'pd_upload_combined_submission_action-')]";
	public final String dtpInbox_downloadSubmissionButton = "//span[contains(@id,'pd_download_source_submission_action')]/following-sibling::span";
	
	public final String inbox_getFilesTranslation_translationbutton="//a[contains(@id,'process_linguist')]//span[contains(text(),'Get')]";//"//div[contains(@id,'SubmissionDefaultAction') or contains(@id,'actionbar')]//a//span[contains(text(),'Get translation')]";//"//div[contains(@id,'SubmissionDefaultAction')]//a//span[contains(text(),'Get translation Files')]/following-sibling::span";
	public final String inbox_getFilesQm_getFilesQm = "//div[contains(@id,'submission') or contains(@id,'Submission')]//a[not(contains(@style,'display: none'))]/span/span/span[contains(text(),'Get QM Files')]";//div[contains(@id,'pddefaultsubmissionactiondialog')]//div[contains(@class,'x-btn-default-small-noicon')]//span[contains(text(),'Get Q')]/..";
	
	public final String inbox_getQmFile_getQMfilesOffline="//div[contains(@id,'submission') or contains(@id,'Submission')]//a//span[contains(text(),'Offline') or contains(text(),'offline')]/following-sibling::span";
	public final String inbox_getFilesQm_getFilesQm1_2 = "//div[contains(@id,'submission') or contains(@id,'Submission')]//a[not(contains(@style,'display: none'))]//span[contains(text(),'Get Files  QM')]/following-sibling::span";
	public final String inbox_getQMFilesButton="//span[contains(@id,'pd_download')][contains(text(),'Get')]/following-sibling::span";
	public final String inbox_getFilesTranslations_checkSourceFiles = "//div[contains(@id,'pddownloadsourcedialog')]//label[text()='Source Files']";
	public final String inbox_getFilesTranslations_checkReferenceFiles = "//form[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder x-form']//div[2]//div//div//input";
	public final String inbox_getFilesTranslations_checkTranslationKit = "//div[contains(@id,'pddownloadsourcedialog')]//table[@name='checkbox1']//td//label[contains(text(),'Translation Kit')]";
	public final String inbox_getFilesTranslations_chooseType = "//div[contains(@id,'pddownloadsourcedialog')]//table[@name='fileFormatsCombo']//td//div[contains(@class,'trigger')]";
	public final String inbox_getFilesTranslations_selectDefaultFormat = "//div[@name='fileFormatsCombo-boundlist']//li[contains(text(),'DEFAULT Format')]";
	public final String inbox_getFilesTranslations_selectTtxFormat = "//div[@name='fileFormatsCombo-boundlist']//li[contains(text(),'TTX Format')]";
	public final String inbox_getFilesTranslations_OKButton = "//div[contains(@id,'pddownloadsourcedialog')]//span[text()='OK']/following-sibling::span";
	public final String inbox_getFilesTranslations_cancelButton="//div[starts-with(@id,'pddownloadsourcedialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Cancel')]/following-sibling::span";
	public final String inbox_getFilesProof = "//div[contains(@id,'SubmissionDefaultAction')]//div[contains(@id,'toolbar')]//a//span[contains(text(),'Get')]/following-sibling::span";

	public final String inbox_getFilesproofer_offline = "//div[contains(@id,'submission') or contains(@id,'Submission')]//span[contains(text(),'Offline') or contains(text(),'offline')]/following-sibling::span";//"//div[contains(@id,'submission') or contains(@id,'Submission')]//span[contains(text(),'Offline')]";

	
	public final String inbox_getFiles_getTranslationFilesOnline = "//div[contains(@id,'submission') or contains(@id,'Submission')]//span[text()='Get translation Files Online']/following-sibling::span";//css=div[id*='pddefaultsubmissionactiondialog'] span:contains('Get translation Files Online')";
	public final String inbox_getFiles_getTranslationFilesOffline = "//div[contains(@id,'submission') or contains(@id,'Submission')]//span[text()='Get translation Files Offline']/following-sibling::span";//css=div[id*='pddefaultsubmissionactiondialog'] span:contains('Get translation Files Offline')";
	public final String inbox_getFiles_getTranslationFilesOnline_getTranslationFilesButton ="//div[contains(@id,'submission') or contains(@id,'Submission')]//div[contains(@id,'toolbar')]//span[text()='Get translation Files']/following-sibling::span";
	public final String inbox_getFiles_getTranslationFilesOnline_getTranslationFilesButtonDisabled = "//a[contains(@class,'disabled')]//span[text()='Get translation Files']/following-sibling::span";
	public final String inbox_getFiles_getTranslationFiles_Button ="//div[contains(@id,'toolbar')][contains(@aria-hidden,'false')]//a[contains(@id,'process_linguistic_action')]//span[contains(text(),'Get')]";//"//a[contains(@id,'process_linguistic_action')]//span[contains(text(),'Get')]";//"//a[contains(@id,'process_linguistic_action')]//span[contains(text(),'Get Translation')]";//"//span[contains(@id,'pd_download_submission_action')]/following-sibling::span";
	public final String inbox_getTranslationFiles_getTranslationFilesButton ="//div[contains(@id,'SubmissionDefaultAction')]//div[contains(@id,'toolbar')]//a//span[text()='Get translation Files']/following-sibling::span";

	//Action Tabs
	public final String inbox_vendor_DTP_actionTab ="//div[contains(@id,'tabbar')]//span[contains(text(),'DTP')]";//"//div[contains(@id,'action')]//a//span[text()='DTP']/following-sibling::span";
	
	public final String inbox_requestDeadlineChange = "//span[contains(@id,'pd_request_deadline_action')]";
	//Note: for 4993,4995 following qm locator is common. so check only for Get as text
	public final String inbox_getFilesQm ="//div[contains(@id,'submission') or contains(@id,'Submission')]//a[not(contains(@style,'display: none'))]//span[contains(text(),'Get')]/following-sibling::span";
	public final String inbox_lookUpQuote_button = "//span[starts-with(@id,'pd_quote_lookup_action-')]";

	public final String inbox_uploadSubmissionButton = "//span[contains(@id,'pd_upload_submission_action')]//span[text()='Upload']/following-sibling::span";
	public final String inbox_uploadSubmissionWithoutValidationButton = "//span[contains(@id,'pd_upload_submission_no_validation_action')]//span[contains(@class,'uploadsubmissionnovalidation ')]";//"css=button>span.uploadsubmissionnovalidationlarge";		
	public final String inbox_uploadSubmissionWithPdfExportButton = "//span[contains(@id,'pd_upload_source_submission_with_export_action')]";
	public final String inbox_uploadNativeButton = "//span[contains(@id,'pd_upload_source_submission_action')]";

	public final String inbox_upload_inputUploadFile = "//input[contains(@name,'Upload')]";
	public final String inbox_upload_uploadConfirmButton ="//div[contains(@id,'UploadWindow')]//div[contains(@id,'toolbar')][contains(@class,'toolbar-footer')]//span[text()='Upload']";
	public final String inbox_upload_browseButton = "//span[text()='Browse...']/following-sibling::span";
	public final String inbox_releaseProofButton = "//div[contains(@id,'pdactionbar')]//a//span[contains(@id,'release_submission_action')][contains(@class,'x-btn-inner-center')]/following-sibling::span"; 
	public final String inbox_releaseProofingButton = "//button[contains(@id,'pd_release_submission_action')]//span[text()='Release Proofing']/following-sibling::span"; 
	public final String inbox_releaseDtpButton = "//span[contains(@id,'pd_release_submission_action')]//span[contains(text(),'Release')]/following-sibling::span"; 
	public final String inbox_releaseQmButton = "//button[contains(@id,'pd_release_submission_action') and contains(@data-qtip,'Click to Release Submission QM')]//span[contains(text(),'Release')]/following-sibling::span"; 
	public final String inbox_releaseQAButton = "//span[contains(@id,'pd_release_submission_action')]//span[contains(text(),'Release')]/following-sibling::span";
	public final String inbox_releaseSubmissionButton = "//div[contains(@id,'actionbar')]//span[contains(text(),'Unclaim')]";//"//div[contains(@id,'actionbar')]//span[contains(text(),'Unclaim Submission')]";//"//span[contains(@id,'pd_release_submission_action-')]/following-sibling::span";	
	public final String inbox_releaseReservedButton = "//div[contains(@id,'pd_release_reserved_action-')]/following-sibling::span";
	public final String getFilesDTP_getFilesDTPbutton = "//div[contains(@id,'submission') or contains(@id,'Submission')]//div[a//span[text()='Cancel']]//span[text()='Get Files  DTP']/following-sibling::span";
	public final String inbox_releaseSubmission_selectAllLanguages = "//div[contains(@id,'pdSubmissionDefaultAction')]//div[contains(@id,'headercontainer')]//div[contains(@class,'x-column-header-last')]//div//span[@class='x-column-header-text']";//css=div[id*='pddefaultsubmissionactiondialog'] div[class*='x-column-header-checkbox']>div>span";

	//Release Translation Window
	public final String releaseTranslation_releaseTranslationButton = "//span[text()='Release  translation'][@class='x-btn-inner x-btn-inner-center']/following-sibling::span";//div[@class='x-window x-layer x-window-default x-plain x-window-plain x-window-default-plain x-closable x-window-closable x-window-default-closable']/div[contains(@id,'toolbar')]//div[@class='x-btn x-box-item x-toolbar-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon'][not(contains(@style,'display: none'))]//button/span";
	
	public final String UnclaimTranslation_Unclaimbtn ="//div[contains(@id,'toolbar')][contains(@class,' x-toolbar-footer')]//a//span[contains(text(),'Unclaim')]"; 
	public final String UnclaimTranslation_Unclaimbtn_warningdia_Yes_btn ="//div[contains(@id,'warningdialog')]//span[contains(text(),'Yes')]";
	public final String releaseTranslation_checkAllbatches = "//div[starts-with(@id,'pddefaultsubmissionactiondialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'headercontainer')]//div[contains(@class,'x-column-header-last')]//div[contains(@class,'x-column-header-inner')]";
	
	//Works fro both Batch and Langauge Level
	public final String releaseTranslation_checkAllLanguages_Checkbox="//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@class,'header-last')]//span";
	public final String releaseTranslation_checkAllLanguages_checkboxChecked="//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@class,'header-last')][contains(@class,'checker-on')]";
//Release Proof Window

	public final String releaseTranslation_releaseProofButton = "//div[contains(@id,'submission') or contains(@id,'Submission') and contains(@class,'x-window-default')]//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Release  proof')]/following-sibling::span";

	
	//Release DTP Window
	public final String releaseTranslation_releaseDtpButton = "//div[starts-with(@id,'pdSubmissionDefaultActionWindow') and contains(@class,'x-window-default')]//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Release  DTP')]/following-sibling::span";
		
	//Release QM Window
	public final String releaseTranslation_releaseQmButton = "//div[starts-with(@id,'pdSubmissionDefaultActionWindow') and contains(@class,'x-window-default')]//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Release  QM')]/following-sibling::span";
//Sent Folder
	public final String workflow_sentSubmissionsFolder = "//a[contains(@id,'gs4trnavigationgroupfolderbutton')]//span[text()='Sent']";
	public final String workflow_sentFolder_getFilesButton = "//button[contains(@id,'pd_download_submission_action')]";
	public final String sent_finishSubmissionButton = "//span[contains(@id,'pd_finish_submission_action')]/following-sibling::span";

	public final String finishSubmission_finishButton = "//div[contains(@id,'Submission') or contains(@id,'submission')]//span[text()='Finish']/following-sibling::span";

	
//Completed Folder
	public final String workflow_completedSubmissionsFolder = "//a[contains(@id,'gs4trnavigationgroupfolderbutton')]//span[text()='Completed']";
	
//Main Pane
	public final String chooseFirstSubmissionRow ="//div[contains(@id,'pdmaingrid') or contains(@id,'pdMainGrid')]//table[1]//tr[1]";//"//div[contains(@id,'pdmaingrid') or contains(@id,'pdMainGrid')]//table//tr[1]//td[2]";//"//div[contains(@id,'pdmaingrid') or contains(@id,'pdMainGrid')]//table//tr[1]";
	public final String chooseSecondSubmissionRow = "//div[contains(@id,'pdmaingrid') or contains(@id,'pdMainGrid')]//table[2]//tr[1]";
	public final String clickHere = "//div[contains(text(),'The files are now ready for download')]//a";//span[contains(text(),'Your file is now ready for download')]//a";
	public final String clickHereClose = "//div[contains(@id,'ext-comp')][contains(@class,'infomessages')]//div//img[contains(@class,'tool-close')]";	
	public final String uploadReport_close = "//div[contains(@class,'uploadReport')]//div[contains(@class,'tool-close')]";	
	
//Filters
	public final String filter_inputSubmissionNameFind = "css=table[name='submissionNameInputText'] input[name='submissionNameInputText']";//css=form[class='x-panel-body x-panel-body-noheader x-form']>div>div>input";
	public final String filters_projectNameInput = "css=input[name='projectNameInputText']";
	public final String filters_fileNameInput = "css=input[name='fileNameInputText']";
	public final String filters_clearButton = "css=button:contains('Clear')";
	public final String filters_selectDateCreated = "//table[@name='dateComboBox']//table//div[contains(@class,'x-form-arrow-trigger')]";//"css=form[class='x-panel-body x-panel-body-noheader x-form']>div:nth-child(4) img";
	public final String filters_selectDateCreated_input = "//table[@name='dateComboBox']//table//input[@name='dateComboBox']";
	public final String filters_selectDueDate = "//table[@name='dueDateComboBox']//table//div[contains(@class,'x-form-arrow-trigger')]";
	public final String filters_selectDueDate_input = "//table[@name='dueDateComboBox']//table//input[@name='dueDateComboBox']";
	public final String filters_selectDateX(String date){
		return "//div[@name='dateComboBox-boundlist']//li[contains(@class,'x-boundlist-item') and text()='"+date+"']"; //"css=div.x-combo-list-item:contains('"+date+"')";
	}
	
	//Submission Status
	public final String filters_selectSubmissionStatus = "css=form[class='x-panel-body x-panel-body-noheader x-form']>div:nth-child(6) div.x-superboxselect-btn-expand";
	public final String filters_selectSubmissionStatus_input = "css=input[name='submissionStatuses']";
	public final String filters_selectSubmissionStatusX(String status){
		return "css=div.x-combo-list-item:contains('"+status+"')";
	}

	
	public final String proofingTab = "//div[contains(@id,'tabbar')]//span[contains(text(),'Proof')]";//"//div[starts-with(@id,'pdactionbar') and contains(@class,'x-box-item x-panel-default')]//span[contains(text(),'proofing')]";
	public final String translationTab = "//div[contains(@id,'actionbar')]//span[text()='Translation']";//"//div[contains(@id,'actionbar')]//span[text()='translation']/following-sibling::span";
	public final String reviewTab = "//div[contains(@id,'actionbar')]//span[text()='review']/following-sibling::span";
	public final String actionsTab = "//span[text()='actions']/..";
	public final String actionBar = "//div[starts-with(@id,'pdactionbar') and contains(@class,'x-panel-body-default')]/div[starts-with(@id,'toolbar')]";
	
	public final String deliverableCollateral = "//button[starts-with(@id,'pd_add_deliverable_collateral_action')]";
	
	
//Budget workflow 
	
	//Job Info
	public final String jobInfo_tab="//span[text()='Job Info']";
	public final String jobInfo_button = "//span[contains(@id,'job_info_action-')]";
	public final String inbox_jobInfo_button="//span[contains(@id,'pd_view_job_info_action')]";//"//button/span[contains(@class,'viewjobinfolarge')]";
	public final String jobInfo_AcceptRadialButton_first = "//div[contains(@id,'pdjobinfogrid')][contains(@class,'JobInfoGrid')][not(contains(@style,'display: none'))]//descendant::tr[contains(@class,'x-grid-row')][1]//td[contains(@class,'x-grid-cell-checkcolumn')][1]//div[contains(@class,'x-grid-radio-col')]";
	public final String jobInfo_AcceptRadialButton_second ="//div[contains(@id,'pdjobinfogrid')][contains(@class,'JobInfoGrid')][not(contains(@style,'display: none'))]//descendant::tr[contains(@class,'x-grid-row') and not(contains(@class,'x-grid-row-alt'))][2]//td[contains(@class,'x-grid-cell-checkcolumn')][1]//div[contains(@class,'x-grid-radio-col')]";
	public final String jobInfo_jobSelection_phaseTabX(String phase)
	{
		return "//div[contains(@id,'jobinfo')]//a//span[text()='"+phase+"']";
	}
	
	public final String jobInfo_previewFilesLink="//div[contains(@id,'jobinfo')]//a[text()='Preview Files']";
	public final String jobInfo_AcceptRadialButton_rowX( int row)
	//row 2 for the one language configuration, or find the row manually if multiple batches/languages
	{
		return "//div[starts-with(@id,'pdjobinfodialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'pdjobinfogrid') and contains(@class,'x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[contains(@class,'x-grid-cell-checkcolumn')][1]//div[contains(@class,'x-grid-radio-col')]";
	}
	
	public final String jobInfoDialog_EditMyOffer_Edit_Cancel_ref = "//div[starts-with(@id,'pdjobinfogrid')]//table//div//a[contains(text(),'Edit/Cancel')]";
	public final String jobInfoDialog_EditMyOfferMessage_EditMyOfferButton ="//div[contains(@id,'warning')]//div[contains(@id,'toolbar')]//span[contains(text(),'Edit My Offer')]/following-sibling::span";
	public final String jobIfoDialog_EditMyOfferMessage_DonotCancelButton="//div[contains(@id,'warning')]//div[contains(@id,'toolbar')]//span[contains(text(),'Do Not Cancel')]/following-sibling::span";
	public final String jobInfoDialog_editMyOfferMessage_CancelMyOfferButton="//div[contains(@id,'warning')]//div[contains(@id,'toolbar')]//span[contains(text(),'Cancel My Offer')]/following-sibling::span";
	public final String jobInfo_DeclineRadialButton_first = "//div[contains(@id,'pdjobinfogrid')][contains(@class,'JobInfoGrid')][not(contains(@style,'display: none'))]//descendant::tr[contains(@class,'x-grid-row')][1]//td[contains(@class,'x-grid-cell-checkcolumn')][2]//div[contains(@class,'x-grid-radio-col')]";//"//div[starts-with(@id,'pdjobinfodialog') and contains(@class,'x-window-default')]//div[contains(@id,'pdjobinfotabpanel')]//div[contains(@id,'pdjobinfogrid')][contains(@class,'JobInfoGrid')][not(contains(@style,'display: none'))]//descendant::tr[contains(@class,'x-grid-row')][1]/td[child::div/div[contains(@class,'x-grid-radio-col')]][2]//div[contains(@class,'x-grid-radio-col')]";
	public final String jobInfo_DeclineRadialButton_second ="//div[starts-with(@id,'pdjobinfodialog') and contains(@class,'x-window-default')]//div[contains(@id,'pdjobinfotabpanel')]//div[contains(@id,'pdjobinfogrid')][contains(@class,'JobInfoGrid')][not(contains(@style,'display: none'))]//descendant::tr[contains(@class,'x-grid-row')][3]/td[child::div/div[contains(@class,'x-grid-radio-col')]][2]//div[contains(@class,'x-grid-radio-col')]";
	public final String jobInfo_NegotiateRadialButton_first = "//div[contains(@id,'pdjobinfogrid')][contains(@class,'JobInfoGrid')][not(contains(@style,'display: none'))]//descendant::tr[contains(@class,'x-grid-row')][1]//td[contains(@class,'x-grid-cell-checkcolumn')][3]//div[contains(@class,'x-grid-radio-col')]";
	public final String jobInfo_NegotiateRadialButton_second ="//div[contains(@id,'pdjobinfogrid')][contains(@class,'JobInfoGrid')][not(contains(@style,'display: none'))]//descendant::tr[contains(@class,'x-grid-row')][3]//td[contains(@class,'x-grid-cell-checkcolumn')][3]//div[contains(@class,'x-grid-radio-col')]";
	public final String jobInfo_SubmitButton = "//div[contains(@class,'x-toolbar-footer x-docked-bottom')]//span[contains(text(),'Submit')]/following-sibling::span";
	public final String jobInfo_ConfirmCheckBox ="//input[@name='agreeCheckbox']"; 
	public final String jobInfo_ConfirmCheckBox_Checked ="//table[@name='agreeCheckbox'][contains(@class,'checked')]//input[@name='agreeCheckbox']";
	public final String jobInfo_NotInterestedButton ="//span[contains(text(),'Not Interested')]/following-sibling::span";
	public final String jobInfo_infoCloseButton="//div[contains(@id,'warning')]//span[text()='Close']/following-sibling::span";
	public final String jobInfo_checked_acceptRadioButton="css=div[class*='x-panel x-grid-panel'] td:nth-child(5)>div>div[class*='radio-col-on']";
	public final String jobInfoWizard_cancelButton="//div[contains(@id,'jobinfodialog')]//a//span[text()='Cancel']/following-sibling::span";//div[contains(@id,'jobinfodialog')]//span[text()='Cancel']";
	public final String jobInfo_previewfiles ="//div[starts-with(@id,'pdjobinfodialog') and contains(@class,'x-window-default')]//a[contains(@class,'previewlink')]";
	public final String jobInfoWizard_closeButton="//div[contains(@id,'jobinfodialog')]//span[text()='Close']/following-sibling::span";//css=div[id*='jobinfodialog'] span:contains('Close')
	public final String jobInfo_backgroundFrame="//iframe[@qaname='submissionBackground']";
	public final String jobInfo_backgroundValue="//html/body";
	public final String jobInfo_instructionsFrame="//iframe[@qaname='submissionInstructions']";
	public final String jobInfo_instructionsValue="//html/body";
	
	
	//button 'Yes' for warning dialog: 'Are you sure you would like to decline all phases for this job?'
	public final String jobInfo_confirmYesButton = "//div[starts-with(@id,'warning') and contains(@class,'x-window-default')]//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Yes')]/following-sibling::span";

	//language from batch of language: for instance: "German (Germany)", "French (France)" (Job info dialog, negotiate radial button)
	public final String jobInfo_NegotiateRadialButtonX (String language){
		return "//div[starts-with(@id,'pdjobinfodialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'pdjobinfogrid') and contains(@class,'x-panel-body-default')]//tr[td/div[text()='"+language+"']]/td[last()]";//div[contains(@id,'pdjobinfotabpanel')]//div[contains(@id,'pdjobinfogrid')]//table//tr[td//font[contains(text(),'"+language+"')]]/td[7]";
		}
	
	//Note: use This locator in scenarios when vendor negotiated once, pm makes some changes in review budget may not have accepted the budget, n vendor again goes to job info where another column add 'EDIT MY OFFER'
	public final String jobInfo_negotiateRadialButton_languageX(String language)
	{
		return "//div[starts-with(@id,'pdjobinfodialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'pdjobinfogrid') and contains(@class,'x-panel-body-default')]//tr[td/div[text()='"+language+"']]/td[7]//div[contains(@class,'x-grid-radio-col')]";
	}
	
	//job info tabs
	public final String jobInfoTabs(String phase){
		return "//div[starts-with(@id,'pdjobinfodialog') and contains(@class,'x-window-default')]//span[starts-with(@id,'tab') and contains(text(),'"+phase+"')]/following-sibling::span";
	}
	
	
	//pass tab: for tab 'translation' pass int 1, for tab 'proof' pass int 2; for row with 1 language pass int 1, for row with 1 language pass int 3 
	public final String jobInfo_selectTab_firstNegotiateRadialButtonX(int tab, int row){
		return "//div[starts-with(@id,'pdjobinfotabpanel') and contains(@class,'x-panel-body-default')]//descendant::div[contains(@id,'pdjobinfogrid') and contains(@class,'x-panel-default')]["+tab+"]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]//td[contains(@class,'x-grid-cell-checkcolumn')][3]//div[contains(@class,'x-grid-radio-col')]";
	}
	
	
	//Propose alternate	
	public final String negotiate_proposeAlt_firstRow_rate = "//div[contains(@id,'pdbudgetoverviewgrid')]//tr[td/div/span[text()='Vendor counter']]/td/div/span[@class='vendorProposal']";//css=div[id*='pdbudgetoverviewgrid'] table tr:nth-child(4)>td:nth-child(9)>div>span";
	public final String negotiate_proposeAlt_firstRow_DueDate = "//div[contains(@id,'pdbudgetoverviewgrid')]//tr[td/div/span[text()='Vendor counter']]/td[last()]";//css=div[id*='pdbudgetoverviewgrid'] table tr:nth-child(4)>td:nth-child(11)>div>span";
	public final String negotiate_proposeAlt_firstRow_rateInput = "//div[contains(@id,'pdbudgetoverviewgrid')]//input[@role='spinbutton']";//css=table[name='ratePrice'] input[name='ratePrice']";
	public final String negotiate_proposeAlt_vendorComment = "//div[contains(@id,'pdbudgetoverview')]//textarea[@name='vendorComment']";//css=table[name='vendorComment'] textarea";
	public final String negotiate_proposeAlt_secondRow_rate = "//div[contains(@id,'pdbudgetoverviewgrid')]//tr[td/div/span[text()='PM counter']]/td/div/span[@class='pmProposal']";//css=div[id*='pdbudgetoverviewgrid'] table tr:nth-child(5)>td:nth-child(9)>div>span";
	public final String negotiate_proposeAlt_secondtRow_DueDate = "//div[contains(@id,'pdbudgetoverviewgrid')]//tr[td/div/span[text()='PM counter']]/td[last()]";//css=div[id*='pdbudgetoverviewgrid'] table tr:nth-child(5)>td:nth-child(11)>div>span";
	public final String negotiate_proposeAlt_vendor_counter_tr ="//div[contains(@id,'pdbudgetoverviewgrid')]//tr[td/div/span[text()='Vendor counter']]";//div[starts-with(@id,'pdbudgetoverviewdialog-') and contains(@class,'x-window-body-default')]/div[starts-with(@id,'form')]//div[contains(@class,'x-panel x-panel-default')][2]//div[starts-with(@id,'pdbudgetoverviewgrid') and contains(@class,'x-grid-body x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-row')][3]";
	public final String negotiate_proposeAlt_firstRow_dueDateSelectButton="//div[contains(@id,'budgetoverview')]//table[contains(@class,'dueDate')]//td/div[contains(@class,'x-form-trigger')]";
	public final String negotiate_proposeAlt_firstRow_calendarSelectDayX(String day)
	{	
		return "//div[contains(@name,'datePicker')]//table[@class='x-datepicker-inner']//td[not(contains(@class,'disabled'))]//a[text()='"+day+"']";
	}
	public final String negotiate_proposeAlt_vendorCounter_dueDateCell="//div[@name='budgetGrid']//table/tbody/tr[3]/td[last()]";
	public final String negotiate_proposeAlt_vendorCounter_Title="//div[contains(text(),'Use this page to view details for the selected budget')]";
	
	//language from batch of language: for instance: "German (Germany)", "French (France)" (Job info dialog, negotiate radial button)
	public final String jobInfo_AcceptRadialButtonX (String language){
		return "//div[contains(@id,'jobinfogrid')]//table//tr[td/div[text()='"+language+"']]/td[5]/div/div";//div[starts-with(@id,'pdjobinfotabpanel') and contains(@class,'x-panel-body x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,'x-grid-cell-first')]//font[contains(text(),'"+language+"')]//ancestor::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,'x-grid-cell-checkcolumn')][1]//div[contains(@class,'x-grid-radio-col')]";
		}
	
	public final String jobInfo_submissionScope_languageSlectButton="//table[@name='costScopeLanguageCombo']//td/div[contains(@class,'trigger')]";
	public final String jobInfo_submissionScope_inputLanguage="//table[@name='costScopeLanguageCombo']//td/input";
	public final String jobInfo_SelectLanguageLevelX(String language) {
		return "//div[starts-with(@id,'boundlist') and contains(@class,'x-boundlist-default')]//li[contains(@class,'x-boundlist-item') and text()='"+language+"']";
	}
	
	public final String jobInfo_TotalWords = "//div[contains(@id,'jobinfocostscopegrid')]//tr[contains(@class,'x-grid-row')]/td[4]//span";
	public final String jobInfo_NoMatch = "//div[contains(@id,'jobinfocostscopegrid')]//tr[contains(@class,'x-grid-row')]/td[1]";
	public final String jobInfo_percentM = "//div[contains(@id,'jobinfocostscopegrid')]//tr[contains(@class,'x-grid-row')]/td[3]";
	public final String jobInfo_repetition = "//div[contains(@id,'jobinfocostscopegrid')]//tr[contains(@class,'x-grid-row')]/td[2]";
	public final String jobInfo_phaseX_dueDate_secondRow="//div[contains(@name,'jobInfoGrid')]//table/tbody/tr[3]/td[3]";
	public final String jobInfo_phaseX_budget_secondRow="//div[contains(@name,'jobInfoGrid')]//table/tbody/tr[3]/td[4]";
	public final String jobInfo_phaseX_dueDate_RowX(int row)
	{
		return "//div[contains(@name,'jobInfoGrid')]//table/tbody/tr["+row+"]/td[3]";
	}
	
	public final String getTranslationFilesButton="css=button>span[id*='pd_download_submission_action']";//"css=button>span[class*='downloadsubmissionlarge']";
	

	public final String previewFiles_checkSourceFiles="//div[contains(@id,'previewfiles')]//label[text()='Source Files']";
	public final String previewFiles_checkTranslationKit="//div[contains(@id,'previewfiles')]//label[text()='Translation Kit']";
	public final String previewFiles_fileformatSelectButton="//div[contains(@id,'previewfiles')]//table[@name='fileFormatsCombo']//td/div[contains(@class,'x-form-trigger')]";
	public final String previewFiles_close_button="//a[//span[text()='Download']][contains(@id,'splitbutton')]/following-sibling::a[contains(@id,'button')]//span[text()='Close']";//div[contains(@id,'ext-comp')]//span[contains(text(),'Close')]";//"//div[contains(@id,'previewfiles')]//span[text()='Close']/following-sibling::span";
	public final String previewFiles_selectFileformat(String format)
	{
		return "//div[contains(@name,'fileFormats')]//li[contains(text(),'"+format+"')]";
	}
	
	public final String previewFiles_downloadButton="//div[contains(@id,'toolbar')]//span[text()='Download']";//"//div[contains(@id,'previewfiles')]//span[text()='Download']/following-sibling::span";

	public final String previewFiles_previewReferenceFilesForLevelX(String level)
	{
		return "//div[contains(@id,'pdsubmissiondialogspreviewfilesdialog')]//td//span[contains(text(),'"+level+"') or contains(text(),'"+level+"')]";
	}
	
	public final String previewFiles_verifyReferenceFileForLevelX(String referenceFile)
	{
		return "//a[text()='"+referenceFile+"']";
	}
	
	
	//added @swapnil
	
	public final String available_claimTranslation_targetRows="//div[contains(@id,'submission') or contains(@id,'Submission')]//div/table[contains(@class,'x-grid-table')]/tbody/tr[not(contains(@class,'x-grid-row-selected'))]";//div[contains(@id,'submission')]//table[contains(@class,'grid')]//tbody/tr[not(contains(@class,'x-grid-row-selected'))]";//div[contains(@id,'submission')]//table[contains(@class,'grid')]//tbody/tr";//div[contains(@id,'pdsubmissiontargetleveldialog')]//table[contains(@class,'grid')]//tbody/tr";//div[contains(@id,'pdsubmissiontargetleveldialog')][div//span[contains(text(),'Claim')]]/following-sibling::div//table[@class='x-grid-table x-grid-table-resizer']/tbody/tr[contains(@class,'x-grid-row')]";
	public final String available_claimTranslation_selectTargetRowX(int row)
	{
		return "//div[contains(@id,'submission') or contains(@id,'Submission')]//table[contains(@class,'grid')]//tbody/tr["+row+"][contains(@class,'x-grid-data-row')]";//div[contains(@id,'pdsubmissiontargetleveldialog')][div//span[contains(text(),'Claim')]]/following-sibling::div//table[@class='x-grid-table x-grid-table-resizer']/tbody/tr[contains(@class,'x-grid-row')]["+row+"]";
	}
	public final String  inbox_vendor_actionTab_qmTab="//div[contains(@id,'tabbar')]//span[contains(text(),'QM') or contains(text(),'qm')]";//"//div[contains(@id,'actionbar')]//span[contains(text(),'QM')]/..";
	
	//For Multiple QM tabs
	public final String inbox_vendor_actionTab_qmTab(String qmNameTab)
	{
		return "//div[contains(@id,'tabbar')]//span[contains(text(),'"+qmNameTab+"')]";
	}
	//review 
	
	public final String available_claimReviewButton="//span[contains(@id,'claim_review')][contains(text(),'Claim')]";//"//span[contains(@class,'claimreviewsubmission')]";
	public final String claimReviewWizard_ClaimReviewButton="//div[contains(@id,'submission')]//a[span//span[text()='Preview Files']]/following-sibling::a[not(contains(@style,'none'))]/span/span/span";
	public final String reviewWizard_checkTransStudioAvailabiltyButton="//div[contains(@id,'Review')]//a//span[text()='Check TransStudio Availability']/following-sibling::span";
	public final String reviewWizard_openButton="//div[contains(@id,'Review')]//a//span[text()='Open']";//"//div[contains(@id,'Review')]//a//span[text()='Open']/following-sibling::span";
	public final String reviewWizard_disabled_openButton="//div[contains(@id,'Review')]//a[contains(@class,'unselectable')]//span[text()='Open']";//div[contains(@id,'Review')]//a[contains(@class,'x-item-disabled')]//span[text()='Open']";
	public final String reviewWizard_completeButton="//div[contains(@id,'Submission')]//a//span[contains(text(),'Complete All')]";//"//div[contains(@id,'Review')]//a//span[text()='Complete']/following-sibling::span";
	public final String reviewWizard_closeButton="//div[contains(@id,'Review')]//a//span[text()='Close']";//"//div[contains(@id,'Review')]//a//span[text()='Close']/following-sibling::span";//"//div[contains(@id,'Review')]//a//span[text()='Close']";
	public final String reviewWarning_ProceedAnyways_Button="//span[text()='Proceed anyway']";
	public final String reviewWarning_ReturnToDialouge_Button="//span[text()='Return to dialog']";
	public final String reviewWizard_InstructionsBackgroundButton="//div[contains(@id,'Review')]//a//span[text()='Background']";
	public final String reviewWizard_InstructionsButton="//div[contains(@id,'Review')]//a//span[text()='Instructions']";
	public final String reviewWizard_fileManagement_backgroundTab="//div[contains(@id,'Review')]//a//span[text()='Background']";
	public final String reviewWizard_InstructionsBackgroundWindow="//div[contains(@id,'ReviewInstructionsAndBackground')]//div//span[text()='Instructions and Background']";
	public final String reviewWizard_InstructionsBackgroundWindow_submissionBackground="//div[contains(@class,'fmd_background')]//div[contains(@class,'submission_management_base')]//div[@data-ref='innerCt']/font";//"//table[contains(@qaname,'submissionBackground')]//iframe";
	public final String claimReviewWizard_InstructionsBackgroundWindow_submissionInstructions="//div[contains(@id,'InstructionsAndBackground')]//table[contains(@qaname,'submissionInstructions')]//iframe";
	public final String reviewWizard_InstructionsAndBackgroundCloseButton="//div[contains(@id,'ReviewInstructionsAndBackground')]//a//span[text()='Close']/following-sibling::span";//"//div[contains(@id,'ReviewInstructionsAndBackground')]//a//span[text()='Close']";
	public final String claimReviewWindow_ClaimReviewButton="//div[contains(@class,'x-toolbar-footer')]//a//span[contains(text(),'Claim and get files')]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//span[contains(@class,'x-btn-inner') and contains(text(),'Claim and get files')]";//"//div[contains(@id,'Submission')]//div[contains(@id,'toolbar')]//span[contains(text(),'Claim')]";//div[contains(@id,'Submission')]//div[contains(@id,'toolbar')]//span[contains(text(),'Claim  review')]/following-sibling::span";//"//div[contains(@id,'Submission')]//div[contains(@id,'toolbar')]//span[text()='Claim  review']/following-sibling::span";
	public final String reviewWindow_comments_textarea="//table[contains(@qaname,'commentHtmlEditor')]//textarea/following-sibling::div";
	public final String reviewWindow_comments_iFrame="//div[contains(@qaname,'commentsEditor')]//iframe[contains(@id,'CommentsFieldEditor')]";//"//table[contains(@qaname,'commentHtmlEditor')]//textarea/..//iframe";
	public final String reviewWindow_comments_input="//html//body";
	public final String reviewBackgroundWindow_submissionBackground="//div[contains(@class,'background')]//div[contains(@data-ref,'innerCt')]//font";
	public final String reviewInstructionWindow_submissionInstruction="//div[contains(@class,'fmd_instructions')]//div[contains(@data-ref,'innerCt')]//font";//"//div[contains(@class,'instruction')]//div[contains(@data-ref,'innerCt')]//font";
	public final String reviewWindow_backToTranslationButton="//span[contains(text(),'Translation')]";//div[contains(@id,'ReviewDialog')]//a//span[contains(text(),'Return all to Translation')]";//"//span[contains(text(),'Translation')]";//"//div[contains(@class,'x-toolbar-footer')]//span[text()='Back to translation']/following-sibling::span";//"//div[contains(@id,'Review')]//a//span[text()='Back to translation']"
	public final String reviewWindow_backToTranslationButton_dropdown="//div[contains(@id,'Submission')]//a[contains(@id,'ManagementActiveSubSplitButton')]//span[contains(text(),'Back to Translation')]/../../following-sibling::span[contains(@class,'arrow')]";//"//div[contains(@id,'Submission')]//a[contains(@id,'ManagementActiveSubSplitButton')]//span[contains(text(),'Return all to Translation')]/../../following-sibling::span[contains(@class,'arrow')]";
			
	public final String reviewClaimSubmissionProjectBackgrounddiv="//div[contains(@class,'fakeClassForQA-claim_background')]//div[contains(@data-ref,'innerCt')]//font";
	public final String reviewClaimSubmissionProjectInstructionsdiv="//div[contains(@class,'fakeClassForQA-claim_instruction')]//div[contains(@data-ref,'innerCt')]//font";
	
	
	public final String reviewWindow_backToReview1Button="//div[contains(@class,'x-toolbar-footer')]//span[text()='Back to review1']/following-sibling::span";
	public final String reviewWizard_ReferenceFile="//div[contains(@id,'Review')]//a//span[text()='Reference Files']";//div[contains(@id,'Review')]//a//span[text()='Reference Files']/following-sibling::span";
	public final String reviewWizard_disabled_ReferenceFileButton="//div[contains(@id,'Review')]//a[contains(@class,'x-btn-disabled')]//span[text()='Reference Files']";
	public final String inbox_releaseReviewButton="//div[contains(@id,'pdactionbar')]//span[contains(@id,'unclaim') and contains(text(),'Unclaim')]";//"//div[contains(@id,'pdactionbar')]//span[contains(@id,'release_submission') and contains(text(),'Release')]/following-sibling::span";
	public final String inbox_releaseReviewWizard_releaseReviewButton="//div[contains(@role,'toolbar')]//a//span[contains(text(),'Unclaim')]";//div[contains(@id,'toolbar')]//a//span[contains(text(),'Release  review')]/following-sibling::span";
	public final String inbox_releaseReservedReviewButton="//div[contains(@id,'toolbar')]//a//span[contains(text(),'Release Reserved')]/following-sibling::span";
	public final String inbox_releaseReservedReviewWindow_unChecked_BatchCheckbox="//div[contains(@id,'SubmissionDefaultAction')]//table//table[not (contains(@class,'x-grid-table-selected-first'))]//tr//td/following-sibling::td//div[contains(@class,'x-grid-row-checker')]";
	public final String inbox_releaseReservedReviewWizard_releaseReservedReviewButton="//div[contains(@id,'SubmissionDefaultAction')]//div//a//span[text()='Release Reserved  review']/following-sibling::span";
	public final String inbox_getFiles_getReviewFiles_Button ="//span[contains(@id,'process_review_action')]//span[contains(text(),'Get')]";//span[contains(@id,'review_proofread_submission')]//span[contains(text(),'Get')]/following-sibling::span";//"css=span[id*='review_proofread_submission']";
	public final String reviewWizard_Continue_Button="//div[contains(@id,'warning')]//div[contains(@id,'toolbar')]//a//span[text()='Continue']/following-sibling::span";
	
	public final String reviewWizard_batchName_Status(String batchName,String status)
	{
		//return "//div[contains(@id,'pdSubmissionReviewGridBatch')]//table[contains(@class,'x-grid-table-selected-first')]//td[div[text()='"+batchName+"']]//following-sibling::td//div[text()='"+status+"']";//"//div[contains(@id,'pdSubmissionReviewTSRDemote')]//table[contains(@class,'x-grid-table-selected-first')]//td//div[text()='"+status+"']";
		//return "//div[contains(@id,'SubmissionManagementContextBatchGrid')]//table[contains(@class,'x-grid-item-selected')]//td[div[text()='"+batchName+"']]/following-sibling::td//span[text()='"+status+"']";
		return "//div[contains(@id,'SubmissionManagementActiveSubBatchGrid')]//table[contains(@class,'x-grid-item-selected')]//td[div[text()='"+batchName+"']]/following-sibling::td//span[text()='"+status+"']";
	}
	

	
	
	public final String reviewWizard_batchName_targetLanguage(String targetLanguage)
	{
		//return "//div[contains(@name,'batchesGrid')]//div//table//tr//td//div[contains(text(),'"+targetLanguage+"')]";
		return "//table//div[contains(text(),'"+targetLanguage+"')]";
	}
	
	
	public final String reviewWizard_fileName_Status(String status)
	{
		//return "//div[contains(@id,'pdSubmissionReviewGridFile')]//table//td//div[text()='"+status+"']";
		//return "//div[contains(@id,'SubmissionManagementContextFileGrid')]//td[div//span[text()='"+status+"']]";
		return "//div[contains(@id,'pdSubmissionManagementActiveSubFileGrid')]//td[div//span[text()='"+status+"']]";
	}
	public final String reviewfileName_Status(String status)
	{
		//return "//div[contains(@id,'pdSubmissionReviewGridFile')]//table//td//div[text()='"+status+"']";
		//return "//div[contains(@id,'SubmissionManagementContextFileGrid')]//td[div[text()='"+status+"']]";
		return "//div[contains(@id,'FileGrid')]//table//td[div[text()='"+status+"']]";
	}
	public final String reviewWizard_fileNameX(String filenameX)
	{
		//return "//div[contains(@id,'Review')]//div[contains(@id,'ReviewGridFile')]//table/tbody/tr/td//span[contains(text(),'"+filenameX+"')]";//"//div[contains(@id,'Review')]//div[contains(@id,'ReviewGridFile')]//table/tbody/tr/td//span[text()='"+filenameX+"']";
		return "//span[contains(text(),'"+filenameX+"')]";
	}
	
	public final String reviewWizard_fileNameX_selected(String filenameX)
	{
		return "//div[contains(@id,'Review')]//div[contains(@id,'ReviewGridFile')]//table//tbody//tr[contains(@class,'grid-row-selected')]/td//span[contains(text(),'"+filenameX+"')]";
	}
	
	public final String reviewWizard_fileNameX_wholeSegment(String filenameX)
	{
		return "//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@name,'fileGrid')]//div[span[contains(text(),'"+filenameX+"')]]";
	}
	
	
	
	
	public final String reviewWizard_fileNameX_withoutHyperLink(String filenameX)
	{
		return "//div[contains(@id,'Review')]//div[contains(@id,'ReviewGridFile')]//table/tbody/tr/td//div[text()='"+filenameX+"']";
	}
	
	public final String reviewWizard_statusRowX(int row)
	{
		return "//div[contains(@id,'Review')]//div[contains(@id,'ReviewGridFile')]//table/tbody/tr/td["+row+"]";
	}
	
	public final String reviewWizard_wordCountARowX(String row)
	{
		return "//div[contains(@id,'Review')]//div[contains(@id,'ReviewGridFile')]//table/tbody/tr/td["+row+"]";
	}
	
	public final String reviewWizard_versionRowX(String row)
	{
		return "//div[contains(@id,'Review')]//div[contains(@id,'ReviewGridFile')]//table/tbody/tr/td['"+row+"']";
	}
	
	public final String vendor_dashboard_GoToAdmin_button="//div[contains(@class,'gs4tr-navigation-Toolbar')]//span[text()='Go to Admin']";//"//div[contains(@class,'gs4tr-navigation-Toolbar')]//span[text()='Go to Admin']";
	
	public final String review_instructionBackground_submissionInstruction_verifyInstruction(String text)
	{	
		
		return "//div[contains(@id,'SubTabPanel')][contains(@class,'panel-default')]//font[contains(text(),'"+text+"')]";
		//return "//div[contains(@id,'BaseComponentTab')][contains(@class,'panel-default')]//font[contains(text(),'"+text+"')]";
		//"//div[contains(@id,'ReviewInstructionsAndBackground')]//table[contains(@qaname,submissionInstructions)]//div[textarea[contains(text(),'"+text+"')]]//iframe";//"//div[contains(@id,'ReviewInstructionsAndBackground')]//table[contains(@qaname,submissionInstructions)]//div[textarea[text()='"+text+"']]//iframe"; //"//div[contains(@id,'ReviewInstructionsAndBackground')]//table[contains(@qaname,'submissionInstructions')]//div[contains(@id,'container')]//textarea[contains(text(),'"+text+"')]/following-sibling::iframe";//"//div[contains(@id,'ReviewInstructionsAndBackground')]//table[contains(@qaname,'submissionInstructions')]//div[textarea[text()='"+text+"']]//iframe";
	}
	
	public final String review_instructionBackgroundWindow_submissionBackground_verifyBackgroundText(String text)
	{
		return "//div[contains(@id,'ubTabPanel')]//font[contains(text(),'"+text+"')]";//"//div[contains(@id,'ReviewInstructionsAndBackground')]//table[contains(@qaname,submissionBackground)]//div[textarea[contains(text(),'"+text+"')]]//iframe";//"//div[contains(@id,'ReviewInstructionsAndBackground')]//table[contains(@qaname,submissionBackground)]//div[textarea[text()='"+text+"']]//iframe";//"//div[contains(@id,'ReviewInstructionsAndBackground')]//table[contains(@qaname,'submissionBackground')]//div[textarea[text()='"+text+"']]//iframe";
	}
	
	public final String inbox_check_submissionName_italics(String submissionName)
	{
		return "//div[contains(@name,'pagingToolbar')]//table//tr//td/following-sibling::td//span[contains(@class,'fontStyle-italic') and text()='"+submissionName+"']";
	}
	
	public final String inbox_reviewWizard_fileName_rightClick_menuItem(String menu)
	{
		return "//div[contains(@id,'ReviewTSR')]//following-sibling::div//div[contains(@id,'menu')]//a//span[text()='"+menu+"']";
	}
	
	public final String reviewWizard_openButton_warningMessage(String message)
	{
		return "//div[contains(@id,'warningdialog')]//div[contains(@id,'panel')]//div[contains(text(),'"+message+"')]";
	}
	
	
	
	
	//TODO Below are PD5 specific locators
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
	
	//File Management File upload report
	public final String fileManagementWizard_fileUpload_Report_Link="//div[contains(@class,'uploadReport')]//a[contains(text(),'Open')]";
	public final String fileManagementWizard_fileUploadReport_closeButton="//div[contains(@class,'uploadReport')]//a//span[contains(text(),'Close')]";
	public final String fileManagementWizard_fileUploadReport_validationResultRow(Integer row)
	{
		return "//div[contains(@class,'pd-uploadReport-dialog')]//table//tr["+row+"]//td[6]";
	}
	//div[contains(@id,'SubmissionReportUploadRejected')]//table//tr//div[contains(text(),'Remote')]
	public final String fileManagementWizard_fileUploadReport_fileRejected(String filename)
	{
		return "//div[contains(@id,'SubmissionReportUploadRejected')]//table//tr//div[contains(text(),'"+filename+"')]";
	}
	//File Management Tabs
	public final String fileManagementWizard_SupplementrayFiles_Tab="//div[contains(@id,'TabPanel')]//a//span[contains(text(),'Supplementary Files')]";
	
	//Add supplementary Files
	public final String addCollateral_addFileToSelect = "//div[contains(@id,'DeliverableCollateral')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String addCollateral_addFile = "css=button.x-btn-text.browse";
	public final String addCollateral_addCollateral_addFile_input = "css=input[class='x-form-file']";
	public final String addCollateral_uploadFile = "//div[contains(@id,'DeliverableCollateral')]//span[contains(@class,'upload')]";
	public final String addCollateral_OkButton = "//div[contains(@id,'DeliverableCollateralAdd-')]//span[text()='OK']";
	public final String addCollateral_CancelButton = "//div[contains(@id,'DeliverableCollateralAdd-')]//span[text()='Cancel']/following-sibling::span";
	
		
	public final String filemanagement_addCollateral_addFileToSelectX(String lang)
	{
		return "//div[contains(@name,'addFileToCombo')]//li[text()='"+lang+"']";
	}
	
	public final String filemanagement_addCollateral_uploadPane(String fileName)
	{
		return "//div[contains(@id,'DeliverableCollateral')]//tr[contains(@class,'x-grid-row')]//div[text()='"+fileName+"']";
	}
	public final String filemanagement_addCollateral_deleteFile(Integer row)
	{
		return"//div[contains(@id,'DeliverableCollateral')]//table["+row+"]//div[contains(@class,' icon_delete')]";
	}
	
	public final String fileManagementWizard_backToTranslationButton_dropdown_options(String options){
		return "//div[contains(@id,'menu')]//a//span[contains(text(),'"+options+"')]";
	}
	public final String fileManagementWizard_completeButton_dropdown_options(String options){
		return "//div[contains(@id,'menu')]//a//span[contains(text(),'"+options+"')]";
	}
	public final String tso_available_claimSubmission_claimTranslationOnline_selectRow_byLanguage(String language) 
	{
		return "//div[contains(@name,'ClaimGrid') or contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//input[contains(@value,'"+language+"')]/preceding-sibling::span";//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//span[contains(@identifier,'"+languageCode+"')]";
	}
	
	public final String releaseReserveSubmission_claimSubmission_selectRow_byLanguage(String language) 
	{
		return "//div[contains(@name,'ClaimGrid') or contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//input[contains(@value,'"+language+"')]/preceding-sibling::span";//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//span[contains(@identifier,'"+languageCode+"')]";
	}
	
	public final String tso_available_claimSubmission_claimTranslationOnline_selectRow_byLanguage_checked(String language) 
	{
		return "//div[contains(@name,'ClaimGrid') or contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//input[contains(@value,'"+language+"')]/preceding-sibling::span[contains(@class,'checker_selected')]";//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//span[contains(@identifier,'"+languageCode+"')][contains(@class,'checker_selected')]";
	}
	
	public final String releaseReserveSubmission_claimSubmission_selectRow_byLanguage_checked(String language) 
	{
		return "//div[contains(@name,'ClaimGrid') or contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//input[contains(@value,'"+language+"')]/preceding-sibling::span[contains(@class,'checker_selected')]";//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//span[contains(@identifier,'"+languageCode+"')][contains(@class,'checker_selected')]";
	}
	
	//byFileLevel
	public final String tso_available_claimSubmission_claimTranslationOnline_selectRow_byFile(String language,String fileName) 
	{
		return "//div[contains(@name,'ClaimGrid') or contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//td//div[contains(text(),'"+language+"')]/../..//td//div[contains(text(),'"+fileName+"')]/../../../tr//div[contains(@class,'row-checker')]";
	}
	public final String tso_available_claimSubmission_claimTranslationOnline_selectRow_byFile_checked(String language,String fileName) 
	{
		return "//div[contains(@name,'ClaimGrid') or contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//td//div[contains(text(),'"+language+"')]/../..//td//div[contains(text(),'"+fileName+"')]/../../../tr[@aria-selected='true']//div[contains(@class,'row-checker')]";
	}
	
	public final String tso_available_claimSubmission_claimTranslationOnline_selectRow_atMultipleLanguageLevel(String language) 
	{
		return "//div[contains(@name,'ClaimGrid') or contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//td//div[contains(@data-groupname,'"+language+"')]//span[contains(@class,'row-checker')]";//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//span[contains(@identifier,'"+languageCode+"')]";
	}
   public final String tso_available_claimSubmission_claimTranslationOnline_selectRow_atMultipleLanguageLevel_checked(String language) 
    {
	return "//div[contains(@name,'ClaimGrid') or contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//td//div[contains(@data-groupname,'"+language+"')]//span[contains(@class,'row_checker_selected')]";//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//td[//div[contains(@data-groupname,'"+language+"')]]//span[contains(@class,'row_checker_selected')]";
    }	
	
	public final String tso_available_claimSubmission_claimTranslationOnline_selectRow_atBatchLevel(String language) 
	{
		return "//div[contains(@id,'SubmissionClaimGrid')]//table[contains(@id,'ClaimGridViewTable')]//td//div[contains(text(),'"+language+"')]/../..//div[contains(@class,'x-grid-row-checker')]";
		//"//div[contains(@id,'SubmissionClaimGrid')]//table[contains(@id,'ClaimGridViewTable')]//td//input[contains(@value,'"+language+"')]/../span[contains(@class,'row-checker')]";
		//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//td[//div[contains(text(),'"+language+"')]]//div[contains(@class,'row-checker')]";//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//span[contains(@identifier,'"+languageCode+"')]";
	}
	
	public final String releaseReserveSubmission_claimSubmission_selectRow_atBatchLevel(String language) 
	{
		return "//div[contains(@id,'SubmissionClaimGrid')]//table[contains(@id,'ClaimGridViewTable')]//td//div[contains(text(),'"+language+"')]/../..//div[contains(@class,'x-grid-row-checker')]";
		//"//div[contains(@id,'SubmissionClaimGrid')]//table[contains(@id,'ClaimGridViewTable')]//td//input[contains(@value,'"+language+"')]/../span[contains(@class,'row-checker')]";
		//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//td[//div[contains(text(),'"+language+"')]]//div[contains(@class,'row-checker')]";//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//span[contains(@identifier,'"+languageCode+"')]";
	}
	
		public final String tso_available_claimSubmission_claimTranslationOnline_selectRow_atBatchLevel_checked(String language) 
	{
		return "//div[contains(@id,'SubmissionClaimGrid')]//table[contains(@id,'ClaimGridViewTable')][contains(@class,'item-selected')]//td//div[contains(text(),'"+language+"')]/../..//div[contains(@class,'x-grid-row-checker')]";
				//"//div[contains(@id,'SubmissionClaimGrid')]//table[contains(@id,'ClaimGridViewTable')]//td//input[contains(@value,'"+language+"')]/../span[contains(@class,'row-checker')][contains(@class,'selected')]";
		//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')][contains(@class,'selected')]//td[//div[contains(text(),'"+language+"')]]//div[contains(@class,'row-checker')]";
	}
		
		public final String releaseReserveSubmission_claimSubmission_selectRow_atBatchLevel_checked(String language) 
	{
		return "//div[contains(@id,'SubmissionClaimGrid')]//table[contains(@id,'ClaimGridViewTable')][contains(@class,'item-selected')]//td//div[contains(text(),'"+language+"')]/../..//div[contains(@class,'x-grid-row-checker')]";
				//"//div[contains(@id,'SubmissionClaimGrid')]//table[contains(@id,'ClaimGridViewTable')]//td//input[contains(@value,'"+language+"')]/../span[contains(@class,'row-checker')][contains(@class,'selected')]";
		//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')][contains(@class,'selected')]//td[//div[contains(text(),'"+language+"')]]//div[contains(@class,'row-checker')]";
	}
	
	public final String tso_available_claimSubmission_claimTranslationOnline_selectRow_atMultipleBatchLevel(int rowNum) 
	{
			return "//div[contains(@name,'ClaimGrid')]//table["+rowNum+"][contains(@id,'ClaimGridViewTable')]//tr//td//div[contains(@class,'row-checker')]";//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//span[contains(@identifier,'"+languageCode+"')]";
	}	
	
	 public final String tso_available_claimSubmission_claimTranslationOnline_selectRow_atMultipleBatchLevel_Checked(int rowNum) 
	 {
	   return "//div[contains(@name,'ClaimGrid')]//table["+rowNum+"][contains(@id,'ClaimGridViewTable')][contains(@class,'item-selected')]//tr//td//div[contains(@class,'row-checker')]";//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//span[contains(@identifier,'"+languageCode+"')]";
	 }
		
	
	public final String tso_available_claimSubmission_claimTranslation_fileManagement_selectBatch (String batchName){
		return "//div[contains(@name,'batchGrid')]//table//td//div[contains(text(),'"+batchName+"')]";
	}
	
	public final String translationWizard_fileNameX_wholeSegment(String filenameX)
	{
		return "//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@name,'fileGrid')]//div[span[contains(text(),'"+filenameX+"')]]";
	}
	public final String translationWizard_fileNameX_wholeSegment_Cancelled(String filenameX)
	{
		return "//div[contains(@id,'LinguistFileGrid')]//table//tr[contains(@class,'crossed')]//span[contains(text(),'"+filenameX+"')]";
	}
	
	public final String translationWizard_BatchNameX_wholeSegment(String batchNameX)
	{
		return "//div[contains(@name,'batchGrid')]//table//td//div[contains(text(),'"+batchNameX+"')]";
	}
	
	public final String translationWizard_BatchNameX_wholeSegment_byRowNumber(String batchName,int rowNumber)
	{
		return "//div[contains(@name,'batchGrid')]//table[//td//div[contains(text(),'"+batchName+"')]]["+rowNumber+"]";
	}
	
	public final String translationWizard_BatchNameX_targetLanguage(String batchName)
	{
		//return "//div[contains(@name,'batchGrid')]//table[//td//div[contains(text(),'"+batchName+"')]]//td[4]//div[contains(text(),'"+targetLanguage+"')]";
		return "//table[contains(@id,'ClaimGridView')]//td[//div[text()='"+batchName+"']][3]/preceding-sibling::td//div[contains(@class,'row-checker')]";
		
	}
	
	//Preview Mains
	public final String previewMain_plus_lastRow_moreLink="//div[contains(@id,'treeview')]//table[contains(@id,'treeview')]//span//a[contains(text(),'more')]";
	public final String previewMain_plus_lastRowX(Integer row){
		return "//div[contains(@id,'treeview')]//table[contains(@id,'treeview')]["+(row)+"]/tbody/tr/td/div/div[contains(@class,'x-tree-elbow-end-plus')]";//"//div[contains(@id,'treeview')]/table[contains(@id,'treeview')]/tbody/tr["+(row+1)+"]/td/div/img[contains(@class,'x-tree-elbow-end-plus')]";//div[contains(@id,'treeview')]/table[@class='x-grid-table x-grid-table-resizer']/tbody/tr["+(row+1)+"]/td/div/img[contains(@class,'x-tree-elbow-end-plus')]";
	}
	
	public final String previewMain_plus_lastRow_fileName(String fileName){
		return "//div[contains(@id,'treeview')]//table//td//span[contains(text(),'"+fileName+"')]";
	}
	public final String tsr_available_claimSubmission_claimTranslationOnline_selectRow_byLanguage_checked(String language) 
	{
		return "//div[@data-groupname='"+language+"']//span[contains(@id,'ext-element')]";//"//input[contains(@value,'"+language+"')]/preceding-sibling::span[contains(@class,'pd_submission_claim_grid_Grid_groupingCheckbox')]";//"//div[contains(@name,'claimGrid')]//table[contains(@id,'ClaimGridViewTable')]//span[contains(@identifier,'"+languageCode+"')][contains(@class,'checker_selected')]";
	}
	
	public final String tsr_available_claimSubmission_claimTranslationOnline_selectRow_All="//div[contains(@name,'claimGrid')]//div[contains(@class,'checkbox')]//div[contains(@data-ref,'textContainer')]//div[contains(@data-ref,'text')]";
	
	public final String reviewInstructionWindow_submissionInstructionText(String text){
		return "//div[contains(@class,'instruction')]//div[contains(@data-ref,'innerCt')]//font[contains(text(),'"+text+"')]";
	}
	public final String reviewInstructionWindow_submissionBackgroundText(String text){
		return "//div[contains(@class,'background')]//div[contains(@data-ref,'innerCt')]//font[contains(text(),'"+text+"')]";
	}
	public final String Review_Select_DifferentFileWithStatus(String fileName,String Status){
		return "//td[div//span[contains(text(),'"+fileName+"')]]/following-sibling::td[div//*[contains(text(),'"+Status+"')]]";
				
	}
	
	//FMD Dialog
	public final String DisclaimerDialogueWindow_Return_TO_Translation_button="//div[contains(@id,'DisclaimerWarningDialog')][contains(@aria-hidden,'false')]//a[@tabindex='0']//span[contains(text(),'Translation')]";
	public final String WarningDialogueWindow_Return_TO_Translation_button="//div[contains(@class,' WarningDialog ')][contains(@aria-hidden,'false')]//div//a//span[contains(text(),'Return to Translation')]";//"//div[contains(@id,'warningdialog')][contains(@aria-hidden,'false')]//span[contains(text(),'Translation')]";
	public final String fmdDialog_WarningDialogueWindow_ContinueButton="//div[contains(@id,'warningdialog')]//span[contains(text(),'Continue')]";//"//div[contains(@id,'warningdialog')]//span[contains(text(),'Continue')]/following-sibling::span";
	public final String fmdDialog_WarningDialogueWindow_CloseButton="//div[contains(@id,'warningdialog')]//span[contains(text(),'Close')]";
	public final String  qmTab="//div[contains(@id,'actionbar')]//span[contains(text(),'QM')]/..";
	public final String WarningDialogueWindow__second_completeButton="//div[contains(@class,'WarningDialog')][contains(@aria-hidden,'false')]//span[contains(text(),'Complete')]";
	public final String Warning_Return_TO_Translation_button="//div[contains(@class,'WarningDialog')][@aria-hidden='false']//span[text()='Return to Translation']";

	
	//Translator FMD Dialog
	public final String translation_FmdWizard_ReferenceFile="//div[contains(@id,'SubmissionPreviewTabPanel')]//a//span[contains(text(),'Reference Files')]";
	
	
	public final String translation_referenceFilesTab_uploadedFileName(String fileName){
		return "//div[contains(@name,'referenceFiles')]//table//td//div[contains(text(),'"+fileName+"')]";
				
	}
	
	public final String translation_referenceFilesTab_targetLanguage_uploadedFileName(String language,String fileName){
		return "//div[contains(@name,'referenceFiles')]//table//td[div[contains(text(),'"+language+"')]]/following-sibling::td//div[contains(text(),'"+fileName+"')]";
				
	}
	
	public final String fileManagement_cancelledFile_totalCount(String column,String total)
	{
		return "//div[contains(@id,'SubmissionManagementLinguistBatchFile')]//table//td["+column+"][contains(@class,'SubmissionManagementLinguist')]//div[contains(@class,'cancel')][contains(text(),'"+total+"')]";
	}
	
}
