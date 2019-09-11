package org.qa.locators;

import org.gs4tr.qa.utility.BrowserFactory;

public class TSR_main_Locators {

	private static TSR_main_Locators ue;
	public static synchronized TSR_main_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new TSR_main_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new TSR_main_Locators();
		}
		return ue;
	}
	
	
	// Toolbar
	public final String tsr_hideToolbar_button_hide = "//div[contains(@class,'x-tool-img x-tool-up')]";
	public final String tsr_hideToolbar_button_unhide = "//div[contains(@class,'x-tool-img x-tool-down')]";
	
	public final String tsr_reload_error_message="//b[text()='Error!']/following::p[contains(text(),'You Reloaded the page which caused the termination of the connection to the file')]";
	public final String tsr_no_results_message="//div[contains(@id,'headercontainer')]/following::div[1]/div/div[@class='x-grid-empty']"; //"(//div[contains(@class,'empty')]/div[text()='No results'])[1]";

	//FOLDER OF TSR
	public final String tsr_dashboard_fileButton="//div[contains(@class,' gs4tr_Editor_suspend_selection')]//a//span[text()='File']";//"//div[contains(@class,' gs4tr_Editor_suspend_selection')]//a//span[text()='File']";
	public final String tsr_dashboard_editButton="//div[contains(@id,'tabbar')]//a//span[text()='Edit']";
	public final String tsr_dashboard_translationTabButton="//div[contains(@class,' gs4tr_Editor_suspend_selection')]//a//span[text()='Translation']";
	public final String mainTabs_segment = "//span[text()='Segment']";//div[contains(@id,'tabbar')]//a[not(contains(@style,'display: none;'))]//span[text()='Segment']";
	public final String translationTab_LeverageButton ="//a[contains(@class,'leverageaction')]//span[contains(text(),'Leverage')]";
	public final String tsr_dashboard_file_showInstructionsButton="//table[contains(@class,'x-table-layout')]//span[text()='Instructions']";
	public final String tsr_fileTab_Download_ShowInstructions_WindowCloseX="//div[contains(@id,'window')]//div[contains(@data-qtip,'Close')]";
	public final String tsr_dashboard_reviewTabButton="//div[contains(@id,'catactionbar')]//span[text()='Review']";
	public final String tsr_dashboard_file_closeButton="//table[contains(@class,'x-table-layout')]//span[text()='Close']";
	public final String tsr_dashboard_file_closeAllButton="//span[text()='Close All']";
	public final String tsr_dahboard_fileTab_recalculate_progress = "//span[text()='Recalculate']";
	public final String tsr_dashboard_file_recalculateFileButton="//span[contains(@class,'recalculate')]";
	public final String tsr_dashboard_file_saveButton="//table[contains(@class,'x-table-layout')]//span[text()='Save']";
	public final String tsr_dashboard_file_completeButton="//div[contains(@gs4trname,'File')]//a[contains(@class,'FinishReview')]//span[contains(text(),'Finish')]";//"//table[contains(@class,'x-table-layout')]//span[text()='Complete']";
	public final String tsr_dashboard_file_completeAllButton="//div[contains(@gs4trname,'File')]//a[contains(@class,'FinishReview')]//span[contains(text(),'Finish')]";//"//div[contains(@gs4trname,'File')]//a[contains(@class,'CompleteAll')]//span[contains(text(),'Complete')]";
	public final String fileTab_complete_Yes_Button="//div[contains(@id,'complete')]//a//span[text()='Yes']";
	public final String tsr_dashboard_review_gradingAndScoringButton="//span[contains(@id,'catActionButtonPrototype')][contains(text(),'Comments')]";//"//a[contains(@class,'catactiongradeandscore')]//span[contains(text(),'Comments')]";//"//a[contains(@class,'catactiongradeandscore')]//span[contains(text(),'Grade')]";//"//a[contains(@id,'catactiongradeandscore')]";
	public final String tsr_review_commentAndRating_column="//div[contains(@id,'multiplyfileeditor')]//div[contains(@id,'Commentsandratings')]//span[contains(text(),'Comments & Ratings')]";
	public final String tsr_dashboard_file_showInstructions_instructionWindow_instructionTab="//div[contains(@class,'x-window-closable')]//div[contains(@id,'tabbar')]//span[text()='Instructions']";
	public final String tsr_dashboard_file_showInstructions_instructionWindow_backgroundInstructionTab="//div[contains(@class,'x-window-closable')]//div[contains(@id,'tabbar')]//span[text()='Background Instructions']";
	public final String tsr_dashboard_file_showInstructions_instructionWindow_OKButton="//div[contains(@class,'x-toolbar-footer')]//a//span[text()='OK']";
	public final String tsr_dashboard_file_downloadReferenceFilesButton="//div[contains(@class,'x-tabpanel-child')]//div//span[text()='Reference Files']";//"//div[contains(@class,'x-tabpanel-child')]//div//span[text()='Reference Files']";
	public final String tsr_dashboard_file_disabled_downloadReferenceFilesButton="//div[contains(@class,'x-tabpanel-child')]//a[contains(@class,'x-btn-disabled')]//span[text()='Reference Files']";
	public final String tsr_dashboard_file_disabled_downloadSourceFilesButton="//div[contains(@class,'x-tabpanel-child')]//a[contains(@class,'x-btn-disabled')]//span[text()='Source Files']";
	public final String tsr_dashboard_file_disabled_showInstructionsButton="//table[contains(@class,'x-table-layout')]//a[contains(@class,'x-item-disabled')]//span[text()='Instructions']";
	public final String tsr_dashboard_file_downloadSourceFilesButton="//div[contains(@class,'x-tabpanel-child')]//div//span[text()='Source Files']";
	public final String tsr_dashboard_file_HTMLPreviewButton_Dropdown="//a[contains(@class,'ActionPreview')]//span[contains(text(),'Preview')]";
	public final String tsr_dashboard_file_PreviewButton="//a[contains(@class,'ActionPreview')]//span[contains(text(),'Preview')]";
	public final String tsr_dashboard_file_PreviewButton_dropdown="//a[contains(@class,'ActionPreview')]//span[contains(@id,'arrow')]";
	public final String tsr_dashboard_file_downloadPreviewButton="//a[contains(@class,'fileinword')]//span[contains(text(),'Get MS Word')]";//"//div[contains(@class,'x-tabpanel-child')]//div//span[contains(@id,'downloadpreview')]";//"//div[contains(@class,'x-tabpanel-child')]//div//span[text()='Preview']";
	public final String tsr_dashboard_file_GetMSWordTable="//div[contains(@class,'MSWordTable')]//span[contains(text(),'Get MS Word Table') and not (contains(text(),'Options'))]";
	public final String tsr_dashboard_file_downloadPreviewButton_disabled="//a[contains(@class,'preview') and contains(@class,'disabled')]//span[contains(text(),'Get MS Word')]";//"//div[contains(@class,'x-tabpanel-child')]//div//a[contains(@class,'x-btn-disabled')]//span[contains(@id,'downloadpreview')]";
	public final String tsr_currentProject_getBilingual_disabledButton="//a[contains(@class,'CommonSharedBilingualExport') and contains(@class,'disabled')]";
	public final String tsr_dashboard_file_downloadReferenceFiles_OKButton="//div[contains(@id,'DownloadReferencesFiles')]//a//span[text()='OK']";
	public final String tsr_dashboard_file_downloadReferenceFiles_closeButton="//div[contains(@id,'DownloadReferencesFiles')]//a//span[text()='Close']";
	public final String tsr_dashboard_file_downloadSourceFiles_OKButton="//div[contains(@id,'DownloadSourceFiles')]//a//span[text()='OK']";
	public final String tsr_dashboard_file_downloadSourceFiles_closeButton="//div[contains(@id,'DownloadSourceFiles')]//a//span[text()='Close']";
	public final String tsr_dashboard_reset_filterButton="//a[@data-qtip='Reset Toolbar Fields']";
	public final String tsr_fileTab_Synchronize_Preview_Disabled_Button="//a[contains(@class,'Preview') and contains(@class,'disabled')]";
	
	//	public final String translationTab_copySourceButton = "//a[contains(@id,'catcopysourceaction')]";
	public final String messageWindow_Ok_button="//a[contains(@id,'button')]/span/span/span[text()='OK']";
	public final String WarningDialogueWindow_Close_button="//div[contains(@id,'warningdialog')]/following-sibling::div[contains(@id,'toolbar')]//a//span[text()='Close']";//div[contains(@id,'warningdialog')]//div[contains(@id,'toolbar')]//a//span[text()='Close']/following-sibling::span";
	public final String saveChanges_yesButton = "//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span[text()='Yes']";//"//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span[text()='Yes']";//div[contains(@id,'window')]//span[text()='Yes']";
	public final String saveChanges_MandatoryCR_OKButton ="//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span[text()='OK']";
	public final String saveChanges_deleteButton = "//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span[text()='Delete']";
	public final String saveChanges_NoButton = "//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span[text()='No']";
	public final String tsr_complete_warningMessage_saveChanges_yesButton ="//div[contains(@id,'complete')]//a//span[text()='Yes']";
	public final String tsr_review_gradingScoring_addButton ="//div[contains(@id,'gradeandscore')]//span[text()='Add']";
	public final String tsr_review_gradingScoring_addDropDownButton="//div[contains(@id,'gs4trvalidationgrid')]//table[contains(@class,'x-form-trigger-wrap')]//td//div[contains(@class,'x-form-arrow-trigger')]";
	public final String tsr_review_Scoring_DropDownButton="//div[contains(@id,'gs4trvalidationgrid')]//table[contains(@name,'scoreDisplay')]//td//div[contains(@class,'x-form-arrow-trigger')]";
	public final String tsr_review_gradingScoring_saveButton="//div[contains(@id,'gradeandscore')]//div[contains(@class,'x-toolbar-footer')]//a//span[text()='Save']";
	public final String tsr_review_gradingScoring_returnToSegmentButton="//div[contains(@id,'gradeandscore')]//div[contains(@class,'x-toolbar-footer')]//a//span[contains(text(),'Return to Segment')]";
	public final String tsr_file_completeReview_confirmationMessage="//div[contains(@id,'completetopddialog')]//div//label[text()='Do you want to complete your work?']";
	public final String tsr_FileTabComplete_NoButton ="//div[contains(@id,'complete')]//a//span[text()='No']";
	public final String tsr_FileTabComplete_YesButton ="//div[contains(@id,'complete')]//a//span[text()='Yes']";
	public final String tsr_review_gradingScoring_windowTitle="//div[contains(@class,'x-window-header')]//div[text()='Comments & Ratings']";//"//div[contains(@class,'x-window-header')]//div[text()='Comments and Rating']";//"//div[contains(@class,'x-window-header')]//div[text()='Grading and Scoring']";//"//div[contains(@class,'x-window-header')]//span[text()='Grading and Scoring']";
	public final String tsr_review_gradingScoring_window_gradeAndScore_label="//div[contains(@id,'window')]//div[contains(text(),'Comments & Ratings')]";//"//div[contains(@id,'gradeandscore')]//label[contains(text(),'Grade and Score')]";
	public final String WarningDialogueWindow_Continue_button="//div[contains(@id,'warningdialog')]//span[contains(text(),'Continue')]/following-sibling::span";
	public final String tsr_fileTab_downloadReferenceFile_headerCheckbox ="//div[contains(@id,'DownloadReferencesFiles')]//div[contains(@name,'downloadFilesGrid')]//div[contains(@class,'column-header')]//span[contains(@class,'checkheader')]";
	public final String tsr_fileTab_downloadReferenceFile_headerCheckbox_checked = "//div[contains(@id,'DownloadReference')]//div[contains(@id,'headercontainer')]//span[contains(@class,'checkcolumn-checked')]";
	public final String tsr_fileTab_downloadReferenceFile_downloadButton="//div[contains(@id,'DownloadReference')]//div[contains(@id,'toolbar')]//span[contains(text(),'Download')]";
	public final String tsr_fileTab_Download_referenceFiles_Disabled_Button="//a[contains(@class,'downloadreferencefiles') and contains(@class,'disabled')]";
	public final String tsr_fileTab_Download_SourceFiles_Disabled_Button="//a[contains(@class,'DownloadSourceFiles') and contains(@class,'disabled')]";
	public final String tsr_fileTab_downloadSourceFile_headerCheckbox ="//div[contains(@id,'DownloadSourceFiles')]//div[contains(@id,'headercontainer')]//span[contains(@class,'checkheader')]";
	public final String tsr_fileTab_downloadSourceFile_headerCheckbox_checked ="//div[contains(@id,'DownloadSourceFiles')]//div[contains(@id,'headercontainer')]//span[contains(@class,'checkcolumn-checked')]";
	public final String tsr_fileTab_downloadSourceFile_downloadButton="//div[contains(@id,'DownloadSourceFiles')]//div[contains(@id,'toolbar')]//span[contains(text(),'Download')]";
	public final String translationTab_copySourceButton_arrowButton ="//a[contains(@class,'copysourceaction')]/span/following-sibling::span[contains(@class,'btn-arrow')]";
	public final String translationTab_copySourceButton_disabled ="//a[contains(@class,'catcopysourceaction')][contains(@class,'disabled')]//span[contains(text(),'Copy')]";
	public final String translationTab_copySourceButton_arrowButton_copySourceButton ="//div[contains(@id,'actionmenuprototype')]//a//span[contains(text(),'Copy Source')]";//"//div[contains(@class,'CopySource')]//span[contains(text(),'Copy Source')]";
	public final String translationTab_copySourceButton_arrowButton_copySourceTextButton ="//div[contains(@id,'actionmenuprototype')]//a//span[contains(text(),'Copy Source Text')]";//"//div[contains(@class,'CopySource')]//span[contains(text(),'Copy Source Text')]";
	public final String translationTab_commitButton ="//a[contains(@class,'commit')]//span[contains(text(),'Commit')]";
	public final String tsr_translationTab_CommitAll_button ="//a[contains(@class,'comitall')]//span[contains(text(),'Commit')]";
	public final String DisclaimerDialogueWindow_Return_TO_Translation_button="//div[contains(@id,'DisclaimerWarningDialog')][contains(@aria-hidden,'false')]//a[@tabindex='0']//span[contains(text(),'Translation')]";
	public final String WarningDialogueWindow_Return_TO_Translation_button="//div[contains(@class,'WarningDialog')][contains(@aria-hidden,'false')]//div//a//span[contains(text(),'Return to Translation')]";

	public final String tsr_goTosegment_input ="//div[contains(@id,'gotosegment')]//div[contains(@name,'SegmentNumber')]//div[contains(@id,'numberfield')]//input[contains(@name,'SegmentNumber')]";//div[contains(@class,'GoToSegment')]//div[contains(@name,'segmentNumber')]//input[contains(@id,'numberfield')]";
	public final String tsr_goTosegment_OkButton ="//div[contains(@class,'segment-GoTo')]//span[contains(text(),'OK')]";//"//span[contains(text(),'OK')]";
	public final String tsr_goTosegment_upvalue="//div[contains(@id,'gotosegment')]//div[contains(@name,'SegmentNumber')]//div[contains(@class,'spinner-up')]";
	public final String tsr_goTosegment_CancelButton ="//div[contains(@class,'segment-GoTo')]//span[contains(text(),'Cancel')]";
	public final String tsr_goTosegment_Errormsg ="//div[contains(text(),'Specified segment ID does not exist.')]";//span[contains(text(),'Specified segment ID does not exist.')]";
	public final String tsr_unlocksegment_warning ="//div[contains(@class,'dialogs-Messages')]//div[contains(text(),'You are about to unlock this segment. Are you sure you want to continue?')]";
	public final String Unsaved_data_detected_Ignorechanges ="//div[contains(@id,'messages')]//span[contains(text(),'Ignore changes')]";
	public final String Unsaved_data_detected_Recover ="//div[contains(@id,'messages')]//span[contains(text(),'Recover')]";
	public final String tso_prepare_MT_connection_message ="//div[text()='Preparing MT connections']";
	
	
	
	//Metadata
		public final String tsrtab_Metadata_Tab="//a//span[text()='Metadata']";
	
	//TM LOOKUP
	public final String tsrtab_TM_lookup_Tab="//a//span[text()='TM Lookup']";
	public final String tsrtab_TM_lookupTab_input="//div[contains(@id,'lookup')]//input[contains(@name,'searchBar')]";
	
	public final String tsrtab_TM_lookupTab_input_Show_WhiteSpace_charachter="//div[contains(@id,'lookup')]//input[contains(@name,'searchBar')][not(contains(@style,'font-family:WscFont, Arial'))]";
	
	public final String tsrtab_TM_lookupTab_findSource_button="//div[contains(@id,'tmlookup')]//div//a//span[contains(@class,'x-btn-inner')][contains(text(),'Find Source')]";
	public final String tsrtab_TM_lookupTab_findTarget_button="//div[contains(@id,'tmlookup')]//div//a//span[contains(@class,'x-btn-inner')][contains(text(),'Find Target')]";
	public final String tsrtab_TM_lookup_Tab_clear_btn="//div[contains(@id,'tmlookup')]//div//a//span[contains(@class,'x-btn-inner')][contains(text(),'Clear')]";
	public final String tsrtab_TM_lookup_Target_coloumn_box="//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//td[3]//div";
	//TM Lookup
	public final String tsrtab_TM_lookup_tab_column_source="//div[contains(@name,'grid')]//div[contains(@id,'headercontainer')]//span[contains(text(),'Source')]";
	public final String tsrtab_TM_lookup_Tab_More_Options_btn="//div[contains(@id,'tmlookup')]//div//a//span[contains(@class,'x-btn-inner')][contains(text(),'More Options')]";
	public final String tsrtab_TM_lookup_Tab_More_Options_Visible="//div[contains(@class,'menu-icon-separator')]//following-sibling::div[2]";
	public final String tsrtab_TM_lookup_tab_column_source_drop_down="//div[contains(@name,'grid')]//div[contains(@id,'gridcolumn')][contains(@class,'column-header-default')][2]//div[contains(@class,'column-header-trigger')]";//"//div[contains(@name,'grid')]//div[contains(@id,'gridcolumn')][contains(@class,'column-header-sort')]//div[contains(@class,'column-header-trigger')]";
	public final String tsrtab_TM_lookup_tab_column_source_drop_down_cloumns="//span[contains(text(),'Columns')]/following-sibling::div[contains(@id,'arrow')][contains(@class ,'arrow')]";//div[contains(@id,'menuitem')]//a//span[contains(text(),'Columns')]";
	
	public final String tsr_tab_lookupTab_dropDown_columns_options_checked(String optionName){
		return "//div[contains(@id,'menu')]//div[contains(@id,'menucheckitem')][contains(@class,'item-checked')]//a//span[contains(text(),'"+optionName+"')]";
	}
	
	public final String tsr_tab_lookupTab_dropDown_columns_options(String optionName){
		return "//div[contains(@id,'menu')]//div[contains(@id,'menucheckitem')]//a//span[contains(text(),'"+optionName+"')]";
	}
	public final String tsr_tmLookup_Tab_details_InformationIcon(int divNo ,String segment)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//td["+divNo+"]//div//div[contains(text(),'"+segment+"')]";
	}
	
	public final String tsr_tmLookupInfo_Tab_details_ScoreBreakdown(int tableno,int score ,String PenaltyName){
	return "//div[contains(@id,'TmLookUpInfoDialog')]//div[contains(@name,'gridScore')]//table["+tableno+"]//td[//div[text()='"+PenaltyName+"']]/following-sibling::td//div[text()='"+score+"']";
	}
	
	public final String tsr_tmLookupInfo_Tab_OKButton="//div[contains(@id,'TmLookUpInfoDialog')]//div[contains(@class,'dialogs-footer')]//a[@role='button']//span[text()='OK']";
	
	public final String tsr_Notes_Tab_SelectedNote(int rowNo)
	{
		return "//div[contains(@id,'NotesViewGrid')]//table[contains(@class,'grid')]["+rowNo+"]//tr[contains(@aria-selected,'true')]";
	}
	
	//NOTES
	public final String tsr_dashboard_NotesTab="//a//span[text()='Notes']";
	public final String tsr_notesTab_AddButton_disabled="//a[contains(@id,'ActionButton') and contains(@class,'disabled')]//span[text()='Add Note']";//"//a[contains(@id,'addnote') and contains(@class,'disabled')]//span[text()='Add']";
	public final String tsr_notesTab_EditButton_disabled="//div[contains(@class,'SouthAdditional')]//a[contains(@id,'ActionButton') and contains(@class,'disabled')]//span[text()='Edit Note']";//"//a[contains(@id,'editnote') and contains(@class,'disabled')]//span[text()='Edit']";
	public final String tsr_notesTab_DeleteButton_disabled="//a[contains(@id,'ActionButton') and contains(@class,'disabled')]//span[text()='Delete Note']";//"//a[contains(@id,'deletenotes') and contains(@class,'disabled')]//span[text()='Delete']";	
	public final String tsr_Notes_Tab_Add_button="//div[contains(@id,'NotesViewTab')]//span[text()='Add Note']";//"//a[contains(@id,'addnote')]//span[text()='Add']";
	public final String tsr_Notes_Tab_Edit_button="//div[contains(@id,'Notes')]//span[text()='Edit Note']";//div[contains(@id,'notes')]//span[text()='Edit']";//"//a[contains(@id,'editnote')]//span[text()='Edit']";
	public final String tsr_Notes_Tab_Delete_button="//div[contains(@id,'Notes')]//span[text()='Delete Note']";//div[contains(@id,'notesviewtab')]//span[text()='Delete']";//"//a[contains(@id,'deletenotes')]//span[text()='Delete']";		
	public final String tsr_reviewHistory_noResultLabel="//div[contains(@id,'catsouthadditional') and contains(@class,'x-panel-body')]//div[contains(@id,'catreviewhistory')]//div[text()='No Results']";
	public final String tsr_dashboard_reviewTab_reviewStatus_starImage="//table[contains(@class,'StatusColum')]//tr//td[contains(@class,'smallStatusImgTable')]";//table[contains(@id,'tblPart')]//table[contains(@class,'StatusColum')]//tr//td[contains(@class,'smallStatusImgTable')]";
	public final String tsr_reviewTab_gradingAndScoringWindow_deleteButton="//div[contains(@id,'gradeandscore')]//a//span[text()='Delete']";
	public final String tsr_reviewTab_gradingAndScoringWindow_addButton="//div[contains(@id,'gradeandscore')]//a//span[text()='Add']";
	public final String tsr_reviewTab_gradingAndScoringWindow_errorIcon="//div[contains(@id,'gradeandscore')]//div[contains(@class,'error')]";
	public final String tsr_selectedSegment_backgroundColor="//table[contains(@class,'text-selection')]//tr//td//iframe[contains(@style,'background-color: rgb(255, 209, 233);')]";
	public final String tsr_dashboard_transStudio4ReviewTab="//div[contains(@class,'defaultBackground')][not(contains(@class,'hidden-offsets'))]//span[contains(text(),'File')]";//"//div[contains(@class,'gs4tr_Editor_suspend_selection') and contains(@id,'panel')][not(contains(@class,'hidden-offsets'))]//span[contains(@id,'switchbutton')]//span[contains(text(),'TransStudio 5 Review')]";//"//div[contains(@class,'gs4tr_Editor_suspend_selection') and contains(@id,'panel')][not(contains(@style,'display: none;'))]//span[contains(@id,'switchbutton')]//span[contains(text(),'TransStudio 4 Review')]";
	//public final String tsr_dashboard_transStudio4ReviewTab_exitTSR_button="//div[contains(@id,'actionmenuprototype') and contains(@class,'x-box-target')]//span[contains(text(),'Exit TransStudio 4 Review')]/following-sibling::div";
	public final String tsr_dashboard_transStudio4ReviewTab_exitTSR_button="//div[not(contains(@class,'hidden-offsets')) and contains(@class,'defaultBackground ')]//a[contains(@class,'exitBtn')]//span[contains(@class,'btn-inner')]";//"//div[contains(@id,'actionmenuprototype') and contains(@class,'x-box-target')]//span[contains(text(),'Exit TransStudio 5 Review')]";
	public final String translationTab_copySourceButton = "//a[contains(@class,'catcopysourceaction')]//span[contains(text(),'Copy')]";//"//a[contains(@id,'catcopysourceaction')]";
	public final String translationTab_copyAllSourceButton = "//a[contains(@class,'CopySourceAll')]//span[contains(text(),'Copy')]";//"//span[contains(@id,'CopySourceAll')]//span[contains(@class,'copySourceAll ')]";
	public final String tsr_firstRow_Segment = "//div[contains(@id,'TsrTxliff')]//table//td//div[contains(@id,'source')]";
	public final String tsr_firstRow_targetSegment ="//div[contains(@id,'Body')]/table[contains(@id,'Part')]//td//iframe";
	public final String tsr_CommentsRatings_removeButton ="//div[contains(@id,'RatingAndScore')]//table//td[contains(@class,'remove-grade')]";
	public final String translationTab_lockSegmentButton ="//a[contains(@class,'locksegmentaction')]//span[contains(text(),'Lock')]";
	public final String translationTab_lockSegmentButton_disabled ="//a[contains(@class,'locksegmentaction')][contains(@class,'item-disabled')]//span[contains(text(),'Lock')]";
	
	
	
	//public final String tsr_reviewTab_gradingAndScoringWindow_comment="//div[contains(@id,'TsrTxliffGrid')]//table//td[5]//div[contains(@name,'CommentTextField')]//div//input";
	
	public final String tsr_reviewTab_gradingAndScoringWindow_comment="//div[contains(@id,'TsrTxliffColumnRatingAndScore')]//div[contains(@name,'CommentTextField')]//input[contains(@name,'CommentTextField')]";
	public final String tsr_reviewTab_addEditNotes_comment="//div[contains(@name,'addEditNoteContent')]//textarea[contains(@name,'addEditNoteContent')]";
	public final String tsr_reviewTab_addEditNotesWindow_okButton="//div[contains(@id,'addeditnotes')]//div[contains(@id,'toolbar')]//span[contains(text(),'OK')]";
	public final String tsr_reviewTab_addEditNotesWindow_title="//div[contains(@class,'x-window-header')]//div[text()='Add/Edit Notes']";
	public final String translationTab_nextSegmentButton ="//a[contains(@class,'nextaction')]//span[contains(text(),'Next')]";
	public final String translationTab_previousSegmentButton ="//a[contains(@class,'previousaction')]//span[contains(text(),'Previous')]";
	public final String translationTab_firstBlockSource =  "//div[contains(@id,'TsrTxliff')]//table//td//div[contains(@id,'source')]";//div[contains(@id,'BodyTable')]/table//td//div[contains(@id,'source_content')]";//"//div[contains(@id,'BodyTable')]/table//td/div/div";//css=td.bodyTableTd>div"; //css=td.bodyTableTd>div>span
	public final String translationTab_lockSegment_status ="//table[contains(@class,'StatusColum')]//tr//td[contains(@class,'lockedsegment')]";
	public final String translationTab_clearTarget_drop_down_btn ="//a[contains(@class,'catActionClearTarget')]//span[contains(@class,'arrow')]";
	public final String clearTarget_Dropdown_ClearTarget_button_disabled="//div[(contains(@class,'disabled'))]//a[contains(@class,'menu-item-link')]//span[contains(text(),'Clear Target')]/following-sibling::div";
	public final String clearTarget_Dropdown_ClearAllTarget_button="//a[contains(@class,'menu-item-link')]//span[contains(text(),'Clear All Targets')]/following-sibling::div";
	public final String clearTarget_Dropdown_ClearTarget_button="//a[contains(@class,'menu-item-link')]//span[contains(text(),'Clear All Targets')]/following-sibling::div";
	public final String clearTarget_Dropdown_ClearTarget_button1="//a[contains(@class,'menu-item-link')]//span[contains(text(),'Clear Target')]/following-sibling::div";
	public final String clearTarget_Dropdown_ClearAllTarget_button_disabled="//div[(contains(@class,'disabled'))]//a[contains(@class,'menu-item-link')]//span[contains(text(),'Clear All Targets')]/following-sibling::div";
	public final String clearTarget_Dropdown_ClearAllTarget_button_Enabled="//div[not(contains(@class,'disabled'))]//a[contains(@class,'menu-item-link')]//span[contains(text(),'Clear All Targets')]/following-sibling::div";
	public final String translationTab_clearTargetButton = "//a[contains(@class,'catActionClearTarget')]//span[contains(text(),'Clear')]";
	public final String translationTab_clearTargetButton2 = "//a[contains(@class,'item-link')]//span[contains(text(),'Clear Target')]";
	public final String translationTab_clearTargetButton_disabled ="//a[contains(@class,'catActionClearTarget')][contains(@class,'disabled')]//span[contains(text(),'Clear')]";
	public final String translationTab_TMListButton ="//a[contains(@class,'tmlistaction')]//span[contains(text(),'TM')]";
	public final String tso_translationTab_nextTag_button="//a[contains(@class,'NextTag')]//span[contains(text(),'Next')]";//a[contains(@class,'nextplaceable')]//span[contains(text(),'Next')]";
	public final String tso_translationTab_previousTag_button="//a[contains(@class,'PreviousTag')]//span[contains(text(),'Previous')]";//a[contains(@class,'previousplaceable')]//span[contains(text(),'Previous')]";
	public final String tsr_translationTab_copyTag_button="//a[contains(@class,'CopyTag')]//span[contains(text(),'Copy')]";//a[contains(@class,'copyplaceable')]//span[contains(text(),'Copy')]";
	public final String tsr_editTab_preferences = "//a[contains(@class,'invertedIconCls')]//span[contains(@class,' preferences')]";//"//a[contains(@class,'preference')]//span[contains(text(),'Preferences')]";//"//a[contains(@id,'preference')]";
	public final String tsr_editTab_currentProject_preferences = "//a[contains(@class,'invertedIconCls')]//span[contains(@class,' preferences')]";//"//div[contains(@role,'menu')]//a//span[contains(text(),'Preferences')]";//"//a[contains(@id,'preference')]";
	public final String tsr_editTab_preferences_Segment ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Segment')]";
	public final String tsr_editTab_preferences_shortcuts ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Shortcuts')]";
	public final String tsr_editTab_preferences_general ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'General')]";
	public final String tsr_editTab_preferences_layout ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Layout')]";
	public final String tsr_editTab_preferences_layout_SimpleMode ="//input[contains(@name,'config')]//..//label[contains(text(),'Simple')]";
	public final String tsr_editTab_preferences_layout_AdvancedMode ="//input[contains(@name,'config')]//..//label[contains(text(),'Advanced')]";
	public final String tsr_editTab_preferences_shortcuts_search_input ="//div[contains(@name,'scutSearch')]//input[contains(@name,'scutSearch')]";
	public final String tsr_editTab_preferences_shortcuts_Include_InbounndCommands_checkbox="//input[contains(@name,'incUnboundCmd')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_shortcuts_Include_InbounndCommands_checkbox_Checked="//input[contains(@name,'incUnboundCmd')][@aria-checked='true']";
	public final String tsr_editTab_preferences_shortcuts_command_shortcut ="//div[contains(@name,'shortcutsGrid')]//table//td[2]";
	public final String tsr_editTab_preferences_OK_btn = "//div[contains(@id,'editpreferences')]//span[text()='OK']";
	public final String editTab_preferences_cancel_btn ="//div[contains(@id,'editpreferences')]//span[text()='Cancel']";
	public final String tsr_editTab_preferences_warnings ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Warnings')]";
	public final String tsr_editTab_preferences_forbidden_Add = "//div[contains(@name,'transcheck.forbiddenchar')]//span[contains(text(),'Add')]";
	public final String tsr_editTab_preferences_untranslatable_Add = "//div[contains(@name,'transcheck.untranslatable')]//span[contains(text(),'Add')]";
	public final String tsr_editTab_preferences_AddInput = "//div[contains(@name,'columnOne')]//input[contains(@name,'columnOne')]";
	public final String tsr_editTab_preferences_UpdateButton = "//span[contains(text(),'Update')]";
	
	public final String tsr_editTab_preferences_shortcuts_command_shortcut_input (String ShortKey){
	return"//div[contains(@name,'shortcutsGrid')]//table//td[2]////div[contains(text(),'"+ShortKey+"')]";
	}
	// Prefrences Layout
	
	public final String tsr_editTab_preferences_layout_action_bar_Advanced_checked ="//div[contains(@name,'config')]//input[contains(@aria-checked,'true')][contains(@name,'config')]";
	public final String tsr_editTab_preferences_layout_action_bar_Advanced_checkbox ="//div[contains(@name,'config')]//input[contains(@aria-checked,'false')][contains(@name,'config')]/following-sibling::span";
	public final String tsr_editTab_preferences_layout_action_bar_Simple_checked ="//div[contains(@name,'config')]//input[contains(@aria-checked,'true')][contains(@name,'config')]";
	public final String tsr_editTab_preferences_layout_action_bar_Simple_checkbox ="//div[contains(@name,'config')]//input[contains(@aria-checked,'false')][contains(@name,'config')]/following-sibling::span";

	
	
	
	//General preference Check box
	public final String  tsr_editTab_preferences_general_Preference_Add_Score_Column_chckbox_checked ="//input[contains(@name,'AddScoreColumn')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  tsr_editTab_preferences_general_Preference_Add_Score_Column_chckbox ="//input[contains(@name,'AddScoreColumn')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  tsr_editTab_preferences_general_Preference_SearchDepthWFServerTM ="//div[contains(@name,'GltmSearchDepth')]";
	
	//Preference Checkbox
	public final String tsr_editTab_preferences_segment_lastedited_checkbox ="//input[contains(@name,'LastEditedSegment')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_segment_lastedited_checkbox_checked ="//input[contains(@name,'LastEditedSegment')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_segment_leveragefirst_checkbox ="//input[contains(@name,'LeverageFirstSegment')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_segment_leveragefirst_checkbox_checked ="//input[contains(@name,'LeverageFirstSegment')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_segment_leveragenext_chckbox_checked ="//input[contains(@name,'LeverageNextSegment')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_segment_leveragenext_checkbox ="//input[contains(@name,'LeverageNextSegment')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_segment_SkipUnedited100_chckbox_checked ="//input[contains(@name,'SkipExactMatch')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_segment_SkipUnedited100_checkbox ="//input[contains(@name,'SkipExactMatch')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_segment_SkipUneditedContextMatches_chckbox_checked ="//input[contains(@name,'SkipContextMatch')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_segment_SkipUneditedContextMatches_checkbox ="//input[contains(@name,'SkipContextMatch')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	
	
	public final String  editTab_preferences_warnings_duplicateshortcut_chckbox ="//input[contains(@name,'ShowDuplicateShortcutWarn')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  editTab_preferences_warnings_duplicateshortcut_chckbox_checked ="//input[contains(@name,'ShowDuplicateShortcutWarn')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_warnings_showtargettags_chckbox_checked ="//input[contains(@name,'ShowTargetWithTagsWarn')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_warnings_showtargettags_chckbox ="//input[contains(@name,'ShowTargetWithTagsWarn')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_warnings_removesegmenttags_chckbox_checked ="//input[contains(@name,'RemoveSegmentTags')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_warnings_removesegmenttags_chckbox ="//input[contains(@name,'RemoveSegmentTags')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_forbidenchar_chckbox_checked ="//input[contains(@name,'forbiddenchar')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_forbidenchar_chckbox ="//input[contains(@name,'forbiddenchar')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	
	public final String tsr_editTab_preferences_MachineTranslation_AlwaysShowMTResultimnTMLookup = "//div[contains(@name,'always')]//input[contains(@name,'always')]/following-sibling::span[contains(@class,'radio')]";
	public final String editTab_preferences_MachineTranslation_Remove_MT_Score_Checked = "//div[contains(@class,'checked')][contains(@name,'removeTmScore')]//input[contains(@name,'removeTmScore')][@aria-checked='true']";
	public final String tsr_editTab_preferences_MachineTranslation_Remove_MT_Score_CheckBox = "//div[contains(@name,'removeTmScore')]//input[contains(@name,'removeTmScore')]/following-sibling::span[contains(@id,'checkbox')]";
	public final String editTab_preferences_MachineTranslation_message_OK_btn = "//div[@id='messages-cmp']//span[text()='OK']";
	
	public final String  tsr_editTab_preferences_segment_EnabledsmartQuotes_chckbox_checked ="//input[contains(@name,'SmartQuoteCheckBox')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  tsr_editTab_preferences_segment_EnabledsmartQuotes_checkbox ="//input[contains(@name,'SmartQuoteCheckBox')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	
	
	public final String  tsr_editTab_preferences_warning_ShowmissingspellcheckDictonary_checkbox_checked ="//input[contains(@name,'ShowMissingSpellcheckDictionary')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String  tsr_editTab_preferences_warning_ShowmissingspellcheckDictonary_checkbox ="//input[contains(@name,'ShowMissingSpellcheckDictionary')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	
	public final String tsr_editTab_preferences_warnings_transcheckWarning_checkbox ="//div[contains(@name,'ShowTranscheck')]//span[contains(@class,'form-checkbox')]";//div[contains(@name,'showTranscheck')]//span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_warnings_transcheckWarning_checkbox_checked ="//div[contains(@name,'ShowTranscheck')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";//div[contains(@name,'showTranscheck')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_warnings_overwriteTargetWarning_checkbox ="//div[contains(@name,'ShowTargetNotEmpty')]//span[contains(@class,'form-checkbox')]";//div[contains(@name,'showTargetNotEmpty')]//span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_warnings_overwriteTargetWarning_checkbox_checked ="//div[contains(@name,'ShowTargetNotEmpty')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";//div[contains(@name,'showTargetNotEmpty')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_warnings_removeTargetWarning_checkbox ="//div[contains(@name,'RemoveTarget')]//span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_warnings_removeTargetWarning_checkbox_checked ="//div[contains(@name,'RemoveTarget')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_warnings_removeAllTargetWarning_checkbox ="//div[contains(@name,'RemoveAllTarget')]//span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_warnings_removeAllTargetWarning_checkbox_checked ="//div[contains(@name,'RemoveAllTarget')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_EmptyTargetCheck_checkbox ="//div[contains(@name,'emptytarget')]//span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_transcheck_EmptyTargetCheck_checkbox_checked ="//div[contains(@name,'emptytarget')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_transcheck_numberdiffrence_chckbox_checked ="//input[contains(@name,'numerical')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_numberdiffrence_chckbox ="//input[contains(@name,'numerical')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_editedexactmatch_chckbox_checked ="//input[contains(@name,'editedexact')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_editedexactmatch_chckbox ="//input[contains(@name,'editedexact')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_selectdeselect_chckbox_checked ="//input[contains(@name,'selectDeselectAll')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_selectdeselect_chckbox ="//input[contains(@name,'selectDeselectAll')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_repeatedword_chckbox_checked ="//input[contains(@name,'repeatedwords')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_repeatedword_chckbox ="//input[contains(@name,'repeatedwords')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_editedcontext_chckbox_checked ="//input[(@name='editedcontext')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_editedcontext_chckbox ="//input[(@name='editedcontext')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_unconfirmed_chckbox_checked ="//input[contains(@name,'unconfirmed')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_unconfirmed_chckbox ="//input[contains(@name,'unconfirmed')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_punctuation_chckbox_checked ="//input[contains(@name,'punctuation')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_punctuation_chckbox ="//input[contains(@name,'punctuation')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_doublepunctuation_chckbox_checked ="//input[contains(@name,'doublepunctuation')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_doublePunctuation_chckbox ="//input[contains(@name,'doublepunctuation')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	
	//Capitalization Check

	public final String tsr_editTab_preferences_transcheck_capitalization_chckbox_checked ="//input[contains(@name,'CapitalizeFirstLetter') or contains(@name,'capitalization')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";//input[contains(@name,'CapitalizeFirstLetter')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_capitalization_chckbox ="//input[contains(@name,'CapitalizeFirstLetter') or contains(@name,'capitalization')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";//input[contains(@name,'CapitalizeFirstLetter')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_capitalization_firstword_chckbox_checked ="//input[contains(@name,'firstword')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_capitalization_firstword_chckbox ="//input[contains(@name,'firstword')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_capitalization_target_mismatch_chckbox_checked ="//input[contains(@name,'targetcapitalizationmismatch')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_capitalization_target_mismatch_chckbox ="//input[contains(@name,'targetcapitalizationmismatch')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_capitalization_source_mismatch_chckbox_checked ="//input[contains(@name,'sourcecapitalizationmismatch')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_capitalization_source_mismatch_chckbox ="//input[contains(@name,'sourcecapitalizationmismatch')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_capitalization_allcaps_chckbox_checked ="//input[contains(@name,'allcapsmismatch')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_capitalization_allcaps_chckbox ="//input[contains(@name,'allcapsmismatch')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	
	//Tags Preferences
	public final String tsr_editTab_preferences_Transcheck_tag_checkbox_checked ="//input[contains(@name,'tags')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_tag_checkbox ="//input[contains(@name,'tags')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_non_format_tag_checkbox_checked ="//input[contains(@name,'nonformatting')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_non_format_tag_checkbox ="//input[contains(@name,'nonformatting')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_source_format_checkbox_checked ="//input[contains(@name,'sourceformatting')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_source_format_checkbox ="//input[contains(@name,'sourceformatting')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_targetnot_insource_checkbox_checked ="//input[contains(@name,'targetformatting')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_targetnot_insource_checkbox ="//input[contains(@name,'targetformatting')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_segmentlength_checkbox_checked ="//input[contains(@name,'segmentlength')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_segmentlength_checkbox ="//input[contains(@name,'segmentlength')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_segmentlength_strictlength_checkbox_checked ="//input[contains(@name,'strictcharlen')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_segmentlength_strictlength_checkbox ="//input[contains(@name,'strictcharlen')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_segmentlength_charexpression_checkbox_checked ="//input[contains(@name,'charexpansion')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_segmentlength_charexpression_checkbox ="//input[contains(@name,'charexpansion')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_segmentlength_wordexpansion_checkbox_checked ="//input[contains(@name,'wordexpansion')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_segmentlength_wordexpansion_checkbox ="//input[contains(@name,'wordexpansion')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	
	
	public final String tsr_editTab_preferences_Transcheck_min_segmentchar ="//div[contains(@name,'segmentlength.minlen')]//input[contains(@id,'numberfield')]";
	public final String tsr_editTab_preferences_Transcheck_max_segmentchar ="//div[contains(@name,'segmentlength.maxlen')]//input[contains(@id,'numberfield')]";
	public final String tsr_editTab_preferences_Transcheck_min_charexpression ="//div[contains(@name,'minexpansion')]//input[contains(@id,'numberfield')]";
	public final String tsr_editTab_preferences_Transcheck_max_charexpression ="//div[contains(@name,'maxexpansion')]//input[contains(@id,'numberfield')]";
	public final String tsr_editTab_preferences_Transcheck_min_wordexpansion ="//div[contains(@name,'word.minexpansion')]//input[contains(@id,'numberfield')]";
	public final String tsr_editTab_preferences_Transcheck_max_wordexpansion ="//div[contains(@name,'word.maxexpansion')]//input[contains(@id,'numberfield')]";
	
	
	public final String tsr_editTab_preferences_tags ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Tags')]";
	public final String tsr_translationTab_ClearAllTags_drop_down_btn ="//a[contains(@class,'clearalltags')]//span[contains(@class,'arrow')]";
	public final String tsr_editTab_Tags_RemoveIncompleteTagPairs ="//input[@name='deleteBadTagsAlways'][@aria-checked='true']/following-sibling::span";//"//input[@name='deleteBadTagsAlways'][@aria-checked='true']";
	public final String tsr_editTab_Tags_RemoveIncompleteTagPairs_Click ="//input[@name='deleteBadTagsAlways'][@aria-invalid='false']/following-sibling::span";
	public final String tsr_clearTarget_Dropdown_ClearSegment_button_disabled="//div[(contains(@class,'disabled'))]//a[contains(@class,'menu-item-link') and contains(@data-qtip,'Clears all the tags')]//span[contains(text(),'Segment')]/following-sibling::div";
	public final String tsr_clearAllTags_Dropdown_Segment_button="//a[contains(@class,'menu-item-link')]//span[contains(text(),'Segment')]/following-sibling::div";
	public final String tsr_clearAllTags_Dropdown_Document_button="//a[contains(@class,'menu-item-link')]//span[contains(text(),'Document')]/following-sibling::div";
	
	//Machine Translate
	public final String tsr_editTab_preferences_MachineTranslation = "//span[text()='Machine Translation']";
	public final String tsr_editTab_preferences_MachineTranslation_enableWordLingo_checkbox = "//input[@name='enableWorldLingo']/following-sibling::span";//"//input[@name='enableWorldLingo']";
	public final String tsr_editTab_preferences_MachineTranslation_enableWordLingo_checkbox_checked ="//div[contains(@name,'enableWorldLingo')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_MachineTranslation_enableWordLingoPrimary_checkbox = "//div[contains(@name,'worldLingoPrimary')]//span[contains(@class,'checkbox')]";//"//input[@name='enableWorldLingo']";
	public final String tsr_editTab_preferences_MachineTranslation_enableWordLingoPrimary_checkbox_checked ="//div[contains(@name,'worldLingoPrimary')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_MachineTranslation_message_OK_btn = "//div[@id='messages-cmp']//span[text()='OK']";
	public final String tsr_editTab_preferences_MachineTranslation_enableWordLingo_TestBtn = "//div[contains(@name,'worldLingoPrimary')]/following-sibling::a/..//span[text()='Test']";
	public final String tsr_translationTab_Machine_Translation_Button="//a[contains(@class,'machinetranslationaction') and not(contains(@class,'disabled'))]";
	
	//Minimize window
		public final String tsr_minimizescreen_arrow_moreoptions = "//div[contains(@gs4trname,'Translation')]//a[contains(@data-componentid,'menu-trigger')]//span[contains(@class,'more-icon')]";
		
		public final String tsr_Dropdown_Menu_minimize(String findtext){
			return "//div[contains(@class,'shadow')]/following-sibling::div//a[@role='menuitem']//span[contains(text(),'"+findtext+"')]";
		}
	
	//Tags & formatting
	public final String tsr_editTab_preferences_Tags_showsupportedtextformating_checkbox_checked ="//div[contains(@name,'placeableFormatting')]//input[contains(@aria-checked,'true')][contains(@name,'placeableFormatting')]";
	public final String tsr_editTab_preferences_Tags_showsupportedtextformating_checkbox ="//div[contains(@name,'placeableFormatting')]//input[contains(@aria-checked,'false')][contains(@name,'placeableFormatting')]/following-sibling::span";
	public final String tsr_editTab_preferences_Tags_showformatingTags_checkbox_checked ="//div[contains(@name,'placeableNonFormatting')]//input[contains(@aria-checked,'true')][contains(@name,'placeableNonFormatting')]";
	public final String tsr_editTab_preferences_Tags_showformatingTags_checkbox ="//div[contains(@name,'placeableNonFormatting')]//input[contains(@aria-checked,'false')][contains(@name,'placeableNonFormatting')]//../span";//"//div[contains(@name,'placeableNonFormatting')]//input[contains(@aria-checked,'false')][contains(@name,'placeableNonFormatting')]";
	public final String tsr_editTab_preferences_Tags_RemoveIncompletetagspairs_checkbox_checked ="//input[contains(@name,'deleteBadTagsAlways')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Tags_RemoveIncompletetagspairs_checkbox ="//input[contains(@name,'deleteBadTagsAlways')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Tags_Applysource_segment_checkbox_checked ="//input[contains(@name,'applyWholeSegmentFormating')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Tags_Applysource_segment_checkbox ="//input[contains(@name,'applyWholeSegmentFormating')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Tags_TagsNamingFull_checkbox_checked ="//div[contains(@name,'placeableFullName')]//input[contains(@aria-checked,'true')]/following-sibling::";
	public final String tsr_editTab_preferences_Tags_TagsNamingFull_checkbox ="//div[contains(@name,'placeableFullName')]//input[contains(@aria-checked,'false')]/following-sibling::span";
	public final String tsr_editTab_preferences_Tags_TagsNamingShort_checkbox_checked ="//div[contains(@name,'placeableShortName')]//input[contains(@aria-checked,'true')]/following-sibling::";
	public final String tsr_editTab_preferences_Tags_TagsNamingShort_checkbox ="//div[contains(@name,'placeableShortName')]//input[contains(@aria-checked,'false')]/following-sibling::span";
	public final String tsr_editTab_preferences_Tags_TagsNamingNumbered_checkbox_checked ="//div[contains(@name,'placeableNumbering')]//input[contains(@aria-checked,'true')]/following-sibling::span";
	public final String tsr_editTab_preferences_Tags_TagsNamingNumbered_checkbox ="//div[contains(@name,'placeableNumbering')]//input[contains(@aria-checked,'false')]/following-sibling::span";

	//Notes
	public final String tsr_reviewTab_addNotes_button_disabled="//a[contains(@class,'addnote')][contains(@class,'btn-disabled')]//span[contains(text(),'Add')]";
	public final String tsr_reviewTab_editNotes_button_disabled="//a[contains(@class,'editnote')][contains(@class,'btn-disabled')]//span[contains(text(),'Edit')]";
	public final String tsr_reviewTab_deleteNotes_button_disabled="//a[contains(@class,'deletenote')][contains(@class,'btn-disabled')]//span[contains(text(),'Delete')]";
	public final String tsr_reviewTab_addEditNotesWindow_creator_label="//div[contains(@id,'addeditnotes')]//span[contains(text(),'Creator')]";//div[contains(@id,'addeditnotes')]//label[contains(text(),'Creator')]";
	public final String tsr_reviewTab_addEditNotes_notesInput="//input[contains(@name,'addEditNoteType')]";
	public final String tsr_reviewTab_addEditNotes_type_dropDown="//div[input[contains(@name,'EditNoteType')]]/following-sibling::div[contains(@class,'arrow-trigger')]";
	public final String tsr_reviewTab_addNotes_button="//a[contains(@class,'addnote')]//span[contains(text(),'Add')]";
	public final String tar_notesTab_AddEditNotes_textarea_cancelButton="//div[contains(@id,'addeditnotes')]//a[contains(@id,'button')]//span[text()='Cancel']";
	public final String tsr_reviewTab_editNotes_button="//a[contains(@class,'editnote')]//span[contains(text(),'Edit')]";
	public final String tsr_reviewTab_deleteNotes_button="//a[contains(@class,'deletenote')]//span[contains(text(),'Delete')]";	
	
	//Attach/Detach Button
	public final String tso_segmentTab_attachDetach_button ="//div[contains(@gs4trname,'Segment')]//a[contains(@id,'ActionButton')]//span[contains(text(),'Attach')]";
	public final String tso_floatingBar_attachDetach_button ="//div[contains(@class,'floating_bar')]//div[contains(@id,'buttongroup')]//table//span[contains(@class,'attachdetach')]";
	
	//Penalties
	public final String tsr_editTab_preferences_penalties="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Penalties')]";
	
	public final String tsr_editTab_preferences_penalties_privateTu_CheckboxChecked="//label[text()='Private TU']/..//input[contains(@aria-checked,'true')]";
	public final String tsr_editTab_preferences_penalties_privateTu_Checkbox="//label[text()='Private TU']";
	public final String tsr_editTab_preferences_penalties_privateTu_InputValue_Increment="//div[contains(@name,'pvtTUPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String  tsr_editTab_preferences_penalties_remoteTU_checkbox ="//div[contains(@name,'remoteTMPenCheck')]//span[contains(@class,'form-checkbox')]";
	public final String  tsr_editTab_preferences_penalties_remoteTU_checkbox_checked ="//div[contains(@name,'remoteTMPenCheck')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	
	public final String tsr_editTab_preferences_penalties_case_checkbox ="//input[contains(@name,'caseAtPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_case_checkbox_checked ="//input[contains(@name,'caseAtPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_case_InputValue_Increment="//div[contains(@name,'caseAtPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String tsr_editTab_preferences_penalties_MachineTranslation_checkbox ="//input[contains(@name,'machineTransPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_MachineTranslation_checkbox_checked ="//input[contains(@name,'machineTransPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_MachineTranslation_InputValue_Increment="//div[contains(@name,'machineTransPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	public final String tsr_editTab_preferences_penalties_MachineTranslation_InputValue_Decrement="//div[contains(@name,'machineTransPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-down')]";
	
	public final String tsr_editTab_preferences_penalties_Tags_checkbox ="//input[contains(@name,'tagPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_Tags_checkbox_checked ="//input[contains(@name,'tagPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_Tags_InputValue_Increment="//div[contains(@name,'tagPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	public final String tsr_editTab_preferences_penalties_Tags_InputMin_Increment="//div[contains(@name,'tagPenMin')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String tsr_editTab_preferences_penalties_NonLiteral_checkbox ="//input[contains(@name,'nonLiteralPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_NonLiteral_checkbox_checked ="//input[contains(@name,'nonLiteralPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_NonLiteral_InputValue_Increment="//div[contains(@name,'nonLiteralPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	public final String tsr_editTab_preferences_penalties_NonLiteral_InputMin_Increment="//div[contains(@name,'nonLiteralPenMin')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String tsr_editTab_preferences_penalties_PublicTu_checkbox ="//input[contains(@name,'pubTUPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_PublicTu_checkbox_checked ="//input[contains(@name,'pubTUPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_PublicTu_InputValue_Increment="//div[contains(@name,'pubTUPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String tsr_editTab_preferences_penalties_Align_checkbox ="//input[contains(@name,'alignPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_Align_checkbox_checked ="//input[contains(@name,'alignPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_Align_InputValue_Increment="//div[contains(@name,'alignPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String tsr_editTab_preferences_penalties_MultipleTranslation_checkbox ="//input[contains(@name,'multiTransPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_MultipleTranslation_checkbox_checked ="//input[contains(@name,'multiTransPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_MultipleTranslation_InputValue_Increment="//div[contains(@name,'multiTransPenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	
	public final String tsr_editTab_preferences_penalties_Attribute_checkbox ="//input[contains(@name,'attributePenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_Attribute_checkbox_checked ="//input[contains(@name,'attributePenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_penalties_Attribute_InputValue_Increment="//div[contains(@name,'attributePenValue')]//div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	public final String tsr_editTab_preferences_penalties_Attribute_InputValue_InputBox="//fieldset[contains(@id,'fieldset')]//div[contains(@name,'customAttrPenTextfield')]//input[contains(@name,'customAttrPenTextfield')]";
	public final String tsr_editTab_preferences_penalties_Attribute_IFAttributeIsNot_checkbox ="//input[contains(@name,'customAttrPenCheck')]/following-sibling::span[contains(@class,'checkbox')]";
	
	//Auto Propagation
	public final String tsr_editTab_preferences_Auto_Propagation = "//span[text()='Auto-Propagation']";
	
	
	public final String tsr_edit_Tab_preferences_Auto_propagation_overwrtie_option_checkbox_checked(String divName){
		return "//div[contains(@name,'"+divName+"')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	}
	
	public final String tsr_edit_Tab_preferences_Auto_propagation_overwrtie_option_checkbox(String divName){
		return "//input[contains(@name,'"+divName+"')]/following-sibling::span";
	}
	
	//Auto Suggestion
	//Auto-Suggestion
	public final String tsr_editTab_preferences_autosuggestion = "//span[text()='Auto-Suggestion']";
	
	public final String tsr_auto_suggestionword_segment(String findtext){
		return "//div[contains(@id,'autosuggestion')]//a[contains(@id,'abstractmen')]//span[contains(text(),'"+findtext+"')]";
	}
	
	public final String tsr_edit_Tab_preferences_Auto_suggestion_overwrtie_option_checkbox(String divName){
		return "//input[contains(@name,'"+divName+"')]/following-sibling::span";
	}
	
	public final String tsr_edit_Tab_preferences_Auto_suggestion_overwrtie_option_checkbox_checked(String divName){
		return "//div[contains(@name,'"+divName+"')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	}
	
	//Transcheck
	public final String tsr_transcheckTab_Refresh_button="//div[contains(@id,'transcheck')]//div[contains(@id,'toolbar')]//a[not(contains(@class,'disabled'))]//span[text()='Refresh']";
	public final String tsr_editTab_preferences_transcheck ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Transcheck')]";
	public final String tsr_editTab_preferences_transcheck_copiedSourceCheck_checkbox ="//div[contains(@name,'sourcecopiedtotarget')]//span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_transcheck_copiedSourceCheck_checkbox_checked ="//div[contains(@name,'sourcecopiedtotarget')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_transcheck_spellingCheck_checkbox ="//div[contains(@name,'spelling')]//span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_transcheck_spellingCheck_checkbox_checked ="//div[contains(@name,'spelling')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	public final String tsr_reviewTab_transcheckSegment_button="//a[contains(@class,'transchecksegment')]//span[contains(text(),'Transcheck')]";
	public final String tsr_TranslationTab_VerifySegment_button="//a[contains(@class,'ActionSegmentVerify')]//span[contains(text(),'Verify')]";
	public final String tsr_TranslationTab_VerifySegmentDisabled_button="//a[contains(@class,'ActionSegmentVerify')][@aria-disabled='true']//span[contains(text(),'Verify')]";
	public final String tsr_transcheckTab="//div[contains(@id,'southadditional')]//a//span[contains(text(),'Transcheck')]";
	public final String tsr_reviewTab_transcheckAll_button="//a[contains(@data-qtip,'Transcheck All')]//span[contains(text(),'Transcheck')]";
	public final String tsr_editTab_preferences_transcheck_RemoteTM_checkbox ="//div[contains(@name,'p_remoteTMPenCheck')]//span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_transcheck_RemoteTM_checkbox_checked ="//input[contains(@name,'remoteTMPenCheck')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_DownloadTranscheckConfig = "//span[contains(text(),'Download Transcheck configuration')]";
	public final String tsr_editTab_preferences_transcheck_SecondaryTM_checkbox ="//div[contains(@name,'p_secondaryTMPenCheck')]//span[contains(@class,'checkbox')]";
	public final String tsr_editTab_preferences_transcheck_SecondaryTM_checkbox_checked ="//div[contains(@name,'p_secondaryTMPenCheck')][@aria-checked='true']//span[contains(@class,'checkbox')]";
	public final String tsr_reviewTab_TranscheckSummary_window_OK_btn="//div[contains(@id,'transcheckreport')]//div[contains(@id,'toolbar')]//a//span[text()='OK']";
	public final String Missing_warning_OKbutton = "//div[contains(@id,'message')]//div[contains(@id,'toolbar')]//a//span[text()='OK']";
	
	public final String tsr_editTab_preferences_transcheck_RemoteTM_InputValue_Increment="//div[input[contains(@name,'remoteTMPenValue')]]/following-sibling::div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	public final String tsr_editTab_preferences_transcheck_SecondaryTM_InputValue_Increment="//div[input[contains(@name,'secondaryTMPenValue')]]/following-sibling::div[contains(@class,'trigger-spinner')]//div[contains(@class,'spinner-up')]";
	public final String tsr_editTab_preferences_transcheck_untranslatedtext_chckbox_checked ="//input[contains(@name,'untranslated')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_untranslatedtext_chckbox ="//input[contains(@name,'untranslated')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_untranslatabletext_chckbox_checked ="//input[contains(@name,'untranslatable')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_untranslatabletext_chckbox ="//input[@name='untranslatable'][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_whitespace_chckbox_checked ="//input[contains(@name,'whitespace')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_transcheck_whitespace_chckbox ="//input[contains(@name,'whitespace')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_About_ProductName="//div[contains(@name,'appAboutProductName')]//div[contains(@name,'appAboutProductName')]";
	
	//Help ATb Locators
	public final String Help_Tab_About_transreview_btn="//a[contains(@class,'aboutonlineproduct')]//span[contains(text(),'About')]";
	
	public final String tsr_dashboard_currentProject_help_Feedback_button="//a[contains(@class,'Feedback')]";
	
	  //Check complete progress bar
	
		public final String tsr_projectFiles_opened_progressbar(String percentage)
		{
			return "//div[text()='Opened']//following::td[1]//div[text()='"+percentage+"']";
		}	
		
		public final String tsr_projectFiles_complete_progressbar(String percentage)
		{
			return "//div[text()='Completed']//following::td[1]//div[text()='"+percentage+"']";
		}	
	//Captive TSR locators
	public final String  tsr_username_watermark (String username)
	{
	return "//div[contains(@class,'watermark')][contains(text(),'"+username+"')]";	
	}
	//TSR Dashboard Current Project
	
	public final String tsr_dashboard_transStudio4Tab_Review="//div[contains(@id,'panel') and contains(@class,'gs4tr_Editor_suspend_selection')][not(contains(@class,'hidden-offsets'))]//span[contains(@id,'switchbutton')]//span[contains(text(),'TransStudio 5 Review')]"; //"//a[contains(@id,'perspectiveswitchbutton')]//span[contains(text(),'TransStudio 4 Review')]";
	public final String tsr_dashboard_transStudio4Tab_exitTSo_button="//div[contains(@id,'actionmenuprototype')][contains(@aria-hidden,'false')]//span[contains(text(),'Exit TransStudio 5 Review')]/following-sibling::div";//"//div[contains(@id,'actionmenuprototype') and contains(@class,'x-box-target')]//span[contains(text(),'Exit TransStudio 4 Online')]/following-sibling::div";
	public final String tsr_dashboard_transStudio4Tab_ProjectFiles_button="//span[contains(text(),'Project Files')]";
	public final String tsr_dashboard_transStudio4Tab_ReferenceFiles_tab="//span[contains(text(),'Reference Files')]";
	public final String tsr_current_project_referenceFiles_tab_Filename_input="//input[contains(@id,'textfield')]";
	public final String tsr_dashboard_transStudio4Tab_projectTM_tab="//span[contains(text(),'Project TM')]";
	public final String tsr_dashboard_transStudio4Tab_currentproject_projectTM_readOnlycol="//span[contains(text(),'Read-only')]";
	public final String tsr_projectFiles_ReviewFile="//div[contains(@gs4trname,'Project Files')]//span[contains(text(),'Review')]";
	public final String tsr_dashboard_transStudio4Tab_Help="//a[contains(@class,'inverted')]//span[contains(@class,'About')]";
	
	public final String tsr_dashboard_transStudio4Tab_currentProject_button="//div[contains(@id,'actionmenu')]//span[contains(text(),'Current Project')]/following-sibling::div";
	public final String tsr_projectFiles_chainFiles_disabled="//div[contains(@gs4trname,'Project Files')]//a[contains(@aria-disabled,'true')]//span[contains(text(),'Chain')]";
	public final String tsr_currentproject_ClearFilter_icon="//div[@data-qtip='Clear filters']";
	public final String tsr_currentproject_SortASC_DESC_icon="//div[@data-qtip='Sort ASC/DESC']";
	public final String tsr_currentproject_SortMenu_icon="//div[@data-qtip='Sort menu']";

	 public final String tsr_current_project_refrene_files_noresults="//div[contains(@class,'unselectable')]/div[text()='No results']";

	//Sort menu
	//Select Sort Menu Options
	public final String tsr_currentproject_projecttm_SortMenu(String SelectType)
	{
	return "//div[contains(@class,'menu-item')]//a//span[contains(text(),'"+SelectType+"')]";
	}
	
	public final String tsr_Editorselect_translateFile(String filename)
	{
		return "//div[contains(@id,'multiplyfileeditor')]//a//span[contains(text(),'"+filename+"')]";
	}
	public final String tsr_projectFiles_transcheckReport_disabledButton="//a[contains(@data-qtip,'Transcheck Report')][contains(@class,'disabled')]";
	public final String tsr_dashboard_transStudio4Tab_projectTerminology_tab="//span[contains(text(),'Project Terminology')]";
	public final String tsr_dashboard_transStudio4Tab_referenceFiles_tab="//span[contains(text(),'Reference Files')]";
	
	public final String tsr_projectFiles_chainFiles="//div[contains(@gs4trname,'Project Files')]//span[contains(text(),'Chain')]";

	public final String tsr_dashboard_transStudio4Tab_AboutTransStudio="//a[contains(@class,'preferences')]//span[contains(text(),'About')]";//"//a[contains(@class,'aboutproductaction')]//span[contains(text(),'About')]";

	public final String tsr_projectFiles_transcheckReport="//div[contains(@gs4trname,'Project Files')]//span[contains(@class,'transcheckProject')]";
	
	public final String tsr_currentproject_transcheck = "//span[contains(@class,'link')][contains(text(),'Preferences > Transcheck')]";
	
	public final String tsr_projectFiles_switchPerspectiveEditorView="//div[contains(@id,'elementToScrollId')]//div[contains(@class,'perspectiveEditorSelected')]";
	
	public final String tsr_projectFiles_switchPerspectiveCurrentProjectView="//div[contains(@id,'elementToScrollId')]//div[contains(@class,'perspectiveProject')]";
	
	public final String tsr_projectFiles_RuntranscheckReportButton="//div[contains(@class,'toolbar')]//a//span[contains(text(),'Run Transcheck')]";
	public final String tsr_projectFiles_SegmentChangesReportButton="//a[contains(@class,'ProjectSegmentChangesReport')]//span[contains(text(),'Segment Changes')]";
	public final String tsr_projectFiles_SegmentChangesReport_ExportButton="//div[contains(@id,'segmentreport')]//div[contains(@class,'toolbar')]//a//span[contains(text(),'Export')]";
	public final String TranscheckReport_okButton = "//span[text()='OK']/..";
	public final String Transcheck_finished_Ok = "//div[contains(@id,'message')]//span[text()='OK']";
	
	//For Verifying the opened file tab name under Translation tab in TXLF editor
	
	public final String tsr_projectFiles_file_with_Details(String partialFileName, String details)
	{
		return "//table[contains(@id,'treeview')]//tr//td//span[contains(text(),'"+partialFileName+"')]/../../../following-sibling::td//div[contains(text(),'"+details+"')]";//"//table[contains(@id,'treeview')]//tr//td//span[contains(text(),'"+partialFileName+"')]/../../following-sibling::td//div[contains(text(),'"+details+"')]";
	}
	
	public final String tsr_currentproject_projectfile_Sourcefile_BOLD(int rownumber,String fileName)
	{
		return "//table[contains(@id,'treeview')]['"+rownumber+"']//td//span[contains(@class,'bold') and contains(text(),'"+fileName+"')]";
	}
	public final String tsr_targetSegment_BOLD_textPresent(int rowNumber)
	{
		//return "//div[contains(@class,'x-grid-item-container')]//table["+rowNumber+"]//td[3]//b[1]";
		return "//div[contains(@id,'currentEditor')]/b[1]";
	}
	
	public final String tsr_targetSegment_textPresent(String text)
	{
		return "//div[contains(@id,'currentEditor')]//div[contains(text(),'"+text+"')]";
	}
	
	public final String tsr_translationtab_sourcefileName_tab(String FileName)
	{
		return "//div[contains(@id,'multiplyfileeditor')]//span[contains(text(),'"+FileName+"')]";
	}
	
	public final String tsr_currentproject_projectfile_Sourcefile(String fileName)
	{
		return "//table[contains(@id,'treeview')]//td//span[contains(text(),'"+fileName+"')]";
	}
	
	public final String selectSegmentXEditableContentTSR(int partNo)
	{	
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//td[2]//div[contains(@contenteditable,'true')]";
	}
	
	public final String tsr_SegmentID(int rowNumber, int idNumber) {
		return "//div[contains(@id,'TsrTxlif')]//table['"+rowNumber+"']//td['"+idNumber+"']//div";
		}
	
	public final String tsr_currentproject_GenericTab(String tabName)
	{
		return "//div[not(contains(@class,'hidden-offsets'))][contains(@class,'defaultBackground')]//span[text()='"+tabName+"']";
		//return "//span[text()='"+tabName+"']";
	}
	
	
	public final String tsr_currentproject_projectfile_targetfile(String fileName)
	{
		return "//table[contains(@id,'treeview')]//td//span[contains(text(),'"+fileName+"')]";
	}
	
	public final String tsr_currentproject_projectfile_SelectRow_Sourcefile(int RowNumber,String fileName)
	{
		return "//table[contains(@id,'treeview')]['"+RowNumber+"']//td//span[contains(text(),'"+fileName+"')]";
	}
	
	public final String tsr_segmentid_tooltip_filename(int rownumber, String filename)
	{
		return "//div[contains(@id,'TsrTxlif')]//table['"+rownumber+"']//td[contains(@data-qtip,'"+filename+"')]";
	}
	
	
	//Progress status & bar
	public final String tsrtab_segments_count(String count){
		return "//div[contains(@class,'editorViewStatusBar')]//label[contains(@class,'editorViewStatusBar') and contains(text(),'Segments: "+count+"')]";
	}
	
	public final String tsrtab_segment_src_tgt_max(String count){
		return "//div[contains(@class,'editorViewStatusBar')]//label[contains(@class,'editorViewStatusBar') and contains(text(),'Segment (Src/Tgt/Max): "+count+"')]";
	}
	
	public final String tsrtab_paragraph_src_tgt_max(String count){
		return "//div[contains(@class,'editorViewStatusBar')]//label[contains(@class,'editorViewStatusBar') and contains(text(),'Paragraph (Src/Tgt/Max): "+count+"')]";
	}
	
	public final String tsrtab_segment_tooltipmsg(String text){
		return "//div[contains(@id,'tooltip')]//div[contains(text(),"+text+"')]";
	}
	
	public final String tsrtab_paragraph_tooltipmsg(String text){
		return "//div[contains(@id,'tooltip')]//div[contains(text(),"+text+"')]";
	}
	
	public final String tsrtab_editor_progressbar(int percentage){
		return "//div[contains(@id,'statusbareditor')]//div[contains(@id,'progressbar')]//div[contains(text(),'"+percentage+"%')]";
	}
	
	public final String tsrtab_editor_progressbar_wordcount(String wordcount){
		return "//div[contains(@id,'statusbareditor')]//div[contains(@id,'progressbar')]//div[contains(text(),'"+wordcount+"')]";
	}
	
	//For selecting the checkbox under the Transcheck report
	public final String tsr_projectFiles_transcheckReport_selectDeselectall_chexkbox_options(String optionlabel)
	{
		return "//div[contains(@id,'checkbox')]//span[following-sibling::label[contains(text(),'"+optionlabel+"')]]";
	}
	
	public final String tsr_projectFiles_transcheckReport_selectDeselectall_chexkbox_options_checked(String optionlabel)
	{
		return "//div[contains(@id,'checkbox')][contains(@class,'checked')]//span[following-sibling::label[contains(text(),'"+optionlabel+"')]]";
	}

	
	
	//For selecting the Reference file type in current project
	public final String tsr_currentproject_referencefile_filetype(int rowNumber, String filetype)
	{
		return "//table[contains(@id,'treeview')]["+rowNumber+"]//td//div[contains(text(),'"+filetype+"')]";
	}

	//For Verifying TM Name
		public final String tsr_currentproject_projectTM_tmName(int rowNum, String tmName)
		{
			//return "//table[contains(@id,'treeview')]["+rowNum+"]//td//div[contains(@class,' remoteTmFilesMark')]/following-sibling::span[contains(text(),'"+tmName+"')]";
			return "//table[contains(@id,'treeview')]["+rowNum+"]//div[contains(@class,'tree-icon')]//..//span[contains(text(),'"+tmName+"')]";
		}
	    //For verifying the TM Selected Symbol
		public final String tsr_currentproject_projectTM_selectedCheck(int rowNum)
		{
			//return "//table[contains(@id,'treeview')]["+rowNum+"]//td[2]/div";
			return "//table[contains(@id,'treeview')]//td[2]/div";
		}
		//For Verifying the priority of the TM
		public final String tsr_currentproject_projectTM_priority(int rowNum, String priority)
		{
			return "//table[contains(@id,'treeview')]["+rowNum+"]//td//div[contains(text(),'"+priority+"')]";
		} 
		//For verifying the TM Type
		public final String tsr_currentproject_projectTM_tmType(int rowNum, String tmType)
		{
			return "//table[contains(@id,'treeview')]["+rowNum+"]//td//div[contains(text(),'"+tmType+"')]";
		} 
		
		//Edit Main Menu
		public final String tsr_editTab_Undo_button = "//a[contains(@class,'undo')]//span[text()='Undo']";
		public final String tsr_editTab_Redo_button = "//a[contains(@class,'redo')]//span[text()='Redo']";

	//Find and Replace
	public final String tsr_editTab_findAndReplace_windowTitle ="//div[contains(@id,'window')]//div[contains(text(),'Find/Replace')]";
	public final String tsr_editTab_ClearallTags ="//a[contains(@class,'clearalltag')]//span[contains(text(),'Clear')]";
	public final String tsr_editTab_findAndReplace_windowTitle_presentAt_background ="//div[contains(@id,'window')][contains(@class,'header-draggable')][contains(@data-tabindex-value,'0')]";
	public final String tsr_editTab_findAndReplace_btn = "//a[contains(@class,'catfindreplaceaction')]";
	public final String tsr_editTab_findAndReplace_replaceTab ="//div[contains(@id,'findreplace')]//a[contains(@class,'tab-rotate-left')]//span[contains(@class,'findReplace')]";//"//div[contains(@id,'findreplace')]//a//span[contains(text(),'Replace')]";
	public final String tsr_editTab_findAndReplace_findNext_inputBox = "//input[contains(@name,'FindWhat')]";
	public final String tsr_editTab_findAndReplace_findNext_WithREplaceTab_inputBox = "//input[contains(@name,'FindWhat')][contains(@id,'FieldHistoryCombo')]";
	public final String tsr_editTab_findAndReplace_findTab_findWhat_inputBox ="//div[contains(@name,'findWhat')]//input[contains(@name,'findWhat')]";
	public final String tsr_editTab_findAndReplace_ReplaceNext_inputBox = "//input[contains(@name,'replaceWith')]";
	public final String tsr_editTab_findAndReplace_direction_up_button ="//div[contains(@id,'findreplace')]//div[contains(@class,'button')]//span[contains(@class,'up')]";
	public final String tsr_editTab_findAndReplace_direction_down_button ="//div[contains(@id,'findreplace')]//div[contains(@class,'button')]//span[contains(@class,'down')]";
	public final String tsr_editTab_findAndReplace_direction_backward_radioButton ="//div[contains(@name,'directionTwo')]//span[contains(@class,'radio')]";
	public final String tsr_editTab_findAndReplace_direction_forward_radioButton ="//div[contains(@name,'directionOne')]//span[contains(@class,'radio')]";
	public final String tsr_editTab_findAndReplace_ReplaceAll_Btn = "//span[(text()='Replace All')]";//span[(text()='Replace All') and contains(@id,'button')]";
	public final String tsr_editTab_findAndReplace_Replace_Btn = "//div[contains(@id,'findreplace')]//span[text()='Replace']";
	public final String tsr_editTab_findAndReplace_replaceAll_button_disabled ="//a[contains(@class,'disabled')]//span[(text()='Replace All') and contains(@id,'Button')]";
	public final String tsr_editTab_findAndReplace_replaceAll_confirmation_yesButton ="//div[contains(@id,'messages')]//div[contains(@id,'toolbar')]//span[contains(text(),'Yes')]";
	public final String tsr_editTab_findAndReplace_Close_Btn = "//span[(text()='Close') and contains(@id,'button')]";
	public final String tsr_editTab_findAndReplace_findNext_button ="//span[(text()='Find Next') and contains(@id,'Button')]";
	public final String tsr_editTab_findAndReplace_findNext_button_disabled ="//a[contains(@class,'disabled')]//span[(text()='Find Next') and contains(@id,'Button')]";
	public final String tsr_editTab_findAndReplace_findTab ="//div[contains(@id,'find')]//a[contains(@class,'tab-rotate-left')]//span[contains(@class,'find')]";
	public final String tsr_editTab_findAndReplace_readingHighlight_dropDown_button ="//div[contains(@class,'FindReplace')]//div[contains(@id,'panel')][contains(@class,'autocontainer')]//a//span[contains(text(),'Reading Highlight')]";
	public final String tsr_editTab_findAndReplace_readingHighlight_highlightAll_option ="//div[contains(@id,'menuitem')][not(contains(@class,'disabled'))]//a//span[contains(text(),'Highlight All')]";
	public final String tsr_editTab_findAndReplace_readingHighlight_clearHighlightning_option ="//div[contains(@id,'menuitem')][not(contains(@class,'disabled'))]//a//span[contains(text(),'Clear Highlighting')]";
	public final String tsr_editTab_findAndReplace_message_OK_btn = "//div[@id='messages-cmp']//span[text()='OK']";
	public final String tsr_editTab_findAndReplace_searchopenfiles_checkbox = "//input[contains(@name,'searchOpenedFiles')]/following-sibling::span[contains(@id,'checkbox')]";
	public final String tsr_editTab_findAndReplace_searchopenfiles_checkbox_checked = "//input[contains(@name,'searchOpenedFiles')][@aria-checked='true']/following-sibling::span[contains(@id,'checkbox')]";
	
	
	
	public final String tsr_editTab_show_Whitespaces_characters ="//a[contains(@class,'whitespacecharacteraction')]//span[contains(text(),'Whitespace')]";
	public final String tsr_editTab_show_Whitespaces_characters_btn_pressed ="//a[contains(@class,'whitespacecharacteraction')][contains(@class,'x-btn-pressed')]//span[contains(text(),'Whitespace')]";
	public final String editTab_preferences_Colors = "//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Colors')]";
	public final String editTab_preferences_Colors_Input = "//div[contains(@id,'colorpicker')]//input[contains(@id,'textfield')]";
	public final String editTab_preferences_Colors_OK_btn = "//div[contains(@id,'color')]//span[text()='OK']";
	public final String editTab_preferences_icons ="//div[contains(@class,'PreferencesButtons')]//a//span[contains(text(),'Icons')]";
	
	//Color Preferences
	public final String editTab_preferencesButton_Color_ItemName(String ItemName) {
		return "//div[contains(@id,'view')]//table//div[contains(text(),'"+ItemName+"')]";
		}
	
	public final String editTab_preferencesButton_Color_picker(String itemname) {
		return "//div[contains(@id,'view')]//div[contains(@id,'"+itemname+"')]";
		}
	
	//icons preferences
	public final String editTab_preferencesButton_icons_size(String Sizeicons) {
		return "//div[contains(@id,'radiogroup')]//label[contains(text(),'"+Sizeicons+"')]";//"//div[contains(@id,'radiofield')]//input[contains(@name,'"+Sizeicons+"')]";
		}
	
	public final String icons_size(String iconName, String iconSize) {
		return "//table[contains(@id,'button')]//tr//td//a[contains(@data-qtip,'"+iconName+"')]//span[contains(@class,'"+iconSize+"')]";
		}
	
	public final String translationTab_targetSegment_backgroundColor_forChanged(int rowNumber) {
		return "//div[contains(@id,'Grid')]//table[contains(@id,'tableview')][1]//iframe[contains(@style,'rgb(255, 0, 255)')]";//"//table[contains(@class,'grid')]//tr["+rowNumber+"]//td[3]//iframe[contains(@style,'background-color: rgb(228, 209, 255);')]";// "//table[contains(@class,'disable-browser-text-selection')]//tr["+rowNumber+"]//td[3]//iframe[contains(@style,'background-color: rgb(255, 209, 233);')]";
		}
	
	public final String translationTab_targetSegment_backgroundColor_forChangedDarkGreen(int rowNumber) {
		return "//div[contains(@id,'Grid')]//table[contains(@id,'view')]["+rowNumber+"]//td[contains(@style,'#32b033')]";
		}
	
	//Command Name
	public final String shortcut_commandName(String commandName) {
			return "//div[contains(text(),'"+commandName+"')]";
			}
	
	public final String tsr_shortcut_commandName_Order(int number,String commandName) {
		return "//table["+number+"]//div[contains(text(),'"+commandName+"')]";
		}
	
//Shortcuts	
	public final String tsr_shortcut_scheme_dropdown="//div[contains(@id,'keys')]//label[//span[text()='Scheme:']]/following-sibling::div//div[contains(@class,'arrow')]";
	public final String tsr_shortcut_scheme_Input="//div[contains(@id,'keys')]//label[//span[text()='Scheme:']]/following-sibling::div//input[contains(@name,'Scheme')]";		
	public final String tsr_shortcut_schemeValue(String SchemeName) {
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
	
	//Segment History
	public final String tsrtab_reviewHistory="//a//span[text()='Review History']";

	public final String tsrtab_segmentHistory_greencolor_changes="//span[contains(@class,'addedTextStyle') or contains(@style,'background-color: rgb(154, 255, 151')]";//"//span[contains(@style,'background-color:#9AFF97;') or contains(@style,'background-color: rgb(154, 255, 151);')]";

	public final String tsrtab_segmentHistory_TextFont="//div[contains(@class,'x-tabpanel-child x-container-default')]//table//td[3]//div[contains(@style,'16px')]";
	
	//Find and Replace
	public final String tsr_edittab_findandReplace_Checkbox_Unchecked_options(String divName,String labelName){
		return "//div[contains(@name,'"+divName+"')]//label[contains(text(),'"+labelName+"')]/preceding-sibling::input";
	}
	
	public final String tsr_edittab_findandReplace_Checkbox_Checked_options(String divName,String labelName){
		return "//div[contains(@name,'"+divName+"')][contains(@class,'checked')]//label[contains(text(),'"+labelName+"')]/preceding-sibling::input";
	}
	
	public final String tsr_edittab_findandReplace_Checkbox_options(String divName,String labelName){
		return "//div[contains(@name,'"+divName+"')]//label[contains(text(),'"+labelName+"')]/preceding-sibling::span";
	}
	
	public final String tsr_text_highlighted_target(int rowNumber) {
		return "//table[@class=' disable-browser-text-selection']/tr["+rowNumber+"]/td[3]/div//div[contains(@clstype,'highlight')]";
	}
	
	public final String tsr_text_highlighted_source(int rowNumber) {

		//return "//table[@class=' disable-browser-text-selection']/tr["+rowNumber+"]/td[2]/div//div[contains(@clstype,'highlight')]";
		return "//table[contains(@id,'gridview')]["+rowNumber+"]//td[contains(@class,'source')]//div[contains(@class,'highlight')]";
		       //table[contains(@id,'gridview')]["+rowNumber+"]//td[contains(@class,'source')]//div[contains(@class,'highlight')]
	}
	
	
	
	public final String tsr_editTab_preferencesButton_ofDifferent_tabs(String tabName) {
		return "//div[contains(@gs4trname,'"+tabName+"')][not(contains(@class,'hidden-offsets'))]//a[contains(@class,'preference')]//span[contains(text(),'Preferences')]";
		}

	public final String tsr_translationTab_status_Column_transcheckSegment_Image_Icon(int PartNo){
		
		//return "//table[contains(@id,'Part')]["+PartNo+"]//tr[contains(@id,'row')]["+RowNo+"]//td[contains(@id,'status')]//div//table//tr//td[contains(@class,'transcheck')]";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+PartNo+"]//tr[1]//td[contains(@class,'Status')]//div//table//tr//td[contains(@class,'transcheck')]";
	}
public final String tsr_translationTab_status_Column_VerifySegment_Image_Icon(int PartNo){
		
		return "//table[contains(@id,'view')]["+PartNo+"]//tr[contains(@class,'grid')]//td[contains(@class,'verifySegment')]//div[contains(@class,'verifySegment')]";
	}

	public final String tsr_transcheckTab_verifyWarningMessage(int rowNumber,String warningMessage)
	{
		return "//table[contains(@id,'view')]//tr["+rowNumber+"]//div[contains(text(),'"+warningMessage+"')]";
	}


	public final String fileTab_Download_ShowInstructions_window_Container_Div_Content(String instruction){
		//return "//div[contains(@id,'showinstructions')]//div[contains(@class,'gs4tr_Editor')][not(contains(@style,'none'))]/div/div/font[text()='"+instruction+"']";//"//div[contains(@id,'showinstructions')]//div[@class='x-container cat-msgBoxCont gs4tr_Editor_allow_selection x-tabpanel-child x-container-default'][not(contains(@style,'none'))]/span/div/font[text()='"+instruction+"']";
		return "//div[contains(@id,'showinstructions')]//div[contains(@class,'gs4tr_Editor')][not(contains(@style,'none'))]/div//font[text()='"+instruction+"']";
	}
	
	public final String tsr_fileTab_ShowInstructions_Hyperlink(String HyperlinkName){
		return "//div[contains(@id,'showinstruction')]//div[contains(@class,'Editor_allow_selection')]//font[contains(text(),'"+HyperlinkName+"')]";
	}	
	
	public final String tsr_sourceLanguage_rowSelected(int rowNumber) {
		//return "//table[contains(@id,'tblPart')]//tr["+rowNumber+"]//td[2][contains(@class,'rowclicked')]";
		//return "//div[contains(@id,'Grid')]//table["+rowNumber+"]//tr[1]//td[2][contains(@class,'sourceRowColor')]";
		return "//div[contains(@id,'Grid')]//table["+rowNumber+"]//tr[1][contains(@class,'actionColumnVisible')]//td[2][contains(@class,'source')]";
		}
	
	public final String tsr_dashboard_review_addGradingName(String gradingName)
	{
	return "//div[contains(@id,'boundlist')]//ul//li[text()='"+gradingName+"']";//"//div[contains(@name,'gradeDisplay-boundlist')]//ul//li[text()='"+gradingName+"']";
	}
	
	public final String tsr_dashboard_review_GradingName(String gradingName)
	{
	return "//div[contains(@id,'RatingAndScore')]//table//td[contains(@class,'ratingsColumn')]//div[contains(text(),'"+gradingName+"')]";//"//div[contains(@name,'gradeDisplay-boundlist')]//ul//li[text()='"+gradingName+"']";
	}
	
	public final String tsr_dashboard_review_MoreGradingName(String gradingName)
	{
	return "//table//td[contains(@class,'CommentsandratingsPreview')]//span[contains(text(),'"+gradingName+"')]";//"//div[contains(@name,'gradeDisplay-boundlist')]//ul//li[text()='"+gradingName+"']";
	}
	
	public final String tsr_dashboard_review_Verifycomment(String Comment)
	{
	return "//div[contains(@class,'commentPadding') and contains(text(),'"+Comment+"')]";//"//div[contains(@name,'gradeDisplay-boundlist')]//ul//li[text()='"+gradingName+"']";
	}
	
	public final String tsr_dashboard_review_commentAndRating_div(int row)
	{
	return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+row+"]//tr//td[5]";
	}
	
	public final String tsr_dashboard_review_addScoringName(String scoringName)
	{
	return "//div[contains(@id,'boundlist')]//ul//li[text()='"+scoringName+"']";//"//div[contains(@name,'scoreDisplay-boundlist')]//ul//li[text()='"+scoringName+"']";
	}
	
	public final String tsr_dashboard_review_addScoringNameIcon(int rownum)
	{
	return "//div[contains(@id,'TsrTxlif')]//table["+rownum+"]//td[contains(@class,'ColumnStatus')]//td[contains(@class,'StatusImgTable_gradescore')]";//"//div[contains(@name,'scoreDisplay-boundlist')]//ul//li[text()='"+scoringName+"']";
	}
	
	public final String tsr_dashboard_review_addScoringNameMandatoryRedFrame(int rownum)
	{
	return "//div[contains(@id,'TsrTxlif')]//table["+rownum+"]//td[contains(@class,'CommentsandratingsPreview')]";//"//div[contains(@name,'scoreDisplay-boundlist')]//ul//li[text()='"+scoringName+"']";
	}
	
	
	public final String tsr_dashboard_file_downloadReferenceFiles_fileName(String fileName)
	{
	return "//div[contains(@id,'catDialogsDownloadReferencesFiles')]//div[contains(@class,' x-grid-body')]//table//tr//div[text()='"+fileName+"']";
	}
	
	public final String tsr_dashboard_file_downloadReferenceFiles_fileName_checkbox_unchecked(String fileName)
	{
	return "//div[contains(@id,'DownloadReferencesFiles')]//table//tr//td[//div[contains(text(),'"+fileName+"')]]/preceding-sibling::td[contains(@class,'grid-dirty-cell')]";
	}
	
	public final String tsr_dashboard_file_downloadReferenceFiles_fileName_checkbox(String fileName)
	{
	return "//div[contains(@id,'DownloadReferencesFiles')]//table//tr//td[//div[contains(text(),'"+fileName+"')]]/preceding-sibling::td";
	}
	
	public final String tsr_dashboard_file_downloadSourceFiles_fileName(String fileName)
	{
	return "//div[contains(@id,'DownloadSourceFiles')]//div[contains(@class,' x-grid-body')]//table//tr//div[text()='"+fileName+"']";
	}
	
	public final String tsr_dashboard_file_showInstructions_instructionWindow_instructionTab_verifyInstructions(String submissionInstruction)
	{
	return "//div[contains(@class,'cat-msgBoxCont')]//div//font[text()='"+submissionInstruction+"']";//"//div[contains(@id,'showinstructions')]//div[contains(@class,'cat-msgBoxCont')][not(contains(@style,'display: none'))]//div[//font[text()='"+submissionInstruction+"']]";
	}
	
	public final String tsr_sourceLanguage_segmentNumber(int rowNumber) {
		return "//table[@class=' disable-browser-text-selection']/tr["+rowNumber+"]/td[2]/div";//"//table[@class=' disable-browser-text-selection']/tbody["+rowNumber+"]/tr/td[2]/div";
	}
	
	public final String tsr_TargetLanguage_segmentNumber(int rowNumber) {
		//return "//table[@class=' disable-browser-text-selection']/tr["+rowNumber+"]/td[3]/div";//"//table[@class=' disable-browser-text-selection']/tbody["+rowNumber+"]/tr/td[3]/div";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+rowNumber+"]//tr[1]//td[contains(@class,'targetColum')]";
	}
	
	
	public final String tsr_TargetLanguage_select_segmentNumber(int rowNumber) {
		return "//div[contains(@id,'Editor')]//table[contains(@class,'disable-browser-text-selection')]//tr["+rowNumber+"]//td[3]";
	}
	
	public final String targetSegmentIframeX(int partNo, int segmentNo)
	{
	//	return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tr/td[3]//iframe";//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tbody["+segmentNo+"]/tr/td[3]//iframe";		
		//return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tr/td[3]//iframe";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//tr//td[3]//iframe";
	}
	
	public final String targetSegmentselectedIframeDiv ="//html//body//div[contains(@id,'content')]";
	public final String targetSegmentselectedIframeDivX ="//html//body//div[contains(@id,'currentEditor')][contains(@contenteditable,'true')]";
	public final String targetSegmentselectedIframeDiv_highlighted ="//html//body//div[contains(@class,'highlight')]";
	
	public final String tsr_sourceLanguage_selectFrame(int rowNumber) {
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+rowNumber+"]//td[2]//div";//"//table[@class=' disable-browser-text-selection']/tr["+rowNumber+"]/td[2]/div";//"//table[@class=' disable-browser-text-selection']/tbody["+rowNumber+"]/tr/td[1]/div";
	}

	public final String targetSegmentX(int partNo, int segmentNo)
	{
		//return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tr["+segmentNo+"]/td[3]/div/div[contains(@id,'content')]";
		//return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tbody["+segmentNo+"]/tr/td/div/div[not(contains(@id,'source'))]";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//tr["+segmentNo+"]//td[contains(@class,'targetColum')]";
		
	}
	
	public final String targetSegmentFilterX(int partNo, int segmentNo)
	{
		//return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tr["+segmentNo+"]/td[3]/div/div[contains(@id,'content')]";
		//return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tbody["+segmentNo+"]/tr/td/div/div[not(contains(@id,'source'))]";
		//return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//tr["+segmentNo+"]//td[contains(@class,'targetColum')]";
		
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//tr["+segmentNo+"]//td[contains(@class,'targetColum')]//div[contains(@id,'target')]";
	}

	public final String noOfSegments(int partNo)
	{
		return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tr/td/div/div[contains(@id,'source')]";//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tbody/tr/td/div/div[contains(@id,'source')]";//user get xpath count() of selenium;
	}
	
	
	public final String tsr_segmment_tooltip(int SegmentNo)
	{
		
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+SegmentNo+"]//div[contains(@class,'icon')]";
	}
	
	
	public final String selectSegmentX(int partNo, int segmentNo)
	{
	//	return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]/tr["+partNo+"]/td/div/div[contains(@id,'source')]";//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tbody["+segmentNo+"]/tr/td/div/div[contains(@id,'source')]";
	//	return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'BodyTable')]//table[contains(@id,'Part')]/tr["+partNo+"]/td/div/div[contains(@id,'source')]";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//tr//td[contains(@class,'sourceColum')]";
	}
	
	public final String tsr_sourceSegment_withSegmentNumber_andText(int segmentNumber,String segmentText)
	{
		//return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]/tr["+segmentNumber+"]/td/div/div[contains(@id,'source')][text()='"+segmentText+"']";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+segmentNumber+"]//td[2]//div[contains(@id,'source')][contains(text(),'"+segmentText+"')]";
	}
	
	public final String tsr_TargetSegment_withSegmentNumber_andText(int segmentNumber,String segmentText)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+segmentNumber+"]//td[3]//div[contains(@id,'target')][contains(text(),'"+segmentText+"')]";
	}
	
	public final String tsr_targetSegment_withSegmentNumber_andText(int segmentNumber,String segmentText)
	{
		//return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]/tr["+segmentNumber+"]/td/div/div[contains(@id,'tblt')][contains(text(),'"+segmentText+"')]";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+segmentNumber+"]//td[3]//div[contains(@id,'target')][contains(text(),'"+segmentText+"')]";
	}
	
	public final String tsr_targetSegment_withSegmentNumber_andSpecialText(int segmentNumber,String segmentText)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+segmentNumber+"]//td[3]//div[contains(@id,'target')][contains(text(),'"+segmentText+"')]";//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]/tr["+segmentNumber+"]/td/div/div[contains(@id,'tblt')][contains(text(),'"+segmentText+"')]";
	}
	
	
	public final String tsr_dashboard_notesTab_verifyDetails(String detail)
	{
		return "//div[contains(@id,'notesviewtab')]//div[contains(@id,'tblBodyTable')]//table//tr//td[contains(@id,'noteDetails')]/div[text()='"+detail+"']";
	}
	
	public final String tsr_dashboard_reviewTab_reviewStatus_forGrade(String gradeName)
	{
	//return "//table[contains(@id,'tblPart')]//tr//td//span[contains(text(),'"+gradeName+"')]";//"//table[contains(@id,'tblPart')]//tr//td//span[b[contains(text(),'"+gradeName+"')]]";
	return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//tr//td//span[contains(text(),'"+gradeName+"')]";
	}
	
	public final String tsr_dashboard_review_addNewRating(int row)
	{
		return"//div[contains(@id,'ColumnRatingAndScore')]["+row+"]//a//span[contains(text(),'Add New Rating')]";
		//return "//div[contains(@id,'TsrTxliffGrid')]//table["+row+"]//span[contains(text(),'Add New Rating')]";
	}
	
	public final String tsr_dashboard_reviewTab_reviewStatus_forScore(String scoreName)
	{
	//return "//table[contains(@id,'tblPart')]//tr//td//span[contains(text(),'"+scoreName+"')]";
	//return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//tr//td//div[contains(text(),'"+scoreName+"')]";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//tr//td//span[contains(text(),'"+scoreName+"')]";
	}
	
	public final String tsr_dashboard_reviewTab_reviewComment_forGSmodel(String comment)
	{
	return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//tr//td//span[contains(text(),'"+comment+"')]";
	}
	
	//context match segment.
	public final String tsr_targetSegmentContextMatchedX(int partNo)
	{
		return "//table[contains(@id,'tableview')]["+partNo+"]//td[contains(@class,'score')][contains(@style,'#82F9D2')]//div[text()='100+%']";//"//table[contains(@id,'Part')]/tr["+partNo+"]/td[contains(@id,'score')][contains(@style,'rgb(130, 249, 210)')]//div[text()='100+%']";
	}
	
	//Status Bar
		public final String tsr_dashboard_statusBar_language(String languages)
		{
		return "//div[contains(@id,'statusbar')]//label[contains(text(),'"+languages+"')]";
		}

		
	public final String translationTab_targetSegment_backgroundColor_forSegmentCommit(int rowNumber) {
		//return "//table[contains(@class,'disable-browser-text-selection')]//tr["+rowNumber+"]//td[3]//iframe[contains(@style,'background-color: rgb(228, 209, 255)')]";
		return "//table[contains(@id,'gridview')]["+rowNumber+"]//td[contains(@style,'background-color: rgb(209, 255, 209)') or contains(@style,'background-color: rgb(228, 209, 255)') or contains(@style,'background-color:#E4D1FF')]";
			}
	
	
	public final String tsr_tab_lookup_tab_more_options_unchecked(String optionName){
		return "//div[contains(@id,'menu')]//div[contains(@class,'item-unchecked')]//a//span[contains(text(),'"+optionName+"')]";//"//div[contains(@id,'menu')]//a//span[contains(text(),'"+optionName+"')]";//"//div[contains(@id,'menucheckitem')][contains(@class,'un')]//a[span[contains(text(),'"+optionName+"')]]";
	}
	
	public final String tsr_tab_lookup_tab_more_options_checked(String optionName){
		return "//div[contains(@id,'menu')]//div[contains(@class,'item-checked')]//a//span[contains(text(),'"+optionName+"')]";//"//div[contains(@id,'menucheckitem')][not(contains(@class,'un'))]//a[span[contains(text(),'"+optionName+"')]]";
	}
	
	public final String tmLookup_sourceAndTargetSegment(String segment)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//div[contains(text(),'"+segment+"')]";
	}
	
	public final String translationTab_blockSourceNumberX(int rowNumber) {
		//return "//table[@class=' disable-browser-text-selection']/tr["+rowNumber+"]/td[2]/div";//"//table[@class=' disable-browser-text-selection']/tbody["+rowNumber+"]/tr/td[2]/div";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+rowNumber+"]//tr[1]//td[2]//div";
	}
	
	public final String translationTab_blockSourceNumberX_target(int rowNumber) {
		//return "//table[@class=' disable-browser-text-selection']/tr["+rowNumber+"]/td[3]/div";//"//table[@class=' disable-browser-text-selection']/tbody["+rowNumber+"]/tr/td[3]/div";
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+rowNumber+"]//tr[1]//td[contains(@class,'targetColum')]//div[contains(@id,'target')]";
	}
	
	public final String tsr_targetSegment_highlighted(int rowNum,String text)
	{
		//return "//table[contains(@id,'tableview')]/tr["+rowNum+"]//div[contains(text(),'"+text+"')]/following-sibling::div[contains(@class,'highlightDif')]";
		//return "//table[contains(@id,'tableview')]["+rowNum+"]//tr[1]//div[contains(text(),'"+text+"')]";
		return "//table[contains(@id,'view')]["+rowNum+"]//tr[1]//td[//div[contains(text(),'"+text+"')]]/following-sibling::td[contains(@class,'Status')]//table[contains(@class,'StatusColum')]//td[contains(@class,'smallStatusImgTable')]";
	}
	
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
	
	public final String selectedSourceTags(int rowNumber, int tagNumber)
	{
		//return "//div[contains(@id,'Body')]/table[contains(@id,'Part')]/tr["+rowNumber+"]//td//img["+tagNumber+"][contains(@src,'select')]";
		//return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+rowNumber+"]//tr//td//img["+tagNumber+"][contains(@src,'select')]";
		return "//div[contains(@id,'TsrTxlif')]//table["+rowNumber+"]//td//img["+tagNumber+"][contains(@src,'tablewitheditor')]";
	}
	
	public final String tsr_targetSegment_BOLD_tagPresent(int rowNumber, int tagNo)
	{
		return "//div[contains(@id,'Grid')]//table["+rowNumber+"]//td[3]//div/img[@tagid='"+tagNo+"'][contains(@title,'bold')]";
	}
	
	public final String tsr_targetSegment_Numbered_tagPresent(int rowNumber, int tagNo)
	{
		return "//div[contains(@id,'Grid')]//table["+rowNumber+"]//td[3]//div/img[@tagid='"+tagNo+"'][contains(@title,'fontFormat')]";
	}
	
	public final String tso_translationTab_TMList_closeButton="//div[contains(@id,'toolbar')]//a//span[contains(text(),'Close')]";
	
	public final String tsr_targetSegment_tagPresent(int rowNumber, int tagNo)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+rowNumber+"]//tr//td[3]//div[contains(@id,'target')]//img[contains(@tagid,'"+tagNo+"')]";
	}
	
	
	//Uncofirm/Confirm
	public final String tsr_translationTab_Confirm_OR_Unconfirm_Button ="//a[contains(@class,'unconfirmconfirm')]//span[contains(@id,'btnInner')]";
	public final String tsr_translationTab_Confirm_OR_UnconfirmAll_Button ="//a[contains(@class,'unconfirmconfirmall')]//span[contains(@id,'btnInner')]";
	public final String tsr_translationTab_Confirm_OR_UnconfirmAllButton_dropDown_button ="//a[contains(@class,'confirmall')]//span[contains(@class,'arrow')]";
	public final String tsr_translationTab_Confirm_OR_UnconfirmAllButton_dropDown_unconfirmAll ="//a[contains(@class,'menu-item-link')]//span[contains(text(),'Unconfirm All')]/following-sibling::div";
	public final String tsr_translationTab_Confirm_OR_UnconfirmAllButton_dropDown_confirmAll ="//a[contains(@class,'menu-item-link')]//span[contains(text(),'Confirm All')]/following-sibling::div";

	
	public final String tsr_translationTab_status_Column_Unconfirmed_Image_Icon(int PartNo,int RowNo){
		
		//return "//table[contains(@id,'Part')]["+PartNo+"]//tr[contains(@id,'row')]["+RowNo+"]//td[contains(@id,'status')]//div//table//tr//td[contains(@class,'unconfirm')]";
		return "//table[contains(@id,'view')]["+PartNo+"]//tr//td[contains(@class,'Status')]["+RowNo+"]//div//table//tr//td[contains(@class,'unconfirm')]";
	}
	
	public final String tsr_reviewTab_addEditNotesWindow_label(String labelName)
	{
		return "//div[contains(@id,'addeditnotes')]//label//span[contains(text(),'"+labelName+"')]";
	}
	
	public final String tsr_status_notes_Icon_forRow(int rowNumber)
	{
		//return "//table[contains(@id,'tblPart')]//tr["+rowNumber+"]//table[contains(@class,'StatusColum')]//td[contains(@class,'smallStatusImgTable')]";
		return "//table[contains(@id,'view')]["+rowNumber+"]//tr[1]//table[contains(@class,'StatusColum')]//td[contains(@class,'smallStatusImgTable')]";
		
	}
	
	public final String tsr_notesTab_notesCreatorID(int rowNumber,int ColumnNum, String notesText)
	{
		return "//div[contains(@id,'NotesViewGrid')]//table[contains(@id,'view')]//tr["+rowNumber+"]//td["+ColumnNum+"]//div[contains(text(),'"+notesText+"')]";
	}
	
	public final String tsr_notesTab_dynamicIdsize(int rownumber,int IDnumber)
	{
		return "//div[contains(@name,'notesTable')]//table//tr["+rownumber+"]//td[1]//div[contains(@style,'16px') and contains(text(),"+IDnumber+")]";
	}
	
	
	public final String tsr_reviewTab_addEditNotesWindow_select_typeName(String typeName)
	{
		return "//div[contains(@name,'addEditNoteType-boundlist')]//li[contains(text(),'"+typeName+"')]";
	}
	
	public final String tsr_notes_Tab_firstDataRow(int partNo, int rowNo)
	{
		//return "//div[contains(@id,'notesviewtable')]//table[contains(@id,'Part')]["+partNo+"]//tr[contains(@id,'row')]["+rowNo+"]";
		return "//div[contains(@id,'NotesViewGrid')]//table[contains(@id,'view')]["+partNo+"]//tr["+rowNo+"]";
	
	}
	
	public final String tsr_translationTab_SourceFileTab_closeButton="//div[contains(@id,'toolbar')]//a//span[contains(text(),'Close')]";
	
	public final String tsr_notesTab_notesDetail(int rowNumber, String notesText)
	{
		//return "//div[contains(@id,'tblBodyTable')]//table[contains(@id,'notesview')]//tr["+rowNumber+"]//td//div[contains(text(),'"+notesText+"')]";
		return "//div[contains(@id,'NotesViewGrid')]//table[contains(@id,'view')]["+rowNumber+"]//tr[1]//td//div[contains(text(),'"+notesText+"')]";
	}
	public final String tsr_notesTab_notesDetail_withType(int rowNumber, String notesText, String Type)
	{
		//return "//div[contains(@id,'tblBodyTable')]//table[contains(@id,'notesview')]//tr["+rowNumber+"]//td//div[contains(text(),'"+notesText+"')]";
		return "//div[contains(@id,'NotesViewGrid')]//table[contains(@id,'view')]["+rowNumber+"]//tr[1]//td[//div[contains(text(),'"+notesText+"')]]/preceding-sibling::td//div//div[contains(text(),'"+Type+"')]";
	}
	
	public final String tsr_notesTab_notesDetail_columnNumber(int rowNumber, int columnNumber)
	{
		//return "//div[contains(@id,'tblBodyTable')]//table[contains(@id,'notesview')]//tr["+rowNumber+"]//td["+columnNumber+"]";
		return "//div[contains(@id,'NotesViewGrid')]//table[contains(@id,'view')]//tr["+rowNumber+"]//td["+columnNumber+"]//div";
	}
	
	public final String tsr_projectFiles_file(String partialFileName)
	{
		return "//table[contains(@id,'treeview')]//tr//span[contains(text(),'"+partialFileName+"')]";
	}
	
	//Multi editor *(asteric) marked file
	public final String tsr_multiEditor_File_name_with_asteric_sign(String Filename){
		return "//div[contains(@id,'multiplyfileeditor')]//div[contains(@id,'tabbar')]//a//span[contains(text(),'*"+Filename+"')]";
	}
	
	public final String tsr_multiEditor_File_name(String Filename){
		return "//div[contains(@id,'multiplyfileeditor')]//div[contains(@id,'tabbar')]//a//span[contains(text(),'"+Filename+"')]";
	}
	
	public final String tsr_edittab_findandReplace_findWhat_input_suggestion_dropDownList(String findWhat){
		return "//div[contains(@name,'replaceFindWhat')]//ul//li[contains(text(),'"+findWhat+"')]";
	}
	
	//TM LOOKUP
	public final String tsr_tmLookup_ColumnHeader(int ColumnNumber,String text)
	{
		return "//div[contains(@id,'tmlookup')]//div[contains(@id,'headercontainer')]//div//div//div["+ColumnNumber+"]//span[contains(text(),'"+text+"')]";
	}
	//source and target column header
	public final String tsr_source_ColumnHeader(String SourceLanguage)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//div[contains(@class,'x-column-header-text-container')]//span[text()='"+SourceLanguage+"']";
	}
	public final String tsr_target_ColumnHeader(String TargetLanguage)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//div[contains(@class,'x-column-header-text-container')]//span[contains(text(),'"+TargetLanguage+"')]";
	}
	
	
	public final String tsr_metadatatab_value(int ColumnNumber,String value)
	{
		return "//div[contains(@class,'context-component-grid')]//table//td['"+ColumnNumber+"']//div[contains(text(),'"+value+"')]";
	}
	
	public final String tsr_tmLookup_sourceSegment_searchText(String text)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//td[2]//span[contains(text(),'"+text+"')]";
	}
	
	public final String tsr_tmLookup_targetSegment_searchText(String text, int columnNumber)
	{
		return "//div[contains(@name,'ReviewHistory')]//table[contains(@id,'view')]//tr[contains(@class,'grid')]//td['"+columnNumber+"']//div[contains(text(),'"+text+"')]";
	}
	
	public final String tsr_tmLookup_targetSegment_withtable_searchText(String text,String rownumber, int columnNumber)
	{
		return "//div[contains(@class,'tmlookup')]//table[contains(@id,'gridview')]['"+rownumber+"']//tr[contains(@class,'grid')]//td['"+columnNumber+"']//span[2][contains(text(),'"+text+"')]";
	}
	
	public final String tsr_tmLookup_targetSegment_withtable_searchText1(String text,String rownumber, int columnNumber)
	{
		return "//div[contains(@class,'tmlookup')]//table[contains(@id,'gridview')]['"+rownumber+"']//tr[contains(@class,'grid')]//td['"+columnNumber+"']//span[contains(text(),'"+text+"')]";
	}
	
	public final String tsr_tmLookupTab_tmLookUp_details(int columnNumber,String text)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//td["+columnNumber+"]//div[contains(text(),'"+text+"')]";
	}
	public final String tsr_tab_lookup_Score_DiffferentColour(String text,String Colour){
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//td[4][contains(@style,'rgb("+Colour+")')]//div[contains(text(),'"+text+"')]";
	}
	public final String tsr_tab_lookup_Score_DiffferentColour(int rowNumber, String text,String Colour,String colorcode){
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]["+rowNumber+"]//tr//td[4][contains(@style,'rgb("+Colour+")') or contains(@style,'"+colorcode+"')]//div[contains(text(),'"+text+"')]";
	}
	public final String tmLookup_Tab_details_InformationIcon(int divNo ,String segment)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]//tr//td["+divNo+"]//div//div[contains(text(),'"+segment+"')]";
	}
	public final String tsr_tmLookupTab_tmLookUp_Search_Term_Highlighted(int TableNumber,int ColumnNumber,String text)
	{
		return "//div[contains(@id,'tmlookup')]//table[contains(@id,'view')]["+TableNumber+"]//tr//td["+ColumnNumber+"]//span[contains(text(),'"+text+"')][contains(@style,'#C0C0C0')]";
	}
	
	//Segment History
	//TODO - To use this locator you need to clear the segment Text, as this locator is to check for line through text
	public final String tsrtab_segmentHistory_changedValue(String segmentText){
		return "//div[contains(@class,'segmenthistory-Component')]//span[contains(@class,'missingTextStyle') or contains(text(),'"+segmentText+"')]";//"//span[contains(@style,'background-color: rgb(255, 64, 64);') or contains(@style,'text-decoration:line-through;')][contains(text(),'"+segmentText+"')]";

	}	
	public final String tsrtab_segmentHistoryTab_checkDetails(int rowNumber,String segmentText) throws Exception{
		if(BrowserFactory.SystemEngine().verifyElementPresent("//div[contains(@id,'reviewhistory')]//table[contains(@id,'view')]["+rowNumber+"]//td//div[contains(text(),'"+segmentText+"')]",5)==true){
		return "//div[contains(@id,'reviewhistory')]//table[contains(@id,'view')]["+rowNumber+"]//td//div[contains(text(),'"+segmentText+"')]";
		}else{
		return "//div[contains(@id,'reviewhistory')]//table[contains(@id,'view')]["+rowNumber+"]//td//span[contains(text(),'"+segmentText+"')]";	
		}
	}	
	
	public final String tsotab_segmentHistoryTab_checkDetailsNew(int rowNumber,String segmentText) 
	{
	return "//div[contains(@class,'segmentHistory')]//table[contains(@id,'gridview')]["+rowNumber+"]//td["+segmentText+"]//div[contains(@class,'segmenthistory')]";
}	
	
	
	//Table Filter
	
	public final String tsr_tableFilter_dropDown_trigger ="//div[contains(@name,'ContentFilter')]//div[contains(@class,'arrow-trigger')]";
	public final String tsr_translationtab_Filter_Drop_down_btn="//div[contains(@id,'search')]//div[contains(@name,'Filter')and not(contains(@name,'Content'))]//div[contains(@id,'trigger-picker')][contains(@class,'arrow-trigger')]";
	public final String tsr_translationtab_Filter_inputbox="//div[contains(@name,'appFilter')]//input[contains(@name,'appFilter')]";
	public final String tsr_tableFilter_searchSegment_inputBox ="//input[contains(@name,'Search')]";
	public final String tsr_tableFilter_filterAction_button ="//a[contains(@data-qtip,'Filter Action')]//span[contains(@class,'filterButton')]";
	public final String tsr_tableFilter_matchCase_checkbox_checked="//div[contains(@name,'CaseSensitive')][contains(@class,'checked')]//span[contains(@class,'checkbox')]";
	public final String tsr_tableFilter_matchCase_checkbox="//div[contains(@name,'CaseSensitive')]//span[contains(@class,'checkbox')]";
	public final String translationtab_Filter_search_btn="//a[contains(@data-qtip,'Filter Action')]//span[contains(@class,'filterButton')]";
	public final String tsr_projectFiles_chaincolumn_diffrentiate="//div[contains(@id,'TsrTxli')]//table[contains(@id,'view')]//td[contains(@class,'chainFilesIdCol')]";
	public final String translationtab_Filter_filterConfiguration_btn="//span[contains(@class,'PanelSettings')]";
	public final String translationtab_Filter_filterConfiguration_MaxWordCount_input_box="//input[contains(@name,'p_maxWordCount')]";
	public final String translationtab_Filter_filterConfiguration_OK_btn="//span[contains(text(),'OK')]";
	public final String tsr_tableFilter_Regex_checkbox ="//input[contains(@name,'Regex')]/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_tableFilter_Regex_checkbox_checked ="//input[contains(@name,'Regex')][@aria-checked='true']/following-sibling::span[contains(@class,'checkbox')]";
	public final String tsr_translationtab_Filter_Reset_search_btn="//a[contains(@data-qtip,'Reset Toolbar Fields')]//span[contains(@class,'resetButton')]";
	public final String tsr_ChainFile_Confirm_Unconfirm_Status(int rownumber)
	{
		return "//div[contains(@id,'multiplyfileeditor')][contains(@class,'docked')]//div[contains(@aria-expanded,'true')]//table["+rownumber+"]//table[contains(@class,'StatusColumn')]//tr//td[contains(@class,'unconfirm')]";
	}
	
	public final String tsr_ChainFile_LockSegment_Status(int rownumber)
	{
		return "//div[contains(@id,'TsrTxliffGrid')]//table["+rownumber+"]//td[6]//div[contains(@style,'StatusColumn')]//table[1]//tr//td[contains(@data-qtip,'Locked segment')]";//"//div[contains(@id,'multiplyfileeditor')][contains(@class,'docked')]//div[contains(@aria-expanded,'true')]//table["+rownumber+"]//table[contains(@class,'StatusColumn')]//tr[2]//td[contains(@class,'StatusImgT')]";
	}
	
	public final String tsr_LockSegment_Status(int rownumber)
	{
		//return "(//div[contains(@id,'TsrTxliffGrid')]//table["+rownumber+"]//table[contains(@class,'StatusColumn')]//tr[2]//td[contains(@class,'lockedsegment')])[2]";//"//div[contains(@id,'multiplyfileeditor')][contains(@class,'docked')]//div[contains(@aria-expanded,'true')]//table["+rownumber+"]//table[contains(@class,'StatusColumn')]//tr[2]//td[contains(@class,'StatusImgT')]";
		//return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+rownumber+"]//div[@class='x-grid-cell-inner '])[6]//table[1]//td[contains(@class,'lockedsegment')]";	
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+rownumber+"]//table[1]//td[contains(@class,'lockedsegment')]";
	}
	
	public final String translationtab_Filter_filterConfiguration_MaxWordCount_trigger(String option){
		return "//div[contains(@class,'FilterConfiguration')]//div[contains(@class,'spinner-"+option+"')]";
	}
	
	public final String translationTab_Filter_drop_down_list_options(String list_option) throws Exception{
		if(BrowserFactory.SystemEngine().verifyElementPresent("//div[contains(@name,'filter-boundlist')]//div//li[contains(text(),'"+list_option+"')]", 5)) {
			return "//div[contains(@name,'filter-boundlist')]//div//li[contains(text(),'"+list_option+"')]";
		}else {
			return "//div[contains(@name,'Filter-boundlist')]//div//li[contains(text(),'"+list_option+"')]";
		}
	}
	
	public final String tsr_tableFilter_filterSearchOption_select(String filterSearchOption){
		return "//div[contains(@name,'ContentFilter-boundlist')]//li[contains(text(),'"+filterSearchOption+"')]";
	}
	
	//SORT
	public final String tsr_sort_dropDown_trigger ="//div[contains(@name,'Sort')]//div[contains(@class,'arrow-trigger')]";

	public final String tsr_sort_dropDown_options(String sortOption){
		return "//div[contains(@name,'Sort-boundlist')]//li[contains(text(),'"+sortOption+"')]";
	}
	
	//Leverage
	public final String tsr_translationTab_LeverageButton ="//a[contains(@class,'leverageaction')]//span[contains(text(),'Leverage')]";

	public final String tsr_Onlinefile_showInstructions_instructionWindow_backgroundInstructionTab="//div[contains(@id,'showinstructionsfrompd')]//div[contains(@aria-expanded,'true')]//div[contains(@data-ref,'innerCt')]";

	public final String targetSegment100ScoreX(int partNo)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//tr[1]//td[4][contains(@style,'background-color: rgb(209, 255, 209)')]//div[text()='100%']";
	}
	
	public final String targetSegment100Score_WithoutColour(int partNo,String Percentage)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//tr[1]//td[4]//div[text()='"+Percentage+"']";
	}
	public final String targetSegmentScore_WithoutColour(int partNo,String Percentage)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]//table["+partNo+"]//tr[1]//td[4]//div[text()='"+Percentage+"']";
	}
	public final String mainTabs_translation = "//span[text()='Translation']";

	public final String tsr_transcheckTab_warning_explaination_cause_Details(String ErrorText){
		return "//div[contains(@id,'transcheck')]//table//tr//td//div[contains(@class,'div')][contains(text(),'"+ErrorText+"')]";
	}
	public final String scoreForSegmentX(int rowNumber, int partNo)
	{
		return "//div[contains(@id,'panel')][contains(@aria-expanded,'true')]//div[contains(@id,'Grid')]["+partNo+"]//tr//td[4]/div";//"//div[contains(@id,'Body')]/table[contains(@id,'Part')]["+partNo+"]/tr/td[4]/div";

	}

