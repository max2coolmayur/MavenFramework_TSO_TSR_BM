package org.qa.locators;
/*Created by Alfonso Almanza
 * 01/27/11 translations.com
 */
public class PD4_users_panel_Locators {
	private static PD4_users_panel_Locators ue;
	
	public static synchronized PD4_users_panel_Locators exts(){
		try{
			if(ue.equals(null))
			{
				ue = new PD4_users_panel_Locators();
			}
		}
		catch(Exception NOSYSTEM){
			ue = new PD4_users_panel_Locators();
		}
		return ue;
	}
	
	//Users Panel Locators//Users Panel Locators
	public final String user_firstDataRowName = "//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";	
	public final String user_firstDataRowEnabled = "//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[4]/div[contains(@class,'x-grid-cell-inner ')]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[4]/div[contains(@class,'x-grid-cell-inner ')]";
	public final String user_firstDataRowOrganization = "//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[8]/div[contains(@class,'x-grid-cell-inner ')]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')][1]/td[8]/div[contains(@class,'x-grid-cell-inner ')]";
	
	public final String users_addUserButton = "//span[text()='Create User']";
	public final String users_editUserButton = "//span[contains(@id,'edit_user')]";
	public final String users_enableDisableUserButton = "//span[contains(@id,'enable_user')]";
	public final String users_unlockUserButton = "//span[contains(@id,'unlock_user')]";
	public final String users_unlockUser_continueButton = "//div[contains(@id,'warning')]//div[contains(@id,'toolbar')]//a//span[text()='Continue']";

	
	//Add & edit user wizard
	public final String add_User_windowTitle="//div[contains(@id,'UserAdd')]//div[contains(text(),'User Creation Wizard')]";//"//div[contains(@id,'UserAdd')]//span[contains(text(),'User Creation Wizard')]";
	public final String add_editUser_inputFirstName = "//input[contains(@name,'firstName')]";
	public final String add_editUser_inputLastName = "//input[contains(@name,'lastName')]";
	public final String add_editUser_inputEmail = "//input[contains(@name,'Email')]";
	public final String add_editUser_inputTimezone = "//input[contains(@name,'timeZone')]";///"css=input[name=timeZone]";
	public final String add_editUser_selectTimezone ="//div[contains(@name,'timeZone')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String add_editUser_inputAddress = "//input[contains(@name,'address')]";
	public final String add_editUser_inputDepartment = "//input[contains(@name,'department')]";
	public final String add_editUser_inputDaytimePhoneNumber = "//input[contains(@name,'phone1')]";
	public final String add_editUser_inputAlternatePhoneNumber = "//input[contains(@name,'phone2')]";
	public final String add_editUser_inputFaxNumber = "//input[contains(@name,'fax')]";
	public final String addUser_inputUsername = "//div[contains(@id,'trimmedte')]//input[@name='userName']";
	public final String addUser_checkVendorwithSameName ="//div[contains(@class,'x-form-cb-wrap-inner')]//label[text()='Create Vendor with the same name']"; //"//span[text()='Create Vendor With The Same Name']";//input[@name='vendorCheckBox']";
	public final String add_editUser_inputPassword = "//input[contains(@name,'p_password')]";//css=input#password-inputEl";
	public final String add_editUser_inputRepeatPassword = "//input[contains(@name,'p_repeatPassword')]";//css=input#passwordConfirm-inputEl";
	public final String add_editUser_selectOrg = "//div[contains(@name,'organization')]//following::div[contains(@class,'x-form-arrow-trigger')][1]";//"//div[contains(@name,'organization')]//div[contains(@class,'x-form-arrow-trigger')]";
	public final String addUser_selectVendor = "//div[@name='vendor']//div[contains(@class,'arrow-trigger')]";
	public final String addUser_userType_label ="//div[contains(@id,'AdminUserAdd')]//div[contains(text(),'Please choose the user type')]";//"//div[contains(@id,'AdminUserAdd')]//div[contains(text(),'Please enter type of user.')]";
	public final String add_editUser_inputAssignOrganizations = "css=input[name='organization']";
	
