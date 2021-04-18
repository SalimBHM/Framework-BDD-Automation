package com.selenium.e2eTests.authentication.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthenticationPage {

	/* Locators */
	final static String USER_NAME_ID = "txtUsername";
	final static String USER_PASSWORD_ID = "txtPassword";
	final static String BUTTON_ID = "btnLogin";
	final static String WELCOME_ID = "welcome";	

	/* @FindBY */
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USER_PASSWORD_ID)
	public static WebElement password;
	@FindBy(how = How.ID, using = BUTTON_ID)
	public static WebElement btnLogin;
	@FindBy(how = How.ID, using = WELCOME_ID)
	public static WebElement welcome;

	/* Methodes */
	public void fillUserName(String name) {
		userName.sendKeys(name);
	}

	public void fillPassword(String password1) {
		password.sendKeys(password1);
	}

	public void clickOnBtnLogin() {
		btnLogin.click();
	}
	

}