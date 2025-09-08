Feature: Check user is able to login with valid credentials
  Scenario: Successful login with valid username and password
    Given Login page should be open in default browser
    When user enters valid Email address
    And user enters valid Password
    And user clicks on the Login button
    Then user should be logged in and redirected to the homepage
