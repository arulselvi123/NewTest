package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationpage {
public WebDriver driver;
	
	public OrderConfirmationpage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[text()='Order confirmation']")
	private WebElement checkOrderConfirmationPage;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCheckOrderConfirmationPage() {
		return checkOrderConfirmationPage;
	}
	public WebElement getCheckOrderisComplete() {
		return checkOrderisComplete;
	}
	public WebElement getCheckforPrice() {
		return checkforPrice;
	}

	@FindBy(xpath = "//strong[text()='Your order on My Store is complete.']")
	private WebElement checkOrderisComplete;
	@FindBy(xpath = "//span[@class='price']")
	private WebElement checkforPrice;
}
