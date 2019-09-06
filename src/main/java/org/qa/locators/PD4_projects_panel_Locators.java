package org.qa.locators;

/*Created by Alfonso Almanza
 * 01/27/11 translations.com
 */
public class PD4_projects_panel_Locators {
	private static PD4_projects_panel_Locators ue;
	
	public static synchronized PD4_projects_panel_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_projects_panel_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_projects_panel_Locators();
		}
		return ue;
	}
	
	//main window	
	public final String projects_nameRowTitle = "//div[contains(@id,'pdMainGrid')]//div[contains(@data-qtip,'Name')]";//"//div[contains(@id,'pdmaingrid')]/div/div/div/div/div/span[text()='Name']";
	public final String projects_organizationRowTitle = "//div[contains(@id,'headercontainer-')]/div[2]/div";
	public final String projects_enabledRowTitle = "//div[contains(@id,'headercontainer-')]/div[3]/div";
	public final String projects_nameRowTitleOptions = "//div[contains(@id,'headercontainer-')]/div[contains(@class,'column-header')]/div/div/following-sibling::div";//"//div[contains(@id,'headercontainer-')]/div[contains(@class,'x-column-header-first')]/div/div";
	public final String projects_organizationRowTitleOptions = "//div[contains(@id,'headercontainer-')]/div[2]/div/div[@class='x-column-header-trigger']";
	public final String projects_enabledRowTitleOptions = "//div[contains(@id,'headercontainer-')]/div[3]/div/div[@class='x-column-header-trigger']";
	public final String projects_rowTitleOptionX(int i)
	{
		return "//div[contains(@id,'headercontainer-')]/div["+i+"][contains(@id,'gridcolumn')]//div[contains(@class,'-header-trigger')]";//"//div[contains(@id,'headercontainer-')]/div["+i+"][contains(@id,'gridcolumn')]//div//span/following-sibling::div";
	}
	
	
	//Projects Panel Locators
	public final String project_firstDataRowName = "//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";
	public final String project_firstDataRowOrganization = "//tbody//tr//td[2]//div";
	public final String project_firstDataRowStatus = "//tbody//tr//td[3]//div";
	public final String project_secondDataRowName = "//div[contains(@id,'pdMainGrid')]//table[2]//td[1]//div";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')][2]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";
	public final String projects_addProjectButton = "//span[contains(@id,'add_project')]";
	public final String projects_viewCostsButton = "//span[contains(@id,'project_cost')]";
	public final String projects_copyProjectButton = "//span[contains(@id,'copy_project')]";
	public final String projects_editProjectButton = "//span[contains(@id,'edit_project')]";
	public final String projects_enableDisableProjectButton = "//span[contains(@id,'enable_project')]";
	public final String projects_announcementButton = "//span[contains(@id,'project_announcement')]";
	
	//Edit Project tabs
	public final String editProject_GeneralTab="//div[contains(@id,'AdminProjectEdit')]//span[contains(text(),'General')]";
	public final String editProject_organizationTab = "//div[contains(@id,'project') or contains(@id,'Project')]//span[text()='Organization']";
	public final String editProject_quotesTab = "//div[contains(@id,'project') or contains(@id,'Project')]//span[text()='Quotes']";
	public final String editProject_workflowsTab = "//div[contains(@id,'Project') or contains(@id,'project')]//span[contains(text(),'Workflows')]";
	public final String editProject_customAttributeTab = "//span[contains(text(),'Custom Attributes')]";
	public final String editProject_fileFormatsTab = "//div[contains(@id,'project') or contains(@id,'Project')]//span[text()='File Formats']";
	public final String editProject_languageModelTab = "//div[contains(@id,'AdminProjectEdit')]//span[contains(text(),'Language Models')]";//"//div[contains(@id,'tab')]//span[contains(text(),'Language Models')]";//"//div[contains(@id,'tab')]//span[contains(text(),'Language Model')]/..";
	public final String editProject_languagesTab = "//div[contains(@id,'tab')]//span[text()='Languages']/..";//div[contains(@id,'pdprojecttabpanel')]//span[text()='Languages']/..";
	public final String editProject_translationMemoryTab = "//div[contains(@id,'Project') or contains(@id,'project')]//span[text()='TM']";//"//div[contains(@id,'Project') or contains(@id,'project')]//span[text()='Translation Memory']";
	public final String editProject_vendorsTab = "//div[contains(@id,'tab')]//span[text()='Vendors']";
	public final String editProject_tsoTab="//div[contains(@id,'tab')]//span[text()='Linguist']";
	public final String editProject_transcheckTab = "//div[contains(@id,'project') or contains(@id,'Project')]//span[text()='Transcheck']";
		
	//Edit Project Window
	public final String editProject_WindowOkButton = "//div[contains(@id,'pdAdminProjectEditWindow')]//span[contains(text(),'OK')]/..";
	public final String editProject_WindowCancelButton = "//div[contains(@id,'pdAdminProjectEditWindow')]//span[text()='Cancel']";//div[contains(@id,'pdAdminProjectEditWindow')]//span[contains(text(),'Cancel')]";
	public final String editProject_OkButton = "//div[contains(@id,'project') or contains(@id,'Project')]//div[contains(@id,'toolbar')]//span[text()='OK']";
	public final String editProjectAddOrgUSer_OkButton="css=div[id*='pdprojectorganizationroleadd'] button>span:contains('OK')";
	public final String editProject_ApplyButton = "//div[contains(@id,'project') or contains(@id,'Project')]//div[contains(@id,'toolbar')]//span[text()='Apply']";
	public final String editProject_NewButton = "//div[contains(@id,'AdminProjectEditTab')]//span[contains(text(),'New')]";//"//div[contains(@id,'ProjectEditTabOrganizationPanel')]//span[contains(text(),'Add')]";//"//div[contains(@id,'Project')or contains(@id,'project')]//span[contains(text(),'New')]/..";//"//div[not(contains(@style,'display: none')) and starts-with(@id,'pdAdminProjectEditTabFileFormatPanel') and contains(@class,'x-tabpanel-child')]//span[contains(text(),'New')]/..";
	public final String editProject_EditButton = "//div[contains(@id,'Project')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'none'))]//span[text()='Edit']";//div[contains(@id,'Project')]//span[text()='Edit']";
	public final String editProject_DisabledEditButton = "//div[contains(@class,'pd_project_edit_tab')][not(contains(@style,'none'))]//a[contains(@class,'disabled')]//span[text()='Edit']";//div[not(contains(@style,'display: none')) and starts-with(@id,'pdproject') and contains(@class,'x-tabpanel-child')]//div[contains(@class,'x-item-disabled')]//span[contains(text(),'Edit')]/..";
	public final String editProject_DeleteButton = "//div[contains(@id,'Project')or contains(@id,'project')]//a//span[contains(text(),'Delete')]";//"//div[contains(@id,'Project')or contains(@id,'project')]//a//span[contains(text(),'Delete')]";//"//div[contains(@id,'Project')or contains(@id,'project')]//span[text()='Delete']";//"//div[not(contains(@style,'display: none')) and starts-with(@id,'pdproject') and contains(@class,'x-tabpanel-child')]//span[contains(text(),'Delete')]/..";
	public final String editProject_DisabledDeleteButton ="//div[contains(@id,'Project')or contains(@id,'project')][not(contains(@style,'none'))]//a[contains(@class,'disabled')]//span[contains(text(),'Delete')]";//"//div[contains(@id,'Project')or contains(@id,'project')][not(contains(@style,'none'))]//a[contains(@class,'disabled')]//span[text()='Delete']";//div[not(contains(@style,'display: none')) and starts-with(@id,'pdproject') and contains(@class,'x-tabpanel-child')]//div[contains(@class,'x-item-disabled')]//span[contains(text(),'Delete')]/..";
	
	
	public final String editProject_generalTab_CostScope = "//input[contains(@name,'costScope')]" ;
	public final String editProject_generalTab_AutoStart = "//input[contains(@name,'autoStartSubmission')]";
	public final String editProject_generalTab_AutoStartChecked = "//div[contains(@name,'autoStartSubmission')]";//"//table[contains(@name,'autoStartSubmission')][contains(@class,'x-form-cb-checked')]";//table[@name='autoStartSubmission'][contains(@class,'x-form-cb-checked')]";
	public final String editProject_generalTab_MandatoryPoNumber = "//input[contains(@name,'mandatoryPONumber')]";
	public final String editProject_generalTab_MandatoryPoNumberChecked = "//table[@name='mandatoryPONumber'][contains(@class,'x-form-cb-checked')]";
	public final String editProject_generalTab_ForbidAcceptingAutoQuote = "//input[contains(@name,'preventAcceptingAutoQuotes')]/following-sibling::span";
	public final String editProject_generalTab_ForbidAcceptingAutoQuoteChecked = "//div[contains(@class,'checked')]//input[contains(@name,'preventAcceptingAutoQuotes')]";
	public final String editProject_generalTab_SubmissionNameInLocalizationKit = "//input[contains(@name,'submissionNameInLocKit')]";
	public final String editProject_generalTab_AppendDeliverableLanguageSuffix = "//input[contains(@name,'appendDeliverableLanguageSuffix')]";
	public final String editProject_generalTab_AllowTXMLOnline = "//input[contains(@name,'otsTxmlEnabled')]/following-sibling::span";//"//input[contains(@name,'otsTxmlEnabled')]";
	public final String editProject_generalTab_AllowTXMLOnlineChecked = "//div[contains(@name,'otsTxmlEnabled') and contains(@class,'checked')]";
	public final String editProject_generalTab_SetDefaultWorkflow = "//input[contains(@name,'defaultWorkflow')]";
	public final String editProject_generalTab_Extractzipbydefault = "//input[contains(@name,'extractZipByDefault')]";		
	public final String editProject_generalTab_SelectOrganization = "//div[contains(@id,'pdAdminProjectEditTabGeneralInformation')]//div[contains(@name,'organization')]//div[contains(@class,'x-form-arrow-trigger')]";//"//div[starts-with(@id,'pdAdminProjectEditTabGeneralInformation')]//table[contains(@name,'p_organization')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String editProject_generalTab_cancelByClientIdentifier_select = "//table[@name='p_cancelByClientIdentifier']//div[contains(@class,'x-form-arrow-trigger')]";
	public final String editProject_generalTab_cancelByClientIdentifier_selectCancelOnResubmission = "//div[@name='p_cancelByClientIdentifier-boundlist']//li[text()='Cancel on Resubmission']";
	public final String editProject_generalTab_cancelByClientIdentifier_selectCancelToThisProject = "//div[@name='p_cancelByClientIdentifier-boundlist']//li[text()='Cancel on Resubmission to this Project']";
	public final String editProject_generalTab_cancelByClientIdentifier_selectDoNotCancel = "//div[@name='p_cancelByClientIdentifier-boundlist']//li[text()='Do Not Cancel']";
	public final String editProject_generalTab_Allow_TXML_Online = "//input/following-sibling::label[text()='Allow TXML Online']";//input[@name='otsTxmlEnabled']";
	public final String editProject_generalTab_SelectOrg_warningMessage_continueButton="//div[contains(@id,'warningdialog')]//span[contains(text(),'Continue')]/following-sibling::span";
	
	
	public final String editProject_transcheckTab_transcheckEnabled_checkbox="//div[contains(@name,'TranscheckEnabled')][contains(@class,'checkbox')]//input[contains(@name,'TranscheckEnabled')]";//"//table[contains(@name,'transcheckEnabled')]//td//input[contains(@name,'transcheckEnabled')]";
	public final String editProject_transcheckTab_transcheckEnabled_checkbox_checked="//div[contains(@name,'TranscheckEnabled')][contains(@class,'checked')]//input[contains(@name,'TranscheckEnabled')]";//"//table[contains(@name,'transcheckEnabled')][contains(@class,'checked')]//td//input[contains(@name,'transcheckEnabled')]";
	
	
	public final String editProject_generalTab_CostModelX(String CostModel){
		return "//div[contains(@id,'boundlist')]//li[contains(@class,'x-boundlist-item') and text()='"+ CostModel +"']";
	}
	
	public final String editProject_generalTab_SelectOrgUserX(String orgUser){
		return "//div//div//li/div[text()='"+orgUser+"']";//div[contains(@id,'boundlist')]//div[contains(@class,'x-combo-list-item')][text()='"+orgUser+"']";

	}
	
	//Custom attributes
	public final String editProject_customattributesTab_NewCustomAttribute = "//div[contains(@class,'customattribute')or contains(@id,'Custom')]//span[text()='New']";	
	public final String editProject_customattributesTab_DeleteCustomAttribute = "//div[contains(@class,'customattribute')or contains(@id,'Custom')]//span[text()='Delete']/..";
	public final String editProject_customattributesTab_name_input = "//div[contains(@id,'pdAdminProjectEditTabCustomAttribute')]//table//div[contains(@id,'ext-comp')][not(contains(@style,'display: none'))]//input";
	public final String editProject_customattributesTab_fieldType_selectArrow = "//div[contains(@id,'pdAdminProjectEditTabCustomAttribute')]//table//td//div[contains(@class,'arrow-trigger')]";
	public final String editProject_customattributesTab_fieldType_comboValue = "//li[text()='COMBO']";
	public final String editProject_customattributesTab_fieldType_input = "//input[@name='type']";
	public final String editProject_customattributesTab_comboValues_input = "//div[contains(@id,'CustomAttributeGrid')]//table//tr//input";
	public final String editProject_customattributesTab_fieldDescription = "//div[contains(@id,'CustomAttribute')]//table[contains(@class,'selected')]//td//div//input";//"//div[contains(@id,'pdAdminProjectEditTabCustomAttribute')]//div[contains(@id,'ext-comp') and contains(@class,'small-editor')][not(contains(@style,'display: none'))]//table//input[contains(@class,'focus')]";
	public final String editProject_customattributesTab_comboValues (Integer row){
		return "//div[contains(@id,'pdAdminProjectEditTabCustomAttribute')]//table["+row+"]//tr//td[3]";
	}
	public final String editProject_customattributesTab_DescriptionValues (Integer row){
		return "//div[contains(@id,'pdAdminProjectEditTabCustomAttribute')]//table["+row+"]//tr//td[4]";
	}
	
	public final String editProject_customattributesTab_name (Integer row){
		return "//div[contains(@id,'pdAdminProjectEditTabCustomAttribute')]//table["+row+"]//tr//td";
	}
	
	public final String editProject_customattributesTab_mandatory (Integer row){
		return "//div[contains(@id,'pdAdminProjectEditTabCustomAttribute')]//table["+row+"]//tr//td[5]//div[contains(@class,'x-grid-checkcolumn')]";
	}	
	
	public final String editProject_customattributesTab_fieldType(Integer row){
		return "//div[contains(@id,'pdAdminProjectEditTabCustomAttribute')]//table["+row+"]//tr//td[2]";
	}
	
	
	public final String selectProjectX(String projectName){
		return "//div[contains(@id,'pdMainGrid')]//table//tr//td//div[text()='"+projectName+"']";
	}
	

	//Announcement window	
	public final String announcement_announcementEditor_inputAnnouncementFrame = "//div[contains(@id,'pdannouncement')]//iframe[contains(@class,'htmleditor-iframe')]";//"//div[contains(@id,'pdannouncement')]//iframe[@class='x-htmleditor-iframe']";
	public final String announcement_announcementEditor_inputAnnouncementFrameInputText = "//html//body";
	public final String announcement_announcementEditor_BoldButton ="//span[contains(@class,'x-edit-bold')]/..";
	public final String announcement_announcementEditor_ItalicButton ="//span[contains(@class,'x-edit-italic')]/..";
	public final String announcement_announcementEditor_UnderlineButton ="//span[contains(@class,'x-edit-underline')]/..";
	public final String announcement_announcementEditor_IncreaseFontSizeButton ="//span[contains(@class,'x-edit-increasefontsize')]/..";
	public final String announcement_announcementEditor_DecreaseFontSizeButton ="//span[contains(@class,'x-edit-decreasefontsize')]/..";
	public final String announcement_announcementEditor_EditFontColorButton ="//span[contains(@class,'x-edit-forecolor')]/..";
	public final String announcement_announcementEditor_EditBackColorButton ="//span[contains(@class,'x-edit-backcolor')]/..";
	public final String announcement_announcementEditor_EditTextAlignLeftButton ="//span[contains(@class,'x-edit-justifyleft')]/..";
	public final String announcement_announcementEditor_EditTextAlignCenterButton ="//span[contains(@class,'x-edit-justifycenter')]/..";
	public final String announcement_announcementEditor_EditTextAlignRightButton ="//span[contains(@class,'x-edit-justifyright')]/..";
	public final String announcement_announcementEditor_EditHyperlinkButton ="//span[contains(@class,'x-edit-createlink')]/..";
	public final String announcement_announcementEditor_EditNumberedListButton ="//span[contains(@class,'x-edit-insertorderedlist')]/..";
	public final String announcement_announcementEditor_EditBulletListButton ="//span[contains(@class,'x-edit-insertunorderedlist')]/..";
	public final String announcement_announcementEditor_EditSourceEditButton ="//span[contains(@class,'x-edit-sourceedit')]/..";
	public final String announcement_announcementEditor_EditSourceEditButtonPressed ="//span[contains(@class,'x-edit-sourceedit')]";
	public final String announcement_announcementEditor_EditTextArea ="//div[contains(@id, 'htmleditor')]//textarea";
	public final String announcement_CloseButton = "//div[contains(@id,'pdannouncementeditor')]//span[text()='Close']/..";
	public final String announcement_AddButton = "//div[contains(@id,'pdannouncementeditortoolbar')]//span[text()='Create']/..";//"//div[contains(@id,'pdannouncementeditortoolbar')]//span[text()='Add']/..";
	public final String announcement_SaveAllButton = "//div[contains(@id,'pdannouncementeditor')]//span[text()='Save All']/..";
	public final String announcement_UpdateButton = "//div[contains(@id,'pdannouncementeditortoolbar')]//span[text()='Update']/..";
	public final String announcement_DeleteButton = "//div[contains(@id,'pdannouncementeditortoolbar')]//span[text()='Delete']/..";
	public final String announcement_EditButton = "//div[contains(@id,'pdannouncementeditortoolbar')]//span[text()='Edit']/..";
	public final String announcement_ResetButton = "//div[contains(@id,'pdannouncementeditortoolbar')]//span[text()='Reset']/..";
	public final String announcement_crossButton="//div[contains(@id,'pdannouncementeditor')]//div[contains(@class,'tool-close')]";//"//div[contains(@id,'pdannouncementeditor')]//img[contains(@class,'x-tool-close')]";

	
	public final String announcement_announcementPresent (String text){
		return "//table//tbody//tr//td//div[contains(text(),'"+text+"')]";//"//table//tbody//tr//td//div//font[contains(text(),'"+text+"')]";
	}
	public final String announcement_announcementTextPresent (String text){
		return "//div[contains(@id,'pdannouncement')]//table//tr//td//div[text()='"+text+"']";//"//div[contains(@id,'pdannouncement')]//table//tr//td//div//font[text()='"+text+"']";
	}	
	
	//Add Project Window - step 1: General
	public final String addProject_inputProjectName = "//input[contains(@id,'textfield')][contains(@name,'projectName')]";
	public final String addProject_selectOrganizationFind = "//div[contains(@name,'organization')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String addProject_SelectOrganizationArrow ="//table[contains(@name,'organization')]//table[contains(@id,'combobox') and contains(@class,'x-form-trigger-wrap')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String addProject_inputOrganization = "//div[contains(@name,'organization')]//input[contains(@name,'organization')]";//"//table[contains(@name,'organization')]//table[@class='x-form-trigger-wrap']//input[contains(@name,'organization')]";
	public final String addProject_SelectOrganizationX(String organization){		
		return "//div[contains(@id,'boundlist')]//li//div[ text()='"+organization+"']";
	}
	public final String addProject_CancelButton = "//div[contains(@id,'pdAdminProjectAddWizard')]//span[contains(text(),'Cancel')]/..";
	
	
	//Add Project Wizard - Step 2 Locators
	public final String addProject_newButton="//div[contains(@id,'Project') or contains(@id,'project')]//span[text()='New']";
	public final String addProject_ClickFirstSourceLanguage = "css=div[class='x-panel-body x-panel-body-noheader'] div.x-grid3-body>div td>div";
	public final String addProject_ClickLastSourceLanguage = "//div[contains(@name,'grid')]//table[last()]//tbody/tr/td/div";//"//div[@name='p_grid']//tbody/tr[last()]/td/div";
	public final String addProject_SelectSourceLanguage = "//div[contains(@name,'pdAdminGlobalComboEditor')]//div[contains(@class,'arrow-trigger')]";
	public final String addProject_ClickFirstTargetLanguage = "css=div[class='x-panel-body x-panel-body-noheader'] div[class='x-grid3-body']>div td::nth-child(2)/div";
	public final String addProject_ClickLastTargetLanguage = "//div[contains(@name,'grid')]//table[last()]//tbody/tr/td[2]/div";//"//div[@name='p_grid']//tbody/tr[last()]/td[2]/div";//css=div[class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable'] table[class='x-grid-table x-grid-table-resizer']>tbody>tr:last-child>td:nth-child(2)>div";//css=div[class='x-panel-body x-panel-body-noheader'] div[class='x-grid3-body']>div:last-child td::nth-child(2)/div";
	public final String addProject_SelectTargetLanguage = "//div[contains(@name,'pdAdminGlobalComboEditor')]//div[contains(@class,'arrow-trigger')]";
	public final String addProject_checkLastLanguageDefault = "//div[@name='p_grid']//table[last()]//tbody/tr[last()]/td[3]/div";//"//div[@name='p_grid']//tbody/tr[last()]/td[3]/div";//"css=div[class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable'] table[class='x-grid-table x-grid-table-resizer']>tbody>tr:last-child>td:nth-child(3)>div";//css=form[class='x-panel-body x-small-editor-body-noheader x-small-editor-body-noborder x-form']>div:nth-child(2)>div>div>div>div>div:nth-child(2)>div:nth-child(1)>div:last-child>table>tbody>tr>td:nth-child(3)>div>div";
	public final String addProject_SelectLastLanguageRow = "//div[@name='p_grid']//table/tbody/tr[last()]/td[contains(@class,' x-grid-cell')]/div[not(contains(@style,'hidden'))]";
	public final String addProject_ErrorCloseButton ="//div[contains(@id,'warningdialog')]//span[contains(text(),'Close')]";
	public final String addProject_Nextbuttondisable= "//div[contains(@id,'toolbar') and contains(@class,'x-toolbar-footer')]//a[contains(@class,'x-item-disabled')]//span[contains(text(),'Next >')]/..";
	public final String addProject_VendorOkbuttondisable="//div[contains(@id,'pdAdminProjectGlobalVendorAdd')]//a[contains(@class,'disabled')]//span[contains(text(),'OK')]/..";//div[contains(@id,'toolbar') and contains(@class,'x-toolbar-footer')]//div[contains(@class,'x-item-disabled')]//span[contains(text(),'OK')]/..";
	public final String addProject_nextButton="//span[contains(text(),'Next')]";	
	public final String addProject_SelectSourceLanguageX(String language){
		return "//div[contains(@name,'pdAdminGlobalComboEditor')]//li[text()='"+language+"']";
	}
	
	public final String addProject_SelectTargetLanguageX(String language){
		return "//div[contains(@id,'boundlist') and contains(@name,'pdAdminGlobalComboEditor') and not(contains(@style,'display: none'))]//li[text()='"+language+"']";
	}
	
	//Add Project Wizard Step 3 - Locators	
	public final String addProjectStep3_newButton = "//a[contains(@data-qtip,'You can add new formats here.')]//span[text()='New']/following-sibling::span";
	public final String addProject_inputFileFormatName = "//input[contains(@name,'formatName')]";	
	public final String addProject_selectNewFileFormat = "//table[2]/tbody/tr/td[2]/table/tbody/tr/td[2]/div";
	public final String addProject_selectFileFormat_header_checkbox="//div[contains(@id,'ProjectGlobalFileFormat')]//div[contains(@id,'checkcolumn')]//span[contains(@class,'checkheader')]";
	public final String addProject_selectFileFormat_header_checkbox_checked="//div[contains(@id,'ProjectGlobalFileFormat')]//div[contains(@id,'checkcolumn')]//span[contains(@class,'checkcolumn-checked')]";
	public final String addProject_selectFileFormatX(String fileFormat){
		return "//div[contains(@id,'Project') or contains(@id,'project')]//table//tr//td[div//span[text()='"+fileFormat+"']]/following-sibling::td//div[contains(@class,'grid-checkcolumn')]";
	}	
	public final String addProject_selectFileFormatX_checked(String fileFormat){
		return "//div[contains(@id,'Project') or contains(@id,'project')]//table//tr//td[div//span[text()='"+fileFormat+"']]/following-sibling::td//div[contains(@class,'grid-checkcolumn-checked')]";
	}	
	
	public final String addProject_selectFileFormat_rowNumber(int rowNumber){
		return "//div[contains(@id,'Project') or contains(@id,'project')]//div[contains(@id,'FileFormat')]//table["+rowNumber+"]";
	}	
	
	
	
	public final String addProject_addFileFormatSelectDefault(String fileFormat){
		return "//div[contains(@id,'Project') or contains(@id,'project')]//table//tr//td[div//span[text()='"+fileFormat+"']]/following-sibling::td//div[contains(@class,'grid-radio')]";
	}
	public final String addProject_addFileFormatSelectDefault_Selected(String fileFormat){
		return "//div[contains(@id,'Project') or contains(@id,'project')]//table//tr//td[div//span[text()='"+fileFormat+"']]/following-sibling::td//div[contains(@class,'x-grid-radio-col-on')]";
	}
	public final String addProject_addFileFormatOkButton = "//div[contains(@id,'FileFormat')]//div[contains(@id,'toolbar')]//span[contains(@id,'button') and contains(text(),'OK')]//following-sibling::span";
	public final String addProject_addFileFormatErrorMessageOkButton = "css=div[class='x-panel-fbar x-small-editor x-toolbar-layout-ct']>table>tbody>tr>td>table>tbody>tr>td>table>tbody>tr:nth-child(2)>td:nth-child(2)>em button:contains('OK')";
	
	
	//Add Project Wizard Step 4 - Workflow
	
	public final String editProject_selectAllWorkflows_checked = "//span[contains(@class,'checked')][following-sibling::span[text()='Available']]";
	
	public final String editProject_workFlow_firstRow="//div[contains(@name,'workflow')]//table//tr";
	
	public final String addProject_workFlow_firstRow="//div[contains(@name,'workflow')]//table//tr";
	
	public final String addProject_selectAllWorkflows = "//div[contains(@id,'Project') or contains(@id,'project')]//div[contains(@id,'Workflow')]//span[text()='Available']/preceding-sibling::span";
		
	public final String addProject_CheckWorkflowAvailableX_byName(String name){
		return "//div[contains(@name,'workflow')]//table//td[div[text()='"+name+"']]/preceding-sibling::td[2]";
	}
	public final String addProject_CheckWorkflowAvailableX_byName_Checked(String name){
		return "//div[contains(@name,'workflow')]//table//td[div[text()='"+name+"']]/preceding-sibling::td[2]//div[contains(@class,'checked')]";//"//div[contains(@name,'workflow')]//table//td[div[text()='"+name+"']]/preceding-sibling::td[2]//img[contains(@class,'checked')]";
	}
	
	
	public final String addProject_CheckWorkflowDefaultX_byName_isSelected(String name){
		return "//div[contains(@name,'workflow')]//table//td[div[text()='"+name+"']]/preceding-sibling::td[1][contains(@class,'focused')]";
	}

	
	public final String addProject_CheckWorkflowDefaultX_byName(String name){
		return "//div[contains(@name,'workflow')]//table//td[div[text()='"+name+"']]/preceding-sibling::td[1]";
	}

	
	public final String addProject_selectWorkflow_byRowNumber(int rowNumber){
		return "//div[contains(@name,'workflow')]//table["+rowNumber+"]//tr";
	}
	
	//Add Project Wizard Step 5 - Locators
	public final String addProject_NewVendorButton = "//a[contains(@data-qtip,'Add new vendors.')]//span[text()='New']";//"//a[contains(@data-qtip,'You can add new vendors here')]//span[text()='New']";
	public final String addProject_DeleteDefaultVendorName = "//div[contains(@id,'pdAdminProjectGlobalVendor')]//div[contains(@class,'triggerClearAll')]";
	public final String addProject_SelectVendorName = "//div[contains(@name,'vendor')]//div[contains(@class,'triggerExpand ')]";
	public final String addProject_SelectVendorName_td ="//table[contains(@name,'vendor')]//td[contains(@class,'superboxselect')]";
	public final String addProject_SelectVendorRole = "//div[contains(@name,'roles')]//div[contains(@class,'triggerExpand')]";
	public final String addProject_SelectVendorRole_td ="//table[contains(@name,'roles')]//td[contains(@class,'superboxselect')]";
	public final String addProject_VendorCheckFirstLanguageRow = "//div[contains(@class,'x-grid-row-checker')]";
	public final String addProject_VendorCheckAllLanguageRows = "//div[contains(@id,'pdvendorlanguagegrid')]//div[contains(@id,'headercontainer') and contains(@class,'x-box-inner')]/div/div[3]//div[contains(@class,'x-column-header-inner')]//span[contains(@id,'gridcolum') and contains(@class,'x-column-header-text')]";//"css=form.x-panel-body.x-form>div:nth-child(4)>div>div>div>div>div>div>div>table>thead>tr>td>div>div.x-grid3-hd-checker";
	public final String addProject_VendorAddVendorOkButton = "//div[contains(@id,'pdAdminProjectGlobalVendorAdd')]//span[contains(text(),'OK')]";
	public final String editProject_vendorAddVenodrOkButton="//div[contains(@id,'vendor') or contains(@id,'Vendor')]//span[contains(text(),'OK')]";
	public final String addProject_VendorName = "//input[contains(@name,'vendors')]";//"css=input[name='vendor']";
	public final String addProject_VendorRoleName = "//input[contains(@name,'roles')]";
	public final String addProject_finishButton = "css=table>tbody>tr>td:nth-child(2)>table>tbody>tr>td>table>tbody>tr>td:nth-child(2)>table>tbody>tr:nth-child(2)>td:nth-child(2)>em button:contains('Finish')";
	public final String addProject_deleteDefaultVendorRole="//div[contains(@id,'projectaddvendor')]//table[contains(@class,'x-form-dirty')]//li/a[contains(@class,'superboxselect-item-close')]";
	public final String addProject_addVendor_windowTitle="//div[contains(@id,'VendorAdd')]//span[text()='Add Vendor']";
	public final String addProject_addVendor_nameLabel="//div[contains(@id,'VendorAdd')]//div//span[contains(text(),'Name')]";
	public final String addProject_addVendor_roleLabel="//div[contains(@id,'VendorAdd')]//div//span[contains(text(),'Role')]";
	public final String addProject_addVendor_languageGrid_headerCheckBox="//div[contains(@id,'VendorAdd')]//div[contains(@name,'languageGrid')]//div[contains(@class,'header-last')]//div[@class='x-column-header-text']";
	public final String editProject_addVendor_languages_headerCheckbox="//div[contains(@id,'vendorlanguagegrid')]//div[contains(@id,'gridcolumn')][contains(@class,'x-column-header-last')]//div[contains(@id,'gridcolumn')][@class='x-column-header-text']";
	
	public final String addProject_SelectVendorNameX(String vendorName){
		return "//div[contains(@name,'vendors-boundlist')]//div[text()='"+vendorName+"']";
	}
	
	public final String addProject_SourceLangBlock ="//div[starts-with(@id,'pdvendorlanguagegrid')]//div[starts-with(@id,'gridview') and contains(@class,'x-grid-view-default')]";
	
	public final String add_project_newVendorLanguage_rowTable_notSelected = "//div[starts-with(@id,'pdvendorlanguagegrid')]//tr[starts-with(@class,'x-grid-row')]/td[contains(@class,'x-grid-cell-row-checker')]/..";
	public final String add_project_newVendorLanguage_rowTable_checkBox(int row) 
	{
		return "//div[starts-with(@id,'pdvendorlanguagegrid')]//tr[starts-with(@class,'x-grid-row')][child::td[contains(@class,'x-grid-cell-row-checker')]]["+row+"]//div[contains(@class,'x-grid-row-checker')]";
	}
	
	public final String add_project_addVendor_selectLanguagePairX(String srclanguage,String tgtLanguage)
	{
		return "//div[contains(@id,'vendorlanguage')]/div/table//tr[td/div[text()='"+srclanguage+"']]/td[div[text()='"+tgtLanguage+"']]/following-sibling::td/div/div";
	}
		
	public final String addProject_SelectVendorRoleX(String roleName){
		//return "css=div[class*= 'boundlist'] ul>li:contains('"+roleName+"')";	
		return "//div[contains(@class,'boundlist')]/ul//li//div[text()='"+roleName+"']";
	}
	
	//Edit Project Window - General Tab  pdnewprojecteditvendor
	public final String editProject_inputProjectName = "//input[contains(@id,'textfield')][contains(@name,'projectName')]";
	public final String editProject_VendorEditVendorOkButton = "//div[contains(@id,'vendor')or contains(@id,'Vendor')]//span[contains(text(),'OK')]";
	
	//Edit Project Vendor Tab
	public final String editProject_vendorTab_NewVendorOkButton = "//div[starts-with(@id,'pdnewprojectaddvendor')]//div[starts-with(@id,'toolbar') and contains(@class,'x-toolbar-footer')]//span[starts-with(@id,'button') and contains(text(),'OK')]/..";	
	public final String editproject_vendorTab_inputClaimDelay="//input[contains(@name,'claimDelay')]";
	public final String editProject_vendorsTab_SelectVendorRoleProjectTranslator = "//div[@name='roles-boundlist']//li[contains(text(),'project_translator')]";		
	public final String editProject_EditVendorOkButton = "//div[starts-with(@id,'pdnewproject')]//div[starts-with(@id,'toolbar') and contains(@class,'x-toolbar-footer')]//span[starts-with(@id,'button') and contains(text(),'OK')]/..";
	public final String editProject_EditVendorTitleVendor = "//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')][contains(@id,'project') or contains(@id,'Project')]//span[contains(text(),'Vendor')]/..";//div[not(contains(@style,'display: none')) and starts-with(@id,'pdproject') and contains(@class,'x-tabpanel-child')]//span[contains(text(),'Vendor')]/..";
	public final String editProject_VendorColumnArrow ="//div[contains(@name,'grid')]//div[contains(@class,'column-header-trigger')]";//"//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')][contains(@id,'project') or contains(@id,'Project')]//span[contains(text(),'Vendor')]/../div[contains(@class,'x-column-header-trigger')]";
	public final String editProject_VendorColumnVendor = "//a[contains(@id,'menucheckitem') and contains(@class,'x-menu-item-link')]/span[contains(@id,'menucheckitem') and contains(text(),'Vendor')]/following-sibling::div";

	public final String editProject_newVendorButton = "//div[contains(@id,'project')or contains(@id,'Project')]//div[contains(@id,'vendor')or contains(@id,'Vendor')]//span[text()='New']";
	public final String editProject_editVendorButton = "//div[contains(@id,'project')or contains(@id,'Project')]//div[contains(@id,'vendor')or contains(@id,'Vendor')]//span[text()='Edit']/..";
	public final String editProject_deleteVendorButton = "//div[contains(@id,'project')or contains(@id,'Project')]//div[contains(@id,'vendor')or contains(@id,'Vendor')]//span[text()='Delete']/..";
	public final String editProject_deleteDefaultVendorName = "//div[contains(@class,'triggerClearAll')]";
	public final String editProject_VendorAddVendorOkButton = "//div[contains(@id,'Vendor')]//span[contains(text(),'OK')]/..";
	
	public final String editProject_vendorTab_editVendor_TitleLanguages = "//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')][contains(@id,'project') or contains(@id,'Project')]//span[contains(text(),'Languages')]/..";//div[not(contains(@style,'display: none')) and starts-with(@id,'pdproject') and contains(@class,'x-tabpanel-child')]//span[contains(text(),'Languages')]/..";
	public final String editProject_vendorTab_editVendor_TitleRole = "//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')][contains(@id,'project') or contains(@id,'Project')]//span[contains(text(),'Role')]/..";//div[not(contains(@style,'display: none')) and starts-with(@id,'pdproject') and contains(@class,'x-tabpanel-child')]//span[contains(text(),'Role')]/..";
	public final String editProject_vendorTab_editVendor_TitleClaimDelay = "//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')][contains(@id,'project') or contains(@id,'Project')]//span[contains(text(),'Claim Delay')]/..";//div[not(contains(@style,'display: none')) and starts-with(@id,'pdproject') and contains(@class,'x-tabpanel-child')]//span[contains(text(),'Claim Delay')]/..";
	public final String editProject_vendorTab_VendorColumnLanguages = "//a[contains(@id,'menucheckitem') and contains(@class,'x-menu-item-link')]/span[contains(@id,'menucheckitem') and contains(text(),'Languages')]/following-sibling::div";
	public final String editProject_vendorTab_VendorColumnRole = "//a[contains(@id,'menucheckitem') and contains(@class,'x-menu-item-link')]/span[contains(@id,'menucheckitem') and contains(text(),'Role')]/following-sibling::div";
	public final String editProject_vendorTab_VendorColumnClaimDelay = "//a[contains(@id,'menucheckitem') and contains(@class,'x-menu-item-link')]/span[contains(@id,'menucheckitem') and contains(text(),'Claim Delay')]/following-sibling::div";
	
	public final String editProject_vendorTab_roles_firstRow_td ="//div[contains(@id,'pdprojectvendorrole')]//div[contains(@id,'gridview')]//tr/td[3]/div";
	public final String editProject_vendorTab_language_firstRow_td ="//div[contains(@id,'pdprojectvendorrole')]//div[contains(@id,'gridview')]//tr/td[2]/div";
	public final String editProject_editVendor_VendorOkButton = "//div[contains(@id,'pdnewprojecteditvendor')]//span[contains(text(),'OK')]/..";
	public final String editProject_SelectVendorNameX(String vendorName){
		return"//div[contains(@id,'ProjectEditTabVendor') and contains(@name,'grid')]//table//tr//td//div[text()='" + vendorName + "']";
		
	}
	
	public final String editProject_SelectVendorRoleX(String roleName){
		//return "//div[@name='vendorGrid']//span[text()='" + roleName + "']";
		return "//div[contains(@id,'ProjectEditTabVendor') and contains(@name,'grid')]//table//tr//td//div//span[text()='" + roleName + "']";
	}
	
	public final String editProject_vendorsTab_vendorRowX(Integer row){
		return "//div[contains(@id,'ProjectEditTabVendorGrid')]//table["+row+"]//tr//td";//"//div[contains(@id,'project')or contains(@id,'Project')]//table[contains(@id,'grid')]/tbody/tr["+row+"]/td";//div[contains(@id,'project')or contains(@id,'Project')]//div[contains(@id,'gridpanel')]/div[contains(@id,'gridview')]//tr[contains(@class,'x-grid-row')]['"+row+"']/td[1]/div";
	}
	
	public final String editProject_editVendor_SelectVendorRoleX(String roleName){
		return "css=div[class= 'x-boundlist-list-ct']>ul li:contains('" + roleName + "')";	
	}
	
	public final String editProject_editVendor_checkUncheckTargetLanguageX(String language){
		return "//div[contains(@id,'vendorlanguagegrid')]//td[div[text()='"+language+"']]/following-sibling::td/div/div";	
	}
	
	
	public final String editProject_vendorsTab_editVendor_roleSelectButton="//div[contains(@id,'editvendor')]//div[@class='x-superboxselect-btn-expand']";
	
	// Edit Project Workflow Tab
	public final String editProject_EditProjectTitleWorkflowName = "css=div[class='x-panel x-panel-noborder'] td>div:contains('Name')";
	public final String editProject_workflowTab_defaultWorkflowX (String workflowName){		
		return "//div[contains(@id,'Project') or contains(@id,'project')]//td[div[text()='"+workflowName+"']]";//"//div[contains(@id,'Project') or contains(@id,'project')]//td[div[text()='"+workflowName+"']]/following-sibling::td[contains(@class,'radiocolumn')]//div[contains(@class,'radiocolumn')]";
	}
	public final String editProject_workflowTab_rowTable ="//div[contains(@id,'pdprojectworkflows')]//tr[contains(@class,'x-grid-row')]";
	public final String editProject_workflowTab_rowTable_checkBox(int row) 
	{
		return "//div[contains(@id,'project')or contains(@id,'Project')]//tr[contains(@class,'x-grid-row')]["+(row)+"]/td/div/div";
	}
	public final String editProject_workflowTab_rowTable_checkBox_checked(int row) 
	{
		return "//div[contains(@id,'project')or contains(@id,'Project')]//tr[contains(@class,'x-grid-row')]["+(row)+"]/td/div/div[contains(@class,'checked')]";
	}
	public final String editProject_workflowTab_rowTable_checkBox_checked = "//div[contains(@id,'project')or contains(@id,'Project')]//tr[contains(@class,'x-grid-row')]/td/div/div[contains(@class,'checked')]";
	
	public final String editProject_worflowTab_defaultWorkflowRowX(Integer rowNumber){
		return "//div[contains(@id,'project')or contains(@id,'Project')]//tr[contains(@class,'x-grid-row')]["+rowNumber+"]/td[2]/div";
	}
	public final String editProject_worflowTab_defaultWorkflowRowX_checked = "//div[contains(@id,'project')or contains(@id,'Project')]//tr[contains(@class,'x-grid-row')]/td[2]/div/div[contains(@class,'radio-col-on')]";
	
	public final String editProject_worflowTab_isCheckedWorkflow(String wf)
	{
		return "//div[contains(@id,'gridpanel')]//div[contains(@class,'x-grid-cell-inner')][text()='"+wf+"']//ancestor::tr[starts-with(@class,'x-grid-row')]/td[contains(@class,'x-grid-cell-first')]//descendant::div[contains(@class,'x-grid-checkheader-checked')]";
	}
	public final String editProject_workflowsTab_workflowNameX(Integer row){
		return "//div[contains(@id,'project')or contains(@id,'Project')]//table["+row+"]//tr[contains(@class,'x-grid-row')]/td[3]";//"//div[contains(@id,'project')or contains(@id,'Project')]//tr[contains(@class,'x-grid-row')]["+row+"]/td[3]";
	}
	
	public final String editProject_WorkflowTab_NameColumnTitle ="//div[contains(@id,'ProjectGlobalWorkflowPanel')]//span[contains(text(),'Name')]";//"//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')]//div[contains(@id,'project')or contains(@id,'Project')]//span[contains(text(),'Name')]/..";
	public final String editProject_WorkflowTab_NameColumnArrow ="//div[contains(@id,'ProjectGlobalWorkflowPanel')]//div[contains(@name,'workflowGrid')]//div[contains(@class,'header-focus')]//div[contains(@id,'gridcolumn')][contains(@class,'text-container')][//span[contains(text(),'Name')]]//following-sibling::div[contains(@class,'header-trigger')]";//"//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')]//div[contains(@id,'project')or contains(@id,'Project')]//span[contains(text(),'Name')]/../div[contains(@class,'x-column-header-trigger')]";	
	//Edit Project Workflow Tab - Gate Configuration
	public final String editProject_workflowTab_GateConfiguration_Translation = "//span[text()='translation']/following-sibling::span";
	public final String editProject_workflowTab_GateConfiguration_Proof = "//span[text()='proof']/following-sibling::span";
	public final String editProject_workflowTab_GateConfiguration_Translation_EnableGate_checked = "//div[contains(@id,'pdgateconfigure')]//table[contains(@class,'x-form-cb-checked')][following-sibling::div[text()='Enable Gate']]//input";
	public final String editProject_workflowTab_GateConfiguration_Proof_EnableGate_checked = "//div[contains(@id,'pdgateconfiguredialog')]//div[contains(@id,'tabpanel')]/div[2]/div[2]//table[@name='enableCheckBox'][contains(@class,'x-form-cb-checked')]";
	
	public final String editProject_workflowTab_selectWorkflowGate (String workflowName){		
		return "//div[contains(@id,'Project') or contains(@id,'project')]//tbody/tr[td/div[text()='"+workflowName+"']]//td//div[contains(@class,'workflowgate')]";
	}
	
	public final String editProject_workflowTab_gateConfigurationTabs (String phase){		 
		return "//div[contains(@id,'gate') or contains(@id,'Gate')]//a//span[text()='"+phase+"']/following-sibling::span";
	}
	public final String editProject_workflowTab_gateConfiguration_selectRolesButton="//table[contains(@name,'phaseRolesCombo')]//td[contains(@class,'superboxselect')]/div/div[2]";//"css=table[name*='phaseRolesCombo'] td[class*='superboxselect']>div>div:nth-child(2)";
	public final String editProject_workflowTab_gateConfiguration_resetRolesButton="css=table[name='phaseRolesCombo'] td[class*='superboxselect']>div>div:nth-child(1)";
	public final String editProject_workflowTab_gateConfiguration_alwaysRadioButtonChecked = "//div[contains(@id,'gate') or contains(@id,'Gate')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'display: none'))]//table[contains(@class,'x-form-cb-checked')]//input[contains(@name,'alwaysRadioBtn')]";//div[not(contains(@style,'display: none')) and starts-with(@id,'gateconfigurepanel')]//table[contains(@class,'x-form-cb-checked')]//input[@name='alwaysRadioBtn']"; 
	public final String editProject_workflowTab_gateConfiguration_enableGateButton = "//div[contains(@id,'gate') or contains(@id,'Gate')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'display: none'))]//input";//div[contains(@id,'Gate') or contains(@id,'gate')][not(contains(@style,'none'))]//input";//div[contains(@id,'gateconfigure')][not(contains(@style,'none'))]//input";//div[contains(@id,'GateConfigurePanel')][not(contains(@style,'none'))]//input";
	public final String editProject_workflowTab_gateConfiguration_enableGateChecked="//div[contains(@id,'gateconfigure')][not(contains(@style,'none'))]//table[contains(@id,'fieldset')][contains(@class,'x-form-cb-checked')]//input";//div[contains(@id,'gateconfigurepanel')]//table[contains(@id,'fieldset')][contains(@class,'x-form-cb-checked')]//input";
	public final String editProject_workflowTab_gateConfiguration_enableGate_notChecked = "//div[contains(@id,'gate') or contains(@id,'Gate')]//div[contains(@class,'workflow_gate_Panel')]//div[contains(@name,'fieldset')][not(contains(@class,'checked'))]//span[contains(@class,'checkbox')]";
	public final String editProject_workflowTab_gateConfiguration_always = "//div[contains(@id,'Gate') or contains(@id,'gate')][not(contains(@style,'none'))]//label[text()='Always']";//div[contains(@id,'gateconfigure')][not(contains(@style,'none'))]//label[text()='Always']";//css=table[name='alwaysRadioBtn'] td>label:contains('Always')";
	public final String editProject_workflowTab_gateConfiguration_alwaysRadioButton = "//div[contains(@id,'gate') or contains(@id,'Gate')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'display: none'))]//input[contains(@name,'alwaysRadioBtn')]";//div[contains(@id,'gateconfigure')][not(contains(@style,'none'))]//input[@name='alwaysRadioBtn']";//css=table[class*='checked'] input[name='alwaysRadioBtn']";
	public final String editProject_workflowTab_gateConfiguration_onlyForRadioChecked="//div[contains(@id,'gate') or contains(@id,'Gate')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'display: none'))]//table[contains(@class,'x-form-cb-checked')]//input[contains(@name,'onlyForRadioBtn')]";//div[contains(@id,'gateconfigure')][not(contains(@style,'none'))]//table[contains(@class,'x-form-cb-checked')]//input[@name='onlyForRadioBtn']";//css=table[class*='checked'] input[name='onlyForRadioBtn']";
	public final String editProject_workflowTab_gateConfiguration_onlyFor = "//div[contains(@id,'gate') or contains(@id,'Gate')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'display: none'))]//input[contains(@name,'onlyForRadioBtn')]";//div[contains(@id,'gate') or contains(@id,'Gate')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'display: none'))]//table[contains(@class,'x-form-cb-checked')]//label[text()='Only for']";//div[contains(@id,'gateconfigure')][not(contains(@style,'none'))]//label[text()='Only for']";//css=table[name='onlyForRadioBtn'] td>label:contains('Only for')";
	public final String editProject_workflowTab_gateConfiguration_onlyForRadioButton = "//div[contains(@id,'WorkflowGatePanel')][not(contains(@style,'none'))]//input[contains(@name,'onlyForRadioBtn')]/following-sibling::span";
	public final String editProject_workflowTab_gateConfiguration_okButtonDisabled = "//a[contains(@class,'disabled')]//span[text()='OK']";//"css=a[class*='disabled'] span:contains('OK')";
	public final String editProject_workflowTab_gateConfiguration_okButton = "//div[contains(@id,'WorkflowGateDialog')]//div[contains(@id,'toolbar')]//span[text()='OK']";
	public final String editProject_workflowTab_gateConfiguration_onlyForHoursInput = "//div[contains(@id,'WorkflowGatePanel')][contains(@class,'tabpanel-child')][not(contains(@style,'none'))]//input[contains(@name,'gateDuration')]";//"//div[contains(@id,'WorkflowGatePanel')][not(contains(@style,'none'))]//input[contains(@name,'gateDuration')]";//input[@name='gateField']"; 
	public final String editProject_workflowTab_gateConfiguration_RolesSelectArrow ="//div[contains(@id,'gate') or contains(@id,'Gate')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'display: none'))]//div[contains(@name,'phaseRolesCombo')]//div[contains(@class,'triggerExpand ')]";
	public final String editProject_workflowTab_gateConfiguration_RolesClear_enabled ="//div[contains(@name,'phaseRolesCombo')]//div[contains(@class,'triggerClearAll')]";
	public final String editProject_workflowTab_gateConfiguration_RolesSelectX (String role) {
		return "//div[contains(@name,'phaseRoles')][not(contains(@style,'none'))]//li[text()='"+role+"']";// "css=div[name*='phaseRolesCombo-boundlist'] ul li:contains('"+role+"')";
	}
	
	public final String editProject_workflowTab_gateConfiguration_applyToAllPhasesButton = "//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Apply To All Phases')]";	
	public final String editProject_workflowTab_gateConfiguration_applyToAllPhasesDisableButton = "//a[contains(@class,'disabled')]//span[contains(text(),'Apply To All Phases')]/following-sibling::span";//"css=a[class*='disabled'] span:contains('Apply To All Phases')";
	
	// Edit Project FileFormat tab		
	public final String editProject_fileformatTab_InputRulesFile = "//div[starts-with(@id,'pdGlobalDialogsDynamicPluginFileUpload')]/div[1]//table[@name='fileuploadfield']//input[@name='fileuploadfield']";//"css=input.x-form-text.x-form-field.x-form-file-text";
	public final String editProject_fileformatTab_InputRulesFile_input = "//input[contains(@name,'rulesFile')]";
	public final String editProject_fileformatTab_ConfigureFileFormatOkButton = "//div[contains(@id,'pdAdminProjectEditTabFileFormatConfigure')]//span[text()='OK']/..";
	public final String editProject_fileformatTab_ConfigureFileFormat_CancelButton2 = "//div[starts-with(@id,'pdAdminProjectEditTabFileFormatXmlFormat') and contains(@class,'x-window-default')]/div[starts-with(@id,'toolbar') and contains(@class,'x-toolbar-footer')]//span[contains(text(),'Cancel')]/..";
	public final String editProject_fileformatTab_ConfigureFileFormatCancelButton = "//div[starts-with(@id,'pdAdminProjectEditTabFileFormatConfigureWindow') and contains(@class,'x-window-default')]/div[starts-with(@id,'toolbar') and contains(@class,'x-toolbar-footer')]//span[contains(text(),'Cancel')]/..";
	
	
	public final String editProject_fileformatTab_ConversionType_Regex = "//div[contains(@name,'conversionType-boundlist')]//li//div[contains(text(),'Regex')]";
	public final String editProject_fileformatTab_NewFileFormatButton = "//div[contains(@id,'project')or contains(@id,'Project')]//div[contains(@id,'fileformat')or contains(@id,'FileFormat')]//span[text()='New']/..";	
	public final String editProject_fileformatTab_NewFileFormatOkButton = "//div[contains(@id,'FileFormat') and contains(@class,'x-window-default')]/div[starts-with(@id,'toolbar') and contains(@class,'x-toolbar-footer')]//span[contains(text(),'OK')]/..";//div[starts-with(@id,'pdprojectconfigureformat') and contains(@class,'x-window-default')]/div[starts-with(@id,'toolbar') and contains(@class,'x-toolbar-footer')]//span[contains(text(),'OK')]/..";	
	public final String editProject_SelectFileFormat = "//table[@name='p_pluginType']//table[contains(@id,'combobox') and contains(@class,'x-form-trigger-wrap')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String editProject_fileformatTab_secondRowName = "//div[contains(@id,'ProjectEditTabFileFormatGrid')]//tbody/tr[2]//table/tbody/tr/td/div";//div[contains(@id,'pdprojectfileformats')]//div[contains(@id,'gridpanel') and contains(@class,'x-panel-default')]/div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//tr[contains(@class,'x-grid-group-body')][2]//tr[contains(@class,'x-grid-row')]/td[1]/div";
	public final String editProject_fileFormatTab_firstDataRow="//div[contains(@id,'ProjectEditTabFileFormatGrid')]/div[contains(@id,'gridview')]//tr[contains(@class,'x-grid-data-row')]/td[1]/div";
	public final String editProject_fileformatTab_firstRowTargetFormat = "//div[contains(@id,'ProjectEditTabFileFormatGrid')]/div[contains(@id,'gridview')]//tr[contains(@class,'x-grid-data-row')]/td[2]/div";//"//div[contains(@id,'ProjectEditTabFileFormatGrid')]//div[contains(@id,'gridpanel')]/div[contains(@id,'gridview')]//tr[contains(@class,'x-grid-data-row')]/td[2]/div";//div[contains(@id,'pdprojectfileformats')]//div[contains(@id,'gridpanel') and contains(@class,'x-panel-default')]/div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//tr[contains(@class,'x-grid-group-body')]//tr[contains(@class,'x-grid-row')]/td[2]/div";
	public final String editProject_fileformatTab_firstRowType = "//div[contains(@id,'pdprojectfileformats')]//tr[@class='x-grid-row']/td[3]/div";
	public final String editProject_fileformatTab_firstRowWorkflow = "//div[contains(@id,'pdAdminProjectEditTabFileFormat')]//table//tr[contains(@class,'x-grid-row')]//td[4]";//"//div[contains(@id,'pdAdminProjectEditTabFileFormat')]//tr[contains(@class,'x-grid-data-row')]/td[4]/div";//div[contains(@id,'pdprojectfileformats')]//tr[@class='x-grid-row']/td[5]/div/div";
	public final String editProject_fileformatTab_firstRowDefaultUnchecked = "css=div[class='x-panel x-panel-noborder'] div:nth-child(2)>div>div:nth-child(1)>table>tbody>tr>td:nth-child(5)>div div.x-grid3-check-col";
	public final String editProject_fileformatTab_firstRowDefaultChecked = "//div[contains(@id,'pdprojectfileformats')]//tr[@class='x-grid-row']/td[5]/div/div[contains(@class,'x-grid-radio-col-on')]";
	public final String editProject_fileformatTab_editfileFormatWarningMsg="//div[contains(@class,'x-window-footer x-panel-btns')]";
	public final String editProject_fileformatTab_editfileFormatWarningMsg_CloseButton ="//div[contains(@id,'warning')]//span[contains(text(),'Close')]/..";
	public final String editProject_fileformatTab_EditFileFormatButton = "//div[contains(@id,'Project')or contains(@id,'project')]//div[contains(@id,'fileformat')or contains(@id,'FileFormat')]//span[text()='Edit']/..";
	public final String editProject_fileformatTab_DeleteFileFormatButton = "//div[contains(@id,'Project')or contains(@id,'project')]//div[contains(@id,'fileformat')or contains(@id,'FileFormat')]//span[text()='Delete']/..";
	
	public final String editProject_fileFormatTab_configureFileFormat_hiddenText_checked ="//table[contains(@name,'extractHiddenText')][contains(@class,'checked')]//input[contains(@name,'extractHiddenText')]";
	
	public final String editProject_fileFormatTab_configureFileFormat_trackingChanges_checked ="//table[contains(@name,'acceptTrackingChanges')][contains(@class,'checked')]//input[contains(@name,'acceptTrackingChanges')]";
	
	public final String editProject_fileFormatTab_configureFileFormat_indexMarkers_checked ="//table[contains(@name,'extractIndexMarkers')][contains(@class,'checked')]//input[contains(@name,'extractIndexMarkers')]";
	
	public final String editProject_fileFormatTab_configureFileFormat_translateSmartTags_checked ="//table[contains(@name,'extractSmartTags')][contains(@class,'checked')]//input[contains(@name,'extractSmartTags')]";
	
	public final String editProject_fileFormatTab_configureFileFormat_translateComments_checked ="//table[contains(@name,'translateComments')][contains(@class,'checked')]//input[contains(@name,'translateComments')]";
	public final String editProject_fileFormatTab_configureFileFormat_translateDropDownList_checked ="//table[contains(@name,'extractDropDownList')][contains(@class,'checked')]//input[contains(@name,'extractDropDownList')]";
	
	public final String editProject_fileFormatTab_configureFileFormat_translateDocumentProperties_checked ="//table[contains(@name,'translateDocumentProperties')][contains(@class,'checked')]//input[contains(@name,'translateDocumentProperties')]";
	public final String editProject_fileFormatTab_configureFileFormat_translateDocumentProperties = "//input[contains(@name,'translateDocumentProperties')]";
	public final String editProject_fileFormatTab_configureFileFormat_translateHyperlink_checked ="//table[contains(@name,'translateHyperlinks')][contains(@class,'checked')]//input[contains(@name,'translateHyperlinks')]";
	public final String editProject_fileFormatTab_configureFileFormat_translateHyperlink = "//input[contains(@name,'translateHyperlinks')]";
	
	public final String editProject_fileFormatTab_configureFileFormat_fileExtension = "//input[contains(@name,'fileExtensions')]";
	
	
	public final String editProject_fileFormatTab_lable="//div[contains(text(),'Enable File Formats, select default Target Formats')]";
	public final String editProject_fileFormatTab_configureFileFormat_selectTargetEncoding="//table[@name='targetEncoding']//div[contains(@class,'x-form-arrow-trigger')]";
	public final String editProject_fileFormatTab_configureFileFormat_selectSourceEncoding="//table[@name='sourceEncoding']//div[contains(@class,'x-form-arrow-trigger')]";
	public final String editProject_fileFormatTab_configureFileFormat_ConversionType="//div[contains(@name,'conversionType')]//div[contains(@class,'x-form-arrow-trigger')]";//"//table[contains(@name,'conversionType')]//td[2]//table/tbody/tr/td[2]/div[contains(@class,'x-form-arrow-trigger')]";
	public final String editProject_fileFormatTab_configureFileFormat_okButton="//div[contains(@id,'ProjectEditTabFileFormat')]//span[text()='OK']/following-sibling::span";
	public final String editProject_fileFormatTab_configureFileFormat_downloadGreenArrowButton="//span[contains(@class,'download')]/..";
	public final String editProject_fileFormatTab_configureFileFormat_inputRuleFileName="//div[starts-with(@id,'pddynamicpluginconfiguration') and contains(@class,'x-panel-body-default')]/div[1]//table[@name='fileuploadfield']//input[@name='fileuploadfield']";//"css=label:contains('Rules File:')+div>div>div>div>div>div>input[name='rulesFile']";
	public final String editProject_fileFormatTab_firstWorkflowData="css=div[id*='pdprojecttabwindow'] div[id*='gridview']>table table tr:nth-child(2)>td:nth-child(4)";
	public final String editProject_fileFormatTab_selectWorkflow_trigger="//div[contains(@id,'GlobalComboEditor')]//div[contains(@class,'x-form-trigger-focus')]";
	public final String editProject_fileFormatTab_selectworkflow(String workflowName){
		String result="//div[contains(@name,'GlobalComboEditor')]//div//li[(text()='"+workflowName+"')]";
		return result;	
	}
	
	public final String editProject_fileformatTab_selectworkflowXButton="//div[contains(@id,'ProjectEditTabFileFormat')]//table//div[contains(@name,'AdminGlobalComboEditor')]//div[contains(@class,' x-form-trigger-focus')]";//"//table[contains(@id,'pdAdminGlobalComboEditor')]//td/div[contains(@class,'x-form-trigger')]";//"//div[@name='formatGrid']//table//td/div[contains(@class,'x-form-trigger')]";//css=table[name='workflowName'] table tr>td:nth-child(2)>div";
	public final String editProject_fileFormatTab_configurefileFormat_div = "//div[contains(@id,'pddynamicpluginconfiguration') and starts-with(@class,'x-panel-body x-panel-body-default')]";
	public final String editProject_fileFormatTab_configureFileFormat_defaultCheckBox="//div[contains(@id,'pdAdminProjectEditTabFileFormatConfigure')]//label[text()='Default']";
	public final String editProject_fileFormatTab_configureTextButton="//a//span[text()='Configure'][contains(@class,'underline-text')]";
	public final String editProject_fileformatTab_ConfigureXMLFileFormatOkButton = "//div[contains(@id,'pdAdminProjectEditTabFileFormatConfigure')]//span[text()='OK']/..";
	
	
	//Hide Translations Notes Review Tab(TSR)
	
	
	
	public final String editProject_fileformatTab_ConfigurFileFormatOkButton = "//div[contains(@id,'AdminFileFormatEdit')]//span[text()='OK']/..";//"//div[contains(@id,'pdAdminProjectEditTabFileFormatXmlFormat')]//span[text()='OK']/..";
	public final String editProject_fileFormatTab_selectWorkflow_dropDownTrigger="//table[contains(@id,'AdminGlobalComboEditor')]//div[contains(@class,'form-arrow-trigger')]";

	//	Translate Notes Page
	public final String editProject_fileFormatTab_configureFileFormat_translateNotesPage="//label[//span[contains(text(),'Translate Notes Page')]]/following-sibling::div//input[contains(@name,'translateNotesPage')]/following-sibling::span";//"//label[//span[contains(text(),'Translate Notes Page')]]/../following-sibling::div//input[contains(@name,'translateNotesPage')]/following-sibling::span";//"//label[contains(text(),'Translate Notes Page')]/../following-sibling::td//input[contains(@name,'translateNotesPage')]";
	public final String editProject_fileFormatTab_configureFileFormat_translateNotesPagechecked="//div[contains(@name,'translateNotesPage')][contains(@class,'checked')]//input/following-sibling::span";//"//table[contains(@name,'translateNotesPage')][contains(@class,'checked')]";
	
	//Translate Hidden Slides
	public final String editProject_fileFormatTab_configureFileFormat_translatehiddenslide="//label[//span[contains(text(),'Translate Hidden Slides')]]/../following-sibling::div//input[contains(@name,'translateHiddenSlides')]/following-sibling::span";//"//label[contains(text(),'Translate Hidden Slides')]/../following-sibling::td//input[contains(@name,'translateHiddenSlides')]";
	public final String editProject_fileFormatTab_configureFileFormat_translatehiddenslidechecked="//div[contains(@name,'translateHiddenSlides')][contains(@class,'checked')]//input/following-sibling::span";//"//table[contains(@name,'translateHiddenSlides')][contains(@class,'checked')]";
	
	//Translate Slide Content
	public final String editProject_fileFormatTab_configureFileFormat_translateslideContent="//label[//span[contains(text(),'Translate Slide Content')]]/../following-sibling::div//input[contains(@name,'translateSlideContent')]/following-sibling::span";//"//label[contains(text(),'Translate Slide Content')]/../following-sibling::td//input[contains(@name,'translateSlideContent')]";
	public final String editProject_fileFormatTab_configureFileFormat_translateslideContentchecked="//div[contains(@name,'translateSlideContent')][contains(@class,'checked')]//input/following-sibling::span";//"//table[contains(@name,'translateSlideContent')][contains(@class,'checked')]";
	
	//Translate Notes Master Slides
	public final String editProject_fileFormatTab_configureFileFormat_translateNotesMasterslide="//label[//span[contains(text(),'Translate Notes Master Slides')]]/../following-sibling::div//input[contains(@name,'translateNotesMasterSlides')]/following-sibling::span";//"//label[contains(text(),'Translate Notes Master Slides')]/../following-sibling::td//input[contains(@name,'translateNotesMasterSlides')]";
	public final String editProject_fileFormatTab_configureFileFormat_translateNotesMasterslidechecked="//div[contains(@name,'translateNotesMasterSlides')][contains(@class,'checked')]//input/following-sibling::span";//"//table[contains(@name,'translateNotesMasterSlides')][contains(@class,'checked')]";
	
	//Translate Master Slides
	public final String editProject_fileFormatTab_configureFileFormat_translateMasterslide="//label[//span[contains(text(),'Translate Master Slides')]]/../following-sibling::div//input[contains(@name,'translateMasterSlides')]/following-sibling::span";//"//label[contains(text(),'Translate Master Slides')]/../following-sibling::td//input[contains(@name,'translateMasterSlides')]";
	public final String editProject_fileFormatTab_configureFileFormat_translateMasterslidechecked="//div[contains(@name,'translateMasterSlides')][contains(@class,'checked')]//input/following-sibling::span";//"//table[contains(@name,'translateMasterSlides')][contains(@class,'checked')]";
	
	//Translate Hyperlinks
	public final String editProject_fileFormatTab_configureFileFormat_translateHyperLinks="//label[//span[contains(text(),'Translate Hyperlinks')]]/../following-sibling::div//input[contains(@name,'translateHyperlinks')]/following-sibling::span";//"//label[contains(text(),'Translate Hyperlinks')]/../following-sibling::td//input[contains(@name,'translateHyperlinks')]";
	public final String editProject_fileFormatTab_configureFileFormat_translateHyperLinkschecked="//div[contains(@name,'translateHyperlinks')][contains(@class,'checked')]//input/following-sibling::span";//"//table[contains(@name,'translateHyperlinks')][contains(@class,'checked')]";
	
	//div[contains(@id,'ProjectEditTabFileFormatGrid') and contains(@name,'grid')]//table//div[contains(text(),'gla_word_file_format')]	
	public final String editProject_fileFormatTab_selectFileFormatName(String fileFormatName) {
		String result= "//div[contains(@id,'ProjectEditTabFileFormatGrid') and contains(@name,'grid')]//table//div[contains(text(),'"+fileFormatName+"')]";
		return result;
		
	}
	public final String editProject_fileFormatTab_selectWorkflow_from_fileFormatName(String fileFormatName) {
		
		String result="//div[contains(@id,'AdminProjectEditTabFileFormat') and contains(@name,'grid')]//table//tr[contains(@id,'gridview') and contains(@class,'grid-row-selected')][//div[contains(text(),'"+fileFormatName+"')]]//td[4]/div";//"//div[contains(@id,'AdminProjectEditTabFileFormat') and contains(@name,'grid')]//table//tr[contains(@id,'gridview') and contains(@class,'grid-row-selected')][//div[contains(text(),'"+fileFormatName+"')]]//td//div[contains(text(),'"+fileFormatWorkflow+"')]";
		
		return result;	
	}
	
	public final String editProject_fileFormatTab_selectWorkflow(String fileformat,String name) {
		return "//div[contains(@id,'Project') or contains(@id,'project')]//table//tr//td[div//span[text()='"+fileformat+"']]/following-sibling::td[3]//span[text()='"+name+"']";
				//"//li[text()='"+name+"']";//css=div[name='workflowName-boundlist'] ul>li:contains('"+name+"')";
	}
	
	public final String editProject_fileFormatTab_configureFileFormat_fileExtensionSelect(String fileExtension){	
		return "//div[contains(@name,'fileExtensions')]//div[contains(text(),'"+ fileExtension+"')]" ;
	}
		
	public final String editProject_selectFileFormatX(String fileFormat){
		return "//div[contains(@class,'x-grid3-cell-inner'][contains(text(),'" + fileFormat + "')]";
	}	
	
	//Edit Project Languages tab
	public final String editProject_languagesTab_TargetLanguageTitle = "//span[contains(text(),'Target Language')]";//"//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')][contains(@id,'Project')or contains(@id,'project')]//div[contains(@id,'headercontainer')]//descendant::div[starts-with(@id,'gridcolumn') and contains(@class,'x-column-header-inner')]/span[contains(text(),'Target Language')]/..";
	public final String editProject_languagesTab_TargetLanguageColumnArrow ="//div[contains(@id,'ProjectEditTabLanguagePanel')]//div[contains(@name,'grid')]//div[contains(@class,'header-focus')]//div[contains(@id,'gridcolumn')][contains(@class,'text-container')][//span[contains(text(),'Target Language')]]/following-sibling::div[contains(@class,'header-trigger')]";//"//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')][contains(@id,'Project')or contains(@id,'project')]//span[contains(text(),'Target Language')]/../div[contains(@class,'x-column-header-trigger')]";
	public final String editProject_languagesTab_SourceLanguageTitle = "//span[contains(text(),'Source Language')]";//"//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')][contains(@id,'Project')or contains(@id,'project')]//div[contains(@id,'headercontainer')]//descendant::div[starts-with(@id,'gridcolumn') and contains(@class,'x-column-header-inner')]/span[contains(text(),'Source Language')]/..";
	public final String editProject_languagesTab_SourceLanguageColumnArrow ="//div[contains(@id,'ProjectEditTabLanguagePanel')]//div[contains(@name,'grid')]//div[contains(@class,'header-focus')]//div[contains(@id,'gridcolumn')][contains(@class,'text-container')][//span[contains(text(),'Source Language')]]/following-sibling::div[contains(@class,'header-trigger')]";//"//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')][contains(@id,'Project')or contains(@id,'project')]//span[contains(text(),'Source Language')]/../div[contains(@class,'x-column-header-trigger')]";
	
	public final String editProject_SelectLanguage = "//div[2]/div/img";
	public final String editProject_languagesTab_SelectSourceLanguageX(String language){
		return "//div[contains(@name,'pdAdminGlobalComboEditor')][not(contains(@style,'none'))]//li[text()='"+language+"']";
	}
	
	public final String editProject_languagesTab_SelectTargetLanguageX(String language){
		return "//div[contains(@name,'pdAdminGlobalComboEditor')][not(contains(@style,'none'))]//li[text()='"+language+"']";
	}
	
	public final String editProject_languageTab_verifyLanguageX(String language)
	{
		return "//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')][contains(@id,'Project')or contains(@id,'project')]//table//tr/td/div[text()='"+language+"']";//css=div[id*='projectlanguages'] td>div:contains('"+language+"')";
	}
	
	public final String editProject_languagesTab_SourceLanguageX(Integer row){
		return "//div[contains(@id,'ProjectEditTabLanguageGrid')]//table["+row+"]//tr/td[1]//div";//"//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')][contains(@id,'Project')or contains(@id,'project')]//table//tr["+row+"]/td[1]";//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')][contains(@id,'Project')or contains(@id,'project') ]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-default')]/div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//tr[contains(@class,'x-grid-row')]["+row+"]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner')]";
	}
	
	public final String editProject_languagesTab_TargetLanguageX(Integer row){
		return "//div[contains(@id,'ProjectEditTabLanguageGrid')]//table["+row+"]//tr/td[2]//div";//"//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')][contains(@id,'Project')or contains(@id,'project')]//table//tr["+row+"]/td[2]";//div[not(contains(@style,'display: none')) and contains(@class,'x-tabpanel-child')][contains(@id,'Project')or contains(@id,'project') ]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-default')]/div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//tr[contains(@class,'x-grid-row')]["+row+"]/td[not(contains(@class,' x-grid-cell-first')) and not(contains(@class,'x-grid-cell-last'))][1]/div[contains(@class,'x-grid-cell-inner')]";
	}
 
	public final String editProject_LanguageTab_clickArrowToSelectSource = "//div[contains(@name,'pdAdminGlobalComboEditor')]//div[contains(@class,'arrow-trigger')]";//"//div[@class='x-editor x-small-editor x-grid-editor x-grid-cell-editor x-layer x-editor-default x-border-box'][not(contains(@style,'none'))]/table//table//tr/td/div[contains(@class,'x-form-trigger')]";//table[contains(@name,'source')]//table[contains(@class,'x-form-trigger-wrap')]//div[contains(@class,'x-form-arrow-trigger')]";//table[@name='sourceLanguageDisplayName']//table[contains(@class,'x-form-trigger-wrap')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String editProject_LanguageTab_clickArrowToSelectTarget = "//div[contains(@name,'pdAdminGlobalComboEditor')]//div[contains(@class,'arrow-trigger')]";//"//div[@class='x-editor x-small-editor x-grid-editor x-grid-cell-editor x-layer x-editor-default x-border-box'][not(contains(@style,'none'))]/table//table//tr/td/div[contains(@class,'x-form-trigger')]";//table[contains(@name,'target')]//table[contains(@class,'x-form-trigger-wrap')]//div[contains(@class,'x-form-arrow-trigger')]";//table[@name='targetLanguageDisplayName']//table[contains(@class,'x-form-trigger-wrap')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String editProject_LanguageTab_close_btn="//span[contains(text(),'Close')]";
	//Edit Project TRP tab
	public final String editProject_trpTab = "//a//span[contains(text(),'TRP')]";//"//span[contains(text(),'TRP')]/following-sibling::span";
	public final String editProject_trpTab_trpProjectManagerSelect = "//div[contains(@name,'projectManager')]//div[contains(@class,'arrow-trigger')]";//"//table[contains(@name,'projectManager')]//td//div[contains(@class,'arrow-trigger')]";
	public final String editProject_trpTab_trpProjectManagerInput = "//input[contains(@name,'p_projectManager')]";
	public final String editProject_trpTab_lockMatch="//table[contains(@name,'lock100')]//label[contains(text(),'Lock 100% Matches')]";//"//table[contains(@name,'lock100')]//label[contains('Lock 100% Matches:')";
	public final String editProject_trpTab_gradeScoreCheckBox="//input[contains(@name,'gradingScoringCheckbox')]";
	public final String editProject_trpTab_trpGradingInput = "//div[contains(@id,'ProjectEditTabTrp')]//input[contains(@name,'gastCombo')]";
	public final String editProject_trpTab_preview="//table[contains(@name,'enablePreview')]//label[contains(text(),'Enable Preview')]";//"//table[contains(@name,'enablePreview')]//label[contains(text(),'Enable Preview:')]";
	public final String editProject_trpTab_preview_checked="//table[contains(@name,'enablePreview')][contains(@class,'checked')]//label[contains(text(),'Enable Preview')]";
	public final String editProject_trpTab_trpgradingScoringSelect="//div[contains(@name,'gastCombo')]//div[contains(@class,'arrow-trigger')]";//"//table[contains(@name,'gastCombo')]//td//div[contains(@class,'arrow-trigger')]";
	
	public final String editProject_trpTab_SeclectUserGridX(int row, int col)
	{
		return "//div[contains(@id,'EditTabTrp')]//table[contains(@class,'grid')]["+row+"]//tbody//tr//td["+col+"]";//"//div[contains(@id,'EditTabTrp')]//table[contains(@class,'grid')]//tbody//tr["+row+"]//td["+col+"]";//"//div[contains(@id,'EditTabTrp')]//table[contains(@id,'grid')]//tbody//tr["+row+"]//td["+col+"]";//div[contains(@id,'EditTabTrp')]//table/tbody/tr["+row+"]/td["+col+"]";//css=div[id*='pdprojectonlinereview'] div[name='ortGrid'] table>tbody>tr:nth-child("+row+")>td:nth-child("+col+")";
	}
	
	public final String editProject_trpTab_projectManagerX(String projectManager){
		return "//div[contains(@name,'projectManager')]//li[contains(text(),'"+projectManager+"')]";
	}

	public final String editProject_trpTab_gradingScoringX(String GreadingScoring){
		return "//div[contains(@name,'gast')]//li[contains(text(),'" + GreadingScoring +"')]";
	}

	public final String editProject_trpTab_Selecttrpuserdropdown(){
		return "//div[contains(@id,'AdminProjectEditTabTrp')]//div[contains(@class,' x-small-editor')][not(contains(@style,'none'))]//div[contains(@id,'AdminGlobalComboEditor')]/div[contains(@class,'arrow-trigger')]";//"//div[contains(@id,'pdAdminProjectEditTabTrpGrid')]//div[contains(@class,' x-small-editor')][not(contains(@style,'none'))]//table[contains(@id,'pdAdminGlobalComboEditor')]//td/div[contains(@class,'arrow-trigger')]";//div[contains(@id,'pdAdminProjectEditTabTrpGrid')]//div[contains(@class,' x-small-editor')]//table[contains(@id,'pdAdminGlobalComboEditor')]//td/div[contains(@class,'arrow-trigger')]";//css=div.x-form-field-wrap.x-form-field-trigger-wrap.x-trigger-wrap-focus img";
	}
	
	public final String editProject_trpTab_SeclectTranslatorUser(String username){
		return "//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box'][not(contains(@style,'none'))]/div/ul/li[text()='"+username+"']";//css=div[name*='translator'] li:contains('"+username+"')";
	}
	
	public final String editProject_trpTab_SeclectProoferUser(String username){
		return "//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box'][not(contains(@style,'none'))]/div/ul/li[text()='"+username+"']";//"css=div[name*='proofer'] li:contains('"+username+"')";
	}
	
	public final String editProject_trpTab_SeclectReviewerUser(String username){
		return "//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box'][not(contains(@style,'none'))]/div/ul/li[text()='"+username+"']";//"css=div[name*='reviewer'] li:contains('"+username+"')";
	}
			
	public final String editProject_trpTab_SeclectSuperwiserUserComboX(String username){
		return "//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box'][not(contains(@style,'none'))]/div/ul/li[text()='"+username+"']";//"css=div[name*='supervisor'] li:contains('"+username+"')";//div[@class=\"x-layer x-combo-list \"]/div[@name=\"supervisor\"]/div[text()='"+username+"']";
	}
	
		public final String editProject_trpTab_SeclectLnagManagerUserComboX(String username){
			return "//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box'][not(contains(@style,'none'))]/div/ul/li[text()='"+username+"']";//"css=div[name*='languageManager'] li:contains('"+username+"')";//div[@class=\"x-layer x-combo-list \"]/div[@name=\"languageManager\"]/div[text()='"+username+"']";
		}

	
	//Edit Project Cost Scope tab
	public final String editproject_costScopeTab_costScopeSelect="//table[@name='p_costScope']//table[contains(@id,'combobox') and contains(@class,'x-form-trigger-wrap')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String editproject_costScopeTabcostScopeSelect="//div[contains(@id,'ProjectEditTabGeneralInformation')]//div[contains(@name,'costScope')]//div[contains(@class,'x-form-arrow-trigger')]";//"//div[starts-with(@id,'pdAdminProjectEditTabGeneralInformation')]//table[@name='p_costScope']//div[contains(@class,'x-form-arrow-trigger')]";
	
	//Edit Project Quotes tab
	public final String editProject_quotesTab_Page ="//div[text()='Use this page to input quote data for this project workflows.']";//div[starts-with(@id,'pdAdminProjectEditTabQuotePanel') and contains(@class,'x-panel-default') and not(contains(style,'display: none'))]";
	public final String editProject_quotesTab_enableQuotes = "//fieldset[starts-with(@id,'fieldset')]//span[starts-with(@id,'fieldset')]";
	public final String editProject_quotesTab_vendorQuotes_radialCheckbox =  "//fieldset[starts-with(@id,'fieldset')]//div[contains(@name,'vendorQuote')]//span[contains(@class,'radio')]";
	public final String editProject_quotesTab_autoquoteQuotes_radialCheckbox =  "//fieldset[starts-with(@id,'fieldset')]//div[contains(@name,'autoquote')]//span[contains(@class,'radio')]";
	public final String editProject_quotesTab_doubleapproveQuotes_Checkbox =  "//fieldset[starts-with(@id,'fieldset')]//div[contains(@name,'doubleApprove')]//span[contains(@class,'checkbox')]";
	public final String editProject_quotesTab_doubleapproveQuotes_Checkbox_isChecked =  "//fieldset[starts-with(@id,'fieldset')]//div[contains(@name,'doubleApprove') and contains(@class,'x-form-cb-checked')]//input[contains(@name,'doubleApprove')]";
	public final String editProject_quotesTab_selectQuotablePhases = "//fieldset[starts-with(@id,'fieldset')]//div[contains(@name,'workflowPhases')]//div[contains(@class,'triggerExpand')]";
	public final String editProject_quotesTab_clearQuotablePhases = "//fieldset[starts-with(@id,'fieldset')]//div[contains(@name,'workflowPhases')]//div[contains(@class,'triggerClearAll')]";
	public final String editProject_quotesTab_selectQuotablePhasesX(String quotablePhases){
		return "//div[contains(@name,'workflowPhases')]//li[text()='"+quotablePhases+"']";
	}
	public final String editProject_quotesTab_doubleApproveQuotes_disabled="//table[contains(@class,'disabled')]//input[@name='p_doubleApprove']";
	public final String editProject_quotesTab_quoteSelection="//div[contains(@name,'quoteType')]//div[contains(@class,'arrow-trigger')]";
	public final String editProject_quotesTab_SelectOptionalChecked="//div[@name='p_quoteType-boundlist']//li[text()='Optional (Checked)']";
	public final String editProject_quotesTab_SelectOptionalUnchecked="//div[@name='p_quoteType-boundlist']//li[text()='Optional (Unchecked)']";
	public final String editProject_quotesTab_SelectMandatory="//div[@name='p_quoteType-boundlist']//li[text()='Mandatory']";
	public final String editProject_quotesTab_quoteRequiredDefaultSelection ="//table[@name='defaultQuoteTypeCombo']//div[contains(@class,'x-form-trigger')]";
	public final String editProject_quotesTab_quoteRequiredDefaultSelectX(String quoteType){
		return "//div[@name='defaultQuoteTypeCombo-boundlist']//li[contains(@class,'x-boundlist-item') and text()='"+ quoteType +"']";
	}
	public final String editProject_quotesTab_configureQuotes_RowTable = "//div[contains(@id,'Quote')or contains(@id,'quote')]//div[contains(@id,'tableview')]//table/tbody/tr";//div[starts-with(@id,'pdprojectprojecttabprojectquotes') and contains(@class,'x-panel-default')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-grid-body x-panel-body-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[starts-with(@class,'x-grid-row')]";

	public final String	editProject_quotesTab_configureQuotesRow (Integer row,Integer column){
		return "//div[contains(@id,'Quote')or contains(@id,'quote')]//div[contains(@id,'tableview')]//table["+row+"]/tbody/tr/td["+column+"]";
	}
	
	public final String editProject_quotesTab_configureQuotes_lineItem_enableDisableButton = "//div[contains(@id,'Quote')or contains(@id,'quote')]//span[text()='Enable/Disable']/following-sibling::span";//div[@name='quotesGrid']//span[text()='Enable/Disable']";
	public final String editProject_quotesTab_configureQuotes_lineItemName_row (String lineItemName){
		return "//div[contains(@id,'Quote')or contains(@id,'quote')]//table//tr//div[text()='"+lineItemName+"']";//div[@name='quotesGrid']//table//descendant::tr[contains(@class,'x-grid-row')][child::td/div[text()='"+lineItemName+"']]";
	}
	public final String editProject_quotesTab_configureQuotes_lineItemName_row_td (String lineItemName, int numbTD){
		return "//div[@name='quotesGrid']//table//descendant::tr[contains(@class,'x-grid-row')][child::td/div[text()='"+lineItemName+"']]//td[contains(@class,'x-grid-cell')]['"+numbTD+"']/div";
	}
	public final String editProject_quotesTab_configureQuotes_lineItemName = "//div[contains(@id,'Quote')or contains(@id,'quote')]//table[contains(@id,'tableview')]//tr//div[contains(@id,'ext-comp')]//input";
	public final String editProject_quotesTab_configureQuotes_lineItemUnit = "//div[contains(@id,'Quote')or contains(@id,'quote')]//table[contains(@id,'tableview')]//tr//div[contains(@id,'ext-comp')]//input";
	public final String editProject_quotesTab_configureQuotes_lineItemPercent = "//div[contains(@id,'Quote')or contains(@id,'quote')]//table[contains(@id,'tableview')]//tr//div[contains(@id,'ext-comp')]//input";
	public final String editProject_quotesTab_configureQuotes_lineItemWorkflowPhases_Arrow = "//div[contains(@id,'QuoteWorkflowPhase')]//div[contains(@name,'workflowPhases')]//div[contains(@class,'triggerExpand')]";
	public final String editProject_quotesTab_configureQuotes_lineItemWorkflowPhases_saveButton = "//div[contains(@id,'Quote')or contains(@id,'quote')]//a/span/span/span[text()='Save']";//div[starts-with(@id,'pdprojectprojecttabprojectquotesworkflowphaseselectdialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'toolbar') and contains(@class,'x-toolbar-footer')]//span[contains(text(),'Save')]";
	
	public final String editProject_quotesTab_configureQuotes_lineItemWorkflowPhases_Select (String workflowPhase) {
		return "//div[contains(@name,'workflowPhases-boundlist')]//li[contains(text(),'"+workflowPhase+"')]";//div[@name='workflowPhases-boundlist']//li[contains(text(),'"+workflowPhase+"')]";
	}
	public final String editProject_quotesTab_configureQuotes_lineItemWorkflowPhases_SaveButton = "//div[contains(@id,'Quote')or contains(@id,'quote')]//a/span/span/span[text()='Save']";
	public final String editProject_quotesTab_OkButton ="//div[starts-with(@id,'pdprojecttabwindow') and contains(@class,'x-window-default')]/div[starts-with(@id,'toolbar') and contains(@class,'x-toolbar-footer')]//span[contains(text(),'OK')]";
			
	//Edit Project Organization tab
	public final String editProject_organizationTab_newOrganizationUserButton = "//div[contains(@id,'project') or contains(@id,'Project')]//div[contains(@id,'organization')or contains(@id,'Organization')]//span[text()='Add']";//"//div[contains(@id,'project') or contains(@id,'Project')]//div[contains(@id,'organization')or contains(@id,'Organization')]//span[text()='New']";
	public final String editProject_organizationTab_editOrganizationUserButton = "//div[contains(@id,'project')or contains(@id,'Project')]//div[contains(@id,'organization')or contains(@id,'Organization')]//span[text()='Edit']/..";
	public final String editProject_organizationTab_deleteOrganizationUserButton = "//div[contains(@id,'project')or contains(@id,'Project')]//div[contains(@id,'organization')or contains(@id,'Organization')]//span[text()='Remove']/..";//"//div[contains(@id,'project')or contains(@id,'Project')]//div[contains(@id,'organization')or contains(@id,'Organization')]//span[text()='Delete']/..";
	public final String editProject_organizationTab_deleteOrganizationUserButton_disable = "//div[contains(@id,'Project')or contains(@id,'project')][not(contains(@style,'none'))]//a[contains(@class,'disabled')]//span[contains(text(),'Remove')]";//"//div[contains(@id,'project')or contains(@id,'Project')]//div[contains(@id,'organization')or contains(@id,'Organization')]//span[text()='Delete']/..";
	public final String editProject_organizationTab_selectOrganizationUser = "//div[@name='p_userNameCombo']//div[contains(@class,'arrow-trigger')]";
	public final String editProject_organizationTab_selectOrganizationUserClient = "css=div.x-grid3-scroller div:contains('client')";
	public final String editProject_organizationTab_checkProjectRoleProjectClient = "css=div[class='x-window-body x-window-body-noborder x-border-layout-ct'] div.x-grid3-cell-inner:contains('project_client')";	

	public final String editProject_organizationTab_checkProjectRoleProjectClientAll = "//div[contains(@id,'EditTabOrganizationUserGrid')]//table//tr//td//div[contains(@class,'row-checker')]";//"//table//tbody//tr//td[2]//div//div";	

	public final String editProject_organizationTab_checkProjectRoleProjectPm = "//table[@name='organization']/../div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-default')]/div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//tr[contains(@class,'x-grid-row')]//div[contains(text(),'project_pm')]/../../td[contains(@class,' x-grid-cell-last')]//div[contains(@class,'x-grid-row-checker')]";
	public final String editProject_organizationTab_projectOrganizationRoleAddOkButton = "//div[starts-with(@id,'pdAdminProjectEditTabOrganizationUserAdd') and contains(@class,'x-window-default')]/div[starts-with(@id,'toolbar') and contains(@class,'x-box')]//span[contains(text(),'OK')]/..";//"//div[starts-with(@id,'pdprojectorganizationrole') and contains(@class,'x-window-default')]/div[starts-with(@id,'toolbar') and contains(@class,'x-toolbar-footer')]//span[contains(text(),'OK')]/..";
	public final String editProject_organizationTab_AddOrganizationUserOkButton ="//div[contains(@id,'ProjectEditTabOrganization')]//span[contains(text(),'OK')]";
	public final String editProject_organizationTab_OrganizationRoleEditOKButton = "//div[contains(@id,'ProjectEditTabOrganizationUser') and contains(@class,'x-window-default')]/div[starts-with(@id,'toolbar') and contains(@class,'x-toolbar-footer')]//span[contains(text(),'OK')]/..";
	public final String editProject_organizationUser_OKButton = "//div[contains(@id,'pdprojecttabwindow')]//span[contains(text(),'OK')]/..";
	
	public final String editProject_organizationUser_roles_firstRow_td = "//div[contains(@id,'pdprojectorganizationrole')]//div[contains(@id,'gridview')]//tr/td[2]/div";
		
	
	public final String editProject_generalTab_selectOrganisation(String orgUser){
		return "//div/div//li//div[text()='"+orgUser+"']";//div[contains(@id,'boundlist')]//div[contains(@class,'x-combo-list-item')][text()='"+orgUser+"']";
	}
	public final String editProject_organizationTab_CheckProjectRoleX(String projectRole){
		return "//div[contains(@id,'project') or contains(@id,'Project')]//div[contains(text(),'" + projectRole + "')]";
	}
	
	public final String editProject_organizationTab_orgUser(String orgUserName, String projectRole){
		return "//div[contains(@id,'project') or contains(@id,'Project')]//table//tr//td[div[text()='"+orgUserName+"']]/following-sibling::td//span[text()='"+projectRole+"']";
	}
		
	public final String editProject_organizationTab_OrgnizationUserName(String orgUserName){
		
		return "//div[contains(@id,'pdAdminProjectEditTabOrganization')]//tr[contains(@class,'x-grid-row')]/td[contains(@class,' x-grid-cell-first')]/div[contains(text(),'"+ orgUserName+"')]";
		//return "//div[not(contains(@style,'display: none')) and starts-with(@id,'pdproject') and contains(@class,'x-tabpanel-child')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-default')]/div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//descendant::tr[contains(@class,'x-grid-row')]/td[contains(@class,' x-grid-cell-first')]/div[contains(text(),'"+ orgUserName+"')]";
	}
		

	//Find section
	public final String filters_project_inputProjectNameFind = "//input[contains(@id,'gs4trfiltersinputfield')][@name='projectName']";
	public final String filters_project_inputOrganizationFind = "css=input[name= 'organizationNameInputText']";
	
	//Copy Project window

	public final String copyProject_OkButton = "//div[@role='dialog']//div[@role='toolbar']//a[@role='button']//span[text()='OK']";//"//div[contains(@id,'toolbar')]//span[text()='OK']/following-sibling::span";//"//div[contains(@id,'pdcopyprojectdialog')]//span[text()='OK']";

	public final String copyProject_inputProjectName = "//input[contains(@id,'CopyProjectName')][contains(@name,'ProjectName')]";//"//input[contains(@id,'textfield')][@name='projectName']";
	
	//View Costs window
	public final String viewCosts_disabledViewVendorCostModelButton="//a[contains(@class,'disabled')]//span[contains(text(),'View Vendor Cost Model')]";//css=div[class*='disabled'] button>span:contains('View Vendor Cost Model')";
	public final String viewCosts_viewVendorCostModelButton = "//span[text()='View Vendor Cost Model']";
	public final String viewCosts_viewVendorCostModelButton_warningCloseButton = "//div[contains(@id,'warning')]//span[text()='Close']/following-sibling::span";
	public final String viewCosts_viewVendorCostModelOkButton = "//div[contains(@id,'window')]//span[contains(text(),'OK')]/following-sibling::span";
	public final String viewCosts_selectVendorX(String vendorName){
		return "//div[contains(@class,'x-grid-cell-inner')][contains(text(),'" + vendorName + "')]";				
	}
	
	//Edit Project Delivery tab

	public final String editProject_generalTab_inputDelivery = "//input[contains(@name,'deliveryProfile')]";//input[@name='deliveryProfile']";

	public final String editProject_deliveryTab_SelectDelivery = "//div[contains(@name,'deliveryProfile')]//div[contains(@class,'arrow-trigger')]";
	
	public final String editProject_deliveryTab_SelectDeliveryProfileX(String deliveryProfileName){
		return "//div[contains(@name,'deliveryProfile-boundlist')]//li[text()='"+deliveryProfileName+"']";
	}

	
	//Edit Project Translation Memory tab
	public final String editProject_translationMemoryTab_FirstFileFormatFirstLocaleDisabled = "//div[contains(@id,'translation')or contains(@id,'Translation')]//table/tbody/tr[1]/td/div/span[contains(@class,'disabled')]";//div[contains(@id,'pdprojecttranslationmemory')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-default')]//table[contains(@class,'x-grid-table')]//tr[contains(@class,'x-grid-row')]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]/font/b";
	public final String editProject_translationMemoryTab_SelectTm = "//div[contains(@id,'TranslationMemory')]//div[contains(@name,'Combo')][not(contains(@style,'none'))]//div[contains(@class,'arrow')]";
	public final String editProject_translationMemoryTab_enableDisableButton="//div[contains(@id,'project')or contains(@id,'Project')]//span[text()='Enable/Disable']";//"//div[contains(@id,'project')or contains(@id,'Project')]//span[text()='Enable/Disable']/following-sibling::span";
	public final String editProject_translationMemoryTab_inputTMName="//div[contains(@id,'Project')]//table//input[contains(@name,'ComboEditor')]";//css=table[name='selectedTm'] table td>input[name='selectedTm']";
	public final String editProject_translationMemoryTab_selectTranslationMemory_Button="//div[contains(@id,'pdAdminProjectEditTabTranslationMemory')]//table//td/div[contains(@class,'x-form-trigger')]";//css=table[name='selectedTm'] table tr td:nth-child(2)>div";
	public final String editProject_translationMemoryTab_disabledTM(String tm)
	{
		return "//div[contains(@id,'ProjectEditTabTranslationMemory')]//table//tr//td//div//span[contains(@class,'disabled')]//span[contains(text(),'"+tm+"')]";
	}
	
	public final String editProject_translationMemoryTab_clickTranslationMemoryForLocale(String locale)
	{

		return "//td[div/span[contains(text(),'"+locale+"')]]/following-sibling::td/div";//"//td[div/b[contains(text(),'"+locale+"')]]/following-sibling::td/div";

	}
	
	public final String editProject_translationMemoryTab_selectTranslationMemoryX(String name)
	{
		return "//div[contains(@name,'boundlist')]//ul/li[contains(text(),'"+name+"')]";		
	}
	

	public final String editProject_translationMemoryTab_SelectLocalesX(int subRow){
		return "//div[contains(@id,'translation')or contains(@id,'Translation')]//table/tbody/tr["+subRow+"]/td/div";//div[contains(@id,'pdprojecttranslationmemory')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[contains(@class,'x-grid-row')]["+ subRow +"]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";
	}

	public final String editProject_translationMemoryTab_SelectLocalesComboBoxX(int subRow){
		return "//div[contains(@id,'translation')or contains(@id,'Translation')]//table["+subRow+"]/tbody/tr[1]/td[last()]";//div[contains(@id,'projecttranslationmemory')]//tbody/tr["+subRow+"]/td[last()]";//div[contains(@id,'pdprojecttranslationmemory')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[contains(@class,'x-grid-row')]["+ subRow +"]/td[not(contains(@class,' x-grid-cell-first')) and not(contains(@class,'x-grid-cell-last'))]/div";
	}
	
	public final String editProject_translationMemoryTab_SelectTranslationMemoryX_div(String tmName){		
		return "//div[contains(@id,'boundlist')]//li[contains(@class,'x-boundlist-item')]//div[text()='" + tmName + "']";
	}
	
	public final String editProject_translationMemoryTab_SelectLocalesX3(String  nameRow){
		//String result = "//div[contains(@class,' x-panel x-grid-panel')]/div/div/div/div/div/div/div//td[contains(@class, 'x-grid3-col x-grid3-cell x-grid3-td-0 x-grid3-cell-first')]/div/b[contains(text(),'" + nameRow + "')]";
		return "//span[contains(text(),'" + nameRow + "')]";
	}
	
	public final String editProject_translationMemoryTab_SelectLocalesComboBoxX3(String nameRow){
		//String result ="//div[contains(@class,' x-panel x-grid-panel')]/div/div/div/div/div/div/div//td[contains(@class, 'x-grid3-col x-grid3-cell x-grid3-td-0 x-grid3-cell-first')]/div/b[contains(text(),'" + nameRow + "')]/../../../td[2]";
		return "//span[contains(text(),'" + nameRow + "')]/../../../td[2]/div";
	}
	
	
	//Language Model tab
	public final String editProject_langModelTab_InputLanguageModel = "//input[contains(@name,'languageModel')]";
	public final String editProject_langModelTab_SelectLanguageModel ="//div[contains(@name,'pdAdminGlobalComboEditor')]//div[contains(@class,'x-form-arrow-trigger-default ')]";//"//table[contains(@name,'pdAdminGlobalComboEditor')]//table//td[2]/div[contains(@class,'x-form-trigger-first')]";//"//div[@name='languageGrid']//div[contains(@class,'x-form-trigger-first')]";
	public final String editProject_languageModelX(String languageModel){
		return "//div[contains(@id,'boundlist')]//ul//li[contains(text(),'"+languageModel+"')]";

	}

	
	public final String editProject_lanModelTab_SelectLanguageModelX(String langModelName){		
		return "//li[contains(@class,'x-boundlist-item')][contains(text(),'"+langModelName+"')]";
	}
	
	
	public final String editProject_lanModelTab_LanguageModelX(Integer row){
		//row++;
		return "//div[contains(@id,'ProjectEditTabLanguageModelPanel')]//table["+row+"]/tbody/tr/td[2]/div";//"//div[contains(@id,'ProjectEditTabLanguageModel')]//table["+row+"]/tbody/tr/td[2]/div";//"//div[contains(@id,'ProjectEditTabLanguageModel')]//table/tbody/tr["+row+"]/td[2]/div";//div[contains(@id,'ProjectEditTabLanguageModel')]//div[contains(@id,'gridview')]/table/tbody/tr["+(row+0)+"]/td[2]/div";
	}


	//Term Manager tab
	public final String editProject_termManagerTab = "//span[contains(text(),'TMGR')]";//"//span[contains(text(),'Term Manager')]";
	public final String editProject_termManagerTab_copyParametersButton = "//div[contains(@id,'project')or contains(@id,'Project')]//span[contains(@class,'copy')]/..";//"//span[@class='copy']/..";
	public final String editProject_termManagerTab_pasteParametersButton = "//div[contains(@id,'project')or contains(@id,'Project')]//span[contains(@class,'paste')]/..";//span[@class='paste']/..";
	public final String editProject_termManagerTab_clearParametersButton = "//div[contains(@id,'project')or contains(@id,'Project')]//span[contains(@class,'clear')]/..";

		
	public final String projects_verifyLanguagePairAdded(String src,String tgt)
	{
		return "//div[contains(@id,'LanguageGrid')]//table//td[div[contains(text(),'"+src+"')]]/following-sibling::td[div[contains(text(),'"+tgt+"')]]";//"//tr[td[div[text()='"+src+"']]/following-sibling::td[div[text()='"+tgt+"']]]";
	}
	
	
	public final String editProject_fileformatTab_copyExistingFormatRadio="//input[@name='copyExistingFormat']";
	public final String editProject_fileformatTab_copyExisting_disabled="//table[contains(@class,'disabled')][@name='copyExistingPluginTypeCombo']";
	public final String editProject_fileFormatTab_createNewFormatRadio="//input[@name='createNewFormat']";
	public final String editProject_fileFormatTab_createNew_disabled="//table[contains(@class,'disabled')][@name='pluginTypeCombo']";
	
	
	//Transcheck Tab
	public final String editProject_TranscheckTab_TXML_uploadButton="//div[contains(@id,'UploadTxml')]//a[contains(@class,'uploadButton')]//span[contains(@id,'TranscheckUpload')][contains(@class,'uploadsubmission')]";//"//div[contains(@id,'ProjectEditTabTranscheckUpload')][1]//table[contains(@name,'uploadField')]/following-sibling::a//span[contains(@class,'uploadsubmissionpm')]";
	public final String editProject_TranscheckTab_TXLF_uploadButton="//div[contains(@id,'UploadTxlf')]//a[contains(@class,'uploadButton')]//span[contains(@id,'TranscheckUpload')][contains(@class,'uploadsubmission')]";//"//div[contains(@id,'ProjectEditTabTranscheckUpload')][2]//table[contains(@name,'uploadField')]/following-sibling::a//span[contains(@class,'uploadsubmissionpm')]";
	public final String editProject_TranscheckTab_warningCloseButton="//div[contains(@id,'warningdialog')]//div[contains(@id,'toolbar')]//span[contains(text(),'Close')]";//"//div[contains(@id,'warningdialog')]//div[contains(@id,'toolbar')]//span[contains(text(),'Close')]/following-sibling::span";
	
	//tsr tab
	public final String editProject_TSRTab="//div[contains(@id,'pdAdminProjectEditWindow')]//a//span[text()='Review']";//"//div[contains(@id,'pdAdminProjectEditWindow')]//a//span[text()='TSR']";
	public final String editProject_tsrTab_gsModelSelectButton="//div[contains(@id,'ProjectEditTabTsr')]//div[contains(@name,'FileGsCombo')]//div[contains(@class,'arrow-trigger')]";//"//div[contains(@id,'pdAdminProjectEditTabTsrPanel')]//table[@name='p_gsModels']//td/div[contains(@class,'trigger')]";//"//div[contains(@id,'ProjectTsr')]//table[@name='p_gsModels']//td/div[contains(@class,'trigger')]";
	
	public final String editProject_tsrTab_segment_gsModelSelectButton="//div[contains(@name,'SegmentGsModels')]//div[contains(@class,'arrow-trigger')]";//"//div[contains(@name,'segmentGsModels')]//div[contains(@class,'arrow-trigger')]";
	public final String editProject_tsrTab_file_gsModelSelectButton="//div[contains(@name,'FileGsCombo')]//div[contains(@class,'arrow-trigger')]";
	
	public final String editProject_TSRTab_GradingScoringModel_Label="//div[contains(@id,'pdAdminProjectEditWindow')]//label[text()='Grading + Scoring Model']";
	public final String editProject_TSRTab_GradingScoringModel_Label(String gsModelName)
	{
		return "//div[contains(@id,'ProjectEditTabTsrDetails')]//div//label//span[contains(text(),'"+gsModelName+"')]";
	}
	public final String editProject_tsrTab_selectGSModelX(String model)
	{
		return "//div[contains(@name,'SegmentGsModels')]//li//div[text()='"+model+"']";//"//div[contains(@name,'p_gsModels')]//li[text()='"+model+"']";
	}
	
	public final String editProject_tsrTab_selectGSModelX_SegmentLevel(String model)
	{
		return "//div[contains(@name,'SegmentGsModels')]//li//div[text()='"+model+"']";//"//div[contains(@name,'segmentGsModels')]//li[text()='"+model+"']";//"//div[contains(@name,'p_gsModels')]//li[text()='"+model+"']";
	}
	public final String editProject_tsrTab_selectGSModelX_FileLevel(String model)
	{
		return "///div[contains(@name,'appFileGsCombo')]//ul//li//div[text()='"+model+"']";
	}
	public final String editProject_tsrTab_selectGSModelX_FileLevel_Dropdown = "//div[contains(@name,'fileGsCombo') or contains(@name,'FileGsCombo')]//div[contains(@id,'trigger-picker')]";
	public final String editProject_tsrTab_selectGSModelX_Segment_Dropdown = "//div[contains(@name,'segmentGsModels') or contains(@name,'SegmentGsModels')]//div[contains(@id,'trigger-picker')]";
	public final String editProject_tsrTab_selectGSModelX_selectedModelName(String model)
	{
		return "//div[contains(@name,'segmentGsModels')]//li[contains(@class,'x-boundlist-selected') and text()='"+model+"']";//"//div[contains(@name,'p_gsModels')]//li[contains(@class,'x-boundlist-selected') and text()='"+model+"']";
	}
	//public final String editProject_tsrTab_selectOptional="//div[contains(@id,'ProjectEditTabTsr')]//input[contains(@name,'optional')][following-sibling::label[text()='Optional']]";//"//div[contains(@id,'ProjectTsr')]//input[@name='p_gsOptions'][following-sibling::label[text()='Optional']]";
	public final String editProject_tsrTab_selectOptional="//div[contains(@id,'ProjectEditTabTsr')]//input[contains(@name,'optional')][following-sibling::label[text()='Optional']]/following-sibling::span";
	
	public final String editProject_tsrTab_isOptionalSelected="//div[contains(@id,'AdminProjectEditTabTsr')]//div[contains(@name,'optional') and contains(@class,'checked')]//input/following-sibling::span";//"//div[contains(@id,'pdAdminProjectEditTabTsrDetails')]//table[contains(@name,'optional') and contains(@class,'checked')]//td//input";//"//div[contains(@id,'ProjectTsr')]//table[contains(@class,'checked')]//input[@name='p_gsOptions'][following-sibling::label[text()='Optional']]";
	public final String editProject_tsr_tab_selectMandatory="//div[contains(@id,'ProjectEditTabTsr')]//input[@name='mandatory'][following-sibling::label[text()='Mandatory']]//..//span";
	public final String editProject_tsrTab_isMandatorySelected="//div[contains(@id,'AdminProjectEditTabTsr')]//div[contains(@name,'mandatory') and contains(@class,'checked')]//input/following-sibling::span";//"//div[contains(@id,'pdAdminProjectEditTabTsrDetails')]//table[contains(@name,'mandatory') and contains(@class,'checked')]//td//input";//"//div[contains(@id,'ProjectTsr')]//table[contains(@class,'checked')]//input[@name='p_gsOptions'][following-sibling::label[text()='Mandatory']]";
	public final String editProject_tsrTab_defaultHeaderCheckbox="//div[contains(@id,'ProjectTsr')]//span[following-sibling::span[text()='Default']]";
	
	public final String editProject_tsrTab_selectOptional_disabled="//div[contains(@id,'pdAdminProjectEditTabTsrDetails')]//input[contains(@name,'mandatory')][@disabled='']";//"//div[contains(@id,'pdAdminProjectEditTabTsrDetails')]//table[contains(@name,'mandatory')]//td//input[@disabled='']";
	public final String editProject_tsrTab_selectMandatory_disabled="//div[contains(@id,'pdAdminProjectEditTabTsrDetails')]//input[contains(@name,'optional')][@disabled='']";//"//div[contains(@id,'pdAdminProjectEditTabTsrDetails')]//table[contains(@name,'optional')]//td//input[@disabled='']";

	
	public final String editProject_tsrTab_checkReviewPhaseX(String phase)
	{
		return "//div[contains(@id,'ProjectTsrGrid')]//tr/td[div[text()='"+phase+"']]/following-sibling::td/div/img";
	}
	
	public final String editProject_tsrTab_Optional_radioButton_notChecked="//div[contains(@id,'AdminProjectEditTabTsr')]//div[contains(@name,'optional') and not (contains(@class,'checked'))]//input/following-sibling::span";//"//div[contains(@id,'pdAdminProjectEditTabTsrDetails')]//table[contains(@name,'optional') and not (contains(@class,'checked'))]//td//input";
	public final String editProject_tsrTab_Optional_radioButton_Checked="//div[contains(@id,'AdminProjectEditTabTsr')]//div[contains(@name,'optional') and (contains(@class,'checked'))]//input/following-sibling::span";
	public final String editProject_tsrTab_Mandatory_radioButton_notChecked="//div[contains(@id,'pdAdminProjectEditTabTsrDetails')]//table[contains(@name,'mandatory') and not (contains(@class,'checked'))]//td//input";

	public final String editProject_tsoTab_allowClaimOfflineCheckBox="//div[contains(@id,'Tso')]//table/tbody/tr[td/div[text()='Allow Claim Offline']]/td//div[contains(@class,'checkcolumn')]//div";
	public final String editProject_tsoTab_allowClaimOfflineChecked="//div[contains(@id,'Tso')]//table/tbody/tr[td/div[text()='Allow Claim Offline']]/td//div[contains(@class,'checked')]";
	public final String editProject_tsoTab_allowClaimOnlineChecked="//td[div[text()='Allow Claim Online']]/following-sibling::td//div[contains(@class,'checked')]";
	public final String editProject_tsoTab_allowClaimOnlineCheckBox="//div[contains(@id,'Tso')]//table/tbody/tr[td/div[text()='Allow Claim Online']]/td//div[contains(@class,'checkcolumn')]//div";
	
	public final String editProject_tsoTab_OptionsCheckBox(String tso_option){
		//return "//div[contains(@name,'tsoGrid')]//table/tbody/tr/td[div[text()='"+tso_option+"']]/following-sibling::td//div[contains(@class,'grid-checkcolumn')]";//"//div[contains(@id,'Tso')]//table/tbody/tr[td/div[text()='"+tso_option+"']]/td/div/img";
		return "//div[contains(@name,'TsoGrid') or contains(@name,'TsrGrid')]//table/tbody/tr/td[div[text()='"+tso_option+"']]/following-sibling::td//div[contains(@class,'grid-checkcolumn')]";//"//div[contains(@name,'tsoGrid') or contains(@name,'TsrGrid')]//table/tbody/tr/td[div[text()='"+tso_option+"']]/following-sibling::td//div[contains(@class,'grid-checkcolumn')]";
		}
	
	public final String editProject_tsoTab_OptionsChecked(String tso_option){
		//return "//div[contains(@name,'tsoGrid')]//table/tbody/tr/td[div[text()='"+tso_option+"']]/following-sibling::td//div[contains(@class,'grid-checkcolumn-checked')]";//"//div[contains(@id,'Tso')]//table/tbody/tr[td/div[text()='"+tso_option+"']]/td/div/img[contains(@class,'checked')]";
		return "//div[contains(@name,'tsoGrid') or contains(@name,'TsrGrid')]//table/tbody/tr/td[div[text()='"+tso_option+"']]/following-sibling::td//div[contains(@class,'grid-checkcolumn-checked')]";
	}
	
	public final String editProject_tsoTab_checkCofigureReviewPhase_unCheckedReviewPhaseName(String phase)
	{
		return "//div[contains(@id,'TsoPanel')]//table//tr//td[div[text()='"+phase+"']]/following-sibling::td//div[@role='button'][not(contains(@class,'checkcolumn-checked'))]";
	}
	
	//TSR
	public final String editProject_tsrTab_cofigureReviewPhase(String phase)
	{
		return "//div[contains(@id,'TsrPanel')]//table//tr//td[div[text()='"+phase+"']]/following-sibling::td//div[contains(@role,'button')]";
	}
	
	
	public final String editProject_tsrTab_checkCofigureReviewPhase_checkedReviewPhaseName(String phase)
	{
		return "//div[contains(@id,'TsrPanel')]//table//tr//td[div[text()='"+phase+"']]/following-sibling::td//div[contains(@class,'checkcolumn-checked')]";//"//div[contains(@id,'pdAdminProjectEditTabTsrPanel')]//table[contains(@class,'x-grid-table')]//tr//td[div[text()='"+phase+"']]/following-sibling::td//img[contains(@class,'x-grid-checkcolumn-checked')]";
	}
	

	public final String editProject_tsrTab_checkCofigureReviewPhase_unCheckedReviewPhaseName(String phase)
	{
		return "//div[contains(@id,'TsrPanel')]//table//tr//td[div[text()='"+phase+"']]/following-sibling::td//div[@role='button']";//"//div[contains(@id,'TsrPanel')]//table//tr//td[div[text()='"+phase+"']]/following-sibling::td//div[@role='button'][not(contains(@class,'checkcolumn-checked'))]";
	}
	
	public final String editProject_tsrTab_OptionsChecked(String tsr_option){
		  return "//div[contains(@name,'tsrGrid') or contains(@name,'TsrGrid')]//table/tbody/tr/td[div[text()='"+tsr_option+"']]/following-sibling::td//div[contains(@class,'grid-checkcolumn-checked')]";
		 }
	public final String editProject_tsrTab_OptionsCheckBox(String tsr_option){
		  return "//div[contains(@name,'tsrGrid') or contains(@name,'TsrGrid')]//table/tbody/tr/td[div[text()='"+tsr_option+"']]/following-sibling::td//div[contains(@class,'grid-checkcolumn')]";
		 }
}
