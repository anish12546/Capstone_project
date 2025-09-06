Feature: check user is able to search a products
Scenario Outline:
: successfully search product
Given search page is open on default browser
When click on search bar and enter product one by one <input1>
Then successfully search all products
Examples:
|input1|
|watch|
|book|
|toy|