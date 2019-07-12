$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AutomationPracticeEnd2End.feature");
formatter.feature({
  "line": 2,
  "name": "Automation Practice application end to end testing Test",
  "description": "",
  "id": "automation-practice-application-end-to-end-testing-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@end2end"
    }
  ]
});
formatter.before({
  "duration": 178973,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify the login functionailty using step data",
  "description": "",
  "id": "automation-practice-application-end-to-end-testing-test;verify-the-login-functionailty-using-step-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc_1"
    },
    {
      "line": 4,
      "name": "@demo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User Launch the automation practice",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on the signin button in the header",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter the \"arulselvi@gmail.com\" in the email feild",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enter the \"arul123\" in the password feild",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click on the signing button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_Launch_the_automation_practice()"
});
formatter.result({
  "duration": 27199370421,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_signin_button_in_the_header()"
});
formatter.result({
  "duration": 3617463432,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arulselvi@gmail.com",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_enter_the_in_the_email_feild(String)"
});
formatter.result({
  "duration": 320862833,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arul123",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_enter_the_in_the_password_feild(String)"
});
formatter.result({
  "duration": 213031309,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_signing_button()"
});
formatter.result({
  "duration": 4009475778,
  "status": "passed"
});
formatter.after({
  "duration": 271481,
  "status": "passed"
});
formatter.before({
  "duration": 90619,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "verify the search function of the user",
  "description": "",
  "id": "automation-practice-application-end-to-end-testing-test;verify-the-search-function-of-the-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@tc_2"
    },
    {
      "line": 12,
      "name": "@demo"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "select the type of dress",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User mouseover to the summerdress",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "check if the item is added to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.select_the_type_of_dress()"
});
formatter.result({
  "duration": 4370433958,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_mouseover_to_the_summerdress()"
});
formatter.result({
  "duration": 301235408,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.check_if_the_item_is_added_to_the_cart()"
});
formatter.result({
  "duration": 281054826,
  "status": "passed"
});
formatter.after({
  "duration": 181617,
  "status": "passed"
});
formatter.before({
  "duration": 166136,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify the dress page is displayed",
  "description": "",
  "id": "automation-practice-application-end-to-end-testing-test;verify-the-dress-page-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@tc_3"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "check the selected page is right",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user click to proceed to checkout",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "verify the product is added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.check_the_selected_page_is_right()"
});
formatter.result({
  "duration": 2280459758,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_to_proceed_to_checkout()"
});
formatter.result({
  "duration": 11339519,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.verify_the_product_is_added_to_cart()"
});
formatter.result({
  "duration": 4668881684,
  "status": "passed"
});
formatter.after({
  "duration": 84200,
  "status": "passed"
});
});