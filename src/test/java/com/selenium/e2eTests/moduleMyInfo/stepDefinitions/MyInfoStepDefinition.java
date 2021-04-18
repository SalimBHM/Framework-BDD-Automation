package com.selenium.e2eTests.moduleMyInfo.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.moduleMyInfo.pageObjects.MyInfoPage;
import com.selenium.e2eTests.utils.CommonMethods;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyInfoStepDefinition {
	
	public WebDriver driver;
	public MyInfoPage myInfoPage = new MyInfoPage();
	public CommonMethods commonMethods = new CommonMethods();
	//Constructor
	public MyInfoStepDefinition() {
	driver=Setup.driver;
	PageFactory.initElements(driver, myInfoPage);
	}
	
	
	@When("^Je clique sur le bouton My Info$")
	public void jeCliqueSurLeBoutonMyInfo() throws Throwable {
		myInfoPage.clickOnMyInfoMenu();
	}

	@And("^Je clique sur le bouton Edit de Personal Details$")
	public void jeCliqueSurLeBoutonEdit() throws Throwable {
		myInfoPage.clickOnEdit();
	}

	@And("^Je saisis les champs de Full Name \"([^\"]*)\" et \"([^\"]*)\" et \"([^\"]*)\"$")
	public void jeSaisisLesChampsFullName(String firstName1, String middleName1, String lastName1) throws Throwable {
		myInfoPage.fillFullName(firstName1, middleName1, lastName1);
	}

	@And("^Je saisie le champ Date of Birth \"([^\"]*)\"$")
	public void jeSaisisLeChampDateOfBirth(String dateOfBirth1) throws Throwable {
		myInfoPage.fillDateOfBirth(dateOfBirth1);
	}

	@And("^Je clique sur le bouton save Edit my Info$")
	public void jeCliqueSurLeBoutonSaveEditMyInfo() throws Throwable {
		myInfoPage.clickOnSaveButton();
	}
	
	@Then("^Je verifie que mes donnees sont changees correctement$")
	public void jeVerifieQueMesDonneesSontChangeesCorrectement() throws Throwable {
		String employeeDetails = MyInfoPage.fullName.getText();
		Assert.assertTrue(employeeDetails.contains("Salim"));

	}
	

}
