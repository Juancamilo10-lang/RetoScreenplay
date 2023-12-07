Feature: select two products

  Scenario: Successfully add two random products to shopping cart
    Given the user opens the browser.
    When the user clicks on the search bar and enters the product names
    And the user selects two products at random and adds them to the shopping cart.
    And click on the shopping cart.
    Then the user will be able to validate the products added to the cart with the title.