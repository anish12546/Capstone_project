Feature: Check user is able to register with valid credentials
  Scenario Outline:
: Successful registration of a new account
  Given Register page should be open in default browser
  When click on the Register button
  And enter valid First Name<firstname>
  And enter valid Last Name<lastname>
  And enter valid Email<email>
  And enter valid Password<password>
  And confirm the Password<cpassword>
  Then account should be created successfully
  Examples:
    | firstname | lastname | email                         | password | cpassword |
    | Anish     | Jadhav   | jadhavanish416@gmail.com      | 12102002 | 12102002 |

  

