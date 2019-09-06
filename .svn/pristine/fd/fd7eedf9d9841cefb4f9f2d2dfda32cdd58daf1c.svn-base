package org.qa.locators;
/*Created by Alfonso Almanza
 * 01/27/11 translations.com
 */
public class PD4_vendors_panel_Locators {
	private static PD4_vendors_panel_Locators ue;
	
	public static synchronized PD4_vendors_panel_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_vendors_panel_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_vendors_panel_Locators();
		}
		return ue;
	}
	
	//Vendor Pane
	public final String vendor_addVendorButton = "//span[contains(@id,'add_vendor')]";
	public final String vendor_editVendorButton = "//span[contains(@id,'edit_vendor')]";//"//span[contains(@id,'edit_user_action')]";//"//span[contains(@id,'edit_vendor')]";
	public final String vendor_enableDisableVendorButton = "//span[contains(text(),'Enable/Disable')]";
	public final String vendor_warningCloseButton="//div[contains(@id,'warningdialog')]//span[text()='Close']";//"//div[contains(@id,'warningdialog')]//span[text()='Close']/following-sibling::span";
	public final String vendor_importVendorUser="//span[contains(@id,'import_vendor')]";
	public final String vendor_resetVendorNotifications="//span[contains(@id,'vendor_notification')]";
	public final String vendor_enableDisableVendorContinueBtn="//div[contains(@id,'warning')]//div[contains(@id,'toolbar')]//a//span[text()='Continue']";
	
	//find vendors
	public final String vendor_firstDataRowName ="//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]"; //"//div[contains(@id,'mainTabPanel')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";
	public final String vendor_secondDataRowName = "//table//tbody//tr[3]//td//div";
	public final String vendor_firstDataRowStatus = "//tbody//tr//td[2]//div";
	public final String vendor_firstDataRow="//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')][1]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')][1]";
			
	//Sorting and grouping locators
	public final String vendor_nameRowTitle = "//div[contains(@id,'gridcolumn')]//span[text()='Name']";
	public final String vendor_enabledRowTitle = "//div[contains(@id,'gridcolumn')]//span[text()='Enabled']";
	public final String vendor_nameRowTitleOptions = "//div[contains(@id,'MainGrid')]//div[contains(@data-ref,'trigger')]";//"//div[@data-qtip='Name']//div[contains(@class,'trigger')]";//"//div[@data-qtip='Name']//span/following-sibling::div";//css=div:nth-child(1)>div>table>thead>tr>td:nth-child(1)>div>a";
	public final String vendor_enabledRowTitleOptions = "//div[contains(@data-qtip,'Status')]//div[contains(@class,'trigger')]";//"//div[@data-qtip='Status']//span/following-sibling::div";//css=div:nth-child(1)>div>table>thead>tr>td:nth-child(2)>div>a";
	public final String vendor_firstGroupTitle = "css=div.x-grid-group-title";
	public final String vendor_vendorNameDataRow = "//tbody/tr/td[1]/div";//"css=tbody>tr>td:nth-child(1)>div";	
	
	//Add vendor dialog box 
	public final String vendor_addVendor_inputVendorName = "//input[contains(@name,'vendorName')]";
	public final String vendor_addVendor_inputProjectaID = "//input[contains(@name,'projectAVendorId')]";
	public final String vendor_addVendor_saveButton = "//div[contains(@id,'Vendor')]//span[contains(text(),'Save')]";
	
	//Edit vendor tabs and details
	public final String vendor_editVendor_downloadFormatsTab = "//div[contains(@id,'Vendor')]//span[contains(text(),'Download Formats')]";//css=span:contains('Download Formats')";
	public final String vendor_editVendor_costModelTab = "//div[contains(@id,'Vendor')]//div[contains(@id,'tabbar')]//span[contains(text(),'Cost Model')]";
	
	public final String vendor_editVendor_clickFirstLanguageDirectionGold = "//div[contains(@id,'Vendor')]//div[contains(@id,'Vendor')]//table[contains(@id,'tableview')]//tr/td[2]/div[contains(@class,'inner')]";//"//div[contains(@id,'Vendor')]//div[contains(@id,'Vendor')]//table[contains(@id,'gridview')]//tr/td[2]/div";		
	public final String vendor_editVendor_inputLanguageDirectionGold = "//div[not(contains(@style,'display'))][@class='x-editor x-small-editor x-grid-editor x-grid-cell-editor x-layer x-editor-default x-border-box']//input";//"//div[not(contains(@style,'display'))][@class='x-editor x-small-editor x-grid-editor x-grid-cell-editor x-layer x-editor-default x-border-box']//td/input";//table[@name='gold']//input[@name='gold']";
	public final String vendor_editVendor_clickFirstLanguageDirection100Match = "//div[contains(@id,'Vendor')]//div[contains(@id,'Vendor')]//table[contains(@id,'tableview')]//tr/td[3]/div[contains(@class,'inner')]";//"//div[contains(@id,'Vendor')]//div[contains(@id,'Vendor')]//table[contains(@id,'gridview')]//tr/td[3]/div";
	public final String vendor_editVendor_inputLanguageDirection100Match = "//div[not(contains(@style,'display'))][@class='x-editor x-small-editor x-grid-editor x-grid-cell-editor x-layer x-editor-default x-border-box']//input";//"//div[not(contains(@style,'display'))][@class='x-editor x-small-editor x-grid-editor x-grid-cell-editor x-layer x-editor-default x-border-box']//td/input";//table[@name='match100']//input[@name='match100']";
	public final String vendor_editVendor_clickFirstLanguageDirectionNomatch = "//div[contains(@id,'Vendor')]//div[contains(@id,'Vendor')]//table[contains(@id,'tableview')]//tr/td[4]/div[contains(@class,'inner')]";//div[contains(@id,'Vendor')]//div[contains(@id,'Vendor')]//table[contains(@id,'gridview')]//tr/td[4]/div";
	public final String vendor_editVendor_inputLanguageDirectionNoMatch = "//div[not(contains(@style,'display'))][@class='x-editor x-small-editor x-grid-editor x-grid-cell-editor x-layer x-editor-default x-border-box']//input";//"//div[not(contains(@style,'display'))][@class='x-editor x-small-editor x-grid-editor x-grid-cell-editor x-layer x-editor-default x-border-box']//td/input";//table[@name='noMatch']//input[@name='noMatch']";
	public final String vendor_editVendor_clickFirstLanguageDirectionRepetitions = "//div[contains(@id,'Vendor')]//div[contains(@id,'Vendor')]//table[contains(@id,'tableview')]//tr/td[5]/div[contains(@class,'inner')]";//"//div[contains(@id,'Vendor')]//div[contains(@id,'Vendor')]//table[contains(@id,'gridview')]//tr/td[5]/div";
	public final String vendor_editVendor_inputLanguageDirectionRepetitions = "//div[not(contains(@style,'display'))][@class='x-editor x-small-editor x-grid-editor x-grid-cell-editor x-layer x-editor-default x-border-box']//input";//"//div[not(contains(@style,'display'))][@class='x-editor x-small-editor x-grid-editor x-grid-cell-editor x-layer x-editor-default x-border-box']//td/input";//table[@name='repetitions']//input[@name='repetitions']";
	public final String vendor_editVendor_clickFirstLanguageDirection_NewFuzzy = "//div[contains(@id,'Vendor')]//div[contains(@id,'Vendor')]//table[contains(@id,'tableview')]//tr/td[6]/div[contains(@class,'inner')]";//"//div[contains(@id,'Vendor')]//div[contains(@id,'Vendor')]//table[contains(@id,'gridview')]//tr/td[5]/div";
	public final String vendor_editVendor_inputLanguageDirection_NewFuzzy = "//div[not(contains(@style,'display'))][@class='x-editor x-small-editor x-grid-editor x-grid-cell-editor x-layer x-editor-default x-border-box']//input";//"//div[not(contains(@style,'display'))][@class='x-editor x-small-editor x-grid-editor x-grid-cell-editor x-layer x-editor-default x-border-box']//td/input";//table[@name='repetitions']//input[@name='repetitions']";
	
	public final String vendor_editVendor_SaveButton = "//div[contains(@id,'Vendor')]//span[text()='Save']";//"//div[contains(@id,'Vendor')]//span[text()='Save']/following-sibling::span";
	public final String vendor_editvendor_SaveButtonDisabled="//div[contains(@id,'Vendor')]//a[contains(@class,'disabled')]//span[text()='Save']";//"//div[contains(@id,'Vendor')]//a[contains(@class,'disabled')]//span[text()='Save']/following-sibling::span";
	public final String vendor_editVendorWindow="//div[text()='Use this page to edit Vendors and define Cost Models.']";
	public final String vendor_editVendor_costScopeTab_costScopeSelect= "//div[contains(@id,'Vendor')]//div[contains(@name,'costScopeCombo')]//div[contains(@class,'x-form-arrow-trigger')]";
	
	//select any file format in edit vendor download file  format tab
	public final String vendor_editVendor_downloadFileFormats_fileFormatX(String fileFormatName)
	{
		return "//div[contains(@id,'pdAdminVendorEditDownloadFormats')]//table//tr[td/div[text()='"+fileFormatName+"']]/td//div[contains(@class,'checkcolumn')]";
	}
	public final String vendor_selectVendorX(String vendorName){
		return "css=table>tbody>tr>td>div:contains('"+vendorName+"')";
	}
	
	
	//User defined	
	public final String vendor_vendorNameX(Integer row){
		return "css=div[id*='pdmaingrid'] table>tbody>tr:nth-child("+(row)+")>td>div";
	}
	
	public final String vendor_enabledX(Integer row){
		return "css=div[id*='pdmaingrid'] table>tbody>tr:nth-child("+(row)+")>td:nth-child(2)>div";//css=div:nth-child("+row+")>table>tbody>tr>td:nth-child(2)>div";
	}


	/**
	 * Select a Cost Scope cell by language pair and cell order number
	 * 
	 * @param languagePair language pair in cost model
	 * @param costCellX value number (e.g. for default cost scope 1-first(Gold), 2-second(100%),3-third(No Match), 4-Repetitions)
	 * @return locator string
	 */
	public final String vendor_editVendorCostModelCellX(String languagePair,Integer costCellX)
	{
		
		return "//div[contains(@id,'CostModelGrid')]//td[div//span[text()='"+languagePair+"']]/following-sibling::td["+(costCellX+1)+"]";
		//return "//b/span[contains(text(),'"+languagePair+"')]/../../../../td["+(costCellX+1)+"]";
	}

	public final String vendor_editVendorCostModel_selectCellXForLanguageDirX(String langDir,int cellNo)
	{
		return "//tr/td[div//span[contains(text(),'"+langDir+"')]]/following-sibling::td["+cellNo+"]"	;
	}
	
	
	
	/**
	 * Select a Cost Scope cell by language order number and cell order number
	 * 
	 * @param languagePairX language pair number
	 * @param costCellX value number (e.g. for default cost scope 1-first(Gold), 2-second(100%),3-third(No Match), 4-Repetitions)
	 * @return locator string
	 */
	
	public final String vendor_editVendorCostModelCellX(Integer languagePairX,Integer costCellX)
	{
		return "//div[contains(@id,'Vendor') or contains(@id,'vendor')]//table[contains(@id,'view')]//tr["+(languagePairX)+"]//td["+(costCellX+1)+"]//div";
	}
	public final String editVendorCostModelX(String costModel)
	{
		return "//div[contains(@name,'costScopeCombo-boundlist')]//li[contains(text(),'"+costModel+"')]";
	}
	public final String editVendorCostModelParameter(String costModelParameter)
	{
		return "//div[contains(@id,'VendorEditCostScope')]//span[contains(text(),'"+costModelParameter+"')]";
	}
	
	public final String vendor_editVendorCostModelValueInput = "//div[contains(@class,'x-editor-default') and not(contains(@style,'display: none'))]//div[contains(@id,'numberfield') and contains(@class,'x-form-trigger-wrap')]//input";
	public final String vendor_editVendorCostModelSaveButton = "//div[contains(@id,'VendorEdit')]//div[contains(@id,'toolbar')]//span[text()='Save']";
	
	//Review Budget
	public final String green_AcceptBudget ="//div[contains(@class,'x-window x-window-noborder')]//span[contains(@style,'color: green') and contains(text(),'accepted')]";
	//public final String acceptBudget_checkBox ="//div[contains(@class,'x-window x-window-noborder') and contains(@style,'visible')]//table[contains(@class,'x-grid3-row-table')]/tbody/tr/td[contains(@class,'x-grid3-dirty-cell')][2]/div/div";
	public final String acceptBudget_checkBox ="//div[contains(@id,'pdreviewsubmissionbudgetdialog')]//tr[td/div/span[text()='countered']]/td[14]//div";//div[contains(@class,'x-window x-window-noborder') and contains(@style,'visible')]//div[contains(@class,'x-grid3-body')]//table/tbody/tr/td[14]/div/div";
	public final String declineBudget_checkBox ="//div[contains(@id,'pdreviewsubmissionbudgetdialog')]//tr[td/div/span[text()='countered']]/td[16]//div";
	public final String declineBudget_comment ="//div[contains(@id,'budgetpmcommentdialog')]//textarea";
	public final String declineBudget_comment_SaveButton ="//div[contains(@id,'budgetpmcommentdialog')]//span[text()='Save']";//div[@class=' x-window']//button[contains(@class,'x-btn-text') and contains(text(),'Save')]";
	public final String reviewBudget_SaveButton ="//div[contains(@id,'pdbudgetoverviewdialog')]//div[contains(@id,'toolbar')]//a//span[text()='Save']/following-sibling::span";
	public final String reviewBudget_cancelButton="css=div[id*='pdbudgetoverviewdialog'] span:contains('Cancel')";
	public final String counterBudget_checkbox="//div[contains(@id,'pdreviewsubmissionbudgetdialog')]//tr[td/div/span[text()='countered']]/td[15]//div";
	public final String declineBudget_status ="//div[starts-with(@id,'pdreviewbudgetdialog') and contains(@class,'x-window-default')]//div[starts-with(@id,'gridpanel') and contains(@class,'x-panel-default')]//descendant::tr[contains(@class,'x-grid-row')][child::td[contains(@class,'x-grid-cell')][child::div/span[contains(text(),'declined')]]][1]";
		
	
	public final String reviewBudget_additionalCosts ="//table[@name='additionalCosts']//input[@name='additionalCosts']";
	public final String reviewBudget_markUp ="//table[@name='markUp']//tr//td//div[@name='markUp']";
	
	public final String reviewBudget_declineSaveButton="//div[contains(@id,'budgetpmcommentdialog')]//span[text()='Save']/following-sibling::span";
	public final String reviewBudget_declineCloseButton="//div[contains(@id,'budgetpmcommentdialog')]//button/span[text()='Close']/following-sibling::span";
	public final String counterBudget_pmComment="//table[@name='pmComment']//textarea";
	
	public final String acceptBudget_checkboxX(int row)
	{
		//String result="//div[contains(@id,'pdreviewsubmissionbudgetdialog')]//tr["+(1+(row*2))+"]/td[14]//div";
		String result= "//div[contains(@id,'reviewbudget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//table//tr["+(row)+"]/td[14]";//div[contains(@class,'x-grid-checkcolumn')]";//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//tr[contains(@class,'x-grid-row')]["+row+"]/td[14]/div/div[contains(@class,'x-grid-checkheader')]";
		return result;
	}
	
	public final String countertBudget_checkboxX(int row)
	{
		//String result="//div[contains(@id,'pdreviewsubmissionbudgetdialog')]//tr["+(1+(row*2))+"]/td[15]//div";
		return "//div[contains(@id,'reviewbudget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//table//tr["+(row)+"]/td[15]";//div[contains(@class,'x-grid-checkcolumn')]";//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//tr[contains(@class,'x-grid-row')]["+row+"]/td[15]/div/div[contains(@class,'x-grid-checkheader')]";
	}
	
	public final String declineBudget_checkboxX(int row)
	{
		return "//div[contains(@id,'reviewbudget')]//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'display: none'))]//table//tr["+(row)+"]/td[16]";//div[contains(@class,'x-grid-checkcolumn')]";//div[@class='x-panel x-fit-item x-panel-default'][not(contains(@style,'none'))]//tr["+(row+2)+"]/td[16]/div/div[contains(@class,'x-grid-checkheader')]";
	}
	
	
	public final String releaseTranslationBatchCount="//div[contains(@id,'submission') or contains(@id,'Submission')]//div/table[contains(@class,'x-grid-table')]/tbody/tr[not(contains(@class,'x-grid-row-selected'))]//table//tr";//div[contains(@id,'pddefaultsubmissionactiondialog')]//table/tbody/tr/td/table/tbody/tr[2]/td[2]/div";
	public final String releaseTranslation_selectBatchX(int i)
	{
		return "//div[contains(@id,'submission') or contains(@id,'Submission')]//table[contains(@class,'grid')]/tbody/tr["+i+"]//tbody/tr[contains(@class,'x-grid-data-row')]";//div[contains(@id,'submission')]//table[contains(@class,'grid')]//tbody/tr["+i+"][contains(@class,'x-grid-data-row')]";//div[contains(@id,'pddefaultsubmissionactiondialog')]//table/tbody/tr["+(1+(i*2))+"]/td/table/tbody/tr[2]/td[2]/div";
	}
	
	
	
	public final String verifyImportSummary(String summary)
	{
		return "//table[contains(@name,'summary')]//tr//td//div[contains(@name,'summary') and text()='"+summary+"']";
	}
	
	public final String vendor_editVendorCostModelTab = "//span[text()='Cost Model']";
}