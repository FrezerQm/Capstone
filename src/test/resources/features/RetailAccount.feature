@RetailAccountTest
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'phantomFrezer@tekschool.us' and password 'Abc@12345'
    And User click on login button
    And User should be logged in into Account

  @Test3
  Scenario: Verify user can update Profile Information
    When User click on Account option
    And User update Name 'PhantomFN' and Phone '2009089789'
    And User click on Update button
    Then User profile information should be updated

  @Test4
  Scenario: Verify User can update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Abc@12345       | Abcd@12345   | Abcd@12345       |
    And User click on Change Password button
    Then A message should be displayed 'Password Updated Successfully'

  @Test5
  Scenario: Verify user can add a payment method
    When User click on Account option
    And User click on Add a payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | ExpirationMonth | expirationYear | securityCode |
      | 1233837463347456 | Abcd       |               3 |           2034 |          090 |
    And User click on Add Your Card button
    Then A message should be displayed 'Payment Method added successfully'

  @Test6
  Scenario: Verify user can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1233837444927363 | ABCD       |              12 |           2034 |          101 |
    And User click on Update Your Card button
    Then A message should be displayed 'Payment Method updated Successfully'

  @Test7
  Scenario: Verify user caan remove Debit or Credit Card
    When User click on Account option
    And User click on remove option of Card section
    Then Payment details should be removed

  @Test8
  Scenario: Verify User can add Address
    When User click on Account option
    And User click on Add Address option
    And User fill new address form with below information
      | country        | fullName | phoneNumber | streetAddress                 | apt     | city   | state           | zipCode |
      | United Kingdom | CDE      |  2030989987 | 122 abcdd street abc District | floor 6 | London | London, City of |   20034 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @Test9
  Scenario: Verify User can edit an Address added on Account
    When User click on Account option
    And User click on edit address option
    And User fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress                 | apt     | city   | state   | zipCode |
      | United States | ABC      |  2022434445 | 123 abcdd street abc District | floor 6 | London | Arizona |   20034 |
    And User click Update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  @Test10
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
