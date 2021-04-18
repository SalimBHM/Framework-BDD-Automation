package com.selenium.e2eTests.moduleAdmin.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.moduleAdmin.pageObjects.AdminPage;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class AdminStepDefinition {
	
	public WebDriver driver;
	public AdminPage adminPage = new AdminPage();
	//Constructor
	public AdminStepDefinition() {
	driver=Setup.driver;
	PageFactory.initElements(driver, adminPage);
	}
	
	
	@When("^Je clique sur le bouton Admin$")
	public void jeCliqueSurLeBoutonAdmin() throws Throwable {
		adminPage.clickOnAdminMenu();
	}

	@And("^Je clique sur le bouton Add$")
	public void jeCliqueSurLeBoutonAdd() throws Throwable {
		adminPage.clickOnAdd();
	}

	@And("^Je saisis le champ Emplyee Name \"([^\"]*)\"$")
	public void jeSaisisLeChampEmplyeeName(String name) throws Throwable {
		adminPage.fillName(name);
	}

	@And("^Je saisis le champ Username \"([^\"]*)\"$")
	public void jeSaisisLeChampUsername(String username) throws Throwable {
		adminPage.fillUserName(username);
	}

	@And("^Je saisis le champ Password \"([^\"]*)\"$")
	public void jeSaisisLeChampPassword(String mdp) throws Throwable {
		adminPage.fillPassword(mdp);
	}

	@And("^Je saisis le champ Confirm Password \"([^\"]*)\"$")
	public void jeSaisisLeChampConfirmPassword(String mdp1) throws Throwable {
	adminPage.fillConfirmPassword(mdp1);
	}

	@And("^Je clique sur le bouton save$")
	public void jeCliqueSurLeBoutonSave() throws Throwable {
	adminPage.clickSaveButton();
	}

}
