package com.cucumber.stepdefinition;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;
import com.cucumber.runner.TestRunner;
import com.helper.FileReaderManager;
import com.helper.PageObjectManager;
import com.pom.Addresspage;
import com.pom.Authenticationpage;
import com.pom.Checkoutpage;
import com.pom.Dressespage;
import com.pom.Homepage;
import com.pom.Loginpage;
import com.pom.OrderConfirmationpage;
import com.pom.OrderSummarypage;
import com.pom.Paymentpage;
import com.pom.Selectionpage;
import com.pom.Shippingpage;
import com.pom.Summarypage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseclass {

	public static WebDriver driver = TestRunner.driver;
	public static PageObjectManager pm = new PageObjectManager(driver);

	@Given("^User Launch the automation practice$")
	public void user_Launch_the_automation_practice() throws Throwable {
		//getUrl("http://automationpractice.com/index.php");
		String url = FileReaderManager.getInstance().getCr().getUrl();
		getUrl(url);

	}

	@When("^user click on the signin button in the header$")
	public void user_click_on_the_signin_button_in_the_header() throws Throwable {
		clickUsingActions(pm.getHp().getSigninbtn());
	}

	@When("^user enter the email address$")
	public void user_enter_the_email_address() throws Throwable {
		inputValuestoElement(pm.getLp().getEmailid(), "arulselvi@gmail.com");
	}

	@When("^user enter the password$")
	public void user_enter_the_password() throws Throwable {
		Loginpage lp = new Loginpage(driver);
		inputValuestoElement(lp.getPassword(), "arul123");
	}

	@When("^user enter the \"([^\"]*)\" in the email feild$")
	public void user_enter_the_in_the_email_feild(String arg1) throws Throwable {
		Loginpage lp = new Loginpage(driver);
		inputValuestoElement(lp.getEmailid(), arg1);
	}

	@When("^user enter the \"([^\"]*)\" in the password feild$")
	public void user_enter_the_in_the_password_feild(String arg1) throws Throwable {
		Loginpage lp = new Loginpage(driver);
		inputValuestoElement(lp.getPassword(), arg1);
	}

	@Given("^select the type of dress$")
	public void select_the_type_of_dress() throws Throwable {
		Loginpage lp = new Loginpage(driver);
		clickUsingActions(lp.getWomenbtn());

	}

	@Given("^User mouseover to the summerdress$")
	public void user_mouseover_to_the_summerdress() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Selectionpage sp = new Selectionpage(driver);
		mouseHoverUsingActions(sp.getSelectdress());

	}

	@Given("^check the selected page is right$")
	public void check_the_selected_page_is_right() throws Throwable {
		Selectionpage sp = new Selectionpage(driver);
		toelementHighlight(sp.getCheckcasualdress());
		Assert.assertEquals("Faded Short Sleeve T-shirts", getTextofTheElement(sp.getCheckcasualdress()));

	}

	@Then("^check if the item is added to the cart$")
	public void check_if_the_item_is_added_to_the_cart() throws Throwable {
		Selectionpage sp = new Selectionpage(driver);
		clickUsingActions(sp.getAddtocartbtn());
	}

	@When("^user click to proceed to checkout$")
	public void user_click_to_proceed_to_checkout() throws Throwable {
		Checkoutpage cp = new Checkoutpage(driver);

	}

	@Then("^verify the product is added to cart$")
	public void verify_the_product_is_added_to_cart() throws Throwable {
		Checkoutpage cp = new Checkoutpage(driver);
		clickUsingActions(cp.getProccedtocheckout());

	}

	@When("^user click on the signing button$")
	public void user_click_on_the_signing_button() throws Throwable {
		Loginpage lp = new Loginpage(driver);
		clickUsingActions(lp.getSigninbutn());
	}

	@Given("^Check is it is summary page or not$")
	public void check_is_it_is_summary_page_or_not() throws Throwable {
		Summarypage sum = new Summarypage(driver);
		Assert.assertEquals("Your shopping cart", getTextofTheElement(sum.getChecksummarypage()));
	}

	@Then("^click the proceed to checkout button$")
	public void click_the_proceed_to_checkout_button() throws Throwable {
		Summarypage sum = new Summarypage(driver);
		clickUsingActions(sum.getProceedtocheckoutdress());
	}

	@Given("^check if it is in authentication page$")
	public void check_if_it_is_in_authentication_page() throws Throwable {
		Authenticationpage ap = new Authenticationpage(driver);
		Assert.assertEquals("AUTHENTICATION", getTextofTheElement(ap.getAuthenticationpage()));

	}

	@When("^user enter the \"([^\"]*)\" in the email field$")
	public void user_enter_the_in_the_email_field(String arg1) throws Throwable {
		Authenticationpage ap = new Authenticationpage(driver);
		inputValuestoElement(ap.getEmailid(), arg1);
	}

	@When("^user enter the \"([^\"]*)\" in the password field$")
	public void user_enter_the_in_the_password_field(String arg1) throws Throwable {
		Authenticationpage ap = new Authenticationpage(driver);
		inputValuestoElement(ap.getPassword(), arg1);
	}

	@Then("^Click on the signin button$")
	public void click_on_the_signin_button() throws Throwable {
		Authenticationpage ap = new Authenticationpage(driver);
		clickUsingActions(ap.getSignin());
	}

	@Given("^check if the billing address is right$")
	public void check_if_the_billing_address_is_right() throws Throwable {

		Addresspage ap1 = new Addresspage(driver);
		Assert.assertEquals("YOUR BILLING ADDRESS", getTextofTheElement(ap1.getCheckBillingAddress()));

	}

	@When("^click on proceed to check out button$")
	public void click_on_proceed_to_check_out_button() throws Throwable {
		Addresspage ap1 = new Addresspage(driver);
		clickUsingActions(ap1.getClickproceedbtn());
	}

	@Given("^verify if the product is in shipping page$")
	public void verify_if_the_product_is_in_shipping_page() throws Throwable {
		Shippingpage shp = new Shippingpage(driver);
		Assert.assertEquals("SHIPPING", getTextofTheElement(shp.getCheckshippingpage()));
	}

	@When("^click on the checkbox$")
	public void click_on_the_checkbox() throws Throwable {
		Shippingpage shp = new Shippingpage(driver);
		clickOnElement(shp.getClickcheckbox());
	}

	@Then("^click on the submit button to proceed$")
	public void click_on_the_submit_button_to_proceed() throws Throwable {
		Shippingpage shp = new Shippingpage(driver);
		clickUsingActions(shp.getChicksubmitbtn());
	}

	@Given("^check if the use is in payment page$")
	public void check_if_the_use_is_in_payment_page() throws Throwable {
		Paymentpage pp = new Paymentpage(driver);
		Assert.assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD", getTextofTheElement(pp.getCheckpaymentpage()));

	}

	@When("^check the total price of the item$")
	public void check_the_total_price_of_the_item() throws Throwable {
		Paymentpage pp = new Paymentpage(driver);
		Assert.assertEquals("$18.51", getTextofTheElement(pp.getChecktotalprice()));

	}

	@Then("^click pay by bank wire button$")
	public void click_pay_by_bank_wire_button() throws Throwable {
		Paymentpage pp = new Paymentpage(driver);
		clickUsingActions(pp.getClickpaybybankwire());
	}

	@Given("^verify if the order summary page is displayed$")
	public void verify_if_the_order_summary_page_is_displayed() throws Throwable {
		OrderSummarypage op = new OrderSummarypage(driver);
		Assert.assertEquals("ORDER SUMMARY", getTextofTheElement(op.getCheckordersummaypage()));

	}

	@When("^verify if it displays bank - wire payment$")
	public void verify_if_it_displays_bank_wire_payment() throws Throwable {
		OrderSummarypage op = new OrderSummarypage(driver);
		Assert.assertEquals("BANK-WIRE PAYMENT.", getTextofTheElement(op.getCheckbankwirepayment()));

	}

	@Then("^click on the confirm of order button$")
	public void click_on_the_confirm_of_order_button() throws Throwable {
		OrderSummarypage op = new OrderSummarypage(driver);
		clickUsingActions(op.getClickConfirmOrder());
	}

	@Given("^check if the user is in order confirmation page$")
	public void check_if_the_user_is_in_order_confirmation_page() throws Throwable {
		OrderConfirmationpage ocp = new OrderConfirmationpage(driver);
		Assert.assertEquals("ORDER CONFIRMATION", getTextofTheElement(ocp.getCheckOrderConfirmationPage()));

	}

	@When("^Verify if the order is complete$")
	public void verify_if_the_order_is_complete() throws Throwable {
		OrderConfirmationpage ocp = new OrderConfirmationpage(driver);
		Assert.assertEquals("Your order on My Store is complete.", getTextofTheElement(ocp.getCheckOrderisComplete()));

	}

	@Then("^Check for the total price displayed\\.$")
	public void check_for_the_total_price_displayed() throws Throwable {
		OrderConfirmationpage ocp = new OrderConfirmationpage(driver);
		Assert.assertEquals("$18.51", getTextofTheElement(ocp.getCheckforPrice()));

	}

	@Given("^check if the user selects dresses tab$")
	public void check_if_the_user_selects_dresses_tab() throws Throwable {
		Dressespage dp = new Dressespage(driver);
		mouseHoverUsingActions(dp.getClickonDresses());
	}

	@When("^check if the user clicks on Evening dresses$")
	public void check_if_the_user_clicks_on_Evening_dresses() throws Throwable {
		Dressespage dp = new Dressespage(driver);
		clickUsingActions(dp.getChooseEveningDresses());
	}
}
