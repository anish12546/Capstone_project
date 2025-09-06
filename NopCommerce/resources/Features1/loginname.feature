Feature: check user is able to edit username
Scenario: successful change username
Given pfofile page should be open in default browsers
When click on personal information
And click on edit button to change username
Then successfully change username