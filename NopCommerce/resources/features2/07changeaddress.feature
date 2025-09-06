Feature: Change user address in nopCommerce account

  Scenario: User updates their address successfully
    Given User is logged into their nopCommerce account
    When User navigates to the My account section
    And User clicks on the Addresses option
    And User clicks on Add new or Edit to update an address
    And User enters valid address details
    And User saves the address
    Then The address should be updated successfully
