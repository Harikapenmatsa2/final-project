Feature: shopping the items and adding to cart
  @shop
  Scenario: shopping items to cart
    Given Open the Browser
    Then enter the Url
    And Click on Shop
    Then apply Filters
    Then select the items to shop
    Then select which size needs to be added
    And Select the color which suites
    Then add to the Cart
    And Remove the item from the cart



