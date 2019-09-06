package org.qa.locators;

/*Created by Alfonso Almanza
 * 01/27/11 translations.com
 */
public class PD4_filters_panel_Locators {
	private static PD4_filters_panel_Locators ue;
	
	public static synchronized PD4_filters_panel_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_filters_panel_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_filters_panel_Locators();
		}
		return ue;
	}
	//Filters Panel Locators//Filters Panel Locators
	public final String filters_saveFilterButton = "//span[text()='Save Filter']";//"//span[text()='Save Filter']/following-sibling::span";
	public final String filters_saveFilterButton_disabled = "//a[starts-with(@id,'button') and contains(@class,'x-btn-disabled')]//span[text()='Save']";
	public final String filters_removeButton = "//div[starts-with(@id,'gs4trnavigationsplitmenuitem') and contains(@class,'x-component-default')]//img[contains(@class,'gs4trsplit')]";
	public final String filters_removeButton(String filterName){
		return "//span[text()='"+filterName+"']/../div[contains(@class,'split')]";
	}
	public final String filters_errorCloseButton = "//div[contains(@id,'warningdialog')]//span[contains(text(),'Close')]";
	public final String filters_findButton = "//span[contains(@class,'find')]";
	public final String filters_clearButton = "//span[text()='Clear']";
	public final String filters_customizeButton = "//img[@data-qtip='Click to customize filter']";	
	public final String filters_saveFilter_inputFilterName = "//input[@name='filterName']";
	public final String filters_inputFilterSave_button = "//div[contains(@class,'x-window-default-closable')]/div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Save')]";//"//div[contains(@class,'x-window-default-closable')]/div[contains(@class,'x-toolbar-footer')]//span[contains(text(),'Save')]/following-sibling::span";
	public final String filters_inputFilterCancel_button = "//div[contains(@id,'navigations')]//span[contains(text(),'Cancel')]";
	public final String filters_removeCustomFilter_yesButton = "//div[contains(@id,'warning')]//span[contains(text(),'Yes')]/..";
	public final String filters_selectCustomFilter_dropDownMenu(String nameMenu){
		String result = "//em[starts-with(@id,'splitbutton')][child::button/span[text()='"+nameMenu+"']]";
		return result;
		
	}

	//pass the name of applied filter to be cleared
	public final String  filters_clearAppliedFilter(String filterWithTextToClear){
		String result = "//td[contains(@class,'gs4trfiltervaluespan ')][//div[contains(text(),'"+filterWithTextToClear+"')]]/following-sibling::td"; //"//div[contains(@class,'gs4trfiltervaluespan ') and contains(text(),'"+filterWithTextToClear+"')]/following-sibling::div"
		return result;
	}
	
	//new for PD 4.6
	public final String filters_chooseFilter_trigger = "//div[@name='fieldLabelCombo']//div[contains(@class,'x-form-arrow-trigger')]";
	public final String filters_chooseFilter_firstFilter = "//div[@name='fieldLabelCombo-boundlist']/div/ul/li";
	public final String filters_chooseFilter_secondFilter="//div[@name='fieldLabelCombo-boundlist']/div/ul/li[2]";
	public final String filters_chooseFilter_thirdFilter="//div[@name='fieldLabelCombo-boundlist']/div/ul/li[3]";
	
	public final String filters_chooseFilter_triggerFromDate = "//div[@name='fromDateFilter']//div[contains(@class,'trigger')]//div[2]";//"//table[@name='fromDateFilter']//table//div[contains(@class,'trigger')]";
	public final String filters_chooseFilter_comboTriggerFromDate = "//table[@name='comboFieldFilter']//table//div[@role='button']";
	public final String filters_chooseFilter_triggerToDate = "//div[@name='toDateFilter']//div[contains(@class,'date-trigger')]";//"//table[@name='toDateFilter']//table//div[contains(@class,'trigger')]";
	public final String filters_chooseFilter_valueFirstFilter (String text) {
	    	String result = "//div[contains(@name,'fieldLabelCombo-boundlist')]//div//li[text()='"+text+"']";
		return result;
	}
	public final String filters_firstInput = "//input[@name='textFieldFilter']";
	public final String filters_secondInput = "//input[contains(@name,'ComboFieldFilter')]";//"//input[@name='comboFieldFilter']";
	public final String filters_summaryfieldInput = "//input[@name='summaryField']";
	public final String filters_numberFieldInput = "//input[@name='numberFieldFilter']";
	public final String filters_popUpText_summaryfieldInput(String textFirstFilter)
	{
		return "//div[contains(@class,'x-container-default gs4trfullfiltercontainer')]//b[contains(text(),'"+textFirstFilter+"')]";
	}
	
	public final String filters_comboFieldSelectButton="//div[contains(@name,'ComboFieldFilter')and not(contains(@style,'display: none;'))]//div[2]";//"//table[contains(@name,'ComboFieldFilter') and not(contains(@style,'display: none;'))]//td/div[contains(@class,'x-form-trigger-first')]";
	public final String filters_comboFieldSelectButton2="//table[@name='firstComboFieldFilter' and not(contains(@style,'display: none;'))]//td/div[@role='button']";
	public final String filters_mySubmissions_pressed="//span[text()='My Submissions']//ancestor::button[ancestor::div[contains(@class,'x-btn-pressed')]/em]";
	public final String filters_mySubmissions="//span[text()='My Submissions']";//"//span[text()='My Submissions']/following-sibling::span";
	
	
	public final String filters_selectComboFieldValue_X(String filterValue)
	{
				
		return "//div[contains(@name,'fieldLabelCombo')]//li[contains(text(),'"+filterValue+"')]";//"//div[contains(@name,'ComboFieldFilter')]//li[contains(text(),'"+filterValue+"')]";//"//div[contains(@id,'FieldComboBoundList')]//span[text()='"+filterValue+"']";

		//return "//span[text()='"+filterValue+"']";//"//li[text()='"+filterValue+"']";//""//span[text()='"+filterValue+"']";";
	}
	
	
	public final String filters_popUpText_filterName(String filter)
	{
		return "//div[contains(@id,'gs4trfilterssummaryfullfielditemtext')]/div/div[text()='"+filter+"']";
	}
	public final String filters_MainTabsSplitName(String filter)
	{
		return "//span[text()='"+filter+"']/../preceding-sibling::button[contains(@class,'x-btn-split-right')]";
	}
	
	
	public final String addSubmission_calendarSelectDayX(String day)
	{	
		 return "//div[contains(@name,'DateFilter')][@aria-hidden='false']//table[contains(@class,'x-datepicker-inner')]//td[contains(@class,'active')]//div[text()='"+day+"']";
		//return "//div[contains(@name,'DateFilter')][not(contains(@style,'none'))]//table[@class='x-datepicker-inner']//td[not(contains(@class,'disabled'))]//a[text()='"+day+"']";
	}
	
	
}
