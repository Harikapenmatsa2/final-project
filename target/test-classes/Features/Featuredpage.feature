Feature: featured page
  @feature
  Scenario: select featured data and add to cart
    Given click on the featured button
    Then Select the items from the featured page
    And add to basket
    Then take screenschot