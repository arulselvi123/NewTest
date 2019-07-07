package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shippingpage {

public WebDriver driver;
	
	public Shippingpage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h1[text()='Shipping']")
	private WebElement checkshippingpage;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckshippingpage() {
		return checkshippingpage;
	}

	public WebElement getClickcheckbox() {
		return clickcheckbox;
	}

	public WebElement getChicksubmitbtn() {
		return chicksubmitbtn;
	}
	@FindBy(xpath = "//div[contains(@class,'checker')]")
	private WebElement clickcheckbox;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement chicksubmitbtn;
}
