@HomePage
Feature: Retail Home Page

  @Test11
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then Below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @Test12
  Scenario Outline: Verify department sidebar options
    Given User is on retail website
    When User click on All section
    And User click on "<department>"
    Then Below options are present in department
      | "<optionOne>" | "<optionTwo>" |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automative  | Automative Parts & Accessories | MotorCycle & Powersports |

  @Test13
  Scenario: Verify user can add an  item to cart
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'phantomFrezer@tekschool.us' and password 'Abc@12345'
    And User click on login button
    And User should be logged in into Account
    And User change category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then The Cart icon quantity should be change to '2'

  @Test14
  Scenario: Verify user can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'phantomFrezer@tekschool.us' and password 'Abc@12345'
    And User click on login button
    And User should be logged in into Account
    And User change category to 'Smart Home'
    And User search for an item 'Kasa Outdoor Smart Plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then The Cart icon quantity should be change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt    | city     | state    | zipCode |
      | United States | ABC DE   | 20202023345 | 12 AB street  | foor 6 | MaryLand | MaryLand |   23312 |
    And User click Add Your Address button
    And User click Add a credit card or Debit card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | ExpirationMonth | expirationYear | securityCode |
      | 1233837488347456 | Abc        |               4 |           2034 |          090 |
    And User click on Add Your Card button
    And User click on Place Your Order
    Then A message should be displayed 'Order Placed, Thanks'

  @Test15
  Scenario: Verify user can place an order with Shipping address and payment method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'phantomFrezer@tekschool.us' and password 'Abc@12345'
    And User click on login button
    And User should be logged in into Account
    And User change category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on item
    And User select quantity '5'
    And User click add to Cart button
    Then The Cart icon quantity should be change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then A message should be displayed 'Order Placed, Thanks'
