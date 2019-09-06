package org.qa.locators;
/*Created by Alfonso Almanza
 * 01/27/11 translations.com
 */
public class PD4_system_actions_panel_Locators {
	private static PD4_system_actions_panel_Locators ue;
	
	public static synchronized PD4_system_actions_panel_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_system_actions_panel_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_system_actions_panel_Locators();
		}
		return ue;
	}
	
	public final String configureApplicationButton = "//span[contains(@id,'configure_appl')]/following-sibling::span";	
	public final String inputTrpUrl = "css=form[class='x-panel-body x-panel-body-noheader x-form']>div:nth-child(19)>div input";
	public final String showLogButton = "//span[contains(@id,'server_log')]";//"//span[contains(@id,'show_log')]";
	public final String logWindow = "css=span:contains('Log')";
	public final String logWindow_refreshButton = "//div[contains(@id,'BatchmonitorLogView')]//span[text()='Refresh']";//"//div[contains(@id,'gs4trlog')]//span[text()='Refresh']/..";
	public final String logWindow_closeWindow = "//div[contains(@id,'BatchmonitorLogView')]//span[text()='Close']";//"//div[contains(@id,'gs4trlog')]//span[text()='Close']/..";
	public final String keyName_Header = "//div[contains(@id,'headercontainer')]//span[text()='Key Name']";//"//div[contains(@id,'pdmaingrid')]/div/div/div/div/div/span[text()='Key Name']";
	public final String valueName_Header = "//div[contains(@id,'headercontainer-')]/div[2]/div";
	public final String tptEnabledInput = "//div[contains(@name,'TPT.enabled')]//input[contains(@name,'TPT.enabled')]";
	public final String saveButton = "//div[contains(@id,'configureapplication')]//span[contains(text(),'Save')]";
	public final String workflowPhaseName_shortCodes_Input = "//div[contains(@name,'workflow.phaseName.shortCodes')]//input[contains(@name,'workflow.phaseName.shortCodes')]";
	public final String workflowPhaseName_tso_allowMultipleFiles_Input ="//div[contains(@name,'transstudio.allow.multi.file')]//input[contains(@name,'transstudio.allow.multi.file')]";
	public final String systemAction_tsoAllowMultipleFile_Input ="//table[contains(@name,'transstudio.allow.multi.file')]//td//input[contains(@name,'transstudio.allow.multi.file')]";
	public final String systemActions_configureApplication_saveButton = "//div[contains(@id,'configureapplication')]//span[contains(text(),'Save')]";
	public final String demote_tsrreviewComment_mandatory_Input = "//input[contains(@name,'demote.tsrreviewComment.mandatory')]";//table[contains(@name,'demote.tsrreviewComment.mandatory')]//input[contains(@name,'demote.tsrreviewComment.mandatory')]";
	public final String systemActionstsr_nofilechange_warning = "//input[contains(@name,'tsrreview.nofilechange.warning')]";
	public final String workflowPhaseName_GroupID_mapping_Input ="//input[contains(@name,'workflowPhase.tmWorkgroupId.mapping')]";
}
