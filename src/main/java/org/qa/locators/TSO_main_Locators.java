package org.qa.locators;

import org.gs4tr.qa.utility.BrowserFactory;


public class TSO_main_Locators {
	private static TSO_main_Locators ue;
	public static synchronized TSO_main_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new TSO_main_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new TSO_main_Locators();
		}
		return ue;
	}
	
	public final String currentproject_transcheck = "//span[contains(@class,'link')][contains(text(),'Preferences > Transcheck')]";

	public final String mainTabs_translation = "//span[text()='Translation']";
	public final String mainTabs_file = "//span[text()='File']";
	public final String mainTabs_review = "//span[text()='Review']";
	public final String mainTabs_Edit = "//div[contains(@id,'tabbar')]//span[text()='Edit']";
	public final String mainTabs_Help = "//div[contains(@id,'tabbar')]//span[text()='Help']";
	public final String mainTabs_segment = "//div[contains(@id,'tabbar')]//a[not(contains(@style,'display: none;'))]//span[text()='Segment']";
	public final String mainTabs_terminology="//div[contains(@id,'tabbar')]//span[text()='Terminology']";
	public final String hideToolbar_button_hide = "//div[contains(@class,'x-tool-img x-tool-up')]";
	public final String hideToolbar_button_unhide = "//div[contains(@class,'x-tool-img x-tool-down')]";
	public final String tso_prepare_MT_connection_message ="//div[text()='Preparing MT connections']";

	
	//Edit Main Menu
	public final String editTab_Undo_button = "//a[contains(@class,'undo')]//span[text()='Undo']";
	public final String editTab_Redo_button = "//a[contains(@class,'redo')]//span[text()='Redo']";
	
	//Preferences
	public final String editTab_preferences = "//a//span[contains(@class,'preference')]";//"//a[contains(@class,'preference')]//span[contains(text(),'Preferences')]";//"//a[contains(@id,'preference')]";
	public final String editTab_preferences_MachineTranslation = "//span[text()='Machine Translation']";
	public final String editTab_preferences_MachineTranslation_AlwaysShowMTResultimnTMLookup = "//div[contains(@name,'always')]//input[contains(@name,'always')]/following-sibling::span[contains(@class,'radio')]";
	public final String editTab_preferences_MachineTranslation_ShowMTResultimnTMLookupWhenthereIsNoTMMatch = "//div[contains(@name,'noTM')]//input[contains(@name,'noTM')]/following-sibling::span[contains(@class,'radio')]";
	
	
	public final String editTab_preferences_MachineTranslation_enableWordLingo_checkbox = "//input[@name='enableWorldLingo']/following-sibling::span";//"//input[@name='enableWorldLingo']";
	public final String editTab_preferences_MachineTranslation_enableWordLingo_checkbox_checked ="//div[contains(@name,'enableWorldLingo')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	public final String editTab_preferences_MachineTranslation_enableWordLingoPrimary_checkbox = "//div[contains(@name,'worldLingoPrimary')]//span[contains(@class,'checkbox')]";//"//input[@name='enableWorldLingo']";
	public final String editTab_preferences_MachineTranslation_enableWordLingoPrimary_checkbox_checked ="//div[contains(@name,'worldLingoPrimary')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	

	public final String editTab_preferences_MachineTranslation_enableWordLingo_TestBtn = "//div[contains(@name,'worldLingoPrimary')]/following-sibling::a/..//span[text()='Test']";//"//table[contains(@name,'worldLingoPrimary')]/..//span[text()='Test']/following-sibling::span";
	public final String editTab_preferences_MachineTranslation_enableGoogleTranslator_checkbox = "//input[@name='enableGoogle']/following-sibling::span";
	public final String editTab_preferences_MachineTranslation_enableGoogleTranslator_checkbox_checked ="//div[contains(@name,'enableGoogle')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	public final String editTab_preferences_MachineTranslation_enableGoogleTranslator_TestBtn = "//div[contains(@name,'appGooglePrimary')]/following-sibling::a/..//span[text()='Test']";
	public final String editTab_preferences_MachineTranslation_GoogleAPI_input = "//div[contains(@name,'ApiKeyGoogle')]//input[contains(@name,'ApiKeyGoogle')]";
	public final String editTab_preferences_MachineTranslation_enableMicrosoftTranslator_checkbox = "//input[@name='enableMicrosoft']/following-sibling::span";
	public final String editTab_preferences_MachineTranslation_enableMicrosoftTranslator_checkbox_checked ="//div[contains(@name,'enableMicrosoft')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	public final String editTab_preferences_MachineTranslation_enableMicrosoftTranslator_TestBtn = "//div[contains(@name,'appMicrosoftPrimary')]/following-sibling::a/..//span[text()='Test']";
	public final String editTab_preferences_MachineTranslation_MicrosoftAPI_input = "//div[contains(@name,'appKeyMicrosoft')]//input[contains(@name,'appKeyMicrosoft')]";
	public final String editTab_preferences_MachineTranslation_enableMicrosoftPrimary_checkbox ="//div[contains(@name,'MicrosoftPrimary')]//input[contains(@name,'MicrosoftPrimary')]";
	public final String editTab_preferences_MachineTranslation_enableMicrosoftPrimary_checkbox_checked ="//div[contains(@name,'appMicrosoftPrimary')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	public final String editTab_preferences_MachineTranslation_GooglePrimary_checkbox = "//div[contains(@name,'appGooglePrimary')]//span[contains(@class,'checkbox')]";
	public final String editTab_preferences_MachineTranslation_GooglePrimary_checkbox_checked ="//div[contains(@name,'appGooglePrimary')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	public final String editTab_preferences_MachineTranslation_GooglePremiumEdition_checkbox = "//div[contains(@name,'GooglePremiumEdition')]//span[contains(@class,'checkbox')]";
	public final String editTab_preferences_MachineTranslation_GooglePremiumEdition_checkbox_checked ="//div[contains(@name,'GooglePremiumEdition')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	
	
	public final String editTab_preferences_MachineTranslation_Allow_All_Unedited_Segment_Checked = "//div[contains(@class,'checked')][contains(@name,'allowUnedited')]//div[contains(@id,'checkbox')]//span[contains(@id,'checkbox')]";
	public final String editTab_preferences_MachineTranslation_Allow_All_Unedited_Segment_CheckBox = "//div[contains(@name,'allowUnedited')]//div[contains(@id,'checkbox')]//span[contains(@id,'checkbox')]";
	public final String editTab_preferences_MachineTranslation_Remove_MT_Score_Checked = "//div[contains(@class,'checked')][contains(@name,'removeTmScore')]//input[contains(@name,'removeTmScore')][@aria-checked='true']";
	public final String editTab_preferences_MachineTranslation_Remove_MT_Score_CheckBox = "//div[contains(@name,'removeTmScore')]//input[contains(@name,'removeTmScore')]/following-sibling::span[contains(@id,'checkbox')]";
	public final String editTab_preferences_MachineTranslation_message_OK_btn = "//div[@id='messages-cmp']//span[text()='OK']";
		
	public final String editTab_preferences_transcheck_SpellingCheck_checkbox ="//div[contains(@name,'spelling')]//span[contains(@class,'checkbox')]";
	public final String editTab_preferences_transcheck_SpellingCheck_checkbox_checked ="//div[contains(@name,'spelling')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	public final String editTab_preferences_OK_btn = "//div[contains(@id,'editpreferences')]//span[text()='OK']";
	public final String editTab_preferences_cancel_btn ="//div[contains(@id,'editpreferences')]//span[text()='Cancel']";
	public final String editTab_preferences_transcheck ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Transcheck')]";
	public final String editTab_preferences_shortcuts ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Shortcuts')]";
	public final String editTab_preferences_general ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'General')]";
	public final String editTab_preferences_shortcuts_search_input ="//div[contains(@name,'scutSearch')]//input[contains(@name,'scutSearch')]";
	public final String editTab_preferences_shortcuts_command_shortcut = "//div[contains(@name,'shortcutsGrid')]//table//td[2]";
	public final String editTab_preferences_shortcuts_command_shortcut_Input="//div[contains(@name,'shortcutsGrid')]//table//td[2]//div";
	public final String editTab_preferences_shortcuts_Include_InbounndCommands_checkbox="//input[contains(@name,'incUnboundCmd')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String editTab_preferences_shortcuts_Include_InbounndCommands_checkbox_Checked="//input[contains(@name,'incUnboundCmd')][@aria-checked='true']";
	public final String editTab_preferences_icons ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Icons')]";
	public final String editTab_preferences_layout ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Layout')]";
	public final String editTab_preferences_Segment ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Segment')]";
	public final String editTab_preferences_warnings ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Warnings')]";
	public final String editTab_preferences_Penalties = "//span[text()='Penalties']";
	public final String editTab_preferences_Colors_OK_btn = "//div[contains(@id,'color')]//span[text()='OK']";
	public final String editTab_preferences_Colors = "//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Colors')]";
	public final String editTab_preferences_Colors_Input = "//div[contains(@id,'colorpicker')]//input[contains(@id,'textfield')]";
	public final String editTab_preferences_forbidden_Add = "//div[contains(@id,'TranscheckOption')]//following::a[2]//span[text()='Add']";
	public final String editTab_preferences_untranslatable_Add = "//div[contains(@id,'TranscheckOption')]//following::a[4]//span[text()='Add']";
	public final String editTab_preferences_AddInput = "//div[contains(@name,'appGrid')]//input[1]";
	public final String editTab_preferences_UpdateButton = "//span[contains(text(),'Update')]";
	public final String editTab_preferences_DownloadTranscheckConfig = "//span[contains(text(),'Download Transcheck configuration')]";
	
	
	public final String  editTab_preferences_general_Live_Preview_checkbox ="//div[contains(@name,'appAutomaticallyOpenLivePreview')]//span[contains(@class,'form-checkbox')]";
	public final String editTab_preferences_general_Live_Preview_checkbox_checked ="//div[contains(@name,'appAutomaticallyOpenLivePreview')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";

	//Live Preview
		public final String LivePreview_Collapse="//a[contains(@class,'collapse')]";
		public final String LivePreview_Gear="//a[contains(@class,'gear')]";
		public final String LivePreview_Gear_Dropdown_Close="//div[contains(@id,'menu')]//following::div[contains(@class,'close')]";
		public final String  LivePreview_checkbox ="//div[contains(@name,'appAutomaticallyOpenLivePreview')]//span[contains(@class,'form-checkbox')]";
		public final String LivePreview_checkbox_checked ="//div[contains(@name,'appAutomaticallyOpenLivePreview')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";

		public final String  editTab_preferences_warnings_endofdocumnets_checkbox ="//div[contains(@name,'appShowEOF')]//span[contains(@class,'form-checkbox')]";
		public final String editTab_preferences_warnings_endofdocumnets_checkbox_checked ="//div[contains(@name,'appShowEOF')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";

	public final String  editTab_preferences_warnings_transcheckWarning_checkbox ="//div[contains(@name,'ShowTranscheck')]//span[contains(@class,'form-checkbox')]";
	public final String editTab_preferences_warnings_transcheckWarning_checkbox_checked ="//div[contains(@name,'ShowTranscheck')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_warnings_overwriteTargetWarning_checkbox ="//div[contains(@name,'ShowTargetNotEmpty')]//span[contains(@class,'form-checkbox')]";
	public final String editTab_preferences_warnings_overwriteTargetWarning_checkbox_checked ="//div[contains(@name,'ShowTargetNotEmpty')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_warnings_removeTargetWarning_checkbox ="//div[contains(@name,'RemoveTarget')]//span[contains(@class,'form-checkbox')]";
	public final String editTab_preferences_warnings_removeTargetWarning_checkbox_checked ="//div[contains(@name,'RemoveTarget')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_warnings_removeAllTargetWarning_checkbox ="//div[contains(@name,'RemoveAllTarget')]//span[contains(@class,'form-checkbox')]";
	public final String editTab_preferences_warnings_removeAllTargetWarning_checkbox_checked ="//div[contains(@name,'RemoveAllTarget')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_warnings_removeAllTagWarning_checkbox ="//div[contains(@name,'RemoveAllTags')]//span[contains(@class,'form-checkbox')]";
	public final String editTab_preferences_warnings_removeAllTagWarning_checkbox_checked ="//div[contains(@name,'RemoveAllTags')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	
	public final String  editTab_preferences_penalties_privateTU_checkbox ="//div[contains(@name,'pvtTUPenCheck')]//span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_penalties_privateTU_checkbox_checked ="//div[contains(@name,'pvtTUPenCheck')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_penalties_remoteTU_checkbox ="//div[contains(@name,'remoteTMPenCheck')]//span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_penalties_remoteTU_checkbox_checked ="//div[contains(@name,'remoteTMPenCheck')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	
	public final String tso_editTab_preferences_penalties_privateTu_InputValue_Increment="//div[contains(@name,'pvtTUPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String tso_editTab_preferences_penalties_case_checkbox ="//input[contains(@name,'caseAtPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_case_checkbox_checked ="//input[contains(@name,'caseAtPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_case_InputValue_Increment="//div[contains(@name,'caseAtPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	public final String tso_editTab_preferences_penalties_RemoteTU_InputValue_Increment="//div[contains(@name,'remoteTMPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String tso_editTab_preferences_penalties_MachineTranslation_checkbox ="//input[contains(@name,'machineTransPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_MachineTranslation_checkbox_checked ="//input[contains(@name,'machineTransPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_MachineTranslation_InputValue_Increment="//div[contains(@name,'machineTransPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	public final String tso_editTab_preferences_penalties_MachineTranslation_InputValue_Decrement="//div[contains(@name,'machineTransPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-down')]";
	
	public final String tso_editTab_preferences_transcheck_SecondaryTM_checkbox ="//div[contains(@name,'p_secondaryTMPenCheck')]//span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_transcheck_SecondaryTM_checkbox_checked ="//div[contains(@name,'p_secondaryTMPenCheck')][@aria-checked='true']//span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_transcheck_SecondaryTM_InputValue_Increment="//div[input[contains(@name,'secondaryTMPenValue')]]/following-sibling::div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String tso_editTab_preferences_penalties_Tags_checkbox ="//input[contains(@name,'tagPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_Tags_checkbox_checked ="//input[contains(@name,'tagPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_Tags_InputValue_Increment="//div[contains(@name,'tagPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	public final String tso_editTab_preferences_penalties_Tags_InputMin_Increment="//div[contains(@name,'tagPenMin')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String tso_editTab_preferences_penalties_NonLiteral_checkbox ="//input[contains(@name,'nonLiteralPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_NonLiteral_checkbox_checked ="//input[contains(@name,'nonLiteralPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_NonLiteral_InputValue_Increment="//div[contains(@name,'nonLiteralPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	public final String tso_editTab_preferences_penalties_NonLiteral_InputMin_Increment="//div[contains(@name,'nonLiteralPenMin')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String tso_editTab_preferences_penalties_PublicTu_checkbox ="//input[contains(@name,'pubTUPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_PublicTu_checkbox_checked ="//input[contains(@name,'pubTUPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_PublicTu_InputValue_Increment="//div[contains(@name,'pubTUPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String tso_editTab_preferences_penalties_Align_checkbox ="//input[contains(@name,'alignPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_Align_checkbox_checked ="//input[contains(@name,'alignPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_Align_InputValue_Increment="//div[contains(@name,'alignPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String tso_editTab_preferences_penalties_MultipleTranslation_checkbox ="//input[contains(@name,'multiTransPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_MultipleTranslation_checkbox_checked ="//input[contains(@name,'multiTransPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_MultipleTranslation_InputValue_Increment="//div[contains(@name,'multiTransPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String tso_editTab_preferences_penalties_Attribute_checkbox ="//input[contains(@name,'attributePenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_Attribute_checkbox_checked ="//input[contains(@name,'attributePenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_Attribute_InputValue_Increment="//div[contains(@name,'attributePenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	public final String tso_editTab_preferences_penalties_Attribute_InputValue_InputBox="//fieldset[contains(@id,'fieldset')]//div[contains(@name,'customAttrPenTextfield')]//input[contains(@name,'customAttrPenTextfield')]";
	public final String tso_editTab_preferences_penalties_Attribute_IFAttributeIsNot_checkbox ="//input[contains(@name,'customAttrPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_penalties_privateTu_CheckboxChecked="//label[text()='Private TU']/..//input[contains(@aria-checked,'true')]";
	public final String tso_editTab_preferences_penalties_privateTu_Checkbox="//label[text()='Private TU']";
	
	
	
	public final String  editTab_preferences_layout_hideid_checkbox ="//input[contains(@name,'hideIDColumn')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_layout_hideid_checkbox_checked ="//input[contains(@name,'hideIDColumn')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_layout_hidescore_checkbox ="//input[contains(@name,'hideScoreColumn')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_layout_hidescore_checkbox_checked ="//input[contains(@name,'hideScoreColumn')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_layout_hidetable_checkbox ="//input[contains(@name,'hideTableHeader')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_layout_hidetable_checkbox_checked ="//input[contains(@name,'hideTableHeader')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_layout_beforetarget ="//div[contains(@name,'beforeTarget') and (contains(@class,'checkbox'))]";
	public final String  editTab_preferences_layout_aftertarget ="//div[contains(@name,'afterTarget') and (contains(@class,'checkbox'))]";
	public final String  editTab_preferences_segment_lastedited_checkbox ="//input[contains(@name,'LastEditedSegment')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_segment_lastedited_checkbox_checked ="//input[contains(@name,'LastEditedSegment')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_segment_leveragefirst_checkbox ="//input[contains(@name,'LeverageFirstSegment')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_segment_leveragefirst_checkbox_checked ="//input[contains(@name,'LeverageFirstSegment')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_segment_leveragenext_chckbox_checked ="//input[contains(@name,'LeverageNextSegment')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_segment_leveragenext_checkbox ="//input[contains(@name,'LeverageNextSegment')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_segment_EnabledsmartQuotes_chckbox_checked ="//input[contains(@name,'SmartQuoteCheckBox')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_segment_EnabledsmartQuotes_checkbox ="//input[contains(@name,'SmartQuoteCheckBox')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_segment_SkipUnedited100_chckbox_checked ="//input[contains(@name,'SkipExactMatch')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_segment_SkipUnedited100_checkbox ="//input[contains(@name,'SkipExactMatch')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_segment_SkipUneditedContextMatches_chckbox_checked ="//input[contains(@name,'SkipContextMatch')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_segment_SkipUneditedContextMatches_checkbox ="//input[contains(@name,'SkipContextMatch')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";

	public final String  editTab_preferences_warnings_duplicateshortcut_chckbox_checked ="//input[contains(@name,'ShowDuplicateShortcutWarn')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_warnings_duplicateshortcut_chckbox ="//input[contains(@name,'ShowDuplicateShortcutWarn')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_warnings_showtargettags_chckbox_checked ="//input[contains(@name,'ShowTargetWithTagsWarn')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_warnings_showtargettags_chckbox ="//input[contains(@name,'ShowTargetWithTagsWarn')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_warnings_removesegmenttags_chckbox_checked ="//input[contains(@name,'RemoveSegmentTags')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_warnings_removesegmenttags_chckbox ="//input[contains(@name,'RemoveSegmentTags')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	

	
	
	//	transcheck
	
	//5.10 change 
	public final String generic_transcheck_select_transcheck(String Check){
		/* TestSystem.SystemEngine().findElement("//div[contains(@name,'appOptionGrid')]//following::table//tr[2]").click();*/
		  
		return "//div[contains(@name,'appOptionGrid')]//following::table//td//div[text()='"+Check+"']//..//..//div/div[contains(@class,'checkcolumn')]";
	}
	public final String generic_transcheck_select_transcheck_checked(String Check){
		return "//div[contains(@name,'appOptionGrid')]//following::table//td//div[text()='"+Check+"']//..//..//div/div[contains(@class,'checkcolumn')][contains(@class,'checked')]";
	}
	
	
	
	public final String generic_Capitalization_select_Checkbox_checked(String InputName){
		return "//input[@name='appFirstWordCaseDiff']";
	}

	
	
	public final String  editTab_preferences_transcheck_search_input ="//input[contains(@name,'textfield')]";
	public final String  editTab_preferences_transcheck_selectdeselect_chckbox_checked ="//div[contains(@id,'gs4trcheckcolumn')]//span[contains(@id,'gs4trcheckcolumn')][contains(@class,'checked')]";
	public final String  editTab_preferences_transcheck_selectdeselect_chckbox ="//div[contains(@id,'gs4trcheckcolumn')]//span[contains(@id,'gs4trcheckcolumn')] [contains(@id,'Checkbox')]";

	
	public final String editTab_preferences_transcheck_copiedSourceCheck_checkbox ="//div[contains(@name,'sourcecopiedtotarget')]//span[contains(@class,'checkbox')]";
	public final String editTab_preferences_transcheck_copiedSourceCheck_checkbox_checked ="//div[contains(@name,'sourcecopiedtotarget')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	
	public final String editTab_preferences_transcheck_EmptyTargetCheck_checkbox ="//div[contains(@name,'appOptionGrid')]//following::table//td//div[text()='Empty Target']//..//..//div/div[contains(@class,'checkcolumn')]";
	public final String editTab_preferences_transcheck_EmptyTargetCheck_checkbox_checked ="//div[contains(@name,'appOptionGrid')]//following::table//td//div[text()='Empty Target']//..//..//div/div[contains(@class,'checkcolumn')][contains(@class,'checked')]";

	public final String  editTab_preferences_transcheck_untranslatedtext_chckbox_checked ="//input[contains(@name,'untranslated')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_untranslatedtext_chckbox ="//input[contains(@name,'untranslated')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_untranslatabletext_chckbox_checked ="//input[contains(@name,'untranslatable')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_untranslatabletext_chckbox ="//input[@name='untranslatable'][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_numberdiffrence_chckbox_checked ="//input[contains(@name,'numerical')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_numberdiffrence_chckbox ="//input[contains(@name,'numerical')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_forbidenchar_chckbox_checked ="//input[contains(@name,'forbiddenchar')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_forbidenchar_chckbox ="//input[contains(@name,'forbiddenchar')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_editedcontext_chckbox_checked ="//input[(@name='editedcontext')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_editedcontext_chckbox ="//input[(@name='editedcontext')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_editedexactmatch_chckbox_checked ="//input[contains(@name,'editedexact')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_editedexactmatch_chckbox ="//input[contains(@name,'editedexact')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_repeatedword_chckbox_checked ="//input[contains(@name,'repeatedwords')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_repeatedword_chckbox ="//input[contains(@name,'repeatedwords')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_whitespace_chckbox_checked ="//input[contains(@name,'whitespace')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_whitespace_chckbox ="//input[contains(@name,'whitespace')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_uneditedmt_chckbox_checked ="//input[contains(@name,'uneditedmt')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_uneditedmt_chckbox ="//input[contains(@name,'uneditedmt')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_unconfirmed_chckbox_checked ="//input[contains(@name,'unconfirmed')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_unconfirmed_chckbox ="//input[contains(@name,'unconfirmed')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_transcheck_doublepunctuation_chckbox_checked ="//div[contains(@name,'appDoublePunctuation')][contains(@id,'checkbox')][contains(@class,'checked')]";
	public final String tso_editTab_preferences_transcheck_doublePunctuation_chckbox ="//div[contains(@name,'appDoublePunctuation')][contains(@id,'checkbox')]";
	public final String tso_editTab_preferences_transcheck_punctuation_chckbox_checked ="//input[contains(@name,'punctuation')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_transcheck_punctuation_chckbox ="//input[contains(@name,'punctuation')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	
	public final String tso_editTab_preferences_transcheck_punctuation_Skip_Exact_matches_chckbox_checked ="//div[contains(@name,'appDoublePunctuation')][contains(@id,'checkbox')]//following-sibling::div[contains(@name,'appSkipExactMatches')][contains(@class,'checked')]";
	public final String tso_editTab_preferences_transcheck_punctuation_Skip_Exact_matches_chckbox ="//div[contains(@name,'appDoublePunctuation')][contains(@id,'checkbox')]//following-sibling::div[contains(@name,'appSkipExactMatches')]";

	public final String tso_editTab_preferences_transcheck_punctuation_Skip_Context_matches_chckbox_checked ="//div[contains(@name,'appDoublePunctuation')][contains(@id,'checkbox')]//following-sibling::div[contains(@name,'appSkipContextMatches')][contains(@class,'checked')]";
	public final String tso_editTab_preferences_transcheck_punctuation_Skip_Context_matches_chckbox ="//div[contains(@name,'appDoublePunctuation')][contains(@id,'checkbox')]//following-sibling::div[contains(@name,'appSkipContextMatches')]";

	
	//Minimize window
	public final String minimizescreen_arrow_moreoptions = "//a[contains(@data-componentid,'menu-trigger')]//span[contains(@class,'more-icon ')]";
	
	public final String Dropdown_Menu_minimize(String findtext){
		return "//div[contains(@class,'shadow')]/following-sibling::div//a[@role='menuitem']//span[contains(text(),'"+findtext+"')]";
	}
	
	//Auto-Suggestion
	public final String editTab_preferences_autosuggestion = "//span[text()='Auto-Suggestion']";
	public final String autosuggestion_icon="//div[contains(@id,'autosuggestion')]//a[contains(@id,'abstractmen')]/div[contains(@class,'sourceSuggest')]";
	public final String auto_suggestionword_segment(String findtext){
		return "//div[contains(@id,'autosuggestion')]//a[contains(@id,'abstractmen')]//span[contains(text(),'"+findtext+"')]";
		//return "//div[contains(@id,'autosuggestion')]//a[contains(@id,'abstractmen')]//span[contains(contains(@style,'font-family:WscFont,Arial;')]";
	}
	
	public final String edit_Tab_preferences_Auto_suggestion_overwrtie_option_checkbox(String divName){
		return "//input[contains(@name,'"+divName+"')]/following-sibling::span";
	}
	
	public final String edit_Tab_preferences_Auto_suggestion_overwrtie_option_checkbox_checked(String divName){
		return "//div[contains(@name,'"+divName+"')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	}
	
	
	//General Preferences Check
	public final String  editTab_preferences_general_Preference_Add_Score_Column_chckbox_checked ="//input[contains(@name,'AddScoreColumn')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_general_Preference_Add_Score_Column_chckbox ="//input[contains(@name,'AddScoreColumn')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_general_Preference_SearchDepthWFServerTM ="//div[contains(@name,'GltmSearchDepth')]";
	
	//Capitalization Check
	public final String  editTab_preferences_transcheck_capitalization_chckbox_checked ="//input[contains(@name,'capitalization')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";//input[contains(@name,'CapitalizeFirstLetter')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_transcheck_capitalization_chckbox ="//input[contains(@name,'capitalization')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";//input[contains(@name,'CapitalizeFirstLetter')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	
	public final String  editTab_preferences_transcheck_capitalization_firstword_chckbox_checked ="//div[contains(@name,'appFirstWordCaseDiff')][contains(@id,'checkbox')][contains(@class,'checked')]";
	public final String  editTab_preferences_transcheck_capitalization_firstword_chckbox ="//div[contains(@name,'appFirstWordCaseDiff')][contains(@id,'checkbox')]";
	public final String  editTab_preferences_transcheck_capitalization_target_mismatch_chckbox_checked ="//div[contains(@name,'appTargetCapitalizationMismatch')][contains(@id,'checkbox')][contains(@class,'checked')]";
	public final String  editTab_preferences_transcheck_capitalization_target_mismatch_chckbox ="//div[contains(@name,'appTargetCapitalizationMismatch')][contains(@id,'checkbox')]";
	public final String  editTab_preferences_transcheck_capitalization_source_mismatch_chckbox_checked ="//div[contains(@name,'appSourceCapitalizationMismatch')][contains(@id,'checkbox')][contains(@class,'checked')]";
	public final String  editTab_preferences_transcheck_capitalization_source_mismatch_chckbox ="//div[contains(@name,'appSourceCapitalizationMismatch')][contains(@id,'checkbox')]";
	public final String  editTab_preferences_transcheck_capitalization_allcaps_chckbox_checked ="//div[contains(@name,'appAllCapsMismatch')][contains(@id,'checkbox')][contains(@class,'checked')]";
	public final String  editTab_preferences_transcheck_capitalization_allcaps_chckbox ="//div[contains(@name,'appAllCapsMismatch')][contains(@id,'checkbox')]";
	
	//color preferences
	public final String editTab_preferencesButton_Color_picker(String itemname) {
		return "//div[contains(@id,'view')]//div[contains(@id,'"+itemname+"')]";
		}
	
	//color preferences
	public final String editTab_preferencesButton_Color_ItemName(String ItemName) {
		return "//div[contains(@id,'view')]//table//div[contains(text(),'"+ItemName+"')]";
		}
	
	//icons preferences
	public final String editTab_preferencesButton_icons_size(String Sizeicons) {
		return "//div[contains(@id,'radiogroup')]//label[contains(text(),'"+Sizeicons+"')]";//"//div[contains(@id,'radiofield')]//input[contains(@name,'"+Sizeicons+"')]";
		}
	
	public final String icons_size(String iconName, String iconSize) {
		return "//table[contains(@id,'button')]//tr//td//a[contains(@data-qtip,'"+iconName+"')]//span[contains(@class,'"+iconSize+"')]";
		}
	
	//Command Name
	public final String shortcut_commandName(String commandName) {
		return "//div[contains(text(),'"+commandName+"')]";
		}
	
	public final String tso_shortcut_commandName_Order(int number,String commandName) {
		return "//table["+number+"]//div[contains(text(),'"+commandName+"')]";
		}
	
	//Shortcuts	
		public final String tso_shortcut_scheme_dropdown="//div[contains(@id,'keys')]//label[//span[text()='Scheme:']]/following-sibling::div//div[contains(@class,'arrow')]";
		public final String tso_shortcut_scheme_Input="//div[contains(@id,'keys')]//label[//span[text()='Scheme:']]/following-sibling::div//input[contains(@name,'Scheme')]";
		public final String tso_shortcut_schemeValue(String SchemeName) {
			return "//li[text()='"+SchemeName+"']";
			}
	
	//Command ShortCut Keys
	public final String shortcut_commandShortKeys(String ShortcutKey) {
		return "//div[contains(@name,'shortcut')]//table[contains(@id,'view')]//div[contains(text(),'"+ShortcutKey+"')]";
		}
	
	//Command Description
		public final String shortcut_commandDescription(String commandDesc) {
			return "//div[contains(text(),'"+commandDesc+"')]";
			}
	
	
	
	public final String editTab_preferencesButton_ofDifferent_tabs(String tabName) {
		return "//div[contains(@gs4trname,'"+tabName+"')][not(contains(@class,'hidden-offsets'))]//a[contains(@class,'preference')]//span[contains(text(),'Preferences')]";
		}
	
	public final String editTab_preferences_Auto_Propagation = "//span[text()='Auto-Propagation']";
	public final String editTab_preferences_Auto_Propagation_enable_checkbox = "//input[@name='p_enableAutoProp']/following-sibling::span";
	public final String editTab_preferences_Auto_Propagation_enable_checkbox_checked = "//div[contains(@name,'p_enableAutoProp')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	
	public final String edit_Tab_preferences_Auto_propagation_overwrtie_option_checkbox(String divName){
		return "//input[contains(@name,'"+divName+"')]/following-sibling::span";
	}
	
	public final String edit_Tab_preferences_Auto_propagation_overwrtie_option_checkbox_checked(String divName){
		return "//div[contains(@name,'"+divName+"')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	}
	
	//Find and Replace
	public final String editTab_findAndReplace_windowTitle ="//div[contains(@id,'window')]//div[contains(text(),'Find/Replace')]";
	public final String editTab_findAndReplace_windowTitle_presentAt_background ="//div[contains(@id,'window')][contains(@class,'header-draggable')][contains(@data-tabindex-value,'0')]";
	public final String editTab_findAndReplace_btn = "//a[contains(@class,'catfindreplaceaction')]";//"//a[contains(@id,'catfindreplaceaction')]";
	public final String editTab_findAndReplace_findTab_findWhat_inputBox ="//div[contains(@name,'findWhat')]//input[contains(@name,'findWhat')]";
	public final String editTab_findAndReplace_findNext_inputBox = "//input[contains(@name,'findWhat')]";//"//input[contains(@name,'findWhat')]";
	public final String tso_editTab_findAndReplace_findNext_WithREplaceTab_inputBox = "//input[contains(@name,'FindWhat')][contains(@id,'FieldHistoryCombo')]";
	public final String editTab_findAndReplace_ReplaceNext_inputBox = "//input[contains(@name,'replaceWith')]";
	public final String editTab_findAndReplace_ReplaceAll_Btn = "//span[(text()='Replace All')]";//"//span[(text()='Replace All') and contains(@id,'button')]";
	public final String editTab_findAndReplace_Replace_Btn = "//div[contains(@id,'findreplace')]//span[text()='Replace']";
	public final String editTab_findAndReplace_replaceAll_button_disabled ="//a[contains(@class,'disabled')]//span[(text()='Replace All') and contains(@id,'button')]";
	public final String editTab_findAndReplace_Close_Btn = "//span[(text()='Close') and contains(@id,'button')]";

	public final String editTab_findAndReplace_findNext_button ="//span[(text()='Find Next') and contains(@id,'Button')]";
	public final String editTab_findAndReplace_findNext_button_disabled ="//a[contains(@class,'disabled')]//span[(text()='Find Next') and contains(@id,'Button')]";
	public final String editTab_findAndReplace_findTab ="//div[contains(@id,'find')]//a[contains(@class,'tab-rotate-left')]//span[contains(@class,'find')]";
	public final String editTab_findAndReplace_replaceTab ="//div[contains(@id,'findreplace')]//a[contains(@class,'tab-rotate-left')]//span[contains(@class,'findReplace')]";//"//div[contains(@id,'findreplace')]//a//span[contains(text(),'Replace')]";
	public final String editTab_findAndReplace_replaceAll_confirmation_yesButton ="//div[contains(@id,'messages')]//div[contains(@id,'toolbar')]//span[contains(text(),'Yes')]";
	public final String editTab_findAndReplace_direction_up_button ="//div[contains(@id,'findreplace')]//div[contains(@class,'button')]//span[contains(@class,'up')]";
	public final String editTab_findAndReplace_direction_down_button ="//div[contains(@id,'findreplace')]//div[contains(@class,'button')]//span[contains(@class,'down')]";
	public final String editTab_findAndReplace_direction_backward_radioButton ="//div[contains(@name,'directionTwo')]//span[contains(@class,'radio')]";
	public final String editTab_findAndReplace_direction_forward_radioButton ="//div[contains(@name,'directionOne')]//span[contains(@class,'radio')]";
	public final String editTab_findAndReplace_readingHighlight_dropDown_button ="//div[contains(@class,'FindReplace')]//div[contains(@id,'panel')][contains(@class,'autocontainer')]//a//span[contains(text(),'Reading Highlight')]";
	public final String editTab_findAndReplace_readingHighlight_highlightAll_option ="//div[contains(@id,'menuitem')][not(contains(@class,'disabled'))]//a//span[contains(text(),'Highlight All')]";
	public final String editTab_findAndReplace_readingHighlight_clearHighlightning_option ="//div[contains(@id,'menuitem')][not(contains(@class,'disabled'))]//a//span[contains(text(),'Clear Highlighting')]";
	public final String tso_editTab_findAndReplace_searchopenfiles_checkbox = "//input[contains(@name,'searchOpenedFiles')]/following-sibling::span[contains(@id,'checkbox')]";
	public final String tso_editTab_findAndReplace_searchopenfiles_checkbox_checked = "//input[contains(@name,'searchOpenedFiles')][@aria-checked='true']/following-sibling::span[contains(@id,'checkbox')]";
	public final String Unsaved_data_detected_Ignorechanges ="//div[contains(@id,'messages')]//span[contains(text(),'Ignore changes')]";
	public final String Unsaved_data_detected_Recover ="//div[contains(@id,'messages')]//span[contains(text(),'Recover')]";
	
	public final String editTab_findAndReplace_message_OK_btn = "//div[@id='messages-cmp']//span[text()='OK']";
	//check box locators after clicking on 'more Down'button
	
	public final String edittab_findandReplace_Checkbox_Unchecked_options(String divName,String labelName){
		return "//div[contains(@name,'"+divName+"')]//label[contains(text(),'"+labelName+"')]/preceding-sibling::input";
	}
	
	public final String edittab_findandReplace_Checkbox_Checked_options(String divName,String labelName){
		return "//div[contains(@name,'"+divName+"')][contains(@class,'checked')]//label[contains(text(),'"+labelName+"')]/preceding-sibling::input";
	}
	
	public final String edittab_findandReplace_Checkbox_options(String divName,String labelName){
		return "//div[contains(@name,'"+divName+"')]//label[contains(text(),'"+labelName+"')]/preceding-sibling::span";
	}
	
	public final String edittab_findandReplace_findWhat_input_suggestion_dropDownList(String findWhat){
		return "//div[contains(@name,'replaceFindWhat')]//ul//li[contains(text(),'"+findWhat+"')]";
	}
	
	public final String text_highlighted_target(int rowNumber) {
		return "//table[contains(@id,'tableview')]["+rowNumber+"]//td[contains(@class,'target')]//div[contains(@class,'Editor_highlight')]";
	}
	
	public final String id_column_color (int rowNumber) {
		return "//div[contains(@id,'EditorTxlif')]//table["+rowNumber+"]//td[1][contains(@style,'background-color: rgb(225, 225, 225)') or contains(@style,'background-color: rgb(200, 200, 200)')]";
	}
	
	public final String text_highlighted_source(int rowNumber) {
		return "//table[contains(@id,'gridview')]["+rowNumber+"]//td[contains(@class,'source')]//div[contains(@class,'highlight')]";//"//table[@class=' disable-browser-text-selection']/tr["+rowNumber+"]/td[2]/div//div[contains(@clstype,'highlight')]";
	}			
	public final String tso_TranslationTab_VerifySegment_button="//a[contains(@class,'ActionSegmentVerify')]//span[contains(text(),'Verify')]";
	public final String tso_TranslationTab_VerifySegment_button_disabled="//a[contains(@class,'ActionSegmentVerify')][contains(@class,'disabled')]//span[contains(text(),'Verify')]";
	public final String translationTab_firstBlockSource =  "//div[contains(@id,'EditorTxliff')]//table//td//div[contains(@id,'source')]";//"//div[contains(@id,'BodyTable')]/table//td//div[contains(@id,'source_content')]";//"//div[contains(@id,'BodyTable')]/table//td/div/div";//css=td.bodyTableTd>div"; //css=td.bodyTableTd>div>span
	public final String translationTab_LastBlockSource =  "//div[contains(@id,'BodyTable')]/table//tr[last()]//td//div[contains(@id,'source_content')]";
	public final String tso_segmentTab_attachDetach_button ="//div[contains(@gs4trname,'Segment')]//a[contains(@id,'ActionButton')]//span[contains(text(),'Attach')]";
	public final String tso_floatingBar_attachDetach_button ="//div[contains(@class,'floating_bar')]//div[contains(@id,'buttongroup')]//table//span[contains(@class,'attachdetach')]";
	public final String tso_About_ProductName="//div[contains(@name,'appAboutProductName')]//div[contains(@name,'appAboutProductName')]";
	//Help ATb Locators
	public final String Help_Tab_About_transstudio_btn="//a//span[contains(@class,'About')]";//"//a[contains(@class,'aboutproduct')]//span[contains(text(),'About')]";
	
	//Segment Tab locators
	public final String Segment_Tab_non_breaking_space_btn="//a[contains(@class,'nonbreakingspace')]//span[contains(text(),'Non-Breaking')]";
	
	// Online Help
		public final String Help_Tab_Online_Help_btn="//a[contains(@class,'aboutproduct')]//span[contains(text(),'About')]//following::a[1]";
		
	
	public final String tso_sourceLanguage_rowSelected(int rowNumber) {
		return "//div[contains(@id,'Grid')]//table["+rowNumber+"]//tr[1][contains(@class,'actionColumnVisible')]//td[2][contains(@class,'source')]";
				//"//table["+rowNumber+"]//tr[contains(@aria-selected,'true')]";//"//table[contains(@id,'tblPart')]//tr["+rowNumber+"]//td[2][contains(@class,'rowclicked')]";
		}
	
	public final String tso_targetLanguage_header(String languageName) {
		return "//div[contains(@id,'headercontainer') and contains(@class,'target')]//div[5]//div/span[contains(text(),'"+languageName+"')]";//"//table[contains(@class,'Editor_headTable')]//td//span[contains(text(),'"+languageName+"')]";
		}
	
	
	public final String editTab_transchecCheckBox_Checked(String name) {
		return "//div[contains(@name,'"+name+"')][contains(@class,'checked')]//input/following-sibling::span";
		}
	
	
	public final String translationTab_blockSourceNumberX(int rowNumber) {
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+rowNumber+"]//tr[1]//td[2]//div";//"//table[@class=' disable-browser-text-selection']/tr["+rowNumber+"]/td[2]/div";//"//table[@class=' disable-browser-text-selection']/tbody["+rowNumber+"]/tr/td[2]/div";
		}
	
	public final String translationTab_blockSourceNumberX_target(int rowNumber) {
		return "//div[contains(@id,'Editor')]//table["+rowNumber+"]//td[3]//div";//"//table[@class=' disable-browser-text-selection']/tr["+rowNumber+"]/td[3]/div";//"//table[@class=' disable-browser-text-selection']/tbody["+rowNumber+"]/tr/td[3]/div";
		}
	
	public final String translationTab_targetSegment_backgroundColor_forSegmentCommit(int rowNumber) {

		return "//table[contains(@id,'gridview')]["+rowNumber+"]//td[contains(@style,'background-color: rgb(209, 255, 209)') or contains(@style,'background-color: rgb(228, 209, 255)') or contains(@style,'background-color:#E4D1FF')]";
		//return "//table[contains(@id,'tableview')]["+rowNumber+"]//td[contains(@style,'background-color: rgb(209, 218, 255)') or contains(@style,'background-color: rgb(228, 209, 255)') or contains(@style,'background-color: #D1DAFF')]";//"//table[contains(@class,'grid')]//tr["+rowNumber+"]//td[3]//iframe[contains(@style,'background-color: rgb(228, 209, 255);')]";// "//table[contains(@class,'disable-browser-text-selection')]//tr["+rowNumber+"]//td[3]//iframe[contains(@style,'background-color: rgb(255, 209, 233);')]";
		}
	//table[contains(@id,'tableview')][1]//td[contains(@style,'background-color: rgb(209, 218, 255)') or contains(@style,'background-color: rgb(228, 209, 255)') or contains(@style,'background-color:#E4D1FF')]
	public final String translationTab_targetSegment_backgroundColor_forAutopropagate(int rowNumber) {
		return "//table[contains(@id,'tableview')]["+rowNumber+"]//td[contains(@style,'background-color: rgb(209, 218, 255)')]";//"//table[contains(@class,'grid')]//tr["+rowNumber+"]//td[3]//iframe[contains(@style,'background-color: rgb(228, 209, 255);')]";// "//table[contains(@class,'disable-browser-text-selection')]//tr["+rowNumber+"]//td[3]//iframe[contains(@style,'background-color: rgb(255, 209, 233);')]";
		}

	public final String translationTab_targetSegment_backgroundColor_forChanged(int rowNumber) {
		return "//div[contains(@id,'editor')]//table[contains(@id,'view')]["+rowNumber+"]//td[contains(@style,'#FF00FF')]";//"//table[contains(@class,'grid')]//tr["+rowNumber+"]//td[3]//iframe[contains(@style,'background-color: rgb(228, 209, 255);')]";// "//table[contains(@class,'disable-browser-text-selection')]//tr["+rowNumber+"]//td[3]//iframe[contains(@style,'background-color: rgb(255, 209, 233);')]";
		}
	
	
	public final String translationTab_targetSegment_backgroundColor_forChangedDarkGreen(int rowNumber) {
		return "//div[contains(@id,'editor')]//table[contains(@id,'view')]["+rowNumber+"]//td[contains(@style,'#32b033')]";
		}
	
	public final String SegmentID(int rowNumber, int idNumber) {
		return "//div[contains(@id,'Editor')]//table['"+rowNumber+"']//td['"+idNumber+"']//div";
		}
	
	public final String translationTab_firstBlockTarget = "css=tr.step.wfTableStyle>td:nth-child(3)";
	public final String translationTab_inputTargetFrame = "css=tr.step.wfTableStyle>td:nth-child(3) iframe";
	public final String translationTab_inputTargetFrame_input = "css=body";
	public final String translationTab_clearTargetButton = "//a[contains(@class,'catActionClearTarget')]//span[contains(text(),'Clear')]";
	public final String translationTab_clearTargetButton_disabled ="//a[contains(@class,'catActionClearTarget')][contains(@class,'disabled')]//span[contains(text(),'Clear')]";
	public final String translationTab_clearTarget_drop_down_btn ="//a[contains(@class,'catActionClearTarget')]//span[contains(@class,'arrow')]";
	public final String clearTarget_Dropdown_ClearTarget_button ="//a[contains(@class,'menu-item-link')]//span[contains(text(),'Clear Target')]/following-sibling::div";
	public final String clearTarget_Dropdown_ClearAllTarget_button="//a[contains(@class,'menu-item-link')]//span[contains(text(),'Clear All Targets')]/following-sibling::div";
	public final String clearTarget_Dropdown_ClearAllTarget_button_Enabled="//div[not(contains(@class,'disabled'))]//a[contains(@class,'menu-item-link')]//span[contains(text(),'Clear All Targets')]/following-sibling::div";
	public final String clearTarget_Dropdown_ClearTarget_button_disabled="//div[(contains(@class,'disabled'))]//a[contains(@class,'menu-item-link')]//span[contains(text(),'Clear Target')]/following-sibling::div";
	public final String translationTab_copySourceButton = "//a[contains(@class,'catcopysourceaction')]//span[contains(text(),'Copy')]";//"//a[contains(@id,'catcopysourceaction')]";
	public final String translationTab_nextSegmentButton ="//a[contains(@class,'nextaction')]//span[contains(text(),'Next')]";
	public final String translationTab_previousSegmentButton ="//a[contains(@class,'previousaction')]//span[contains(text(),'Previous')]";
	public final String tso_editTab_preferences_transcheck_RemoteTM_checkbox ="//div[contains(@name,'p_remoteTMPenCheck')]//span[contains(@class,'checkbox')]";

	public final String tso_editTab_preferences_transcheck_RemoteTM_checkbox_checked ="//input[contains(@name,'remoteTMPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";

	public final String translationTab_commitButton ="//a[contains(@class,'commit')]//span[contains(text(),'Commit')]";
	public final String tso_editTab_preferences_transcheck_RemoteTM_InputValue_Increment="//div[input[contains(@name,'remoteTMPenValue')]]/following-sibling::div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	public final String translationTab_LeverageButton ="//a[contains(@class,'leverageaction')]//span[contains(text(),'Leverage')]";
	public final String translationTab_Confirm_OR_Unconfirm_Button ="//a[contains(@class,'unconfirmconfirm')]//span[contains(@id,'btnInner')]";
	public final String translationTab_Confirm_OR_UnconfirmAll_Button ="//a[contains(@class,'unconfirmconfirmall')]//span[contains(@id,'btnInner')]";
	public final String translationTab_Confirm_OR_UnconfirmAllButton_dropDown_button ="//a[contains(@class,'confirmall')]//span[contains(@class,'arrow')]";
	public final String translationTab_Confirm_OR_UnconfirmAllButton_dropDown_unconfirmAll ="//a[contains(@class,'menu-item-link')]//span[contains(text(),'Unconfirm All')]/following-sibling::div";
	public final String translationTab_Confirm_OR_UnconfirmAllButton_dropDown_confirmAll ="//a[contains(@class,'menu-item-link')]//span[contains(text(),'Confirm All')]/following-sibling::div";
	
	//Translation tab->Filter->Options
	public final String translationtab_Filter_Drop_down_btn="//div[contains(@id,'search')]//div[contains(@name,'Filter')and not(contains(@name,'Content'))]//div[contains(@id,'trigger-picker')][contains(@class,'arrow-trigger')]";//"//div[contains(@name,'filter')]//div[contains(@id,'trigger-picker')]";
	public final String translationTab_filter_input_box="//div[contains(@name,'appFilter')]//input[contains(@name,'appFilter')]";
	public final String translationtab_Filter_search_btn="//a[contains(@data-qtip,'Filter Action')]//span[contains(@class,'filterButton')]";
	public final String translationtab_Filter_Cumulative_search_btn="//a[contains(@data-qtip,'Cumulative')]//span[contains(@class,'cumulativeButton')]";
	public final String translationtab_Filter_Reset_search_btn="//a[contains(@data-qtip,'Reset Toolbar Fields')]//span[contains(@class,'resetButton')]";
	public final String translationtab_Filter_filterConfiguration_btn="//span[contains(@class,'PanelSettings')]";
	public final String translationtab_Filter_filterConfiguration_MaxWordCount_input_box="//input[contains(@name,'p_maxWordCount')]";
	public final String translationtab_Filter_filterConfiguration_OK_btn="//span[contains(text(),'OK')]";
	
	public final String translationtab_Filter_filterConfiguration_MaxWordCount_trigger(String option){
		return "//div[contains(@class,'FilterConfiguration')]//div[contains(@class,'spinner-"+option+"')]";
	}
		
	public final String translationTab_Filter_drop_down_list_options(String list_option){
		return "//div[contains(@name,'Filter-boundlist')]//div//li[text()='"+list_option+"']";
	}	
		
	
	public final String translationTab_status_Column_Unconfirmed_Image_Icon(int PartNo,int RowNo){
		
		return "//div[contains(@id,'Editor')]//table["+RowNo+"]//td[contains(@class,'StatusImgTable')]";//"//table[contains(@id,'Part')]["+PartNo+"]//tr[contains(@id,'row')]["+RowNo+"]//td[contains(@id,'status')]//div//table//tr//td[contains(@class,'unconfirm')]";
	}
	
	
	
	
	//Clear All Tags Locators
	public final String translationTab_ClearAllTags_button="//a[contains(@class,'clearalltags')]//span[contains(text(),'Clear')]";
	public final String translationTab_ClearAllTags_drop_down_btn ="//a[contains(@class,'clearalltags')]//span[contains(@class,'arrow')]";
	public final String clearAllTags_Dropdown_Segment_button="//a[contains(@class,'menu-item-link')]//span[contains(text(),'Segment')]/following-sibling::div";
	public final String clearAllTags_Dropdown_Document_button="//a[contains(@class,'clearalltags')]//span[contains(@class,'arrow')]";
	public final String clearTarget_Dropdown_ClearSegment_button_disabled="//div[(contains(@class,'disabled'))]//a[contains(@class,'menu-item-link') and contains(@data-qtip,'Clears all the tags')]//span[contains(text(),'Segment')]/following-sibling::div";
	
	
	
	public final String translationTab_Tag_Image_RowX(int PartNo, int RowNo){
		return "//table[contains(@id,'Part')]["+PartNo+"]//tr["+RowNo+"]//td[3]//div//div//img[contains(@class,'standalone_image')]";
	}
	
	
	//Automated Actions locators
	public final String translationTab_Untill_Fuzzy_Button ="//a[contains(@class,'untilfuzzy')]//span[contains(@id,'btnInner')][contains(text(),'Until')]";
	public final String translationTab_UNtill_No_Match_Button ="//a[contains(@class,'untilnomatch')]//span[contains(@id,'btnInner')][contains(text(),'Until')]";
	public final String translationTab_Translate_All_Button ="//a[contains(@class,'translateall')]//span[contains(@id,'btnInner')][contains(text(),'Translate')]";
	
	public final String translationTab_copySourceButton_arrowButton ="//a[contains(@class,'copysourceaction')]/span/following-sibling::span[contains(@class,'btn-arrow')]";
	public final String translationTab_copySourceButton_disabled ="//a[contains(@class,'catcopysourceaction')][contains(@class,'disabled')]//span[contains(text(),'Copy')]";
	public final String translationTab_copySourceButton_arrowButton_copySourceButton ="//div[contains(@id,'actionmenuprototype')]//a//span[contains(text(),'Copy Source')]";//"//div[contains(@class,'CopySource')]//span[contains(text(),'Copy Source')]";
	public final String translationTab_copySourceButton_arrowButton_copySourceTextButton ="//div[contains(@id,'actionmenuprototype')]//a//span[contains(text(),'Copy Source Text')]";//"//div[contains(@class,'CopySource')]//span[contains(text(),'Copy Source Text')]";
	public final String translationTab_copyAllSourceButton = "//a[contains(@class,'CopySourceAll')]";//span[contains(text(),'Copy')]";//"//span[contains(@id,'CopySourceAll')]//span[contains(@class,'copySourceAll ')]";
	
	public final String translationTab_copyAllSourceButton() throws Exception{
		if(BrowserFactory.SystemEngine().verifyElementPresent(TSO_main_Locators.exts().translationTab_copySourceButton_disabled, 5)){
			BrowserFactory.SystemEngine().findElement(TSO_main_Locators.exts().selectSegmentX(1, 1)).click();	
			Thread.sleep(1000);
		}
		return "//a[contains(@class,'CopySourceAll')]";
	}

	
	public final String translationTab_lockSegmentButton ="//a[contains(@class,'locksegmentaction')]//span[contains(text(),'Lock')]";
	public final String translationTab_CommitAll_button ="//a[contains(@class,'comitall')]//span[contains(text(),'Commit')]";
	public final String translationTab_TMListButton ="//a[contains(@class,'tmlistaction')]//span[contains(text(),'TM')]";
	public final String translationTab_lockSegmentButton_disabled ="//a[contains(@class,'locksegmentaction')][contains(@class,'item-disabled')]//span[contains(text(),'Lock')]";
	public final String translationTab_lockSegment_status ="//table[contains(@class,'StatusColum')]//tr//td[contains(@class,'lockedsegment')]";
	public final String tso_goTosegment_input ="//div[contains(@name,'appSegmentNumber')]//input[contains(@id,'numberfield')]";//"//div[contains(@class,'GoToSegment')]//div[contains(@name,'segmentNumber')]//input[contains(@id,'numberfield')]";
	public final String tso_goTosegment_OkButton ="//span[contains(text(),'OK')]";
	public final String tso_goTosegment_Errormsg ="//div[contains(text(),'Specified segment ID does not exist.')]";
	public final String tso_unlocksegment_warning ="//div[contains(@class,'dialogs-Messages')]//div[contains(text(),'You are about to unlock this segment. Are you sure you want to continue?')]";
	public final String tso_reload_error_message="//b[text()='Error!']/following::p[contains(text(),'You Reloaded the page which caused the termination of the connection to the file')]";
	public final String tso_no_results_message="//div[contains(@id,'headercontainer')]/following::div[1]/div/div[@class='x-grid-empty']"; //"(//div[contains(@class,'empty')]/div[text()='No results'])[1]";
    public final String tso_current_project_refrene_files_noresults="//div[contains(@class,'unselectable')]/div[text()='No results']";
    public final String tso_no_results_message_notestab="//div[contains(@id,'headercontainer')]/following::div[1]/div/div[@class='x-grid-empty']//following::div[text()='No results']";
	
    public final String translationTab_Machine_Translation_Button="//a[contains(@class,'machinetranslationaction') and not(contains(@class,'disabled'))]";//"//a[contains(@id,'machinetranslationaction') and not(contains(@class,'disabled'))]";
	public final String translationTab_Machine_Translation_Disabled_Button="//a[contains(@id,'machinetranslationaction') and contains(@class,'disabled')]";
	public final String fileTab_saveToPd = "//span[text()='Save']";
	public final String fileTab_recalculate_progress = "//span[text()='Recalculate']";
	public final String translationTab_Concordance = "//span[text()='Concordance']";
	public final String fileTab_saveAll_toPd ="//div[contains(@gs4trname,'File')]//a[contains(@class,'SaveAll')]//span[contains(text(),'Save')]";
	public final String fileTab_closeFile = "//span[text()='Close']";
	public final String fileTab_closeAllFile = "//span[text()='Close All']";
	public final String fileTab_completeButton="//span[text()='Complete']";
	public final String fileTab_completeAll_Button="//div[contains(@gs4trname,'File')]//a[contains(@class,'CompleteAll')]//span[contains(text(),'Complete')]";
	public final String fileTab_complete_Yes_Button="//div[contains(@id,'complete')]//a//span[text()='Yes']";
	public final String fileTab_complete_i_text="//span[contains(@class,'gs4tr-italic-text')]/i";
	
	
	public final String fileTab_Download_Preview_Button="//a[contains(@id,'downloadpreview') and not(contains(@class,'disabled'))]";
	public final String fileTab_Download_Preview_Disabled_Button="//a[contains(@class,'preview') and contains(@class,'disabled')]";//"//a[contains(@id,'downloadpreview') and contains(@class,'disabled')]";
	public final String fileTab_Synchronize_Preview_Disabled_Button="//a[contains(@class,'PreviewSynchronize') and contains(@class,'disabled')]";
	public final String fileTab_Download_referenceFiles_Button="//a[contains(@id,'downloadreferencefiles') and not(contains(@class,'disabled'))]";
	public final String fileTab_Download_referenceFiles_Disabled_Button="//a[contains(@class,'downloadreferencefiles') and contains(@class,'disabled')]";//"//a[contains(@id,'downloadreferencefiles') and contains(@class,'disabled')]";
	public final String fileTab_Download_ShowInstructions_Button="//a[contains(@class,'showinstruction') and not(contains(@class,'disabled'))]//span[contains(text(),'Show')]";//"//a[contains(@id,'showinstruction') and not(contains(@class,'disabled'))]";
	public final String fileTab_Download_ShowInstructions_WindowCloseX="//div[contains(@id,'window')]//div[contains(@data-qtip,'Close')]";
	public final String fileTab_Download_ShowInstructions_Disabled_Button="//a[contains(@class,'showinstruction') and contains(@class,'disabled')]";//"//a[contains(@id,'showinstruction') and contains(@class,'disabled')]";
	public final String fileTab_Download_Reference_File_Download_Button="//div[contains(@id,'DownloadReferences')]//div[contains(@id,'toolbar')]//a//span[text()='Download']/following-sibling::span";
	public final String fileTab_Download_ShowInstructions_window_Instructions_Button="//div[contains(@id,'showinstructions')]//div[contains(@id,'showinstructionsfrompd-cmp-body')]//a//span[text()='Instructions']";
	public final String fileTab_Download_ShowInstructions_window_ProjectBackground_Button="//div[contains(@id,'showinstructions')]//div[contains(@id,'showinstructionsfrompd-cmp-body')]//a//span[text()='Background Instructions']";
	public final String fileTab_Download_ShowInstructions_window_ProjectBackground_text="//div[contains(@class,'msgBoxCont ')]//following::div/div/font[contains(text(),'This is Background information')]";

	
	
	
	
	public final String fileTab_Download_ShowInstructions_window_Container_Div_Content(String instruction){
		//return "//div[contains(@id,'showinstructions')]//div[contains(@class,'gs4tr_Editor')][not(contains(@style,'none'))]/div/div/font[text()='"+instruction+"']";//"//div[contains(@id,'showinstructions')]//div[@class='x-container cat-msgBoxCont gs4tr_Editor_allow_selection x-tabpanel-child x-container-default'][not(contains(@style,'none'))]/span/div/font[text()='"+instruction+"']";
		return "//div[contains(@id,'showinstructions')]//div[contains(@class,'gs4tr_Editor')][not(contains(@class,'hidden-offsets'))]//div/font[contains(text(),'"+instruction+"')]";//"//div[contains(@id,'showinstructions')]//div[contains(@class,'gs4tr_Editor')][not(contains(@style,'none'))]/div/div[text()='"+instruction+"']";
	}
	public final String fileTab_ShowInstructions_Hyperlink(String HyperlinkName){
		return "//div[contains(@id,'showinstruction')]//div[contains(@class,'Editor_allow_selection')]//font[contains(text(),'"+HyperlinkName+"')]";
	}	
	public final String fileTab_Download_SourceFiles_Button="//a[contains(@class,'DownloadSourceFiles')]";//"//a[contains(@id,'DownloadSourceFiles') and not(contains(@class,'disabled'))]";
	public final String fileTab_Download_SourceFiles_Disabled_Button="//a[contains(@class,'DownloadSourceFiles') and contains(@class,'disabled')]";
	public final String translationTab_progress="css=tr.x-toolbar-right-row>td:nth-child(6)>div>div>div>div>div>div:nth-child(2)";
	public final String reviewTab_instructions = "//span[contains(@class,'showInstructions')]";
	public final String reviewTab_instructions_disabled = "//button[contains(@id,'showinstructionsaction')]";//"css=table.x-item-disabled>tbody>tr>td>em>button.showInstructions";
	public final String fileTab_downloadReference = "//a[contains(@class,'downloadreferencefiles')]//span[contains(text(),'Download')]";//"//span[contains(@id,'downloadreferencefiles')]";
	public final String fileTab_downloadReference_file="//div[contains(@id,'DownloadReference')]//table//td";//"//span[contains(@id,'DownloadReference')]//table//td";
	public final String fileTab_downloadReference_download="//div[contains(@id,'DownloadReference')]//div[contains(@id,'toolbar')]//span[text()='Download']";
	public final String fileTab_downloadReferenceFile_checkboxChecked="//span[contains(@id,'DownloadReference')]//table//td//img[contains(@class,'checked')]";
	public final String fileTab_downloadReferenceFile_checkboxSelected="//div[contains(@id,'window')]//table//td//div//div[contains(@class,'checked')]";
	public final String fileTab_downloadReferenceFile_header_checkbox="//div[contains(@id,'DownloadReferencesFiles')]//div[contains(@name,'downloadFilesGrid')]//div[contains(@class,'column-header')]//span[contains(@class,'checkheader')]";
	public final String fileTab_downloadReferenceFile_header_checkbox_checked="//div[contains(@id,'DownloadReferencesFiles')]//div[contains(@name,'downloadFilesGrid')]//div[contains(@class,'column-header')]//span[contains(@class,'checked')]";
	public final String fileTab_downloadSourceFile_header_checkbox="//div[contains(@id,'DownloadSourceFiles')]//div[contains(@name,'downloadFilesGrid')]//div[contains(@class,'column-header')]//span[contains(@class,'checkheader')]";
	public final String fileTab_downloadSourceFile_header_checkbox_checked="//div[contains(@id,'DownloadSourceFiles')]//div[contains(@name,'downloadFilesGrid')]//div[contains(@class,'column-header')]//span[contains(@class,'checked')]";
	public final String fileTab_downloadSourceFile_download="//div[contains(@id,'DownloadSourceFile')]//div[contains(@id,'toolbar')]//span[text()='Download']";
	public final String filesTab_downloadSourceFile_closeButton="//div[contains(@id,'DownloadSourceFile')]//div[contains(@id,'toolbar')]//span[text()='Close']";

	

	public final String filesTab_downloadReferenceFile_closeButton="//div[contains(@id,'DownloadReferencesFiles')]//div[contains(@id,'toolbar')]//span[text()='Close']";
	public final String reviewTab_downloadReference_disabled = "//button[contains(@id,'downloadreferencefilesaction')]";//"css=table.x-item-disabled>tbody>tr>td>em>button.downloadRefFile";
	public final String yesButton = "//a[contains(@id,'button')]/span/span/span[text()='yes']";
	public final String closeButton = "//a[contains(@id,'button')]/span/span/span[text()='Close']";
	public final String NoButton = "//a[contains(@id,'button')]/span/span/span[text()='No']";
	public final String saveChanges_yesButton = "//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span[text()='Yes']";//div[contains(@id,'window')]//span[text()='Yes']";
	public final String saveChanges_deleteButton = "//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span[text()='Delete']";
	public final String saveChanges_noButton = "//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span[text()='No']";//div[contains(@id,'window')]//span[text()='No']";
	public final String noTM_yesButton = "css=div.x-window:has(span:contains('No writable TM')) button.x-btn-text:contains('Yes')";
	public final String noTM_noButton = "css=div.x-window:has(span:contains('No writable TM')) button.x-btn-text:contains('No')";

	public final String save_finishTranslation_radioButton = "//label[text()='Finish the Translation phase and move to the next phase']";
	public final String save_onlySave_radioButton = "//label[text()='Only Save (do not move to the next phase)']";
	public final String save_onlySave_radioButton_selected_disabled = "//label[text()='Only Save (do not move to the next phase)'][ancestor::table[@name='typeOfSave' and contains(@class,'x-item-disabled') and contains(@class,'x-form-cb-checked')]]";
	public final String save_okButton = "//div[contains(@id,'savetopddialog')]//span[text()='OK']/..";
	public final String TranscheckReport_okButton = "//span[text()='OK']/..";
	public final String reviewTab_instructionsWindow_instructionsInput="//div[contains(@id,'showinstructionsfrompd')]//div[contains(@class,'msgBoxCont ')]//div";
	public final String reviewTab_instructionsWindow_okButton="//div[contains(@id,'showinstructionsfrompd')]//span[text()='OK']";
	public final String tsotab_segmentHistory="//a//span[text()='Segment History']";
	public final String tsotab_segmentHistory_TextFont="//div[contains(@class,'segment')]//table[2]//td[2]//div[contains(@style,'Arial')][contains(@style,'16px')]";
	//public final String tso_reloadWarning_reload_button="//div[contains(@class,'segment')]//table[2]//td[2]//div[contains(@style,'Arial')][contains(@style,'16px')]";
	
	
	
	
	public final String tsotab_segmentHistory_greencolor_changes="//span[contains(@class,'string-addedTextStyle')]";//span[contains(@style,'background-color:#9AFF97;') or contains(@style,'background-color: rgb(154, 255, 151);')]";
	public final String tsotab_segmentHistory_userName_ColumnX(int tableRow){
		return "//div[contains(@id,'segmenthistory')]//table["+tableRow+"]//tr//td[4]//div//div[contains(@class,'segmenthistory-Component')]";
	}
	
	
	
	public final String tsotab_segmentHistory_greencolor_text(String text){
		return "//span[contains(@class,'string-addedTextStyle')][contains(text(),'"+text+"')]";
	}
	
	public final String tsotab_segments_count(String count){
		return "//div[contains(@class,'editorViewStatusBar')]//label[contains(@class,'editorViewStatusBar') and contains(text(),'Segments: "+count+"')]";
	}
	
	public final String tsotab_segment_src_tgt_max(String count){
		return "//div[contains(@class,'editorViewStatusBar')]//label[contains(@class,'editorViewStatusBar') and contains(text(),'Segment (Src/Tgt/Max): "+count+"')]";
	}
	
	public final String tsotab_paragraph_src_tgt_max(String count){
		return "//div[contains(@class,'editorViewStatusBar')]//label[contains(@class,'editorViewStatusBar') and contains(text(),'Paragraph (Src/Tgt/Max): "+count+"')]";
	}
	
	public final String tsotab_segment_tooltipmsg(String text){
		return "//div[contains(@id,'tooltip')]//div[contains(text(),"+text+"')]";
	}
	
	public final String tsotab_paragraph_tooltipmsg(String text){
		return "//div[contains(@id,'tooltip')]//div[contains(text(),"+text+"')]";
	}
	
	public final String tsotab_editor_progressbar(int percentage){
		return"//div[contains(@id,'statusbareditor')]//div[contains(@class,'translation-progress-bar')]//div[contains(text(),'"+percentage+"%')]";
		//return "//div[contains(@id,'statusbareditor')]//div[contains(@id,'progressbar')]//div[contains(text(),'"+percentage+"%')]";
	}
	
	public final String tsotab_editor_progressbar_wordcount(String wordcount){
		return "//div[contains(@id,'statusbareditor')]//div[contains(@id,'progressbar')]//div[contains(text(),'"+wordcount+"')]";
	}
	
	//TODO - To use this locator you need to clear the segment Text, as this locator is to check for line through text
	public final String tsotab_segmentHistory_changedValue(String segmentText){
		//return "//span[contains(@style,'background-color: rgb(255, 64, 64);') or contains(@style,'text-decoration:line-through;')][contains(text(),'"+segmentText+"')]";
		return "//span[contains(@class,'string-missingTextStyle')][contains(text(),'"+segmentText+"')]";
	}	
	public final String tsotab_segmentHistoryTab_checkDetails(int rowNumber,String segmentText) throws Exception{
		if(BrowserFactory.SystemEngine().verifyElementPresent("//div[contains(@id,'segmenthistory')]//table[contains(@id,'view')]["+rowNumber+"]//td//span[contains(text(),'"+segmentText+"')]",5)==true){
		return "//div[contains(@id,'segmenthistory')]//table[contains(@id,'gridview')]["+rowNumber+"]//td['"+segmentText+"']//div";
		}else{
		return "//div[contains(@id,'segmenthistory')]//table[contains(@id,'view')]["+rowNumber+"]//td//div[contains(text(),'"+segmentText+"')]";	
		}
	}	
	
	public final String tsotab_segmentHistoryTab_checkDetailsNew(int rowNumber,String segmentText) 
		{
		return "//div[contains(@class,'segmentHistory')]//table[contains(@id,'gridview')]["+rowNumber+"]//td["+segmentText+"]//div[contains(@class,'segmenthistory')]";
	}	
	
	//NOTES 
	public final String tsotab_Notes_Tab="//a//span[text()='Notes']";
	public final String tsotab_TM_lookup_Tab="//a//span[text()='TM Lookup']";
	public final String tsotab_TM_lookupTab_input="//div[contains(@id,'lookup')]//input[contains(@name,'searchBar')]";
	
	public final String tsotab_TM_lookupTab_input_Show_WhiteSpace_charachter="//div[contains(@id,'lookup')]//input[contains(@name,'searchBar')][not(contains(@style,'font-family:WscFont, Arial'))]";
	
	
	public final String tsotab_TM_lookup_Tab_clear_btn="//div[contains(@id,'tmlookup')]//div//a//span[contains(@class,'x-btn-inner')][contains(text(),'Clear')]";
	public final String tsotab_TM_lookup_Tab_More_Options_btn="//div[contains(@id,'tmlookup')]//div//a//span[contains(@class,'x-btn-inner')][contains(text(),'More Options')]";
	public final String tsotab_TM_lookup_Tab_More_Options_Visible="//div[contains(@id,'menu')]//div[contains(@class,'box-scroller')]//div[contains(@id,'menucheckitem')][1]";//"//div[contains(@class,'menu-icon-separator')]//following-sibling::div[2]";
	public final String tso_editTab_preferences_transcheck_spellingCheck_checkbox ="//div[@name='spelling']//span[contains(@class,'checkbox')]";//"//div[contains(@name,'spelling')]//span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_transcheck_spellingCheck_checkbox_checked ="//div[@name='spelling'][contains(@class,'checked')]//span[contains(@class,'checkbox')]";//"//div[contains(@name,'spelling')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	
	//Metadata
	public final String tsotab_Metadata_Tab="//a//span[text()='Metadata']";
	
	//TM Lookup
	public final String tsotab_TM_lookup_tab_column_source="//div[contains(@name,'grid')]//div[contains(@id,'headercontainer')]//span[contains(text(),'Source')]";
	public final String tsotab_TM_lookup_tab_column_source_drop_down="//div[contains(@name,'grid')]//div[contains(@id,'gridcolumn')][contains(@class,'column-header-default')][2]//div[contains(@class,'column-header-trigger')]";//"//div[contains(@name,'grid')]//div[contains(@id,'gridcolumn')][contains(@class,'column-header-sort')]//div[contains(@class,'column-header-trigger')]";
	public final String tsotab_TM_lookup_tab_column_source_drop_down_cloumns="//span[contains(text(),'Columns')]/following-sibling::div[contains(@id,'arrow')][contains(@class ,'arrow')]";//"//div[contains(@id,'menuitem')]//a//span[contains(text(),'Columns')]";
	public final String tsotab_TM_lookup_Target_coloumn_box="//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//td[3]//div";
	
	public final String tsotab_TM_lookup_search_box="//a//span[text()='TM Lookup']//following::input[contains(@name,'search')]";
	
	
	
	public final String tso_tab_lookupTab_dropDown_columns_options_checked(String optionName){
		return "//div[contains(@id,'menu')]//div[contains(@id,'menucheckitem')][contains(@class,'item-checked')]//a//span[contains(text(),'"+optionName+"')]";
	}
	
	public final String tso_tab_lookupTab_dropDown_columns_options(String optionName){
		return "//div[contains(@id,'menu')]//div[contains(@id,'menucheckitem')]//a//span[contains(text(),'"+optionName+"')]";
	}
	
	// here class name have unchecked and checked text in locator.so 'un' text is there to diiferentiate checkbox. 
	
	public final String tso_tab_lookup_tab_more_options_unchecked(String optionName){
		return "//div[contains(@id,'menu')]//div[contains(@class,'item-unchecked')]//a//span[contains(text(),'"+optionName+"')]";//"//div[contains(@id,'menu')]//a//span[contains(text(),'"+optionName+"')]";//"//div[contains(@id,'menucheckitem')][contains(@class,'un')]//a[span[contains(text(),'"+optionName+"')]]";
	}
	
	public final String tso_tab_lookup_tab_more_options_checked(String optionName){
		return "//div[contains(@id,'menu')]//div[contains(@class,'item-checked')]//a//span[contains(text(),'"+optionName+"')]";//"//div[contains(@id,'menucheckitem')][not(contains(@class,'un'))]//a[span[contains(text(),'"+optionName+"')]]";
	}
	
	public final String tso_tab_lookup_tab_more_options_checkBox(String optionName){
		return "//div[contains(@id,'menucheckitem')]//a[span[contains(text(),'"+optionName+"')]]/div[contains(@class,'checkbox')]";
	}
	public final String tso_tmLookup_ColumnHeader(int ColumnNumber,String text)
	{
		return "//div[contains(@id,'tmlookup')]//div[contains(@id,'headercontainer')]//div//div//div["+ColumnNumber+"]//span[contains(text(),'"+text+"')]";
	}
	
	public final String tso_metadatatab_value(int ColumnNumber,String value)
	{
		return "//div[contains(@class,'context-component-grid')]//table//td['"+ColumnNumber+"']//div[contains(text(),'"+value+"')]";
	}
	
	//TM lookup->searched text->highlighted text[yellow colour.]
	public final String tso_tab_lookup_search_highlighted_Text(String text){
		return "//span[contains(@class,'component-tempSpan')][contains(@style,'background-color:#FEFE00') or contains(@style,'background-color: rgb(254, 254, 0);')][text()='"+text+"']";
	}
	public final String tso_tmLookupTab_tmLookUp_Search_Term_Highlighted(int TableNumber,int ColumnNumber,String text)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]["+TableNumber+"]//tr//td["+ColumnNumber+"]//span[contains(text(),'"+text+"')][contains(@style,'#C0C0C0')]";
	}
	//TM lookup->searched text->highlighted text[Orange colour.]
	public final String tso_tab_lookup_Score_WithColour(String text){
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//td[4][contains(@style,'rgb(255, 232, 209)')]//div[contains(@style,'font-family')][contains(text(),'"+text+"')]";
	}
	
	public final String tso_tab_lookup_Score_DiffferentColour(int rowNumber, String text,String Colour,String colorcode){
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'tableview')]["+rowNumber+"]//tr//td[4][contains(@style,'rgb("+Colour+")') or contains(@style,'"+colorcode+"')]//div[contains(text(),'"+text+"')]";
	}
	
	public final String tso_tmLookup_Tab_details_InformationIcon(int divNo ,String segment)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//td["+divNo+"]//div//div[contains(text(),'"+segment+"')]";
	}
	
	public final String tso_tmLookupInfo_Tab_details_ScoreBreakdown(int tableno,int score ,String PenaltyName){
	return "//div[contains(@id,'TmLookUpInfoDialog')]//div[contains(@name,'gridScore')]//table["+tableno+"]//td[//div[text()='"+PenaltyName+"']]/following-sibling::td//div[text()='"+score+"']";
	}
	
	public final String tso_tmLookupInfo_Tab_OKButton="//div[contains(@id,'TmLookUpInfoDialog')]//div[contains(@class,'dialogs-footer')]//a[@role='button']//span[text()='OK']";
	//TM lookup->searched text->Deleted text[red colour.]
	public final String tso_tab_lookup_search_Deleted_Text(String text){
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//td[2]//div[contains(@style,'font-family')]//del[text()='"+text+"']";
	}
		
	public final String tsotab_TM_lookupTab_findSource_button="//div[contains(@id,'tmlookup')]//div//a//span[contains(@class,'x-btn-inner')][contains(text(),'Find Source')]";
	public final String tsotab_TM_lookupTab_findTarget_button="//div[contains(@id,'tmlookup')]//div//a//span[contains(@class,'x-btn-inner')][contains(text(),'Find Target')]";
		
	
	public final String Notes_Tab_Add_btn="//div[contains(@id,'NotesView')]//span[text()='Add Note']";//"//div[contains(@id,'notes')]//span[text()='Add']";//"//a[contains(@id,'addnote')]//span[text()='Add']/following-sibling::span";
	public final String Notes_Tab_Add_btn_disabled="//a[contains(@id,'ActionButton') and contains(@class,'disabled')]//span[text()='Add Note']";//"//a[contains(@id,'addnote') and contains(@class,'disabled')]//span[text()='Add']";
	public final String Notes_Tab_AddEditNotes_textarea="//textarea[contains(@name,'addEditNoteContent')]";//"//textarea[@name='addEditNoteContent']";
	public final String Notes_Tab_AddEditNotes_textarea_OKBtn="//div[contains(@id,'addeditnotes')]//a[contains(@id,'button')]//span[text()='OK']";
	public final String Notes_Tab_AddEditNotes_textarea_cancelButton="//div[contains(@id,'addeditnotes')]//a[contains(@id,'button')]//span[text()='Cancel']";
	public final String Notes_Tab_Edit_btn="//div[contains(@id,'NotesView')]//span[text()='Edit Note']";//"//div[contains(@id,'notes')]//span[text()='Edit']";//"//a[contains(@id,'editnote')]//span[text()='Edit']/following-sibling::span";
	public final String Notes_Tab_Edit_btn_disabled="//a[contains(@id,'ActionButton') and contains(@class,'disabled')]//span[text()='Edit Note']";//"//div[contains(@id,'notesview')]//a[contains(@class,'disabled')]//span[text()='Edit']";//"//a[contains(@id,'editnote') and contains(@class,'disabled')]//span[text()='Edit']";
	public final String Notes_Tab_Delete_btn="//div[contains(@id,'NotesView')]//span[text()='Delete Note']";//"//div[contains(@id,'notes')]//span[text()='Delete']";//"//a[contains(@id,'deletenotes')]//span[text()='Delete']/following-sibling::span";		
	public final String Notes_Tab_Delete_btn_disabled="//a[contains(@id,'ActionButton') and contains(@class,'disabled')]//span[text()='Delete Note']";//"//div[contains(@id,'notesview')]//a[contains(@class,'disabled')]//span[text()='Delete']";//"//a[contains(@id,'deletenotes') and contains(@class,'disabled')]//span[text()='Delete']";	
	public final String tso_firstRow_Segment = "//div[contains(@id,'Body')]/table[contains(@id,'Part')]";
	public final String editTab_show_Whitespaces_characters ="//a[contains(@class,'whitespacecharacteraction')]//span[contains(text(),'Whitespace')]";
	public final String editTab_show_Whitespaces_characters_btn_pressed ="//a[contains(@class,'whitespacecharacteraction')][contains(@class,'x-btn-pressed')]//span[contains(text(),'Whitespace')]";
	public final String targetSegmentselectedIframeDiv ="//html//body//div[contains(@id,'content')]";
	public final String targetSegmentselectedIframeDivX ="//html//body//div[contains(@id,'Editor')][contains(@contenteditable,'true')]";//"//html//body//div[contains(@id,'tblt')][contains(@contenteditable,'true')]";
	public final String targetSegmentselectedIframeDiv_highlighted ="//html//body//div[contains(@class,'highlight')]";
	
	//Review->Notes
	
	public final String tso_reviewTab_addNotes_button="//a[contains(@class,'addnote')]//span[contains(text(),'Add')]";
	public final String tso_reviewTab_editNotes_button="//a[contains(@class,'editnote')]//span[contains(text(),'Edit')]";
	public final String tso_reviewTab_deleteNotes_button="//a[contains(@class,'deletenote')]//span[contains(text(),'Delete')]";	
	public final String tso_reviewTab_addNotes_button_disabled="//a[contains(@class,'addnote')][contains(@class,'btn-disabled')]//span[contains(text(),'Add')]";
	public final String tso_reviewTab_editNotes_button_disabled="//a[contains(@class,'editnote')][contains(@class,'btn-disabled')]//span[contains(text(),'Edit')]";
	public final String tso_reviewTab_deleteNotes_button_disabled="//a[contains(@class,'deletenote')][contains(@class,'btn-disabled')]//span[contains(text(),'Delete')]";
	public final String tso_reviewTab_addEditNotesWindow_creator_label="//div[contains(@id,'addeditnotes')]//span[contains(text(),'Creator')]";//div[contains(@id,'addeditnotes')]//label[contains(text(),'Creator')]";
	public final String tso_reviewTab_addEditNotes_notesInput="//input[contains(@name,'addEditNoteType')]";
	public final String tso_reviewTab_addEditNotes_type_dropDown="//div[input[contains(@name,'EditNoteType')]]/following-sibling::div[contains(@class,'arrow-trigger')]";
	
	
	
	
	
	
	
	
	
	
	public final String tso_translationTab_nextTag_button="//a[contains(@class,'NextTag')]//span[contains(text(),'Next')]";
	public final String tso_translationTab_previousTag_button="//a[contains(@class,'PreviousTag')]//span[contains(text(),'Previous')]";
	public final String tso_translationTab_copyTag_button="//a[contains(@class,'CopyTag')]//span[contains(text(),'Copy')]";
	public final String tso_editTab_copyAllTag_button="//a[contains(@class,'copyall')]//span[contains(text(),'Copy')]";
	
	public final String tso_translationTab_copyAllTag_arrow="//a[contains(@class,'copyallplaceables')]//span[contains(@class,'arrow')]";
	public final String tso_translation__Dropdown_copyAllTags_document_button="//a[contains(@class,'menu-item-link')]//span[contains(text(),'Document')]/following-sibling::div";
	public final String tso_translation__Dropdown_copyAllTags_segment_button="//a[contains(@class,'menu-item-link')]//span[contains(text(),'Segment')]/following-sibling::div";
	public final String clearTarget_Dropdown_CopySegment_button_disabled="//div[(contains(@class,'disabled'))]//a[contains(@class,'menu-item-link')]//span[contains(text(),'Segment')]/following-sibling::div";
	//Transcheck
	public final String tso_reviewTab_transcheckSegment_button="//a[contains(@class,'transchecksegment')]//span[contains(text(),'Transcheck')]";
	public final String tso_transcheckTab="//div[contains(@id,'southadditional')]//a//span[contains(text(),'Transcheck')]";
	
	//Translator->Transcheck
	public final String tso_transcheckTab_Previous_Error_button="//div[contains(@id,'transcheck')]//div[contains(@id,'toolbar')]//a[not(contains(@class,'disabled'))]//span[text()='Previous error']";
	public final String tso_transcheckTab_Next_Error_button="//div[contains(@id,'transcheck')]//div[contains(@id,'toolbar')]//a[not(contains(@class,'disabled'))]//span[text()='Next error']";
	public final String tso_transcheckTab_Refresh_button="//div[contains(@id,'transcheck')]//div[contains(@id,'toolbar')]//a[not(contains(@class,'disabled'))]//span[text()='Refresh']";
	public final String tso_transcheckTab_Ignore_warning_button="//div[contains(@id,'transcheck')]//div[contains(@id,'toolbar')]//a[not(contains(@class,'disabled'))]//span[text()='Ignore warning']";
	
	//translator ->transcheck->Error details
	public final String tso_transcheckTab_warning_explaination_cause_Details(String ErrorText){
		return "//div[contains(@id,'transcheck')]//table//tr//td//div[contains(@class,'div')][contains(text(),'"+ErrorText+"')]";
	}
	public final String translationTab_status_Column_transcheckSegment_Image_Icon(int PartNo,int RowNo){
		
		return "//table[contains(@id,'view')]["+PartNo+"]//tr[contains(@class,'grid')]//td[contains(@class,'EditorTxli')]//td[contains(@class,'transcheck')]";//"//table[contains(@id,'Part')]["+PartNo+"]//tr[contains(@id,'row')]["+RowNo+"]//td[contains(@id,'status')]//div//table//tr//td[contains(@class,'transcheck')]";
	}
	
