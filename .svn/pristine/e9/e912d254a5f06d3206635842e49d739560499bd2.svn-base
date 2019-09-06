package org.qa.locators;

public class PD4_gradingNscoring_panel_locators {

	private static PD4_gradingNscoring_panel_locators ue;
	
	public static synchronized PD4_gradingNscoring_panel_locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_gradingNscoring_panel_locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_gradingNscoring_panel_locators();
		}
		return ue;
	}
	
	
	
	public final String add_gradingScoringButton="//span[contains(@id,'add_grading')]";
	public final String edit_gradingScoringButton="//span[contains(@id,'edit_grading')]";
	public final String enable_gradingScoringButton="//span[contains(@id,'enable_grading')]";
	public final String copy_gradingScoringButton="//span[contains(@id,'copy_grading')]";
	public final String delete_gradingScoringButton="//span[contains(@id,'delete_grading')]";
	
	public final String add_editGSWizard_gradingTab="//div[contains(@id,'Grading')]//a//span[text()='Gradings']";
	public final String add_editGSWizard_scoringTab="//div[contains(@id,'Grading')]//a//span[text()='Scorings']";
	public final String add_editGSWizard_scoringTab_addGSButton="//div[contains(@id,'GradingScoringEdit')][contains(@class,'window-body')]//div[contains(@name,'scoringsGrid')]//span[contains(text(),'Add')]";
	public final String add_editGSWizard_addGSButton="//div[contains(@id,'GradingScoringAdd')][(contains(@aria-hidden,'false'))]//div[contains(@id,'GradingScoringTabPanel')]//div[contains(@class,'tabpanel')][not(contains(@class,'hidden'))]//a//span[text()='Add']";//"//div[contains(@id,'GradingScoringAdd')][(contains(@aria-hidden,'false'))]//div[contains(@id,'GradingScoringTabPanel')]//div[contains(@class,'tabpanel')][not(contains(@class,'hidden'))]//a//span[text()='Add']";//"//div[contains(@id,'Grading')]//div[contains(@id,'panel')][not(contains(@class,'hidden'))][contains(@class,'x-tabpanel')]//a//span[text()='Add']";
	public final String add_editGSWizard_scoring_tab_deleteGSButton="//div[contains(@id,'GradingScoringEdit')][contains(@class,'window-body')]//div[contains(@name,'scoringsGrid')]//span[contains(text(),'Delete')]";
	public final String add_editGSWizard_deleteGSButton="//div[contains(@id,'pdGradingScoringGrid')]//a//span[contains(text(),'Delete')]";//"//span[contains(@id,'Grading')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'display: none'))]//a//span[text()='Delete']";
	public final String add_editGSWizard_edit_addGSButton="//div[contains(@id,'pdGradingScoringGrid')]//a//span[contains(text(),'Add')]";
	public final String add_editGSWizard_inputName="//input[@name='p_gsModelName']";
	public final String add_editGSWizard_GSInput="//div[contains(@id,'GradingScoring')]//table[contains(@id,'gridview')]//input[contains(@name,'textfield')]";//"//div[contains(@id,'Grading')]//div[contains(@id,'panel')][not(contains(@class,'hidden'))][contains(@class,'x-tabpanel')]//div[contains(@id,'tableview')]//input";
	public final String add_editGSWizard_increasePriorityButton="//span[contains(@id,'Grading')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'display: none'))]//span[contains(@class,'moveup')]";
	public final String add_editGSWizard_decreasePriorityButton="//div[contains(@name,'gradingsGrid')]//a//span[contains(@class,'icon_decrease')]";//"//div[contains(@id,'Grading')]//a[contains(@data-qtip,'Decrease')][not(contains(@aria-disable,'false'))]//span[contains(@class,'decrease')]";//"//span[contains(@id,'Grading')]//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'display: none'))]//span[contains(@class,'movedown')]";
	public final String add_GSWizard_AddButton="//div[contains(@id,'GradingScoringAdd')]//div[contains(@id,'toolbar')][contains(@class,'toolbar-footer')]//a//span[contains(text(),'Add')]";//"//div[a/span/span/span[text()='Cancel']]/a/span/span/span[text()='Add']";
	public final String add_GSWizard_CancelButton="//div[contains(@id,'GradingScoringAdd')]//div[contains(@id,'toolbar')][contains(@class,'toolbar-footer')]//a//span[contains(text(),'Cancel')]";//"//div[a/span/span/span[text()='Add']]/a/span/span/span[text()='Cancel']/following-sibling::span";
	
	public final String edit_GSWizard_OKButton="//div[contains(@id,'ScoringEdit')]/div//a//span[text()='OK']";//"//div[contains(@id,'ScoringEdit')]/div//a//span[text()='OK']/following-sibling::span";
	public final String edit_GSWizard_CancelButton="//div[contains(@id,'ScoringEdit')]/div//a//span[text()='Cancel']/following-sibling::span";
	public final String admin_gradingNScoringTab="//div[contains(@name,'mainGrid') or contains(@name,'MainGrid')]//a//span[contains(text(),'G+S')]";//div[contains(@name,'MainGrid')]//a//span[contains(text(),'Grading+Scoring')]";
	public final String admin_gradingNScoringWindow_label="//div[contains(@id,'GradingScoringAdd')]//div[contains(text(),'Add a new G+S model.')]";//"//div[contains(@id,'GradingScoringAdd')]//div[contains(text(),'You can add Gradings + Scorings model here.')]";
	public final String admin_edit_gradingNScoringWindow_label="//div[contains(@id,'GradingScoringEdit')]//div[contains(text(),'Edit the G+S model.')]";//"//div[contains(@id,'GradingScoringEdit')]//div[contains(text(),'You can edit Gradings + Scorings model here.')]";
	
	public final String add_editGSWizard_grid_gradingX(String grading)
	{
		return "//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'none'))]//div[contains(@id,'Grid') and contains(@id,'body')]//table/tbody/tr/td/div[text()='"+grading+"']";
	}
	
	public final String add_editGSWizard_grid_gradingRowX(int row)
	{
		return "//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'none'))]//div[contains(@id,'Grid') and contains(@id,'body')]//table["+row+"]/tbody/tr[1]/td/div";//"//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'none'))]//div[contains(@id,'Grid') and contains(@id,'body')]//table/tbody/tr["+row+"]/td/div";
	}
	
	public final String add_editGSWizard_grid_scoringX(String scoring)
	{
		return "//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'none'))]//div[contains(@id,'Grid') and contains(@id,'body')]//table/tbody/tr/td/div[text()='"+scoring+"']";
	}
	public final String add_editGSWizard_grid_scoringTabX(String scoring)
	{
		return "//div[contains(@id,'GradingScoringEdit')][contains(@class,'window-body')]//div[contains(@name,'scoringsGrid')]//div[contains(text(),'"+scoring+"')]";//"//div[contains(@name,'scoringsGrid')]//table//div[contains(@class,'x-grid-cell-inner')][contains(text(),'"+scoring+"')]";//"//div[contains(@name,'scoringsGrid')]//div[contains(@id,'GradingScoringScoringGrid')]//table//div[contains(text(),'"+scoring+"')]";//"//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'none'))]//div[contains(@id,'Grid') and contains(@id,'body')]//table/tbody/tr/td/div[text()='"+scoring+"']";
	}
	public final String add_editGSWizard_grid_scoringX(int row)
	{
		return "//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'none'))]//div[contains(@id,'Grid') and contains(@id,'body')]//table["+row+"]/tbody/tr[1]/td/div";//"//div[@class='x-panel x-tabpanel-child x-panel-default'][not(contains(@style,'none'))]//div[contains(@id,'Grid') and contains(@id,'body')]//table/tbody/tr["+row+"]/td/div";
	}
	
	public final String copyGSWizard_inputName="//div[contains(@id,'Copy')]//input[contains(@name,'ModelName')]";
	public final String copyGSWizard_OKButton="//div[contains(@id,'Copy')]//span[text()='OK']";//"//div[contains(@id,'Copy')]//span[text()='OK']/following-sibling::span";
	public final String copyWizard_CancelButton="//div[contains(@id,'Copy')]//span[text()='Cancel']";//"//div[contains(@id,'Copy')]//span[text()='Cancel']/following-sibling::span";
	
	
	//configuring GS in organization
	
	public final String editOrg_GSTab="//div[contains(@id,'organization')]//a//span[text()='Grading & Scoring']";
	public final String editOrg_GSTab_selectModelX(String modelName)
	{
		return "//div[contains(@id,'OrganizationGradingScoringGrid')]//table/tbody/tr/td/div[text()='"+modelName+"']";
	}
	
	public final String nameColumn="//div[contains(@id,'column')][1]/div//span[text()='Name']";//"//div[contains(@id,'column')][1]/div/span[text()='Name']";
	public final String enableColumn="//div[contains(@id,'column')][2]/div/span[text()='Enable']";
	public final String firstColumnHeader="//div[contains(@class,'x-column-header-first')]//div[contains(@class,'header-text')]//span[contains(text(),'Name')]";//"//div[contains(@class,'x-column-header-first')]/div/span";
	
	public final String verifyGSModelEnabledRow1="//div[contains(@id,'gridview')]/table/tbody/tr[1]/td[2]";
	
	public final String deleteGradingScoring_warningMessage="//div[contains(@id,'warningdialog')]//div[text()='Are you sure you want to delete the selected G+S Model? This action can not be undone.']";//"//div[contains(@id,'warningdialog')]//div[text()='Are you sure you want to delete G+S model? This action can not be undone']";//"//div[contains(@id,'warningdialog')]//span//div[text()='Are you sure you want to delete G+S model? This action cannot be undone']";
	
	public final String deleteGradingScoring_warningDialog_NoButton="//div[contains(@id,'warningdialog')]//span[text()='No']";//"//div[contains(@id,'warningdialog')]//span[text()='No']/following-sibling::span";
	
	public final String deleteGradingScoring_warningDialog_YesButton="//div[contains(@id,'warningdialog')]//span[text()='Yes']";//"//div[contains(@id,'warningdialog')]//span[text()='Yes']/following-sibling::span";
	
}
