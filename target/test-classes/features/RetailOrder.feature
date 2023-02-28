@RetailOrder
Feature: Retail Order Page

  @Test16
  Scenario: Verify user can cancel the order
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'frezer@hot.com' and password 'Abc@12345'
    And User click on login button
    And User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Cancel The Order button
    And User select the cancelation reason 'Bought wrong item'
    And User click on Cancel Order button
    Then A cancelation message should be displayed 'Your Order Has Been Cancelled'

  @Test17
  Scenario: Verify user can Return the order
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'frezer@hot.com' and password 'Abc@12345'
    And User click on login button
    And User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Return Item button
    And User select the Return Reason 'Item damaged'
    And User select the drop off service 'FedEx'
    And User click on Return Order button
    Then A cancelation message should be displayed 'Return was successfull'

  @Test18
  Scenario: Verify user can write a review on order placed
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'frezer@hot.com' and password 'Abc@12345'
    And User click on login button
    And User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Review button
    And User write Review headline 'review product' and 'expensive but worth every penny'
    And User click Add your Review button
    Then A review message should be displayed 'Your review was added successfully'
