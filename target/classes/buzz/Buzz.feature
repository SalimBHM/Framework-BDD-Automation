@buzz
Feature: Click on buzz
  I want to use this template to write my full name

  @tag1
  Scenario: Click on Buzz item
  	Given I open OrangeHRM app
  	When I enter the username "Admin"
    And I enter the password "admin123"
    And I click on the login button
    And I verify that i am on page home "Welcome"
    And I click on the Buzz item
    Then I enter the Full name "Salim BEN HAMMOUDA"