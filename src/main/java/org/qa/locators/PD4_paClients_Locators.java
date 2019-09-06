package org.qa.locators;

public class PD4_paClients_Locators
{
	private static PD4_paClients_Locators ue;
	
	public static synchronized PD4_paClients_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_paClients_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_paClients_Locators();
		}
		return ue;
	}

	public final String PAClientTab="css=button[id*='PA_CLIENTS']>span";
	public final String addPAClient="//span[contains(@id,'add_projecta_client')]";
	public final String editPAClient="//span[contains(@id,'edit_paclient')]/following-sibling::span";
	public final String enableDisablePAClient="//span[contains(@id,'enable_projecta_client')]/following-sibling::span";
	public final String importPAClient="//span[contains(@id,'import_projecta_client')]";
	public final String filter_paClientName="css=label:contains('PA Client Name:')+div>input";
	public final String paClientNameInput="//div[contains(@name,'name')]//input[contains(@name,'name')]";
	public final String paOrganizationInput="//table[contains(@name,'parentOrganization')]//input[contains(@name,'parentOrganization')]";//"//table[@name='parentOrganization']//input[@name='parentOrganization']";
	public final String paOrgnaizationSelectButton="//div[contains(@name,'parentOrganization')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String importPAClient_downloadSummaryReport="css=div[class*='x-window'] button:contains('Download Summary Report')";
	public final String importPAClient_importButton="css=div[class*='x-window'] button:contains('Import')";
	public final String importPAClient_browseFileInput="css=label:contains('CSV:')+div>div>input[type='file']";
	public final String importPAClient_closeButton="css=div[class*='x-window'] button:contains('Close')";
	public final String paClient_translationMemoryTab = "//div[contains(@id,'PaClientEdit')]//span[text()='TM']";//span[text()='TM']";//"//span[text()='Translation Memory']/following-sibling::span";
	public final String selectAvailableTM_checkbox(String tmName) {
		return "//div[contains(@id,'PaClientEdit') or contains(@id,'paclient')]//tr[td/div[text()='"+tmName+"']]/td[last()-1]";//"//div[contains(@id,'PaClientEditTab')]//tr[td/div[text()='"+tmName+"']]/td[last()-1]";//"//div[contains(@id,'paclient')]//tr[td/div[text()='"+tmName+"']]/td[last()-1]";
	}
	public final String selectDefaultTM_checkbox(String tmName) {
		return "//div[contains(@id,'PaClientEdit')]//tr[td/div[text()='"+tmName+"']]/td[last()]";//div[@name='tmsGrid']//table//descendant::tr[child::td/div[text()='"+tmName+"']]//td[5]//div[contains(@class,'x-grid-checkheader')]";
	}
	public final String isCheckedAvailableTM_checkbox(String tmName) {
		return "//div[contains(@id,'PaClientEditTab')]//tr[td/div[text()='"+tmName+"']]/td[last()-1]//img[contains(@class,'checked')]";
	}
	public final String isCheckedDefaultTM_checkbox(String tmName) 
	{
		return "//div[contains(@name,'tmGrid')]//tr[td/div[text()='"+tmName+"']]/td[last()]//img[contains(@class,'checked')]";//"//div[contains(@id,'paclient')]//tr[td/div[text()='"+tmName+"']]/td[last()]//img[contains(@class,'checked')]";
	}
	
	public final String paClientTab_okButton ="//div[contains(@id,'PaClientEdit')]//span[text()='OK']";//"//div[starts-with(@id,'pdpaclienttabwindow')]//span[text()='OK']";
	public final String paClientTab_cancelButton ="//div[contains(@id,'PaClientEdit')]//span[text()='Cancel']/following-sibling::span";//"//div[starts-with(@id,'pdpaclienttabwindow')]//span[text()='Cancel']/following-sibling::span";
	public final String nextButton="//span[text()='Next >']";
	public final String finishButton="//span[text()='Finish']";
	public final String selectOrganization(String org)
	{
		String result= "//div[contains(@name,'parentOrganization')]//li[contains(@class,'x-boundlist-item') and text()='"+org+"']";//"//div[@name='parentOrganization-boundlist']//li[contains(@class,'x-boundlist-item') and text()='"+org+"']";
		return result;
	}
	
	public final String selectAvailableTmX(String tmName)
	{
		String result="//div[contains(@id,'pdpaclienttms')]//table//tr[td/div[text()='"+tmName+"']]/td//div[contains(@class,'checkheader')]";
		return result;
	}
	public final String editPaClient_isSelectAllTmsChecked="//div[contains(@id,'PaClient')]//div[contains(@id,'headercontainer')]//span[contains(@class,'checkheader')][contains(@class,'checked')]";
	public final String add_editPaClient_selectAllTms = "//div[contains(@name,'tmGrid')]//div[contains(@class,'box-target')]//div//span[text()='Available']/preceding-sibling::span";
	
	public final String select_firstRow_PaClient = "//div[@name='pagingToolbarMainGrid']//table//descendant::tr[contains(@class,'x-grid-row')][1]";
	public final String firstRow_PaClient_enabled_div = "//div[@name='pagingToolbarMainGrid']//table//descendant::tr[contains(@class,'x-grid-row')][1]//td[3]/div";
	
	public final String add_edit_filterTMs="//div[contains(@id,'PaClientEditTabTM')]//input[contains(@name,'name')]";
	public final String add_edit_filterTMFindButton="//div[contains(@id,'PaClientGlobalTM')]//span[contains(text(),'Find')]/following-sibling::span";
	
	//configuring grading and scoring
	
	public final String editPaClient_GSTab="//div[contains(@id,'PaClientEdit')]//a//span[text()='G+S']";//div[contains(@id,'PaClientEdit')]//a//span[text()='Grading + Scoring']";//"//div[contains(@id,'paclient')]//a//span[text()='Grading + Scoring']";
	public final String editPaClient_GSTab_selectModelX(String modelName)
	{
		//return "//div[contains(@id,'GradingScoringGrid')]//table/tbody/tr/td/div[text()='"+modelName+"']";//"//div[contains(@id,'PaClientGradingScoringGrid')]//table/tbody/tr/td/div[text()='"+modelName+"']";
		return "//div[contains(@id,'GradingScoringGrid')]//table[contains(@id,'tableview')]//td//div[text()='"+modelName+"']/../following-sibling::td";
		
	}
	
	public final String editPaClient_GSTab_verify_GSModel_Selected(String modelName)
	{
		return  "//div[contains(@id,'GradingScoringGrid')]//table[contains(@id,'tableview')]//td//div[text()='"+modelName+"']/../following-sibling::td//div[contains(@class,'col-on')]";
		//return "//div[contains(@id,'PaClient')]//div[contains(@name,'gsGrid')]//table[contains(@class,'x-grid-item-selected')]//td//div[text()='"+modelName+"']";//"//div[contains(@id,'PaClient')]//div[contains(@id,'GradingScoring')]//table//tr[contains(@class,'x-grid-row-selected')]//td//div[text()='"+modelName+"']";//"//div[contains(@id,'paclient')]//div[contains(@id,'pdPaClientGradingScoring')]//table//tr[contains(@class,'x-grid-row-selected')]//td//div[text()='"+modelName+"']";
    }
	
	public final String editPaClient_GSTab_verify_GSModel_UnSelected(String modelName)
	{
	 //return "//div[contains(@id,'PaClient')]//div[contains(@name,'gsGrid')]//table[not(contains(@class,'x-grid-item-selected'))]//td//div[text()='"+modelName+"']";//"//div[contains(@id,'PaClient')]//div[contains(@id,'GradingScoring')]//table//tr[not(contains(@class,'x-grid-row-selected'))]//td//div[text()='"+modelName+"']";//"//div[contains(@id,'paclient')]//div[contains(@id,'pdPaClientGradingScoring')]//table//tr[not(contains(@class,'x-grid-row-selected'))]//td//div[text()='"+modelName+"']";
	 return "//div[contains(@id,'GradingScoringGrid')]//table[contains(@id,'tableview')]//td//div[text()='"+modelName+"']/../following-sibling::td";
	}
	
}