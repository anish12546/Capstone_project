Feature: Add new address in nopCommerce account

  Scenario: User adds a new address successfully
    Given User is logged into their nopCommerce accounts
    When User navigates to the My account sections
    And User clicks on the Addresses 
    And User clicks on Add new to add a new address
    And User enters valid new address detail
    And User saves the addresss
    Then The new address should be added successfully
