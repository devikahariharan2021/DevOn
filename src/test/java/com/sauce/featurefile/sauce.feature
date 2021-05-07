Feature: Login And Checkout The Fleece Jacket In Sauce Portal

Scenario Outline: User Login with locked out Credential

Given user Login The Application
When user Enter The Locked User Name "<Username>" In Username Field
And user Enter The Password for Locked User "<Password>" In Password Field
And user Click The Login Button for Locked User
Then Verify The locked_out_user havent logged in successfully

Examples:
|Username|Password|
|locked_out_user|secret_sauce|

Scenario Outline: User Login with valid Credentials

Given user Enter The Standard User Name "<Username>" In Username Field
When user Enter The Password for Standard User "<Password>" In Password Field
And user Click The Login Button for Standard User
Then Verify The standard_user has logged in successfully

Examples:
|Username|Password|
|standard_user|secret_sauce|

Scenario: User able to add the Fleece Jacket to kart directly from Product

Given user add the Fleece Jacket product to Kart by clicking Add To Kart button
When user open the Kart by clicking the kart
Then Verify The presence of Fleece Jacket product in Kart

Scenario Outline: User able to checkout the item from kart

Given user click the continue button to checout the product in kart
When user Enter The Firstname "<Firstname>" In Firstname Field
When user Enter The Lastname "<Lastname>" In Lastname Field
When user Enter The Postal code "<Postalcode>" In Postalcode Field
When user click on the continue button to checkout the product
Then Verify the presence of checkout product in Checkout Overview

Examples:
|Firstname|Lastname|Postalcode|
|TestFirstName|TestLastName|123456|

Scenario: User able to place the order successfully

Given user click on the Finish button to proceed the checkout
Then Verify The order confirmation
Then Verify The kart quantity