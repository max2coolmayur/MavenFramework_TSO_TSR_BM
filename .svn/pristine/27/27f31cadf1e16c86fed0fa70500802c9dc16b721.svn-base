package org.qa.locators;

public class PD4_main_client_dashboard_Locators {
	private static PD4_main_client_dashboard_Locators ue;
	
	public static synchronized PD4_main_client_dashboard_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_main_client_dashboard_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_main_client_dashboard_Locators();
		}
		return ue;
	}
	
//Folders
	public final String workflows_activeSubmissionsButton = "//span[text()='Active']";
	public final String workflows_onHoldSubmissionsButton = "//span[text()='On Hold']";
	public final String workflows_archiveSubmissionsButton = "//span[text()='Archived']";
	public final String workflows_templatesSubmissionsButton = "//span[text()='Templates']";
	public final String workflows_completedSubmissionsButton = "//span[text()='Completed']";
	public final String workflows_gateSubmissionsButton = "//span[text()='Gate']";
	public final String workflows_clientCompletedSubmissionsButton = "css=button.submission_completed_clientfoldermedium";
	
	
//Main Pane

	public final String firstDataRowSubmissionId = "//table//tbody//tr//td";
	public final String firstDataRowName = "//div[contains(@id,'pdmaingrid') or contains(@id,'pdMainGrid')]//table//tr//td[2]//div";
	public final String firstDataRowName_template = "//table/tbody/tr/td[1]/div";
	public final String secondDataRowName_template="//table[2]/tbody/tr/td[1]/div";//"//table/tbody/tr[2]/td[1]/div";

	public final String secondDataRowName = "//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')][2]/td[2]/div[contains(@class,'x-grid-cell-inner ')]";//css=table>tbody>tr:nth-child(3)>td:nth-child(3)>div";

	public final String thirdDataRowName = "//table//tbody//tr[3]//td[2]//div";
	public final String fourthDataRowName = "//table[4]//tbody//tr//td[2]//div";//"//table//tbody//tr[4]//td[2]//div";
	public final String fifthDataRowName = "//table//tbody//tr[5]//td[2]//div";
	public final String sixthDataRowName = "//table//tbody//tr[6]//td[2]//div";
	
	public final String vendorFirstDataRowName="//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";

	public final String firstDataRowStatus = "//tbody//tr//td[12]//div";	
	// you can use this locator '//table//tr[contains(@class,'x-grid-row')]'. Using verify text of this locator will give entire row contents. you can check whether it contains the content you want to verify.
	public final String firstDataRowStatus_ActiveFolder = "//table//tr[contains(@class,'x-grid-row')]";
	public final String firstDataRowStatus_OnHoldFolder = "//table//tr[contains(@class,'x-grid-row')]";
	public final String firstDataRowStatus_CompletedFolder = "//table//tr[contains(@class,'x-grid-row')]";
	public final String firstDataRowOwner_OnHoldFolder = "//div[contains(@id,'pdMainGrid')]//table//tr//td[6]//div";
	public final String firstDataRowOwner_ActiveFolder = "//div[contains(@id,'pdMainGrid')]//table//tr//td[6]//div";
	public final String firstDataRowProgress_ActiveFolder = "//div[contains(@style,'visible')]//tr[contains(@class,'x-grid-row')]//td[17]/div/div";
	public final String firstDataRowInstrctions_ActiveFolder = "//tbody//tr//td[14]//div//div";
	public final String firstDataRowInstrctions_OnHoldFolder = "//table//tbody//tr//td[15]//div//div";
	public final String firstDataRowInstrctions_OnHoldFolder_checkedSign = "//table//tbody//tr//td[15]//div//div";
	
	
	public final String gateColumnHandSign = "//div[contains(@class,'handsign')]";//"css=div.handsign";
	
//Column Names Active Folder
	public final String columnGate_ActiveFolder = "//div[contains(@id,'gridcolumn')]/div/span[contains(text(),'Gate')]";//"css=div[id*='gridcolumn']>div>span:contains(Gate)";
	public final String columnProject_ActiveFolder = "css=div.x-grid3-header-offset>table>thead>tr>td:nth-child(14)>div";
	public final String columnFiles_ActiveFolder = "css=div.x-grid3-header-offset>table>thead>tr>td:nth-child(19)>div";
	public final String columnOwner_ActiveFolder = "css=div.x-grid3-header-offset>table>thead>tr>td:nth-child(20)>div";
	
	public final String columnSubmissionIdMenu_ActiveFolder = "//div[contains(@data-qtip,'Submission ID')]//following-sibling::div";//"//span[text()='Submission Id']/following-sibling::div";
	public final String columnSubmissionNameMenu_ActiveFolder = "//div[contains(@data-qtip,'Submission Name')]//following-sibling::div";//"//span[text()='Submission Name']/following-sibling::div";
	public final String columnSourceLanguageMenu_ActiveFolder = "//div[contains(@data-qtip,'Source Language')]//following-sibling::div";//"//span[text()='Source Language']/following-sibling::div";
	public final String columnDateStartedMenu_ActiveFolder = "//div[contains(@data-qtip,'Date Started')]//following-sibling::div";//"//span[text()='Date Started']/following-sibling::div";
	public final String columnDueDateMenu_ActiveFolder = "//div[contains(@data-qtip,'Due Date')]//following-sibling::div";//"//span[text()='Due Date']/following-sibling::div";
	public final String columnPriorityMenu_ActiveFolder = "//div[@class='x-box-inner ']//div[contains(@data-qtip,'Priority')]/span/following-sibling::div";//"//div[@class='x-box-inner ']/div/div[12]/div/div";
	public final String columnProjectMenu_ActiveFolder = "//div[contains(@data-qtip,'Project')]//following-sibling::div";//"//span[text()='Project']/following-sibling::div";
	public final String columnWorkflowStatusMenu_ActiveFolder = "//div[contains(@data-qtip,'Workflow Status')]//following-sibling::div";//"//span[text()='Workflow Status']/following-sibling::div";
	public final String columnInstructionsMenu_ActiveFolder = "//div[@class='x-box-inner ']/div/div[16]/div/div";
	public final String columnProgressBarMenu_ActiveFolder = "//div[contains(@data-qtip,'Progress Bar')]//following-sibling::div";//"//span[text()='Progress Bar']/following-sibling::div";
	public final String columnFilesMenu_ActiveFolder = "//div[@class='x-box-inner ']/div/div[20]/div/div";
	public final String columnOwnerMenu_ActiveFolder = "//div[contains(@data-qtip,'Owner')]//following-sibling::div";//"//span[text()='Owner']/following-sibling::div";


	public final String activeFolder_columnName(String columnName)
	{
		return "//div[contains(@id,'headercontainer')]//div[contains(@data-qtip,'"+columnName+"')]";
	}

	public final String columnXMenu_ActiveFolder(Integer orderNumber)
	{
		return "//div[contains(@id,'tabpanel')]//div[contains(@id,'headercontainer')]/div["+orderNumber+"]//span[contains(@class,'x-column-header-text')]";
	}

	public final String client_clickOnColumnNameX(String columnName){
		return "//div[contains(@class,'x-menu')]/a/span[text()='"+columnName+"']";
	}
	
	public final String client_checkedColumnNameX(String columnName){
		return "//div[contains(@class,'x-menu-item-checked')]/a/span[text()='"+columnName+"']";
	}
	
	
	public final String client_alertRow = "//div[contains(@class,'alertsnormalgridsmall')]";
	public final String client_alert_plus = "//div[contains(@id,'alert') or contains(@id,'Alert')]//div[contains(@class,'x-tree-elbow-end-plus')]";//"//div[contains(@id,'alert') or contains(@id,'Alert')]//img[contains(@class,'x-tree-elbow-end-plus')]";//div[contains(@id,'gs4tralertsdialog')]//img[contains(@class,'x-tree-elbow-end-plus')]";
	public final String client_alert_minus = "//div[contains(@id,'alert') or contains(@id,'Alert')]//div[contains(@class,'x-tree-elbow-end-plus')]";
	public final String client_alertWindow_close = "//div[contains(@id,'alert') or contains(@id,'Alert')]//div[contains(@class,'x-tool-close')]";//"//div[contains(@id,'alert') or contains(@id,'Alert')]//div/img[contains(@class,'close')]";//div[contains(@id,'gs4tralertsdialog')]//img[@class='x-tool-close']";
	public final String client_alertWindow_More = "//div[contains(@id,'AlertsDialog')]//a[contains(text(),'more')]";
	public final String client_fullAlertMessageWindow_Close="//div[contains(@id,'fullalertmessagewindow')]//span[contains(text(),'Close')]";
	//On Hold Folder
	public final String parentRow = "//tr[contains(@class,'x-grid-row-dark-blue')]";
	public final String childRow = "//tr[contains(@class,'x-grid-row-blue')]";
	 
	public final String submissions_rowTable = "//div[starts-with(@id,'pdmaingrid') and contains(@class,'x-panel-body-default')]//descendant::tr[starts-with(@class,'x-grid-row')]";
	public final String submissions_rowTable_status(Integer row) {
		return "//tr["+(row+1)+"][contains(@class,'x-grid-row')]/td[13]/div"; 
	}
	
	//Preview Pane
	public final String previewMain_firstRow_awardedVendorsColumn = "//div[contains(@id,'treegrid')]//table/tbody/tr[1]/td[5]/div/span";//css=div[id*='pdmaintreegrid'] table tr:nth-child(2)>td:nth-child(5)>div>span";
	public final String previewMain_secondRow_awardedVendorsColumn = "//div[contains(@id,'treegrid')]//table/tbody/tr[2]/td[5]/div/span";
	public final String previewMain_firstRow_TranslationColumn = "//div[contains(@id,'pdmaintreegrid')]/div/table/tbody/tr[2]/td[6]/div/span";
	public final String previewMain_firstRow_ProofColumn = "css=div[class='x-panel x-panel-noborder x-grid-panel x-border-panel'] div>div.x-grid3-row:nth-child(1)>table>tbody>tr>td:nth-child(8)>div.x-grid3-cell-inner";
	public final String previewMain_budgetStatusColumn = "//div[contains(@id,'maintreegrid')]//table//tr/td[last()]/div/div";//div[contains(@class,'pmenteredbudget')]";//div[@class='pmenteredbudget']";
	public final String previewMain_budgetStatusHeader="//span[@class='budgetheader']";
	
	public final String previewMain_rowX_TranslColumnStatusX(int numbRow, String text) {
		return"//div[contains(@id,'pdmaintreegrid')]//table["+numbRow+"]//td[7]//div//span[contains(text(),'"+text+"')]";
	  //return "//div[contains(@id,'pdmaintreegrid')]/div/table//tr[contains(@class,'x-grid-row')]["+numbRow+"]/td[child::div/span[text()='"+text+"']]";
		
	}
	
	public final String previewMain_rowX_TranslColumnStatusRefX(int numbRow, String refText) {
		return "//div[contains(@id,'pdmaintreegrid')]//table["+numbRow+"]//td[7]//a[contains(text(),'"+refText+"')]";
		//return "//div[contains(@id,'maintreegrid')]/div/table/tbody/tr["+numbRow+"]/td/div/a[text()='"+refText+"']";//div[contains(@id,'pdmaintreegrid')]/div/table/tbody/tr[contains(@class,'x-grid-row')]["+numbRow+"]/td[child::div/a[text()='"+refText+"']]";
	}
	
	public final String previewMain_rowX_ProofColumnStatusRefX(int numbRow, String refText) {
		return	"//div[contains(@id,'pdmaintreegrid')]//table["+numbRow+"]//td[9]//a[contains(text(),'"+refText+"')]";
	  //return "//div[contains(@id,'pdmaintreegrid')]/div/table/tbody/tr[contains(@class,'x-grid-row')]["+numbRow+"]/td[child::div/a[text()='"+refText+"']]";
	}
	
	public final String previewMain_rowXColumnX(String langCode,String user)
	{
		if(user.equals(""))
		{
			return "//div[contains(@id,'treeview')]//tr[contains(@class,'x-grid-row')]/td/div[contains(text(),'"+langCode+"')]";	
		}
		else
		{
		return "//div[contains(@id,'treeview')]//tr[contains(@class,'x-grid-row')]/td[div[contains(text(),'"+langCode+"')]]/following-sibling::td/div/a[text()='"+user+"']";
		}
	}

	public final String previewMain_plus_commonX(Integer row){
		//return "//div[contains(@id,'treeview')]/table/tbody/tr["+(row)+"]/td/div/img[contains(@class,'expander')]";
		return "//div[contains(@id,'treeview')]//table["+row+"]//tr[not(contains(@class,'node-expanded'))]//div[contains(@class,'expander')]";//"//div[contains(@id,'treeview')]//table//tr["+row+"]//div[contains(@class,'expander')]";
	}
	
	public final String previewMain_plus_lastRowX(Integer row){
	//	return "//div[contains(@id,'treeview')]/table[contains(@id,'treeview')]/tbody/tr["+(row+1)+"]/td/div/img[contains(@class,'x-tree-elbow-end-plus')]";//div[contains(@id,'treeview')]/table[@class='x-grid-table x-grid-table-resizer']/tbody/tr["+(row+1)+"]/td/div/img[contains(@class,'x-tree-elbow-end-plus')]";
	return "//div[contains(@id,'treeview')]//table[contains(@id,'treeview')]["+(row+1)+"]/tbody/tr["+row+"]//div[contains(@class,'x-tree-elbow-end-plus')]";
	}
	
	public final String previewMain_rightClick_ActionX(String action)
	{
		return "//a/span[text()='"+action+"']";
	}

	public final String addManualSubmissionBatchPreview_savewarningDiscardButton="//div[contains(@id,'warningdialog')]//span[contains(text(),'Discard')]";//"//div[contains(@id,'warningdialog')]//span[contains(text(),'Discard')]/following-sibling::span";//"//div[contains(@id,'gs4trwarningmessage')]//span[contains(text(),'Discard')]";
	public final String addManualSubmission_discardReferenceFiles_savebutton="//div[contains(@id,'warning')]//span[contains(text(),'Save')]";//"//div[contains(@id,'warning')]//span[contains(text(),'Save')]/following-sibling::span";
	public final String addManualSubmission_verifyBatchName="//div[contains(@name,'batchGrid')]//div//table//tr//td//div//a[contains(text(),'Batch1')][@class='batchLink']";//"css=table[class='x-grid-table x-grid-table-resizer'] tr>td>div:contains('Batch1')";
	public final String addManualSubmission_deleteBatchButton="//a//span[contains(text(),'Delete Batch')]";//"//a//span[contains(text(),'Delete Batch')]/following-sibling::span";//"css=a>span:contains('Delete Batch')";
	public final String removeFileButton="//div[contains(@id,'AddUploadPanel')]//a//span[contains(text(),'Remove')]";//"//div[contains(@id,'uploadfilespanel')]//span[contains(text(),'Remove')]/following-sibling::span";//"css=div[id*='pduploadfilespanel'] span:contains('Remove')";
	public final String addManualSubmissionBatchPreview_batchRemoveButton="//div[contains(@id,'AddBatchPreviewFileLeverageStatistics')]//span[contains(text(),'Remove')]";//"//div[contains(@id,'fileleveragestatisticspanel')]//span[contains(text(),'Remove')]/following-sibling::span";//"css=div[id*='pdfileleveragestatisticspanel'] span:contains('Remove')";//"css=div[id*='pdfileleveragestatisticspanel'] button>span:contains('Remove')";
	public final String adManualSubmission_sourceFilesUpload_removeFileX(String fileName){
		return "//div[contains(@id,'uploadfiles')]//table[contains(@id,'gridview')]//tr//td[div[contains(text(),'"+fileName+"')]]/following-sibling::td//img";
	}
	
	
	public final String verifyFilePresent(String name)
	{		
		return "//div[contains(@id,'UploadStandardFile')]//table//td/div[contains(text(),'"+name+"')]";//"//div[contains(@id,'uploadfilespanel')]//div[contains(@id,'gridview')]/table//td/div[contains(text(),'"+name+"')]";//"css=div[id*='pduploadfilespanel'] div[id*='gridview']>table td:contains('"+name+"')";
	}
	public final String addManualSubmissionBatchPreview_VerifyFileName(String fileName)
	{
		return "//div[contains(@id,'pdstatisticsgrid')]//table//tr//td/div[contains(text(),'"+fileName+"')]";
	}
	public final String groupTitleX (String title){
		return "//div[contains(@class,'x-grid-group-title') and contains(text(),'"+title+"')]";//"css=div.x-grid-group-title:contains('"+title+"')";
	}
	
	public final String previewMain_rowWithTextX(Integer rowNum,String text){
		return "//div[contains(@id,'treeview')]//table[contains(@id,'treeview')]["+rowNum+"]/tbody/tr/td/div/span[contains(text(),'"+text+"')]";
				//"//div[contains(@id,'treeview')]//table[contains(@id,'treeview')]/tbody/tr["+rowNum+"]/td/div/span[contains(text(),'"+text+"')]";//div[contains(@id,'treeview')]/table[@class='x-grid-table x-grid-table-resizer']/tbody/tr[contains(@class,'x-grid-row')]["+rowNum+"]/td/div[contains(text(),'"+text+"')]";
		
	}
	
	public final String previewMain_rowX(Integer rowNum){
		return "//div[contains(@id,'treeview')]//table[contains(@id,'treeview')]["+rowNum+"]/tbody/tr/td/div";
		//"//div[contains(@id,'treeview')]//table[contains(@id,'treeview')]/tbody/tr["+rowNum+"]/td/div";//div[contains(@id,'treeview')]/table[@class='x-grid-table x-grid-table-resizer']/tbody/tr["+(rowNum+1)+"]/td/div";
	}
	
	public final String previewMain_expandLevelLanguage(String langPair){
		return "//table[contains(@id,'treeview')]//div[contains(@class,'elbow-end-plus')][following-sibling::span[contains(text(),'"+langPair+"')]]";//"//tr[contains(@id,'treeview')]/td/div/img[contains(@class,'expander')][following-sibling::span[contains(text(),'"+langPair+"')]]";//div[starts-with(@id,'pdmaintreegrid') and contains(@class,'x-panel-body-default')]//table//tr[contains(@class,'x-grid-row')][child::td/div[text()='"+langPair+"']]/td/div/img[contains(@class,'x-tree-expander')]";
	}
	
	public final String previewMain_expandLevelBatch(String batchName){
		return "//table[contains(@id,'treeview')]//div[contains(@class,'expander')][following-sibling::span[contains(text(),'"+batchName+"')]]";//"//tr[contains(@id,'treeview')]/td/div/img[contains(@class,'expander')][following-sibling::span[contains(text(),'"+batchName+"')]]";//div[starts-with(@id,'pdmaintreegrid') and contains(@class,'x-panel-body-default')]//table//tr[contains(@class,'x-grid-tree-node-expanded')]//following-sibling::tr[contains(@class,'x-grid-row')][child::td/div[contains(text(),'"+batchName+"')]]//td/div/img[contains(@class,'x-tree-expander')]";
	}
	
	public final String previewMain_LevelFile(String fileName){
		return "//table[contains(@id,'treeview')]//span[text()='"+fileName+"']";//"//tr[contains(@id,'treeview')]/td/div/span[text()='"+fileName+"']";//div[starts-with(@id,'pdmaintreegrid') and contains(@class,'x-panel-body-default')]//table//tr[contains(@class,'x-grid-tree-node-expanded')][child::td/div/img]//following-sibling::tr[contains(@class,' x-grid-tree-node-leaf')][child::td/div[text()='"+fileName+"']]";
	}
	
	public final String add_editSubmission_batches_workflow_rowX(Integer rowNum){
		return "//div[contains(@id,'pdbatchgrid')][contains(@class,'x-grid-with-row-lines')]//table["+rowNum+"]//td[2]//div";
	}
	public final String add_editSubmission_batchGrid_fileCountX(int row)
	{
		return "//div[contains(@id,'pdbatchgrid')]/div/table/tbody/tr["+row+"]/td[4]/div";
	}
	public final String editSubmission_wordCount_NA ="//div[contains(@id,'pdbatchgrid')]//table//tbody//td[5]//div[contains(text(),'N/A')]";
	public final String previewMain_wordCount_rowX(Integer rowNum){
		return "//div[contains(@id,'treeview')]//table[contains(@id,'treeview')]["+rowNum+"]/tbody/tr/td[2]/div";//div[contains(@class,'x-panel-body-default')]//div[starts-with(@id,'pdmaintreegrid') and contains(@class,'x-panel-body-default')]//tbody/tr[contains(@class,'x-grid-row')]["+rowNum+"]/td[2]/div[contains(@class,'x-grid-cell-inner')]";
	}
	
	public final String previewMain_fileFormat_plus_rowX(Integer row){
		return "//img[contains(@class,'x-tree-elbow-end-plus x-tree-expander')]";
	}
	
	public final String previewMain_moreLinkX = "//div[contains(@id,'pdmaintreegrid') and contains(@class,'x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-tree-node-leaf')]//span[contains(text(),'more ...')]";
		//String result = "//div[starts-with(@id,'pdmaintreegrid') and contains(@class,'x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-tree-node-leaf')]["+row*2+"]//child::a[contains(text(),'more ...')]";
	
	public final String	previewMain_expandLevelmoreLink = "//a[text()='more ...']";//div[starts-with(@id,'pdmaintreegrid') and contains(@class,'x-panel-body-default')]//table//tr[contains(@class,'x-grid-tree-node-expanded')]//following-sibling::tr[contains(@class,' x-grid-tree-node-leaf')][child::td/div/a[contains(text(),'more ...')]]";
	public final String previewSubmission_moreLink="//a[text()='more ...']";
	
	public final String previewMain_byBatchButton = "//div[contains(@id,'treegridpreviewbuttonsmenu')]//div//a//span[contains(text(),'By Batch')]";
	public final String previewMain_byLanguageButton = "//div[contains(@id,'treegridpreviewbuttonsmenu')]//div//a//span[contains(text(),'By Language')]";
	public final String previewMain_previewSettingButton="//div[contains(@id,'pdmaintreegrid')]//div[contains(@class,'gear')]";//"//div[contains(@id,'pdmaintreegrid')]//div//img[contains(@class,'gear')]";
	public final String previewMain_previewSettingSelectLangBatchX(String name)
	{
		return "//div[contains(@id,'pdtreegridpreviewbuttonsmenu')]//div//a//span[contains(text(),'"+name+"')]";	
	}	
	public final String previewMain_alertColumn="//div[contains(@id,'pdmaintreegrid')]//span[@class='alertsheader']";
	public final String previewMain_quoteColumn="//div[contains(@id,'pdmaintreegrid')]//span[@class='quoteheader']";
	public final String previewMain_columnX(Integer col){
		return "//div[contains(@class,'MainTreeGrid')]//div[contains(@id,'headercontainer')]//div[contains(@id,'column')]["+col+"]//span";
		//return "//div[starts-with(@id,'pdmaintreegrid')]//div[starts-with(@id,'headercontainer') and contains(@class,'x-box-inner ')]/div/div["+col+"]//span[contains(@class,'x-column-header-text')]//ancestor::div[contains(@class,'x-column-header-inner')]";
	}
	
	
	
//General
	public final String startSubmission_analyzeSubmission_yesButton = "//div[contains(@id,'warningdialog')]//span[text()='Yes']";//"//div[contains(@id,'warningdialog')]//span[text()='Yes']/following-sibling::span";//css=div[id*='gs4trwarningmessage'] div[id*='toolbar'] button>span:contains('Yes');
	public final String archiveSubmission_yesButton = "//div[contains(@id,'warning')]//span[text()='Yes']";//"//div[contains(@id,'warning')]//span[text()='Yes']/following-sibling::span";
	public final String yesButton = "//div[contains(@id,'warningdialog')]//span[text()='Yes']";//"//div[contains(@id,'warningdialog')]//span[text()='Yes']/following-sibling::span";
	public final String noButton = "//div[contains(@id,'warningdialog')]//span[text()='No']";//"//div[contains(@id,'warningdialog')]//span[text()='No']/following-sibling::span";
	public final String closeButton="//div[contains(@id,'warning')]//span[text()='Close']";//"//div[contains(@id,'warning')]//span[text()='Close']/following-sibling::span";
	
	public final String cloneSubmissionButton = "//span[contains(@id,'clone_submission_action')]//span[contains(text(),'Clone')]";//"//span[contains(@id,'clone_submission_action')]//span[text()='Clone Submission']/following-sibling::span";

	public final String cloneSubmissionButton_deleteSourceLangauge(String language)
	{	
		return "//div[contains(@name,'targetCombo')]//div[text()='"+language+"']/following-sibling::div";//"//table[contains(@class,'superboxselect')]//table//tr//span[text()='"+language+"']/following-sibling::a";
	}
	

	// Submit Tab
	public final String submitTab="//div[contains(@id,'pdactionbar')]//span[contains(text(),'submit')]";
	public final String submitTab_span ="//div[contains(@id,'pdactionbar')]//span[contains(text(),'submit')]//ancestor::a[contains(@data-qtip,'Create, clone or edit submissions.')]";//"//div[contains(@id,'pdactionbar')]//span[contains(text(),'submit')]//ancestor::a[contains(@data-qtip,'Use this tab to add or edit submissions and budgets')]";
	// Reset Submission
	public final String resetSubmissionButton = "//span[starts-with(@id,'pd_reset_submission_action')]";
	public final String resetbutton = "//div[contains(@id,'resetsubmissiondialog')]//span[text()='Reset']";//div[contains(@class,'x-toolbar-footer-docked-bottom')]//span[text()='Reset']/..";
	public final String resetHoldbutton = "//div[contains(@id,'resetsubmission')]//span[text()='Reset & Hold']";//"//div[contains(@class,'x-toolbar-footer-docked-bottom')]//span[text()='Reset & Hold']/..";
