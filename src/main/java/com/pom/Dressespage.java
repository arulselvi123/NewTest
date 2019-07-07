package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dressespage {public WebDriver driver;

public Dressespage(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
}


	public WebDriver getDriver() {
	return driver;
}
public WebElement getClickonDresses() {
	return clickonDresses;
}
public WebElement getChooseEveningDresses() {
	return chooseEveningDresses;
}


	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement clickonDresses;
	@FindBy(xpath = "(//li//a[contains(@title,'Evening Dresses')])[2]")
	private WebElement chooseEveningDresses;
}