//Sprint 22	
	public final String tsr_editTab_preferences_warnings_ShowTrancheckUnlockWarning_checkbox_checked ="//div[contains(@name,'ShowUnlockSegment')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_UneditedFuzzyMatch_checkbox_checked ="//div[contains(@name,'uneditedfuzzy')][contains(@class,'checked')]//span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_UneditedFuzzyMatch_checkbox ="//input[contains(@name,'uneditedfuzzy')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_TranscheckSegmenetswhileTranslating_checkbox_checked ="//input[contains(@name,'activateTranscheck')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_TranscheckSegmenetswhileTranslating_checkbox ="//input[contains(@name,'activateTranscheck')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_CopyAllSource_checkbox_checked ="//input[contains(@name,'appShowCopyAllSource')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_EndOfDocument_checkbox_checked ="//input[contains(@name,'ShowEOF')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_EndOfDocument_checkbox ="//input[contains(@name,'ShowEOF')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_RemoveSegmenettags_checkbox_checked ="//input[contains(@name,'RemoveSegmentTags')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_RemoveSegmenettags_checkbox ="//input[contains(@name,'RemoveSegmentTags')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_RemoveAlltags_checkbox_checked ="//input[contains(@name,'RemoveAllTags')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_RemoveAlltags_checkbox ="//input[contains(@name,'RemoveAllTags')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_trancheck_warningDialog_close_Icon="//div[contains(@id,'window')][contains(@class,'closable')][not(contains(@class,'-hidden-offsets'))]//div[@data-qtip='Close panel']";
	
	public final String tsr_editTab_preferences_Transcheck_RemoveAllTarget_checkbox_checked ="//input[contains(@name,'RemoveAllTarget')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_RemoveAllTarget_checkbox ="//input[contains(@name,'RemoveAllTarget')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	
	public final String tsr_editTab_preferences_Transcheck_ShowDuplicateShortcut_checkbox_checked ="//input[contains(@name,'ShowDuplicateShortcut')][contains(@id,'checkbox')][@aria-checked='true']/following-sibling::span[contains(@class,'form-checkbox')]";
	public final String tsr_editTab_preferences_Transcheck_ShowDuplicateShortcut_checkbox ="//input[contains(@name,'ShowDuplicateShortcut')][contains(@id,'checkbox')]/following-sibling::span[contains(@class,'form-checkbox')]";
	
	public final String translationTab_copyAllSourceButton() throws Exception{
		if(BrowserFactory.SystemEngine().verifyElementPresent(TSO_main_Locators.exts().translationTab_copySourceButton_disabled, 5)){
			BrowserFactory.SystemEngine().findElement(TSO_main_Locators.exts().selectSegmentX(1, 1)).click();	
			Thread.sleep(1000);
		}
		return "//a[contains(@class,'CopySourceAll')]";
	}
	
	
	public final String GoBackToFixIssue_Button = "//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span[text()='Go back to fix issue']";
	public final String Continue_Button = "//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span[text()='Continue']";
	public final String DoNotwarnMeAboutthisAnyMore_Button = "//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//div[contains(@name,'checkboxAsk')]";
	public final String DoNotwarnMeAboutthisAnyMore_Checkbox = "//div[contains(@name,'CheckboxAsk')]//input[contains(@name,'CheckboxAsk')][contains(@aria-checked,'false')]/following-sibling::span";//"//div[contains(@name,'checkboxAsk')]//input[contains(@name,'checkboxAsk')][contains(@aria-checked,'false')]/following-sibling::span";
	
	public final String tsr_SelectSegmentHighligted(int Partno){
	return "//table[contains(@class,'grid')]["+Partno+"]//tr//td[3]//iframe";//"//table[contains(@class,'grid')]["+Partno+"]//tr//td[3]//iframe[contains(@style,'background-color: rgb(255, 209, 233);')]";
	}
	
	public final String tsr_SelectSegmentHighligted_withColour(int Partno, String colourcode){
		return "//table[contains(@id,'view')]["+Partno+"]//td[contains(@style,'"+colourcode+"')]";//"//table[contains(@id,'tableview')]["+Partno+"]//td[contains(@style,'background-color: rgb("+colourcode+")')]";
		}
	
	public final String tsr_dashboard_transStudio4Tab_currentProject_button_X() throws Exception{
		if(BrowserFactory.SystemEngine().verifyElementPresent("//a[contains(@class,'focus')]//div[contains(@class,'currentproject')]",5)==true){
			System.out.println("BOLD");
		return "//a[contains(@class,'focus')]//div[contains(@class,'currentproject')]";
		}else{
			System.out.println("NON-BOLD");
		return "//a[not(contains(@class,'focus'))]//div[contains(@class,'currentproject')]";	
		}
	}	
	
	public final String tsr_currentproject_projectfiles_FileExpandandCollapse_icon(String Foldername)
	{
		return "//table[contains(@id,'treeview')]//tr//span[contains(text(),'"+Foldername+"')]/preceding-sibling::div[contains(@class,'expander')]";
	}
	public final String tsr_currentProject_searchFile_inputBox ="//input[contains(@name,'input')]";
	
	public final String tsr_currentproject_ColumnNameVerify(int ColumnNumber, String FirstColumnName,String ColumnToVerify)
	{
		return "//div[contains(@id,'catprojectview')]//div["+ColumnNumber+"][//label[contains(text(),'"+FirstColumnName+"')]]/following-sibling::div[//label[contains(text(),'"+ColumnToVerify+"')]]";
	}
	public final String tsr_currentproject_projectfiles_sourceFile_status(int rowNum, String fileName,String status  )
	{
		return "//table[contains(@id,'view')]["+rowNum+"]//tr[//td//span[contains(text(),'"+fileName+"')]]//td//div[contains(text(),'"+status+"')]";
	} 
	
	public final String tsr_ProjectTM_TranslationMemory_inputBox ="//input[contains(@placeholder,'Translation Memory')]";
	
	public final String tsr_CurrentProject_RefrencFile_Search_inputBox ="//input[contains(@placeholder,'File Name')]";
	
	//General Button Verification below Tab
		public final String tsr_currentproject_ButtonAlignment_Verify(String Button1,String Button2){
			return "//td//a[contains(@class,'"+Button1+"')]/../following-sibling::td//a[contains(@class,'"+Button2+"')]";
			
		}
		
		
		public final String tsr_whitespace_symbol_iframe () throws Exception{
			/*if(BrowserFactory.verifyElementPresent("//html//body//div[contains(@style,'font-family:WscFont, Arial')]",10)==true){
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