//Add Submission

	public final String addSubmissionButton = "//span[contains(@id,'manual_submission')]//span[contains(text(),'Create')]";//"//span[text()='Add Submission']";
	public final String addSubmission_inputSubmissionName = "//div[contains(@name,'submissionName')]//input[contains(@name,'submissionName') or contains(@name,'SubmissionName')]";
	public final String addSubmission_finishButton = "css=table>tbody>tr>td:nth-child(2)>table>tbody>tr>td>table>tbody>tr>td:nth-child(2)>table>tbody>tr:nth-child(2)>td:nth-child(2)>em>button:contains('Finish')";

	public final String pmUser_claimSubmissionButton = "css=button>span.claimsubmissionpmlarge";
	public final String pmUser_translationTab_getTranslationFilesButton = "//span[contains(@id,'pd_process_linguistic_pm_action')]//span[contains(text(),'Get translation')]";//"//span[contains(@id,'pd_download_submission_pm_action')]";
	
	// Templates/Submit Tab
	public final String createFromTemplate="//span[contains(@id,'pd_manual_template_submission_action-')]";
	public final String editTemplate="//span[contains(@id,'pd_manual_edit_template_submission_action-')]";
	public final String cloneTemplate="//span[text()='Clone Template']";//"//span[text()='Clone Template']/following-sibling::span";
	public final String toggleDefaultTemplate="//span[contains(@id,'pd_mark_default_template_submission_action-')]";
	
	public final String column_templateName_dropDown="//div[contains(@data-qtip,'<b>Template Name</b>')]//div[contains(@class,'column-header-trigger')]";//"//span[text()='Template Name']/following-sibling::div";
	public final String columns_checkedTemplateName_checkbox="//div[contains(@class,'-checked')]/a[contains(@id,'menucheckitem')]/span[text()='Template Name']";
	public final String columns_checkedDefault_checkbox="//div[contains(@class,'-checked')]/a[contains(@id,'menucheckitem')]/span[text()='Default']";
	public final String columns_checkedCustom_checkbox="//div[contains(@class,'-checked')]/a[contains(@id,'menucheckitem')]/span[text()='custom']";
	
	public final String columns_checkUncheck_TemplateName_checkbox="//a[contains(@id,'menucheckitem')]/span[text()='Template Name']/following-sibling::div";
	public final String columns_checkUncheck_Default_checkbox="//a[contains(@id,'menucheckitem')]/span[text()='Default']/following-sibling::div";
	public final String columns_checkUncheck_Custom_checkbox="//a[contains(@id,'menucheckitem')]/span[text()='custom']/following-sibling::div";
	public final String column_templateName="//span[text()='Template Name']";
	public final String column_defaultTemplate_checkedSign = "//div[contains(@class,'checkedsign')]";//"//div[@class='checkedsign']";
	public final String column_default="//span[text()='Default']";
	public final String column_custom="//span[text()='custom']";
	
	
//Edit Template
	public final String editTemplate_crossButton = "//div[contains(@id,'ext-comp')]//div[contains(@class,'tool-close')]";//"//div[contains(@id,'SubmissionManualTemplateEdit')]//div[contains(@class,'x-tool-close')]";//"//div[contains(@id,'pdeditsubmissiondialog')]//div[contains(@class,'x-tool-close')]";//"//div[contains(@id,'pdeditsubmissiondialog')]//img[contains(@class,'x-tool-close')]";
	public final String editTemplate_saveButton = "//div[contains(@id,'ext-comp')]//a//span[contains(text(),'Save')]";
	public final String editTemplate_referenceFilesButton = "//div[contains(@id,'ext-comp')]//a//span[contains(text(),'Reference Files')]";
	
	// Templates/Manage Tab
	public final String deleteSubmTemplate="//span[contains(@class,'removesubmissiontemplate')]";
	public final String templates_managetab_pmNotes="//span[contains(@id,'pd_submission_internal_notes_action')]//span[contains(@class,'submissioninternalnotes')]";
		
	//Manage Tab
	public final String manageTab="//span[text()='manage']";
	public final String manageTab_span = "//div[contains(@id,'pdactionbar')]//span[contains(text(),'manage')]//ancestor::a[contains(@data-qtip,'Select vendors, download files, unclaim phases, etc.')]";//"//div[contains(@id,'pdactionbar')]//span[contains(text(),'manage')]//ancestor::a[contains(@data-qtip,'Use this for all manage options on submission, Select vendors, Release vendors, download history, etc')]";
	public final String manageTab_editInstructionsButton="css=table>tbody>tr:nth-child(2)>td:nth-child(2)>em button:contains('Edit')";
	public final String manageTab_editInstruction_inputInstructions = "css=div>div>div>div>textarea[class='x-form-textarea x-form-field']";
	public final String manageTab_assignSubmissionButton="//span[contains(@id,'pd_assign_submission_action')]//span[text()='Assign']";//"//span[contains(@id,'pd_assign_submission_action')]//span[text()='Assign Submission']/following-sibling::span";

	public final String manageTab_PMassignButton = "//span[starts-with(@id,'pd_assign_pm_action')]//span[text()='PM Assign']";//"//span[starts-with(@id,'pd_assign_pm_action')]//span[text()='PM Assign']/following-sibling::span";

	public final String manageTab_cancelSubmissionButton = "//span[contains(@id,'cancel_action')]/following-sibling::span";//"//span[contains(@id,'pd_cancel_submission_action')]/following-sibling::span";
	public final String manageTab_downloadDeliverableButton = "//span[contains(@id,'pd_download_deliverable_action')]/following-sibling::span";
	public final String manageTab_downloadHistoryButton = "//span[contains(@id,'pd_download_history_submission_action')]/following-sibling::span";
	public final String manageTab_downloadSourceButton = "//span[contains(@id,'pd_download_submission_source_files_action')]/following-sibling::span";
	public final String manageTab_deleteSubmissionButton = "//span[contains(@id,'pd_delete_submission_system_action')]/following-sibling::span";
	public final String manageTab_clearAlertButton = "//span[contains(@id,'pd_clear_alerts')]/following-sibling::span";
	public final String manageTab_previewtranslationButton = "//span[contains(@id,'pd_preview_translation_action')]/following-sibling::span";
	public final String manageTab_previewDeliverrablecheckbox = "//div[contains(@id,'DefaultAction')]//div[contains(@class,'header-checkbox')]";
	public final String manageTab_previewDeliverrablecheckbox_checked = "//div[contains(@id,'DefaultAction')]//div[contains(@class,'header-checkbox')][contains(@class,'checker-on')]";
	public final String manageTab_previewtranslation_previewtranslationButton = "//div[contains(@id,'DefaultAction')]//span[contains(text(),'Preview Deliverables')]";//"//div[contains(@class,'x-toolbar-footer-docked-bottom')]//span[text()='Preview Deliverable']/..";
	public final String manageTab_previewSubmissionSourceFilesCheckbox="css=div[id*='pdsubmissiondialogspreviewfilesdialog'] table td>input[name='checkbox0']";
	public final String manageTab_previewSubmissionDownloadButton="css=div[id*='pdsubmissiondialogspreviewfilesdialog'] button>span:contains('Download')";

	public final String manageTab_downloadArchiveButton = "//span[contains(@id,'pd_download_archive_action')]//span[text()='Download Archive']";//"//span[contains(@id,'pd_download_archive_action')]//span[text()='Download Archive']/following-sibling::span";
	public final String manageTab_ArchiveSubmissionButton = "//span[contains(@id,'pd_archive_submission_action')]//span[text()='Archive Submission']";//"//span[contains(@id,'pd_archive_submission_action')]//span[text()='Archive Submission']/following-sibling::span";

	public final String manageTab_errorhandlingButton = "//a[contains(@id,'error_handling_action')]//span[contains(text(),'Error Handling')]";//"//span[starts-with(@id,'pd_error_handling_action')]";
	public final String manageTab_addDeliverableCollateralButton = "//span[contains(@id,'add_deliverable_collateral')]//span[contains(text(),'Supplementary')]";//"//span[contains(@id,'add_deliverable_collateral')]//span[contains(text(),'Deliverable')]/..";
	public final String manageTab_resetQuotes = "//span[contains(@id,'reset_quotes')]";
	public final String manageTab_ReleaseProof = "//span[contains(@id,'pd_release_pm_submission')]";
	public final String manageTab_releaseSubmission = "//span[contains(@id,'pd_release_pm_submission_action')]";
	public final String add_editSubmission_previewSubmission_clearTargetLanguage="//div[contains(@name,'targetLanguageSuperBox')]//div[contains(@class,'Trigger_triggerClearAll')]";//"//div[contains(@id,'batchpreview')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'display: none'))]//div[contains(@class,'superboxselect-btn-clear')]";//div[contains(@id,'batchpreview')]//div[contains(@class,'superboxselect-btn-clear')]";
	public final String add_editSubmission_previewSubmission_chooseTargetLanguage="//div[contains(@name,'targetLanguageSuperBox')]//div[contains(@class,'Trigger_triggerExpand')]";//"//div[contains(@id,'batchpreview')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'display: none'))]//div[contains(@class,'superboxselect-btn-expand')]";//div[contains(@id,'batchpreview')]//div[contains(@class,'superboxselect-btn-expand')]";
	//PM Notes
	public final String managetab_pmNotes_PleaseAddNotes="//div[contains(@id,'pmnotes')]//textarea[@name='instruction']";//"//div[label[text()='Please Add Notes']]//following-sibling::textarea[@name='instruction']";
	public final String managetab_pmNotes_AddedNotes="//div[contains(@id,'pmnotes')]//textarea[@name='addedInstruction']";//"//div[label[text()='Added Notes']]//following-sibling::textarea[@name='addedInstruction']";
	public final String managetab_pmNotes_PleaseAddNotes_okButton = "//div[contains(@id,'pmnotes')]//span[text()='OK']";//"//div[starts-with(@id,'pdpmnotesdialog')]//div[starts-with(@id,'toolbar') and contains(@class,'x-toolbar-footer x-docked-bottom')]//span[text()='OK']/following-sibling::span";
	public final String managetab_pmNotes_instructionCountdown_1024="//div[@name='instructionCountdown'][text()='1024 remaining characters']";//"//table[@name='instructionCountdown']//div[@name='instructionCountdown'][text()='1024 remaining characters']";
		
	//Download History
	public final String manageTab_downloadHistorydialog_nextButton = "//div[contains(@id,'pddownloadhistorywizard')]//span[text()='Next >']";//div[contains(@id,'pddownloadhistorywizard')]//span[text()='Next >']/following-sibling::span";
	public final String manageTab_downloadHistorydialog_previousButton = "//div[contains(@id,'pddownloadhistorywizard')]//span[contains(text(),'Previous')]";
	public final String manageTab_downloadHistorydialog_finishButton = "//div[contains(@id,'pddownloadhistorywizard')]//span[text()='Finish']";//div[contains(@id,'pddownloadhistorywizard')]//span[text()='Finish']/following-sibling::span";
	public final String downloadHistory_formatSelectButton="//div[contains(@name,'downloadFormats')and not(contains(@class,'x-item-disabled'))]//div[contains(@class,'x-form-arrow-trigger')]";//"//table[@name='downloadFormatsCombo'and not(contains(@class,'x-item-disabled'))]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String downloadHistory_formatSelectInput="//table[@name='downloadFormatsCombo'and not(contains(@class,'x-item-disabled'))]//input[@name='downloadFormatsCombo']";
	public final String downloadHistory_activityCheckbox = "//input[@name='downloadActivityCheckbox']";
	public final String downloadHistory_selectFormatX(String format) {
		return "//div[text()='"+format+"']";
	}	
	
	//Download History Phase name
	public final String downloadHistoryWizard_phaseName_checked(String phaseName) {
		//return "//table//tr[contains(@class,'row-selected')]//div[contains(text(),'"+phaseName+"')]";
		return "//table[contains(@class,'selected')]//tr//div[contains(text(),'"+phaseName+"')]";
	}	
	
	public final String downloadHistoryWizard_phaseName(String phaseName) {
		return "//table//tr//div[contains(text(),'"+phaseName+"')]";
	}	
	
	
	public final String manageTab_downloadDialog_phaseX_checkbox(String namePhase){
		return "//table//tr//div[contains(text(),'"+namePhase+"')]/../..//div[contains(@class,'checker')]";//"//div[@name='grid']//div[starts-with(@id,'gridpane') and contains(@class,'x-grid-body')]//tr[contains(@class,'x-grid-row')][child::td/div[text()='"+namePhase+"']]//td[contains(@class,'x-grid-cell-last')]//div[contains(@class,'x-grid-row-checker')]";
	}
	
	//Download Analysis
	public final String manageTab_downloadAnalysis_checkbox = "//div[contains(@name,'downloadAnalysisCheckBox')]//input[contains(@name,'downloadAnalysisCheckBox')]/following-sibling::span";//"//table[@name='downloadAnalysisCheckBox']//input[@name='downloadAnalysisCheckBox']";
	public final String manageTab_downloadAnalysisOutputLevel_label_enabled = "//div[contains(@name,'analysisLevel') and not(contains(@class,'x-item-disabled'))]//span[text()='Analysis Output Level:']";//"//table[@name='analysisLevel' and not(contains(@class,'x-item-disabled'))]//label[text()='Analysis Output Level:']";
	public final String manageTab_downloadAnalysisFileFormat_label_enabled = "//div[contains(@name,'analysisFormat') and not(contains(@class,'x-item-disabled'))]//span[text()='File Format:']";//"//table[@name='analysisFormat' and not(contains(@class,'x-item-disabled'))]//label[text()='File Format:']";
	public final String manageTab_downloadAnalysis_selectOutputLevel = "//div[contains(@name,'analysisLevel')]//div[contains(@id,'trigger-picker')]";//"//table[@name='analysisLevel']//td[child::input[@name='analysisLevel']]//following-sibling::td/div[contains(@class,'x-form-arrow-trigger')]";
	public final String manageTab_downloadAnalysis_selectOutputLevelX(String level){
	return "//div[contains(@name,'analysisLevel-boundlist')]//li[text()='"+level+"']";//"//div[@name='analysisLevel-boundlist']//li[text()='"+level+"']";
	}
	public final String manageTab_downloadAnalysis_selectFileFormat = "//div[contains(@name,'analysisFormat')]//div[contains(@id,'trigger-picker')]";//"//table[@name='analysisFormat']//td[child::input[@name='analysisFormat']]//following-sibling::td/div[contains(@class,'x-form-arrow-trigger')]";
	public final String manageTab_downloadAnalysis_selectFileFormatX(String format){
	return "//div[contains(@name,'analysisFormat-boundlist')]//li[text()='"+format+"']";//"//div[@name='analysisFormat-boundlist']//li[text()='"+format+"']";
	}
	
	public final String releaseTranslationbatchheader_check="//div[contains(@id,'submission') or contains(@id,'Submission')]//div[contains(@class,'last')][contains(@class,'checker-on')]";
	public final String releaseTranslationbatchheader_UNchecked="//div[contains(@id,'submission') or contains(@id,'Submission')]//div[contains(@class,'last')]//span";	
	public final String releaseSubmission_releaseTranslationButton = "//div[contains(@id,'submission') or contains(@id,'Submission')]//a/span/span/span[text()='Release  translation']/following-sibling::span";//div[contains(@id,'releasesubmission')]//a/span/span/span[text()='Release  translation']";
	public final String releaseSubmission_releaseProofButton = "//div[contains(@id,'pdSubmissionPmRelease')]//a/span/span/span[text()='Release  proof']/following-sibling::span";	
	public final String releaseTranslation_rowTable = "//div[starts-with(@id,'pdpmreleasesubmissiondialog') and contains(@class,'x-window-default')]//descendant::tr[starts-with(@class,'x-grid-row')]";
	public final String releaseTranslation_rowTable_checkBox(int row) 
	{
		return "//div[starts-with(@id,'pdpmreleasesubmissiondialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[starts-with(@class,'x-grid-row')]["+row+"]/td[contains(@class,'x-grid-cell-last')]//div[contains(@class,'x-grid-row-checker')]";
	}
	
	//error handling
	public final String manageTab_errorHandling_RetryButton="//div[contains(@id,'gs4trActionToolbar')]//a//span[contains(text(),'Retry')]";//"//span[text()='Retry']/..";
	public final String manageTab_errorHandling_CloseButton="//div[contains(@id,'gs4trActionToolbar')]//a//span[contains(text(),'Close')]";
	public final String manageTab_errorHandling_rowX_checkbox(int row) 
	{	return "//div[contains(@id,'SubmissionErrorHandlingGrid')]//table["+row+"]";
		//return "//div[contains(@id,'pderrorhandlingdialog')]//table[contains(@id,'grid')]//table/tbody/tr[contains(@class,'x-grid-data-row')]["+row+"]/td[last()]";
	}
	public final String manageTab_errorHandling_cancelButton="//div[contains(@id,'pderrorhandlingdialog')]//span[text()='Cancel']/..";
	public final String manageTab_errorHandling_endButton="//div[contains(@id,'pderrorhandlingdialog')]//span[text()='End']/following-sibling::span";
	//Workflow Gate
	public final String manageTab_workflowGateButton = "//span[contains(@id,'pd_workflow_gate_action')]";
	public final String workflowGate_clearLanguage = "css=fieldset>div>div>div>div>div>div>div>div.x-superboxselect-btn-clear";
	public final String workflowGate_languageSelect = "css=fieldset>div>div>div>div>div>div>div>div.x-superboxselect-btn-expand:nth-child(2)";
	public final String workflowGate_clearBatch = "css=fieldset>div>div>div:nth-child(2)>div>div>div>div>div.x-superboxselect-btn-clear";
	
	public final String workflowGate_selectLanguage_Batch(String s){		
		return "css=div.x-combo-list-item:contains('"+ s +"')";
	}
	
	public final String workflowGate_selectAll = "//div[starts-with(@id,'pdworkflowgatedialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'headercontainer')]//div[contains(@class,'x-column-header-checkbox')]/div[contains(@class,'x-column-header-inner')]";
	public final String workflowGate_previousPhaseButton = "//span[text()='Previous Phase']";//css=button:contains('Previous Phase')";
	public final String workflowGate_nextPhaseButton = "//span[text()='Next Phase']";//css=button:contains('Next Phase')";
	public final String workflowGate_skipPhaseButton = "//span[text()='Skip Phase']";//css=button:contains('Skip Phase')";
	public final String workflowGate_resetButton = "//span[text()='Reset']";//css=button:contains('Reset')";
	public final String workflowGate_commitButton = "//span[text()='Commit']/following-sibling::span";//css=button:contains('Commit')";
	public final String workflowGate_saveButton = "//span[text()='Save']following-sibling::span";//css=table>tbody>tr>td:nth-child(2)>table>tbody>tr>td>table>tbody>tr>td:nth-child(2)>table>tbody>tr:nth-child(2)>td:nth-child(2)>em button:contains('Save')";	
	public final String workflowGate_rowTable ="//div[starts-with(@id,'pdworkflowgatedialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-grid-body x-panel-body-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[starts-with(@class,'x-grid-row')]";	
	public final String workflowGate_rowTable_checkBox(int row) 
	{
		return "//div[starts-with(@id,'pdworkflowgatedialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-grid-body x-panel-body-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[starts-with(@class,'x-grid-row')]["+row+"]/td[contains(@class,'x-grid-cell-last')]//div[contains(@class,'x-grid-row-checker')]";
	}
	
	public final String workflowGate_gateOperation(String phase){ 
		return "//div[contains(@id,'workflowgate')]//table/tbody/tr/td[10]/div[text()='"+phase+"']";
	}
	
	public final String workflowGate_commitCommentBox = "//fieldset[3]//textarea";//"css=fieldset:nth-child(3) textarea";
	public final String workflowGate_commitOkButton = "//div[starts-with(@id,'pdworkflowgateconfirmationdialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'OK')]/following-sibling::span";
	//Edit Gate submission
	public final String workflowGate_addReferenceMaterialButton="//span[text()='Add Reference Material']/following-sibling::span";
	public final String workflowGate_referenceFile_addToLevelButton="//span[text()='Add to level']";
	public final String workflowGate_referenceFile_saveButton="//div[contains(@id,'pdsubmissionDialogsWorkflowGateUploadReferencesDialog')]//div[contains(@class,'x-toolbar-docked-bottom')]//span[text()='Save']/following-sibling::span";
	
	//Add Collateral
	public final String addCollateral_addFileToSelect = "//div[contains(@id,'DeliverableCollateralAdd')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String addCollateral_addFile = "css=button.x-btn-text.browse";
	public final String addCollateral_addCollateral_addFile_input = "css=input[class='x-form-file']";
	public final String addCollateral_uploadFile = "//div[contains(@id,'DeliverableCollateralAdd')]//span[contains(@class,'upload')]";//span[@class='x-btn-icon upload']/..";
	public final String addCollateral_OkButton = "//div[contains(@id,'DeliverableCollateralAdd-')]//span[text()='OK']";//"//div[contains(@id,'DeliverableCollateralAdd-')]//span[text()='OK']/following-sibling::span";
	public final String addCollateral_CancelButton = "//div[contains(@id,'DeliverableCollateralAdd-')]//span[text()='Cancel']/following-sibling::span";	
	
	public final String addCollateral_downloadFile(Integer row)
	{
		return "//div[contains(@id,'DeliverableCollateralAdd')]//tr[contains(@class,'x-grid-row')]["+row+"]//img[contains(@class,'download')]";
	}
	
	public final String addCollateral_deleteFile(Integer row)
	{
		return"//div[contains(@id,'DeliverableCollateralAdd')]//table["+row+"]//div[contains(@class,' icon_delete')]";
		//return "//div[contains(@id,'DeliverableCollateralAdd')]//tr[contains(@class,'x-grid-row')]["+row+"]//img[contains(@class,'delete')]";
	}
	
	public final String addCollateral_uploadPane(String fileName)
	{
		return "//div[contains(@id,'DeliverableCollateralAdd')]//tr[contains(@class,'x-grid-row')]//div[text()='"+fileName+"']";
	}
	
	public final String addCollateral_addFileToSelectX(String lang)
	{
		return "//div[contains(@name,'languageCombo-boundlist')]//li[text()='"+lang+"']";
	}

	public final String manageTab_editInstruction_addReferenceFileButton="css=table>tbody>tr:nth-child(2)>td:nth-child(2)>em button:contains('Add Reference Material')";
	public final String submissionsInstructions_closeButton = "//div[contains(@id,'pdhtmlwindow')]//span[text()='Close']/following-sibling::span";
	
	//Assign Submission window 
	public final String manageTab_assignSubmission_okButton = "//div[contains(@id,'pdassignsubmissiondialog')]//a//span[contains(text(),'OK')]";//"//div[contains(@id,'pdassignsubmissiondialog')]//a//span[contains(text(),'OK')]/following-sibling::span";
	public final String manageTab_assignSubmission_okButton_disabled = "//div[contains(@id,'pdassignsubmissiondialog')]//a[contains(@class,'x-item-disabled')]//span[contains(text(),'OK')]";
	public final String manageTab_assignSubmission_clearOwners = "//div[@name='smCombo']//div[contains(@class,'triggerClearAll')]";//"//table[@name='smCombo']//div[contains(@class,'x-superboxselect-btn-clear')]";
	public final String manageTab_assignSubmission_chooseUser = "//div[@name='smCombo']//div[contains(@class,'Trigger_triggerExpand')]";//"//table[@name='smCombo']//div[contains(@class,'x-superboxselect-btn-expand')]";
	public final String manageTab_assignSubmission_inputComment = "//textarea[@name='userComment']";
	public final String manageTab_assignSubmission_HeaderMessage = "//div[contains(@class,'AssignSubmission')]//div[contains(text(),'Assign the selected submission to one or more submission owners.')]";
	public final String manageTab_assignSubmission_yesButton = "//div[contains(@id,'warning')]//div[contains(@class,'toolbar')]//span[contains(text(),'Yes')]";
	public final String manageTab_assignSubmission_selectUserX(String userFirstAndLastName){
		return "//li[contains(@class,'x-boundlist-item')][text()='"+userFirstAndLastName+"']";
	}
	
		
	//Cancel Submission
	public final String manageTab_cancelSubmission_row_header_checker = "//div[contains(@id,'headercontainer')]//span[contains(@class,' x-grid-checkcolumn-checked')]";//"//div[contains(@id,'cancelsubmissionbytarget')]//div[contains(@id,'headercontainer')]//div[contains(@class,'checker-on')]//div//span[@class='x-column-header-text']";
	public final String manageTab_cancelSubmission_row_header_checkbox ="//div[contains(@id,'headercontainer')]//span[contains(@class,'CheckColumn-grid-checkheader')]"; //"//div[contains(@id,'cancelsubmissionbytarget')]//div[contains(@id,'headercontainer')]//div[contains(@class,'x-column-header-last')]//div//span[@class='x-column-header-text']";
	public final String manageTab_cancelSubmission_rowTable ="//div[starts-with(@id,'gridpanel') and contains(@class,'x-grid-body x-panel-body-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[starts-with(@class,'x-grid-row')]";
	public final String manageTab_cancelSubmission_rowTable_checkBox(int row) 
	{
		return "//div[starts-with(@id,'gridpanel') and contains(@class,'x-grid-body x-panel-body-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[starts-with(@class,'x-grid-row')]["+row+"]/td[contains(@class,'x-grid-cell-last')]/div//div[contains(@class,'x-grid-row-checker')]";
	}
	public final String manageTab_cancelSubmission_firstlanguagecheckbox = "//div[contains(@id,'pdwcancelsubmissionbytargetdialog')]//a[contains(@class,'x-superboxselect-all-item-close')]";
	public final String manageTab_cancelSubmission_cancelSubmissionButton="//div[contains(@id,'pdwcancelsubmissionbytargetdialog')]/div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Cancel')]/following-sibling::span";
	public final String manageTab_cancelSubmissionOKButton="//div[contains(@id,'pdwcancelsubmissionbytargetdialog')]/div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'OK')]/following-sibling::span";
	public final String manageTab_cancelSubmission_fmd_cancelSelectedSubmissionButton="//div[contains(@id,'SubmissionCancel')]//span[contains(text(),'Cancel Selected Items')]";
	public final String manageTab_cancelSubmission_warningMessage_yesButton="//div[contains(@id,'warning')]//a//span[contains(text(),'Yes')]";
	//Locator selects/checks file by their filename for cancelation
	public final String manageTab_cancelSubmission_checkFileNameX(String fileName)
	{
		return "//div[contains(@id,'CancelFileGrid')]//div[contains(text(),'"+fileName+"')]/../..//td[contains(@ class,'checkcolumn')]";
		//return "//div[contains(@id,'cancelsubmission')]//table[contains(@id,'gridview')]//tr//td//div[contains(text(),'"+fileName+"')]/../../following-sibling::td[2]//div[contains(@class,'checker')]";
	}
	public final String manageTab_cancelSubmission_checkLanguageX(String language)
	{
		return "//div[contains(@id,'CancelBatchFile')]//table//td//div[contains(text(),'"+language+"')]/../..//div[contains(@class,'x-grid-checkcolumn')]";
		//return "//div[contains(@id,'pdwcancelsubmissionbytargetdialog')]//tr/td/div[text()='"+language+"']";
	}
	public final String manageTab_cancelSubmission_byLanguageAndBatchX(String batch,String language)
	{
		return "//div[contains(@id,'CancelBatchFile')]//table//td[//div[contains(text(),'"+batch+"')]]//div[contains(text(),'"+language+"')]/../..//div[contains(@class,'x-grid-checkcolumn')]";
	}
	public final String manageTab_deleteSubmission_yesButton = "//div[contains(@id,'warningdialog')]//span[text()='Yes']";//"//div[contains(@id,'warningdialog')]//span[text()='Yes']/following-sibling::span";
	public final String manageTab_deleteSubmission_noButton = "//div[contains(@id,'warningdialog')]//span[text()='No']/following-sibling::span";
	public final String manageTab_selectVendorButton = "//span[text()='Select'][contains(@id,'assign_submission_vendor_action')]";//"//div[contains(@id,'pdactionbar')]//a//span[text()='Select Vendors'][contains(@class,'x-btn-inner')]";//"//div[contains(@id,'pdactionbar')]//a//span[text()='Select Vendors'][contains(@class,'x-btn-inner-center')]/following-sibling::span";
		
	public final String claimSubmissionByPmButton = "//span[starts-with(@id,'pd_claim_submission_pm_action')]";//"css=button>span:contains('Claim Proof')";
	public final String uploadButton = "//span[contains(text(),'Upload')]/following-sibling::span";//div[contains(@class,'mainlogolarge')][not(contains(@style,'none'))]//span[contains(@id,'pd_upload_submission_pm_action')]";//css=div[id*='pd_upload_submission_pm_action'] button>span:contains('Upload')";	

	//Translation Tab
	public final String translationTab_getDeliverTranslation_btn = "//div[contains(@id,'actionbar')]//a//span[contains(text(),'Get/Deliver')]";
	public final String translationTab = "//div[contains(@id,'SubmissionDefaultAction') or contains(@id,'actionbar')]//a//span[contains(text(),'Translation')]";//span[contains(@id,'tab')][text()='translation']";
	public final String translationTab_span = "//div[contains(@id,'pdactionbar')]//span[contains(text(),'translation')]//ancestor::a[contains(@data-qtip,'Use this tab to perform actions on your jobs, download, upload, etc.')]";
	public final String translationTab_claimTranslationButton = "//span[contains(@id,'claim')]/following-sibling::span";//"//span[contains(@id,'claim_')]/following-sibling::span";//css=div[id*='pd_claim_submission_pm_action'] button span:contains('Translation')";

	//Proofer Tab
	public final String prooferTab = "//span[contains(@id,'tab')][text()='Proof']";//"//span[contains(@id,'tab')][text()='proof']";
	public final String proofingTab = "//span[contains(@id,'tab')][text()='proofing']";//css=div[id*='tab'] button span:contains('proofing')";
	public final String proofTab_finishButton = "//button[starts-with(@id,'pd_finish_submission_pm_action')]/following-sibling::span";
	public final String translationTab_claimProofButton = "//span[contains(@id,'claim')]/following-sibling::span";
	public final String ProofTab_getDeliverProof_btn = "//div[contains(@id,'actionbar')]//a//span[contains(text(),'Get/Deliver')]";	
	//QM Tab
	public final String qmTab = "//div[contains(@id,'tab')]//span[text()='QM']";//"//div[contains(@id,'tab')]//span[text()='QM']/following-sibling::span";//css=button>span:contains('QM')";
	public final String qmTab_noNumbers="//div[contains(@id,'tab')]//span[contains(text(),'QM')]/following-sibling::span";
	public final String qaTab = "//div[contains(@id,'tab')]//span[text()='QA']";//"//div[contains(@id,'tab')]//span[text()='QA']/following-sibling::span";//css=button>span:contains('QA')";
	public final String qmTab_claimSubmission = "//span[contains(@id,'claim')]/following-sibling::span";//"//span[contains(@id,'pd_claim_submission_pm_action')]/following-sibling::span";
	public final String qm_claimAndGetQmButton="//div[contains(@class,'x-toolbar-footer')]//a//span[contains(text(),'Claim and get files')]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//span[(contains(text(),'claim') or contains(text(),'Claim and get files'))]";
	public final String qaTab_getDeliverQa_btn = "//div[contains(@id,'actionbar')]//a//span[contains(text(),'Get/Deliver')]";	
	//DTP Tab
	public final String dtpTab ="//div[contains(@id,'pdactionbar')]//a//span[text()='DTP']";//"//div[contains(@id,'pdactionbar')]//a//span[text()='DTP']/following-sibling::span";
	public final String claimSubmissionByPmDtpButton = "//span[contains(@id,'claim')]/following-sibling::span";//"//div[contains(@id,'actionbar')]//span[contains(@id,'claim_source_submission_pm_action') and contains(text(),'Claim')]/following-sibling::span";//"//span[contains(@id,'claim_submission_pm_action')][contains(@class,'x-btn-inner-center')]/following-sibling::span";///following-sibling::span
	public final String dtpTab_uploadSubmissionWithPdfExportButton = "//span[contains(@id,'pd_upload_source_submission_with_export_pm_action')]";//css=button[id*='pd_upload_source_submission_with_export_pm_action']>span:nth-child(2)";
	public final String dtpTab_uploadNativeButton = "//span[contains(@id,'pd_upload_source_submission_pm_action')]";//css=button.uploadsourcesubmissionpmlarge";
	public final String claimDTP_claimDTPOfflineButton="//div[contains(@id,'pdSubmissionDefault')]//span[contains(text(),'Claim  DTP')]/following-sibling::span";
	public final String claimDTP_claimDTP_Button="//div[contains(@id,'submission') or contains(@id,'Submission')]//a//span[contains(text(),'Claim  DTP')]/following-sibling::span";//css=div[id*='submission' or id*='Submission'] div[id*='toolbar'] span:contains('Claim  DTP')";	
	public final String dtpTab_getDeliverDtp_btn = "//div[contains(@id,'actionbar')]//a//span[contains(text(),'Get/Deliver')]";
	public final String available_claimandGetDtpButton="//div[contains(@class,'x-toolbar-footer')]//a//span[contains(text(),'Claim and get files')]";//"//div[contains(@id,'Submission') or contains(@id,'submission')]//span[(contains(text(),'claim') or contains(text(),'Claim and get files'))]";
	//Jobs Selections
	public final String jobsSelections_proceedButton = "//span[text()='Proceed']";//span[text()='Proceed']/following-sibling::span";

	public final String jobsSelection_disabledProceedButton="//div//a[contains(@class,'disabled')]//span[contains(text(),'Proceed')]";
	public final String jobsSelections_groupByVendorCheckbox = "//table[@name='Group by vendorcheckbox']//input[@name='Group by vendorcheckbox']";//css=table[name='Group by vendorcheckbox'] td>input[name='Group by vendorcheckbox']";
	public final String jobsSelections_closeLanguageX(String language)
	{
		return "//div[contains(@id,'pdSubmissionPmAssignJobSelection')]//div[text()='"+language+"']/following-sibling::div";//"//div[contains(@id,'pdSubmissionPmAssignJobSelection')]//td//span[text()='"+language+"']/following-sibling::a";
	}
	
	public final String finishButton="//span[contains(@id,'pd_finish_submission_pm_action')]";
	public final String jobsSelection_FileClaimLevel_checkLanguageX(String language)
	{
		return "//div[contains(@id,'pdSubmissionPmAssignJobSelection')]//td/div[text()='"+language+"']";
	}
	
	public final String jobsSelection_FileClaimLevel_checkedLanguageX(String language)
	{
		return "//div[contains(@id,'pdjobsselectiondialog')]//tr[contains(@class,'selected')][td/div[text()='"+language+"']]";
	}
	//PM Assign
	public final String PMassign_finishButton = "//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Finish')]";//"//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Finish')]/following-sibling::span";
	public final String PMassign_windowTitle ="//div[contains(@id,'PmAssign')][contains(text(),'PM Assign')]";//"//div[contains(@id,'PmAssign')]//span[contains(text(),'PM Assign')]";
	public final String PMassign_NextButton = "//span[contains(text(),'Next')]";//span[contains(text(),'Next')]/following-sibling::span"; 
	
	public final String  PMassign_rowX_phase(int row)
	{
		return "//div[contains(@id,'pdSubmissionPmAssign')]//table["+row+"]//tr//td[contains(@class,'first')]//div";
	}

	public final String PMasssign_selectUser ="//div[contains(@id,'PmAssignGrid')]//table//td//div[contains(@class,' x-form-arrow-trigger')]";//"//div[contains(@id,'pdSubmissionPmAssign')]//table//tr//td[div[text()='Review']]//following-sibling::td";//"//div[contains(@id,'pdSubmissionPmAssign')]//table//td//div[contains(@id,'trigger-picker')]";//"//div[contains(@id,'pdSubmissionPmAssign')]//table//tr[1]//td[contains(@class,'last')]//div";//div[contains(@id,'pdSubmissionPmAssign')]//table//tr[1]//td[contains(@class,'last')]//div[contains(@id,'trigger-picker')]";////div[contains(@id,'pdSubmissionPmAssign')]//div[contains(@id,'ext-comp')]//table//div[contains(@class,'trigger')]";
	public final String PMasssign_arrow_selectUser = "//div[contains(@id,'PmAssignGrid')]//table//td//div[contains(@class,' x-form-arrow-trigger')]";//"//table[contains(@name,'combobox')]//td//div[contains(@class,'trigger')]";
	public final String PMasssign_selectUserX(String userName)
	{
		return "//div[text()='"+userName+"']";
	}
	
	public final String PMasssign_selectUser_Dropdown="//table//div[contains(@data-ref,'inputWrap')]/following-sibling::div[contains(@class,'trigger')]";
	public final String PMasssign_rowX_user(int row)
	{
		return "//div[contains(@id,'pdSubmissionPmAssign')]//table["+row+"]//tr//td[contains(@class,'last')]//div[contains(@class,'x-grid-cell-inner')]";//"//div[contains(@id,'pdSubmissionPmAssign')]//table//tr["+row+"]//td[contains(@class,'last')]//div";
	} 
	public final String PMAssign_userForPhaseX(String phase)
	{
		return "//div[contains(@id,'pdSubmissionPmAssign')]//table//tr//td[div[text()='"+phase+"']]";//div[contains(@id,'pdSubmissionPmAssign')]//table//tr//td[div[text()='"+phase+"']]/following-sibling::td//div";
	}	
	