	public final String addUser_clickFirstSourceLanguage = "css=form[class='x-panel-body x-small-editor-body-noheader x-small-editor-body-noborder x-form']>div:nth-child(3)>div>div>div>div>div:nth-child(2)>div>div>table>tbody>tr>td>div";	
	public final String add_editUser_clickLastSourceLanguage ="//div[contains(@id,'AdminUserGlobalGrid')]//table[last()]/tbody/tr/td[contains(@class,' x-grid-cell')]/div[not(contains(@style,'hidden'))]";
	public final String addUser_selectFirstSourceLanguageFind = "//div[contains(@name,'pdAdminGlobalComboEditor')]//div[contains(@class,'arrow-trigger')]";
	public final String add_editUser_clickLastTargetLanguage ="//div[contains(@id,'AdminUserGlobalGrid')]//table[last()]/tbody/tr//td[contains(@class,' x-grid-cell-last')]/div[not(contains(@style,'hidden'))]";
	
	
	public final String addUser_selectFirstTargetLanguageFind = "//div[contains(@name,'pdAdminGlobalComboEditor')]//div[contains(@class,'arrow-trigger')]";
	
	public final String addUser_NextButtonDisabled = "//div[contains(@id,'toolbar') and contains(@class,'x-toolbar-footer')]//a[contains(@class,'x-item-disabled')]//span[contains(text(),'Next >')]/..";
	public final String addUser_NextButtonEnabled = "css=table[class='x-btn x-btn-noicon']>tbody>tr:nth-child(2)>td:nth-child(2)>em button:contains('Next')";
	public final String warnignMessage_closeButton="css=button>span:contains('Close')";
	public final String editUser_checkOrganizationButton = "//div[contains(@name,'organizationRadio')]//label[contains(text(),'Organization')]";
	public final String editUser_checkVendorsButton = "//div[@name='vendorsRadio']//label[contains(text(),'Vendor')]";
	public final String editUser_emailNotification_checked="//input[(@name='emailNotification')and(@aria-checked='true')]/following-sibling::span[contains(@class,'checkbox')]";//"//table[contains(@class,'x-form-cb-checked')]//input[@name='emailNotification']";
	public final String editUser_checkEmailNotification = "//input[contains(@name,'emailNotification')]/following-sibling::span[contains(@class,'checkbox')]";//"//input[contains(@name,'emailNotification')]";//"css=input[name='emailNotification']";
	public final String editUser_OkButton = "//div[contains(@id,'User')]//span[text()='OK']/..";
	public final String editUser_applyButton = "//span[text()='Apply']";//div[contains(@id,'User')]//span[text()='Apply']/..";
	public final String editUser_OkButtonDisabled = "//div[contains(@id,'User')]//div[contains(@id,'toolbar')]//a[contains(@class,'disabled')]//span[contains(text(),'OK')]";
	public final String editUser_ApplyButtonDisabled = "//div[contains(@id,'User')]//div[contains(@id,'toolbar')]//a[contains(@class,'disabled')]//span[contains(text(),'Apply')]";
	public final String editUser_CancelButton = "//div[contains(@id,'User')]//span[text()='Cancel']/..";//div[contains(@id,'pdusermanagertabwindow')]//span[text()='Cancel']/..";
	public final String editUser_detailsTab = "//a[contains(@class,'x-tab-default-top')]//span[contains(text(),'Details')]/..";//"//div[contains(@class,'x-tab-default-top')]//span[text()='Details']/..";

