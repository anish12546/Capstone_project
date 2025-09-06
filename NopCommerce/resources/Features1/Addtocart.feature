Feature: check user is able to add products in cart
Scenario Outline:
: successfully add product to cart 
Given the user is on the product page 
When the user clicks on the Add to Cart button <input1>
And  the user click on remove cart button
Then successfully add product to cart and also remove
Examples:
|input1|
|watch|
|book|
|toy|