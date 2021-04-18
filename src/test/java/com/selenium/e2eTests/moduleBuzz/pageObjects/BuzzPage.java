package com.selenium.e2eTests.moduleBuzz.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuzzPage {
	
	/* Locators */
	final static String USER_NAME_ID = "txtUsername";
	final static String USER_PASSWORD_ID = "txtPassword";
	final static String BUTTON_ID = "btnLogin";
	final static String WELCOME_ID = "welcome";
	final static String BUZZ_ID = "menu_buzz_viewBuzz";
	final static String FULLNAME_ID = "createPost_content";	
	

	/* @FindBY */
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USER_PASSWORD_ID)
	public static WebElement password;
	@FindBy(how = How.ID, using = BUTTON_ID)
	public static WebElement btnLogin;
	@FindBy(how = How.ID, using = WELCOME_ID)
	public static WebElement welcome;
	@FindBy(how = How.ID, using = BUZZ_ID)
	public static WebElement buzzItem;
	@FindBy(how = How.ID, using = FULLNAME_ID)
	public static WebElement fullName;
	
	/* Methodes */
	public void fillUserNameBuzz(String name) {
		userName.sendKeys(name);
	}

	public void fillPasswordBuzz(String password1) {
		password.sendKeys(password1);
	}

	public void clickOnBtnLoginBuzz() {
		btnLogin.click();
	}
	
	public void clickOnBuzzItem() {
		buzzItem.click();
	}

	public void fillFullName(String fullName1) {
		fullName.sendKeys(fullName1);
	}
	
}
