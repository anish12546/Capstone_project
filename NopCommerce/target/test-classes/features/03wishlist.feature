Feature: Check user is able to add product to wishlist

  Scenario: Successful add and remove product from wishlist
    Given user is on the product page in default browsers
    When user clicks on Add to wishlist button
    And user clicks on Wishlist button
    When user clicks on wishlist Remove button
    Then product should be added and removed from the wishlist
