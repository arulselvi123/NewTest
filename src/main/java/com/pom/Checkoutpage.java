package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {

public WebDriver driver;
	
	public Checkoutpage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "layer_cart_product_title")
	private WebElement dresscheckoutpage;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getDresscheckoutpage() {
		return dresscheckoutpage;
	}
	public WebElement getProccedtocheckout() {
		return proccedtocheckout;
	}

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proccedtocheckout;
	

}
