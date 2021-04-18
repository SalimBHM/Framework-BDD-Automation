package com.selenium.e2eTests.moduleMyInfo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.selenium.e2eTests.utils.CommonMethods;
import com.selenium.e2eTests.utils.Setup;

public class MyInfoPage {
	
	
	public WebDriver driver;
	public CommonMethods commonMethods = new CommonMethods();
	
	/* Locators */
	final static String MENU_MYINFO_ID = "menu_pim_viewMyDetails";
	final static String EDIT_BUTTON_ID = "btnSave";
	final static String FIRST_NAME_ID = "personal_txtEmpFirstName";
	final static String MIDDLE_NAME_ID = "personal_txtEmpMiddleName";
	final static String LAST_NAME_ID = "personal_txtEmpLastName";
	final static String DATE_OF_BIRTH_ID = "personal_DOB";
	final static String SAVE_BUTTON_ID = "btnSave";
	final static String FULL_NAME_ID = "employee-details";

	/* @FindBY */
	@FindBy(how = How.ID, using = MENU_MYINFO_ID)
	public static WebElement menuMyInfo;
	@FindBy(how = How.ID, using = EDIT_BUTTON_ID)
	public static WebElement btnEdit;
	@FindBy(how = How.ID, using = FIRST_NAME_ID)
	public static WebElement firstName;
	@FindBy(how = How.ID, using = MIDDLE_NAME_ID)
	public static WebElement middleName;
	@FindBy(how = How.ID, using = LAST_NAME_ID)
	public static WebElement lastName;
	@FindBy(how = How.ID, using = DATE_OF_BIRTH_ID)
	public static WebElement dateOfBirth;
	@FindBy(how = How.ID, using = SAVE_BUTTON_ID)
	public static WebElement btnSave;
	@FindBy(how = How.ID, using = FULL_NAME_ID)
	public static WebElement fullName;
	
	public MyInfoPage() {
		driver = Setup.driver;
	}
	
	/* Methodes */
	public void clickOnMyInfoMenu() {
		menuMyInfo.click();
	}
	public void clickOnEdit() {
		btnEdit.click();
	}
	public void clickOnSaveButton() {
		btnSave.click();
	}
	public void fillFullName(String firstName1, String middleName1, String lastName1) throws InterruptedException {
		commonMethods.autocomplete1(firstName, firstName1);
		commonMethods.autocomplete1(middleName, middleName1);
		commonMethods.autocomplete1(lastName, lastName1);
		
	}
	public void fillDateOfBirth(String dateOfBirth1) throws InterruptedException {
		commonMethods.autocomplete1(dateOfBirth, dateOfBirth1);
	}	

}
