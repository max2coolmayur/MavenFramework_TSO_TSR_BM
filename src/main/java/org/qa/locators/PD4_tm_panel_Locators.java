package org.qa.locators;
/*Created by Alfonso Almanza
 * 01/27/11 translations.com
 */
public class PD4_tm_panel_Locators {
	private static PD4_tm_panel_Locators ue;
	
	public static synchronized PD4_tm_panel_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_tm_panel_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_tm_panel_Locators();
		}
		return ue;
	}
	
	//front pane
	//translation memory sequence
		public final String translationMemorySequences_addTmProfileButton = "//span[contains(@id,'add_tm_seq')]/following-sibling::span";
		public final String translationMemorySequences_editTmProfileButton = "//span[contains(@id,'edit_tm_seq')]/following-sibling::span";
		public final String translationMemorySequences_copyTmProfileButton = "//span[contains(@id,'copy_tm_seq')]/following-sibling::span";
		public final String translationMemorySequences_autoCreateTmProfileButton = "//span[contains(@id,'auto_create_tm_seq')]";
	//translation memory
		public final String translationMemoryPanel_TMTab="//div[contains(@id,'mainTabPanel')]//span[contains(text(),'TRANSLATION MEMORY')]";
		public final String translationMemory_addTmProfileButton = "//span[contains(@id,'add_tm')]/following-sibling::span";
		public final String translationMemory_editTmProfileButton = "//span[contains(@id,'edit_tm')]/following-sibling::span";
		public final String translationMemory_importTmProfileButton = "//span[contains(@id,'import_tm')]";
		public final String translationMemory_deleteTmProfileButton = "//span[contains(@id,'delete_tm')]/following-sibling::span";
		
		public final String warningMessageNoButton="//div[contains(@id,'warning')]//span[contains(text(),'No')]/following-sibling::span";
		public final String warningMessageYesButton="//div[contains(@id,'warning')]//span[contains(text(),'Yes')]/following-sibling::span";

		public final String tm_error_message_closeButton = "//div[contains(@id,'warning')]//span[contains(text(),'Close')]/following-sibling::span";//"//span[child::span[contains(text(),'Close')]]";
		
	//Translation Memory Analysis tab Locators
	//public final String translationMemory_addTmProfileButton = "css=div[class= 'x-btn x-box-item x-toolbar-item x-btn-default-toolbar-large x-icon-text-top x-btn-icon-text-top x-btn-default-toolbar-large-icon-text-top']";
	public final String add_editTm_addTmSelectTmType = "//div[@name='tmTypeCombo']//div[contains(@class,'x-form-arrow-trigger')]";
	
	public final String add_editTm_addTmSelectTmTypeX (String type)
	{
		String result = "//div[contains(@name,'combo')]//ul//li[contains(text(),'"+type+"')]";//"css=div>ul>li.x-boundlist-item:contains('"+type+"')";
		return result;
	}
	
	public final String add_editTm_addTmSelectTmPlugin = "//div[contains(@name,'pluginCombo')]//div[contains(@class,'arrow-trigger')]";
	
	public final String add_editTm_addTmSelectTmPluginX (String type)
	{
		String result = "//div[contains(@name,'boundlist')]//ul//li[contains(text(),'"+type+"')]";//"css=div>ul>li.x-boundlist-item:contains('"+type+"')";
		return result;
	}
	
	public final String add_editTm_inputTmProfileName = "//input[@name='profileName']";
	public final String add_editTm_inputTmUrl = "//div[contains(@name,'urlServer')]//div//input[contains(@name,'urlServer')]";//"css=input[name= 'urlServer']";
	public final String add_editTm_inputTmUrl_TMS52_above = "//div[contains(@class,'server_info')]//div//input[contains(@name,'Url')]";
	public final String add_editTm_inputTmPort = "//input[@name= 'port']";
	public final String add_editTm_inputTmUsername ="//div[contains(@name,'Username')]//div//input[contains(@name,'Username')]";//"css=input[name='adminUsername']";
	public final String add_editTm_inputTmPassword = "//div[contains(@name,'Password')]//div//input[contains(@name,'Password')]";//"css=input[name='adminPassword']";
	public final String add_Tm_checkServerAvailabilityButton ="//span[text()='Test TM Server configuration']";//"//div[contains(@class,'NewTMProfileWizard ') or contains(@class,'EditTmConfiguration')]/following-sibling::div[contains(@id,'toolbar')]//span[contains(text(),'Check Server Availability')]";
	public final String add_editTm_checkServerAvailabilityButton = "//span[text()='Test TM Server configuration']";//"//div[contains(@id,'newtmprofilewizard') or contains(@id,'edittmconfiguration')]//div[contains(@id,'toolbar')]//a//span[text()='Check Server Availability']";
	public final String add_edit_disabledCheckServerAvailabilityButton="//a[contains(@class,'disabled')]//span[text()='Check Server Availability']";
	public final String add_editTm_inputTmConfigFile = "//input[@name= 'configurationFileGltm']";
	public final String add_editTm_browseButton = "//div[contains(@id,'fileuploadfield')]//input[@type='file']/preceding-sibling::span";//"//button//span[contains(text()='Browse')]";
	public final String add_editTm_inputLinguistUrl="//input[@name='linguistUrl']";
	public final String add_editTm_inputLinguistTMLogin="//input[@name='linguistUsername']";
	public final String add_editTm_inputLinguistTMPassword="//input[@name='linguistPassword']";
	public final String add_editTm_inputTMName="//input[@name='tmName']";
	public final String add_editTm_inputTMName_TMS52_above="//input[@name='tmName']";
	public final String add_editTm_inputPluginName="//input[contains(@name,'plugin')]";//css=input[name='pluginsCombo']";
	public final String add_editTm_inputTMType="//input[contains(@name,'tmType')]";//css=input[name='tmTypesCombo']";
	public final String tmConfWizard_CancelButton ="//div[contains(@id,'pdnewtmprofilewizard')]//span[text()='Cancel']/following-sibling::span";
	public final String add_editTm_inputTmUsername_TMS52_above = "//div[contains(@class,'server_info')]//div//input[contains(@name,'Login')]";
	public final String add_editTm_inputTmPassword_TMS52_above = "//div[contains(@class,'server_info')]//div//input[contains(@name,'Password')]";
	public final String add_editTm_inputTmCleanupPassword_TMS52_above = "//div[contains(@name,'tmUpdate')]//div//input[contains(@name,'tmUpdate')]";
	
	//Cleanup section	
	public final String add_editTm_tmCleanupTab = "css=span:contains('Cleanup')";
	public final String add_editTm_cleanupUpdateTmCheckBox = "//div[contains(@name,'updateTMCheck')]//div//span";
	public final String add_editTm_checkedUpdateTMCheckbox="//table[contains(@class,'checked')]//input[@name='updateTMCheck']";
	public final String add_editTm_checkedAddfileNameCheckbox="//table[contains(@class,'checked')]//input[@name='addFileName']";
	
	
	//As per update is not working so changing the locators
	public final String add_editTm_lucene_updateTmCheckbox="//div[contains(@id,'extendedConfig')]//label[contains(text(),'Update TM')]//..//span";//"//div[contains(@id,'pdnewtmprofilewizard')][contains(@class,'NewTMProfileWizard')]//div[contains(@class,'x-panel-default')][contains(@style,'width: 600px; height: ')][contains(@id,'panel')][not(contains(@style,'display: none;'))]//input[contains(@name,'updateTM')]/following-sibling::span";
	
	
	//public final String add_editTm_lucene_updateTmCheckbox="//div[contains(@id,'pdtmdialogstmconfigurationpanel')]//div[contains(@class,'box-item')][not(contains(@class,'TMConfigurationPanel'))][not(contains(@style,'display: none;'))]//input[contains(@name,'updateTMCheckLucene') or contains(@name,'updateTMCheck')]/following-sibling::span";//"//input[contains(@name,'updateTMCheckLucene') or contains(@name,'updateTMCheck')]/following-sibling::span";//"//table[contains(@name,'updateTMCheck')]//tr//td//input[contains(@name,'updateTMCheck')]";//"//input[contains(@name,'updateTMCheck')]";
	public final String add_editTm_gltm_autoDeliverGoldenCheckbox="//input[contains(@name,'autoDeliverGltm')]";
	public final String add_editTm_lucene_autoDeliverGoldenCheckbox="//input[contains(@name,'autoDeliverLucene') or contains(@name,'autoDeliver')]/following-sibling::span";//"//input[contains(@name,'autoDeliver')]";//"//input[contains(@name,'autoDeliverLucene') or contains(@name,'autoDeliverGltm')]";//"//input[contains(@name,'autoDeliver')]";//"//input[contains(@name,'autoDeliver')]";
	public final String add_editTM_lucene_updateTMCheckboxChecked="//table[contains(@class,'checked')]//input[@name='updateTMCheckLucene']";
	public final String add_editTm_copyDataFromAnalysisButton = "css=em>button:contains('Copy Data From Analysis')";
	public final String add_editTm_inputTmCleanupPassword = "//div[contains(@name,'writePasswordGltm')]//div//input[contains(@name,'writePasswordGltm')]";
	public final String add_editTm_projectTmTypeOkButton = "css=button[name= 'ProjectTmTypeOKButton']";
	
	public final String filter_tm_inputTmNameFind="css=input[name= 'tmNameInputText']";
	public final String importTM_lockBandsButton="//span/span[text()='Lock Bands']/following-sibling::span";
	public final String importTM_pluginNameInput="//table[@name='pluginsCombo']//td/table//td/input[@name='pluginsCombo']";
	public final String importTM_pluginNameSelectButton="//div[@name='pluginsCombo']//div[contains(@class,'x-form-arrow-trigger')]";
	public final String importTM_tmTyypeInput="//table[@name='tmTypesCombo']//td/table//td/input[@name='tmTypesCombo']";
	public final String importTM_tmTypeSelectButton="//div[@name='tmTypesCombo']//div[contains(@class,'x-form-arrow-trigger')]";
	public final String importTM_leverageConfigFileInput="//table[@name='leveragePanel']//input[@name='leveragePanel']";
	public final String importTM_leverageBrowseInput="css=label:contains('Leverage Config File:')+div>div>input[type='file']";
	public final String importTM_csvInput="//table[@name='csvPanel']//input[@name='csvPanel']";
	public final String importTM_csvBrowseInput="css=label:contains('CSV:')+div>div>input[type='file']";
	public final String importTM_assignTMSequenceCheckBox="//input[@name='assignSequences']/following-sibling::span";
	public final String importTM_secondaryTMPenaltyInput="//input[@name='secondaryTmPenalty']";
	public final String importTM_lockBands_headerCheckbox="//div[contains(@id,'pdlockbandsgrid')][not(contains(@style,'none'))]//div/span[contains(@class,'checkheader')]";
	public final String importTM_lockbandsWizard_okButton="//div[contains(@id,'pdlockbandsdialog')]//span[text()='OK']/following-sibling::span";
	public final String importTM_errorMessageCloseButton="//div[contains(@id,'warning')]//a//span[text()='Close']/following-sibling::span";
	public final String importTM_lockBands_verifyHeaderChecked="//div[contains(@id,'pdlockbandsgrid')][not(contains(@style,'none'))]//div/span[contains(@class,'x-grid-checkcolumn-checked')]";
	
	
	public final String translationMemoryButton="//span[text()='TM']";
	public final String translationMemory_addTMButton="//span[text()='Add TM Profile']/following-sibling::span";
	public final String translationMemory_editTMProfileButton="//span[text()='Edit TM Profile']/following-sibling::span";
	public final String translationMemory_deleteTMProfileButton="//span[text()='Delete TM Profile']/following-sibling::span";
	public final String translationMemory_importTMButton="//span[text()='Import TMs']/following-sibling::span";
	
	
	public final String add_editTm_workaroundID_input = "//input[@name='workgroupId']";
	public final String add_editTm_attribute_input = "//input[contains(@name, 'Attribute')]";
	public final String checkAutoDeliverFiles_100Golden = "//label[text()='Auto-Deliver files that are 100% Golden']";
	public final String lucene_checkAutoDeliverFiles_100Golden="//input[@name='autoDeliverLucene']";
	public final String checkAutoDeliverFiles_NonTranslatable = "//label[text()='Auto-Deliver files that are Non Translatable']";
	public final String lucene_checkAutoDeliverFiles_NonTranslatable="//input[@name='autoDeliverLuceneNonTranslatable']";
	public final String check_OTS_TM = "//input[@name='otsTmCheckBox']";
	public final String add_editTm_addFileName_checkbox = "//input[@name= 'addFileName']/following-sibling::span";
	public final String add_edtTm_addFilename_TM4lucene_checkbox="//input[@name= 'addFileNameLucene']";
	public final String add_editTm_addCreationTool_checkbox = "//input[@name= 'addCreationTool']";
	public final String add_editTm_addFilePath_checkbox_disabled = "//div[@class='x-form-check-wrap x-item-disabled']/input[@name= 'cleanupAddFilePath']";
	public final String add_editTm_addFilePath_checkbox = "//input[@name= 'addFilePath']";
	public final String add_editTm_addCreationToolVersion_checkbox_disabled = "//div[@class='x-form-check-wrap x-item-disabled']/input[@name= 'addCreationToolVersion']";
	public final String add_editTm_addCreationToolVersion_checkbox = "//input[@name= 'addCreationToolVersion']";
	public final String add_editTm_addDataType_checkbox_disabled = "//div[@class='x-form-check-wrap x-column x-item-disabled']/input[@name= 'addDataType']";
	public final String add_editTm_addDataType_checkbox = "//input[@name= 'addDataType']";
	public final String add_editTm_fetchTMattributes_button = "//button/span[text()='Fetch TM Attributes']";
	public final String add_editTm_fetchTMattributes_button_disabled = "//table[contains(@class,'x-item-disabled')]//button/span[text()='Fetch TM Attributes']";
	//Translation Memory sequence tab locators
	public final String translationMemory_translationMemorySequenceTab="//span[contains(text(),'TM Sequence')]";
	public final String translationMemory_translationMemorySequenceTab_addTMSequence="//span[contains(@id,'pd_add_tm_sequence_action')]";
	public final String translationMemory_translationMemorySequenceTab_editTMSequence="//span[contains(@id,'pd_edit_tm_sequence_action')]/following-sibling::span";
	public final String translationMemory_translationMemorySequenceTab_copyTMSequence="//span[contains(@id,'pd_copy_tm_sequence_action')]";
	public final String translationMemory_translationMemorySequenceTab_autoCreateTMSequence="//span[contains(@id,'pd_auto_create_tm_sequence_action')]";
	public final String warningCloseButton="css=button>span:contains('Close')";
	public final String redCrossSign="//div[@class='xsign']";
	public final String greenTickSign="//div[@class='checkedsign']";
	public final String add_editTm_finishButton = "//span[text()= 'Finish']";
	public final String disabledFinishButton="css=div[class*='disabled'] button>span:contains('Finish')";
	public final String translationMemorySequenceTab_addTMSequence_selectLanguagePairButton="//div[contains(@name,'languageCombo')]//div[contains(@class,'triggerExpand')]";
	public final String translationMemorySequenceTab_addTMSequence_languagePairInput="//input[contains(@name,'languageCombo')]";
	public final String translationMemorySequenceTab_addTMSequence_filterTmOkButton="//div[contains(@id,'pdfiltertmsdialog')]//div[contains(@id,'toolbar')]//span[contains(text(),'OK')]";
	public final String translationMemorySequenceTab_addTMSequence_TMSequenceWindowSaveDisabledButton="//a[contains(@class,'disabled')]//span[contains(text(),'Save')]";
	public final String translationMemorySequenceTab_addTMSequence_TMSequenceWindowSaveButton="//div[contains(@id,'AdminTmSequence')]//span[contains(text(),'Save')]";
	public final String primaryTM_disabled = "//a[contains(@class,'x-item-disabled')]//span[text()='Primary TM']/following-sibling::span";
	public final String primaryTM_enabled = "//span[text()='Primary TM']/following-sibling::span";
	public final String leftArrow ="//span[contains(@class,'leftarrow')]";
	public final String priority_downarrow ="//a[contains(@data-qtip,'Move down')]//span[contains(@class,'movedown')]";
	public final String translationMemorySequenceTab_addTMSequence_TMSequenceWindow_filterTMExpandButton="//div[contains(@id,'AdminTmSequence')]//div[contains(@class,'expand-bottom')]";//div[contains(@id,'pdtmsequencesdialog')]//div[contains(@class,'expand-bottom')]";
	public final String translationMemorySequenceTab_addTMSequence_TMSequenceWindow_OrganizationCheck="//input[contains(@name,'organizationCheckBtn')]/following-sibling::span";
	public final String translationMemorySequenceTab_addTMSequence_TMSequenceWindow_UnassignedCheck="//input[contains(@name,'unassignedCheckBtn')]/following-sibling::span";
	public final String translationMemorySequenceTab_addTMSequence_TMSequenceWindow_rightArrowButton="//a[@data-qtip='Move right']";//div[contains(@id,'tmsequences')]//a[@data-qtip='Move right']//span[contains(@class,'rightarrow')]";
	public final String translationMemorySequenceTab_addTMSequence_TMSequenceWindow_rightArrowDisabledButton="//div[contains(@id,'tmsequence')]//a[contains(@class,'x-disabled')][@data-qtip='Move right']//span[contains(@class,'rightarrow')]";
	public final String translationMemorySequenceTab_addTMSequence_TMSequenceWindowSequenceNameInput="//input[contains(@name,'sequenceName')]";
	public final String LockBands_enabled = "//span[contains(text(),'Lock Bands')]/following-sibling::span";
	public final String LockBands_disabled = "//table[contains(@class,'x-column x-item-disabled')]//button[contains(text(), 'Lock Bands')]";
	
	public final String tmSequenceTab_EditTMsequence_Priority(int rowno,String tmname)
	{
		String result="//div[contains(@id,'AdminTmSequenceGridAssigned')]//div[contains(@role,'rowgroup')]//table["+rowno+"]//span[contains(text(),'"+tmname+"')]";
		return result;
	}
	
	public final String translationMemorySequenceTab_SearchTMsequenceInput="css=input[name='tmSequenceNameInputText']";
	public final String findButton="css=button>span:contains('Find')";
	public final String translationMemorySequenceTab_SearchTMsequenceClearButton="css=button>span:contains('Clear')";
	public final String firstDataRow="//div[contains(@id,'gs4trmaingrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";//css=div[id*='gs4trmaingrid'] table tr:nth-child(2)";
	public final String translationMemorySequenceTab_TMSequenceWindow_selectPrimaryTM="//div[contains(@id,'pdtmsequencesgrid') and contains(@class,'x-column')]//table//tr[1]";
	public final String translationMemorySequenceTab_lockBandCostScopeDetailsCheckAll="//div[contains(@id,'pdlockbandsgrid') and not(contains(@style,'display: none'))]//div[contains(@id,'gs4trcheckcolumn')]/span[contains(@class,'checkheader')]";
	public final String translationMemorySequenceTab_lockBandCostScopeDetailsChecked="//div[contains(@id,'pdlockbandsgrid') and not(contains(@style,'display: none'))]//div[contains(@id,'gs4trcheckcolumn')]/span[contains(@class,'checked')]";
	public final String translationMemorySequence_firstDataRow="//div[contains(@id,'gs4trmaingrid')]//descendant::tr[contains(@class,'x-grid-row')][1]";
	//TM Sequence Filter Loc
	public final String tmSequenceTab_TMSequenceWindow_fliterDefaultFormat="//table[contains(@class,'checked')]//input[@name='showAllRadioBtn']";
	public final String tmSequenceTab_TMSequenceWindow_fliterDefaultAssignmnet="//table[contains(@class,'checked')]//input[@name='clientCheckBtn']";
	public final String tmSequenceTab_TMSequenceWindow_fliterOptionTxml="//input[@name='txmlRadioBtn']";
	public final String tmSequenceTab_TMSequenceWindow_fliterOptionTxlf="//input[@name='txlfRadioBtn']";
	public final String tmSequenceTab_TMSequenceWindow_fliterAssignmnetOrgCheck="//input[@name='organizationCheckBtn']";
	public final String tmSequenceTab_TMSequenceWindow_fliterAssignmnetUnassignedCheck="//input[@name='unassignedCheckBtn']";
	//Edit TM Sequence Locs
	public final String tmSequenceTab_editTMSequenceButton="//span[text()='Edit TM Sequence']/following-sibling::span";
	public final String tmSequenceTab_copyTmSequenceButton="//span[text()='Copy TM Sequence']/following-sibling::span";
	public final String tmDequenceTab_copyTmInput="//input[@name='newTmSequence']";
	public final String tmSequenceTab_copyButton="//div[contains(@id,'pdcopytmsequence')]//div[contains(@id,'toolbar')]//a//span[contains(text(),'Copy')]/following-sibling::span";
	public final String warningcloseButton="//div[contains(@id,'warning')]//span[contains(text(),'Close')]/following-sibling::span";
	public final String tmSequenceTab_copyTmCancelButton="//div[contains(@id,'pdcopytmsequencedialog')]//div[contains(@id,'toolbar')]//a//span[contains(text(),'Cancel')]/following-sibling::span";
	
	public final String priorityMoveUpDisabledButton="//a[contains(@class,'disabled')]//span[contains(@class,'moveup')]";
	public final String priorityMoveDownDisabledButton="//a[contains(@class,'disabled')]//span[contains(@class,'movedown')]";
	public final String priorityMoveDownButton="//span[contains(@class,'movedown')]";
	public final String priorityMoveUpButton="//span[contains(@class,'moveup')]";
	
	public final String tmSequenceTab_TMSequenceWindow_verifyAvailableTmX(String tmName,String format)
	{
		String result="//div[contains(@id,'pdtmsequencesgrid')]//table//tr[td/div[text()='"+tmName+"']]/td/div[text()='"+format+"']";
		return result;
	}
	public final String translationMemorySequenceTab_TMSequenceWindow_lockBandCostScopeTabX(String costscope)
	{
		String result="//div[contains(@id,'pdlockbandsdialog')]//span[text()='"+costscope+"']/following-sibling::span";
		return result;
	}
	public final String translationMemorySequenceTab_TMSequenceWindow_lockBandCostScopeDetails(String value)
	{
		String result="//div[contains(@id,'pdlockbandsgrid') and not(contains(@style,'display: none'))]//tr/td/div/span[contains(@class,'font') and contains(text(),'"+value+"')]";
			//	"//div[contains(@id,'pdlockbandsgrid') and not(contains(@style,'display: none'))]//tr/td/div/font[contains(@color,'#CCCC99') and contains(text(),'"+value+"')]";
		return result;
	}
	
	public final String translationMemorySequenceTab_TMSequenceWindow_lockBandCostScopeDetailsd_lockedX(String value)
	{
		String result="//div[contains(@id,'pdlockbandsgrid') and contains(@name,'grid') and not(contains(@style,'display: none;'))]//tr[contains(@class,'disabled ')]//td/div/span[contains(@class,'font') and contains(text(),'"+value+"')]";
				
			//	"//div[contains(@id,'pdlockbandsgrid') and contains(@name,'grid')]//tr[contains(@class,'disabled ')]//td/div/span[contains(@class,'font') and contains(text(),'"+value+"')]";
			
		return result;
	}
	public final String translationMemorySequenceTab_TMSequenceWindow_lockBandCostScopeDetails_fuzzy(String value)
	{
		String result="//div[contains(@id,'pdlockbandsgrid') and not(contains(@style,'display: none'))]//tr/td/div[text()='"+value+"']";
		return result;
	}
	public final String translationMemorySequenceTab_TmSequenceWindow_SelectPrimaryTM="//div[contains(@id,'pdtmsequencesgrid') and contains(@class,'x-column')]//table//tr[1]/td/div/span";
	public final String translationMemorySequenceTab_addTMSequence_TMSequenceWindow_selectAvailableTMs(String tmName)
	{
		//String result="//div[contains(@id,'pdtmsequencesgrid')]//table//tr/td/div[text()='"+tmName+"']";
		String result="//div[contains(@id,'pdtmsequencesgrid') or contains(@id,'TmSequenceGrid')]//table//tr/td/div[text()='"+tmName+"']";
		return result;
	}
	public final String translationMemorySequenceTab_addTMSequence_selectLanguagePairX(String langPair)
	{
		String result="//div[@name='languageCombo-boundlist']//li[text()='"+langPair+"']";
		return result;
	}
	
	public final String translationMemorySequenceTab_addTMSequence_SelectedTmX(String tmName)
		{
			String result="//div[contains(@id,'pdtmsequencesgrid') and contains(@class,'x-column')]//table//tr/td/div[text()='"+tmName+"']";
			return result;
		}
	
	
	public final String TMWithData(String name, String type, String tgtLanguageCode, String address)
	{
		return "//tr[td[div[text()='"+name+"']]/following-sibling::td[div[text()='"+type+"']]/following-sibling::td[div[contains(text(),'"+tgtLanguageCode+"')]]/following-sibling::td[div[text()='"+address+"']]]";
	}
	

	public final String editTm_tmConfigurationTab="//div[contains(@id,'edittmconfiguration')]//span[text()='TM Configuration']";
	public final String editTm_tmTypeTab="//div[contains(@id,'edittmconfiguration')]//span[text()='TM Type']";
	public final String fetchTMAttibutesButton="//span[text()='Retrieve TM Attributes']";
	public final String cleanUp_inputAttribute="css=input[name= 'addAttributeText']";
	
	public final String selectAttributeValue(String attribute)
	{
		return "//td[div[text()='"+attribute+"']]/following-sibling::td/div";
	}
	
	
	public final String editTm_okButton="//div[contains(@id,'tmconfiguration')]//div[contains(@id,'toolbar')]//span[contains(text(),'OK')]//following-sibling::span";
	public final String okButton_disabled="//a[contains(@class,'disabled')]//span[contains(text(),'OK')]";
	public final String Applybutton="//span[contains(text(),'Apply')]//following-sibling::span";
	public final String applyButton_disabled="//a[contains(@class,'disabled')]//span[contains(text(),'Apply')]";//div[contains(@class,'disabled')]//button/span[contains(text(),'Apply')]";
	
	//Column Names - tab Translation Memory - list of items
	public final String columnTranslationMemory_Names ="//div[contains(@id,'mainTabPanel-body')]//span[text()='Name']"; 
	public final String columnTranslationMemory_TMType = "//div[contains(@id,'mainTabPanel-body')]//span[text()='TM Type']";
	public final String columnTranslationMemory_LanguageDirection = "//div[contains(@id,'mainTabPanel-body')]//span[text()='Language Direction']";
	public final String columnTranslationMemory_TMAddress = "//div[contains(@id,'mainTabPanel-body')]//span[text()='TM Address']";
			
	//Column Names - tab Translation Memory Sequence
	public final String columnTranslationMemorySeq_Name ="//div[contains(@id,'mainTabPanel-body')]//div[contains(@id,'gs4trmaingrid') and contains(@class,'x-panel-default')]//span[text()='Name']";
	public final String columnTranslationMemorySeq_NameX(int columnNumber){
		String result = "//div[starts-with(@id,'mainTabPanel-body')]//div[contains(@id,'gs4trmaingrid') and contains(@class,'x-panel-default')]//descendant::div[contains(@class,'x-column-header-inner')]["+columnNumber+"]";
		return result;
	}
	public final String columnTranslationMemorySeq_Description ="//div[contains(@id,'mainTabPanel-body')]//div[contains(@id,'gs4trmaingrid') and contains(@class,'x-panel-default')]//span[text()='Description']";
	public final String columnTranslationMemorySeq_LangDirect ="//div[contains(@id,'mainTabPanel-body')]//div[contains(@id,'gs4trmaingrid') and contains(@class,'x-panel-default')]//span[text()='Language Directions']";
	
	//Menu-list of items for Name_Columns (Translation Memory Sequence tab - Name)
	public final String columnTranslationMemorySeqMenu_Columns ="//div[@class='x-panel x-layer x-panel-default x-menu x-border-box'][not(contains(@style,'visibility: hidden'))]//a/span[text()='Columns']";//a[starts-with(@id,'menuitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Columns')]]";
	//public final String columnTranslationMemorySeqMenu_Names_ColumnsName = "//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Name')]]";
	public final String columnTranslationMemorySeqMenu_Names_ColumnsName_unchecked ="//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Name')]][ancestor::div[contains(@class,'x-menu-item-unchecked')]]";
	public final String columnTranslationMemorySeqMenu_Names_ColumnsName_checked ="//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Name')]][ancestor::div[contains(@class,'x-menu-item-checked')]]";

	//Menu-list of items for Name_Columns - Description(Translation Memory Sequence tab - Description)
	public final String columnTranslationMemorySeqMenu_Description_ColumnsName = "//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Description')]]";
	public final String columnTranslationMemorySeqMenu_Description_ColumnsName_unchecked ="//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Description')]][ancestor::div[contains(@class,'x-menu-item-unchecked')]]";
	public final String columnTranslationMemorySeqMenu_Description_ColumnsName_checked ="//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Description')]][ancestor::div[contains(@class,'x-menu-item-checked')]]";
	
	//Menu-list of items for Name_Columns - Labguage Directions (Translation Memory Sequence tab - Labguage Directions)
	public final String columnTranslationMemorySeqMenu_LangDirections_ColumnsName = "//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Language Directions')]]";
	public final String columnTranslationMemorySeqMenu_LangDirections_ColumnsName_unchecked ="//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Language Directions')]][ancestor::div[contains(@class,'x-menu-item-unchecked')]]";
	public final String columnTranslationMemorySeqMenu_LangDirections_ColumnsName_checked ="//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Language Directions')]][ancestor::div[contains(@class,'x-menu-item-checked')]]";
	
	//Menu-list of items for Name_Columns (Translation Memory tab - Name)
	public final String columnTranslationMemoryMenu_Columns ="//div[@class='x-panel x-layer x-panel-default x-menu x-border-box'][not(contains(@style,'visibility: hidden'))]//a/span[text()='Columns']";
	public final String columnTranslationMemoryMenu_Names_Columns ="//a[starts-with(@id,'menuitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Columns')]]";
	public final String columnTranslationMemoryMenu_Names_ColumnsName = "//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Name')]]";
	public final String columnTranslationMemoryMenu_Names_ColumnsName_unchecked ="//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Name')]][ancestor::div[contains(@class,'x-menu-item-unchecked')]]";
	public final String columnTranslationMemoryMenu_Names_ColumnsName_checked ="//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Name')]][ancestor::div[contains(@class,'x-menu-item-checked')]]";
	
	//Menu-list of items for TM Type_Columns (Translation Memory tab - TM Type)
	public final String columnTranslationMemoryMenu_TMType_ColumnsName = "//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'TM Type')]]";
	public final String columnTranslationMemoryMenu_TMType_ColumnsName_unchecked ="//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'TM Type')]][ancestor::div[contains(@class,'x-menu-item-unchecked')]]";
	public final String columnTranslationMemoryMenu_TMType_ColumnsName_checked ="//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'TM Type')]][ancestor::div[contains(@class,'x-menu-item-checked')]]";
	
	//Menu-list of items for Language Direction_Columns (Translation Memory tab - Directions)
	public final String columnTranslationMemoryMenu_LangDir_ColumnsName = "//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Language Direction')]]";
	public final String columnTranslationMemoryMenu_LangDir_ColumnsName_unchecked ="//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Language Direction')]][ancestor::div[contains(@class,'x-menu-item-unchecked')]]";
	public final String columnTranslationMemoryMenu_LangDir_ColumnsName_checked ="//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'Language Direction')]][ancestor::div[contains(@class,'x-menu-item-checked')]]";
	
	//Menu-list of items for TM_Address_Columns (Translation Memory tab - TM Address)
	public final String columnTranslationMemoryMenu_TMAddr_ColumnsName = "//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'TM Address')]]";
	public final String columnTranslationMemoryMenu_TMAddr_ColumnsName_unchecked ="//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'TM Address')]][ancestor::div[contains(@class,'x-menu-item-unchecked')]]";
	public final String columnTranslationMemoryMenu_TMAddr_ColumnsName_checked ="//a[starts-with(@id,'menucheckitem') and contains(@class,'x-menu-item-link')][child::span[contains(text(),'TM Address')]][ancestor::div[contains(@class,'x-menu-item-checked')]]";
	
	public final String filters_tm_inputTmNameFind = "//input[@name='tmNameInputText']";
			
	public final String tmViewSortKey = "//table/thead/tr/td/div/img";
	public final String tmViewNameColumnTitle = "//div[starts-with(@id,'mainTabPanel-body')]//div//span[contains(text(),'Name')]";
	public final String tmViewColumnTitleX(int columnNumber){
		String result = "//div[starts-with(@id,'mainTabPanel-body')]//descendant::div[contains(@class,'x-column-header-inner')]["+columnNumber+"]";
		return result;
	}
	public final String tmViewTmTypeColumnTitle = "//div[starts-with(@id,'mainTabPanel-body')]//div[child::span[contains(text(),'TM Type')]]";
	public final String tmViewLanguageDirectionColumnTitle = "//div[starts-with(@id,'mainTabPanel-body')]//div[child::span[contains(text(),'Language Direction')]]";
	public final String tmViewTmAddressColumnTitle = "//div[starts-with(@id,'mainTabPanel-body')]//div[child::span[contains(text(),'TM Address')]]";
	public final String tmNameRowTitle = "//span[text()='Name']/following-sibling::div";
	public final String tmNameRowTitleArrowX (int columnNumber){
		String result = "//div[starts-with(@id,'mainTabPanel-body')]//descendant::div[contains(@class,'x-column-header-inner')]["+columnNumber+"]/div[contains(@class,'x-column-header-trigger')]";
		return result;
	}
	public final String tmNameSeqRowTitle = "//div[starts-with(@id,'gs4trmaingrid')]//div//span[contains(text(),'Name')]/div";
	public final String tmNameSeqRowTitleArrowX (int columnNumber){
		String result = "//div[contains(@id,'mainTabPanel-body')]//div[contains(@id,'gs4trmaingrid') and contains(@class,'x-panel-default')]//descendant::div[contains(@class,'x-column-header-inner')]["+columnNumber+"]/div[contains(@class,'x-column-header-trigger')]";
		return result;
	}
	public final String tmTypeRowTitle = "//div[starts-with(@id,'mainTabPanel-body')]//div[child::span[contains(text(),'TM Type')]]/div[contains(@class,'x-column-header-trigger')]";
	public final String tmLanguageDirectionRowTitle = "//div[starts-with(@id,'mainTabPanel-body')]//div[child::span[contains(text(),'Language Direction')]]/div[contains(@class,'x-column-header-trigger')]";
	public final String tmAddressRowTitle = "//div[starts-with(@id,'mainTabPanel-body')]//div[child::span[contains(text(),'TM Address')]]/div[contains(@class,'x-column-header-trigger')]";
	public final String tmNameRowTitle_ascendingOrder = "//a/span[contains(text(),'Sort Ascending')]";
	public final String tmNameRowTitle_descendingOrder = "//a/span[contains(text(),'Sort Descending')]";
	
	//first data row
	public final String tm_firstDataRowName = "//div[starts-with(@id,'pdmaingrid')]//tr[contains(@class,'x-grid-row')][1]/td[contains(@class,'x-grid-cell-first')]/div";
	public final String tm_firstDataRowTMtype = "//div[contains(@class,'x-grid3-scroller')]/div[1]/div[1]/table/tbody/tr/td[2]/div";
	public final String tm_firstDataRowLanguageDirection = "//div[contains(@class,'x-grid3-scroller')]/div[1]/div[1]/table/tbody/tr/td[3]/div";
	public final String tm_firstDataRowTMadress = "//div[contains(@class,'x-grid3-scroller')]/div[1]/div[1]/table/tbody/tr/td[4]/div";
	
	public final String tmNameX(int row){
		String result = "//div[starts-with(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[contains(@class,'x-grid-cell-first')]/div";
		return result;
	}
	
	public final String groupTitleX (String title){
		String result = "//div[@class='x-grid-group-title'][contains(text(),'"+title+"')]";
		return result;
	}

	public String name_TMSequense(String nameTMseq) {
		String result = "//div[contains(@class,'x-grid3-body')]//div[text()='"+nameTMseq+"']";
		//String result = "//div[text()='"+nameTMseq+"']";
		return result;
	}
	
	
	public final String tmSequencesLanguagePair ="//div[contains(@class,'x-superboxselect-btns')]";
	public final String tmSequencesLanguagePairEnDe ="//div[contains(text(),'en-us>de-de')]";
	public final String translationMemorySequencesTab = "//span[contains(text(),'TRANSLATION MEMORY SEQUENCES')]/following-sibling::span";//"css=span:contains('TRANSLATION MEMORY SEQUENCES')";
	public final String translationMemoryTab="//div[starts-with(@id,'panel') and contains(@class,'x-panel-body-default')]//span[text()='TRANSLATION MEMORY']/following-sibling::span";
	public final String inputWorkgroupId = "css=input[name= 'workgroupId']";
	public final String inputSearchDepth = "//input[contains(@name,'searchDepth')]";//"css=input[name= 'searchDepth']";
	public final String showTmConfigurationButton = "css=button:contains('Show Configuration')";
	public final String lucene_showConfigurationButton="//table[@name='configurationFileLucene']/..//a//span[contains(text(),'Show Configuration')]/following-sibling::span";
	
	
	
	//swapnil
	
	public final String tmMemory_tmSequence_nameColumn_hiddenExpandButton="//div[contains(@id,'maingrid')][not(contains(@style,'none'))]//span[text()='Name']/following-sibling::div";
	public final String tmMemory_tmSequence_columns_checkedColumnX="//div[@class='x-component x-box-item x-component-default x-menu-item x-menu-item-checked']//span";
	public final String tmMemory_tmSequence_cloumns_checkUncheckColumns(String columnName)
	{
		return "//div[@class='x-panel x-layer x-panel-default x-menu x-border-box'][not(contains(@style,'visibility: hidden'))]//a/span[text()='"+columnName+"']";
	}
	
	public final String tmMemory_tmSequence_ColumnX(String column)
	{
		return "//div[contains(@id,'maingrid')][not(contains(@style,'display: none'))]//div[contains(@id,'header')]//span[text()='"+column+"']";
	}
	
	public final String firstDatarow="//div[@class='x-panel x-grid-with-row-lines x-tabpanel-child x-panel-default x-grid'][not(contains(@style,'none'))]//tr[contains(@class,'x-grid-row')]";
	
	public final String error_inputSecondaryTMPenalty="//input[@name='secondaryTmPenalty'][contains(@data-errorqtip,'The maximum value for this field is 100')]";
	
	public final String importWindow_disabledImportButton="//a[contains(@class,'disabled')]//span[text()='Import']";
	public final String importWindow_firstDataRow_languageDirection="//div[contains(@id,'pdmaingrid')]//tbody/tr/td[3]/div";
	public final String translationMemorySequenceTab_addTMSequence_filterTmSearch_Input="//input[contains(@name,'searchTextField')]";

	
	
}