	public final String editUser_rolesTab = "//a[contains(@class,'x-tab-default-top')]//span[text()='Roles']/..";
	public final String editUser_organizationsTab = "//div[contains(@id,'UserEdit')]//span[text()='Organizations']";//"//a[contains(@class,'x-tab-default-top')]//span[text()='Organizations']";
	public final String editUser_vendorsTab = "//div[contains(@id,'User')]//span[contains(text(),'Vendors')]/..";
	public final String editUser_vendorsTab_selectVendor = "//div[contains(@id,'gs4trdisableditemscombobox')]//div[contains(@class,'x-form-arrow-trigger')]";//"//table[contains(@id,'gs4trdisableditemscombobox')]//td/div[contains(@class,'x-form-arrow-trigger')]";
	public final String editUser_NewLanguage = "//a//span[contains(text(),'New')]";//"//a//span[contains(text(),'New')]/following-sibling::span";//"css=a:contains('New')";
	public final String editUser_DeleteLanguange = "//a//span[contains(text(),'Delete')]";//"//a//span[contains(text(),'Delete')]/following-sibling::span";//"css=a:contains('Delete')";
	public final String editUser_DeleteLanguangeDisabled = "//div[contains(@class,'x-btn-default-toolbar-small-disabled')]//span[text()='Delete']/..";
	public final String editUser_ClickFirstSourceLanguage = "//div[contains(@id,'pdusermanagerlanguagegrid')]//table[contains(@class,'x-grid-table x-grid-table-resizer')]/tbody/tr[not(contains(@class,'x-grid-header-row'))] [position() =1]/td[contains(@class,'x-grid-cell-first')]";//"css=div:nth-child(3) div[class=' x-panel x-panel-noborder'] div[class='x-grid3'] table[class='x-grid3-row-table']>tbody>tr>td>div";
	public final String editUser_selectedRole = "//div[contains(@style,'visible')]//div[@class='x-grid3-row x-grid3-row-selected']//tr";
	//Locators for finding target language from top
	public final String editUser_clickLastSourceLanguage = "//div[contains(@id,'User')]//table//tbody/tr/td[contains(@class,' x-grid-cell')]/div[not(contains(@style,'hidden'))]";//"//div[contains(@id,'User')]//table/tbody/tr[last()]/td[contains(@class,' x-grid-cell')]/div[not(contains(@style,'hidden'))]";
	public final String editUser_clickLastTargetLanguage = "//div[contains(@id,'User')]//table//tbody/tr//td[contains(@class,' x-grid-cell-last')]/div[not(contains(@style,'hidden'))]";//"//div[contains(@id,'User')]//table/tbody/tr[last()]//td[contains(@class,' x-grid-cell-last')]/div[not(contains(@style,'hidden'))]";
	//Locators for finding last added target language from bottom
	public final String editUser_clickLastSourceLanguage_ = "//div[contains(@id,'User')]//table[last()]//tbody/tr/td[contains(@class,' x-grid-cell')]/div[not(contains(@style,'hidden'))]";//"//div[contains(@id,'User')]//table/tbody/tr[last()]/td[contains(@class,' x-grid-cell')]/div[not(contains(@style,'hidden'))]";
	public final String editUser_clickLastTargetLanguage_ = "//div[contains(@id,'User')]//table[last()]//tbody/tr//td[contains(@class,' x-grid-cell-last')]/div[not(contains(@style,'hidden'))]";//"//div[contains(@id,'User')]//table/tbody/tr[last()]//td[contains(@class,' x-grid-cell-last')]/div[not(contains(@style,'hidden'))]";
	
	public final String editUser_organizationsTab_inputOrganizationName = "//div[@name='organizationName']//input";//"//table[@name='organizationName']//input";
	public final String editUser_organizationsTab_findOrganizationName = "//div[@name='organizationName']//div[contains(@class,'x-form-arrow-trigger')]";//"//table[@name='organizationName']//div[contains(@class,'x-form-arrow-trigger')]";
	public final String editUser_windowTitle_userManager ="//div[contains(@id,'AdminUserEdit')]//div[text()='User Manager']";//"//div[contains(@id,'AdminUserEdit')]//span[text()='User Manager']";	
	public final String editUser_windowTitle_DetailsTab_Header ="//div[contains(@id,'EditDetails')][contains(@class,'title-text')]";
			
	
	public final String editUser_organizationsTab_SelectOrgX(String org){
		String result = "//div[contains(@name,'organizationName')]/div/ul/li[contains(text(),'"+org+"')]";//"css=div[name='organizationName-boundlist']>div>ul>li:contains('"+org+"')";
		return result;
	}
	

	public final String userRowUsernameX(int row){
		return "//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";
	}
	

	
	public final String addUser_SelectTimeZoneX(String timeZone){
		return "//div[@name='timeZone-boundlist']//li[text()='"+timeZone+"']";
	}
	
	public final String addUser_SelectRoleNameX(String roleName){
		return "//tr[td/div[text()='"+roleName+"']]/td//div[contains(@class,'x-grid-radio-col')]";
	}
	
	public final String add_editUser_SelectSourceLanguageX(String sourceLanguage){
		return "//div[contains(@class,'boundlist')]//li[contains(text(),'"+sourceLanguage+"')]";
	}
	
	public final String add_editUser_SelectTargetLanguageX(String targetLanguage){
		return "//div[contains(@name,'pdAdminGlobalComboEditor') and not(contains(@style,'display: none'))]//li[contains(text(),'"+targetLanguage+"')]";//div[contains(@name,'targetLanguage-boundlist')]//li[contains(text(),'"+targetLanguage+"')]";
	}
	
	public final String addUser_SelectVendorX(String vendor){
		return "//div[contains(@name,'vendor-boundlist')]//li//div[contains(text(),'"+vendor+"')]";
	}
	