// PM Assign second language screen
	public final String PMasssign_secondLanguage_firstRow_user = "css=div[class='x-panel x-form-label-left'] form[class='x-panel-body x-panel-body-noheader x-form'] div.x-grid3-body>div:nth-child(1) td.x-grid3-cell-last>div";
	public final String PMasssign_secondLanguage_secondRow_user = "css=div[class='x-panel x-form-label-left'] form[class='x-panel-body x-panel-body-noheader x-form'] div.x-grid3-body>div:nth-child(2) td.x-grid3-cell-last>div";
	public final String PMasssign_selectUser_nextScreen = "css=div.x-panel.x-form-label-left:last-child div.x-layer.x-editor.x-small-editor.x-grid-editor img";
	public final String PMasssign_selectUserX_nextScreen(String userName)
	{
		return "css=div.x-layer.x-combo-list.x-combo-list-small:last-child div.x-combo-list-item:contains('"+userName+"')";
	}
	
	//Claim Translation window
	public final String claimTranslation_claimTranslationButton = "//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Claim Translation')]//ancestor::button";
	public final String claimTranslation_headerCheckBoxChecked="//div[contains(@id,'submission') or contains(@id,'Submission')]//div[contains(@id,'headercontainer')]/div[contains(@class,'x-column-header-last x-grid-hd-checker-on')]/div/span[@class='x-column-header-text']";//div[starts-with(@id,'pddefaultsubmissionactiondialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'headercontainer') and contains(@class,'x-docked-top')]//div[contains(@class,'x-grid-hd-checker-on') and contains(@class,'x-column-header-last')]/div[contains(@class,'x-column-header-inner')]";//"css=div[class='x-grid3-header'] td>div[class*='x-grid3-hd-checker-on']";
	public final String claimTranslation_headerCheckBox="//div[contains(@id,'submission') or contains(@id,'Submission')]//div[contains(@id,'headercontainer')]/div[contains(@class,'x-column-header-last')]/div/span[@class='x-column-header-text']";//div[starts-with(@id,'pddefaultsubmissionactiondialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'headercontainer') and contains(@class,'x-docked-top')]//div[contains(@class,'x-grid-hd-checker-on') and contains(@class,'x-column-header-last')]/div[contains(@class,'x-column-header-inner')]";//"css=div[class='x-grid3-header'] td>div[class*='x-grid3-hd-checker-on']";
	public final String claimTranslation_claimForLanguageCheckBox(String language)
	{
		return "//div[contains(@id,'submission') or contains(@id,'Submission')]//tr/td[div/div[contains(text(),'"+language+"')]]/table//tr/td[last()]";//div[contains(@id,'submission')]//tr/td[div/div[contains(text(),'"+language+"')]]/table//tr/td[last()]";//div[starts-with(@id,'pddefaultsubmissionactiondialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//tr[contains(@id,'"+language+"') and contains(@class,'x-grid-group-body')]//td[contains(@class,'x-grid-cell-last')]//div[contains(@class,'x-grid-row-checker')]";
	}
	
	
	//Approve quote (has same locators with review)
	public final String approveQuoteButton = "//span[contains(@id,'pd_approve_submission_quote_action')]";
	public final String approveQuote_approveButton = "//div[contains(@id,'pdapprovequotejobdialog')]//span[text()='Approve']/following-sibling::span";
	public final String approveQuote_rejectButton = "//div[contains(@id,'pdapprovequotejobdialog')]//span[text()='Reject']/following-sibling::span";

	

	public final String reviewQuote_reviewQuoteButton = "//a[contains(@id,'pd_review_submission_quote_action')]//span[contains(text(),'Review Quote')][@class='x-btn-inner x-btn-inner-center']/following-sibling::span";//"//span[contains(@id,'') and contains(text(),'Review Quote')]";
	public final String reviewQuote_acceptQuoteButton = "//span[contains(text(),'Accept Quote')]/following-sibling::span";

	public final String reviewQuote_acceptQuoteButtonDisabled = "//a[contains(@class,'disabled')]//span[contains(text(),'Accept Quote')]/following-sibling::span";
	public final String reviewQuote_batchSelect = "//div[contains(@id,'JobSelection')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String reviewQuote_clearLanguage = "//div[contains(@name,'languages')]//div[contains(@class,'triggerClearAll')]";//"//table[contains(@name,'languages')]//div[@class='x-superboxselect-btn-clear']";
	public final String reviewQuote_languageSelect = "//div[contains(@name,'languages')]//div[contains(@class,'triggerExpand')]";//"//table[contains(@name,'languages')]//div[contains(@class,'x-superboxselect-btn-expand')]";
	public final String reviewQuoteNextButton = "//span[contains(text(),'Next')]/following-sibling::span"; 
	public final String reviewQuoteNextButtonDisabled = "css=table[class='x-btn x-btn-noicon x-item-disabled']>tbody[class='x-btn-small x-btn-icon-small-left']>tr:nth-child(2)>td:nth-child(2)>em button:contains('Next')"; 
	public final String reviewQuote_downloadAllQuotes = "//div[contains(@id,'pdreviewquote')]//span[text()='Download All Quotes']/following-sibling::span";//css=button:contains('Download All Quotes')";
	public final String reviewQuote_CancelButton = "//div[contains(@id,'pdreviewquote')]//span[text()='Cancel']/..";
	public final String reviewQuote_yesButton = "//div[contains(@id,'warningdialog')]//div[contains(@id,'toolbar')]//span[text()='Yes']/following-sibling::span";//"//div[class*='x-window x-layer x-window-default']:has(div:contains('Some vendors')) span:contains('Yes')";
	public final String reviewquote_optionalCheckBox = "css=div:nth-child(9) div:nth-child(2) input.x-form-checkbox.x-form-field";
	public final String reviewQuote_quickQuoteButton = "//div[contains(@id,'pdreviewquote')]//span[text()='Quick Quote']/following-sibling::span" ;
	public final String reviewQuoteWizard="//span[contains(text(),'Review Quote')]";
	
	public final String reviewQuote_discountValue(String discValue, String vendorName)
	{
		return "//td[label/span[text()='Discount']]/following-sibling::td/div[text()='"+discValue+"'][ancestor::div//table//td/div[contains(text(),'"+vendorName+"')]]";
	}
		
	public final String reviewQuote_optionalCheckBox(String lineItem)
	{
		return "//div[contains(@id,'reviewquote')]//div[table//td/label[contains(text(),'"+lineItem+"')]]/table//input[@name='quote0phase0lineItemOptional0']";
	}
	
	public final String reviewQuote_batchSelectX(String batchName){		
		return "//li[contains(@class,'x-boundlist-item')]/div[text()='"+batchName+"']";//li[contains(@class,'x-boundlist-item')][text()='"+ batchName + "']";
	}
	
	public final String reviewQuote_languageSelectX(String languageName){		
		return "//li[contains(@class,'x-boundlist-item')][text()='"+languageName+ "']";
	}
	

	public final String reviewQuote_vendorNameExpand(String vendorName){
		return "//div[contains(@id,'reviewquote') or contains(@id,'ReviewQuote')][not(contains(@style,'none'))]//div[table/tbody/tr/td/div[contains(text(),'"+vendorName+"')]]/div/img";//div[contains(@id,'reviewquote')][not(contains(@style,'none'))]//div[following-sibling::div//td/div[contains(text(),'"+vendorName+"')]]/img";
	}
	
	public final String reviewQuote_phaseNameExpand(String phaseName){
		return "//div[contains(@id,'reviewquote')][not(contains(@style,'none'))]//div[span[contains(text(),'"+phaseName+"')]]/following-sibling::div/img";
	}
	
	public final String reviewQuote_phaseNameExpand_oneVendor(String phaseName){
		return "//div[contains(@id,'reviewquote')][not(contains(@style,'none'))]//div[child::div/div/span[starts-with(@id,'panel') and contains(text(),'"+phaseName+"')]]//div/img[contains(@class,'expand')]";
	}
	
	public final String reviewQuote_vendorNameCheckCheckbox="css=div[id*='pdreviewquotejobdialog'] div[id*='ext-comp'] table td:nth-child(2)>input";
	public final String reviewQuote_selectAllVendorCheckBox="//table[not(contains(@class,'checked'))]//td//input[@name='selectAllCheckbox']"; 
		
	public final String reviewQuote_verifyVendorName(String name)
	{		
		return "css=div[id*='pdreviewquotejobdialog'] div[id*='ext-comp'] table:nth-child(2) td:nth-child(2):contains('"+name+"')";		
	}
	public final String reviewQuote_vendorQuoteData(Integer costNum ){
		return "//div/table["+(costNum+2)+"]/tbody/tr/td[2]/div";
	}	
	public final String reviewQuote_phaseNameSelect (String phaseName){
		return "css=div[class='x-panel-header x-unselectable']:has(label.x-column:contains('"+ phaseName + "')) input.x-form-checkbox.x-form-field";
	}
	
	public final String reviewQuote_vendorNameCheckX (String vendorName){
		return "//div[contains(@class,'review')][not(contains(@style,'none'))]//table[following-sibling::table/tbody/tr/td/div[contains(text(),'"+vendorName+"')]]/tbody/tr/td/div/input";//div[contains(@id,'review')]//table[following-sibling::table/tbody/tr/td/div[contains(text(),'"+vendorName+"')]]/tbody/tr/td/div/input";//div[not(contains(@style,'none'))][@class='x-panel x-fit-item x-panel-default']//table[following-sibling::table/tbody//div[contains(text(),'"+vendorName+"')]]/tbody//input";
	}
	
	public final String reviewQuote_vendorNameCheckX_disabled (String vendorName){
		return "//div[contains(@class,'review')][not(contains(@style,'none'))]//table[following-sibling::table/tbody/tr/td/div[contains(text(),'"+vendorName+"')]][contains(@class,'disabled')]/tbody/tr/td/div/input";//div[not(contains(@style,'none'))][@class='x-panel x-fit-item x-panel-default']//table[contains(@class,'disabled')][following-sibling::table/tbody//div[contains(text(),'gla_workflow_vendor_translator')]]/tbody//input";//div[not(contains(@style,'none'))][@class='x-panel x-fit-item x-panel-default']//table[@class='x-field x-form-item x-column x-field-default x-item-disabled x-column-form-item'][following-sibling::table/tbody//div[contains(text(),'"+vendorName+"')]]/tbody/tr/td[2]";
	}
	
		
	
	//Reset Quote
	public final String resetQuote_resetQuotebutton = "//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Reset Quotes')]/following-sibling::span";
	public final String resetQuote_checkAll = "//div[contains(@id,'submission')]//div[contains(@class,'header-last')]/div/span";//css=div.x-grid3-hd-inner.x-grid3-hd-checker>div";	
	public final String resetQuote_batchWithinLanguagePair_checkbox(String language_pair, String batch)
	{
		//language pair has to be like "English (Canada) \u21D2 German (Germany)"
		return "//div[contains(@id,'submission')]//td[div/div[contains(text(),'"+language_pair+"')]]/table//tr/td/div[text()='"+batch+"']";//css=div[group='"+language_pair+"'] table.x-grid3-row-table:has(div.x-grid3-cell-inner:contains('"+batch+"')) div.x-grid3-row-checker";
	}
	
	//Add Submission
	
	public final String addSubmission_window_headerName ="//div[contains(@id,'manualsubmissiondialog')]//div[contains(text(),'Manual Submission')]";//"//div[contains(@id,'manualsubmissiondialog')]//div//span[contains(text(),'Manual Submission')]";
	public final String addSubmission_selectSubmissionPriority = "//div[contains(@name,'priorityCombo')]//div[contains(@class,'arrow-trigger')]";
	public final String addSubmission_selectPriority_combobox ="//input[contains(@name,'priorityCombo')]";
	public final String addSubmission_selectProjectForSubmission = "//div[contains(@name,'projectCombo')]//div[contains(@class,'arrow-trigger')]";
	public final String addSubmission_inputProjectForSubmission = "css=div[class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable'] input[name='projectCombo']";
	public final String addSubmission_selectNormalPriority = "//div[contains(@name,'priorityCombo-boundlist')]//li[text()='Normal']";
	public final String addSubmission_selectHighPriority = "//div[contains(@name,'priorityCombo-boundlist')]//li[text()='High']";
	public final String addSubmission_selectLowPriority = "//div[contains(@name,'priorityCombo-boundlist')]//li[text()='Low']";
	public final String addSubmission_inputDueDate = "//input[contains(@name,'dueDate')]";//"css=input[name='dueDate']";
	public final String addSubmission_selectClaimLevel= "//div[contains(@name,'claimLevelCombo')]//div[contains(@class,'arrow-trigger')]";
	public final String addSubmission_selectClaimLevel_combobox ="//input[contains(@name,'claimLevelCombo')]";//"//input[@name='claimLevelCombo']";
	public final String addsubmission_selectClaimLevelX(String level)
	{
		return "//div[contains(@name,'claimLevelCombo-boundlist')]//li[text()='"+level+"']";
	}
	
	
	public final String addSubmission_selectProjectManager= "//div[@name='ownerCombo']//div[contains(@class,'triggerExpand')]";
	public final String addSubmission_clearProjectManager= "//div[@name='ownerCombo']//div[contains(@class,'ClearAll')]";
	public final String addSubmission_selectProjectManagerX(String manager)
	{
		return "//div[contains(@name,'ownerCombo-boundlist')]//li[text()='"+manager+"']";
	}
	
	public final String addSubmission_submissionTemplate_checkbox = "//input[contains(@name,'templateCheckbox')]/following-sibling::span";//"//div[contains(@name,'submissionTemplateCheckbox')][not(contains(@style,'display: none;'))]//input[contains(@name,'submissionTemplateCheckbox')]/following-sibling::span";//"//table[@name='submissionTemplateCheckbox'][not(contains(@style,'display: none;'))]//input[@name='submissionTemplateCheckbox']";
	public final String addSubmission_disabledSubmissionTemplate_checkbox="//div[contains(@name,'templateCheckbox')][contains(@class,'disabled')]";//"//table[contains(@class,'disabled')]//input[@name='submissionTemplateCheckbox']";
	public final String addSubmission_calendarSelectMonthandYear =  "//div[contains(@class,'x-datepicker x-layer x-datepicker-default x-unselectable')][not(contains(@style,'display'))]//span[last()]";	
	public final String addSubmission_batchPreview_windowHeader ="//div[text()='Batch Preview']";//"//div[contains(@id,'batchpreviewdialog')]//span[text()='Batch Preview']";
	public final String addSubmission_batchPreview_windowText ="//div[contains(@class,'BatchPreview')]//div[contains(text(),'Update batch')]";
	
	public final String addSubmission_batchPreview_selectBatch(String batchName)
	{
		return "//div[contains(@id,'batchpreview')]//a//span[contains(text(),'"+batchName+"')]";
	}
	
	public final String addSubmission_calendarSelectMonthX(String month)
	{
		return "//div[contains(@class,'monthpicker ')][not(contains(@style,'display: none'))]//a[text()='"+month+"']";
	}
	
	
	public final String addSubmission_previewSubmission_calendarSelectMonthX(String month)
	{
		return "//div[contains(@class,'monthpicker ')][not(contains(@style,'display: none'))]//a[text()='"+month+"']";
	}
	
	public final String addSubmission_workflowTrigger_calendarSelectMonthYearX(String monthorYear)
	{
		return "//div[contains(@class,'x-datepicker-default') and not(contains(@style,'display: none;'))]//a[contains(text(),'"+monthorYear+"')]";
		//String result = "//div[@class='x-menu x-menu-floating x-layer x-date-menu x-menu-plain x-menu-nosep']//div[contains(@class,'x-date-mp') and contains(@style,'visibility: visible') ]//a[contains(text(),'"+monthorYear+"')]";
	}
	
	public final String addSubmission_calendarSelectYearX(String year)
	{
		return "//div[contains(@class,'monthpicker ')][not(contains(@style,'display: none'))]//a[text()='"+year+"']";//css=div[class*='x-monthpicker-year']>a:contains('"+year+"')";
	}
	
	public final String addSubmission_calendarSelectDayX(String day)
	{	
		return "//div[contains(@name,'dueDate') or contains(@name,'DueDate')]//table[contains(@class,'x-datepicker-inner')]//td[not(contains(@class,'disabled'))]//div[text()='"+day+"']";
	}
	
	public final String addSubmission_previewSubmission_calenderSelectDayX(String day)
	{
		return "//div[contains(@class,'datepicker ')][not(contains(@style,'display: none'))]//table//tbody//div[text()='"+day+"']";//"//div[contains(@class,'datepicker ')][not(contains(@style,'display: none'))]//td[not(contains(@title,'date in this field must be after'))]/a[text()='"+day+"']";
	}
	
	public final String addSubmission_workflowTriggercalendarSelectDayX(String day)
	{	
		return "//div[contains(@name,'datefield0-datePicker')]//table[contains(@class,'datepicker-inner')]//td[not(contains(@class,'disabled'))]//div[text()='"+day+"']";//"//div[@name='datefield0-datePicker']//table[@class='x-datepicker-inner']/tbody/tr/td[not(contains(@class,'disabled'))]/a[text()='"+day+"']";//div[contains(@class,'x-datepicker-default') and not(contains(@style,'display: none;'))]//a[text()='"+day+"']"; 
	}
	
	public final String addSubmission_workflowTriggercalendarSelectDayX_PreviousDueDate(String day)
	{	
	//	return "//div[contains(@name,'datePicker')]//table[contains(@class,'datepicker-inner')]/tbody/tr/td[(contains(@class,'disabled'))  and contains(@title,'The date in this field must be after')]/a[text()='"+day+"']";//div[contains(@class,'x-datepicker-default') and not(contains(@style,'display: none;'))]//a[text()='"+day+"']"; 
		return "//div[contains(@class,'datepicker')][not(contains(@style,'display: none'))]//table[contains(@class,'datepicker')]//td[contains(@class,'disabled')]//div[text()='"+day+"']";//"//div[contains(@class,'datepicker')][not(contains(@style,'display: none'))]//table[contains(@class,'datepicker')]//td[contains(@class,'disabled')]//a[text()='"+day+"']";
	}
	
	public final String addSubmission_workflowTriggercalendarSelectDayX_PreviousDueDate_mouseOver_tooltip(String day)
	{	
		return "//div[contains(@class,'datepicker')][not(contains(@style,'display: none'))]//table[contains(@class,'datepicker')]//tr//td[div[contains(text(),'"+day+"')]][contains(@class,'disabled')][contains(@data-qtip,'The date in this field must be after')]";//"//div[contains(@class,'datepicker')][not(contains(@style,'display: none'))]//table[contains(@class,'datepicker')]//td[contains(@class,'disabled')][contains(@title,'The date in this field must be after')]//a[text()='"+day+"']";
	}
	
	public final String calendarOkButton = "//div[contains(@name,'datePicker')][not(contains(@style,'none'))]/div[@class='x-monthpicker x-layer x-monthpicker-default x-border-box']//a//span[contains(text(),'OK')]";
	
	public final String workflowTrigger_calendarOkButton = "//div[contains(@class,'x-datepicker-default') and not(contains(@style,'display: none;'))]//span[contains(text(),'OK')]";
	
	public final String mySubmissionsButton_pressed="//div//a[contains(@class,'x-btn-pressed')]//span[text()='My Submissions']";
	public final String mySubmissionsButton="//span[text()='My Submissions']";
	
	
	public final String addSubmission_inputDueDateMessage = "//form//div[6]//div//div[2]";	
	public final String addSubmission_calendar = "//div[contains(@name,'dueDate')]//div[contains(@class,'date-trigger')]";
	public final String addSubmission_calendar_tpt="//div[contains(@id,'generalsetting')]//table[contains(@name,'dueDateTpt')]//td//div[contains(@class,'date-trigger')]";//"//table[@name='dueDateTpt']//td[2]//div";
	public final String addEditSubmission_inputDueDate_tpt="//input[@name='dueDateTpt']";
	public final String addSubmission_instructionsTab="//div[contains(@class,'ManualSubmissionDialog')]//span[text()='Instructions']";
	public final String addSubmission_projectBackgroundTab="//div[contains(@class,'ManualSubmissionDialog')]//span[text()='Project Background']";
	public final String addSubmissions_iframe_inputProjectBackground = "//div[@qaname='backgroundInstructions']//div//iframe";
	public final String addSubmission_selectProjectBackgroundTab="//a[contains(@id,'tab')]//span[text()='Project Background']/following-sibling::span";
	public final String addSubmission_selectSpecialInstructionsTab="//a[contains(@id,'tab')]//span[contains(text(),'Instructions')]/following-sibling::span";
	public final String addSubmissions_inputProjectBackground = "//html//body"; 
	public final String addSubmissions_iframe_inputInstructions = "//div[@qaname='specialInstructions']//div//iframe";
	public final String addSubmissions_inputInstructions = "//html//body"; 
	public final String addSubmission_selectTranslateFrom = "//div[@name='sourceCombo']//div[contains(@class,'arrow-trigger')]";
	public final String addSubmission_selectTranslateFrom_combobox ="//input[@name='sourceCombo']";
	public final String addSubmission_inputTranslateTo = "//input[@name='targetCombo']";
	public final String addSubmission_spanTranslateTo(String language)
	{
		return "//div[@name='targetCombo']//div[text()='"+language+"']";//"//table[@name='targetCombo']//span[text()='"+language+"']";	
	}
	public final String addSubmission_targetLanguageClose = "//a[contains(@class,'x-superboxselect-item-close')]";
	public final String addSubmission_autoDetectFileTypesCheckBox = "css=tr.x-toolbar-left-row>td:nth-child(4)>div>input[type='checkbox']";
	public final String addSubmission_selectFileFormat = "//div[contains(@name,'combo')]//div[contains(@class,'arrow-trigger')]";
	public final String addSubmission_TranslateFrom="//input[@name='sourceLocale']";
	
	public final String addSubmission_quoteRequiredIsChecked_disabled = "//table[@name='quotableCheckbox' and contains(@class,'x-form-cb-checked')]//input[@name='quotableCheckbox'][@disabled='']";
	public final String addSubmission_quoteRequiredIsChecked_enabled = "//table[@name='quotableCheckbox' and contains(@class,'x-form-cb-checked')]//input[@name='quotableCheckbox']";
	public final String addSubmission_quoteRequiredIsUnChecked_enabled = "//table[@name='quotableCheckbox' and not(contains(@class,'x-form-cb-checked'))]//input[@name='quotableCheckbox']";
	public final String addSubmission_quoteRequiredCheckbox="//table[@name='quotableCheckbox']//input[@name='quotableCheckbox']";
	
	public final String addSubmission_selectQuoteTypeButton="css=table[name='defaultQuoteTypeCombo'] table td>div[class*='unselectable']";
	public final String addSubmission_selectQuoteTypeX(String quoteType)
	{
		return "//div[@name='defaultQuoteTypeCombo-boundlist']//div[contains(text(),'"+quoteType+"')]";	
	}
	
		
	public final String addSubmission_fileFormatRowX(int i)
	{
		return "//div[contains(@id,'UploadStandardFileGrid')]//table["+(i+1)+"]//tr//td[3]//div";//"//div[contains(@id,'pduploadfilesgrid')]//table["+(i+1)+"]//tr//td[3]//div";//"//div[contains(@id,'pduploadfilesgrid')]//table//tr["+(i+1)+"]//td[3]//div";
	}
	
	public final String addSubmission_fileUpload_headerCheckbox_Checked="//div[contains(@name,'uploadFiles')]//div[contains(@id,'gridcolumn') and contains(@class,'header-first')][contains(@class,'checker-on')]";
	public final String addSubmission_fileUpload_HeaderCheckbox="//div[contains(@name,'uploadFiles')]//div[contains(@id,'gridcolumn') and contains(@class,'header-first')]//div[contains(@class,'column-header')]//div";
	
	public final String addSubmission_fileUpload_checkedSourceFiles(int j)
	{
		return "//div[contains(@name,'uploadFilesGrid')]//table["+(j+1)+"]//tbody//tr//div[@class='x-grid-row-checker']";
		//return "//div[contains(@id,'pduploadfilespanel')]//table//tbody//tr[contains(@class,'selected')]["+(j+1)+"]//td//div//div[@class='x-grid-row-checker']";
	}
	
	public final String addSumission_fileUpload_checkSourceFileX(int j)
	{
		return "//div[contains(@id,'pduploadfilespanel')]//table//tbody//tr["+(j+1)+"]//td//div//div[@class='x-grid-row-checker']";
	}
	
	public final String addSubmission_fileUpload_addButton="//div[contains(@id,'pduploadfilesdialog')]//div[a//span[text()='Cancel']]/a//span[text()='Add']/following-sibling::span";
	public final String addSubmission_fileUpload_cancelButton="//div[contains(@id,'pduploadfilesdialog')]//div/a//span[text()='Cancel']";
	public final String addSubmission_fileUpload_BatchNameX="//div[contains(@id,'pdbatchgrid')]//table//tbody//a[contains(text(),'Batch1')]";
	
	public final String addSubmission_fileUpload_BatchNamePD5X(String BatchName){
		return "//div[contains(@id,'pdbatchgrid')]//table//tbody//a[contains(text(),'"+BatchName+"')]";
	}
	
	
	
	
	public final String addSubmission_fileUpload_BatchNameX(String batch)
	{
		return "//div[contains(@id,'batchgrid')]//table/tbody//a[contains(text(),'"+batch+"')]";//"css=div[id*='pdbatchgrid'] table>tbody a:contains('"+batch+"')";
	}
	public final String addSubmission_batchPreview_verifyFileNameX(int k)
	{
		return "css=div[id*='pdstatisticsgrid'] tbody>tr:nth-child("+(k+2)+")>td:nth-child(2)>div";
	}
	public final String addSubmission_batchPreview_verifyFileFormat(int row)
	{
		//return "css=div[id*='pdstatisticsgrid'] tbody>tr:nth-child("+row+")>td:nth-child(3)>div";	
		return "//div[contains(@id,'pdstatisticsgrid')]//tbody//tr["+row+"]//td[3]//div";
	}

	public final String addSubmission_batchPreview_verifyFileFormatName(String fileFormat)
	{
		//return "css=div[id*='pdstatisticsgrid'] tbody tr td>div:contains('"+fileFormat+"')";
		return "//div[contains(@id,'pdstatisticsgrid')]//tbody//tr//td//div[contains(text(),'"+fileFormat+"')]";
	}
	
	public final String addSubmission_totalBatchStatistics_fileNameX_columnX(String fileName, int column)
	{
		return "//div[text()='"+fileName+"']/../../td["+column+"]/div";
		
	}
	
	public final String addSubmission_batchPreview_saveButton="//div[contains(@id,'batchpreviewdialog')]//span[contains(text(),'Save')]";//"//div[contains(@id,'batchpreviewdialogadd')]//span[contains(text(),'Save')]";//"//div[contains(@id,'batchpreviewdialogedit')]//span[contains(text(),'Save')]";//"//div[contains(@id,'batchpreviewdialogadd')]//span[contains(text(),'Save')]";//"//div[contains(@id,'batchpreviewdialog') and contains(@class,'x-window-default')]//span[contains(text(),'Save')]/following-sibling::span";
	public final String addSubmission_batchPreview_cancelButton = "//div[contains(@id,'batchpreviewdialogadd')]//div[contains(@id,'toolbar')]//span[text()='Cancel']";//"//div[contains(@id,'batchpreviewdialogadd')]//div[contains(@id,'toolbar')]//span[text()='Cancel']/following-sibling::span";
	public final String addSubmission_extractZipCheckbox="//label[contains(text(),'Extract Zip')]";
	
	public final String addSubmission_WorkflowTrigger_triggerWorkflow="//span[text()='Triggers']/..";
	public final String addSubmission_WorkflowTrigger_saveButton="//div[contains(@id,'pdtriggerdialog')]//span[text()='Save']/..";
	public final String addSubmission_WorkflowTrigger_saveButton_disabled = "//div[contains(@id,'pdtriggerdialog')]//a[contains(@class,'x-item-disabled')]//span[text()='Save']/..";
	public final String addSubmission_workflowTrigger_calendar = "css=fieldset[class=' x-fieldset x-form-label-left'] div.x-form-field-wrap.x-form-field-trigger-wrap img.x-form-trigger.x-form-date-trigger";
	public final String addSubmission_workflowTrigger_autoStartChildSubmission = "//input[@name='autoStartCheckbox']/following-sibling::span";//"//input[@name='autoStartCheckbox']";
	public final String addSubmission_workflowTrigger_applyToAll = "//input[@name='applyToAllCheckbox']";
	
	public final String addSubmission_WorkflowTrigger_TranslateIntoSelectButtonX(int num)
	{		
		return "//table[@name='languageCombo"+num+"']//tr//td//div[contains(@class,'superboxselect-btn-expand')]";
	}
	
	
	/*
	 * Pass 1 - for first target language, 2 - for the second, etc
	 */
	public final String addSubmission_WorkflowTrigger_TranslateIntoSelectLanguageX(int  num)
	{		
		return "//table[@name='languageCombo"+(num-1)+"']//tr//td//div[contains(@class,'superboxselect-btn-expand')]";
	}

	public final String addSubmission_WorkflowTrigger_clickToWorkflow(Integer lang){
		return "//fieldset["+lang+"]//div[contains(@class,'x-form-arrow-trigger')]";
	}
	
	public final String addSubmission_WorkflowTrigger_selectWorkflow(String workflowName){
		return "//div[contains(@id,'pdtriggerdialog')]/../div[contains(@name,'workflowCombo0')]//li[contains(text(),'"+workflowName+"')]";
		//return "//div[contains(@name,'workflowCombo')]//li[text()='"+workflowName+"']";
	}
	
	public final String addSubmission_workflowTrigger_calendar (Integer lang){
		return "//fieldset["+lang+"]//div[contains(@class,'x-form-date-trigger')]";
	}
	
	public final String addSubmission_workflowTrigger_calendar_input (Integer lang){
		return "//div[contains(@id,'pdtriggerdialog')]/fieldset["+lang+"]//input[contains(@id,'datefield')]";
	}

	/*
	 * Pass 0 - for first target language, 1 - for the second, etc
	 */
	public final String addSubmission_WorkflowTrigger_clickTrnaslateInto(Integer lang){
		return "//table[@name='languageCombo"+lang+"']//tr//td//ul//li//input";
	}

	/*
	 * Pass 0 - for first workflow, 1 - for the second, etc
	 */	
	public final String addSubmission_workflowtrigger_inputWorkflowX(Integer rowNum){
		return "//input[@name='workflowCombo"+rowNum+"']";
	}
	
	public final String addSubmission_workflowtrigger_inputDueDate(Integer rowNum){
		return "//table[@name='datefield"+rowNum+"']//tr//td[2]//table//tr//td//input";
	}
	
	
	public final String addSubmission_workflowtrigger_selectTargetLangX(String targetLang){
		return "//div[contains(@name,'languageCombo') and not(contains(@style,'display: none'))]//li[text()='"+targetLang+"']";
	}
	
	public final String addSuubmission_workflowTrigger_language(String lang){
		return "//div[contains(@id,'legendTitle')][text()='"+ lang +"']";
	}
	
	public final String addSuubmission_workflowTrigger_language_input(String lang){
		return "//li[contains(@class,'x-superboxselect-item')]//span[contains(text(),'"+lang+"')]";
	}
	
	public final String addSubmission_selectFileFormatX(String fileFormat){
		return "//div[contains(@class,'x-combo-list-small')]//div[contains(text(),'"+fileFormat+"')]";
	}
	
	public final String addSubmission_FileFormat_Name(String fileFormat){
		return "//div[contains(@name,'uploadFilesGrid')]//table//tr//td//div[contains(text(),'"+fileFormat+"')]";
	}
	
	//In Add Submission,When we click on Triggers ,This selects TranslateFrom to TranslateInto locator
	public final String addSubmission_workflowTrigger_translateFrom_to_translateInto(String sourceLanguage,String targetLanguage){
		return "//fieldset[legend//div[text()='"+sourceLanguage+"']]/div//span[text()='"+targetLanguage+"']";
	}
	
	
	public final String addSubmission_AddBatchPerLanguage="//div[contains(@name,'batchGrid')]//span[text()='Add batch per language']";
	public final String addSubmission_NewBatchButton="//div[contains(@id,'batchgrid')]//a//span[contains(text(),'New Batch')]";//"//div[contains(@id,'submission')]//a//span[contains(text(),'New Batch')]";//"css=div[id*='submission'] a span:contains('New Batch')";//"css=div[id*='pdmanualsubmissiondialog'] button>span:contains('New Batch')";	
	public final String addSubmission_manualSubmissionAddFileButton = "//div[@class='x-panel x-panel-noborder x-form-label-left']//form[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder x-form']//table//tbody//tr[2]//td[2]//em//button[contains(text(),'Add')]";
	public final String addSubmission_manualSubmissionAddReferenceFileButton = "css=div[class= 'x-panel x-panel-noborder x-form-label-left'] button:contains('Add')";
	public final String addSubmission_manualSubmissionAddReference_inputLevel = "//input[@name='level']";
	public final String addSubmission_inputUploadSubmissionFile = "//input[@class='x-form-file']";
	public final String addSubmission_inputLastUploadSubmissionFile = "//div[contains(@id,'pduploadreferencesfiles')]//em/following-sibling::input[@type='file']";
	public final String addSubmission_manualSubmissionUploadSourceFileButton = "//div[starts-with(@id,'pdmanualsubmissiondialog') and contains(@class,'x-window-body-default')]//descendant::div[starts-with(@id,'pdlinepanel') and contains(@class,'x-column-inner')][3]/div[contains(@id,'button')]//button";//"css=div[class='x-panel x-panel-noborder x-form-label-left'] button:contains('Upload')";

	public final String addSubmission_uploadReferenceFiles_saveButton="//div[contains(@id,'pduploadreferencesfiles')]//span[contains(text(),'Save')]";

	public final String add_submission_uploadReferenceFiles_cancelButton="//div[contains(@id,'pduploadreferencesfiles')]//span[contains(text(),'Cancel')]";//div[contains(@id,'pduploadreferencesfiles')]/div[@class='x-toolbar x-docked x-toolbar-footer x-docked-bottom x-toolbar-docked-bottom x-toolbar-footer-docked-bottom x-box-layout-ct']//button/span[contains(text(),'Cancel')]";


	public final String addSubmission_uploadReferenceFiles_addToLevelLabel="//a//span[contains(text(),'Add to Level')]";//"//a//span[contains(text(),'Add To Level')]";


	public final String addSubmission_referenceFilesButton="//div[contains(@id,'Submission') or contains(@id,'submission')]//div[contains(@id,'toolbar')]//a//span[contains(text(),'Reference Files')]";

	public final String addSubmission_fileUpload_addToBatchButton="//span[text()='Add to Batch']"; //"//span[text()='Add To Batch']";
	public final String addSubmission_addToBatch_batchX(String batch)
	{

		return "//a//span[text()='"+batch+"']";

	}
	
	public final String add_editSubmission_batchGrid_Language(int i)
	{
		return "//div[contains(@id,'batchgrid')]//table["+i+"]/tbody//tr//td[last()]/div/div[contains(@class,'languageearth')]";//"//div[contains(@id,'batchgrid')]/div/table/tbody/tr["+i+"]/td[last()]/div/div[@class='languageearth']";
	}
	public final String add_editSubmission_batchGrid_verifyLanguageTooltip(int i, String language)
	{
		return "//div[contains(@id,'batchgrid')]//table["+i+"]/tbody//tr//td[last()]/div/div[contains(@class,'languageearth')][contains(@data-qtip,'"+language+"')]";//"//div[contains(@id,'batchgrid')]/div/table/tbody/tr["+i+"]/td[last()]/div/div[@class='languageearth'][contains(@data-qtip,'"+language+"')]";
	}
	public final String addSubmission_manualSubmissionUploadReferenceFileButton = "//div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder']//div[4]//button[contains(text(),'Upload')]";
	//public final String addSubmission_manualSubmissionInstructionAddremoveUploadReferenceFileButton="css=div>div>form>div:nth-child(2)>table>tbody>tr>td:nth-child(2)>table>tbody>tr>td>table>tbody>tr>td:nth-child(3)>table>tbody>tr:nth-child(2)>td:nth-child(2)>em button:contains('Upload')";
	public final String addSubmission_manualSubmissionInstructionAddremoveUploadReferenceFileButtonNew="//div[contains(@id,'ReferencePanel')]//a//span[contains(text(),'Remove')]";
	
	public final String addSubmission_saveSubmissionButton = "//div[contains(@id,'submission') or contains(@id,'Submission')]//span[text()='Save']";
	public final String addSubmission_saveSubmissionButton_disabled = "//div[contains(@id,'pdmanualsubmissiondialog')]/div[contains(@class,'x-toolbar-footer-docked-bottom')]/div/div/a[contains(@class,'x-btn-disabled')]//span[text()='Save']";//css=div[id*='submissiondialog'] div[id*='toolbar'] div[*class='x-btn-disabled'] button>span:contains('Save')";
	public final String addSubmission_cancelSubmissionButton = "//div[contains(@id,'submission')]//span[contains(text(),'Cancel')]";
	public final String addSubmission_cancelSubmissionButton_disabled="//div[contains(@id,'pdmanualsubmissiondialog')]/div[contains(@class,'x-toolbar-footer-docked-bottom')]/div/div/a[contains(@class,'x-btn-disabled')]//span[text()='Cancel']/following-sibling::span";
	public final String addSubmission_Previewsubmission_StartButton = "//div[contains(@id,'submission') or contains(@id,'Submission')]//span[text()='Start Submission']";
	public final String add_editSubmission_InVisibleStartSubmissionButton="//a[contains(@style,'display: none')]//span[text()='Start Submission']";
	public final String add_editSubmission_inVisibleAnalyzeButton="//a[contains(@style,'display: none')]//span[text()='Analyze']";
	public final String addSubmission_Previewsubmission_StartButton_disabled = "//div[contains(@id,'TemplateCreate')]//a[contains(@class,'x-item-disabled')]//span[contains(text(),'Start Submission')]";//"//div[contains(@id,'pdmanualsubmissiondialog')]/div[contains(@class,'x-toolbar-footer-docked-bottom')]/div/div/a[contains(@class,'x-btn-disabled')]//span[text()='Start Submission']";
	public final String addSubmission_Previewsubmission_SaveButton="//div[contains(@id,'batchpreview')]//span[text()='Save']";//"//div[contains(@id,'batchpreview')]//span[text()='Save']/following-sibling::span";//div[contains(@class,'x-toolbar-footer-docked-bottom')]//span[text()='Save']";
	public final String addSubmission_previewSubmission_addFilesButton="//span[text()='Add Files']/..";
	public final String addSubmission_previewSubmission_moveToBatchButton="//span[text()='Move to Batch']/..";
	public final String addSubmission_previewSubmission_removeButton="//div[contains(@id,'preview')]//span[text()='Remove']/..";
	
	public final String addSubmission_Previewsubmission_AnalyzeButton="//div[contains(@id,'submission') or contains(@id,'Submission')]//span[text()='Analyze']";
	public final String addSubmission_Previewsubmission_AnalyzeButton_disabled = "//div[contains(@id,'toolbar')]//a[contains(@class,'item-disabled')][not(contains(@style,'display: none;'))]//span[contains(text(),'Analyze')]";//"//div[contains(@id,'TemplateCreate')]//div[contains(@id,'toolbar')]//a[contains(@class,'item-disabled')][not(contains(@style,'display: none;'))]//span[contains(text(),'Analyze')]";//"//div[contains(@id,'submissiondialog')]//div[contains(@id,'toolbar')]//a[contains(@class,'item-disabled')][not(contains(@style,'display: none;'))]//span[contains(text(),'Analyze')]";//"//div[contains(@id,'TemplateCreate')]//a[contains(@class,'x-item-disabled')]//span[contains(text(),'Analyze')]";//"//div[contains(@id,'submissiondialog')]//div/a[contains(@class,'x-btn-disabled')]//span[text()='Analyze']";//"//div[contains(@id,'pdmanualsubmissiondialog')]/div[contains(@class,'x-toolbar-footer-docked-bottom')]/div/div/a[contains(@class,'x-btn-disabled')]//span[text()='Analyze']";//div[contains(@id,'pdmanualsubmissiondialog')]/div[contains(@class,'x-toolbar-footer-docked-bottom')]/div/div/div[contains(@class,'x-btn-disabled')]/em/button/span[text()='Analyze']";
	public final String addSubmission_Previewsubmission_BatchInputDueDate_firstBatch = "//input[contains(@name,'batchDueDate')]";
	public final String addSubmission_Previewsubmission_BatchInputDueDate_secondBatch = "//div[contains(@name,'Batch2')]//div[contains(@name,'batchDueDate')]//input[contains(@name,'batchDueDate')]";//"//div[contains(@id,'batchpreviewdialog')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'display: none'))]//table[contains(@name,'batchDueDate')]//input[contains(@name,'batchDueDate')]";
	public final String addSubmission_Previewsubmission_PhaseDueDateImg = "//table[@name='dueDate']//div[contains(@class,'x-form-trigger')]";	
	
	//batch due date calendar button
	public final String addSubmission_Previewsubmission_calendar ="//div[contains(@name,'batchDueDate')]//div[contains(@class,'date-trigger')]";//"//table[contains(@name,'batchDueDate')]//div[contains(@class,'date-trigger')]";
	
	
	public final String addSubmission_previewSubmission_transCalender="//div//span[contains(text(),'Translation:')]/../following-sibling::div//div[contains(@class,'date-trigger')]";//"//div[label[contains(text(),'Translation:')]]//div[contains(@class,'date-trigger')]";//"//td[label[contains(text(),'Translation:')]]/following-sibling::td//div[contains(@class,'date-trigger')]";
	public final String addSubmission_previewSubmission_proofCalender="//div//span[contains(text(),'Proof')]/../following-sibling::div//div[contains(@class,'date-trigger')]";//"//div[label[contains(text(),'Proof:')]]//div[contains(@class,'date-trigger')]";//"//td[label[contains(text(),'Proof')]]/following-sibling::td//table//td/div[contains(@class,'x-form-date-trigger')]";
	public final String addSubmission_PreviewSubmission_calendarSelectMonthandYear = "//div[contains(@class,'x-datepicker-default ')][contains(@aria-hidden,'false')]//a[contains(@data-qtip,'Choose a month')]";//"//div[contains(@class,'x-datepicker x-layer x-datepicker-default x-unselectable x-border-box')]//a[contains(@data-qtip,'Choose a month')]";// "//div[contains(@class,'x-datepicker x-layer x-datepicker-default x-unselectable x-border-box') and not(contains(@style,'display: none'))]//span[contains(@class,'x-btn-icon')]";
	public final String addSubmission_Previewsubmission_editPhaseDueDate_firstLanguage_firstPhase = "//div//span[contains(text(),'Translation')]/../following-sibling::div//input";//"//div[label[contains(text(),'Translation:')]]//div//input";//"//td[label[contains(text(),'Translation')]]/following-sibling::td/table//td/input";
	public final String addSubmission_Previewsubmission_edirPhaseDueDate_firstLanguage_secondPhase = "//div//span[contains(text(),'Proof')]/../following-sibling::div//input";//"//div[label[contains(text(),'Proof:')]]//div//input";//"//td[label[contains(text(),'Proof')]]/following-sibling::td/table//td/input";
	public final String addSubmission_Previewsubmission_editPhaseDueDate_secondLanguage_firstPhase = "css=div:nth-child(2)>div>form>div:nth-child(3)>div>div>div>div>div:nth-child(2)>div>div>table>tbody>tr>td:nth-child(2)>div";
	public final String addSubmission_Previewsubmission_editBatchDueDate_noButton = "//div[contains(@id,'warningdialog')]//span[text()='No']";
	public final String addSubmission_Previewsubmission_editPhaseDueDate_noButton = "//div[contains(@id,'warningdialog')]//span[text()='No']";
	public final String	calendarTodayButton = "//div[contains(@class,'datepicker')]//span[text()='Today']";//"//div[contains(@class,'x-datepicker-default')and not(contains(@style,'display: none'))]//div[contains(@class,'footer')]//span[text()='Today']/following-sibling::span";
	public final String addSubmission_Previewsubmission_editBatchDueDate_yesButton = "//div[contains(@id,'warning')]//span[contains(text(),'Yes')]";//"css=div[id*='warning'] span:contains('Yes')";
	public final String addSubmission_Previewsubmission_editPhaseDueDate_yesButton = "//div[contains(@id,'warning')]//span[contains(text(),'Yes')]";//"//div[contains(@id,'warning')]//span[contains(text(),'Yes')]/following-sibling::span";//"css=div[id*='warning'] span:contains('Yes')";
	public final String addSubmission_Previewsubmission_refresh = "//div[contains(@id,'batchpreviewdialog')]//div[@name='leverageGrid']//span[text()='Refresh']";
	public final String addSubmission_Previewsubmission_submissionDueDate ="//div[contains(@id,'submissiondialog')]//div[contains(@name,'dueDate')]//input[contains(@name,'dueDate')]";//"//div[contains(@id,'submissiondialog')]//table[contains(@name,'dueDate')]//input[contains(@name,'dueDate')]";//"css=div[id*='submissiondialog'] table[name='dueDate'] input[name='dueDate']";
	public final String addSubmission_previewSubmission_applyPhaseDeadlinesToAllLang="//div[contains(@id,'batchpreviewdialog')]//span[text()='Apply Phase Deadlines To All Languages']";//"//div[contains(@id,'batchpreviewdialog')]//span[text()='Apply Phase Deadlines To All Languages']/following-sibling::span";
	public final String addSubmission_previewSubmission_targetLanguageSelectButton="//div[contains(@id,'batchpreview')]//div[contains(@name,'targetLanguageCombo')]//div[contains(@class,'arrow-trigger')]";//"//div[contains(@id,'batchpreview')]//table[contains(@name,'targetLanguageCombo')]//td/div[contains(@class,'arrow-trigger')]";
	public final String add_editSubmission_previewBatch_translationMemoriesButton="//div[contains(@id,'batchpreviewdialog')]//span[text()='Translation Memories']";//"//div[contains(@id,'batchpreviewdialog')]//span[text()='Translation Memories']/following-sibling::span";
	public final String add_editSubmission_tmAssign_tmFirstRow="//td/div/div[contains(@class,'pd-submissiondialogs-manual-TmsAssigningDialog')]";
	public final String add_editSubmission_tmAssign_selectTMButton="//div[contains(@id,'tmsassigning')]//td/div[contains(@class,'x-form-trigger')]";
	public final String add_editSubmission_tmAssign_inputTM="//div[contains(@id,'tmsassigning')]//td/input";
	public final String add_editSubmission_tmAssign_defaultTM_Green="//td/div/div[contains(@class,'pd-submissiondialogs-manual-TmsAssigningDialog-divGreen')]";
	public final String add_editsubmission_previewSubmission_selectBatchX(String batch)
	{
		return "//div[contains(@id,'batchpreview')]//a/span/span/span[text()='"+batch+"']";
	}
	public final String addSubmission_previewSubmission_selectTargetLanguageX(String language)
	{
		return "//div[contains(@name,'targetLanguage')]//li[text()='"+language+"']";//"//div[contains(@name,'targetLanguage')]//li[text()='"+language+"']";
	}
	public final String addSubmission_previewSubmission_selectTargetLanguagePD5X(String language)
	{
		return "//div[contains(@name,'boundlist')]//div[contains(text(),'"+language+"')]";//"//div[contains(@name,'targetLanguage')]//li[text()='"+language+"']";
	}
	public final String addSubmission_previewsubmissiom_Headercheck="//div[contains(@name,'leverageGrid')]//div[contains(@class,'x-column-header-text')]";

	
	public final String addEditSubmission_batchPreview_clearLanguageX(String language)
	{
		return "//div[contains(@id,'batchpreview')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'display: none'))]//span[text()='"+language+"']/following-sibling::a";
	}
	public final String addSubmission_manualSubmissionPostUploadFileElementX(String fileName){
		return "css=a[class='x-tree-node-anchor']>span:contains('"+fileName+"')";
	}
	
	public final String addSubmission_selectListItemX(String itemName){
		return "//div[contains(@name,'projectCombo-boundlist')]//li[contains(@class,'x-boundlist-item') and contains(text(),'"+itemName+"')]";
	}
	
	public final String addSubmission_selectListTranslateFromItemX(String itemName){
		return "//div[@name='sourceCombo-boundlist']//li[contains(@class,'x-boundlist-item') and contains(text(),'"+itemName+"')]";
	}
	
	public final String addSubmission_manualSubmissionUploadFileDetailsX(String fileName,String fileFormat)
	{		
		return "//div[contains(@id,'pduploadfilesgrid')]//table//tr/td[div[text()='"+fileName+"']]/following-sibling::td/div[text()='"+fileFormat+"']";
	}
	
	
	public final String addSubmission_manualSubmissionSourceUploadFileElementWithinBatchX(String batchName, String itemName){

		return "//div[contains(@id,'treepanel')]//table//span[contains(text(),'"+batchName+"')]/../../../../../following-sibling::table//span[contains(text(),'"+itemName+"')]";//"//table[contains(@class,'x-treeview')]//tr[td//span[contains(text(),'"+batchName+"')]]/following-sibling::tr[td//span[contains(text(),'"+itemName+"')]]";////ul[@class='x-tree-root-ct x-tree-lines']/div/li/div/a/span[contains(text(),'"+batchName+"')]/../../../ul/li/div/a/span[contains(text(),'"+itemName+"')]";////ul[@class='x-tree-root-ct x-tree-lines']/div/li/div/a/span[contains(text(),'"+batchName+"')]/../../../ul/li/div/a/span[contains(text(),'"+itemName+"')]";

	}
	public final String addSubmission_batchpreviewSubmission_selectTargetLanguageX(String language)
	{
		return "//div[contains(@name,'targetLanguage')]//div[text()='"+language+"']";
	}
	
