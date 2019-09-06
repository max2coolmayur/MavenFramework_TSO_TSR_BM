package org.qa.locators;
/*Created by Alfonso Almanza
 * 01/27/11 translations.com
 */
public class PD4_lang_model_panel_Locators {
	private static PD4_lang_model_panel_Locators ue;
	
	public static synchronized PD4_lang_model_panel_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_lang_model_panel_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_lang_model_panel_Locators();
		}
		return ue;
	}

	// Filter Pane
	public final String filters_langModel_selectSourceLanguageFilterFind = "css=table[name='sourceLanguageComboBox']>tbody>tr>td>table>tbody>tr>td:nth-child(2)>div";
	public final String filters_langModel_selectTargetLanguageFilterFind = "css=table[name='targetLanguageComboBox']>tbody>tr>td>table>tbody>tr>td:nth-child(2)>div";
	
	//Source & Target Languages in first row
	
	//Kept Xpath as CSS locator does not support for GetXpathCount
	public final String langModel_firstModelSourceLanguage = "//div/table/tbody/tr/td[2]/div";	
	public final String langModel_firstModelTargetLanguage = "//div/table/tbody/tr/td[3]/div";
	public final String langModel_firstModelIsDefault = "//div[contains(@id,'pdMainGrid')]//table/tbody/tr[1]//td[contains(@class,'x-grid-cell-last')]/div";//"//div[contains(@id,'pdmaingrid')]//table/tbody/tr[1]//td[contains(@class,'x-grid-cell-last')]/div";
	public final String langModel_secondModelIsDefault = "//div[contains(@id,'gridview')]/table/tbody/tr[3]//td[contains(@class,'x-grid-cell-last')]/div";
	
	
	//ADD & EDIT Buttons [Language Models Locators]
	public final String languageModels_addLanguageModelButton = "//span[contains(@id,'add_lang')]";
	public final String languageModels_editLanguageModelButton = "//span[contains(@id,'edit_lang')]";
	public final String addLangModel_saveLanguageModelButton = "//div[contains(@id,'languagemodel')]//div[contains(@id,'toolbar')]//span[text()='Save']";
	public final String editLangModel_saveLanguageModelButton = "//div[contains(@id,'pdlanguagemodeledit')]//span[contains(text(),'Save')]";//"//div[contains(@id,'pdlanguagemodeledit')]//span[contains(text(),'Save')]/following-sibling::span";
	public final String add_edit_langModel_inputLanguageModelName = "//div[contains(@name,'name')]//div//input[contains(@name,'name')]";
	public final String add_edit_langModel_inputSourceLanguage = "//input[contains(@name,'sourceLanguage')]";
	public final String add_edit_langModel_inputTargetLanguage = "//input[contains(@name,'targetLanguage')]";
	public final String add_edit_langModel_inputNumberOfWords = "//div[contains(@id,'pdlanguagemodeladd')]//div[contains(@name,'numberOfWords')]//input";
	public final String add_edit_langModel_inputTimeRequired = "//div[contains(@id,'pdlanguagemodeladd')]//div[contains(@name,'requiredTime')]//input";
	public final String add_edit_langModel_inputMinimalDuration ="//div[contains(@id,'pdlanguagemodeladd')]//div[contains(@name,'minTime')]//input";
	public final String add_edit_langModel_isDefault = "//input[contains(@name,'isDefault')]/following-sibling::span";
	public final String add_edit_langModel_inputLanguageModelSourceLanguageFind = "css=input[name='sourceLanguageComboBox']";
	public final String addLangModel_cancelAddLanguageModelButton = "//div[@class='x-window-footer x-window-footer-noborder x-panel-btns']//div//table//tbody//tr//td:[2]//table//tbody//tr//td//table//tbody//tr//td[2]//table//tbody//tr[2]//td[2]//em//button";
	public final String add_langModel_selectSourceLanguage = "//div[contains(@id,'pdlanguagemodeladd')]//div[contains(@name,'sourceLanguage')]//div[contains(@class,'arrow')]";
	public final String add_langModel_selectTargetLanguage = "//div[contains(@id,'pdlanguagemodeladd')]//div[contains(@name,'targetLanguage')]//div[contains(@class,'arrow')]";
	public final String edit_langModel_selectSourceLanguage = "//div[contains(@name,'sourceLanguage')]//div[contains(@class,'x-form-arrow-trigger')]";//"//div[contains(@id,'pdlanguagemodeledit')]//table[2]/tbody/tr/td[2]/table/tbody/tr/td[2]/div";
	public final String edit_langModel_selectTargetLanguage = "//div[contains(@name,'targetLanguage')]//div[contains(@class,'x-form-arrow-trigger')]";//"//div[contains(@id,'pdlanguagemodeledit')]//table[3]/tbody/tr/td[2]/table/tbody/tr/td[2]/div";
	public final String add_langModel_buttonSaveIsDisabled = "//div[contains(@id,'pdlanguagemodeladd')]//a[contains(@class,'disabled')]//span[text()='Save']";//"//div[contains(@id,'pdlanguagemodeladd')]//a[contains(@class,'disabled')]//span[text()='Save']/following-sibling::span";
	public final String add_edit_langModel_buttonSaveIsEnabled = "css=div[class=' x-window x-window-noborder x-window-plain']>div:nth-child(2)>div:nth-child(2)>div>div>div>div>table>tbody>tr>td:nth-child(2)>table>tbody>tr>td>table>tbody>tr>td>table[class='x-btn x-btn-noicon']>tbody>tr:nth-child(2)>td:nth-child(2)>em>button";
	
	//NameTitleOptions
	public final String landModel_clickOnSourceLanguage = "//a//span[contains(text(),'Source Language')]";
	public final String langModel_clickOnTargetLanguage = "//a//span[contains(text(),'Target Language')]";
	public final String langModel_clickOnNumberOfWords = "//a//span[contains(text(),'Number of words')]";
	public final String langModel_clickOnTime = "//a//span[contains(text(),'Time (minutes)')]";
	public final String langModel_clickOnIsDefault = "//a//span[contains(text(),'Is Default')]";

	//Columns on Main Window [Language Models Locators]
	public final String langModel_nameRowTitle = "//div[contains(@data-qtip,'Name')]";//"//div[@data-qtip='Name']";
	public final String langModel_sourceLanguageRowTitle = "//div[contains(@data-qtip,'Source Language')]";//"//div[@data-qtip='Source Language']";
	public final String langModel_targetLanguageRowTitle = "//div[contains(@data-qtip,'Target Language')]";//"//div[@data-qtip='Target Language']";
	public final String langModel_numberOfWordsRowTitle = "//div[contains(@data-qtip,'Number of words as unit for due date calculating')]";//"//div[@data-qtip='Number of words as unit for due date calculating']";
	public final String langModel_timeRowTitle = "//div[contains(@data-qtip,'Time for processing units of words')]";//"//div[@data-qtip='Time for processing unit of words']";
	public final String langModel_isDefaultRowTitle = "//div[contains(@data-qtip,'Is Default')]";
	
	public final String langModel_nameRowTitleOptions = "//div[contains(@data-qtip,'Name')]//div[contains(@class,'header-trigger')]";//"//div[@data-qtip='Name']/div";
	public final String langModel_sourceLanguageRowTitleOptions = "//div[contains(@data-qtip,'Source Language')]//div[contains(@class,'header-trigger')]";//"//div[@data-qtip='Source Language']/div";	
	public final String langModel_targetLanguageRowTitleOptions = "//div[contains(@data-qtip,'Target Language')]//div[contains(@class,'header-trigger')]";//"//div[@data-qtip='Target Language']/div";
	public final String langModel_numberOfWordsRowTitleOptions = "//div[contains(@data-qtip,'Number of words as unit for due date calculating')]//div[contains(@class,'header-trigger')]";//"//div[@data-qtip='Number of words as unit for due date calculating']/div";
	public final String langModel_timeRowTitleOptions = "//div[contains(@data-qtip,'Time for processing units of words')]//div[contains(@class,'header-trigger')]";//"//div[@data-qtip='Time for processing unit of words']/div";
	public final String langModel_isDefaultRowTitleOptions = "//div[contains(@data-qtip,'Is Default')]//div[contains(@class,'header-trigger')]";//"//div[@data-qtip='Is Default']/div";
	
	//Options in title on Main Window [Language Models Locators]
	public final String langModel_nameGroupTitle ="//div//label//span[contains(text(),'Name:')]"; //"//div//label[contains(text(),'Name:')]";
	public final String langModel_sourceLanguageGroupTitle = "//div//label//span[contains(text(),'Source Language:')]";//"//div//label[contains(text(),'Source Language:')]";//"//table//tr//td//label[contains(text(),'Source Language:')]";
	public final String langModel_targetLanguageGroupTitle = "//div//label//span[contains(text(),'Target Language:')]";//"//table//tr//td//label[contains(text(),'Target Language:')]";
	public final String langModel_numberOfWordsGroupTitle = "//div//label//span[contains(text(),'Number of words')]";//"//div//label[contains(text(),'Number Of Words')]";//"//table//tr//td//label[contains(text(),'Number Of Words:')]";
	public final String langModel_timeGroupTitle = "//div//label//span[contains(text(),'Time Required (minutes)')]";//"//table//tr//td//label[contains(text(),'Time Required (minutes):')]";
	public final String langModel_timeMinimalDuration = "//div//label//span[contains(text(),'Minimal Duration (minutes)')]";//"//table//tr//td//label[contains(text(),'Minimal Duration (minutes):')]";
	public final String langModel_isDefaultGroupTitle = "//div//label[contains(text(),'Default')]";//"//table//tr//td//label[contains(text(),'Default')]";

	
	//Options in each columns on Main Window [Language Models Locators]
		public final String langModel_nameGroupcolumnTitle = "//div[@class='x-grid-group-title'][contains(text(),'Name')]";
		public final String langModel_sourceLanguageGroupcolumnTitle = "//div[@class='x-grid-group-title'][contains(text(),'Source Language')]";
		public final String langModel_targetLanguageGroupcolumnTitle = "//div[@class='x-grid-group-title'][contains(text(),'Target Language')]";
		public final String langModel_numberOfWordsGroupcolumnTitle = "//div[@class='x-grid-group-title'][contains(text(),'Number of words')]";
		public final String langModel_timeGroupcolumnTitle = "//div[@class='x-grid-group-title'][contains(text(),'Time (minutes)')]";
		public final String langModel_isDefaultGroupcolumnTitle = "//div[@class='x-grid-group-title'][contains(text(),'Is Default')]";

		
	//User Define
	public final String langModel_SourceLanguageX(Integer row){
		String result = "//div["+row+"]//table//tbody//tr//td[2]//div";
		return result;
	}
	
	public final String langModel_TargetLanguageX(Integer row){
		String result = "//div["+row+"]//table//tbody//tr//td[3]//div";
		return result;
	}

	
	public final String langModel_selectSourceLanguageX(String sourceLanguage){
		String result = "//div[contains(@name,'sourceLanguage')]//ul//li[text()='"+sourceLanguage+"']";//"css=div[name*=sourceLanguage-boundlist] li:contains('"+sourceLanguage+"')";
		return result;
	}
	
	public final String langModel_selectTargetLanguageX(String targetLanguage){
		String result = "//div[contains(@name,'targetLanguage')]//ul//li[text()='"+targetLanguage+"']";//"css=div[name*=targetLanguage-boundlist] li:contains('"+targetLanguage+"')";
		return result;
	}
	
	public final String langModel_selectSourceLanguageFilterFindX(String sourceLanguage){
		String result = "css=div[name=sourceLanguageComboBox-boundlist]>div>ul>li:contains('"+sourceLanguage+"')";
		return result;
	}
	
	public final String langModel_selectTargetLanguageFilterFindX(String targetLanguage){
		String result = "css=div[name=targetLanguageComboBox-boundlist]>div>ul>li:contains('"+targetLanguage+"')";
		return result;
	}

	public final String langModelNameX(Integer row){
		String result = "//div[contains(@id,'pdMainGrid')]//table["+row+"]//tbody//tr//td//div";//"//div[contains(@id,'pdmaingrid')]//table[contains(@class,'x-grid-table')]//tbody//tr["+row+"]//td//div";
		return result;
	}
	
	public final String langModelNameY(String langModelName){
		String result = "//table//tbody//tr//td//div[contains(text(),'"+langModelName+"')]";
		return result;
	}
	
	//*** Variables not used in this project ***
	//public final String inputLanguageModelTargetLanguageFind = "css=input[name=targetLanguageComboBox]";
	//public final String clickSourceEnglishUnitedStates = "css=div:contains('English (United States)')";
	//public final String clickTargetGermanGermany = "css=div[name=targetLanguage]>div:contains('German (Germany)')";
	//public final String clickTargetFrenchFrance = "css=div[name=targetLanguage]>div:contains('French (France)')";
	//public final String clickTargetAfrikaans = "css=div[name=targetLanguage]>div:contains('Afrikaans')";
	//public final String addLanguageModelCancelButton = "css=div[class='x-window-bwrap']>div:nth-child(2)>div>div>div>div:nth-child(1)>table>tbody>tr>td:nth-child(2)>table>tbody>tr>td:nth-child(1)>table>tbody>tr>td:nth-child(2)>table>tbody>tr:nth-child(2)>td:nth-child(2)>em>button";
	//public final String clickOnEnusDede = "css=div:contains('En_us-De_de')";
	//public final String clickOnEnusFrfr = "css=div:contains('En_us-Fr_fr')";
	//public final String selectSourceLanguageEnglishUnitedStatesFind = "css=div[name=sourceLanguage]>div:contains('English (United States)')";
	//public final String selectTargetLanguageGermanGermanyFind = "css=div[name=targetLanguage]>div:contains('German (Germany)')";
	//public final String enusFrfrInFirstRow = "css=div[class='x-grid3-scroller']>div>div:nth-child(1)>table>tbody>tr:nth-child(1)>td:nth-child(3)>div:contains('fr-fr')";

}
