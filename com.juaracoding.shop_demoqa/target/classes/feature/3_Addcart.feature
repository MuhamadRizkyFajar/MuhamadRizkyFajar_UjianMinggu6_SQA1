Feature: Add item to cart in https://shop.demoqa.com/

  Scenario: Test Add Item to Cart
    When user go to shop
    And user add first item from compare product
    And user add second item from search product
    Then user has added item to cart