//upload reference file window
	public final String addSubmission_manualSubmissionUploadedReferenceFile_ReferencesX(String name)
	{
		return "//div[contains(@id,'treepanel')]//table//span[contains(text(),'"+name+"')]";
		//return "//table[contains(@class,'x-treeview')]//tr[td//span[contains(text(),'"+name+"')]]";	
	}
//	Download icon of language in reference file window
	public final String addSubmission_manualSubmission_UploadReferenceFile_DownloadFile(String fileName)
	{
		return "//div[contains(@id,'Reference')]//table//div[contains(text(),'"+fileName+"')]/../..//following-sibling::td//div[contains(@class,'download')]";
		//return"//div[contains(@id,'ReferenceGrid')]//table//div[contains(text(),'"+fileName+"')]/../..//following-sibling::td//div[contains(@class,'download')]";
		//return "//div[contains(@id,'uploadreferencesfile')]//table//span[contains(text(),'"+fileName+"')]/../..//following-sibling::td//div[contains(@class,'download')]";//"//div[contains(@id,'ReferenceGrid')]//table//div[contains(text(),'"+fileName+"')]/../..//td//div[contains(@class,'download')]";
	//	return "//div[contains(@id,'uploadreferencesfiles')]//table//span[contains(text(),'"+fileName+"')]/../../following-sibling::td//div[contains(@class,'download')]";//"//td[div[text()='"+fileName+"']]/following-sibling::td[div//div[contains(@class,'download')]]";//tbody//tr[td//span[text()='"+fileName+"']]/td[contains(@class,'x-grid-cell-last')]//img";	
		
	}
