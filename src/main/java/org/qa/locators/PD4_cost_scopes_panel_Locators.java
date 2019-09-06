package org.qa.locators;
/*Created by Alfonso Almanza
 * 01/27/11 translations.com
 */
public class PD4_cost_scopes_panel_Locators {
	private static PD4_cost_scopes_panel_Locators ue;
	
	public static synchronized PD4_cost_scopes_panel_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_cost_scopes_panel_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_cost_scopes_panel_Locators();
		}
		return ue;
	}
	
	public final String filters_costScope_inputCostScopeFind = "//input[@name='costScopeNameInputText']";
	
	public final String costScopes_addCostScope_button = "//span[contains(text(),'Create Cost Model')]";//"//span[contains(@id,'add_cost_scope')]";
	public final String costScopes_editCostScope_button = "//span[contains(@id,'edit_cost_scope')]/following-sibling::span";
	public final String costScope_firstDataRowName = "//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";//"css=tbody>tr>td>div";
	public final String costScope_firstDataRowNameY(String costscope_Name){
		String result = "//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,' x-grid-cell-first')]/div[contains(text(),'"+costscope_Name+"')]";
		return result;
	}
	public final String costScope_firstDataRowIsDefault = "css=tbody>tr>td:nth-child(2)>div";
	public final String costScope_nameRowTitle = "//div[contains(@id,'headercontainer')]//div[contains(@class,'x-column-header-inner')]//span[contains(text(),'Name')]";//"//div[contains(@id,'headercontainer')]//div[contains(@class,'x-column-header-inner')]/span[contains(text(),'Name')]";///../div[contains(@class,'x-column-header-trigger')]
	public final String costScope_namelable = "//label//span[contains(text(),'Name:')]";
	public final String costScope_isDefaultRowTitle = "//div[contains(@id,'headercontainer')]//div[contains(@class,'x-column-header-inner')]//span[contains(text(),'Is Default')]/..";//"//div[contains(@id,'headercontainer')]//div[contains(@class,'x-column-header-inner')]/span[contains(text(),'Is Default')]/..";
	
	public final String costScope_nameRowTitleOptions = "//div[contains(@id,'headercontainer')]//div[contains(@data-qtip,'Name')]//div[contains(@class,'header-trigger')]";//"//div[contains(@id,'headercontainer')]//div[contains(@class,'x-column-header-inner')]/span[contains(text(),'Name')]/../div[contains(@class,'x-column-header-trigger')]";
	public final String costScope_isDefaultRowTitleOptions = "//div[contains(@id,'headercontainer')]//div[contains(@data-qtip,'Is Default')]//div[contains(@class,'header-trigger')]";//"//div[contains(@id,'headercontainer')]//div[contains(@class,'x-column-header-inner')]/span[contains(text(),'Is Default')]/../div[contains(@class,'x-column-header-trigger')]";
	public final String costScope_checkNameMenuItem="//a[contains(@id,'menucheckitem') and contains(@class,'x-menu-item-link')]/span[contains(@id,'menucheckitem') and contains(text(),'Name')]";
	public final String costScope_checkIsDefaultMenuItem= "//a[contains(@id,'menucheckitem') and contains(@class,'x-menu-item-link')]/span[contains(@id,'menucheckitem') and contains(text(),'Is Default')]";
	
	public final String addCostScope_removeFuzzy="//div[contains(@id,'AdminCostScopeToolabar')]//span[text()='Remove']";//"//span[text()='Remove']/following-sibling::span";
	public final String addCostScope_removeFuzzy_ErrorMsgCloseButton ="//div[contains(@id,'warnin')]//span[contains(text(),'Close')]";//"//div[contains(@id,'warnin')]//span[contains(text(),'Close')]/following-sibling::span";
	public final String addCostScope_removeFuzzy_disabled= "//div[contains(@id,'pdAdminCostScopeToolabar')]//a[contains(@class,'disabled')]//span[contains(text(),'Remove')]";//"//div[contains(@id,'pdAdminCostScopeToolabar')]//a[contains(@class,'disabled')]//span[contains(text(),'Remove Fuzzy')]/following-sibling::span";//"//div[contains(@id,'pdcostscopetoolbar')]//a[contains(@class,'disabled')]//span[contains(text(),'Remove Fuzzy')]/..";
	
	public final String addCostScope_addFuzzy_button = "//div[contains(@id,'dAdminCostScopeToolabar')]//span[text()='Add Fuzzy']";//"//span[text()='Add Fuzzy']";
	public final String addCostScope_addFuzzy_CancelButton = "//div[contains(@id,'CostScopeFuzzyDialog')]//span[contains(text(),'Cancel')]";//"//div[contains(@id,'CostScopeFuzzyDialog')]//span[contains(text(),'Cancel')]/following-sibling::span";
	public final String addCostScope_addFuzzy_okButton = "//div[contains(@id,'CostScopeFuzzyDialog')]//span[contains(text(),'OK')]";
	public final String addCostScope_addFuzzy_OkButtonDisabled="//div[contains(@id,'pdAdminCostScopeFuzzyDialog')]//a[contains(@class,'x-btn-disabled')]//span[contains(text(),'OK')]/..";// "//div[contains(@id,'pdcostscopedialog')]//a[contains(@class,'x-btn-disabled')]//span[contains(text(),'OK')]/..";
	public final String addCostScope_defaultCheck ="//div[contains(@name,'isDefaultCheckBox')]//span[contains(@class,'checkbox')]";
	
	public final String addCostScope_CancelButton = "//div[contains(@id,'pdAdminCostScopeAdd')]/div[contains(@id,'toolbar')]//span[contains(text(),'Cancel')]/following-sibling::span";
	public final String addCostScope_OkButton = "//div[contains(@id,'pdAdminCostScopeAdd')]/div[contains(@id,'toolbar')]//span[contains(text(),'OK')]";
	public final String addCostScope_OkButtonDisable = "//div[contains(@id,'pdAdminCostScopeAdd')]/div[contains(@id,'toolbar')]//a[contains(@class,'disabled')]//span[contains(text(),'OK')]";
	public final String addCostScope_inputCostScopeName ="//div[contains(@name,'costScopeName')]//input[contains(@name,'costScopeName')]";
	public final String addCostScope_configuredecimal_dropdown ="//div[contains(@name,'decimalsCombo')]//div[contains(@class,'arrow-trigger')]";
	public final String addCostScope_inputCostScopeNamefind = "//input[@name= 'costScopeNameInputText']";
	public final String addCostScope_firstDataRowName = "//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";
	public final String addCostScope_addFuzzy_inputFuzzyFrom = "//div[contains(@id,'CostScopeFuzzyDialog') and contains(@class,'x-window-body-default')]//div[contains(@name,'costScopeFuzzyFrom')]//input[contains(@name,'costScopeFuzzyFrom')]";
	public final String addCostScope_addFuzzy_inputFuzzyTo = "//div[contains(@id,'CostScopeFuzzyDialog') and contains(@class,'x-window-body-default')]//div[contains(@name,'costScopeFuzzyTo')]//input[contains(@name,'costScopeFuzzyTo')]";
	public final String addCostScope_checkFuzzy5060 = "//table//tbody//tr//td//div[contains(text(),'50% - 60%')]";
	public final String addCostScope_checkFuzzy6180 = "//table//tbody//tr//td//div[contains(text(),'61% - 80%')]";
	public final String addCostScope_checkFuzzy8199 = "//table//tbody//tr//td//div[contains(text(),'81% - 99%')]";
	public final String addCostScope_checkFuzzy7599="//table//tbody//tr//td//div[contains(text(),'75% - 99%')]";
	public final String addCostScope_checkRepetitions = "//div[contains(@id,'pdAdminCostScopeGrid')]//td/div[text()='Repetitions']";//"//div[contains(@id,'pdcostscopegrid')]//td/div[text()='Repetitions']";
	public final String add_edit_costScope_checkContext = "//table//tbody//tr//td//div[contains(text(),'Context')]";
	public final String add_edit_costScope_check100Match = "//table//tbody//tr//td//div[contains(text(),'100% Match')]";
	public final String add_edit_costScope_checkNoMatch = "//table//tbody//tr//td//div[contains(text(),'No Match')]";	
	public final String add_edit_costScope_clickOnIsDefaultColumn = "//span[text()='Is Default']";
	public final String add_edit_costScope_clickOnNameColumn="//span[text()='Name']";
	public final String editCostScope_OkButton = "//div[contains(@id,'pdAdminCostScopeEdit')]//span[contains(text(),'OK')]/..";//"//div[contains(@id,'pdeditcostscope')]//span[contains(text(),'OK')]/..";
	public final String addCostScope_removeLineitem_warningmsg_YesButton = "//div[contains(@id,'warningdialog')]//span[contains(text(),'Yes')]";
	public final String checkCostScopeName (String costScopeName){
		String result = "//div//table//tbody//tr//td//div[contains(text(),'"+costScopeName+"')]";
		return result;
	}
	
	public final String AddCostScope_SelectConfigureDecimal (String options){
		String result = "//div[contains(@name,'decimalsCombo-boundlist')]//li[text()='"+options+"']";
		return result;
	}
	public final String AddCostScope_ConfigureDecimal_input = "//input[contains(@name,'decimalsCombo')]";	
	
	public final String costScopes_costScopeFilterNameX (String filterName){
		String result = "//a/span[text()='"+filterName+"']";
		return result;
	}
	public final String costScope_editCostScope_fuzzyText(String fuzzyText)
	{
		String result = "//tbody//tr//td//div[contains(text(),'"+fuzzyText+"')]";
		return result;
	}
	public final String costScopeNameX(Integer row){
		String result ="//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";
		return result;
	}

	public final String groupTitleX (String title){
		String result = "//div[contains(@class,'x-grid-group-title')][contains(text(),'"+title+"')]";
		return result;
	}

	
	public final String add_edit_costScope_IsDefaultFalse = "//div//table//tbody//tr//td[2]//div[contains(text(),'false')]";
	public final String add_edit_costScope_isDefaultTrue="//div//table//tbody//tr//td[2]//div[contains(text(),'true')]";
	public final String costScope_errorMessageOkButton = "//div[@class='x-panel-fbar x-small-editor x-toolbar-layout-ct']//table//tbody//tr[2]//td[2]//em>//button[contains(text(),'OK')]";
	public final String costScope_errorMessageCloseButton = "//div[contains(@id,'warning')]//span[contains(text(),'Close')]/..";
}