	public final String addUser_SelectOrgX(String org){
		return "//li[contains(text(),'"+org+"')]";
	}
	
	
	public final String editUser_rolesTab_ClickRoleX(String role){
		return "//tr/td[div[contains(text(),'"+role+"')]]/following-sibling::td//div";
	}
	
	public final String editUser_rolesTab_CheckedRoleX(String role){
		return "//tr/td[div[contains(text(),'"+role+"')]]/following-sibling::td//div[contains(@class,'radio-col-on')]";
	}

	
	public final String editUser_vendorsTab_selectVendorX(String vendor){
		return "//div[contains(@name,'vendorsCombo')]/div//div[contains(text(),'"+vendor+"')]";//"css=div[name='vendorsCombo-boundlist']>div div:contains('"+vendor+"')";
	}
	
	public final String editUser_SelectSourceLanguageX(String sourceLanguage){
		return "//div[contains(@name,'sourceLanguage-boundlist')]//li[contains(text(),'"+sourceLanguage+"')]";
	}
	
	public final String editUser_SelectTargetLanguageX(String targetLanguage){
		return "//li[contains(text(),'"+targetLanguage+"')]";
	}
	
	//User Main Window
	public final String usernameRowTitle = "//div[contains(@id,'pdMainGrid')]/div/div/div/div[1]/div";
	public final String nameRowTitle = "//div[contains(@id,'pdMainGrid')]/div/div/div/div[2]/div";
	public final String lastnameRowTitle = "//div[contains(@id,'pdMainGrid')]/div/div/div/div[3]/div[1]";
	public final String enabledRowTitle = "//div[contains(@id,'pdMainGrid')]/div/div/div/div[4]/div";
	public final String organizationRowTitle = "//div[contains(@id,'pdMainGrid')]/div/div/div/div[8]/div";
	public final String vendorRowTitle = "//div[contains(@id,'pdMainGrid')]/div/div/div/div[9]/div";
	public final String lastLoginRowTitle = "//div[contains(@id,'pdMainGrid')]/div/div/div/div[10]/div";
	public final String lockedRowTitle = "//div[contains(@id,'pdMainGrid')]/div/div/div/div[11]/div";
		
	public final String usernameRowTitleOptions = "//div[contains(@id,'tabpanel')]//div[@class='x-column-header-trigger']";//"//div[contains(@id,'mainTabPanel')]//div[@class='x-column-header-trigger']";//"//div[contains(@id,'mainTabPanel')]//div[contains(@data-qtip,'User name')]//div[@class='x-column-header-trigger']";//"//div[contains(@id,'mainTabPanel')]//span[@class='x-column-header-text'][text()='User name']/../div";	
	public final String nameRowTitleOptions = "//div[contains(@id,'tabpanel')]//div[contains(@data-qtip,'The name of the item.')]//div[@class='x-column-header-trigger']";//"//div[contains(@id,'mainTabPanel')]//span[@class='x-column-header-text'][text()='Name']/../div";
	public final String lastnameRowTitleOptions ="//div[contains(@id,'tabpanel')]//div[contains(@data-qtip,'The last name/surname')]//div[@class='x-column-header-trigger']";//"//div[contains(@id,'mainTabPanel')]//div[contains(@data-qtip,'Last Name')]//div[@class='x-column-header-trigger']"; //"//div[contains(@id,'mainTabPanel')]//span[@class='x-column-header-text'][text()='Last Name']/../div";
	public final String enabledRowTitleOptions = "//div[contains(@id,'tabpanel')]//div[contains(@data-qtip,'The status')]//div[@class='x-column-header-trigger']";//"//div[contains(@id,'mainTabPanel')]//span[@class='x-column-header-text'][text()='Enabled']/../div";
	public final String organizationRowTitleOptions = "//div[contains(@id,'tabpanel')]//div[contains(@data-qtip,'The Organization')]//div[@class='x-column-header-trigger']";//"//div[contains(@id,'mainTabPanel')]//span[@class='x-column-header-text'][text()='Organization']/../div";
	public final String vendorRowTitleOptions = "//div[contains(@id,'tabpanel')]//div[contains(@data-qtip,'The Vendor')]//div[@class='x-column-header-trigger']";
	public final String lastLoginRowTitleOptions = "//div[contains(@id,'tabpanel')]//div[contains(@data-qtip,'Last Login')]//div[@class='x-column-header-trigger']";
	public final String lockedRowTitleOptions = "//div[contains(@id,'tabpanel')]//div[contains(@data-qtip,'Locked')]//div[@class='x-column-header-trigger']";//"//div[contains(@id,'mainTabPanel')]//span[@class='x-column-header-text'][text()='Locked']/../div";
	