//Reference file downloaded files button
	public final String addSubmission_manualSubmission_referenceFiles_downloadFilesButton  ="//span[text()='Download Files']";
	
			
	public final String addSubmission_manualSubmissionUploadedReferenceFileCancelButton="//div[contains(@id,'pduploadreferencesfiles')]//div[contains(@id,'toolbar')]//span[contains(text(),'Cancel')]";//"//div[contains(@id,'pduploadreferencesfiles')]//div[contains(@id,'toolbar')]//span[contains(text(),'Cancel')]/following-sibling::span";
	public final String addSubmission_manualSubmissionUploadedReferenceFileDeleteButton="//div[contains(@id,'toolbar')]//a//span[text()='Delete']";//"//div[contains(@id,'toolbar')]//a//span[text()='Delete']/following-sibling::span";//"css=div[id*='pduploadreferencesfiles'] button>span:contains('Delete')";
	public final String addSubmission_manualSubmissionUploadedReferenceFileWarningSaveButton="//div[contains(@id,'warningdialog')]//span[contains(text(),'Save')]";//"//div[contains(@id,'warningdialog')]//span[contains(text(),'Save')]/following-sibling::span";//"css=div[id*='warningdialog'] span:contains('Save')";//"css=div[id*='gs4trwarningmessage'] button>span:contains('Save')";
	public final String addSubmission_manualSubmissionSelectUploadedReferenceFile(String file){
		return "//table[contains(@id,'treeview')]//tr[td//span[contains(text(),'"+file+"')]]";//"//table[contains(@class,'x-treeview')]//tr[td//span[contains(text(),'"+file+"')]]";
	}
	
	public final String addSubmission_discardReferenceFiles_cancelButton = "//div[contains(@id,'warning')]//span[text()='Cancel']/..";//div[contains(@id,'gs4trwarningmessage')]//span[text()='Cancel']/..";
	public final String addSubmission_discardReferenceFiles_discardButton = "//div[contains(@id,'warning')]//span[text()='Discard']/..";//div[contains(@id,'gs4trwarningmessage')]//span[text()='Discard']/..";
	public final String addSubmission_discardReferenceFiles_saveButton = "//div[contains(@id,'warning')]//span[text()='Save']/..";//div[contains(@id,'gs4trwarningmessage')]//span[text()='Save']/..";
	
//Step 5 - Custom Attributes	
	
	public final String add_editSubmission_verifyMandatoryCustomAttributeX(String attributeName)
	{
		return "//label[contains(text(),'"+attributeName+":')]/span[contains(text(),'*')]";
	}
	public final String add_editSubmission_customAttributes_customTextInputX (String itemName){
		return "//input[@name='"+itemName+"']";
	}
	
	
	public final String add_editSubmission_customAttributes_customTextInput (String attributeName){
		//return "";//"//table[contains(@name,'custom')]//td[//label[text()='"+attributeName+"']]/following-sibling::td//input[contains(@name,'custom')]";
		return "//input[contains(@name,'"+attributeName+"')]";
	}
	
	public final String add_editSubmission_customAttributes = "//span[text()='Custom Attributes']/..";
	public final String add_editSubmission_customAttributes_OKbutton = "//div[contains(@id,'pdcustomfieldsdialog')]//span[text()='OK']";//"//div[contains(@id,'pdcustomfieldsdialog')]//span[text()='OK']/following-sibling::span";
	public final String addSubmission_customAttributes_selectCombo = "//div[contains(@id,'CustomFields') or contains(@id,'customfields')]//div[contains(@class,'x-form-arrow-trigger')]";
	
	public final String add_editSubmission_customAttributes_selectComboX(String name){
		return "//li[contains(@class,'x-boundlist-item')]//div[text()='"+name+"']";
	}
	
	public final String editSubmission_customAttributes_customComboInput (String itemName){
		return "//input[@name='"+itemName+"']";
	}
	
	public final String editSubmission_uploadFilesDialog_AddButton ="//div[contains(@id,'pduploadfilesdialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Add')]/following-sibling::span";
	
//Analyze Submission
	public final String analyzeSubmissionButton = "//span[contains(@id,'analyze_submission_action')]//span[contains(text(),'Analyze Submission')]";//"//span[contains(@id,'analyze_submission_action')]//span[contains(text(),'Analyze Submission')]/following-sibling::span";//"css=span[id*='pd_analyze_submission_action'] span:contains('Analyze Submission')";//css=em[id*='pd_analyze_submission_action']>button>span:nth-child(2);
	
	
//Start Submission
	//This locator is for start submission button available on general client menu, not through edit submission
	public final String startSubmissionButton = "//span[contains(@id,'start_submission_action')]//span[text()='Start Submission']";//"//span[contains(@id,'start_submission_action')]//span[text()='Start Submission']/following-sibling::span";
	public final String startSubmission_confirmYesButton = "//div[contains(@id,'warningdialog')]//span[contains(text(),'Yes')]";//"//div[contains(@id,'warningdialog')]//span[contains(text(),'Yes')]/following-sibling::span";//"css=div[id*='warningdialog'] span:contains('Yes')";//"css=div[id*='gs4trwarningmessage'] div[id*='toolbar'] button>span:contains('Yes')";
	public final String add_editSubmission_CancelButton="//div[contains(@id,'SubmissionManualTemplate')]//span[contains(text(),'Cancel')]";//"//div[contains(@id,'submission')]//span[text()='Cancel']/following-sibling::span";
//Cancel Submission
	public final String cancelSubmissionButton = "//span[contains(@id,'cancel_action')]//span[contains(text(),'Cancel')]";//"//div[contains(@id,'submission') or contains(@id,'Submission')]//span[text()='Cancel']";
	public final String editSubmissionDialog_cancelSubmissionButton = "//div[contains(@id,'editsubmission')]//div[contains(@id,'toolbar')]//span[text()='Cancel Submission']";
	public final String cancelSubmissionConfirmButton = "//span[contains(text(),'Cancel Selected Items')]";//div[contains(@id,'cancelsubmissionbytargetdialog')]//a//span[contains(text(),'OK')]/following-sibling::span";
	public final String cancelSubmissionInputUserComment_tab ="//span[contains(text(),'Comments')]";
	public final String cancelSubmissionInputUserComment_textarea ="//div[contains(@qaname,'commentsEditor')]//div[contains(@name,'emptyText')]";
	public final String cancelSubmission_iframe_inputcomment = "//div[contains(@id,'TabPanel')]//div[contains(@qaname,'commentsEditor')]//iframe";
	public final String cancelSubmission_inputcomment = "//html//body";
	public final String cancelSubmission_warning_yesButton = "//div[contains(@id,'warning')]//span[contains(text(),'Yes')]";//"//div[contains(@id,'warning')]//div[contains(@id,'toolbar')]//span[text()='Yes']/following-sibling::span";
	public final String cancelSubmission_batch_cancelBatchX(String batch)
	{
		return "//div[contains(@id,'CancelBatchFile')]//table//td[//div[contains(text(),'"+batch+"')]]/../..//div[contains(@class,'x-grid-checkcolumn')]";
		//return "//div[contains(@id,'cancelsubmission')]//table[contains(@id,'superboxselect')]//li//span[contains(text(),'"+batch+"')]/following-sibling::a";
	}
	
//Quick Quote 	
	public final String quickQuoteButton = "//span[contains(@id,'quick_quote')]";//button/span[contains(text(),'Quick')]";
	public final String quickQuote_priceForVendorX(String vendor, String price)
	{
		return "//div[contains(@id,'quickquote')]//tr/td[div/span[text()='"+vendor+"']]/following-sibling::td/div[text()='"+price+"']";
	}
	public final String quickQuote_plusButtonX="//div[contains(@id,'quickquote')]//tr[not(contains(@class,'expanded'))]//img[contains(@class,'plus')]";// common for all
	public final String quickQuote_quantityForNameX(String name)
	{
		return "//div[contains(@id,'quickquote')]//tr[td//span[text()='"+name+"']]/td[2]/div";
	}
	
	public final String quickQuote_unitForNameX(String name)
	{
		return "//div[contains(@id,'quickquote')]//tr[td//span[text()='"+name+"']]/td[3]/div";
	}
	
	public final String quickQuote_pricePerUnitForNameX(String name)
	{
		return "//div[contains(@id,'quickquote')]//tr[td//span[text()='"+name+"']]/td[4]/div";
	}
	
	public final String quickQuote_priceForNameX(String name)
	{
		return "//div[contains(@id,'quickquote')]//tr[td//span[text()='"+name+"']]/td[5]/div";
	}
	
	public final String quickQuote_closeButton="//div[contains(@id,'quickquote')]//span[text()='Close']";
	
//Download Deliverable
	public final String downloadDeliverable_okButton = "//div[contains(@id,'SubmissionDownloadDeliverable')]//span[text()='OK']";//"//div[contains(@id,'pddownloaddeliverabledialog')]//span[text()='OK']/following-sibling::span";
	public final String downloadDeliverable_batch_tr = "//div[contains(@id,'pddownloaddeliverabledialog')]//tr[starts-with(@class,'x-grid-row')]";
	public final String downloadDeliverable_batchCheck_rowX(int row) 
	{
		return "//div[contains(@id,'pddownloaddeliverabledialog')]//tbody/tr["+row+"]//tbody//div[@class='x-grid-row-checker']";
	}
	
