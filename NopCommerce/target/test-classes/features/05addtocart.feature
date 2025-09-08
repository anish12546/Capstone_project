Feature: Check user is able to add product to cart

  Scenario: Successful add and remove product from cart
    Given user is on the product page in default browser
    When user clicks on Add to cart button
    And user clicks on Shopping cart button
    When user clicks on Remove button
    Then product should be add and removed from the cart
