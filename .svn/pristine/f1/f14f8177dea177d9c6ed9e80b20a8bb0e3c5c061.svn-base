package org.qa.locators;

public class TSO_TSR_BM_locators {
	private static TSO_TSR_BM_locators ue;
	public static synchronized TSO_TSR_BM_locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new TSO_TSR_BM_locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new TSO_TSR_BM_locators();
		}
		return ue;
	}
	
	
	public final String loginButton ="//button//span[contains(text(),'Login')]";//"//span[text()='Log in' or text()='Login']";// "//span[text()='Login']//ancestor::button";
	public final String loginButton_disabled = "//a[contains(@class,'disabled')]//span[text()='Log in']";//div[starts-with(@id,'gs4trloginwindow')]//div[starts-with(@id,'button') and contains(@class,'x-item-disabled')]//span[contains(text(),'Login')]/..";
	public final String logoutButton = "//span[text()='Logout']/following-sibling::div";
	public final String inputLoginUsername = "//input[contains(@name,'username')]";//"//input[@name='userName']";
	public final String inputLoginPassword = "//input[contains(@name,'password')]";//"//input[@name='password']";
	public final String inputLoginOldPassword = "//input[@name='oldPassword']";
	public final String inputLoginNewPassword = "//input[@name='newPassword']";//"//div[@name='newPassword']//input[@name='newPassword']";
	public final String inputLoginNewPasswordRepeat = "//input[@name='repeatpassword']";//"//div[@name='repeatNewPassword']//input[@name='repeatNewPassword']";
	

	
}
