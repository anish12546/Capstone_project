Feature: Check the user is able to search for product
Scenario Outline: Successful search of an product
 Given search page is open in browser
When user clicks on the search bar
And enters the product <product>
Then search results for product should be displayed
 Examples:
|product|
|Asus laptop|
|mobile|
|shoes|
