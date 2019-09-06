package org.qa.locators;
/*Created by Alfonso Almanza
 * 01/27/11 translations.com
 */
public class PD4_security_panel_Locators {
	private static PD4_security_panel_Locators ue;
	
	public static synchronized PD4_security_panel_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_security_panel_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_security_panel_Locators();
		}
		return ue;
	}
	//Security Panel Locators//Security Panel Locators
	public final String security_addRoleButton = "//span[contains(text(),'Create Role')]";//"//span[contains(@id,'add_role')]";
	public final String security_editRoleButton = "//span[contains(@id,'edit_role')]//span[text()='Edit Role']";
	public final String security_addRole_selectRoleType = "//div[contains(@id,'gs4trroletypecombo')]//div[contains(@class,'x-form-arrow-trigger')]";//"//table[contains(@id,'gs4trroletypecombo')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String add_editRole_selectProjectRole = "//li[@class='x-boundlist-item'][text()='project']";
	public final String add_editRole_copyButton = "//span[text()='Copy']";
	public final String add_editRole_selectSystemRole = "//li[@class='x-boundlist-item'][text()='system']";
	public final String add_editRole_copyRoleArrow = "//div[contains(@name,'roleCombo')]//div[contains(@class,'arrow-trigger')]";//"//table[contains(@id,'gs4trrolecombo')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String add_editRole_copyRoleX(String roleName) {
		return "//li[contains(@class,'x-boundlist-item')][text()='"+roleName+"']";
	}
	public final String checkViewOwnedSubmissions = "css=table>tbody>tr>td>div:contains('View Owned Submissions')";
	public final String checkViewSubmittedSubmissions = "//table[contains(@id,'gridview')]//tr//td//div[text()='View Submitted Submissions']";
	public final String add_editRole_userTab = "//div[contains(@id,'role')]//span/span[contains(text(),'User')]";
	public final String add_editRole_languageModelsTab = "css=span>span:contains('Language Models')";
	public final String add_editRole_deliveryTab = "css=span>span:contains('Delivery')";
	public final String add_editRole_folderTab = "//div[starts-with(@id,'gs4trrolepoliciespanel') and contains(@class,'x-panel-default-framed')]//span[text()='Folder']";
	public final String add_editRole_workflowTab = "css=span>span:contains('Workflow')";
	public final String add_editRole_submissionTab = "//div[contains(@id,'role')]//span/span[contains(text(),'Submission')]";
	public final String add_editRole_reportTab = "css=span>span:contains('Report')";
	public final String add_editRole_organizationTab = "css=span>span:contains('Organization')";
	public final String add_editRole_generalTab = "//div[contains(@id,'role')]//span/span[contains(text(),'General')]";//"css=span>span:contains('General')";
	public final String add_editRole_webServicesTab = "css=span>span:contains('Web Services')";
	public final String add_editRole_vendorTab = "css=span>span:contains('Vendor')";
	public final String add_editRole_costScopeTab = "css=div[id*='editrole'] span:contains('Cost Scope')";//css=span>span:contains('Cost Scope')";
	public final String add_editRole_translationMemoryTab = "//div[contains(@id,'role')]//a//span[text()='Translation Memory']";//css=div[id*='editrole'] span:contains('Translation Memory')";
	public final String add_editRole_pluginTab = "css=span>span:contains('Plugin')";
	public final String add_editRole_projectTab = "css=span>span:contains('Project')";
	public final String add_editRole_roleTab="//div[contains(@class,'gs4trmultirowtabpanel-target')]//span[text()='Role']";//"//span[text()='Role']/following-sibling::span";
	public final String add_editRole_ArchiveTab="//span[text()='Archive']";//"//span[text()='Archive']/following-sibling::span";
	public final String editRole_updateButton = "//div//a//span[text()='Update']";
	public final String add_editRole_addButton = "//div[contains(@id,'gs4traddrole')]//span[text()='Add']";//"//div[contains(@id,'gs4traddrole')]//span[text()='Add']/following-sibling::span";
	public final String editRole_cancelButton = "//div[starts-with(@id,'gs4treditrole')]//div[starts-with(@id,'toolbar')]//span[text()='Cancel']";//"//div[starts-with(@id,'gs4treditrole')]//div[starts-with(@id,'toolbar')]//span[text()='Cancel']/following-sibling::span";//"//div[starts-with(@id,'gs4treditrole') and contains(@class,'x-window-default')]//div[starts-with(@id,'toolbar') and contains(@class,'x-toolbar-footer x-docked-bottom')]//span[text()='Cancel']";
	public final String add_editRole_gradingScoringTab ="//div[contains(@class,'x-window-closable')]//div[contains(@class,'x-window-item PoliciesPanel')]//span[text()='G+S']";
	
	// operations are "Add,Copy,Delete,edit,View"
	public final String add_editRole_gradingScoringTab_policy_Checked(String operation) {
		return"//table[contains(@class,' x-grid-item-selected')]//div[contains(text(),'"+operation+" G+S model')]";//div[contains(@name,'Grading + Scoring')]//table[contains(@class,' x-grid-item-selected')]//div[text()='"+operation+" G+S Model']";//"//div[contains(@name,'Grading + Scoring')]//tr[contains(@class,'x-grid-row-selected')]//div[text()='"+operation+" Grading + Scoring Model']";
	}
	
	// operations are "Add,Copy,Delete,edit,View"
	public final String add_editRole_gradingScoringTab_policy_UnChecked(String operation) {
		
		return "//tr[not(contains(@class,'x-grid-row-selected'))]//div[contains(text(),'"+operation+" G+S model')]";//div[contains(@name,'Grading + Scoring')]//tr[not(contains(@class,'x-grid-row-selected'))]//div[text()='"+operation+" Grading + Scoring Model']";		
	}
	
	//User Tab
	public final String add_editRole_userTab_Impersonatible = "//div[contains(@name,'User')]//table//div[contains(text(),'Impersonatable')]";//"css=td:contains('Impersonatable')";
	public final String add_editRole_userTab_ImpersonateUser = "//div[contains(@name,'User')]//table//div[contains(text(),'Impersonate user')]";//"css=td:contains('Impersonate User')";
	
	//Folder TAB
	public final String add_editRole_folderTab_checkViewSubmissions = "css=table>tbody>tr>td>div:contains('View Submissions')";
	
	public final String add_editRole_folderTab_RoleX_isChecked(String policyName) {
		return "//div[contains(@id,'role')]//table[contains(@class,'selected')]//td[div[text()='"+policyName+"']]";
	}
	public final String add_editRole_folderTab_RoleX(String policyName) {
		return "//table//tr//div[text()='"+policyName+"']";
	}
	
	public final String add_editRole_projectType_task_checked(String taskName) {
		return "//div[contains(@name,'Task')]//table[contains(@class,'selected')]//td[div[contains(text(),'"+taskName+"')]]/following-sibling::td//div[contains(@class,'checker')]";
	}
	
	public final String add_editRole_projectType_task(String taskName) {
		return "//div[contains(@name,'Task')]//table//td[div[contains(text(),'"+taskName+"')]]/following-sibling::td//div[contains(@class,'checker')]";
	}
	
	public final String add_editRole_systemType_policy_checked(String taskName) {
		return "//div[contains(@id,'roletabpanel')]//table[contains(@class,'selected')]//td[div[contains(text(),'"+taskName+"')]]/following-sibling::td//div[contains(@class,'checker')]";//"//div[contains(@name,'Submission')]//table[contains(@class,'selected')]//td[div[contains(text(),'"+taskName+"')]]/following-sibling::td//div[contains(@class,'checker')]";
	}
	
	public final String add_editRole_systemType_policy(String taskName) {
		return "//div[contains(@id,'roletabpanel')]//table//td[div[contains(text(),'"+taskName+"')]]/following-sibling::td//div[contains(@class,'checker')]";//"//div[contains(@name,'Submission')]//table//td[div[contains(text(),'"+taskName+"')]]/following-sibling::td//div[contains(@class,'checker')]";
	}
	
			
	public final String add_editRole_folderTab_RoleX(String folderName, String policyName) {
		return "//div[starts-with(@id,'gs4treditrole') and contains(@class,'x-window-body-default')]//div[@name='"+folderName+"']//tr[contains(@class,'x-grid-row')][child::td/div[text()='"+policyName+"']]";
	}
	
	public final String add_editRole_folderTab_RoleX_isUnChecked(String roleName) {
		return "//div[contains(@id,'trole')]//table[not(contains(@class,'selected'))]//div[contains(text(),'"+roleName+"')]";
	}
	
	//Submission TAB
	public final String add_editRole_submissionTab_checkAddDeliverableCollateral="//div[contains(@name,'Submission')]//table//tr//div[text()='Add Deliverable Collateral']";
	public final String add_editRole_submissionTab_checkAddDeliverableCollateral_unchecked = "//div[contains(@id,'gs4trrolepoliciesgrid')][@name='Submission']//table[not(contains(@class,'selected'))]//tr//td//div[text()='Deliverable Collateral - add to submission']";
	public final String add_editRole_submissionTab_checkedAddDeliverableCollateral="//div[contains(@name,'Submission')]//table[contains(@class,'selected')]//tr//div[text()='Add Deliverable Collateral']";
	//Type Project
	public final String add_editRole_inputRoleName = "//input[@name='roleName']";
	public final String add_editRole_inputRoleNameFind = "//input[@name='textFieldFilter']";
		
	public final String checkProjectClientViewSubmittedRole = "//table/tbody/tr/td/div[contains(text(),'project_client_view_submitted')]";
	public final String checkProjectClientViewAllRole = "//table/tbody/tr/td/div[contains(text(),'project_client_view_all')]";
	public final String checkProjectPmRole = "//table/tbody/tr/td/div[contains(text(),'project_pm')]";
	public final String checkProjectSmRole = "//table/tbody/tr/td/div[contains(text(),'project_sm')]";
	public final String checkProjectSmUserRole = "//table/tbody/tr/td/div[contains(text(),'sm_user')]";
	
	public final String selectFirstRole = "//div[contains(@id,'pdMainGrid')]//table//tr//td//div";
	
	public final String projectClientViewSubmitted_viewOwnedSubmissionCheck = "//table/tbody/tr/td/div[contains(text(),'View Owned Submissions')]";
	
	
	public final String add_editRole_roleTab_checkAllRole = "//div[contains(@id,'gs4trrolepolicies')][@name='Role']/div/div/div//div[2]/div/span";
	public final String add_editRole_roleTab_checkAddRole = "//div[contains(@id,'gs4trrolepolicies')][@name='Role']//table//tbody//tr[1]//td[2]//div//div";
	public final String add_editRole_ArchiveTab_checkAddRole = "//div[contains(@name,'Archive')]//table[2]//div[contains(@class,'row-checker')]";//"//div[contains(@id,'gs4trrolepolicies')][@name='Archive']/div[2]/div/table/tbody/tr[2]/td[2]/div/div";
	public final String add_editRole_ArchiveTab_ArchiveSubmissionChecked="//div[contains(@name,'Archive')]//div//td//div[contains(@class,'row-checker')]";//"//div[@name='Archive']//table//tr[contains(@class,'focused')]//td[div[contains(text(),'Archive Submission')]]";
	public final String add_editRole_roleTab_checkEditRole = "//div[contains(@id,'gs4trrolepolicies')][@name='Role']//table[2]//tbody//tr[1]//td[2]//div";//"//div[contains(@id,'gs4trrolepolicies')][@name='Role']//table//tbody//tr[2]//td[2]//div//div";
	public final String add_editRole_roleTab_checkViewRole = "//div[contains(@id,'gs4trrolepolicies')][@name='Role']//table[3]//tbody//tr[1]//td[2]//div";//"//div[contains(@id,'gs4trrolepolicies')][@name='Role']//table//tbody//tr[3]//td[2]//div//div";
	public final String add_editRole_roleTab_checkedHeaderCheckBox="//div[contains(@id,'gs4trrolepolicies')][@name='Role']/div/div/div/div[2][contains(@class,'x-grid-hd-checker-on')]";
	public final String add_editRole_TmCheckedRoleX(String roleName) {
		return "//div[contains(@id,'gs4trrolepolicies')][@name='Translation Memory']//table//tr[contains(@class,'x-grid-row-selected')]/td/div[text()='"+roleName+"']";
	}
	
	public final String add_editRole_checkRoleX(String role)
	{
		return "//table//tr//td[div[contains(text(),'"+role+"')]]";
	}
	public final String add_editRole_isRoleXChecked(String role)
	{
		return "//table//tr[contains(@class,'x-grid-row-selected')]//td[div[contains(text(),'"+role+"')]]";
	}
	public final String add_editTmTabCheckRoleX(String roleName) {
		return "//div[contains(@id,'gs4trrolepoliciesgrid')][@name='Translation Memory']//table//tr/td/div[text()='"+roleName+"']";
	}
	
	public final String security_roleName_rowX(int row) {
		return "//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";
	}
	
	public final String security_selectNameX(String roleName) {
		return "//div[contains(@id,'pdmaingrid')]//tr[contains(@class,'x-grid-row')]/td/div[text()='"+roleName+"']";
	}
	
	public final String security_nameRowTitle = "//div[contains(@name,'MainGrid')]//span[contains(text(),'Name')]";//"//div[contains(@name,'mainGrid')]//span[contains(text(),'Name')]";//"//div[contains(@id,'pdmaingrid')]/div/div/div/div/div/span[text()='Name']";
	public final String security_nameRowTitleOptions = "//div[contains(@id,'headercontainer-')]/div[1]/div/div[@class='x-column-header-trigger']";
	
	public final String editRole_checkEditStatisticsCheckBox_unchecked = "//tr[not(contains(@class,'x-grid-row-selected'))]/td/div[text()='Edit Statistics']";
	public final String editRole_checkEditStatisticsCheckBox="//div[starts-with(@id,'gs4treditrole') and contains(@class,'x-window-default')]//div[@name='Task']//tr[contains(@class,'x-grid-row')]//td[child::div[text()='Edit Statistics']]//following-sibling::td//div[contains(@class,'x-grid-row-checker')]";
	
	public final String editRole_checkEditCompletedSubmissiom="//div[contains(@name,'Task')]//table//td[div[contains(text(),'Support - edit Completed submission')]]";//"//div[starts-with(@id,'gs4treditrole') and contains(@class,'x-window-default')]//div[@name='Task']//tr[contains(@class,'x-grid-row')]//td[child::div[text()='Edit Completed Submission']]//following-sibling::td//div[contains(@class,'x-grid-row-checker')]";
	public final String editRole_checkWhetherEditCompletedSubmissionIsChecked="//div[contains(@name,'Task')]//table[contains(@class,'selected')]//td[div[contains(text(),'Support - edit Completed submission')]]/following-sibling::td//div[contains(@class,'checker')]";//"//div[starts-with(@id,'gs4treditrole') and contains(@class,'x-window-default')]//div[@name='Task']//tr[contains(@class,'x-grid-row-selected')]//td[child::div[text()='Edit Completed Submission']]//following-sibling::td//div[contains(@class,'x-grid-row-checker')]";
	
	public final String editRoleWizard="//div[contains(@id,'editrole')]//div[text()='Edit Role']";//"//div[contains(@id,'editrole')]//span[text()='Edit Role']";
	
	public final String editRole_selectVendors_checkbox="//div[contains(@id,'rolepolicies')]//table[contains(@id,'tableview')]//tr//div[text()='Default - Select Vendors buttons/dialog']";
	public final String editRole_addReferenceFileToSubmission_checkbox="//div[contains(@id,'rolepolicies')]//table[contains(@id,'tableview')]//tr//div[text()='Default - add reference files']";//"//div[contains(@id,'rolepolicies')]//table[contains(@id,'tableview')]//tr//div[text()='Add Reference Files to Submission']";
	
}
