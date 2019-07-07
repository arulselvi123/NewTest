package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public WebDriver driver;
	
	public Homepage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	
public WebDriver getDriver() {
		return driver;
	}

@FindBy(xpath = "//a[@class='login']")
private WebElement Signinbtn;

public WebElement getSigninbtn() {
	return Signinbtn;
}
@FindBy(xpath = "//a[@title='Women']")
private WebElement Womenbtn;

public WebElement getWomenbtn() {
	return Womenbtn;
}


public WebElement getCausaldress() {
	return causaldress;
}

@FindBy(xpath ="//a[@title='Casual Dresses']" )
private WebElement causaldress;



}