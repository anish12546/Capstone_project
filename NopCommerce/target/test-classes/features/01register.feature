Feature: Check user is able to register with valid credentials
  Scenario: Successful registration of a new account
  Given Register page should be open in default browser
  When click on the Register button
  And enter valid First Name
  And enter valid Last Name
  And enter valid Email
  And enter valid Password
  And confirm the Password
  Then account should be created successfully

