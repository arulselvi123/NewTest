package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummarypage {
public WebDriver driver;
	
	public OrderSummarypage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div//h1[@class='page-heading']")
	private WebElement checkordersummaypage;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCheckordersummaypage() {
		return checkordersummaypage;
	}
	public WebElement getCheckbankwirepayment() {
		return checkbankwirepayment;
	}
	public WebElement getClickConfirmOrder() {
		return clickConfirmOrder;
	}

	@FindBy(xpath = "//div//h3[@class='page-subheading']")
	private WebElement checkbankwirepayment;
	@FindBy(xpath = "//span[text()='I confirm my order']")
	private WebElement clickConfirmOrder;

}
