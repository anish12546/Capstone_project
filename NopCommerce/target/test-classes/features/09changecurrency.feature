Feature: Check user is able to change currency on the homepage

  Scenario: Successful change of currency
    Given Homepage should be open in default browser
    When user selects Euro from the currency dropdown
    Then all product prices should be displayed in €
