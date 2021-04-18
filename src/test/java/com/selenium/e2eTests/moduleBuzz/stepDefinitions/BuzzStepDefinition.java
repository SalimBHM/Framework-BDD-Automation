package com.selenium.e2eTests.moduleBuzz.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.moduleBuzz.pageObjects.BuzzPage;
import com.selenium.e2eTests.utils.CommonMethods;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuzzStepDefinition {
	
	public WebDriver driver;
	public BuzzPage buzzPage = new BuzzPage();
	public CommonMethods commonMethods = new CommonMethods();
	
	//Constructor
	public BuzzStepDefinition() {
	driver=Setup.driver;
	}

	@Given("^I open OrangeHRM app$")
	public void iOpenOrangeHRMApp() throws Throwable {
		commonMethods.openApplication();
	}

	@When("^I enter the username \"([^\"]*)\"$")
	public void iEnterTheUsername(String name) throws Throwable {
		PageFactory.initElements(driver, BuzzPage.class);
		buzzPage.fillUserNameBuzz(name);
	}

	@When("^I enter the password \"([^\"]*)\"$")
	public void iEnterThePassword(String password2) throws Throwable {
		PageFactory.initElements(driver, BuzzPage.class);
		buzzPage.fillPasswordBuzz(password2);
	}

	@When("^I click on the login button$")
	public void iClickOnTheLoginButton() throws Throwable {
		buzzPage.clickOnBtnLoginBuzz();
	}
	
	@When("^I verify that i am on page home \"([^\"]*)\"$")
	public void iVerifyThatIamOnPageHome(String textWelcome) throws Throwable {
		String adminUser = BuzzPage.welcome.getText();
		Assert.assertTrue(adminUser.contains(textWelcome));
	}
	
	@When("^I click on the Buzz item$")
	public void clickBuzz() throws Throwable {
		buzzPage.clickOnBuzzItem();		
	}

	@Then("^I enter the Full name \"([^\"]*)\"$")
	public void iEnterTheFullName(String fullName) throws Throwable {
		PageFactory.initElements(driver, BuzzPage.class);
		buzzPage.fillFullName(fullName);
		Thread.sleep(3000);
	}

}
