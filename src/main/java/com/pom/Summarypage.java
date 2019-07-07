package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summarypage {
public WebDriver driver;
	
	public Summarypage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
public WebElement getChecksummarypage() {
		return checksummarypage;
	}

	public WebElement getProceedtocheckoutdress() {
		return proceedtocheckoutdress;
	}

@FindBy(xpath ="//span[text()='Your shopping cart']" )	
private WebElement checksummarypage;

@FindBy(xpath = "(//a[@title=\"Proceed to checkout\"])[2]")
private WebElement proceedtocheckoutdress;
}
