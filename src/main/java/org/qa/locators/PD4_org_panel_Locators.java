package org.qa.locators;
/*Created by Alfonso Almanza
 * 01/27/11 translations.com
 */
public class PD4_org_panel_Locators {
	private static PD4_org_panel_Locators ue;
	
	public static synchronized PD4_org_panel_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_org_panel_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_org_panel_Locators();
		}
		return ue;
	}
	//Organizations Panel Locators//Organizations Panel Locators
	public final String organizations_addOrganizationButton = "//span[contains(@id,'add_org')]";
	public final String organization_firstDataRowName = "//div[contains(@id,'MainGrid')]//table//tr//td";
	public final String organization_firstDataRowParentOrgName = "css=tbody>tr>td:nth-child(2)>div";
	public final String organizations_editOrganizationButton = "//span[contains(@id,'edit_org')]";
	public final String organizations_enableDisableOrganizationButton = "//span[contains(@id,'enable_org')]";
	public final String organizations_enableDisableOrganization_confirmYesButton ="//div[starts-with(@id,'toolbar') and contains(@class,'x-toolbar-footer')]//span[text()='Yes']/following-sibling::span";
	public final String add_edit_inputOrganizationName = "//input[contains(@name,'organizationName')]";
	public final String add_edit_selectCurrencyCode = "css=form[class= 'x-panel-body x-small-editor-body-noheader x-small-editor-body-noborder x-form']>div:nth-child(3)>div>div>img";	
	public final String add_edit_selectUsd = "css=div[name='currencyCode'] div:contains('USD')";
	public final String add_edit_inputCurrencyCode = "//input[contains(@name,'currencyCode')]";//"css=input[name*='currencyCode']";
	public final String add_edit_inputParentOrganization = "css=form[class='x-panel-body x-small-editor-body-noheader x-small-editor-body-noborder x-form']>div:nth-child(4)>div>div>input";
	public final String add_selectParentOrganization = "//div[contains(@name,'parentOrganization')]//div[contains(@class,'x-form-arrow-trigger')]";//"//table[contains(@name,'parentOrganization')]//div[contains(@class,'x-form-arrow-trigger')]";//"//table[@name='parentOrganization']//div[contains(@class,'x-form-arrow-trigger')]";
	
		
	//Columns
	public final String organization_nameRowTitle = "//div[contains(@id,'MainGrid')]//span[contains(text(),'Name')]";//"//div[@data-qtip='Name']";
	public final String organization_parentOrganizationRowTitle = "//div[contains(@id,'MainGrid')]//span[contains(text(),'Parent')]";//"//div[@data-qtip='Parent Organization']";
	public final String organization_enabledRowTitle = "//div[contains(@id,'MainGrid')]//span[contains(text(),'Enabled')]";//"//div[@data-qtip='Status']";
		
	public final String organization_nameRowTitleOptions="//div[contains(@id,'MainGrid')]//div[contains(@data-ref,'triggerEl')]";//"//div[@data-qtip='Name']//div[contains(@class,'header-trigger')]";//"//div[@data-qtip='Name']/div";
	public final String organization_parentOrganizationRowTitleOptions="//div[contains(@data-qtip,'Parent Organization')]//div[contains(@class,'header-trigger')]";//"//div[@data-qtip='Parent Organization']/div";
	public final String organization_enabledRowTitleOptions="//div[contains(@data-qtip,'Status')]//div[contains(@class,'header-trigger')]";//"//div[@data-qtip='Status']/div";
	
	public final String organization_checkNameMenuItem = "//a/span[contains(text(),'Name')]";//"css=a>span:contains('Name')";
	public final String organization_checkParentOrganizationMenuItem = "//a/span[contains(text(),'Parent Organization')]";//"css=a>span:contains('Parent Organization')";
	public final String organization_checkEnabledMenuItem = "//a/span[contains(text(),'Enabled')]";//"css=a>span:contains('Enabled')";
	
	
	public final String groupTitleX (String title){
		String result = "//div[contains(@class,'grid-group-title')][contains(text(),'"+title+"')]";//"//div[@class='x-grid-group-title'][contains('"+title+"')]";
		return result;
	}
	
	public final String orgNameX(Integer row){
		String result = "//div//table["+row+"]/tbody//tr//td//div";//"//div//table//tbody//tr["+row+"]//td//div";
		return result;
	}
	
	public final String parentOrgX(Integer row){
		String result = "//div//table["+row+"]//tbody//tr//td[2]//div";//"//div//table//tbody//tr["+row+"]//td[2]//div";
		return result;
	}
	
	public final String enabledX(Integer row){
		String result = "//div//table["+row+"]//tbody//tr//td[3]//div";//"//div//table//tbody//tr["+row+"]//td[3]//div";
		return result;
	}

	//Add and Edit Organization
	public final String add_edit_selectAllTms = "css=div[class='x-grid3-header-inner']>div>table>thead>tr>td.x-grid3-cell-last>div>div";
	public final String add_edit_selectAllWorkflows = "css=div[class='x-small-editor x-small-editor-noborder x-form-label-left']>div>form>div:nth-child(2)>div>div>div>div>div>div>div>div>div>div>table>thead>tr>td.x-grid3-cell-last>div>div";
	public final String add_edit_selectAllDeliveryProfiles = "css=div[class='x-small-editor x-small-editor-noborder x-form-label-left'] div[class='x-grid3-header-offset']>table>thead>tr>td.x-grid3-cell-last>div>div";	
	public final String add_edit_checkFirstTMRow = "css=table.x-grid3-row-table td.x-grid3-td-checker.x-grid3-cell-last>div>div";
	public final String add_edit_choose_ParentOrg_trigger="//div[contains(@name,'parentOrganization')]//div[contains(@class,'arrow-trigger')]";
	public final String add_edit_chooseParentOrganizationX(String parentOrganization){
		String result = "//div[contains(@name,'parentOrganization-boundlist')]//li[contains(text(),'"+parentOrganization+"')]";
		return result;
	}
	//locators for workflow, delivery profile checking check-boxes (add organization creation wizard)
	public final String add_org_rowTable ="//div[contains(@class,'organization_add_card_Workflow')][not(contains(@style,' display: none'))]//table//tr";//"//div[@class='x-panel x-fit-item x-panel-NewOrganizationWizard'][not(contains(@style,'none'))]//tbody/tr[contains(@class,'x-grid-row')]";
	public final String add_org_rowTable_checkBox(int row) 
	{
		//String result ="//div[starts-with(@id,'pdorganization') and contains(@class,'x-panel-default')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[starts-with(@class,'x-grid-row')]["+row+"]/td[contains(@class,'x-grid-cell-last')]//div[contains(@class,'x-grid-row-checker')]";//"//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//div[starts-with(@id,'pdorganization') and contains(@class,'x-panel-default')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[starts-with(@class,'x-grid-row')]["+row+"]/td[contains(@class,'x-grid-cell-last')]//div[contains(@class,'x-grid-row-checker')]";
		String result ="//div[contains(@class,'organization_add_card_Workflow')][not(contains(@style,'none'))]//tbody/tr[contains(@class,'x-grid-row')]["+row+"]";//"//div[@class='x-panel x-fit-item x-panel-NewOrganizationWizard'][not(contains(@style,'none'))]//tbody/tr[contains(@class,'x-grid-row')]["+row+"]";
		return result;
	}
	
	public final String add_org_deliveryRowTable="//div[contains(@class,'organization_add_card_Delivery')][not(contains(@style,' display: none'))]//table//tr";
	public final String add_org_delivery_checkboxX(int row) 
	{
		//String result ="//div[starts-with(@id,'pdorganization') and contains(@class,'x-panel-default')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[starts-with(@class,'x-grid-row')]["+row+"]/td[contains(@class,'x-grid-cell-last')]//div[contains(@class,'x-grid-row-checker')]";//"//div[contains(@class,'x-panel x-fit-item x-panel-default') and not(contains(@style,'display: none'))]//div[starts-with(@id,'pdorganization') and contains(@class,'x-panel-default')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[starts-with(@class,'x-grid-row')]["+row+"]/td[contains(@class,'x-grid-cell-last')]//div[contains(@class,'x-grid-row-checker')]";
		String result ="//div[contains(@class,'organization_add_card_Delivery')][not(contains(@style,' display: none'))]//table//tr["+row+"]";//"//div[@class='x-panel x-fit-item x-panel-NewOrganizationWizard'][not(contains(@style,'none'))]//tbody/tr[contains(@class,'x-grid-row')]["+row+"]";
		return result;
	}
	//Edit Organization
	public final String edit_selectParentOrganization = "//div[contains(@id,'EditTabDetails')]//div[contains(@name,'parentOrganization')]//div[contains(@class,'x-form-arrow-trigger')]";//"//table[contains(@name,'parentOrganization')]//table[contains(@id,'combobox') and contains(@class,'x-form-trigger-wrap')]//div[contains(@class,'x-form-arrow-trigger')]";//"//table[@name='parentOrganization']//table[contains(@id,'combobox') and contains(@class,'x-form-trigger-wrap')]//div[contains(@class,'x-form-arrow-trigger')]";	
	public final String edit_selectCurrencyCode = "css=form.x-panel-body.x-panel-body-noborder.x-form>div:nth-child(2)>div>div>img";
	public final String edit_okButton = "//div[contains(@id,'AdminOrganizationEdit')]//span[contains(text(),'OK')]";//"//div[contains(@id,'organizationtabwindow')]//span[contains(text(),'OK')]/..";
	public final String edit_translationMemoryTab = "//span[text()='TMs']";//"//div[contains(@id,'pdAdminOrganizationEditWindow') and contains(@class,'x-window-body-default')]//span[contains(text(),'Translation Memory')]";
	public final String editOrganization_fileFormatTab ="//div[contains(@id,'pdAdminOrganizationEditWindow') and contains(@class,'x-window-body-default')]//span[contains(text(),'File Formats')]";
	public final String edit_workflowDefinitionsTab = "css=em.x-tab-left span:contains('Workflow Definitions')";
	public final String edit_deliveryProfilesTab = "//div[contains(@id,'AdminOrganizationEdit') and contains(@class,'x-window-body-default')]//span[contains(text(),'Delivery Profiles')]/..";//"//div[contains(@id,'pdorganizationtabwindow') and contains(@class,'x-window-body-default')]//span[contains(text(),'Delivery Profiles')]/..";
	public final String edit_verifyTMFirstRowIsChecked = "//div[contains(@id,'OrganizationEditTabTm')]//table[contains(@id,'tableview')]//tbody/tr[1]/td[last()]//div[contains(@class,'checked')]";//"//div[contains(@id,'OrganizationEditTabTm')]//table[contains(@id,'gridview')]//tbody/tr[1]/td[last()]//img[contains(@class,'checked')]";//"//div[contains(@id,'organizationtm')]//table[contains(@id,'gridview')]//tbody/tr[1]/td[last()]//img[contains(@class,'checked')]";//div[contains(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,'  x-grid-cell-last')]//div[contains(@class,'x-grid-checkheader-checked')]";

	//Actual for TM, Workflow Definition and Delivery Profile in Edit Window
	public final String edit_verifyFirstRowIsChecked = "//div[contains(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[contains(@class,'x-grid-row-selected')][1]/td[contains(@class,'  x-grid-cell-last')]//div[contains(@class,'x-grid-row-checker')]";
	public final String edit_checkFirstRow = "//div[contains(@id,'OrganizationEditTabTm')]//table[contains(@id,'tableview')]//tbody/tr[1]/td[last()]//div[contains(@class,'x-grid-checkcolumn')]";//"//div[contains(@id,'OrganizationEditTabTm')]//table[contains(@id,'gridview')]//tbody/tr[1]/td[last()]";//"//div[contains(@id,'organizationtm')]//table[contains(@id,'gridview')]//tbody/tr[1]/td[last()]";//div[contains(@id,'gridpanel') and contains(@class,'x-panel-body-default')]//table[contains(@class,'x-grid-table')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,'  x-grid-cell-last')]/div/div";
	public final String edit_checkAllRows = "//div[starts-with(@id,'pdorganizationdeliveryprofiles')]//div[contains(@class,'x-column-header-last')]//span[contains(@class,'x-column-header-text')]";//"//div[contains(@id,'gridcolumn') and contains(@class,'x-column-header-last x-grid-hd-checker-on')]//span[contains(@class,'x-column-header-text')]";
	public final String edit_verifyAllIsChecked = "//div[contains(@id,'OrganizationEdiTabTm')]//div[contains(@id,'checkcolumn')]/div/span[contains(@class,'checked')]";//"//div[contains(@id,'organizationtm')]//div[contains(@id,'checkcolumn')]/div/span[contains(@class,'checked')]";//div[contains(@id,'gs4trcheckcolumn') and contains(@class,'x-column-header-last')]//span[contains(@class,'x-grid-checkheader-checked')]";
	public final String edit_checkFirstDeliveryProfile="//div[contains(@id,'AdminOrganizationGlobalDelivery')]//table[contains(@id,'tableview')]//tbody/tr[1]/td[last()]//div[contains(@class,'x-grid-row-checker')]";//"//div[contains(@id,'AdminOrganizationGlobalDelivery')]//table[contains(@id,'gridview')]//tbody/tr[1]/td[last()]";//"//div[contains(@id,'deliveryprofiles')]//table[contains(@id,'gridview')]//tbody/tr[1]/td[last()]";
	public final String edit_verifyAllDilveryProfileIsChecked="//div[contains(@id,'deliveryprofiles')]//div[contains(@class,'checker-on')]";
	public final String add_editOrganization_selectCurrencyCode = "//div[contains(@id,'Organization')]//div[contains(@class,'arrow-trigger')]";
	public final String editOrganization_selectCurrencyCode = "//div[contains(@name,'currencyCode')]//div[ contains(@class,'trigger-default')]";//"//table[contains(@name,'currencyCode')]//table[contains(@id,'combobox') and contains(@class,'x-form-trigger-wrap')]//div[contains(@class,'x-form-arrow-trigger')]";//"//table[@name='currencyCode']//table[contains(@id,'combobox') and contains(@class,'x-form-trigger-wrap')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String add_organization_languageDirectionSelectButton="//div[contains(@name,'languageDirection')]//div[contains(@class,'arrow-trigger')]";//"//table[contains(@name,'languageDirection')]//table//tr/td[2]/div";//"css=table[name*='languageDirection'] table tr>td:nth-child(2)>div";//"css=table[name='filterTmsCombo'] table tr>td:nth-child(2)>div";
	public final String edit_verifyDeliveryProfileFirstRowIsChecked="//div[contains(@id,'deliveryprofiles')]//tbody/tr[1][contains(@class,'x-grid-row-selected')]";
	public final String TM_firstDataRowName = "//div[contains(@id,'MainGrid')]//table//tr//td";
	
	public final String add_organization_SelectlanguageDirectionX(String name)
	{
		String result= "//div[contains(@name,'languageDirection')]//li[contains(text(),'"+name+"')]";//"css=div[name*='languageDirection'] li:contains('"+name+"')"; //"css=div[name='filterTmsCombo-boundlist'] li:contains('"+name+"')";
		return result;
	}
	public final String add_editOrg_languageDirectionInput="//div[contains(@name,'languageDirectionFilter')]//input[contains(@name,'languageDirectionFilter')]";//"//table[contains(@name,'languageDirectionFilter')]//input[contains(@name,'languageDirectionFilter')]";//"css=table[name*='languageDirectionFilter'] input[name*='languageDirectionFilter']";//"css=table[name='filterTmsCombo'] input[name='filterTmsCombo']";
	public final String add_editOrganization_selectUsd = "css=div[name='currencyCode'] div:contains('USD')";
	public final String add_editOrganization_inputParentOrganization = "//input[contains(@name,'parentOrganization')]";//"//input[contains(@name,'parentOrganization']";//"css=input[name='parentOrganization']";
	public final String add_editOrganization_selectAllTms = "//div[contains(@class,'organization_global_tm')][not(contains(@style,' display: none'))]//span[contains(@class,'checkheader')]";
	public final String editOrganization_selectAllTms = "//div[contains(@id,'gs4trcheckcolumn') and contains(@class,'x-column-header-last')]//span[contains(@class,'x-grid-checkheader')]";
	//public final String add_editOrganization_selectAllWorkflows = "//div[2]/div/div/div/div/div/div[2]/div/span";
	public final String add_editOrganization_selectAllWorkflows ="//div[contains(@class,'x-column-header-checkbox')]//span";
	public final String editOrganization_selectAllWorkflows = "css=div>table>thead>tr>td:nth-child(2)>div>div";
	public final String add_editOrganization_selectAllDeliveryProfiles = "//div[4]/div/div[2]/div/div/div/div/div/div[2]/div/span";
	public final String filters_inputOrganizationNameFind ="//input[@name='organizationNameInputText']";
	public final String organization_firstDataRowNameStaus="//table//tbody//tr//td[3]//div";
	//Currency Code
	public final String addOrganization_CurrencyX(String currencyType){
		String result = "//div[contains(@name,'currencyCode-boundlist')]//li[contains(text(),'"+currencyType+"')]";
		return result;
	}
	
	public final String add_editTm_selectTMX(String tmName)
	{
		return "//td[div[text()='"+tmName+"']]/following-sibling::td[last()]";
	}
	public final String editOrg_tmTab_tmheaderCheckBox="//div[contains(@id,'organization') or contains(@id,'Organization')]//span[contains(@id,'header')][contains(@class,'checked')]";//div[contains(@id,'pdorganizationtms')]//span[contains(@id,'header')][contains(@class,'checked')]";//div[contains(@id,'pdorganizationtms')]//span[contains(@class,'x-grid-checkheader-checked')]";
	
	public final String editOrg_tmTab_nextPageButton="//div[contains(@id,'OrganizationGlobalTmPaging')]//a//span[contains(@class,'page-next')]";
	public final String editOrg_tmTab_disabledNextButton="//div[contains(@id,'OrganizationGlobalTmPaging')]//a[@data-qtip='Next Page' or @data-qtip='Next page'] [contains(@class,'disabled')]";//div[contains(@id,'pdorganizationtms')]//div[contains(@class,'disabled')]//button[@data-qtip='Next Page']";
	
	public final String addOrganization_trpUrl = "//input[contains(@name,'url')]";
	public final String addOrganization_trpUsername = "//input[contains(@name,'username')]";
	public final String addOrganization_trpPassword = "//div[contains(@id,'Organization')]//div[contains(@name,'password')]//input[contains(@name,'password')]";//"//div[contains(@id,'Organization')]//table[contains(@name,'password')]//input[contains(@name,'password')]";
	public final String editOrganization_FileformatTab_fileformatName(String FileformatName)
	{
		return "//div[contains(@id,'FileFormatGrid')]//table//tr//td//div[text()='"+FileformatName+"']";
	}

	public final String addOrganization_selectGradingScoringModel(String name)
	{
		return "//div[contains(@id,'Organization')]//td/div[text()='"+name+"']";
	}

	public final String editOrganization_workflowDefinitionsTab ="//div[contains(@id,'Organization')]//a//span[contains(text(),'Workflow')]";//"//div[contains(@id,'Organization')]//a//span[text()='Workflow Definitions']/following-sibling::span";// "//div[contains(@id,'pdorganizationtabpanel')]/div[contains(@id,'tabbar')]//span[text()='Workflow Definitions']/..";
	//public final String editOrganization_workflowDefinitionsTab_checkAllWorkflows = "css=div.x-grid3-header-offset div.x-grid3-hd-inner.x-grid3-hd-checker>div.x-grid3-hd-checker";
	public final String editOrganization_workflowDefinitionsTab_checkAllWorkflows = "//div[contains(@id,'pdorganizationworkflowdefinitions')]//div[contains(@id,'headercontainer') and contains(@class,'x-box-inner')]//div[contains(@class,'x-column-header-last')]/div[contains(@class,'x-column-header-inner')]/span";
	public final String editOrganization_OkButton = "//div[contains(@id,'pdAdminOrganizationEditWindow')]//span[text()='OK']";
	public final String editOrganization_workflowTabSelectWorkflowX(String name)
	{
		String result="//div[contains(@id,'OrganizationGlobalWorkflow')]//table//tr/td/div[contains(text(),'"+name+"')]";//"css=div[id*='OrganizationGlobalWorkflow'] table tr>td>div:contains('"+name+"')";
		return result;
		
	}
	
	public final String organization_selectedWorkflow(String WF)
	{
		return "//div[contains(@id,'OrganizationEdit')]//div[contains(@id,'OrganizationGlobalWorkflow')]//table[contains(@class,'item-selected')]//tr/td/div[text()='"+WF+"']";//"//table//tr[(contains(@aria-selected,'true'))]/td/div[text()='"+WF+"']";//"//table//tr[(contains(@class,'x-grid-row-selected'))]/td/div[text()='"+WF+"']";
	}
	
	public final String editOrganization_workflowTab_selectWorkflow(String name)
	{
		String result="//div[contains(@id,'Organization') or contains(@id,'organization')]//table//tr//td//div[text()='"+name+"']";
		return result;
		
	}
	
	public final String editOrganization_workflowTab_selectWorkflow(int rowNumber)
	{
		String result="//div[contains(@id,'AdminOrganizationGlobalWorkflow')]//table["+rowNumber+"]";
		return result;
		
	}
	
	//select all checkboxes locators for edit organization
	
	public final String editOrganization_SelectCheckBoxFirstRow="//div[contains(@id,'OrganizationGlobalWorkflow')]//div[contains(@id,'OrganizationGlobalWorkflow')]//table[contains(@class,'x-grid-table')]//tr[contains(@class,'x-grid-row')]";//"//div[contains(@id,'pdorganizationtabwindow')]//div[contains(@id,'pdorganizationtabpanel')]//table[contains(@class,'x-grid-table')]//tr[contains(@class,'x-grid-row')]";
	//"css=div[id*='pdorganizationtabwindow'] div[id*='pdorganizationtabpanel'] table[class*='x-grid-table'] tr[class='x-grid-row']";
		
	public final String editOrganization_checkedCheckBox(int number)
	{
		String result="//div[contains(@id,'OrganizationGlobalWorkflow')]//div[contains(@id,'OrganizationGlobalWorkflow')]//table[contains(@class,'x-grid-table')]//tr["+(number+1)+"][contains(@class,'x-grid-row-selected')]";
		return result;
	}
	public final String editOrganization_checkCheckBox(int number)
	{
	String result="//div[contains(@id,'OrganizationGlobalWorkflow')]//table[contains(@class,'x-grid-table')]//tr["+(number+1)+"][not(contains(@class,'x-grid-row-selected'))]//div[contains(@class,'x-grid-row-checker')]";//"//div[contains(@id,'OrganizationGlobalWorkflow')]//div[contains(@id,'OrganizationGlobalWorkflow')]//table[contains(@class,'x-grid-table')]//tr["+(number+1)+"][[contains(@class,'x-grid-row')]]";//"css=div[id*='pdorganizationtabwindow'] div[id*='pdorganizationtabpanel'] table[class*='x-grid-table'] tr:nth-child("+(number+2)+") td:nth-child(2)>div>div";
	return result;
	}
	
	
	public final String add_edit_selectWorkflow(String name)
	{
		String result="css=div[class='x-grid3-cell-inner x-grid3-col-0']:contains('"+name+"')";
		return result;
	}
	
		
	public final String editOrg_TRPTab="//div[contains(@id,'Organization')]//a//span[contains(text(),'TRP')]/following-sibling::span";//"css=div[id*='Organization'] a span:contains('TRP')";
	
	public final String addEditOrg_workflowCount="//div[contains(@id,'workflow')][not(contains(@style,'none'))]//table/tbody/tr[contains(@class,'x-grid-row')]/td[1]/div";
	public final String addEditOrg_checkedWorkflowX(int workflowRowX)
	{
		return "//div[contains(@id,'workflow')][not(contains(@style,'none'))]//table/tbody/tr["+(workflowRowX+2)+"][contains(@class,'selected')]/td[1]/div";
	}
	// check unchecked workflows
	public final String addEditOrg_checkUncheckedWorkflow(int workflowRowX)
	{
		//as row starts with 2 add 2;
		return "//div[contains(@id,'workflow')][not(contains(@style,'none'))]//table/tbody/tr["+(workflowRowX+2)+"]/td[1]/div";
	}
	public final String editOrg_verifyCheckedTMX(String tm)
	{
		return "//div[contains(@id,'OrganizationEditTabTm')]//tr[td/div[text()='"+tm+"']]/td[last()]";//"//div[contains(@id,'organizationtm')]//tr[td/div[text()='"+tm+"']]/td[last()]";
	}
	
	
	public final String add_edit_filterTMs="//div[contains(@id,'Organization') or contains(@id,'PaClientGlobalTM')]//input[contains(@name,'name')]";//"//input[contains(@name,'nameFilter')]";//input[contains(@name,'filterTmsField')]";//
	public final String add_organization_filterTMs_name="//input[contains(@name,'nameFilter')]";
	public final String add_edit_filterTMFindButton="//span[contains(text(),'Find')]";//"//span[contains(text(),'Find')]/following-sibling::span";
	public final String editOrg_TMTab_onlyAssignedCheckbox="//div[contains(@name,'onlyAssigned')]//div[contains(@class,'wrap-inner')]//span[contains(@id,'displayEl')]";//"//div[contains(@name,'onlyAssigned')]//div[contains(@class,'wrap-inner')]";//"//label[text()='Only Assigned']";
	public final String editOrg_tmTab_assignAllTMButton="//span[text()='Assign all TMs']";//"//span[text()='Assign All TMs']/following-sibling::span";
	public final String add_editOrg_gradingAndScoringTab="//div[contains(@class,'OrganizationTabWindow ')]//span[text()='G+S']";
	
	public final String editOrg_verify_gradingScoring_Name_Checked(String gsModelName)
	{
		return "//div[contains(@id,'OrganizationGlobalGradingScoring') and contains(@class,'x-tabpanel-child')]//table[contains(@class,'x-grid-item-selected')]//div[text()='"+gsModelName+"']";//"//div[contains(@id,'OrganizationGlobalGradingScoring') and contains(@class,'x-tabpanel-child')]//table//tr[contains(@class,'x-grid-row-selected')]//div[text()='"+gsModelName+"']";
		//return "//div[contains(@id,'pdorganizationtabpanel')]//div[contains(@id,'pdOrganizationGradingScoring') and contains(@class,'x-tabpanel-child')]//table//tr[contains(@class,'x-grid-row-selected')]//div[text()='"+gsModelName+"']";
	}
	
	public final String editOrg_verify_gradingScoring_Name_Is_unChecked(String gsModelName)
	{
		return "//div[contains(@id,'OrganizationGlobalGradingScoring') and contains(@class,'x-tabpanel-child')]//table[not(contains(@class,'x-grid-item-selected'))]//div[text()='"+gsModelName+"']";//"//div[contains(@id,'OrganizationGlobalGradingScoring') and contains(@class,'x-tabpanel-child')]//table//tr[not(contains(@class,'x-grid-row-selected'))]//div[text()='"+gsModelName+"']";
		//return "//div[contains(@id,'pdorganizationtabpanel')]//div[contains(@id,'pdOrganizationGradingScoring') and contains(@class,'x-tabpanel-child')]//table//tr[not(contains(@class,'x-grid-row-selected'))]//div[text()='"+gsModelName+"']";
	}
	
	
	public final String addOrganization_tmTab_checkAllTM_headerCheckbox="//div[contains(@id,'OrganizationAdd') and not(contains(@style,'display: none'))]//div[contains(@id,'Tm')]//span[contains(@class,'checkheader')]";
	public final String addOrganization_workflowTab_checkAllworkflow_headerCheckbox="//div[contains(@id,'Organization')]//div[contains(@id,'Workflow')]//div[contains(@class,'header-last')]//div[contains(@class,'column-header-text')]";
	public final String addOrganization_fileFormatTab_checkAllFileFormatsheaderCheckbox="//div[contains(@id,'Organization')]//div[contains(@id,'FileFormat')]//div[contains(@class,'header-last')]//div[contains(@class,'x-column-header-text')]";
	public final String addOrganization_fileFormatTab_checkAllFileFormatsheaderCheckbox_checked="//div[contains(@id,'Organization')]//div[contains(@id,'FileFormat')]//div[contains(@class,'header-last')][contains(@class,'checker-on')]//div[contains(@class,'x-column-header-text')]";
	public final String addOrganization_deliveryProfileTab_checkAllDeliveryProfile_headerCheckbox="//div[contains(@id,'Organization')]//div[contains(@id,'Delivery')]//div[contains(@class,'header-last')]//div[contains(@class,'column-header-text')]";
	
	//No References in this project
	
	//public final String editOrganizationSelectCurrencyCode = "//form[@class= \"x-panel-body x-panel-body-noborder x-form\"]/div[2]/div/div/img";
	//public final String selectParentOrganization = "//form[@class= \"x-panel-body x-small-editor-body-noheader x-small-editor-body-noborder x-form\"]/div[4]/div/div/img";
	//public final String selectParentOrganizationTestClient = "//div[@name= \"undefined\"]//div[contains(text(), \"TestClient\")]";
	//public final String selectParentOrganizationChildOrganization = "//div[@name= \"undefined\"]//div[contains(text(), \"Child Organization\")]";
	//public final String selectParentOrganizationChildOrganizationTwo = "//div[@name= \"undefined\"]//div[contains(text(), \"Child Organization Two\")]";
	//public final String clickOnTestClient = "//div[contains(text(), \"TestClient\")]";
	//public final String clickOnOrganizationOne = "//div[contains(text(), \"Organization One\")]";
	//public final String clickOnTestOrganization = "//div[contains(text(), \"Test Organization\")]";
	//public final String clickOnChildOrganization = "//div[contains(text(), \"Child Organization\")]";
	//public final String clickOnChildOrganizationTwo = "//div[contains(text(), \"Child Organization Two\")]";
	//public final String editOrganizationOkButton = "//div[@class= \"x-window-footer x-window-footer-noborder x-panel-btns\"]/div/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/em/button";
	//public final String editOrganizationCancelButton = "//div[@class= \"x-window-footer x-window-footer-noborder x-panel-btns\"]/div/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/em/button";
	//public final String editOrganizationSelectParentOrganization = "//form[@class= \"x-panel-body x-panel-body-noborder x-form\"]/div[3]/div/div/img";
	//public final String clickOnOrganizationOneChanged = "//div[contains(text(), \"Organization-One-Changed\")]";
	//public final String selectEur = "//div[@name= \"currencyCode\"]//div[contains(text(), \"EUR\")]";
	//public final String clickOnFalse = "//div[contains(text(), \"false\")]";
	//public final String checkNameTestClient = "//div[contains(text(), \"Name: TestClient\")]";
	//public final String testClientInFirstRow = "//div[@class= \"x-grid3-scroller\"]/div/div[1]/table/tbody/tr/td[1]//div[contains(text(), \"TestClient\")]";
	//public final String selectTmTestServer = "//div[@class= \"x-grid3-body\"]//div[contains(text(), \"Tm Test Server\")]";
	//public final String translationMemoryTab = "//span[contains(text(), \"Translation Memory\")]";
	//public final String workflowDefinitionsTab = "//span[contains(text(), \"Workflow Definitions\")]";
	//public final String deliveryProfilesTab = "//span[contains(text(), \"Delivery Profiles\")]";
	
	public final String editOrganization_workflowTab_firstRow = "//div[contains(@id,'OrganizationGlobalWorkflowPanel')]//table[1]";

		
}
