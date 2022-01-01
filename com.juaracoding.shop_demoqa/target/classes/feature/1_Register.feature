Feature: Register in https://shop.demoqa.com/

  Scenario: Test automation Create account
    Given user go to th website
    When user create account with input new username email and password
    And user must login wordpress
    Then user finnish create account