$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AutomationPracticeSmoke.feature");
formatter.feature({
  "line": 2,
  "name": "Automation Practice application smoke testing Test",
  "description": "",
  "id": "automation-practice-application-smoke-testing-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Verify the login functionailty using step data",
  "description": "",
  "id": "automation-practice-application-smoke-testing-test;verify-the-login-functionailty-using-step-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
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
  "name": "user enter the \"\u003cUserName\u003e\" in the email field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enter the \"\u003cPassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click on the signing button",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "automation-practice-application-smoke-testing-test;verify-the-login-functionailty-using-step-data;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 12,
      "id": "automation-practice-application-smoke-testing-test;verify-the-login-functionailty-using-step-data;;1"
    },
    {
      "cells": [
        "arulselvi@gmail.com",
        "arul123"
      ],
      "line": 13,
      "id": "automation-practice-application-smoke-testing-test;verify-the-login-functionailty-using-step-data;;2"
    },
    {
      "cells": [
        "lakshmipriya.ramprakash@gmail.com",
        "India@143"
      ],
      "line": 14,
      "id": "automation-practice-application-smoke-testing-test;verify-the-login-functionailty-using-step-data;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Verify the login functionailty using step data",
  "description": "",
  "id": "automation-practice-application-smoke-testing-test;verify-the-login-functionailty-using-step-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
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
  "name": "user enter the \"arulselvi@gmail.com\" in the email field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enter the \"arul123\" in the password field",
  "matchedColumns": [
    1
  ],
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
  "duration": 9443837924,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_signin_button_in_the_header()"
});
formatter.result({
  "duration": 3214182905,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arulselvi@gmail.com",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_enter_the_in_the_email_field(String)"
});
formatter.result({
  "duration": 772116210,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arul123",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_enter_the_in_the_password_field(String)"
});
formatter.result({
  "duration": 616128275,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_signing_button()"
});
formatter.result({
  "duration": 2531014461,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify the login functionailty using step data",
  "description": "",
  "id": "automation-practice-application-smoke-testing-test;verify-the-login-functionailty-using-step-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
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
  "name": "user enter the \"lakshmipriya.ramprakash@gmail.com\" in the email field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enter the \"India@143\" in the password field",
  "matchedColumns": [
    1
  ],
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
  "duration": 2587398931,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_signin_button_in_the_header()"
});
formatter.result({
  "duration": 3670436808,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lakshmipriya.ramprakash@gmail.com",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_enter_the_in_the_email_field(String)"
});
formatter.result({
  "duration": 726076690,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "India@143",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_enter_the_in_the_password_field(String)"
});
formatter.result({
  "duration": 551817257,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_signing_button()"
});
formatter.result({
  "duration": 1977283248,
  "status": "passed"
});
});