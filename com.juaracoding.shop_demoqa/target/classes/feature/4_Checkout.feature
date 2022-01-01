Feature: Cart Page and Proceed to Checkout in https://shop.demoqa.com/

  Scenario: Test to Cart Page and Proceed to Checkout
    When user go to cart page
    And user go to checkout page and fill his identity
    Then user completed his order
