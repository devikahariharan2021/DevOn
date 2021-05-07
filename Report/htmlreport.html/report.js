$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sauce.feature");
formatter.feature({
  "line": 1,
  "name": "Login And Checkout The Fleece Jacket In Sauce Portal",
  "description": "",
  "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User Login with locked out Credential",
  "description": "",
  "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-login-with-locked-out-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Login The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Locked User Name \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password for Locked User \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button for Locked User",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify The locked_out_user havent logged in successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-login-with-locked-out-credential;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 12,
      "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-login-with-locked-out-credential;;1"
    },
    {
      "cells": [
        "locked_out_user",
        "secret_sauce"
      ],
      "line": 13,
      "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-login-with-locked-out-credential;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "User Login with locked out Credential",
  "description": "",
  "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-login-with-locked-out-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Login The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Locked User Name \"locked_out_user\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password for Locked User \"secret_sauce\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button for Locked User",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify The locked_out_user havent logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Login_The_Application()"
});
formatter.result({
  "duration": 12358764800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "locked_out_user",
      "offset": 33
    }
  ],
  "location": "StepDefinition.user_Enter_The_Locked_User_Name_In_Username_Field(String)"
});
formatter.result({
  "duration": 3817620700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 41
    }
  ],
  "location": "StepDefinition.user_Enter_The_Password_for_Locked_User_In_Password_Field(String)"
});
formatter.result({
  "duration": 318610800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_for_Locked_User()"
});
formatter.result({
  "duration": 929453100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_The_locked_out_user_havent_logged_in_successfully()"
});
formatter.result({
  "duration": 149248200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "User Login with valid Credentials",
  "description": "",
  "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "user Enter The Standard User Name \"\u003cUsername\u003e\" In Username Field",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user Enter The Password for Standard User \"\u003cPassword\u003e\" In Password Field",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Click The Login Button for Standard User",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Verify The standard_user has logged in successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 23,
      "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 24,
      "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "User Login with valid Credentials",
  "description": "",
  "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "user Enter The Standard User Name \"standard_user\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user Enter The Password for Standard User \"secret_sauce\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Click The Login Button for Standard User",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Verify The standard_user has logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 35
    }
  ],
  "location": "StepDefinition.user_Enter_The_Standard_User_Name_In_Username_Field(String)"
});
formatter.result({
  "duration": 219668100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 43
    }
  ],
  "location": "StepDefinition.user_Enter_The_Password_for_Standard_User_In_Password_Field(String)"
});
formatter.result({
  "duration": 165572200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_for_Standard_User()"
});
formatter.result({
  "duration": 715802100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_The_standard_user_has_logged_in_successfully()"
});
formatter.result({
  "duration": 287570600,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "User able to add the Fleece Jacket to kart directly from Product",
  "description": "",
  "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-able-to-add-the-fleece-jacket-to-kart-directly-from-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "user add the Fleece Jacket product to Kart by clicking Add To Kart button",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user open the Kart by clicking the kart",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Verify The presence of Fleece Jacket product in Kart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_add_the_Fleece_Jacket_product_to_Kart_by_clicking_Add_To_Kart_button()"
});
formatter.result({
  "duration": 151216400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_open_the_Kart_by_clicking_the_kart()"
});
formatter.result({
  "duration": 272574900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_The_presence_of_Fleece_Jacket_product_in_Kart()"
});
formatter.result({
  "duration": 126661900,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 32,
  "name": "User able to checkout the item from kart",
  "description": "",
  "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-able-to-checkout-the-item-from-kart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 34,
  "name": "user click the continue button to checout the product in kart",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "user Enter The Firstname \"\u003cFirstname\u003e\" In Firstname Field",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Lastname \"\u003cLastname\u003e\" In Lastname Field",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Postal code \"\u003cPostalcode\u003e\" In Postalcode Field",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user click on the continue button to checkout the product",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "Verify the presence of checkout product in Checkout Overview",
  "keyword": "Then "
});
formatter.examples({
  "line": 41,
  "name": "",
  "description": "",
  "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-able-to-checkout-the-item-from-kart;",
  "rows": [
    {
      "cells": [
        "Firstname",
        "Lastname",
        "Postalcode"
      ],
      "line": 42,
      "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-able-to-checkout-the-item-from-kart;;1"
    },
    {
      "cells": [
        "TestFirstName",
        "TestLastName",
        "123456"
      ],
      "line": 43,
      "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-able-to-checkout-the-item-from-kart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 43,
  "name": "User able to checkout the item from kart",
  "description": "",
  "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-able-to-checkout-the-item-from-kart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 34,
  "name": "user click the continue button to checout the product in kart",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "user Enter The Firstname \"TestFirstName\" In Firstname Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Lastname \"TestLastName\" In Lastname Field",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Postal code \"123456\" In Postalcode Field",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user click on the continue button to checkout the product",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "Verify the presence of checkout product in Checkout Overview",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_the_continue_button_to_checout_the_product_in_kart()"
});
formatter.result({
  "duration": 104613200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestFirstName",
      "offset": 26
    }
  ],
  "location": "StepDefinition.user_Enter_The_Firstname_In_Firstname_Field(String)"
});
formatter.result({
  "duration": 424175900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestLastName",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_Enter_The_Lastname_In_Lastname_Field(String)"
});
formatter.result({
  "duration": 273893000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_Enter_The_Postal_code_In_Postalcode_Field(String)"
});
formatter.result({
  "duration": 220429300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_continue_button_to_checkout_the_product()"
});
formatter.result({
  "duration": 237900900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_the_presence_of_checkout_product_in_Checkout_Overview()"
});
formatter.result({
  "duration": 127008200,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "User able to place the order successfully",
  "description": "",
  "id": "login-and-checkout-the-fleece-jacket-in-sauce-portal;user-able-to-place-the-order-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "user click on the Finish button to proceed the checkout",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "Verify The order confirmation",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "Verify The kart quantity",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_Finish_button_to_proceed_the_checkout()"
});
formatter.result({
  "duration": 156906600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_The_order_confirmation()"
});
formatter.result({
  "duration": 84393700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_The_kart_quantity()"
});
formatter.result({
  "duration": 420130900,
  "status": "passed"
});
});