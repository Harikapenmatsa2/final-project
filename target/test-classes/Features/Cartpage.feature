Feature: Cart and capture screenschot
  @cart
  Scenario: check items in the cart
    Then Open the cart
    And clear the cart
    Then close the cart
    Then Take screenshot
