package com.selenium.e2eTests.moduleAdmin.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPage {
	
	/* Locators */
	final static String MENU_ADMIN_ID = "menu_admin_viewAdminModule";
	final static String ADD_BUTTON_ID = "btnAdd";
	final static String EMPLOYE_NAME_ID = "systemUser_employeeName_empName";
	final static String EMPLOYE_USERNAME_ID = "systemUser_userName";
	final static String EMPLOYE_PASSWORD_ID = "systemUser_password";
	final static String EMPLOYE_CONFIRM_PASSWORD_ID = "systemUser_confirmPassword";
	final static String SAVE_BUTTON_ID = "btnSave";

	/* @FindBY */
	@FindBy(how = How.ID, using = MENU_ADMIN_ID)
	public static WebElement menuAdmin;
	@FindBy(how = How.ID, using = ADD_BUTTON_ID)
	public static WebElement btnAdd;
	@FindBy(how = How.ID, using = EMPLOYE_NAME_ID)
	public static WebElement employeName;
	@FindBy(how = How.ID, using = EMPLOYE_USERNAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = EMPLOYE_PASSWORD_ID)
	public static WebElement password;
	@FindBy(how = How.ID, using = EMPLOYE_CONFIRM_PASSWORD_ID)
	public static WebElement confirmPassword;
	@FindBy(how = How.ID, using = SAVE_BUTTON_ID)
	public static WebElement btnSave;
	
	/* Methodes */
	public void clickOnAdminMenu() {
		menuAdmin.click();
	}
	public void clickOnAdd() {
		btnAdd.click();
	}
	public void clickSaveButton() {
		btnSave.click();
	}
	public void fillName(String name1) {
		employeName.sendKeys(name1);
	}
	public void fillUserName(String userName1) {
		userName.sendKeys(userName1);
	}
	public void fillPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void fillConfirmPassword(String pwd1) {
		confirmPassword.sendKeys(pwd1);
	}
	
	
	/*public void remplirFormulaireUserSys(String name, String username, String ) {
		btnAdd.click();
		employeName.sendkeys(name);
		userName.sendKeys(username);
		password.sendKeys(mdp);
		confirmPassword.sendKeys(confirmMdp);
		btnSave.click();
	} */

}
