package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentpage {
public WebDriver driver;
	
	public Paymentpage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCheckpaymentpage() {
		return checkpaymentpage;
	}
	public WebElement getChecktotalprice() {
		return checktotalprice;
	}
	public WebElement getClickpaybybankwire() {
		return clickpaybybankwire;
	}

	@FindBy(xpath = "//h1[text()='Please choose your payment method']")
	private WebElement checkpaymentpage;
	@FindBy(id = "total_price")
	private WebElement checktotalprice;
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	private WebElement clickpaybybankwire;
	
	

}