public final String tso_translationTab_status_Column_VerifySegment_Image_Icon(int PartNo){
		
		return "//table[contains(@id,'view')]["+PartNo+"]//tr[contains(@class,'grid')]//td[contains(@class,'verifySegment')]//div[contains(@class,'verifySegment')]";
	}
	
	
	public final String tso_dashboard_file_downloadPreviewButton="//a[contains(@class,'fileinword')]//span[contains(text(),'Get MS Word')]";//"//div[contains(@class,'x-tabpanel-child')]//div//span[contains(@id,'downloadpreview')]";//"//div[contains(@class,'x-tabpanel-child')]//div//span[text()='Preview']";
	/*public final String dashboard_file_getBilingual_disabledButton="//a[contains(@class,'ActionPreview') and contains(@class,'disabled')]";
	public final String dashboard_file_getBilingual_disabledButton="//a[contains(@class,'downloadpreview') and contains(@class,'disabled')]";
*/	public final String dashboard_file_getBilingual_disabledButton="//a[contains(@class,'preview') and contains(@class,'disabled')]";
	public final String currentProject_getBilingual_disabledButton="//a[contains(@class,'CommonSharedBilingualExport') and contains(@class,'disabled')]";
	public final String GetMSWordTable_popup_button="//a[contains(@class,'toolbar')]//span[contains(text(),'Get MS Word Table')]";//"//div[contains(@class,'x-tabpanel-child')]//div//span[contains(@id,'downloadpreview')]";//"//div[contains(@class,'x-tabpanel-child')]//div//span[text()='Preview']";

	public final String tso_dashboard_file_HTMLPreviewButton_Dropdown="//a[contains(@class,'ActionPreview')]//span[contains(@id,'ActionSplitButton')][//span[contains(text(),'Preview')]]/following-sibling::span[contains(@id,'arrow')][@aria-haspopup='true']";
	public final String tso_dashboard_file_PreviewButton_Dropdown="//a[contains(@class,'ActionPreview')]//span[contains(@class,'arrow')]"; //a[contains(@class,'ActionPreview')]//span[contains(text(),'Preview')]";
	public final String tso_dashboard_file_Office_Preview_Button="//a[contains(@id,'menuitem')]//span[text()='Office Preview']";
	public final String tso_dashboard_file_LivePreview_Button="//a[contains(@data-qtip,'live preview')]//span[text()='Live Preview']";
	public final String tso_dashboard_file_HTMLPreviewButton="//a[contains(@id,'menuitem')]//span[text()='Html Preview']";
	
	
	//Review->Transcheck
	public final String tso_reviewTab_TranscheckAll_button="//a[contains(@class,'transcheck')][contains(@data-qtip,'Transcheck All')]//span[contains(text(),'Transcheck')]";
	public final String tso_reviewTab_TranscheckSummary_Window="//div[contains(@id,'title')][text()='Transcheck Summary']";
	public final String tso_reviewTab_TranscheckSummary_window_OK_btn="//div[contains(@id,'transcheckreport')]//div[contains(@id,'toolbar')]//a//span[text()='OK']";
	public final String TranscheckTab_No_results="//div[contains(@id,'transcheck')]//following::div[@class='emptyText']";
	public final String Missing_warning_OKbutton = "//div[contains(@id,'message')]//div[contains(@id,'toolbar')]//a//span[text()='OK']";

	
	public final String tso_transcheckTab_verifyWarningMessage(int rowNumber,String warningMessage)
	{
		return "//table[contains(@id,'view')]//tr["+rowNumber+"]//div[contains(text(),'"+warningMessage+"')]";
	}

	public final String tso_notesTab_notesCreatorID(int rowNumber,int ColumnNum, String notesText)
	{
		return "//div[contains(@id,'NotesViewGrid')]//table[contains(@id,'view')]//tr["+rowNumber+"]//td["+ColumnNum+"]//div[contains(text(),'"+notesText+"')]";
	}
	

	public final String tso_notesTab_notesDetail(int rowNumber, String notesText)
	{
		return "//div[contains(@id,'NotesViewGrid')]//table[contains(@id,'view')]["+rowNumber+"]//tr[1]//td//div[contains(text(),'"+notesText+"')]";//"//div[contains(@id,'NotesViewGrid')]//table[contains(@id,'tableview')]//tr["+rowNumber+"]//td['"+notesText+"']";//"//div[contains(@id,'tblBodyTable')]//table[contains(@id,'notesview')]//tr["+rowNumber+"]//td//div[contains(text(),'"+notesText+"')]";
	}
	
	public final String tso_notesTab_notesDetailtable(int columnno,int rowNumber, String notesText)
	{
		return "//div[contains(@id,'NotesViewGrid')]//table["+columnno+"][contains(@id,'view')]["+rowNumber+"]//tr[1]//td//div[contains(text(),'"+notesText+"')]";//"//div[contains(@id,'NotesViewGrid')]//table[contains(@id,'tableview')]//tr["+rowNumber+"]//td['"+notesText+"']";//"//div[contains(@id,'tblBodyTable')]//table[contains(@id,'notesview')]//tr["+rowNumber+"]//td//div[contains(text(),'"+notesText+"')]";
	}
	
	public final String tso_notesTab_notesDetail_withType(int rowNumber, String notesText, String Type)
	{
		//return "//div[contains(@id,'tblBodyTable')]//table[contains(@id,'notesview')]//tr["+rowNumber+"]//td//div[contains(text(),'"+notesText+"')]";
		return "//div[contains(@id,'NotesViewGrid')]//table[contains(@id,'view')]["+rowNumber+"]//tr[1]//td[//div[contains(text(),'"+notesText+"')]]/preceding-sibling::td//div//div[contains(text(),'"+Type+"')]";
	}
	
	public final String tso_notesTab_notesDetail_columnNumber(int rowNumber, int columnNumber)
	{
		return "//div[contains(@id,'NotesViewGrid')]//table[contains(@id,'view')]//tr["+rowNumber+"]//td["+columnNumber+"]";//"//div[contains(@id,'tblBodyTable')]//table[contains(@id,'notesview')]//tr["+rowNumber+"]//td["+columnNumber+"]";
	}
	
	public final String tso_reviewTab_addEditNotesWindow_select_typeName(String typeName)
	{
		return "//div[contains(@name,'addEditNoteType-boundlist')]//li[contains(text(),'"+typeName+"')]";
	}
	
	public final String tso_status_notes_Icon_forRow(int rowNumber)
	{
		return "//div[contains(@id,'Editor')]//table["+rowNumber+"]//td[contains(@class,'StatusImgTable')]";//"//table[contains(@id,'tblPart')]//tr["+rowNumber+"]//table[contains(@class,'StatusColum')]//td[contains(@class,'smallStatusImgTable')]";
	}
	
	public final String tso_reviewTab_addEditNotesWindow_label(String labelName)
	{
		return "//div[contains(@id,'addeditnotes')]//label//span[contains(text(),'"+labelName+"')]";
	}
	
	public final String tmLookup_sourceAndTargetSegment(String segment)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//div[contains(text(),'"+segment+"')]";
	}
	
	public final String tmLookup_sourceSegment_searchText(String text)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//td[2]//span[contains(text(),'"+text+"')]";
	}
	
	public final String tmLookup_targetSegment_searchText(String text, int columnNumber)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//td["+columnNumber+"]//div//span[contains(text(),'"+text+"')]";
		//return "//div[contains(@id,'tmlookup')]//table[contains(@id,'tableview')]//tr//td["+columnNumber+"]//div//span[contains(text(),'"+text+"')]";

	}
	
	public final String tmLookup_Tab_details(int divNo ,String segment)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//td["+divNo+"]//div//div[contains(text(),'"+segment+"')]";
	}
	
	public final String tmLookupTab_tmLookUp_details(int columnNumber,String text)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//td["+columnNumber+"]//div[contains(text(),'"+text+"')]";
	}
	
	
	
	public final String tmLookupTab_tmLookUp_details_Source(int rowNumber, int columnNumber,String text)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]["+rowNumber+"]//tr//td["+columnNumber+"]//span[contains(text(),'"+text+"')]";
	}
	
	public final String tmLookupTab_tmLookUp_topTMdetails(int rowNumber,String text)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]["+rowNumber+"]//tr//td[5]//div[contains(text(),'"+text+"')]";
	}
		
	public final String targetSegmentIframeX(int partNo, int segmentNo)
	{
		//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tbody["+segmentNo+"]/tr/td[3]//iframe";		
		//return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tr/td[3]//iframe";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'gridview')]//table["+partNo+"]//tr//td[3]//iframe";
	}           //div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'gridview')]//table[3]//tr//td[3]//iframe
	
	public final String targetSegmentIframe(int partNo, int segmentNo)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Editor')]//table["+partNo+"]//tr//td[3]//iframe";//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tr["+segmentNo+"]/td[3]//iframe";
	}
	
	public final String sourceSegment_text(String segmentText)
	{
		return "//table[contains(@class,'disable-browser-text-selection')]//tr//div[contains(text(),'"+segmentText+"')]";
	}
	
	public final String sourceSegment_withSegmentNumber_andText(int segmentNumber,String segmentText)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+segmentNumber+"]//td[2]//div[contains(@id,'source')][text()='"+segmentText+"']";//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]/tr["+segmentNumber+"]/td/div/div[contains(@id,'source')][text()='"+segmentText+"']";
	}
	
	public final String TargetSegment_withSegmentNumber_andText(int segmentNumber,String segmentText)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+segmentNumber+"]//td[3]//div[contains(@id,'target')][contains(text(),'"+segmentText+"')]";
	}
	
	public final String targetSegment_withSegmentNumber_andSpecialText(int segmentNumber,String segmentText)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+segmentNumber+"]//td[3]//div[contains(@id,'target')][contains(text(),'"+segmentText+"')]";//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]/tr["+segmentNumber+"]/td/div/div[contains(@id,'tblt')][contains(text(),'"+segmentText+"')]";
	}
	
	public final String notesTab_dynamicIdsize(int rownumber,int IDnumber)
	{
		return "//div[contains(@name,'notesTable')]//table//tr["+rownumber+"]//td[1]//div[contains(@style,'16px') and contains(text(),"+IDnumber+")]";
	}
	
	public final String targetSegment_withSegmentNumber_andText(int segmentNumber,String segmentText)
	{
		return "//div[contains(@id,'Editor')]//table["+segmentNumber+"]//div[contains(@id,'target') and contains(text(),'"+segmentText+"')]";//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]/tr["+segmentNumber+"]/td/div/div[contains(@id,'tblt')][contains(text(),'"+segmentText+"')]";
	}
	
	public final String sourceSegment_forHiddenText(String initialTextint,int imgNumber,String hyperlink)
	{
		return "//table[contains(@id,'tblPart_1')]//tr//td[contains(@class,'gs4tr_Editor_allow_selection')]//div[contains(@id,'source_content')][contains(text(),'"+initialTextint+"')]//img["+imgNumber+"][contains(@title,'"+hyperlink+"')]";
	}
	
	public final String sourceSegment_forHiddenText_2(String initialTextint,int imgNumber,String hyperlink)
	{
		return "//table[contains(@id,'tblPart_1')]//tr//td[contains(@class,'gs4tr_Editor_allow_selection')]//div[contains(@id,'source_content')][contains(text(),'"+initialTextint+"')]//img["+imgNumber+"][contains(@title,'"+hyperlink+"')]";
	}
	
	public final String sourceSegment_text_forHyperlink(int imgNumber,String hyperlink)
	{
		return "//table[contains(@id,'tblPart_2')][contains(@class,'disable-browser-text-selection')]//tr//div[contains(@id,'source_content')]//img["+imgNumber+"][contains(@title,'"+hyperlink+"')]";
	}
	
	public final String sourceSegment_text_forSampleIndex(String initialTextint,int imgNumber,String hyperlink)
	{
		return "//table[contains(@id,'tblPart_1')][contains(@class,'disable-browser-text-selection')]//tr//div[contains(@id,'source_content')][contains(text(),'"+initialTextint+"')]//img["+imgNumber+"][contains(@title,'"+hyperlink+"')]";
	}
	
	public final String sourceSegment_text_forSampleIndex_2(String initialTextint,int imgNumber,String hyperlink)
	{
		return "//table[contains(@id,'tblPart_1')][contains(@class,'disable-browser-text-selection')]//tr//div[contains(@id,'source_content')][contains(text(),'"+initialTextint+"')]//img["+imgNumber+"][contains(@title,'"+hyperlink+"')]";
	}
	
	public final String sourceSegment_text_forSTags(String initialTextint,int imgNumber,String hyperlink)
	{
		return "//table[contains(@id,'tblPart_1')]//tr//td[contains(@class,'gs4tr_Editor_allow_selection')]//div[contains(@id,'source_content')][contains(text(),'"+initialTextint+"')]//img["+imgNumber+"][contains(@title,'"+hyperlink+"')]";
	}
	
	
	public final String Notes_Tab_firstDataRow(int partNo, int rowNo)
	{
		return "//div[contains(@id,'NotesViewGrid')]//table[contains(@class,'grid')]["+rowNo+"]";//"//div[contains(@id,'notesviewtable')]//table[contains(@id,'Part')]["+partNo+"]//tr[contains(@id,'row')]["+rowNo+"]";
	}
	
	public final String Notes_Tab_SelectedNote(int rowNo)
	{
		return "//div[contains(@id,'NotesViewGrid')]//table[contains(@class,'grid')]["+rowNo+"]//tr[contains(@aria-selected,'true')]";
	}
	
	
	
	
	
	
	
	public final String tso_segmment_tooltip(int SegmentNo)
	{
		
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+SegmentNo+"]//div[contains(@class,'icon')]";
	}
	
	public final String noOfSegments(int partNo)
	{
		return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]/tr["+partNo+"]/td/div/div[contains(@id,'source')]";//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tbody/tr/td/div/div[contains(@id,'source')]";//user get xpath count() of selenium;
	}
	public final String selectSegmentX(int partNo, int segmentNo)
	{
		//return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]/tr["+partNo+"]/td/div/div[contains(@id,'source')]";//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tbody["+segmentNo+"]/tr/td[2]/div/div[contains(@id,'source')]";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//tr//td[contains(@class,'source')]";
	}
	
	public final String selectSegmentXEditableContent(int partNo)
	{
		
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//td[2]//div[contains(@contenteditable,'true')]";
	}
	
	public final String selectSegment(int partNo)
	{
		//return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tr/td/div/div[contains(@id,'source')]";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//tr//td[contains(@class,'source')]";
	}
	
	public final String selectedSourceTags(int rowNumber, int tagNumber)
	{
		return "//div[contains(@id,'Editor')]//table["+rowNumber+"]//td//img["+tagNumber+"][contains(@src,'tablewitheditor')]";//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]/tr["+rowNumber+"]//td//img["+tagNumber+"][contains(@src,'select')]";
	}
	
	
	public final String targetSegmentX(int partNo, int segmentNo)
	{
		
		//return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tbody["+segmentNo+"]/tr/td/div/div[not(contains(@id,'source'))]";
		//return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tr["+segmentNo+"]/td[3]/div/div[contains(@id,'content')]";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+segmentNo+"]//tr[1]//td[3]//div[contains(@id,'target')]";
	}
	
	public final String targetSegment(int partNo)
	{
		//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tbody["+segmentNo+"]/tr/td[3]/div/div[contains(@id,'content')]";
		//return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tbody["+segmentNo+"]/tr/td/div/div[not(contains(@id,'source'))]";
		//return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tr/td[3]/div/div[contains(@id,'content')]";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//tr//td[3]//div[contains(@id,'target')]";
		
	}
	
	//Tag Warning
	public final String tso_tagwarning_fixmanually = "//span[contains(text(),'Fix Manually')]";
	
	public final String tso_targetSegment_tagPresent(int rowNumber, int tagNo)
	{
		return "//div[contains(@id,'GridComponent')]//table["+rowNumber+"]//td[3]//div/img[@tagid='"+tagNo+"']";//"//div[contains(@class,'remove')]//img["+tagNo+"][contains(@src,'tablewitheditor')]";//"//table[contains(@class,'browser-text-selection')]//tr["+rowNumber+"]//td[3]//div//img[contains(@display-id,'"+tagNo+"')]";
	}
	public final String tso_SourceSegment_tagPresent(int rowNumber, int tagNo)
	{
		return "//div[contains(@id,'GridComponent')]//table["+rowNumber+"]//td[3]//div/img[@tagid='"+tagNo+"']";//"//div[contains(@class,'remove')]//img["+tagNo+"][contains(@src,'tablewitheditor')]";//"//table[contains(@class,'browser-text-selection')]//tr["+rowNumber+"]//td[3]//div//img[contains(@display-id,'"+tagNo+"')]";
	}
	public final String tso_SourceSegment_tagPresent_active_seg="//div[contains(@class,'gs4tr_editor_remove_outline')]//img[contains(@class,'gs4tr_Editor_standalone_image')]";
	public final String tso_targetSegment_BOLD_tagPresent(int rowNumber, int tagNo)
	{
		return "//div[contains(@id,'GridComponent')]//table["+rowNumber+"]//td[3]//div/img[@tagid='"+tagNo+"'][contains(@title,'bold')]";
	}
	public final String tso_targetSegment_BOLD_textPresent(int rowNumber)
	{
		return "//div[contains(@id,'GridComponent')]//table["+rowNumber+"]//td[3]//b[1]";
	}
	
	public final String tso_targetSegment_textPresent(String text)
	{
		return "//div[contains(@id,'currentEditor')]//div[contains(text(),'"+text+"')]";
	}
	
	public final String tso_targetSegment_Numbered_tagPresent(int rowNumber, int tagNo)
	{
		return "//div[contains(@id,'GridComponent')]//table["+rowNumber+"]//td[3]//div/img[@tagid='"+tagNo+"'][contains(@title,'fontFormat')]";
	}
	
	public final String scoreForSegmentX(int rowNumber, int partNo)
	{
		return "//div[contains(@id,'EditorTxliff')]//table[contains(@id,'view')]["+partNo+"]//tr//td[4]/div";//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tr/td[4]/div";

	}
	
	public final String targetSegment100ScoreX(int partNo)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//tr[1]//td[4][contains(@style,'rgb(209, 255, 209)')]//div[contains(text(),'100%')]";//"//table[contains(@id,'Part')]/tr["+partNo+"]/td[contains(@id,'score')][contains(@style,'rgb(209, 255, 209)')]/div[text()='100%']";
	}
	
	public final String targetSegmentScore_WithoutColour(int partNo,String Percentage)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//tr[1]//td[4]//div[text()='"+Percentage+"']";
	}
	
	
	public final String targetSegmentLeveragedScoreX(int partNo,int percent_score)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//tr[1]//td[4]//div[text()='"+percent_score+"%']";//"//table[contains(@id,'Part')]/tr["+partNo+"]/td[contains(@id,'score')][contains(@style,'rgb(255, 255, 180)')]/div[text()='"+percent_score+"%']";
	}
	
	public final String tso_dashboard_review_addScoringName(String scoringName)
	{
	return "//div[contains(@id,'boundlist')]//ul//li[text()='"+scoringName+"']";//"//div[contains(@name,'scoreDisplay-boundlist')]//ul//li[text()='"+scoringName+"']";
	}
	
	//context match segment.
	public final String targetSegmentContextMatchedX(int partNo)
	{
		return "//table[contains(@id,'tableview')]["+partNo+"]//td[contains(@class,'score')][contains(@style,'rgb(130, 249, 210)')]//div[text()='100+%']";//"//table[contains(@id,'Part')]/tr["+partNo+"]/td[contains(@id,'score')][contains(@style,'rgb(130, 249, 210)')]//div[text()='100+%']";
	}

	public final String targetSegment_score_forSegment(int tableNumber, String score)
	{
		return "//div[contains(@id,'Editor')]//table["+tableNumber+"]//td[contains(@class,'score')]//div[contains(text(),'"+score+"')]";//"//table[contains(@id,'Part')]//tr["+rowNumber+"]//td[contains(@id,'score')]//div[contains(text(),'"+score+"')]";
	}

	//After 100% scored target and get edited..for 'All except 100% and Context match segments' list menu through Filter->Translation Tab.
	public final String targetSegment_less_than_100ScoreX(int partNo)
	{
		return "//table[contains(@id,'Part')]/tr["+partNo+"]/td[contains(@id,'score')][contains(@style,'rgb(255, 209, 233)')]/div[text()='100%']";
	}
	//**CurrentProject**// 
	
    //For selecting the reference file type
	public final String tso_currentproject_referencefile_filetype(int rowNumber, String filetype)
	{
		return "//table[contains(@id,'treeview')]["+rowNumber+"]//td//div[contains(text(),'"+filetype+"')]";
	}
	//For Verifying TM Name
	public final String tso_currentproject_projectTM_tmName(int rowNum, String tmName)
	{
		return "//table[contains(@id,'treeview')]["+rowNum+"]//td//div[contains(@class,' remoteTmFilesMark')]/following-sibling::span//span[contains(text(),'"+tmName+"')]";//"//table[contains(@id,'treeview')]["+rowNum+"]//td//div[contains(@class,' remoteTmFilesMark')]/following-sibling::span[contains(text(),'"+tmName+"')]";
	}
	
	public final String tso_currentproject_GenericTab(String tabName)
	{
		return "//div[not(contains(@class,'hidden-offsets'))][contains(@class,'defaultBackground')]//span[text()='"+tabName+"']";
		//return "//span[text()='"+tabName+"']";
	}
	
	
    //For verifying the TM Selected Symbol
	public final String tso_currentproject_projectTM_selectedCheck(int rowNum)
	{
		return "//table[contains(@id,'treeview')]["+rowNum+"]//td[2]/div";
	}
	//For Verifying the priority of the TM
	public final String tso_currentproject_projectTM_priority(int rowNum, String priority)
	{
		return "//table[contains(@id,'treeview')]["+rowNum+"]//td//div[contains(text(),'"+priority+"')]";
	} 
	//For verifying the TM Type
	public final String tso_currentproject_projectTM_tmType(int rowNum, String tmType)
	{
		return "//table[contains(@id,'treeview')]["+rowNum+"]//td//div[contains(text(),'"+tmType+"')]";
	} 
	//For Verifying the Source file name
	public final String tso_currentproject_SourcefileName(String fileName)
	{
		return "//table[contains(@id,'treeview')][2]//td//span[contains(text(),'"+fileName+"')]";
	}
	
	//For checking the status
	public final String tso_currentproject_projectfiles_sourceFile_status(int rowNum, String fileName,String status  )
	{
		return "//table[contains(@id,'view')]["+rowNum+"]//tr[//td//span[contains(text(),'"+fileName+"')]]//td//div[contains(text(),'"+status+"')]";
	} 
	public final String tso_dashboard_transStudio4Tab_currentproject_projectTM_readOnlycol="//span[contains(text(),'Read-only')]";
	
	//TODO NEED TO BE REPLACED TEMPORARY FIXED
	public final String tso_dashboard_transStudioTab="//div[contains(@class,'defaultBackground')][not(contains(@class,'hidden-offsets'))]//span[contains(text(),'File')]";//"//div[contains(@id,'panel') and contains(@class,'gs4tr_Editor_suspend_selection')][not(contains(@class,'hidden-offsets'))]//span[contains(@id,'switchbutton')]//span[contains(text(),'TransStudio 5 Online')]";//"//div[contains(@class,'gs4tr_Editor_suspend_selection') and contains(@id,'panel')][not(contains(@style,'display: none;'))]//span[contains(@id,'switchbutton')]//span[contains(text(),'TransStudio 4 Online')]";	
	
	public final String tso_dashboard_transStudio4Tab_exitTSo_button="//div[not(contains(@class,'hidden-offsets')) and contains(@class,'defaultBackground')]//a[contains(@class,'exitBtn')]//span[contains(@class,'btn-inner')]";//"//div[contains(@id,'actionmenuprototype')][contains(@aria-hidden,'false')]//span[contains(text(),'Exit TransStudio 5 Online')]";//"//div[contains(@id,'actionmenuprototype')][contains(@aria-hidden,'false')]//span[contains(text(),'Exit TransStudio 4 Online')]/following-sibling::div";//"//div[contains(@id,'actionmenuprototype') and contains(@class,'x-box-target')]//span[contains(text(),'Exit TransStudio 4 Online')]/following-sibling::div";
	public final String tso_dashboard_transStudio4Tab_currentProject_button="//a//span[contains(@class,'projectList')]";//"//div[contains(@id,'actionmenu')]//span[contains(text(),'Current Project')]/following-sibling::div";
	
	public final String tso_dashboard_transStudio4Tab_ProjectFiles_button="//span[contains(text(),'Project Files')]";
	public final String tso_dashboard_transStudio4Tab_projectTM_tab="//span[contains(text(),'Project TM')]";
	public final String tso_dashboard_transStudio4Tab_projectTerminology_tab="//span[contains(text(),'Project Terminology')]";
	public final String tso_dashboard_transStudio4Tab_referenceFiles_tab="//span[contains(text(),'Reference Files')]";
	public final String tso_current_project_referenceFiles_tab_Filename_input="//input[contains(@id,'textfield')]";
	
	public final String tso_currentproject_ClearFilter_icon="//div[@data-qtip='Clear filters']";
	public final String tso_currentproject_SortASC_DESC_icon="//div[@data-qtip='Sort ASC/DESC']";
	public final String tso_currentproject_SortMenu_icon="//div[@data-qtip='Sort menu']";
	
	//Select Sort Menu Options
	public final String tso_currentproject_projecttm_SortMenu(String SelectType)
	{
	return "//div[contains(@class,'menu-item')]//a//span[contains(text(),'"+SelectType+"')]";
	}
	
	
	//For checking current project Non Bold & bold
	public final String tsr_dashboard_transStudio4Tab_currentProject_button_X() throws Exception{
		if(BrowserFactory.SystemEngine().verifyElementPresent("//a[contains(@class,'focus')]//div[contains(@class,'currentproject')]",5)==true){
			System.out.println("BOLD");
		return "//a[contains(@class,'focus')]//div[contains(@class,'currentproject')]";
		}else{
			System.out.println("NON-BOLD");
		return "//a[not(contains(@class,'focus'))]//div[contains(@class,'currentproject')]";	
		}
	}
	
	//For Checking the bold source file name
			public final String tso_currentproject_projectfile_Sourcefile_BOLD(int rownumber,String fileName)
		{
			return "//table[contains(@id,'view')]['"+rownumber+"']//td//span[contains(@class,'bold') and contains(text(),'"+fileName+"')]";
		}
	
	
	//For selecting the all the source file
		public final String tso_currentproject_projectfile_Sourcefile(String fileName)
		{
		return "//table[contains(@id,'treeview')]//td//span[contains(text(),'"+fileName+"')]";
		}
		
		public final String tso_currentproject_projectfile_Demofile(String fileName)
		{
		return "//table[contains(@id,'view')]//td//span[contains(text(),'"+fileName+"')]";
		}
		
		
		public final String tso_currentproject_projectfile_SelectRow_Sourcefile(int RowNumber,String fileName)
		{
			return "//table[contains(@id,'view')]['"+RowNumber+"']//td//span[contains(text(),'"+fileName+"')]";
		}
		
	
	public final String tso_currentproject_projectfile_targetfile(String fileName)
	{
		return "//table[contains(@id,'view')]//td//span[contains(text(),'"+fileName+"')]";
	}

  //For Help 
	public final String tso_dashboard_transStudio4Tab_currentProject_help_button="//div[contains(@id,'panel')][not(contains(@class,'hidden-offsets'))][contains(@class,'gs4tr_Editor_suspend_selection')]//a//span[contains(text(),'Help')]";
	public final String tso_dashboard_transStudio4Tab_currentProject_AbouttransStudio4online_button="//a[contains(@class,'about')]//span[contains(text(),'About')]";
	public final String tso_dashboard_currentProject_help_Feedback_button="//a[contains(@class,'Feedback')]";

  //Check complete progress bar
	
	public final String tso_projectFiles_complete_progressbar(String percentage,int RowNumber)
	{
		return "//span[text()='Complete']//following::table[1]//following::tr["+RowNumber+"]//following::div[text()='"+percentage+"']";
	}	
		
	
	
	//Multiple Files
	public final String tso_projectFiles_translateFile="//div[contains(@gs4trname,'Project Files')]//span[contains(text(),'Translate')]";
	public final String tso_projectFiles_ReviewFile="//div[contains(@gs4trname,'Project Files')]//span[contains(text(),'Review')]";
	public final String tso_projectFiles_chainFiles="//div[contains(@gs4trname,'Project Files')]//span[contains(text(),'Chain')]";
	public final String tso_projectFiles_chainFiles_disabled="//div[contains(@gs4trname,'Project Files')]//a[contains(@aria-disabled,'true')]//span[contains(text(),'Chain')]";
	public final String tso_projectFiles_chaincolumn_diffrentiate="//div[contains(@id,'Editor')]//table[contains(@id,'tableview')]//td[contains(@class,'chainFilesIdCol')]";
	public final String tso_projectFiles_transcheckReport="//div[contains(@gs4trname,'Project Files')]//span[contains(@class,'transcheckProject')]";
	public final String tso_currentproject_transcheck = "//span[contains(@class,'link')][contains(text(),'Preferences > Transcheck')]";
	public final String tso_projectFiles_transcheckReport_disabledButton="//a[contains(@data-qtip,'Transcheck Report')][contains(@class,'disabled')]";
	public final String tso_projectFiles_switchPerspectiveEditorView="//div[contains(@id,'elementToScrollId')]//div[contains(@class,'perspectiveEditorSelected')]";
	public final String tso_projectFiles_switchPerspectiveCurrentProjectView="//div[contains(@id,'elementToScrollId')]//div[contains(@class,'perspectiveProject')]";
	public final String tso_projectFiles_RuntranscheckReportButton="//div[contains(@class,'toolbar')]//a//span[contains(text(),'Run Transcheck')]";
	public final String tso_projectFiles_SegmentChangesReportButton="//a[contains(@class,'ProjectSegmentChangesReport')]//span[contains(text(),'Segment Changes')]";
	public final String tso_projectFiles_SegmentChangesReport_ExportButton="//div[contains(@id,'segmentreport')]//div[contains(@class,'toolbar')]//a//span[contains(text(),'Export')]";
	
	
	public final String tso_Editorselect_translateFile(String filename)
	{
		return "//div[contains(@id,'multiplyfileeditor')]//a//span[contains(text(),'"+filename+"')]";
	}
	
	public final String tso_ChainFile_LockSegment_Status(int rownumber)
	{
		return "//div[contains(@id,'multiplyfileeditor')][contains(@class,'EditorComponent')]//div[contains(@aria-expanded,'true')]//table["+rownumber+"]//table[contains(@class,'StatusColumn')]//tr[2]//td[contains(@class,'StatusImgT')]";
	}
	
	public final String tso_ChainFile_Confirm_Unconfirm_Status(int rownumber)
	{
		return "//div[contains(@id,'multiplyfileeditor')][contains(@class,'EditorComponent')]//div[contains(@aria-expanded,'true')]//table["+rownumber+"]//table[contains(@class,'StatusColumn')]//tr//td[contains(@class,'unconfirm')]";
	}
	
	public final String tso_segmentid_tooltip_filename(int rownumber, String filename)
	{
		return "//div[contains(@id,'Editor')]//table['"+rownumber+"']//td[contains(@data-qtip,'"+filename+"')]";
	}
	
	//For selecting the checkbox under the Transcheck report 	
	public final String tso_projectFiles_transcheckReport_selectDeselectall_chexkbox_options(String optionlabel)
	{
		return "//div[contains(@id,'checkbox')]//span[following-sibling::label[contains(text(),'"+optionlabel+"')]]";
	}
	
	public final String tso_projectFiles_transcheckReport_selectDeselectall_chexkbox_options_checked(String optionlabel)
	{
		return "//div[contains(@id,'checkbox')][contains(@class,'checked')]//span[following-sibling::label[contains(text(),'"+optionlabel+"')]]";
	}
	
	//For Verifying the opened file tab name under Translation tab in TXLF editor
	public final String tso_translationtab_sourcefileName_tab(String FileName)
	{
		return "//div[contains(@id,'multiplyfileeditor')]//span[contains(text(),'"+FileName+"')]";
	}
	
	
	
	public final String tso_projectFiles_file(String partialFileName)
	{
		return "//table[contains(@id,'treeview')]//tr//span[contains(text(),'"+partialFileName+"')]";
	}
	
	public final String tso_projectFiles_file_with_Details(String partialFileName, String details)
	{
		return "//table[contains(@id,'treeview')]//tr//td//span[contains(text(),'"+partialFileName+"')]/../../../..//div[contains(text(),'"+details+"')]";
	}
	public final String tso_dashboard_FileNotPreocessed_Checkbox_preselected_checkbox="//table[contains(@class,'selected')]//td[div[contains(text(),'test')]]/preceding-sibling::td//div/div[contains(@class,'row-checker')]";
	
	
	//TM LIST
	public final String tso_translationTab_TMList_TMName(String tmName)
	{
		return "//div[contains(@id,'tmlist')]//table//td//div[contains(text(),'"+tmName+"')]";
	}
	
	public final String tso_translationTab_TMList_column_checked(int columnNumber)
	{
		return "//div[contains(@id,'tmlist')]//table//td["+columnNumber+"]//div[contains(@class,'checked')]";
	}
	
	public final String tso_translationTab_TMList_column_disabled(int columnNumber)
	{
		return "//div[contains(@id,'tmlist')]//table//td["+columnNumber+"][contains(@class,'disabled')]";
	}
	
	
	public final String tso_translationTab_SourceFileTab_closeButton="//div[contains(@id,'toolbar')]//a//span[contains(text(),'Close')]";
	public final String tso_translationTab_TMList_closeButton="//div[contains(@id,'toolbar')]//a//span[contains(text(),'Close')]";
	
	//File contians empty segments locators
	public final String File_Tab_File_Contains_Empty_target_dialogue_Box="//div[contains(@id,'header-title')][text()='File contains empty target']";

	public final String File_Tab_File_Contains_Empty_target_dialogue_Box_OK_btn="//div[contains(@id,'fileRestrictions')]//div[contains(@id,'toolbar')]//a//span[text()='OK']";

	//Multi editor *(asteric) marked file
	public final String MultiEditor_File_name_with_asteric_sign(String Filename){
		return "//div[contains(@id,'multiplyfileeditor')]//div[contains(@id,'tabbar')]//a//span[contains(text(),'*"+Filename+"')]";
	}
	
	public final String MultiEditor_File_name(String Filename){
		return "//div[contains(@id,'multiplyfileeditor')]//div[contains(@id,'tabbar')]//a//span[contains(text(),'"+Filename+"')]";
	}
	
	
	//Captive TSO locators
	public final String tso_username_watermark ="//div[contains(@class,'watermark')][contains(text(),'gla_common_user_translator')]";
	
	
	//Table Filter
	
	public final String tso_tableFilter_dropDown_trigger ="//div[contains(@name,'ContentFilter')]//div[contains(@class,'arrow-trigger')]";
	public final String tso_Source_dropDown_trigger="//div[contains(@name,'appSearch')]//div[contains(@class,'arrow-trigger')]";
	public final String tso_clear_filter_x="//a[contains(@data-qtip,'Reset Toolbar Fields')]";

	public final String tso_tableFilter_searchSegment_inputBox ="//input[contains(@name,'Search')]";
	public final String tso_tableFilter_filterAction_button ="//a[contains(@data-qtip,'Filter Action')]//span[contains(@class,'filterButton')]";
	public final String tso_tableFilter_matchCase_checkbox_checked="//div[contains(@name,'CaseSensitive')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	public final String tso_tableFilter_matchCase_checkbox="//div[contains(@name,'CaseSensitive')]//span[contains(@class,'checkbox')]";
	public final String tso_tableFilter_Regex_checkbox ="//input[contains(@name,'Regex')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_tableFilter_Regex_checkbox_checked ="//input[contains(@name,'Regex')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	
	public final String tso_translationtab_Filter_inputbox="//div[contains(@name,'appFilter')]//input[contains(@name,'appFilter')]";
	
	
	
	public final String tso_tableFilter_filterSearchOption_select(String filterSearchOption){
		return "//div[contains(@name,'ContentFilter-boundlist')]//li[contains(text(),'"+filterSearchOption+"')]";
	}

	
	//SORT
	public final String tso_sort_dropDown_trigger ="//div[contains(@name,'Sort')]//div[contains(@class,'arrow-trigger')]";
	public final String tso_sort_dropDown_options(String sortOption){
		return "//div[contains(@name,'Sort-boundlist')]//li[contains(text(),'"+sortOption+"')]";
	}
	
	//Warning in Prefrences
	public final String tso_editTab_preferences_warnings_ShowTrancheckUnlockWarning_checkbox_checked ="//div[contains(@name,'ShowUnlockSegment')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_UneditedFuzzyMatch_checkbox_checked ="//div[contains(@name,'uneditedfuzzy')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_UneditedFuzzyMatch_checkbox ="//input[contains(@name,'uneditedfuzzy')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_TranscheckSegmenetswhileTranslating_checkbox ="//input[contains(@name,'appActivateTranscheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_Transcheck_TranscheckSegmenetswhileTranslating_checkbox_checked ="//input[contains(@name,'appActivateTranscheck')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tso_editTab_preferences_Transcheck_CopyAllSource_checkbox ="//input[contains(@name,'appShowCopyAllSource')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_CopyAllSource_checkbox_checked ="//input[contains(@name,'appShowCopyAllSource')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_EndOfDocument_checkbox_checked ="//input[contains(@name,'ShowEOF')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_EndOfDocument_checkbox ="//input[contains(@name,'ShowEOF')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String GoBackToFixIssue_Button = "//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span[text()='Go back to fix issue']";
	public final String Continue_Button = "//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span[text()='Continue']";
	public final String DoNotwarnMeAboutthisAnyMore_Button = "//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//div[contains(@name,'checkboxAsk')]";
	public final String DoNotwarnMeAboutthisAnyMore_Checkbox = "//div[contains(@name,'checkboxAsk')]//input[contains(@name,'checkboxAsk')][contains(@aria-checked,'false')]/following-sibling::span";
	public final String tso_editTab_preferences_Transcheck_RemoveSegmenettags_checkbox_checked ="//input[contains(@name,'RemoveSegmentTags')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_RemoveSegmenettags_checkbox ="//input[contains(@name,'RemoveSegmentTags')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_RemoveAlltags_checkbox_checked ="//input[contains(@name,'RemoveAllTags')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_RemoveAlltags_checkbox ="//input[contains(@name,'RemoveAllTags')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_tag_checkbox_checked ="//input[contains(@name,'tags')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_tag_checkbox ="//input[contains(@name,'tags')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_non_format_tag_checkbox_checked ="//div[contains(@name,'appNonFormatting')][contains(@id,'checkbox')][contains(@class,'checked')]";
	public final String tso_editTab_preferences_Transcheck_non_format_tag_checkbox ="//div[contains(@name,'appNonFormatting')][contains(@id,'checkbox')]";
	public final String tso_editTab_preferences_Transcheck_source_format_checkbox_checked ="//div[contains(@name,'appsSourceFormattingMissingInTarget')][contains(@id,'checkbox')][contains(@class,'checked')]";
	public final String tso_editTab_preferences_Transcheck_source_format_checkbox ="//div[contains(@name,'appsSourceFormattingMissingInTarget')][contains(@id,'checkbox')]";
	public final String tso_editTab_preferences_Transcheck_targetnot_insource_checkbox_checked ="//div[contains(@name,'appTargetFormattingMissingInSource')][contains(@id,'checkbox')][contains(@class,'checked')]";
	public final String tso_editTab_preferences_Transcheck_targetnot_insource_checkbox ="//div[contains(@name,'appTargetFormattingMissingInSource')][contains(@id,'checkbox')]";
	
	
	public final String tso_editTab_preferences_Transcheck_segmentlength_checkbox_checked ="//input[contains(@name,'segmentlength')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_segmentlength_checkbox ="//input[contains(@name,'segmentlength')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	
	public final String tso_editTab_preferences_Transcheck_segmentlength_strictlength_checkbox_checked ="//div[contains(@name,'appStrictChar')][contains(@id,'checkbox')][contains(@class,'checked')]";
	public final String tso_editTab_preferences_Transcheck_segmentlength_strictlength_checkbox ="//div[contains(@name,'appStrictChar')][contains(@id,'checkbox')]";
	public final String tso_editTab_preferences_Transcheck_segmentlength_charexpression_checkbox_checked ="//div[contains(@name,'appCharExpansion')][contains(@id,'checkbox')][contains(@class,'checked')]";
	public final String tso_editTab_preferences_Transcheck_segmentlength_charexpression_checkbox ="//div[contains(@name,'appCharExpansion')][contains(@id,'checkbox')]";
	public final String tso_editTab_preferences_Transcheck_segmentlength_wordexpansion_checkbox_checked ="//div[contains(@name,'appWordExpansion')][contains(@id,'checkbox')][contains(@class,'checked')]";
	public final String tso_editTab_preferences_Transcheck_segmentlength_wordexpansion_checkbox ="//div[contains(@name,'appWordExpansion')][contains(@id,'checkbox')]";
	
	//Tags & formatting
	public final String tso_editTab_preferences_tags ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Tags')]";
	public final String tso_editTab_Tags_RemoveIncompleteTagPairs ="//input[@name='deleteBadTagsAlways'][@aria-checked='true']";
	public final String tso_editTab_Tags_RemoveIncompleteTagPairs_Click ="//input[@name='deleteBadTagsAlways'][@aria-checked='true']/following-sibling::span";
	public final String tso_editTab_preferences_Tags_showsupportedtextformating_checkbox_checked ="//div[contains(@name,'placeableFormatting')]//input[contains(@aria-checked,'true')][contains(@name,'placeableFormatting')]";
	public final String tso_editTab_preferences_Tags_showsupportedtextformating_checkbox ="//div[contains(@name,'placeableFormatting')]//input[contains(@aria-checked,'false')][contains(@name,'placeableFormatting')]/following-sibling::span";//div[contains(@name,'placeableFormatting')]//input[contains(@aria-checked,'false')][contains(@name,'placeableFormatting')]";
	public final String tso_editTab_preferences_Tags_showformatingTags_checkbox_checked ="//div[contains(@name,'placeableNonFormatting')]//input[contains(@aria-checked,'true')][contains(@name,'placeableNonFormatting')]";
	public final String tso_editTab_preferences_Tags_showformatingTags_checkbox ="//div[contains(@name,'placeableNonFormatting')]//input[contains(@aria-checked,'false')][contains(@name,'placeableNonFormatting')]/following-sibling::span";
	public final String tso_editTab_preferences_Tags_RemoveIncompletetagspairs_checkbox_checked ="//input[contains(@name,'deleteBadTagsAlways')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Tags_RemoveIncompletetagspairs_checkbox ="//input[contains(@name,'deleteBadTagsAlways')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Tags_Applysource_segment_checkbox_checked ="//input[contains(@name,'applyWholeSegmentFormating')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Tags_Applysource_segment_checkbox ="//input[contains(@name,'applyWholeSegmentFormating')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Tags_TagsNamingFull_checkbox_checked ="//div[contains(@name,'placeableFullName')]//input[contains(@aria-checked,'true')]/following-sibling::";
	public final String tso_editTab_preferences_Tags_TagsNamingFull_checkbox ="//div[contains(@name,'placeableFullName')]//input[contains(@aria-checked,'false')]/following-sibling::span";
	public final String tso_editTab_preferences_Tags_TagsNamingShort_checkbox_checked ="//div[contains(@name,'placeableShortName')]//input[contains(@aria-checked,'true')]/following-sibling::";
	public final String tso_editTab_preferences_Tags_TagsNamingShort_checkbox ="//div[contains(@name,'placeableShortName')]//input[contains(@aria-checked,'false')]/following-sibling::span";
	public final String tso_editTab_preferences_Tags_TagsNamingNumbered_checkbox_checked ="//div[contains(@name,'placeableNumbering')]//input[contains(@aria-checked,'true')]/following-sibling::span";
	public final String tso_editTab_preferences_Tags_TagsNamingNumbered_checkbox ="//div[contains(@name,'placeableNumbering')]//input[contains(@aria-checked,'false')]/following-sibling::span";
	
	
	
	public final String tso_editTab_preferences_Transcheck_RemoveAllTarget_checkbox_checked ="//input[contains(@name,'RemoveAllTarget')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_RemoveAllTarget_checkbox ="//input[contains(@name,'RemoveAllTarget')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	
	public final String tso_editTab_preferences_Transcheck_ShowDuplicateShortcut_checkbox_checked ="//input[contains(@name,'ShowDuplicateShortcut')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tso_editTab_preferences_Transcheck_ShowDuplicateShortcut_checkbox ="//input[contains(@name,'ShowDuplicateShortcut')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	
	public final String tso_editTab_preferences_Transcheck_min_segmentchar ="//div[contains(@name,'appStrictCharMin')]//input[contains(@id,'Percentage')]";
	public final String tso_editTab_preferences_Transcheck_max_segmentchar ="//div[contains(@name,'appStrictCharMax')]//input[contains(@id,'Percentage')]";
	public final String tso_editTab_preferences_Transcheck_min_charexpression ="//div[contains(@name,'appCharExpansionMin')]//input[contains(@id,'Percentage')]";
	public final String tso_editTab_preferences_Transcheck_max_charexpression ="//div[contains(@name,'appCharExpansionMax')]//input[contains(@id,'Percentage')]";
	public final String tso_editTab_preferences_Transcheck_min_wordexpansion ="//div[contains(@name,'appWordExpansionMin')]//input[contains(@id,'Percentage')]";
	public final String tso_editTab_preferences_Transcheck_max_wordexpansion ="//div[contains(@name,'appWordExpansionMax')]//input[contains(@id,'Percentage')]";
	
	
	public final String tso_SelectSegmentHighligted(int Partno){
		return "//table[contains(@class,'grid')]["+Partno+"]//tr//td[3]//iframe";//"//table[contains(@id,'tableview')]["+Partno+"]//td[contains(@style,'background-color: rgb(255, 209, 233)')]";
		}
	
	public final String tso_SelectSegmentHighligted_withColour(int Partno, String colourcode){
		return "//table[contains(@id,'tableview')]["+Partno+"]//td[contains(@style,'background-color: rgb("+colourcode+")')]";
		}
	
	public final String tso_currentproject_projectfiles_FileExpandandCollapse_icon(String Foldername)
	{
		return "//table[contains(@id,'treeview')]//tr//span[contains(text(),'"+Foldername+"')]/preceding-sibling::div[contains(@class,'expander')]";
	}
	public final String tso_currentProject_searchFile_inputBox ="//input[contains(@name,'input')]";
	
	public final String tso_ProjectTM_TranslationMemory_inputBox ="//input[contains(@placeholder,'Translation Memory')]";
	
	public final String tso_CurrentProject_RefrencFile_Search_inputBox ="//input[contains(@placeholder,'File Name')]";
	
	
	//General Button Verification below Tab
	public final String tso_currentproject_ButtonAlignment_Verify(String Button1,String Button2){
		return "//td//a[contains(@class,'"+Button1+"')]/../following-sibling::td//a[contains(@class,'"+Button2+"')]";
	}
	
	public final String tso_dashboard_file_LivePreview_Frame="//div[contains(@class,'defaultBackground')]//div[contains(@class,'cat-preview')]//div[@data-ref='body']//div[contains(@class,'box-target')]//iframe";
//	public final String tso_dashboard_file_LivePreview_TextFrame="//html//body"; 
	public final String tso_dashboard_file_LivePreview_TextFrame (String Text){
		return "//div//a//span[contains(text(),'"+Text+"')]";
	}
	
	public final String tso_whitespace_symbol_iframe () throws Exception{
		/*if(Verify.action().verifyElementPresent("//html//body//div[contains(@style,'font-family:WscFont, Arial')]",10)==true){
		return"//html//body//div[contains(@style,'font-family:WscFont, Arial')]";	
		
		}else{
				return "//html//body//div[contains(@style,'font-family:WscFont,Arial;')]";
			}*/
		if(BrowserFactory.SystemEngine().verifyElementPresent("//html//body//div[contains(@style,'font-family:WscFont, Arial')]",10)==true){
			return"//html//body//div[contains(@style,'font-family:WscFont, Arial')]";	
			
			}
		else if (BrowserFactory.SystemEngine().verifyElementPresent("//html//body//div[contains(@style,'WscFont, SpaceFont')]",10)==true) {
			return"//html//body//div[contains(@style,'WscFont, SpaceFont')]";	
		}
		else{
					return "//html//body//div[contains(@style,'font-family:WscFont,Arial;')]";
				}
		}
	
	

}
