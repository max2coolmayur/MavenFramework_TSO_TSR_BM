package org.qa.locators;
/*Created by Alfonso Almanza
 * 01/27/11 translations.com
 */
public class PD4_workflow_panel_Locators {
	private static PD4_workflow_panel_Locators ue;
	
	public static synchronized PD4_workflow_panel_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_workflow_panel_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_workflow_panel_Locators();
		}
		return ue;
		
	}
	//Workflow Definitions Locators//Workflow Definitions Locators
	public final String addWorkflowDefinitionButton = "//span[contains(@id,'add_workflow')]";	
	public final String downloadWorkflowDefinitionButton = "//span[contains(@id,'download_workflow')]";
	public final String editWorkflowDefinitionButton = "//span[contains(@id,'edit_workflow')]";
	public final String importWorkflowDefinitionButton = "//span[contains(@id,'import_workflow')]";	
	public final String inputWorkflowDefinitionFileName = "css=input.x-form-file";
	public final String add_editWorkflow_inputWorkflowDefinitionName = "//input[@name='wfDefinitionName']";
	public final String addWorkflow_addHumanStep = "//a[contains(@data-qtip,'human')]/span";
	public final String add_editWorkflow_addAutomaticStep = "//a[contains(@data-qtip,'automatic')]/span";
	public final String add_editworkflow_editStep = "//a[contains(@data-qtip,'Edit workflow step')]//span[text()='Edit']/following-sibling::span";
	public final String add_editworkflow_removeStep = "//span[contains(text(),'Remove')]/following-sibling::span";//"css=span>span[class= 'x-btn-icon-el delete ']";
	public final String add_editworkflow_removeStep_disabled = "//a[contains(@class,'disabled')]//span[contains(text(),'Remove')]/following-sibling::span";//"css=a[class*='disabled'] span:contains('Remove')";
	public final String add_editworkflow_moveUpStep = "//span/span[contains(text(),'Move Up')]/following-sibling::span";//"css=span>span:contains('Move Up') ";
	public final String add_editworkflow_moveUpStep_disabled = "css=table.x-item-disabled button.moveup";
	public final String add_editworkflow_moveDownStep = "//span/span[contains(text(),'Move Down')]/following-sibling::span";//"css=span>span:contains('Move Down')";
	public final String add_editworkflow_moveDownStep_disabled = "css=table.x-item-disabled button.movedown";
	public final String add_editworkflow_configureWorkflowStep = "css=span>span:contains('Configure Workflow')";
	public final String addworkflow_automationStepOKButton="//div[contains(@id,'pdaddautomaticworkflowstepdialog')]//div[contains(@id,'toolbar')]//span[text()='OK']/following-sibling::span";
	public final String add_editWorkflow_humanStep_addHumanStepButton="//a/span[text()='Add Human Step']";
	public final String add_editWorkflow_inputHumanStepName = "//input[@name='name']";
	public final String add_editWorkflow_inputHumanStepPhaseRole = "//input[@name='phaseRoles']";
	public final String add_editWorkflow_inputHumanStep_Label_Name = "//div[contains(@id,'addhumanworkflow')]//label[contains(text(),'Name')]";
	public final String add_editWorkflow_inputHumanStep_Label_PhaseRole = "//div[contains(@id,'addhumanworkflow')]//label[contains(text(),'Phase Roles')]";
	public final String add_editWorkflow_verifyHumanStepQuotePhaseCheck="css=table[class*='checked'] input[name='budgetTask']";
	public final String add_editWorkflow_checkHumanStepQuotePhase = "css=table[name='budgetTask'] input[name='budgetTask']";
	public final String add_editWorkflow_inputHumanStepDuration = "//input[@name='duration']";
	public final String add_editWorkflow_invalidInputHumanStep="css=input[class='x-form-text x-form-field x-form-invalid']";
	public final String add_configureWorkflowDefinitionOkButton="//div[contains(@id,'pdconfigureworkflowdefinitiondialog')]//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'OK')]/..";
	public final String add_editWorkflow_getphaseDuration = "//div[@name='allStepsDuration']";
	public final String add_editWorkflow_checkReserve = "//input[@name='reserve']";
	public final String add_editWorkflow_checkRelease = "//input[@name='release']";
	public final String add_editWorkflow_checkReleaseReserve = "//input[@name='releaseReserved']";
	public final String add_editWorkflow_checkRequestDeadlineChange = "//input[@name='requestPhaseDeadlineChange']";
	public final String add_editWorkflow_checkTranslatable = "//input[@name='useTranslatableFormat']";
	public final String add_editWorkflow_checkNativeFormat = "//input[@name='useNativeFormat']";
	public final String add_editWorkflow_checkValidateTranslation = "//input[@name='validateTranslation']";
	public final String add_editWorkflow_checkUploadPDF = "//table[@name='uploadPDF']//input[contains(@name,'uploadPDF')]";
	public final String add_editWorkflow_verifyUploadPDFCheck="//table[contains(@class,'checked')]//input[@name='uploadPDF']";
	public final String add_editWorkflow_disabledValidateTranslationCheckbox="//table[contains(@name,'validateTranslation')][contains(@class,'disabled')]//input[@name='validateTranslation']";
	public final String add_editWorkflow_searchReplace_replaceRegexInput = "//table[@name='replaceRegex']//input[@name='replaceRegex']";
	public final String add_editWorkflow_searchReplace_replacementString = "//table[@name='replacementString']//input[@name='replacementString']";
	public final String add_editWorkflow_searchReplace_encodingSelect = "//tr[td/label[contains(text(),'Encoding')]]/td/table//td/div[contains(@class,'trigger')]";//table[@name='encoding']//table[contains(@id,'combobox') and contains(@class,'x-form-trigger-wrap')]//div[contains(@class,'x-form-arrow-trigger')]";
	
	public final String add_editWorkflow_isTranslatableChecked="//table[contains(@class,'checked')]//input[@name='useTranslatableFormat']";
	public final String add_editWorkflow_isQuoteBudgetPhaseChecked= "//table[contains(@class,'checked')]//input[@name='budgetTask']";
	public final String add_editWorkflow_BudgetCheckBox="//input[@name='budgetTask']";
	public final String add_editWorkflow_isReleaseChecked="//table[contains(@class,'checked')]//input[@name='release']";
	public final String add_editWorkflow_isReserveChecked="//table[contains(@class,'checked')]//input[@name='reserve']";
	public final String add_editWorkflow_isRequestDeadlineChangeChecked="//table[contains(@class,'checked')]//input[@name='requestPhaseDeadlineChange']";
	public final String add_editWorkflow_isReleaseReservedChecked="//table[contains(@class,'checked')]//input[@name='releaseReserved']";
	public final String add_editWorkflow_isNativeFormatChecked="//table[contains(@class,'checked')]//input[@name='useNativeFormat']";
	public final String add_editWorkflow_isValidateTranslationChecked="//table[contains(@class,'checked')]//input[@name='validateTranslation']";
	public final String add_editWorkflow_isUploadPDFPreviewChecked="//table[contains(@class,'checked')]//input[contains(@name,'uploadPDF'])";
	
	public final String add_editWorkflow_searchReplace_encodingSelectX(String encoding){
		String result =  "//div[contains(@id,'boundlist')]//li//div[contains(@class,'x-combo-list-item') and text()='" + encoding + "']";//"//div[contains(@id,'boundlist')]//li[contains(@class,'x-boundlist-item') and text()='" + encoding + "']";
		return result;
	}
	public final String editWorkflow_okButton="//div[contains(@id,'addhumanworkflowstepdialog')]//div[contains(@id,'toolbar')]//span[contains(text(),'OK')]/following-sibling::span";//"css=div[id*='pdaddhumanworkflowstepdialog'] div[id*='toolbar'] span:contains('OK')";
	public final String workflow_okButton = "//div[starts-with(@id,'pdaddautomaticworkflowstepdialog')]//span[contains(text(),'OK')]/..";
	public final String workflow_addHumanStep_okButton ="//div[contains(@id,'pdaddhumanworkflowstepdialog')]//span[contains(text(),'OK')]/.."; //"//div[17]/div[3]/div/div/div/em/button";
	public final String workflow_okButtonDisabled = "css=div[id*='pdaddhumanworkflowstepdialog'] div[id*='toolbar'] a[class*='disabled'] span:contains('OK')";
	public final String workflow_okButtonEnabled = "//div[contains(@id,'addhumanworkflowstepdialog')]//span[contains(text(),'OK')]/following-sibling::span";//"css=div[id*='pdaddhumanworkflowstepdialog'] span:contains('OK')";
	public final String add_editWorkflow_selectAutomaticStep = "//table[@name='nameCombo']//td[contains(@class,'x-trigger-cell')]/div";//"css=div[class= 'x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-last x-unselectable']";
	public final String workflow_saveButton = "//div[contains(@id,'workflowmodeler')]//div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Save')]/following-sibling::span";
	public final String workflow_saveAsButton = "//div[contains(@id,'workflowmodelerdialog')]//div[contains(@id,'toolbar')]//span[contains(text(),'Save As')]/following-sibling::span";//"css=div[@id*='pdworkflowmodelerdialog'] div[@id*='toolbar'] span:contains('Save As')";
		
	
	public final String workflow_durationOfAllSteps(String text)
	{
		String result="//table[contains(@name,'allStepsDuration')]//td/div[contains(text(),'"+text+"')]";//"css=table[@name,'allStepsDuration'] td>div:contains('"+text+"')";
		return result;
		
	}
	public final String checkWorkflow_StepName(String name)
	{
		String result="//div[contains(@id,'workflowmodeler')]//table//td/div[contains(text(),'"+name+"')]";//"css=div[id*='pdworkflowmodelerdialog'] table td>div:contains('"+name+"')";
		return result;
	}
	
	public final String workflow_ModelerDialog = "//div//span[contains(text(),'Workflow Modeler')]";
	public final String addworkflow_StepDialog = "//div//span[contains(text(),'Add Workflow Step')]";
	public final String editworkflow_StepDialog = "//div//span[contains(text(),'Edit Workflow Step')]";
	public final String workflow_trpStartFrom = "//table[@name='phase']//table//td//div[contains(@class,'x-form-arrow-trigger')]";
	public final String workflow_trpStartFromName = "//div[@name='phase-boundlist']//li//div[contains(text(),'Review')]";
	public final String add_editWorkflow_selectProcessorName = "//table[@name='autoTranslationProcessorName']//table//div[contains(@class,'x-form-arrow-trigger')]";
	public final String addWorkflow_StepDuration = "//table[contains(@name,'percentage')]//input[contains(@name,'percentage')]";
	public final String add_editWorkflow_editWorkflowStep_cancelButton = "css=div[id*='pdaddhumanworkflowstepdialog'] div[class*='toolbar'] button>span:contains('Cancel')";
	public final String configureWorkflow_isAutoDeliveryChecked = "//table[contains(@class,'checked')]//input[@name='autoDelivery']";
	public final String configureWorkflow_isAutoFinishChecked = "//table[contains(@class,'checked')]//input[@name='autoFinish']";
	public final String configureWorkflow_autoDeliveryCheck = "//table[contains(@name,'autoDelivery')]//input[@name='autoDelivery']";
	public final String configureWorkflow_autoFinishCheck = "//table[contains(@name,'autoFinish')]//input[@name='autoFinish']";

	public final String add_editWorkflow_saveAs_inputWorkflowDefinitionName = "//table[contains(@name,'wfName')]//td/input[contains(@name,wfName)]";//"css=table[name='wfName'] td>input[name='wfName']";
	public final String add_editWorkflow_saveAs_okButton = "//div[contains(@id,'avenewworkflowdialog')]//div[contains(@id,'toolbar')]//span[contains(text(),'OK')]/following-sibling::span";//"css=div[id*='pdsavenewworkflowdialog'] div[id*='toolbar'] span:contains('OK')";
	public final String add_editWorkflow_disabledOKButton="//a[contains(@class,'disabled')]//span[text()='OK']";
	public final String add_editWorkflow_disabledEditButton="//a[contains(@class,'disabled')]//span[contains(text(),'Edit')]/following-sibling::span";//"css=a[class*='disabled'] span:contains('Edit')";
	

	public final String editWorkflow_cancelButton = "//div[contains(@id,'workflowmodelerdialog')]//div[contains(@id,'toolbar')]//span[contains(text(),'Cancel')]/following-sibling::span";//"css=div[id*='pdworkflowmodelerdialog'] div[id*='toolbar'] span:contains('Cancel')";
	public final String editWorkflow_editButton = "//div[contains(@id,'workflowmodelerdialog')]//div[contains(@id,'toolbar')]//span[contains(text(),'Edit')]/following-sibling::span";//"css=div[id*='pdworkflowmodelerdialog'] div[id*='toolbar'] span:contains('Edit')";
	
	public final String saveNewWorkflow_workflowNameInput ="css=div:nth-child(2)>div>form>div>div>input";
	public final String saveNewWorkflow_okButton = "//div[contains(@id,'avenewworkflowdialog')]//div[contains(@id,'toolbar')]//span[contains(text(),'OK')]/following-sibling::span";//"css=div[id*='pdsavenewworkflowdialog'] div[id*='toolbar'] span:contains('OK')";
		

	public final String workflows_nameRowTitle = "//div[contains(@data-qtip,'Name')]/span";//"css=div[data-qtip='Name']>span";//css=div:nth-child(1)>div>table>thead>tr>td:nth-child(1)>div";
	public final String workflows_nameRowTitleOptions = "//div[contains(@data-qtip,'Name')]/span/following-sibling::div";//"css=div[data-qtip='Name']>span+div";//css=div:nth-child(1)>div>table>thead>tr>td:nth-child(1)>div>a";
	public final String workflows_nameRowTitleOptions_showInGroups = "css=span:contains('Show in groups')";
	public final String workflows_nameRowTitleOptions_showInGroups_checked = "//div[contains(@class,'checked')]/a/span[text()='Show in Groups']";
	public final String workflows_typeRowTitle = "//div[contains(@data-qtip,'Type')]/span";//"css=div[data-qtip='Type']>span";//css=div:nth-child(1)>div>table>thead>tr>td:nth-child(2)>div";
	public final String workflows_typeRowTitleOptions = "//div[contains(@data-qtip,'Type')]/span/following-sibling::div";//"css=div[data-qtip='Type']>span+div";//css=div:nth-child(1)>div>table>thead>tr>td:nth-child(2)>div>a";
	public final String workflows_typeRowTitleOptions_showInGroups = "css=span:contains('Show in groups')";
	public final String workflows_typeRowTitleOptions_showInGroups_checked = "css=li.x-menu-item-checked a[class='x-menu-item x-menu-check-item']>span:contains('Show in Groups')";
	
	//import workflow 
	public final String importWorkflow_browseButton = "css=table.x-btn.x-form-file-btn.x-btn-noicon button:contains('Browse')";
	public final String importWorkflow_overwriteCheckbox = "//label[contains(text(),'Overwrite if already exists')]";//"css=label:contains('Overwrite if already exists')";
	public final String importWorkflow_addButton = "//div[contains(@id,'importworkflowdefinitiondialog')]//span[contains(text(),'Add')]/following-sibling::span";//"css=div[id*='pdimportworkflowdefinitiondialog'] span:contains('Add')";//css=table.x-btn.x-btn-noicon button:contains('Add')";
	public final String importWorkflow_cancelButton = "css=div[id*='pdimportworkflowdefinitiondialog'] button>span:contains('Cancel')";//css=table>tbody>tr>td:nth-child(2)>table>tbody>tr>td>table>tbody>tr>td:nth-child(2)>table>tbody>tr:nth-child(2)>td:nth-child(2)>em button:contains('Cancel')";
	
	
	public final String workflow_checkWorkflowName(String workflowName){
		String result = "//div[contains(@class,'grid-body')]//table//tr//div[text()='"+workflowName+"']";//"//div[contains(@id,'pdmaingrid')]//table//tr//div[text()='"+workflowName+"']";
		return result;
	}
	
	public final String add_editWorkflow_selectAutomaticStepX(String stepName){
		String result = "//div[contains(@id,'boundlist')]//li[contains(@class,'x-boundlist-item') and text()='"+stepName+"']";
		return result;
	}
	
	public final String add_editWorkflow_selectAutomaticStepTrpX(String stepName){
		String result = "//div[@name='phase-boundlist']//li//div[contains(text(),'"+stepName+"')]";
		return result;
	}
	
	public final String add_editWorkflow_selectAutomaticStepMachineX(String stepName){
		String result = "//div[@name='autoTranslationProcessorName-boundlist']//div//ul//li//div[contains(text(),'"+stepName+"')]";
		return result;
	}
	
	
	public final String firstNameX(Integer row){
		String result = "//div[contains(@id,'pdmaingrid')]//table/tbody/tr["+(row+1)+"]/td/div";//"css=div[id*='pdmaingrid'] table>tbody>tr:nth-child("+(row+1)+")>td>div";
		return result;
}
	public final String add_editWorkflow_selectStepX(String stepName){
		String result = "//div[contains(@id,'workflowmodelerdialog')]//div[contains(@class,'grid-cell-inner')][contains(text(),'"+stepName+"')]";//"css=div[id*='pdworkflowmodelerdialog'] div.x-grid-cell-inner:contains('"+stepName+"')";
		return result;
	}
	
	public final String add_editWorkflow_selectStep(String stepName){
		String result = "//table//tbody//tr//td[2]//div[contains(text(),'"+stepName+"')]";
		return result;
	}
	

	
	//find workflow
	public final String filters_workflow_inputworkflowNameFind = "css=input[name= 'workflowDefinitionInputText']";
	public final String firstDataRowName = "//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";//"css=tbody>tr>td:nth-child(1)>div";
	public final String groupTitleX (String title){
		String result = "//div[contains(@class,'grid-group-title')][contains(text(),'"+title+"')]";//"css=div.x-grid-group-title:contains('"+title+"')";
		return result;
	}

	public final String workflow_columnsCheckMenuItem(String menuItem){
		String result = "//a//span[contains(@id,'menucheckitem')][contains(text(),'"+menuItem+"')]/following-sibling::div";//"css=a>span[id*='menucheckitem']:contains('"+menuItem+"')";//css=ul>li>a>span[class='x-menu-item-text']:contains('"+menuItem+"')";
		return result;
	}
	
	public final String workflows_workflowModeller_stepNameX(Integer rowNumber){
		String result = "//div[contains(@id,'workflowmodelerdialog')]//table/tbody[contains(@id,'gridview')]//tr["+rowNumber+"]/td[2]";//"css=div[id*='pdworkflowmodelerdialog'] table>tbody[id*='gridview'] tr:nth-child("+rowNumber+")>td:nth-child(2)";//css=div[class=' x-window x-window-noborder'] div.x-grid3-row:nth-child("+rowNumber+") div[class='x-grid3-cell-inner x-grid3-col-1']";
		return result;
	}
	
	
	//locators - configuring tsr review step
	public final String addWF_addReviewStep_phaseNameLabel="//table[contains(@name,'name') or contains(@name,'phaseName')]//label[contains(text(),'Name')]";//"//table[contains(@name,'name')]//label[contains(text(),'Name')]";//"//div[contains(@id,'Review')]//table//label[contains(text(),'Phase Name')]";
	public final String addWF_addReviewStep_phaseNameInput="//input[contains(@name,'phaseName')]";
	public final String addEF_addReviewStep_phaseRoleInput="//input[contains(@name,'phaseRoles')]";
	public final String addWF_addReviewStep_demoteToSelectButton="//table[@name='p_demoteTo']//td/div[contains(@class,'trigger')]";
	public final String addWF_addReviewStep_selectDemoteToPhaseX(String phase)
	{
		return "//div[contains(@name,'p_demoteTo')]//li[text()='"+phase+"']";
	}
	
	public final String addWF_addReviewStep_budgetCheckbox="//input[contains(@name,'p_budget')]";
	public final String addWF_addReviewStep_isbudgetChecked="//table[contains(@class,'checked')]//input[contains(@name,'budget')]";
	public final String addWF_addReviewStep_releaseCheckBox="//input[contains(@name,'release')]";
	public final String addWF_addReviewStep_isReleaseChecked="//table[contains(@class,'checked')]//input[contains(@name,'release')]";
	public final String addWF_addReviweStep_reserveCheckbox="//input[contains(@name,'reserve')]";
	public final String addWF_addReviewStep_isReserveChecked="//table[contains(@class,'checked')]//input[contains(@name,'reserve')]";
	public final String addWF_addReviewStep_ReleaseReservedCheckbox="//input[contains(@name,'releaseReserved')]";
	public final String addWF_addReviewStep_isReleaseReservedChecked="//table[contains(@class,'checked')]//input[contains(@name,'releaseReserved')]";
	public final String addWF_addReviewStep_DisableFileLinkCheckbox="//input[contains(@name,'disableFileLink')]";
	public final String addWF_addReviewStep_isdisableFileLinkChecked="//table[contains(@class,'checked')]//input[contains(@name,'disableFileLink')]";
	public final String addWF_addReviewStep_requestPhaseDeadlineCheckbox="//input[contains(@name,'requestDeadlineChange')]";
	public final String addWF_addReviewStep_isPhaseDeadlineChecked="//table[contains(@class,'checked')]//input[contains(@name,'requestDeadlineChange')]";
	public final String addWF_addReviewStep_demotePhaseCheckbox="//input[contains(@name,'demotePhase')]";
	public final String addWF_addReviewStep_isDemotePhaseChecked="//table[contains(@class,'checked')]//input[contains(@name,'demotePhase')]";
	public final String addWF_addReviewStep_isDemotePhase_unChecked="//table[not(contains(@class,'checked'))]//input[contains(@name,'demotePhase')]";
	public final String addWF_addReviewStep_deliverableCheckbox="//input[contains(@name,'deliverableCollateral')]";
	public final String addWF_addReviewStep_isDeliverableChecked="//table[contains(@class,'checked')]//input[contains(@name,'deliverableCollateral')]";
	public final String addWF_addReviewStep_inputDuration="//input[contains(@name,'duration')]";
	public final String addWF_addReviewStep_okButton="//div[contains(@id,'WorkflowDefinitionReview')]//span[contains(text(),'OK')]/..";
	public final String addWF_addReviewStep_cancelButton="//div[contains(@id,'WorkflowDefinitionReview')]//span[contains(text(),'Cancel')]/..";
	
	public final String add_editWorkflow_humanStep_addReviewStepButton="//a/span[text()='Add Review Step']";
	public final String add_editWorkflow_humanStep_addDTPReviewStepButton="//a/span[text()='Add DTP Review Step']";
	
	public final String add_editWorkflow_humanStep_addReviewStepButton_enabled="//div[not(contains(@class,'x-menu-item-disabled'))]//a/span[text()='Add Review Step']";
	public final String add_editWorkflow_humanStep_addReviewStepButton_disabled="//div[contains(@class,'x-menu-item-disabled')]//a/span[text()='Add Review Step']";
	
	
}