//Edit Submission
	public final String editSubmissionButton = "//span[contains(@id,'edit_submission')]//span[contains(text(),'Edit')]";//"//span[contains(@id,'edit_submission')]//span[text()='Edit Submission']/following-sibling::span";
	public final String editSubmission_window = "//div[starts-with(@id,'pdeditsubmissiondialog') and contains(@class,'x-window-default')]//div[contains(text(),'Edit Submission')]";//"//div[starts-with(@id,'pdeditsubmissiondialog') and contains(@class,'x-window-default')]//span[contains(text(),'Edit Submission')]";
	public final String editSubmissionCloseButton = "css=button:contains('Close')";
	public final String editSubmission_Name = "//div[contains(@id,'editsubmission')]//input[@name='submissionName']";//css=div[class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable'] table[name='submissionName'] td>input";
	public final String editSubmission_DueDate = "//input[contains(@name,'dueDate')]";//"css=input[name='dueDate']";

	public final String editSubmission_SaveButton = "//div[contains(@id,'editsubmissiondialog')]//a//span[contains(text(),'Save')]";//"//div[contains(@id,'TemplateEdit')]//span[contains(text(),'Save')]";//"//div[contains(@id,'submissiondialog')]//span[contains(text(),'Save')]";//"//div[contains(@id,'submissiondialog')]//span[contains(text(),'Save')]/following-sibling::span";//"css=div[id*='submissiondialog'] span:contains('Save')";//css=div[id*='pdeditsubmissiondialog'] div[id*='toolbar'] button>span:contains('Save')";

	public final String editSubmission_CustomAttributes="//span[contains(text(),'Custom Attributes')]";//span[contains(text(),'Custom Attributes')]/following-sibling::span";
	public final String editSubmissionReferenceFilesButton="//div[contains(@id,'toolbar')]//span[text()='Reference Files']";//"//div[contains(@id,'editsubmission')]//div[contains(@id,'toolbar')]//span[text()='Reference Files']";
	public final String editSubmission_inputSubmissionName = "//div[contains(@id,'editsubmission')]//input[contains(@name,'submissionName') or contains(@name,'submissionname')]";
	public final String editSubmission_addRemoveFilesDisabled = "//table[contains(@class,'x-item-disabled')]//button[@class=' x-btn-text'][contains(text(),'Add/Remove files')]"; 
	public final String add_editSubmission_workflowComboImg = "//div[contains(@name,'workflowCombo')]//div[contains(@class,'arrow-trigger')]";
	public final String editSubmission_editInstructionButton ="//a//span[contains(text(),'Edit Instructions/Background')]";//"//a//span[contains(text(),'Edit Instructions/Background')]/following-sibling::span";
	public final String editSubmissions_iframe_inputInstructions_backgr ="//label[contains(@id,'htmleditor')][span[contains(text(),'Submission Background')]]//following-sibling::div//iframe";//"//div[contains(@id,'htmleditor')][label[text()='Submission background']]/following-sibling::div//div//iframe";
	public final String editSubmissions_iframe_inputInstructions_instr ="//label[contains(@id,'htmleditor')][span[contains(text(),'Submission Instructions')]]//following-sibling::div//iframe";//"//label[contains(@id,'htmleditor')][span[contains(text(),'Submission Instructions')]]//following-sibling::div//iframe";//"//div[contains(@id,'htmleditor')][label[text()='Submission instructions']]/following-sibling::div//div//iframe";
	public final String editSubmission_editInstruction_saveButton ="//div[contains(@id,'pdeditinstructionswindow')]//span[text()='Save']";//"//div[contains(@id,'pdeditinstructionswindow')]//span[text()='Save']/following-sibling::span";
	public final String editSubmission_submissionStatisticLable ="//div[starts-with(@id,'pdstatisticspanel') and contains(@class,'x-panel-default') and not(contains(@style,'display: none;'))]//label[child::b[text()='Submission Statistics']]";
	public final String editSubmission_projectBackgroundLable ="//span[text()='Project Background']";//"//span[text()='Project Background']/following-sibling::span";//table[@qaname='backgroundInstructions']//label[text()='Project Background']";
	public final String editSubmission_specialInstructionsLable ="//span[text()='Special Instructions']";//"//span[text()='Special Instructions']/following-sibling::span";//table[@qaname='specialInstructions']//label[text()='Special Instructions']";
	public final String editSubmissionTemplate_NewBatchButton=  "//div[@name='batchGrid']//span[text()='New Batch']";	
	public final String editSubmission_editInstructions_backgroundInput="//html/body";
	public final String editSubmission_editInstructions_instructionsInput="//html//body";
	public final String editSubmission_batchPreview_verifyCanceledFileX(String fileName)
	{
		return"//div[contains(@name,'leverageGrid')]//div[contains(@id,'pdstatisticsgrid')]//table//td[contains(@class,'crossedout ')]//div[contains(text(),'"+fileName+"')]";
		//return "//div[contains(@id,'leveragestatistics')]//table[contains(@id,'gridview')]//tr//td[contains(@class,'crossedout')]//div[contains(text(),'"+fileName+"')]";
	}	
	
	public final String editSubmissionTextbox_Disabledx(String name)
	{
		return "//input[(@name='"+name+"') and (@disabled='')]";
	}
	public final String editSubmission_batchPreview_totalBatchStatistics_verifyTotalInBold(String total)
	{
		return"//div[contains(@name,'leverageGrid')]//table//td[8]//div[contains(text(),'"+total+"')]";
		//return "//td[div/span[contains(text(),'Total Batch Statistics')]]/following-sibling::td[contains(@class,'last')]//span[contains(text(),'"+(total)+"')]";
	}
	public final String referenceFileDialog="//div[text()='Upload Reference Files']";//"//span[text()='Upload Reference Files']";
	
	public final String editSubmissionTemplate_linkBatch_batchX(String nameBatch)
	{
		return "//div[@name='batchGrid']//a[text()='"+nameBatch+"']";
	}
	public final String editSubmissionTemplate_selectRowBatch_batchX(String nameBatch)
	{
		return "//div[@name='batchGrid']//a[text()='"+nameBatch+"']//ancestor::tr";
	}
	
	public final String add_editSubmission_referenceFiles_fileAtLevelX(String file, String level)
	{
		return "//div[contains(@id,'uploadreferencesfiles')]//table//span[contains(text(),'"+level+"')]/../../../../../following-sibling::table//span[contains(text(),'"+file+"')]";//"//tbody[tr//span[text()='"+level+"']]/tr//span[text()='"+file+"']";
	}
	public final String add_editSubmission_referenceFiles_allCheckbox= "//div[contains(@id,'uploadreferencesfiles')]//table//span[contains(text(),'All')]/..//div[contains(@class,'x-tree-checkbox-checked')]";
	
	public final String add_editSubmission_referenceFiles_allCheckbox_Cheked="//div[contains(@id,'uploadreferencesfiles')]//table//span[contains(text(),'All')]/..//div[contains(@class,'x-tree-checkbox-checked')]";

	
	public final String editSubmission_PreviewSubmission_calendarSelectMonthandYear =  "//div[@class='x-datepicker x-layer x-datepicker-default x-unselectable'][not(contains(@style,'display: none'))]//em";	
		
	public String addSubmission_selectLevelReferenceFile="css=table[class='x-toolbar-ct']>tbody>tr>td>table>tbody>tr>td:nth-child(6)>div>img";
		
	public final String selectReferenceLevelX(String text){
		return "//a//span[contains(@class,'x-menu-item-text')][contains(text(),'"+text+"')]";
	}
	public final String editSubmission_selectRow_batchX(String nameBatch)		
	{	
		return "//div[starts-with(@id,'pdbatchgrid')]//tr[contains(@class,'x-grid-row')][child::td//a[text()='"+nameBatch+"']]";
	}	

	public final String superboxTranslateTo = "//span[text()='Translate To:']";//"//label[text()='Translate To:']"; //label[starts-with(@id,'superboxselect')];
	public final String clearTranslateTo = "//div[@name='targetCombo']//div[contains(@class,'ClearAll')]";
	public final String chooseTranslateTo = "//div[@name='targetCombo']//div[contains(@class,'triggerExpand')]";
	public final String warningbatchtargetlanguage_closebutton = "//div[contains(@id,'warning')]//span[text()='Close']";
	public final String clearTranslateToLanguageX(String language)
	{
		return "//div[text()='"+language+"']/following-sibling::div";//"//span[text()='"+language+"']/following-sibling::a";
	}
	
	public final String selectTranslateToItemX(String text){			
	//	return "//div[contains(@name,'targetCombo-boundlist')]//div[text()='"+text+"']";//"//div[contains(@name,'targetCombo-boundlist')]//li[text()='"+text+"']";
		return "//div[contains(@name,'targetCombo-boundlist')]//div[text()='"+text+"']";
	}
	public final String addSubmission_manualSubmissionSelectWokflowButton="//div[contains(@name,'workflowCombo')]//div[contains(@class,'arrow-trigger')]";//"//table[contains(@name,'workflowCombo')]//table//td[2]/div";//"css=table[name='workflowCombo'] table td:nth-child(2)>div";
		public final String addSubmission_manualSubmissionVerifyWokflowPresent(String workflowName)
		{
			return "//div[contains(@id,'manualsubmissiondialog')]//div[contains(@name,'batchGrid')]//table//td[2]//span[text()='"+workflowName+"']";//"//div[contains(@id,'manualsubmissiondialog')]//div[contains(@id,'gridview')]/table//td[2]//span[text()='"+workflowName+"']";//"css=div[id*='pdmanualsubmissiondialog'] div[id*='gridview']>table tr:nth-child(1)>td:nth-child(2):contains('"+workflowName+"')";
		}
		public final String selectTranslateFromItemX(String text)
		{
			return "//div[contains(@name,'sourceCombo')]//li[text()='"+text+"']";//"//div[contains(@name,'sourceCombo-boundlist')]//li[text()='"+text+"']";
			
		}
		public final String inputTranslateFrom="//input[@name='sourceCombo']";
		public final String translateToItemX(String text){
			return "//div[contains(@name,'targetCombo')]//li//div[text()='"+text+"']";
		}
		public final String translateToitemX_verifyTmIsAttached(String text)
		{
			return "//table[contains(@name,'targetCombo')]//li[contains(@class,'highlighted')]//span[text()='"+text+"']";
		}
		public final String previewSubmission_translateTOItemX(String language)
		{
			return "//div[contains(@name,'targetLanguageSuper')]//li/div[text()='"+language+"']";//"//table[contains(@name,'targetLanguageSuper')]//li/span[text()='"+language+"']";//"css=table[name*='targetLanguageSuper'] li>span:contains('German (Germany)')";
		}
		public String addSubmission_Previewsubmission_selectClaimLevelX(String batchName) {
			return "css=div[name='claimScope']>div:contains('"+batchName+"')";
		}

		public final String editSubmission_selectClaimLevelX(String claim){
			return "css=div[name='claimLevelCombo-boundlist'] li:contains('"+claim+"')";
		}
		
		public final String editSubmission_selectWorkflowX(String workflow){
			return "//div[@name='workflowCombo-boundlist']//li[text()='"+workflow+"']";
		}

//Select Vendors screen
		public final String selectVendors_languageTabX(String language){
			return "//div[contains(@id,'VendorSelectClient')]//div[contains(@id,'tabbar')]//span[a[contains(text(),'"+language+"')] or span[contains(text(),'"+language+"')]]";//"//div[contains(@id,'pdsubmissionvendorstabpanel')]//div[contains(@id,'tabbar')]//span[a[contains(text(),'"+language+"')] or span[contains(text(),'"+language+"')]]";//div[contains(@id,'pdsubmissionvendorstabpanel')]//div[contains(@id,'tabbar')][contains(@style,'position: absolute')]//label[contains(text(),'"+language+"')]";
		}
		
		public final String selectVendors_languageTabX_colorX(String language, String color){
			return "//div[contains(@id,'pdsubmissionvendorstabpanel')]//div[contains(@id,'tabbar')][contains(@style,'position: absolute')]//label[contains(text(),'"+language+"')][contains(@style,'"+color+"')]";
		}
		
		public final String selectVendors_languageTabX_colorX_chrome(String language, String color){
			//note: now there is no color in style attribute
			
			return "//div[contains(@id,'VendorSelectClient')]//div[contains(@id,'tabbar')]//a[contains(text(),'"+language+"')]";//"//div[contains(@id,'pdsubmissionvendorstabpanel')]//div[contains(@id,'tabbar')]//a[contains(text(),'"+language+"')]";//div[contains(@id,'pdsubmissionvendorstabpanel')]//div[contains(@id,'tabbar')]//span[contains(text(),'"+language+"')][contains(@style,'"+color+"')]";//div[contains(@id,'pdsubmissionvendorstabpanel')]//div[contains(@id,'tabbar')][contains(@style,'position: absolute')]//label[contains(text(),'"+language+"')][contains(@style,'"+color+"')]";
		}
		
		public final String selectVendors_availableVendors_vendorX(String vendor){
			return "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][@aria-hidden='false'][not(contains(@style,'none'))]//div[contains(@name,'available')]//table//tr/td/div[text()='"+vendor+"']";
			//return "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'available')]//table//tr/td/div[text()='"+vendor+"']";//div[contains(@id,'pdassignedvendorspanel')][contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'display: none'))]//div[@name='availableVendorsGrid']//table//tr/td/div[text()='"+vendor+"']";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][@class='x-panel x-tabpanel-child x-panel-default']//div[1][@class='x-panel x-column x-panel-default']//div[contains(@id,'gridview')]/table//tr/td/div[text()='"+vendor+"']";
		}
		
		public final String selectVendors_availableVendors_rowX_vendorX(int row, String vendor){
			return "//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//div[contains(@id,'gridview')]/table//tr["+(row+1)+"]/td[div[text()='"+vendor+"']]/following-sibling::td/div/div";
		}
		
		public final String selectVendors_selectedVendors_vendorX(String vendor){
			return "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@class,'hidden-offsets'))]//div[contains(@name,'selected')]//table//tr/td/div[text()='"+vendor+"']"; 
			//"//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'selected')]//table//tr/td/div[text()='"+vendor+"']";//div[contains(@id,'pdassignedvendorspanel')][contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'display: none'))]//div[@name='assignVendorsGrid']//table//tr/td/div[text()='"+vendor+"']";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][@class='x-panel x-tabpanel-child x-panel-default']//div[3][@class='x-panel x-column x-panel-default']//div[contains(@id,'gridview')]/table//tr/td/div[text()='"+vendor+"']";
		}
		
		public final String selectVendors_selectedVendors_vendorX(String vendor,String role){
			return "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'selected')]//table//tr/td[div[text()='"+vendor+"']]/following-sibling::td[1]/div/span[text()='"+role+"']";//div[contains(@id,'pdassignedvendorspanel')][contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'display: none'))]//div[@name='assignVendorsGrid']//table//tr[td/div[text()='"+vendor+"']]/td/div/span[contains(text(),'"+role+"')]";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][@class='x-panel x-tabpanel-child x-panel-default']//div[3][@class='x-panel x-column x-panel-default']//div[contains(@id,'gridview')]/table//tr/td/div[text()='"+vendor+"']";
		}
		public final String selectVendors_selectedVendors_vendorX_clientVendors(String vendor){
			return"//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][@aria-hidden='false'][not(contains(@style,'none'))]//div[contains(@name,'selected')]//table//tr/td[div[text()='"+vendor+"']]/../td[4]//div[contains(@class,'grid-checkcolumn')]";
			//return "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'selected')]//table//tr/td[div[text()='"+vendor+"']]/following-sibling::td[last()]//img";//div[contains(@id,'pdassignedvendorspanel')][contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'display: none'))]//div[@name='assignVendorsGrid']//table//tr/td[div[text()='"+vendor+"']]/following-sibling::td[last()]";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@id,'gridview')]/table//tr/td[div[text()='"+vendor+"']]/following-sibling::td/div/div";
		}
		
		public final String selectVendors_availableVendors_vendorX_clientVendors(String vendor){
			return "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'tabpanel-child')][not(contains(@class,'hidden-offsets'))]//div[contains(@name,'availableVendorsGrid')]//table//tr/td[div[text()='"+vendor+"']]/following-sibling::td[last()]//div"; 
			//"//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'available')]//table//tr/td[div[text()='"+vendor+"']]/following-sibling::td[last()]//img";//div[contains(@id,'pdassignedvendorspanel')][contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'display: none'))]//div[@name='availableVendorsGrid']//table//tr/td[div[text()='"+vendor+"']]/following-sibling::td[last()]";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@id,'gridview')]/table//tr/td[div[text()='"+vendor+"']]/following-sibling::td/div/div";
		}
		
		public final String selectVendors_availableVendors_vendorX_clientVendors_checked(String vendor){
			return "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'tabpanel-child')][not(contains(@class,'hidden-offsets'))]//div[contains(@name,'availableVendorsGrid')]//table//tr/td[div[text()='"+vendor+"']]/following-sibling::td[last()]//div[contains(@class,'checked')]"; 
			//"//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'available')]//table//tr/td[div[text()='"+vendor+"']]/following-sibling::td[last()]//img[contains(@class,'checked')]";//div[contains(@id,'pdassignedvendorspanel')][contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'display: none'))]//div[@name='availableVendorsGrid']//table//tr/td[div[text()='"+vendor+"']]/following-sibling::td[last()]//img[contains(@class,'checked')]";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@id,'gridview')]/table//tr/td[div[text()='"+vendor+"']]/following-sibling::td/div/div[contains(@class,'checked')]";
		}
			
		public final String selectVendors_selectedVendors_vendorX_clientVendors_checked(String vendor){
			return "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][@aria-hidden='false'][not(contains(@class,'hidden-offsets'))]//div[contains(@name,'selected')]//table//tr/td[div[text()='"+vendor+"']]/../td[4]//div[contains(@class,'checkcolumn-checked')]";
			//"//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][@aria-hidden='false'][not(contains(@style,'none'))]//div[contains(@name,'selected')]//table//tr/td[div[text()='"+vendor+"']]/../td[4]//div[contains(@class,'checkcolumn-checked')]";
			//return "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'selected')]//table//tr/td[div[text()='"+vendor+"']]/following-sibling::td[last()]//img[contains(@class,'checked')]";//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'selected')]//table//tr/td[div[text()='"+vendor+"']]/following-sibling::td[last()]//img[contains(@class,'checked')]";//div[contains(@id,'pdassignedvendorspanel')][contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'display: none'))]//div[@name='assignVendorsGrid']//table//tr/td[div[text()='"+vendor+"']]/following-sibling::td[last()]//img[contains(@class,'checked')]";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@id,'gridview')]/table//tr/td[div[text()='"+vendor+"']]/following-sibling::td/div/div[contains(@class,'checked')]";
		}
		
		public final String selectVendors_selectedVendors_vendorX_vendorPhase(String vendor){
			return"//div[contains(@id,'VendorSelectClient')][@aria-hidden='false']//table//td//div[contains(text(),'"+vendor+"')]/../../td[3]//div";//"//div[contains(@id,'pdassignedvendorspanel')][@aria-hidden='false']//table//td//div[contains(text(),'"+vendor+"')]/../../td[3]//div";
			//return "//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//div[contains(@id,'gridview')]/table//tr/td[div[text()='"+vendor+"']]/following-sibling::td[2]/div";
		}
		
		public final String selectVendors_selectedVendors_grayedOut_vendorX(String vendor){
			return "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'selected')]//table//tr/td/div/span[text()='"+vendor+"']";//div[contains(@id,'pdassignedvendorspanel')][contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'display: none'))]//div[@name='assignVendorsGrid']//table//tr/td/div/font[text()='"+vendor+"']";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][@class='x-panel x-tabpanel-child x-panel-default']//div[3][@class='x-panel x-column x-panel-default']//div[contains(@id,'gridview')]/table//tr/td/div/font[text()='"+vendor+"']";
		}
		
		
		public final String selectVendors_rightArrow = "//div[contains(@id,'pdassignedvendorspanel') or contains(@id,'SubmissionVendor')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//span[contains(@class,'right')]";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//span[contains(@class,'arrowright')]";
		public final String selectVendors_rightArrow_disabled = "//div[contains(@id,'VendorSelect')][contains(@class,'tabpanel')][@aria-hidden='false']//a[contains(@class,'disabled')]//span[contains(@class,'icon_right')]";//"//div[contains(@class,'AssignedVendors')]//a[contains(@class,'disabled')]//span[contains(@class,'doublerightarrow')]";//"//div[contains(@id,'pdassignedvendorspanel') or contains(@id,'SubmissionVendor')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//a[contains(@class,'disabled')]//span[contains(@class,'arrowright')]";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//a[contains(@class,'disabled')]//span[contains(@class,'arrowright')]";//css=div[class*='disabled']>em>button span[class*='arrowright']";
		public final String selectVendors_leftArrow = "//div[contains(@id,'VendorSelect')][contains(@class,'tabpanel')][@aria-hidden='false']//span[contains(@class,' icon_left')]";//"//div[contains(@id,'pdassignedvendorspanel')][contains(@class,'tabpanel')][@aria-hidden='false']//span[contains(@class,' icon_left')]";//"//div[contains(@id,'pdassignedvendorspanel') or contains(@id,'SubmissionVendor')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//span[contains(@class,'arrowleft')]";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//span[contains(@class,'arrowleft')]";
		public final String selectVendors_leftArrow_disabled = "//div[contains(@id,'VendorSelect')][contains(@class,'tabpanel')][@aria-hidden='false']//a[contains(@class,'disabled')]//span[contains(@class,'icon_left')]";//"//div[contains(@id,'pdassignedvendorspanel')][contains(@class,'tabpanel')][@aria-hidden='false']//a[contains(@class,'disabled')]//span[contains(@class,'icon_left')]";//"//div[contains(@id,'pdassignedvendorspanel') or contains(@id,'SubmissionVendor')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//a[contains(@class,'disabled')]//span[contains(@class,'arrowleft')]";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//a[contains(@class,'disabled')]//span[contains(@class,'arrowleft')]";//css=div[class*='disabled']>em>button span[class*='arrowleft']";
		public final String selectVendors_rightArrowAll = "//div[contains(@id,'pdassignedvendorspanel') or contains(@id,'SubmissionVendor')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')][@aria-hidden='false']//span[contains(@class,'doublerightarrow')]";//"//div[contains(@id,'pdassignedvendorspanel') or contains(@id,'SubmissionVendor')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//span[contains(@class,'doublerightarrow')]";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//span[contains(@class,'doublerightarrow')]";
		public final String selectVendors_rightArrowAll_disabled = "//div[contains(@id,'pdassignedvendorspanel') or contains(@id,'SubmissionVendor')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//a[contains(@class,'disabled')]//span[contains(@class,'doublerightarrow')]";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//a[contains(@class,'disabled')]//span[contains(@class,'doublerightarrow')]";//css=div[class*='disabled']>em>button span[class*='doublerightarrow']";		
		public final String selectVendors_leftArrowAll = "//div[contains(@id,'VendorSelect')][not(contains(@class,'hidden-offsets'))][contains(@class,'tabpanel-child')]//span[contains(@class,'doubleleftarrow')]";//"//div[contains(@id,'pdassignedvendorspanel')][not(contains(@class,'hidden-offsets'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//span[contains(@class,'doubleleftarrow')]";//"//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//span[contains(@class,'doubleleftarrow')]";
		public final String selectVendors_leftArrowAll_disabled ="//div[contains(@id,'VendorSelect')][not(contains(@class,'hidden-offsets'))][contains(@class,'tabpanel-child')]//a[contains(@class,'item-disabled')]//span[contains(@class,'doubleleftarrow')]";//"//div[contains(@id,'pdassignedvendorspanel')][not(contains(@class,'hidden-offsets'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//a[contains(@class,'disabled')]//span[contains(@class,'doubleleftarrow')]";//"//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//a[contains(@class,'disabled')]//span[contains(@class,'doubleleftarrow')]";
		public final String selectVendors_okButton = "//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'OK')]";//"//div[contains(@id,'pdsubmissionvendorswindow') or contains(@id,'SelectVendor')]//span[text()='OK']";//"//div[contains(@id,'pdsubmissionvendorswindow') or contains(@id,'SelectVendor')]//span[text()='OK']/following-sibling::span";//div[contains(@id,'pdsubmissionvendorswindow')]//span[text()='OK']";
		public final String selectVendors_saveTabs_yesButton = "//div[contains(@id,'warning')]//span[contains(text(),'Yes')]";//"//div[contains(@id,'warning')]//span[contains(text(),'Yes')]/following-sibling::span";
		public final String selectVendors_selectedVendors_clientVendorsAll = "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][@aria-hidden='false'][not(contains(@style,'none'))]//div[contains(@name,'selected')]//span[following-sibling::span[contains(text(),'Client Vendor') or contains(text(),'CV')]]";//"//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'selected')]//span[following-sibling::span[contains(text(),'Client Vendor') or contains(text(),'CV')]]";//div[contains(@class,'x-tabpanel-child x-panel-default') and not(contains(@style,'display: none'))]//div[contains(@class,'x-panel x-column x-panel-default')][2]//span[contains(@class,'x-grid-checkheader')]";
		public final String selectVendors_availableVendors_clientVendorsAll = "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'available')]//span[following-sibling::span[contains(text(),'Client Vendor')]]";//div[contains(@id,'pdassignedvendorspanel')][contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'display: none'))]//div[@name='availableVendorsGrid']//div/div/span[contains(@class,'checkheader')][following-sibling::span[text()='Client Vendors']]";//div[contains(@class,'x-tabpanel-child x-panel-default') and not(contains(@style,'display: none'))]//div[contains(@class,'x-panel x-column x-panel-default')][1]//span[contains(@class,'x-grid-checkheader')]";
		public final String selectVendors_selectedVendors_clientVendorsAll_checked = "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][@aria-hidden='false'][not(contains(@style,'none'))]//div[contains(@name,'selected')]//span[following-sibling::span[contains(text(),'Client Vendor') or contains(text(),'CV')]][contains(@class,'checkcolumn-checked')]";//"//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][@aria-hidden='false'][not(contains(@style,'none'))]//div[contains(@name,'selected')]//span[following-sibling::span[contains(text(),'Client Vendor') or contains(text(),'CV')]]";//"//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'selected')]//span[contains(@class,'x-grid-checkcolumn-checked')][following-sibling::span[contains(text(),'Client Vendor')]]";//div[contains(@class,'x-tabpanel-child x-panel-default') and not(contains(@style,'display: none'))]//div[contains(@class,'x-panel x-column x-panel-default')][2]//span[contains(@class,'x-grid-checkheader-checked')]";
		public final String selectVendors_availableVendors_clientVendorsAll_checked = "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'available')]//span[contains(@class,'x-grid-checkcolumn-checked')][following-sibling::span[contains(text(),'Client Vendor')]]";//div[contains(@id,'pdassignedvendorspanel')][contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'display: none'))]//div[@name='availableVendorsGrid']//div/div/span[contains(@class,'checked')][following-sibling::span[text()='Client Vendors']]";//div[contains(@class,'x-tabpanel-child x-panel-default') and not(contains(@style,'display: none'))]//div[contains(@class,'x-panel x-column x-panel-default')][1]//span[contains(@class,'x-grid-checkheader-checked')]";
		public final String selectVendors_applyButton = "//div[contains(@id,'VendorSelectClientTab')]//span[text()='Apply']/..";//"//div[contains(@id,'pdsubmissionvendorswindow')]//span[text()='Apply']/..";
		public final String selectVendors_showOnlyClientVendorGroup = "//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//label[contains(text(),'Show')]";//"//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//label[text()='Show Only Client Vendor Group']";//css=div[id*='pdsubmissionvendorstabpanel'] label:contains('Show Only Client Vendor Group')";
		public final String selectVendors_cancelButton ="//div[contains(@class,'client_select_vendor_Dialog')]//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Cancel')]";//"//div[contains(@id,'pdsubmissionvendorswindow')]//span[text()='Cancel']/..";
		public final String create_Budget_dialogWindow ="//div[starts-with(@id,'pdcreatebudgetdialog') and contains(@class,'x-component-default')]";
		public final String goToBudgetsButton = "//div[contains(@class,'x-window-default-closable')]/div[contains(@class,'x-toolbar-footer')]//a//span[contains(text(),'Go To Budgets')]/following-sibling::span";
		public final String selectVendors_phaseWithoutVendors_OkButton="//div[contains(@id,'warningdialog')]//a//span[text()='OK']";
		
		public final String selectVendors_available_or_select_vendor_row = "//div[contains(@class,'submission_vendor_select_client_Tab')]//div[contains(@class,'tabpanel-child')][not(contains(@class,'hidden-offsets'))]//table//td";
		public final String selectVendors_available_or_select_vendor_row_vendorName(String vendorName)
		{
			return "//div[contains(@class,'submission_vendor_select_client_Tab')]//div[contains(@class,'tabpanel-child')][not(contains(@class,'hidden-offsets'))]//table//td//div[contains(text(),'"+vendorName+"')]";
		}
		
		
