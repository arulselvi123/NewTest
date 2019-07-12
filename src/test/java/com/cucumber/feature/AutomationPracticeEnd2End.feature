@end2end
Feature: Automation Practice application end to end testing Test

@tc_1 @demo
Scenario: Verify the login functionailty using step data
Given User Launch the automation practice
When user click on the signin button in the header
And user enter the "arulselvi@gmail.com" in the email feild
And user enter the "arul123" in the password feild
And user click on the signing button

@tc_2 @demo
Scenario: verify the search function of the user 
    Given select the type of dress
    And User mouseover to the summerdress
    Then check if the item is added to the cart
@tc_3
Scenario: Verify the dress page is displayed
    Given check the selected page is right
    When user click to proceed to checkout
    Then verify the product is added to cart
@tc_4 @demo
Scenario: Verify the product is the summary page
Given Check is it is summary page or not
Then  click the proceed to checkout button

Scenario: Verify the authentication page
    Given check if it is in authentication page 
    When user enter the "arulselvi@gmail.com" in the email field
    And user enter the "arul123" in the password field
    Then Click on the signin button

Scenario: Verify if the product is in the address page 
    Given check if the billing address is right
    When click on proceed to check out button
   
Scenario: Verify if the product is in shipping page
    Given verify if the product is in shipping page
    When click on the checkbox 
    Then click on the submit button to proceed  
    
Scenario: Verify if the product is in payment page
    Given check if the use is in payment page
    When check the total price of the item 
    Then click pay by bank wire button
Scenario: Verify order summary page
        Given verify if the order summary page is displayed
        When verify if it displays bank - wire payment
        Then click on the confirm of order button
Scenario: Verify the user is in order confirmation page
    Given check if the user is in order confirmation page
    When Verify if the order is complete
    Then Check for the total price displayed.
Scenario: Verify if the user selects dresses
    Given check if the user selects dresses tab
    When check if the user clicks on Evening dresses
        
    