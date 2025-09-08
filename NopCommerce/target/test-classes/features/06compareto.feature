Feature: Compare two products

  Scenario: User compares two products successfully
    Given User is on the nopCommerce homepage
    When  User clicks on the Compare button for the first product
    And User clicks on the Compare button for the second product
    And User navigates to the product comparison page
    Then Both selected products should be displayed in the comparison list