//Create budget
		public final String createBudgetButton = "//span[contains(@id,'pd_create_budget_')]//span[contains(@class,'createbudget')]";
		public final String createBudget_firstpage_RevenueInput = "//div[starts-with(@id,'pdcreatebudgetdialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//table[@name='revenue']//input";
		public final String createBudget_secondpage_RevenueInput = "//div[starts-with(@id,'pdcreatebudgetdialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//table[@name='revenue']//input";//"//div[2]/div/div/div/div/div[2]/div/div/div[2]//label[contains(text(),'Revenue:')]/following-sibling::div/input";
		public final String createBudget_firstPage_additionalCostInput = "//div[3]/div/input";
		public final String createBudget_secondPage_additionalCostInput = "//div[2]/div/form/div/div/div/div/div/div/div/div[2]/div/div/fieldset/div/div/div/div/div/div/div[2]/div/div/div[3]/div/input";
		public final String createBudget_firstpage_firstRow_rate = "//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridview')]/table//table//td[9]";
		public final String createBudget_firstpage_secondRow_rate = "//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridview')]/table/tbody/tr[2]//td[9]";
		public final String createBudget_firstpage_thirdRow_rate = "//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridview')]/table/tbody/tr[3]//td[9]";
		public final String createBudget_secondpage_firstRow_rate = "//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridview')]/table//table//td[9]";
		public final String createBudget_secondpage_secondRow_rate = "//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridview')]/table/tbody/tr[2]//td[9]";
		public final String createBudget_firstPage_rateInput = "//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridpanel')]//input";
		public final String createBudget_secondPage_rateInput = "//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridpanel')]//input";
		public final String createBudget_finishButton = "//div[contains(@id,'budget')]//div[contains(@id,'toolbar')]//a//span[text()='Finish']/following-sibling::span";//span[text()='Finish']//ancestor::button[ancestor::div[not(contains(@class,'x-item-disabled'))]/em]";//"css=button:contains('Finish')";
		public final String createBudget_nextButton = "//div[contains(@id,'budget')]//span[text()='Next >']/following-sibling::span";//div[contains(@class,'x-toolbar-footer x-docked-bottom')]//div[contains(@class,'x-box-item x-toolbar-item') and not(contains(@class,'x-item-disabled'))]//span[contains(text(),'Next >')]/..";
		public final String createBudget_finishButton_disabled="//div[contains(@id,'budget')]//a[contains(@class,'disabled')]//span[text()='Finish']";
		public final String budget_previousButton="//div[contains(@id,'budget')]//span[contains(text(),'Previous')]/following-sibling::span";
		public final String create_Budget_phaseXLangaugeGroup(int row, String language)
		{
			return "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//tr["+row+"]/td/div/div[contains(text(),'"+language+"')]";
		}
		
		public final String review_budget_phaseXLanguageGroup(int row, String language)
		{
			return "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//tr["+row+"]/td/div/div//span[text()='"+language+"']";
		}
		
		// locators for multiple language n multiple batches
		public final String createBudget_firstPage_firstRow_rate_multiBatch="//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridview')]/table//table//td[9]";
		public final String createBudget_firstPage_secondRow_rate_multiBatch="//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridview')]/table/tbody/tr[2]/td[9]";
		public final String createBudget_firstPage_thirdRow_rate_multiBatch="//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridview')]/table/tbody/tr[3]//table//td[9]";
		public final String createBudget_firstPage_fourthRow_rate_multiBatch="//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridview')]/table/tbody/tr[4]/td[9]";
		
		public final String createBudgetWizard="//div[text()='Create budget by phases']";
		public final String createBudget_firstPage_firstRow_total = "//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridview')]/table//table//td[last()]";//div[starts-with(@id,'pdcreatebudgetdialog-') and contains(@class,'x-window-body-default')]/div[starts-with(@id,'panel')]//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//fieldset//div[starts-with(@id,'gridpanel-') and contains(@class,'x-panel-body x-grid-body x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-group-body')][1]//td[not(contains(@class,'x-grid-cell-first'))][15]/div";
		public final String createBudget_firstPage_secondRow_total = "//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridview')]/table/tbody/tr[2]//table//td[last()]";//div[starts-with(@id,'pdcreatebudgetdialog-') and contains(@class,'x-window-body-default')]/div[starts-with(@id,'panel')]//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//fieldset//div[starts-with(@id,'gridpanel-') and contains(@class,'x-panel-body x-grid-body x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-group-body')][2]//td[not(contains(@class,'x-grid-cell-first'))][15]/div";
		public final String createBudget_secondPage_firstRow_total = "//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridview')]/table//table//td[last()]";//div[starts-with(@id,'pdcreatebudgetdialog-') and contains(@class,'x-window-body-default')]/div[starts-with(@id,'panel')]//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//fieldset//div[starts-with(@id,'gridpanel-') and contains(@class,'x-panel-body x-grid-body x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-group-body')][1]//td[not(contains(@class,'x-grid-cell-first'))][15]/div";
		public final String createBudget_secondPage_secondRow_total = "//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[contains(@id,'gridview')]/table/tbody/tr[2]//table//td[last()]";//div[starts-with(@id,'pdcreatebudgetdialog-') and contains(@class,'x-window-body-default')]/div[starts-with(@id,'panel')]//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//fieldset//div[starts-with(@id,'gridpanel-') and contains(@class,'x-panel-body x-grid-body x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-group-body')][2]//td[not(contains(@class,'x-grid-cell-first'))][15]/div";
		public final String createBudget_checkApplyToLanguage="//label[contains(text(),'Apply To Language')]";
		public final String createBudget_checkApplyToAll="//label[contains(text(),'Apply To All')]";
		public final String creaBudget_selectUnitOfWork= "//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//table[@name='unitOfWork']//td/div[contains(@class,'x-form-trigger')]";//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//label[contains(text(),'Unit Of Work')]/../../td[contains(@class,'x-form-item-body')]//div[contains(@class,'x-form-arrow-trigger x-form-trigger-last')]";
		public final String createBudget_secondPage_selectUnitOfWork="//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//table[@name='unitOfWork']//td/div[contains(@class,'x-form-trigger')]";//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//label[contains(text(),'Unit Of Work')]/../../td[contains(@class,'x-form-item-body')]//div[contains(@class,'x-form-arrow-trigger x-form-trigger-last')]";
		public final String createBudget_cancelButton="//div[starts-with(@id,'pdcreatebudgetdialog') and contains(@class,'x-window-default')]//span[contains(text(),'Cancel')]/following-sibling::span";

		public final String createBudget_selectVendorOKButton="//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'OK')]";//"//div[contains(@id,'pdsubmissionvendorswindow') or contains(@id,'SelectVendor')]//span[text()='OK']";//"//div[contains(@id,'pdsubmissionvendorswindow') or contains(@id,'SelectVendor')]//span[text()='OK']/following-sibling::span";//div[contains(@id,'pdsubmissionvendorswindow')]//button/span[text()='OK']";
		public final String createBudget_availableVendorsFirstRow="//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'available')]//table/tbody/tr";//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-default')][child::div//span[text()='Available Vendors']]//following-sibling::div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-row')][1]";//css=div[id*='pdassignedvendorspanel'] table>tbody>tr[class*='x-grid-row']";//css=div [class=' x-panel x-panel-noborder x-column'] table>tbody>tr";

		public final String createBudget_availableVendorsFirstRow_notChecked="//div[starts-with(@id,'pdsubmissionvendorswindow') and contains(@class,'x-window-body-default')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-default')][child::div//span[contains(text(),'Available Vendors')]]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//tr[contains(@class,'x-grid-row')][1]/td[contains(@class,'x-grid-cell-last')]//div[contains(@class,'x-grid-checkheader')]";


		public final String createBudget_selectAllAvailableVendors="//div[contains(@id,'pdassignedvendorspanel') or contains(@id,'SubmissionVendor')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//span[contains(@class,'doublerightarrow')]";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//span[contains(@class,'doublerightarrow')]";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][@class='x-panel x-tabpanel-child x-panel-default']//span[contains(@class,'doublerightarrow')]";
		public final String createBudget_checkAvailableClientVendors="//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'available')]//span[following-sibling::span[contains(text(),'Client Vendor') or contains(text(),'CV')]]";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][contains(@class,'x-panel x-tabpanel-child x-panel-default')]//div[contains(@id,'gs4trcheckcolumn')]/span";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@id,'gs4trcheckcolumn')]/span";//div[contains(@id,'pdassignedvendorspanel')]//div[contains(@id,'gs4trcheckcolumn')]/span";
		public final String createBudget_checkSelectedClientVendors="//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'selected')]//span[following-sibling::span[contains(text(),'Preferred Vendor')]]";//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-default')][child::div//span[text()='Selected Vendors']]//following-sibling::div[child::div/span[text()='Client Vendors']]//span[1]";//"//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@id,'gs4trcheckcolumn')]/span";//div[contains(@id,'pdassignedvendorspanel')]//div[contains(@id,'gs4trcheckcolumn')]/span";
		public final String createBudget_selectedClientVendors_checked="//div[contains(@name,'selectedVendors')]//div[contains(@id,'checkcolumn')]//span[contains(@class,'x-grid-checkcolumn-checked')][following-sibling::span[contains(text(),'Preferred Vendor')]]";//"//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'selected')]//span[contains(@class,'x-grid-checkcolumn-checked')][following-sibling::span[contains(text(),'Client Vendor')]]";
		public final String createBudget_checkedAvailableClientVendors="//div[contains(@name,'availableVendorsGrid')]//div[contains(@id,'checkcolumn')]//span[contains(@class,'x-grid-checkcolumn-checked')][following-sibling::span[contains(text(),'Client Vendor')]]";//"//div[contains(@id,'pdsubmissionvendors') or contains(@id,'SubmissionVendor')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//div[contains(@name,'available')]//span[contains(@class,'x-grid-checkcolumn-checked')][following-sibling::span[contains(text(),'Client Vendor')]]";//div[contains(@id,'pdsubmissionvendorstabpanel')]//div[contains(@id,'gridpanel')]//table//tr//td//img[contains(@class,'checked')]";//"//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@id,'gs4trcheckcolumn')]/span[contains(@class,'checked')]";
		public final String createBudget_selectVendor_applyButton="//div[contains(@id,'assignedvendorspanel')][contains(@aria-hidden,'false')]//span[contains(text(),'Apply')]";//"//div[contains(@id,'pdsubmissionvendorswindow')]//div[contains(@class,'x-panel x-tabpanel-child x-panel-default')][not(contains(@style,'none'))]//span[text()='Apply']/..";//div[contains(@id,'pdassignedvendorspanel')][not(contains(@style,'display: none'))][@class='x-panel x-tabpanel-child x-panel-default']//button/span[text()='Apply']";//div[contains(@id,'pdsubmissionvendorstabpanel')]//button/span[text()='Apply']";

		public final String createBudget_unitOfWorkSelectX (String unit){
			return "//div[@name='unitOfWork-boundlist'][not(contains(@style,'none'))]//li[text()='"+unit+"']";
		}
		public final String createBudget_languageTabX(int no)
		{
			return "//div[contains(@id,'tabpanel')]//div/a[contains(@id,'tab')]["+no+"]";
		}

		public final String createBudget_firstPage_100PercentColumn_WordUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[9]/div";
		public final String createBudget_firstPage_fuzzyColumn_WordUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[10]/div";
		public final String createBudget_firstPage_fuzzyReps_WordUnit="//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[11]/div";
		public final String createBudget_firstPage_repeatColumn_WordUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[12]/div";
		public final String createBudget_firstPage_noMatchColumn_WordUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[13]/div";
		public final String createBudget_firstPage_total_WordUnit="//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[8]/div";
		public final String createBudget_firstPage_100PercentUSD_WordUnit="//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[8]/div";
		public final String createBudget_firstPage_fuzzyUSD_WordUnit="//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[9]/div";
		public final String createBudget_firstPage_fuuzyRepsUSD_WordUnit="//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[10]/div";
		public final String creaeBudget_firstPage_repeatsUSD_WordUnit="//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[11]/div";
		public final String createBudget_firstPage_NoMatchUSD_WordUnit="//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[12]/div";
		public final String createBudget_firstPage_totalUSD_WordUnit="//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[16]/div";		
		public final String createBudget_firstPage_noMatchColumnUSD_WordUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[12]/div";		
		public final String createBudget_firstPage_100perc_secondRow ="//fieldset[contains(@class,'x-fieldset-default')][child::div//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//tr[contains(@class,'x-grid-group-body')][2]//tr[contains(@class,'x-grid-row')]/td[not(contains(@class,'x-grid-cell-first'))][2]";
		public final String createBudget_firstPage_total_secondRow ="//fieldset[contains(@class,'x-fieldset-default')][child::div//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//tr[contains(@class,'x-grid-group-body')][2]//tr[contains(@class,'x-grid-row')]/td[not(contains(@class,'x-grid-cell-first'))][7]";
		public final String createBudget_firstPage_repeat_secondRow ="//fieldset[contains(@class,'x-fieldset-default')][child::div//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//tr[contains(@class,'x-grid-group-body')][2]//tr[contains(@class,'x-grid-row')]/td[not(contains(@class,'x-grid-cell-first'))][5]";
		public final String createBudget_firstPage_noMatch_secondRow ="//fieldset[contains(@class,'x-fieldset-default')][child::div//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//tr[contains(@class,'x-grid-group-body')][2]//tr[contains(@class,'x-grid-row')]/td[not(contains(@class,'x-grid-cell-first'))][6]";		
		public final String createBudget_secondPage_100PercentColumn_WordUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[3]/div";
		public final String createBudget_secondPage_fuzzyColumn_WordUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[4]/div";
		public final String createBudget_secondPage_repeatColumn_WordUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[6]/div";
		public final String createBudget_secondPage_noMatchColumn_WordUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr/td[7]/div";
		public final String createBudget_firstPage_100PercentInput = "//div[not(contains(@style,'none'))]/table[contains(@name,'oneHundred')]//input[contains(@name,'oneHundred')]";
		public final String createBudget_firstPage_100PercentInputUSD = "//div[contains(@id,'createbudget')]//div[@name='phaseGrid']//div[not(contains(@style,'display: none'))]//td/input[contains(@name,'numberfield')]";//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[@name='phaseGrid']/div[not(contains(@style,'display: none'))]//input[contains(@name,'numberfield')]";//input[@name='oneHundredPercentPrice']";
		public final String createBudget_firstPage_fuzzyInput = "//div[not(contains(@style,'none'))]/table[contains(@name,'fuzzy')]//input[contains(@name,'fuzzy')]";
		public final String createBudget_firstPage_fuzzyInputUSD = "//div[contains(@id,'createbudget')]//div[@name='phaseGrid']//div[not(contains(@style,'display: none'))]//td/input[contains(@name,'numberfield')]";//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[@name='phaseGrid']/div[not(contains(@style,'display: none'))]//input[contains(@name,'numberfield')]";//input[@name='fuzzyPrice']";
		public final String createBudget_firstPage_fuzzyRepsInput="//div[not(contains(@style,'none'))]/table[contains(@name,'fuzzyReps')]//input[contains(@name,'fuzzyReps')]";
		public final String createBudget_firstPage_fuzzyRepsInputUSD="//div[contains(@id,'createbudget')]//div[@name='phaseGrid']//div[not(contains(@style,'display: none'))]//td/input[contains(@name,'numberfield')]";//input[@name='fuzzyRepsPrice']";
		public final String createBudget_firstPage_repeatInput = "//div[not(contains(@style,'none'))]/table[contains(@name,'repeat')]//input[contains(@name,'repeat')]";
		public final String createBudget_firstPage_repeatInputUSD = "//div[contains(@id,'createbudget')]//div[@name='phaseGrid']//div[not(contains(@style,'display: none'))]//td/input[contains(@name,'numberfield')]";//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[@name='phaseGrid']/div[not(contains(@style,'display: none'))]//input[contains(@name,'numberfield')]";//input[@name='repeatPrice']";
		public final String createBudget_firstPage_noMatchInput = "//div[not(contains(@style,'none'))]/table[contains(@name,'noMatch')]//input[contains(@name,'noMatch')]";
		public final String createBudget_firstPage_noMatchInputUSD = "//div[contains(@id,'createbudget')]//div[@name='phaseGrid']//div[not(contains(@style,'display: none'))]//td/input[contains(@name,'numberfield')]";//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//div[@name='phaseGrid']/div[not(contains(@style,'display: none'))]//input[contains(@name,'numberfield')]";//input[@name='noMatchPrice']";
		public final String createBudget_submissionData_jobNumberValueX="//div[contains(@id,'budgetdialog')]//tr[td/label[text()='Job Number']]/td/div";
		public final String createBudget_submissionData_clientX="//div[contains(@id,'budgetdialog')]//tr[td/label[text()='Client']]/td/div";
		public final String createBudget_submissionData_subNameX="//div[contains(@id,'budgetdialog')]//tr[td/label[text()='Name']]/td/div";
		public final String createBudget_submissionData_claimLevelX="//div[contains(@id,'budgetdialog')]//tr[td/label[text()='Claim Level']]/td/div";
		public final String createBudget_budgetData_totalBudgetValueX="//div[contains(@id,'budgetdialog')]//tr[td/label[text()='Total Budget']]/td/div";
		public final String createBudget_budgetData_markUpValueX="//div[contains(@id,'budgetdialog')]//tr[td/label[text()='Mark-up']]/td/div";
		public final String createBudget_firstPage_100PercentColumn_FlatUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table//table/tbody/tr[contains(@class,'grid')]/td[2]/div";
		public final String createBudget_firstPage_fuzzyColumn_FlatUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table//table/tbody/tr[contains(@class,'grid')]/td[3]/div";
		public final String createBudget_firstPage_fuzzyReps_FlatUnit="//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table//table/tbody/tr[contains(@class,'grid')]/td[4]/div";
		public final String createBudget_firstPage_repeatColumn_FlatUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table//table/tbody/tr[contains(@class,'grid')]/td[5]/div";
		public final String createBudget_firstPage_noMatchColumn_FlatUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table//table/tbody/tr[contains(@class,'grid')]/td[6]/div";
		public final String createBudget_firstPage_total_FlatUnit="//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table//table/tbody/tr[contains(@class,'grid')]/td[7]/div";
		public final String createBudget_firstPageRow2_100PercentColumn_FlatUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr[contains(@class,'grid')][2]/td[2]/div";
		public final String createBudget_firstPageRow2_fuzzyColumn_FlatUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr[contains(@class,'grid')][2]/td[3]/div";
		public final String createBudget_firstPageRow2_fuzzyReps_FlatUnit="//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr[contains(@class,'grid')][2]/td[4]/div";
		public final String createBudget_firstPageRow2_repeatColumn_FlatUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr[contains(@class,'grid')][2]/td[5]/div";
		public final String createBudget_firstPageRow2_noMatchColumn_FlatUnit = "//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr[contains(@class,'grid')][2]/td[6]/div";
		public final String createBudget_firstPageRow2_total_FlatUnit="//div[contains(@id,'budget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table/tbody/tr[contains(@class,'grid')][2]/td[7]/div";
		

		public final String createBudget_transPhaseBudget = "//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//tr[td/label[contains(text(),'Trans')]]/td/div[@role='textbox']";
		public final String createBudget_proofPhaseBudget = "//div[contains(@id,'createbudget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//tr[td/label[contains(text(),'Proof')]]/td/div[@role='textbox']";//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//tr[td/label[text()='Proof Budget:']]/td/div";
		public final String createBudget_proofingPhaseBudget="//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//tr[td/label[text()='Proofing Budget:']]/td/div";

		
		public final String pmBudgetProvidedIcon = "//div[contains(@class,'pmenteredbudget')]";
		public final String pmBudgetAcceptedIcon = "//div[contains(@class,'budgetaccepted')]";
		public final String createBudget_allowVendorNegotiationCheckbox = "//div[contains(@id,'budget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//td[label[text()='Allow Vendor Negotiation']]/following-sibling::td//input";//label[text()='Allow Vendor Negotiation']";//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//fieldset//div[starts-with(@id,'panel-') and contains(@class,'x-panel-body x-panel-body-default')]/table[@name='allowVendorNegotiation']//input[@name='allowVendorNegotiation']";
		public final String createBudget_controlVendorAssignmentCheckBox= "//div[contains(@id,'budget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//td[label[text()='Control Vendor Assignment']]/following-sibling::td//input";//label[text()='Control Vendor Assignment']";//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//fieldset//div[starts-with(@id,'panel-') and contains(@class,'x-panel-body x-panel-body-default')]/table[@name='controlVendorAssigment']//input[@name='controlVendorAssigment']";
		
