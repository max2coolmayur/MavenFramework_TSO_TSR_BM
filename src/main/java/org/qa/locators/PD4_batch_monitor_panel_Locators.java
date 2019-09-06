package org.qa.locators;
/*Created by Alfonso Almanza
 * 01/27/11 translations.com
 */
public class PD4_batch_monitor_panel_Locators {
	private static PD4_batch_monitor_panel_Locators ue;
	
	public static synchronized PD4_batch_monitor_panel_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_batch_monitor_panel_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_batch_monitor_panel_Locators();
		}
		return ue;
	}
	//Not used Locators
	//public final String viewServerStatusButton = "css=button.batchmonitorviewserverlarge";
	//public final String batchMonitorTab = "css=.x-tab-strip-text:contains(\"BATCH MONITOR\")";
	
	public final String batchMonitor_startBatchServerButton="//span[text()='Start Batch Server']/following-sibling::span";
	public final String batchMonitor_stopBatchServerButton="//span[text()='Stop Batch Server']/following-sibling::span";
	public final String batchMonitor_viewServerStatusButton="//span[text()='View Server Status']/following-sibling::span";
	public final String batchMonitor_viewServerLogButton="//span[contains(@id,'view_server_log')]";//"//span[text()='View Server Log']/following-sibling::span";
	
	
	public final String serverAddressColumn="//div[contains(@id,'headercontainer')]//div[contains(@class,'x-column-header-inner')]//span[text()='Server Address']"; //"//span[contains(@id,'gridcolumn')][text()='Server Address']";
	public final String serverIDColumn="//span[contains(@id,'gridcolumn')][text()='Server ID']";
	public final String activeColumn="//span[contains(@id,'gridcolumn')][text()='Active']";
	public final String cancelBatchJobButton="//span[text()='Batch task(s)']"; //"//span[text()='Cancel Batch Job']/following-sibling::span";
	public final String showThreadDumpButton="//span[text()='Show Thread Dump']";
	public final String batchMonitor_selectServerLog="//div[contains(@class,'item-container')]//table[contains(@class,'grid-item')]";
	public final String batchMonitor_hideFailedCanceledTask_button_pressed="//div[contains(@id,'filterstoolbar')]//a[contains(@class,'pressed')]//span[contains(text(),'Hide Failed/Canceled Tasks')]";
	public final String batchMonitor_hideFailedCanceledTask_button="//div[contains(@id,'filterstoolbar')]//a//span[contains(text(),'Hide Failed/Canceled Tasks')]";
	
	public final String nameRowTitleOptions = "//div[contains(@id,'headercontainer')]//div[contains(@class,'x-column-header-inner')]//span[text()='Server Address']/following-sibling::div[contains(@class,'x-column-header-trigger')]";
	public final String nameRowTitleOptions(String name)
	{
		return "//div[contains(@id,'headercontainer')]//div[contains(@class,'x-column-header-inner')]//span[text()='"+name+"']/following-sibling::div[contains(@class,'x-column-header-trigger')]";
	}
	public final String checkMenuItemX(String menuItem)
	{
		return "//a/span[text()='"+menuItem+"']";
	}
	
	public final String groupTitleX (String title){
		String result = "//div[contains(@class,'grid-group-title')][contains(text(),'"+title+"')]";//"css=div.x-grid-group-title:contains('"+title+"')";
		return result;
	}
	
}