	public final String checkUsernameMenuItem = "//a[contains(@id,'menucheckitem')]/span[text()='User Name']";//"css=a>span:contains('User name')";
	public final String checkNameMenuItem = "//a[contains(@id,'menucheckitem')]/span[text()='Name']";//"css=a>span:contains('Name')";
	public final String checkLastNameMenuItem = "//a[contains(@id,'menucheckitem')]/span[text()='Last Name']";//"css=a>span:contains('Last Name')";
	public final String checkEnabledMenuItem = "//a[contains(@id,'menucheckitem')]/span[text()='Enabled']";//"css=a>span:contains('Enabled')";
	public final String checkOrganizationMenuItem = "//a[contains(@id,'menucheckitem')]/span[text()='Organization']";//css=a>span:contains('Organization')";
	public final String checkVendorMenuItem = "//a[contains(@id,'menucheckitem')]/span[text()='Vendor']";//css=a>span:contains('Vendor')";
	public final String checkLastLoginMenuItem = "//a[contains(@id,'menucheckitem')]/span[text()='Last Login']";//"css=a>span:contains('Last Login')";
	public final String checkLockedMenuItem = "//a[contains(@id,'menucheckitem')]/span[text()='Locked']";//"css=a>span:contains('Locked')";
	

	public final String userNameX(Integer row){
		return "//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[contains(@class,' x-grid-cell-first')]/div[contains(@class,'x-grid-cell-inner ')]";
	}
	
	public final String userNameX(String username){
		return "//div[contains(@id,'tableview')]//table/tbody//tr//td/div[text()='"+username+"']";//"//div[contains(@id,'gridview')]/table/tbody//tr//td/div[text()='"+username+"']";
	}
	

	public final String firstNameX(Integer row){
		return "//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[2]/div[contains(@class,'x-grid-cell-inner ')]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[2]/div[contains(@class,'x-grid-cell-inner ')]";
	}
	
	public final String firstNameX(String firstname){
		return "//div[contains(@id,'tableview')]//table/tbody//tr//td[2]/div[text()='"+firstname+"']";//"//div[contains(@id,'gridview')]/table/tbody//tr//td[2]/div[text()='"+firstname+"']";
	}
	
	public final String lastNameX(Integer row){
		return "//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[3]/div[contains(@class,'x-grid-cell-inner ')]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[3]/div[contains(@class,'x-grid-cell-inner ')]";
	}
	public final String lastNameX(String lastname){
		return "//div[contains(@id,'tableview')]//table/tbody//tr//td[3]/div[text()='"+lastname+"']";//"//div[contains(@id,'gridview')]/table/tbody//tr//td[3]/div[text()='"+lastname+"']";
	}	

	public final String enabledX(Integer row){
		return "//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[4]/div[contains(@class,'x-grid-cell-inner ')]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[4]/div[contains(@class,'x-grid-cell-inner ')]";
	}	


	public final String organizationX(Integer row){
		return "//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[8]/div[contains(@class,'x-grid-cell-inner ')]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[8]/div[contains(@class,'x-grid-cell-inner ')]";
	}
	
	public final String organizationNameX(String orgName){
		return "//div[contains(@id,'tableview')]//table/tbody//tr//td[8]/div[text()='gla_common_org']";//"//div[contains(@id,'gridview')]/table/tbody//tr//td[8]/div[text()='"+orgName+"']";
	}
	
	
	public final String vendorX(Integer row){
		return "//div[contains(@id,'pdMainGrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[9]/div[contains(@class,'x-grid-cell-inner ')]";//"//div[contains(@id,'pdmaingrid')]//descendant::tr[contains(@class,'x-grid-row')]["+row+"]/td[9]/div[contains(@class,'x-grid-cell-inner ')]";
	}
	
	public final String vendorX(String vendorname){
		return "//div[contains(@id,'tableview')]//table/tbody//tr//td[9]/div[text()='"+vendorname+"']";//"//div[contains(@id,'gridview')]/table/tbody//tr//td[9]/div[text()='"+vendorname+"']";
	}
	
	public final String groupTitleX (String title){
		return "//div[contains(@class,'grid-group-title')][contains(text(),'"+title+"')]";//"css=div.x-grid-group-title:contains('"+title+"')";
	}
	
	
	public final String createuser_SelectRole_FirstRow = "//div[contains(@name,'systemRoleGrid')]//table";

}
