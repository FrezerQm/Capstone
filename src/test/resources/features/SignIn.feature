@smokeTest
Feature: Sign in feature

  Background: 
    Given User is on retail website

  @Test1
  Scenario: Verify user can sign in into Retail Application
    When User click on Sign in option
    And User enter email 'phantomFrezer@tekschool.us' and password 'Abc@12345'
    And User click on login button
    Then User should be logged in into Account

  @Test2
  Scenario: Verify user can create an account into Retail Website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the sign up information with below data
      | name      | email                  | password  | confirmPassword |
      | phantomFN | phantomF@tekschool.us | Abc@12345 | Abc@12345       |
    And User click in Sign Up button
    Then User should be logged into account page
