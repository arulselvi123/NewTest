@smoke
Feature: Automation Practice application smoke testing Test

    
Scenario Outline: Verify the login functionailty using step data
Given User Launch the automation practice
When user click on the signin button in the header
And user enter the "<UserName>" in the email field
And user enter the "<Password>" in the password field
And user click on the signing button
Examples:
|UserName							|Password	|
|arulselvi@gmail.com				|arul123	|
|lakshmipriya.ramprakash@gmail.com	|India@143	|