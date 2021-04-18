package com.selenium.e2eTests.authentication.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.authentication.pageObjects.AuthenticationPage;
import com.selenium.e2eTests.utils.CommonMethods;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationStepDefinition extends CommonMethods {

	public WebDriver driver;
	public AuthenticationPage authenticationPage = new AuthenticationPage();
	public CommonMethods commonMethods = new CommonMethods();
	//Constructor
	public AuthenticationStepDefinition() {
	driver=Setup.driver;
	}

	@Given("^J'ouvre l'application OrangeHRM$")
	public void jOuvreLApplicationOrangeHRM() throws Throwable {
		logger.info("J'ouvre l'application OrangeHRM");
		commonMethods.openApplication();
	}

	@When("^Je saisi le username \"([^\"]*)\"$")
	public void jeSaisiLeUsername(String name) throws Throwable {
		logger.info("Je saisi le username");
		PageFactory.initElements(driver, AuthenticationPage.class);
		authenticationPage.fillUserName(name);
	}

	@When("^Je saisi le mot de passe \"([^\"]*)\"$")
	public void jeSaisiLeMotDePasse(String password1) throws Throwable {
		logger.info("Je saisi le mot de passe");
		PageFactory.initElements(driver, AuthenticationPage.class);
		authenticationPage.fillPassword(password1);
	}

	@When("^Je clique sur le bouton$")
	public void jeCliqueSurLeBouton() throws Throwable {
		logger.info("Je clique sur le bouton");
		authenticationPage.clickOnBtnLogin();
	}
	

	@Then("^Redirection vers la page Home de l'application OrangeHRM \"([^\"]*)\"$")
	public void redirectionVersLaPageHomeDeLApplicationOrangeHRM(String textWelcome) throws Throwable {
		logger.info("Redirection vers la page Home de l'application OrangeHRM");
		String adminUser = AuthenticationPage.welcome.getText();
		Assert.assertTrue(adminUser.contains(textWelcome));

	}

}
