Feature: This is to test the login functionality

  Scenario: To test the customer login functionality
    Given User opens the application
    When The user enter the correct username and password
    |  username    | test   |
    |  password    |  test  | 
    Then User could login application successfully