//Review Budget		
		public final String reviewBudgetButton = "//span[contains(@id,'pd_review_submission_budget_action-')]//span[contains(@class,'reviewsubmissionbudget')]";
		
		
		public final String reviewBudget_AcceptCheckBoxNotPresent(int row)
		{
			return "//div[contains(@id,'reviewbudget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//table//tr["+(row)+"]/td[14]//div[not(contains(@class,'checkcolumn'))]";
		}
		public final String reviewBudget_CounterCheckBoxNotPresent(int row)
		{
			return "//div[contains(@id,'reviewbudget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//table//tr["+(row)+"]/td[15]//div[not(contains(@class,'checkcolumn'))]";
		}
		public final String reviewBudget_DeclineCheckBoxNotPresent(int row)
		{
			return "//div[contains(@id,'reviewbudget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//table//tr["+(row)+"]/td[16]//div[not(contains(@class,'checkcolumn'))]";
		}
		
		
		public final String reviewBudget_AcceptCheckBox_page_rowX(int row)
		//row - the number of row with batch info, where need accept to be checked
		{
			return "//div[contains(@id,'reviewbudget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//table//tr["+(row)+"]/td[14]";
		}
		
		public final String reviewBudget_CounterCheckBox_pageX_rowX(int row)
		//row - the number of row with batch info, where need counter to be checked
		{
			return "//div[contains(@id,'reviewbudget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//table//tr["+(row)+"]/td[15]";//div[@class='x-grid-checkcolumn']";
		}
		
		public final String reviewBudget_DeclineCheckBox_pageX_rowX(int page, int row)
		//page 1 for translation, page 2 for proofing, etc
		//row 2 for the one language configuration, or find the row manually if multiple batches/languages
		{
			return "//div[contains(@id,'reviewbudget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//table//tr["+(row)+"]/td[16]";
		}
		
		public final String reviewBudget_statusRowX(int row)
		{
			return "//div[contains(@id,'reviewbudget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//table//tr["+row+"]/td[5]";
		}
		
		public final String reviewBudget_vendorCounterTotal_rowX(int row)
		{
			return "//div[contains(@id,'reviewbudget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//table//tr["+row+"]/td[7]";
		}
		
		public final String reviewBudget_proposedDeadline_rowX(int row)
		{
			return "//div[contains(@id,'reviewbudget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//table//tr["+row+"]/td[11]";
		}
		public final String preview_budgetStatus_greenTick="//div[contains(@class,'budgetaccepted')]";//css=div[class='budgetaccepted']";
		public final String preview_budgetStatus_blueTick="//div[contains(@class,'pmenteredbudget')]";//css=div[class='pmenteredbudget']";
		public final String reviewBudget_firstPhase_firstOriginalTotal = "//div[starts-with(@id,'pdreviewbudgetdialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//descendant::tr[contains(@class,'x-grid-row')][child::td/div[contains(@class,'x-grid-cell-inner')]/a][1]//a";
		public final String reviewBudget_firstPhase_secondOriginalTotal = "//div[starts-with(@id,'pdreviewbudgetdialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//descendant::tr[contains(@class,'x-grid-row')][child::td/div[contains(@class,'x-grid-cell-inner')]/a][2]//a";
		public final String reviewBudget_secondPhase_firstOriginalTotal = "//div[starts-with(@id,'pdreviewbudgetdialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//descendant::tr[contains(@class,'x-grid-row')][child::td/div[contains(@class,'x-grid-cell-inner')]/a][1]//a";
		public final String reviewBudget_secondPhase_secondOriginalTotal = "//div[starts-with(@id,'pdreviewbudgetdialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//descendant::tr[contains(@class,'x-grid-row')][child::td/div[contains(@class,'x-grid-cell-inner')]/a][2]//a";
		public final String budgetOverview_rateColumn = "//div[starts-with(@id,'pdbudgetoverviewdialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'pdbudgetoverviewgrid') and contains(@class,'x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-row')][2]/td[9]/div[contains(@class,'x-grid-cell-inner')]";
		public final String budgetOverview_rateInput = "//div[@name='budgetGrid']//div//table//td//input";//"//table[@name='ratePrice']//input[@name='ratePrice']";
		public final String budgetOverview_total = "//div[starts-with(@id,'pdbudgetoverviewdialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'pdbudgetoverviewgrid') and contains(@class,'x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-row')][2]/td[7]/div[contains(@class,'x-grid-cell-inner')]";
		public final String budgetOverviewSaveButton = "//div[starts-with(@id,'pdbudgetoverviewdialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Save')]/following-sibling::span";
		public final String reviewBudget_translationStatus_pmClaimed="//div[contains(@id,'pdreviewbudgetdialog')]//div[contains(@id,'ext-comp')][contains(@class,'x-panel-default')][not(contains(@style,'display: none'))]//table[contains(@id,'gridview')]//td//div//span[text()='pm claimed']";
		public final String reviewBudget_translationStatus_pending="//div[contains(@id,'pdreviewbudgetdialog')]//div[contains(@id,'ext-comp')][contains(@class,'x-panel-default')][not(contains(@style,'display: none'))]//table[contains(@id,'gridview')]//td//div//span[text()='pending']";
		public final String reviewBudget_translationStatus_released="//div[starts-with(@id,'pdreviewbudgetdialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-default')]//tr[contains(@class,'x-grid-row')][child::td//span[contains(text(),'released')]]//span[contains(text(),'released')]";
		public final String reviewBudget_prooferStatus_pmClaimed="//div[contains(@id,'pdreviewbudgetdialog')]//div[contains(@id,'ext-comp')][contains(@class,'x-panel-default')][not(contains(@style,'display: none'))]//table[contains(@id,'gridview')]//td//div//span[text()='pm claimed']";
		public final String reviewBudget_prooferStatus_pending="//div[contains(@id,'pdreviewbudgetdialog')]//div[contains(@id,'ext-comp')][contains(@class,'x-panel-default')][not(contains(@style,'display: none'))]//table[contains(@id,'gridview')]//td//div//span[text()='pending']";
		public final String reviewBudget_closeButton="css=div[id*='pdreviewbudgetdialog'] button:contains('Close')";
		public final String reviewBudget_CancelButton="//div[starts-with(@id,'pdreviewbudgetdialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Cancel')]/following-sibling::span";
		public final String reviewBudget_SaveButton="//div[contains(@class,'x-toolbar-footer-docked-bottom')]//span[text()='Save']/following-sibling::span";
		public final String reviewBudget_finishButton="//div[contains(@id,'pdreviewbudgetdialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Finish')]/following-sibling::span";
		public final String reviewBudget_acceptedFirstGreenTick = "//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'none'))]//td/div/div[contains(@class,'checkedsign')]";//css=td:nth-child(14)>div>div.checkedsign";
		public final String reviewBudget_firstpage_RevenueInput = "//div[starts-with(@id,'pdreviewbudgetdialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//table[@name='revenue']//input";
		public final String reviewBudget_firstPage_additionalCostInput = "//div[starts-with(@id,'pdreviewbudgetdialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//input[@name='additionalCosts']";
		public final String create_reviewBudget_alloVendorNegoiationIsChecked="//div[contains(@id,'budget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//table[@name='allowVendorNegotiation'][contains(@class,'x-form-cb-checked')]//td/div/input";
		public final String create_reviewBudget_controlVendorAssignmentIsChecked="//div[contains(@id,'budget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//table[@name='controlVendorAssigment'][contains(@class,'x-form-cb-checked')]//td/div/input";
		public final String create_reviewBudget_allowVendorNegotiation_disabled="//div[contains(@id,'budget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//table[@name='allowVendorNegotiation'][contains(@class,'x-item-disabled')]//td/div/input";
		public final String create_reviewBudget_controlVendorAssignment_disabled="//div[contains(@id,'budget')]//div[contains(@class,'x-panel x-fit-item x-panel-default')][not(contains(@style,'display: none'))]//table[@name='controlVendorAssigment'][contains(@class,'x-item-disabled')]//td/div/input";
		public final String reviewBudget_vendorDataColumn_rowX(int row)
		{
			return "//div[contains(@id,'budget')]//div[@name='phaseGrid']//tr["+(row)+"]/td[contains(@class,'avn')]";
		}
		
		public final String select(String name)
		{
			return "//div[contains(@name,'workflowCombo')]//ul/li[text()='"+name+"']";//"css=div[name='workflowCombo-boundlist'] ul>li:contains('"+name+"')";
		}
		public final String reviewBudgetData(String label)
		{			
			return "//label[contains(text(),'"+label+"')]/../..//following-sibling::td//div";
		}
		
		public final String counterBudget_rateColumn = "//div[starts-with(@id,'pdbudgetoverviewdialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'pdbudgetoverviewgrid') and contains(@class,'x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-row')][4]/td[contains(@class,'x-grid-cell')][9]/div";
		public final String counterBudget_rateinput = "//table[contains(@name,'numberfield')]//input[contains(@name,'numberfield')]";
		public final String counterBudget_totalColumn = "//div[starts-with(@id,'pdbudgetoverviewdialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'pdbudgetoverviewgrid') and contains(@class,'x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-row')][4]/td[contains(@class,'x-grid-cell')][10]/div";
		public final String counterBudget_commentInput = "//table[@name='pmComment']//div[starts-with(@id,'textareafield')]//following-sibling::textarea[@name='pmComment']";
		public final String counterBudget_saveButton = "//div[starts-with(@id,'pdbudgetoverviewdialog') and contains(@class,'x-window-default')]//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Save')]/following-sibling::span";
		public final String counterBudget_cancelButton = "css=table>tbody>tr>td:nth-child(2)>table>tbody>tr>td>table>tbody>tr>td:nth-child(2)>table>tbody>tr:nth-child(2)>td:nth-child(2)>em>button:contains('Cancel')";			
		public final String pmCounterTotal = "//div[contains(@id,'pdreviewbudgetdialog')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table//tr[3]/td[8]//div";
		public final String pmCounterTotal_rowX(int row)
		{
			return "//div[contains(@id,'pdreviewbudgetdialog')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//table//tr["+row+"]/td[8]//div";
		}
		public final String manualSubmission_departmentSelectButton="//div[starts-with(@id,'pdmanualsubmissiondialog') and contains(@class,'x-window-default')]//table[@name='projectCombo']//td[contains(@class,'x-form-item-body')]//table//td[contains(@class,'x-trigger-cell')]/div";
		public final String selectDepartment(String name)
		{
			return "//div[@name='projectCombo-boundlist']//li[contains(@class,'x-boundlist-item') and text()='"+name+"']";
		}
		public final String manualSubmission_disabled_inputDepartment="//table[contains(@class,'disabled')][contains(@name,'project')]//input";
		
		public final String manualSubmission_clientSelectButton="//div[contains(@id,'generalsetting')]//table[@name='paClientCombo']//td[contains(@class,'x-form-item-body')]//table//td[contains(@class,'x-trigger-cell')]//div";
		public final String manualSubmission_inputClient="//input[@name='paClientCombo']";
		public final String manualSubmission_jobNoInput="//table[@name='paJobNumber']//input[@name='paJobNumber']";
		public final String manualSubmission_nameInput="//table[@name='tptSubmissionName']//input[@name='tptSubmissionName']";
		public final String manualSubmission_claimLevelInput="//input[@name='claimLevelCombo']";
		public final String manualSubmission_priorityInput="//input[@name='priorityCombo']";
		public final String selectClient(String name)
		{
			return "//div[contains(@id,'boundlist')]//div[contains(@class,'x-boundlist-item') and text()='"+name+"']";
		}
		
	//File list
	//these locators work only for submissions in on hold folder, not for active submissions
	//these locators work only for budget test cases!!!
		public final String fileList_Gold(int row) {
			return "//div[contains(@id,'leverage')]//table/tbody/tr[contains(@class,'x-grid-row')]["+row+"]/td[3]/div";
		}
		public final String fileList_Gold_input ="//div[contains(@id,'leverage')]//div[not(contains(@style,'display: none'))]/table//table//input[contains(@name,'numberfield')]";//table[contains(@name,'gold')]//input[contains(@name,'cumulativeTmStatistics.goldWordCount')]";
		public final String fileList_100percentMatch(int row) {
			return "//div[contains(@id,'leverage')]//table/tbody/tr[contains(@class,'x-grid-row')]["+row+"]/td[5]/div";
		}
		public final String fileList_100percentMatch_input ="//div[contains(@id,'leverage')]//div[not(contains(@style,'display: none'))]/table//table//input[contains(@name,'numberfield')]";//table[contains(@name,'Hundred')]//input[contains(@name,'cumulativeTmStatistics.oneHundredMatchWordCount')]";
		public final String fileList_noMatch(int row) {
			return "//div[contains(@id,'leverage')]//table/tbody/tr[contains(@class,'x-grid-row')]["+row+"]/td[6]/div";
		}
		public final String fileList_noMatch_input ="//div[contains(@id,'leverage')]//div[not(contains(@style,'display: none'))]/table//table//input[contains(@name,'numberfield')]";//table[contains(@name,'noMatch')]//input[contains(@name,'cumulativeTmStatistics.noMatchWordCount')]";
		public final String fileList_Repetitions(int row) {
			return "//div[contains(@id,'leverage')]//table/tbody/tr[contains(@class,'x-grid-row')]["+row+"]/td[4]/div";
		}
		public final String fileList_Repetitions_input ="//div[contains(@id,'leverage')]//div[not(contains(@style,'display: none'))]/table//table//input[contains(@name,'numberfield')]";//table[contains(@name,'repetition')]//input[contains(@name,'cumulativeTmStatistics.repetitionWordCount')]";
		public final String fileList_Total(int row) {
			return  "//div[contains(@id,'Leverage')]//table["+row+"]//td[7]/div";
			//return  "//div[contains(@id,'leverage')]//table//tr["+row+"]/td[7]/div";
		}
		
		public final String fileList_language_select(String targetLanguage) {	
			return "//div[contains(@class,'x-layer x-combo-list')]/div[@name='undefined']/div[contains(@class,'x-combo-list-item') and contains(text(),'"+targetLanguage+"')]";
		}
		
		public final String fileList_applyButton= "//div[contains(@class,'x-toolbar-footer-docked-bottom')]//span[text()='Apply']/following-sibling::span" +
				"";
		public final String fileList_closeButton="//div[contains(@id,'Leverage')]/following-sibling::div//span[text()='Close']";//div[contains(@id,'leverage')]//span[text()='Close']/following-sibling::span";//span[text()='Close']";
		
		
		public final String addEditSubmission_disabledSubmissionNameInput="//table[contains(@class,'disabled')]//input[contains(@name,'submissionName')]";
		public final String addEditSubmission_disabledPrioritySelectButton="//table[contains(@name,'priorityCombo')][contains(@class,'disabled')]//td//div[contains(@class,'trigger')]";
		public final String addEditSubmission_disabledClaimLevelSelectButton="//table[contains(@name,'claimLevelCombo')][contains(@class,'disabled')]//td//div[contains(@class,'trigger')]";
		public final String addEditSubmission_disabledDueDateSelectButton="//table[contains(@name,'dueDate')][contains(@class,'disabled')]//td//div[contains(@class,'trigger')]";
		public final String addEditSubmission_disabledTranslateFromSelectbutton="//table[contains(@name,'sourceCombo')][contains(@class,'disabled')]//td//div[contains(@class,'trigger')]";
		public final String addEditSubmission_disabledTranslateToSelectbutton="//table[@name='targetCombo']//td[contains(@class,'disabled')]//div[contains(@class,'expand')]";//"css=table[id*='superboxselect'][class*='disabled'] td>div>div[class*='expand']";
		public final String addEditSubmission_disabledNewBatch="//a[contains(@class,'disabled')]//span[text()='New Batch']";
		public final String addeditSubmission_disabledDeleteBatch="//a[contains(@class,'disabled')]//span//span[contains(text(),'Delete Batch')]";
		public final String addEditSubmission_disabledBatchX="//div[contains(@id,'pdbatchgrid')][contains(@class,'disabled')]//table//tbody//a[contains(text(),'Batch1')]";
		public final String addEditSubmission_batchPreview_disabledWorkflowSelectButton="//div[contains(@name,'workflowCombo')][contains(@class,'disabled')]//div[contains(@id,'trigger-picker')]";//"//table[contains(@name,'workflowCombo0')][contains(@class,'disabled')]//td//div[contains(@class,'trigger')]";
		public final String addEditSubmission_batchPreview_disabledBatchDueDateSelectButton="//table[contains(@name,'batch0-batchDueDate') and contains(@class,'disabled')]//tr/td/div";
		public final String addEditSubmission_batchPreview_disabledTransPhaseSelectButton="//table[contains(@class,'BatchPreviewDialogEdit') and contains(@class,'disabled')]//tr/td/div";//"//table[contains(@name,'batch0-phaseDueDate1') and contains(@class,'disabled')]//tr/td/div";
		public final String addEditSubmission_batchPreview_disabledProofPhaseSelectButton="//table[contains(@name,'batch0-phaseDueDate0') and contains(@class,'disabled')]//tr/td/div";
		public final String addEditSubmission_batchPreview_disabledAddFilesButton="//a[contains(@class,'disabled')]//span[text()='Add files']";//"//a[contains(@class,'disabled')]//span[text()='Add Files']";
		public final String addEditSubmission_inputDueDate="//div[contains(@name,'dueDate')]//input[contains(@name,'dueDate')]";//"//table[contains(@name,'dueDate')]//td//input";
		public final String addEditSubmission_batchPreview_cancelButton="//div[contains(@id,'batchpreviewdialog')]//div[contains(@id,'toolbar')]//span[text()='Cancel']";
		public final String addEditSubmission_windowCloseCrossButton="//div[contains(@id,'submissiondialog')]//div[contains(@class,'close')]";//"//div[contains(@id,'submissiondialog')]//img[contains(@class,'close')]";
		public final String addManualSubmission_SourceFileRemoveButtonDisabled="//a[contains(@class,'disabled')]//span[text()='Remove']";
		public final String add_editSubmission_sourceFileOrBatch_maximizeButton="//div[contains(@id,'submission')]//div[contains(@class,'batchPanel')]//a//span[contains(@class,'maximize')]";
		public final String add_editSubmission_sourceFileOrBatch_minimizeButton="//div[contains(@id,'submission')]//div[contains(@class,'submission')]//a//span[contains(@class,'minimize')]";
		public final String addEditSubmission_batchPreview_addFilesButton="//div[starts-with(@id,'batchpreviewdialog')]//span[contains(text(),'Add files')]";
		public final String addEditSubmission_batchPreview_addFiles_uploadFilesAddButton="//div[contains(@id,'AddBatchPreviewUploadWindow')]//a//span[text()='Add']";//"//div[contains(@id,'pduploadfilesdialog')]//span[text()='Add']/following-sibling::span";
		public final String addEditSubmission_batchPreview_disabledRemoveFilesButton="//div[contains(@id,'batchpreview')]//a[contains(@class,'disabled')]//span[text()='Remove']";
		public final String addEditSubmission_batchPreview_disabledMoveToBatchButton="//div[contains(@id,'batchpreview')]//a[contains(@class,'disabled')]//span[text()='Move to Batch']";
		public final String addEditSubmission_batchPreview_disabledTargetLanguageButton="//table[contains(@name,'targetLanguageSuperBox')]//table//td//div[contains(@class,'expand')]";
		public final String addEditSubmission_batchPreview_cancelledFileCheckedX(String filename){
			return"//div[contains(@id,'batchpreview')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'none'))]//div[@name='leverageGrid']//table/tbody/tr/td[contains(@class,'crossedout')]/div[text()='"+filename+"']";
		}
		
		//expand admin
		public final String leftPane_adminButton="//span[text()='Go to Admin']/following-sibling::span";
		public final String leftPane_admin_plusButton="//span[text()='Go to Admin']/following-sibling::span";

		//reopen tab
		public final String reopenTab="//span[text()='reopen']";//"//span[text()='reopen']/following-sibling::span";
		public final String reopenTab_reopenButton="//span[text()='Reopen']";//"//span[text()='Reopen']/following-sibling::span";
		public final String reopenSubmissionWizard="//span[text()='Reopen Submission']/following-sibling::span";
		public final String reopen_checkLanguageX(String language)
		{
			return "//div[contains(@id,'pdreopensubmissiondialog')]//tr[td/div[text()='"+language+"']]/td//div[@class='x-grid-row-checker']";
		}
			
		public final String reopen_downloadButton="//div[contains(@id,'pdSubmissionReopenDialog')]//span[text()='Download']";//"//div[contains(@id,'pdreopensubmissiondialog')]//span[text()='Download']/following-sibling::span";
		public final String reopen_downloadButton_dropDown="//div[contains(@id,'pdSubmissionReopenDialog')]//a[contains(@id,'splitbutton')]//span[contains(@id,'arrow')]";
		public final String reopen_uploadTranslatableButton="//div[contains(@id,'pdreopensubmissiondialog')]//button/span[text()='Upload Translatable']";
		public final String reopen_uploadDeliverableButton="//div[contains(@id,'pdreopensubmissiondialog')]//button/span[text()='Upload Deliverable']";
		public final String reopen_cleanupReopenedButton="//div[contains(@id,'pdreopensubmissiondialog')]//button/span[text()='Cleanup Reopened']";
		public final String reopen_cleanupAndDeliverReopenedButton="//div[contains(@id,'pdreopensubmissiondialog')]//button/span[text()='Cleanup And Deliver Reopened']";
		public final String repoen_deliverReopenedTargetsButton="//div[contains(@id,'pdreopensubmissiondialog')]//button/span[text()='Deliver Reopened Targets']";
		public final String reopen_cancelButton="//div[contains(@id,'pdreopensubmissiondialog')]//button/span[text()='Cancel']";
		
		public final String downloadReopenedSubmissionWizard="//span[text()='Download Reopened Submission']";
		public final String downloadReopened_checkPhaseX(String phase)
		{
			return "//div[text()='"+phase+"']";
		}
				
		public final String downloadReopened_menuItem(String item)
		{
			return "//div[contains(@id,'menu')]//a//span[contains(text(),'"+item+"')]";
		}
		
		public final String downloadReopend_formatSelectButton="//tr[td/label[text()='Download Formats:']]/td//div[@role='button']";
		public final String downloadReopened_selectFormatX(String format) {
			return "//div[text()='"+format+"']";
		}
		public final String downloadReopend_okButton="//div[contains(@id,'pddownloadreopenedsubmissiondialog')]//a//span[text()='OK'][contains(@class,'x-btn-inner-center')]/following-sibling::span";
		public final String downloadReopend_cancelButton="//div[contains(@id,'pddownloadreopenedsubmissiondialog')]//a//span[text()='Cancel'][contains(@class,'x-btn-inner-center')]/following-sibling::span";
		
		public final String add_editSubmission_goto_SelectVendorButton="//div[contains(@id,'submission')]//span[contains(text(),'Go to Select Vendors')]/..";//"//div[contains(@id,'submission')]//span[text()='Go To Select Vendors']/..";
		
		
		//file list locators for one step WF submission in active folder
		
		public final String fileList_Gold_active(int row) {
			return "//div[contains(@id,'leverage')]//table/tbody/tr[contains(@class,'x-grid-row')]["+row+"]/td[5]/div";
		}
		public final String fileList_100percentMatch_active(int row) {
			return "//div[contains(@id,'leverage')]//table/tbody/tr[contains(@class,'x-grid-row')]["+row+"]/td[7]/div";
		}
		public final String fileList_noMatch_active(int row) {
			return "//div[contains(@id,'leverage')]//table/tbody/tr[contains(@class,'x-grid-row')]["+row+"]/td[8]/div";
		}
		public final String fileList_Repetitions_active(int row) {
			return "//div[contains(@id,'pdfileleveragestatisticsdialog')]//table/tbody/tr[contains(@class,'x-grid-row')]["+row+"]/td[6]/div";
		}
		public final String fileList_Total_active(int row) {
			return  "//div[contains(@id,'pdfileleveragestatisticsdialog')]//table/tbody/tr[contains(@class,'x-grid-row')]["+row+"]/td[9]/div";
		}
		
		public final String preview_fileList_verifyFileX(String fileName)
		{
			return "//div[contains(@id,'fileleveragestatisticsdialog')]//table[contains(@id,'gridview')]//tr//td//div[contains(text(),'"+fileName+"')]";
		}
		
		public final String preview_fileList_verifyFileName(String fileName)
		{
		//	return "//div[contains(@name,'cumulativeTmGrid')]//table[contains(@id,'gridview')]//tr//td//div[contains(text(),'"+fileName+"')]";
			return "//div[contains(@id,'SubmissionFileLeverageStatisticTabGrid')]//table[contains(@id,'gridview')]//tr[contains(@class,'grid')]//div[contains(text(),'"+fileName+"')]";
		}
		

		
		

		//file list locators for two step WF submission in active folder
		
		public final String fileList_Gold_active_twoStep(int row) {
			return "//div[contains(@id,'pdfileleveragestatisticsdialog')]//table/tbody/tr[contains(@class,'x-grid-row')]["+row+"]/td[9]/div";
		}
		public final String fileList_100percentMatch_active_twoStep(int row) {
			return "//div[contains(@id,'leverage')]//table/tbody/tr[contains(@class,'x-grid-row')]["+row+"]/td[11]/div";
		}
		public final String fileList_noMatch_active_twoStep(int row) {
			return "//div[contains(@id,'leverage')]//table/tbody/tr[contains(@class,'x-grid-row')]["+row+"]/td[12]/div";
		}
		public final String fileList_Repetitions_active_twoStep(int row) {
			return "//div[contains(@id,'pdfileleveragestatisticsdialog')]//table/tbody/tr[contains(@class,'x-grid-row')]["+row+"]/td[10]/div";
		}
		public final String fileList_Total_active_twoStep(int row) {
			return  "//div[contains(@id,'pdfileleveragestatisticsdialog')]//table/tbody/tr[contains(@class,'x-grid-row')]["+row+"]/td[13]/div";
		}
		
		
		public final String add_editSubmission_batchPreview_inputBatchName="//div[contains(@id,'batchpreview')]//input[contains(@name,'batchName')]";
		public final String add_editSubmission_batchPreview_leverageStats_inputStatstics="//div[contains(@id,'pdstatisticsgrid')]/div[not(contains(@style,'display: none'))]//table//input[@role='spinbutton']";
		
		public final String editSubmission_submissionStatstics_leverageStatsX(String statName, String statValue)
		{
			return "//div[contains(@id,'statisticspanel')]//label[span[contains(text(),'"+statName+"')]]/following-sibling::div/div[contains(text(),'"+statValue+"')]";//"//div[contains(@id,'statisticspanel')]//tr[td/label[text()='"+statName+"']]/td/div[contains(text(),'"+statValue+"')]";
		}
		
		public final String completed_EditSubmission="//span[contains(@class,'editcompletedsubmission')]";
		
		//View Columns of Submissions in Title bar
		public final String checkedOwnerMenuItem="//div[contains(@id,'menucheckitem') and contains(@class,'x-menu-item-checked')]/a/span[text()='Owner']";
		public final String checkOwnerMenuItem="//div[contains(@id,'menucheckitem')]/a/span[text()='Owner']";
		public final String ownerNameRowTitle="//div[contains(@class,'x-column-header-inner')]//span[text()='Owner']";
		
		public final String checkedSubmitterMenuItem="//div[contains(@id,'menucheckitem') and contains(@class,'x-menu-item-checked')]/a/span[text()='Submitter']";
		public final String checkSubmitterMenuItem="//div[contains(@id,'menucheckitem')]/a/span[text()='Submitter']";
		public final String submitterNameRowTitle="//div[contains(@class,'x-column-header-inner')]//span[text()='Submitter']";
		
		
		//Download History Wizard
		
		public final String downloadHistory_wizard_downloadReviewHistory_checkbox="//table[contains(@name,'downloadReviewHistoryCheckBox')]//input[contains(@name,'downloadReviewHistoryCheckBox')]";
		public final String downloadHistory_wizard_downloadReviewHistory_checkbox_checked="//input[contains(@name,'downloadReview')]";//table[contains(@name,'downloadReviewHistoryCheckBox')][contains(@class,'checked')]//input[contains(@name,'downloadReviewHistoryCheckBox')]";
		public final String downloadHistory_wizard_reviewPhase_dropDown="//table[contains(@name,'reviewPhase')]//table//div[contains(@class,'arrow-trigger')]";
		
		public final String PMassign_UserRowSelect ="//div[contains(@id,'pdSubmissionPmAssign')]//div[contains(text(),'Review')]/../following-sibling::td";

		
		public final String downloadHistory_wizard_reviewPhase_dropDownList_item(String reviewPhaseName)
		{
			return "//div[contains(@name,'reviewPhase')]//li[contains(text(),'"+reviewPhaseName+"')]";
		}
		//As per new PD5 scenario
		public final String downloadHistorywizard_downloadReviewHistory_Phasecheckbox(String PhaseName)
		{
			return "//div[contains(@id,'DownloadHistory')]//table//td//div[contains(text(),'"+PhaseName+"')]/../../td[contains(@class,'row-checker ')]//div";
		}
		public final String downloadHistorywizard_downloadReviewHistory_Phasecheckbox_Checked(String PhaseName)
		{
			return "//div[contains(@id,'DownloadHistory')]//table[contains(@class,'item-selected')]//td//div[contains(text(),'"+PhaseName+"')]/../../td[contains(@class,'row-checker ')]//div";
		}
		public final String downloadHistorywizard_downloadOptions(String Name)
		{
			return "//div[contains(@name,'"+Name+"')]//span[contains(@class,'checkbox-default')]";
		}
		public final String downloadHistorywizard_downloadOptions_Checked(String Name)
		{
			return "//div[contains(@name,'"+Name+"')][contains(@class,'checked')]//span[contains(@class,'checkbox-default')]";
		}
		
		public final String uploadReferenceFileDialog_uploadedFiles="//div[contains(@id,'uploadreferencesfiles')]//span[contains(text(),'Uploaded Files')]";
		
}
