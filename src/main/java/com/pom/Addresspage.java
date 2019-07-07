package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresspage {

	public WebDriver driver;
	
	public  Addresspage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckBillingAddress() {
		return CheckBillingAddress;
	}

	public WebElement getClickproceedbtn() {
		return clickproceedbtn;
	}
	@FindBy(xpath = "//h3[text()='Your billing address']")
	private WebElement CheckBillingAddress;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
	private WebElement clickproceedbtn;
	
}
