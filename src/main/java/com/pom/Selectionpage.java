package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectionpage {

public WebDriver driver;
	
	public Selectionpage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSelectdress() {
		return Selectdress;
	}
	public WebElement getAddtocartbtn() {
		return addtocartbtn;
	}
@FindBy(xpath = "(//img[contains(@class,'replace-2x img-responsive')])[2]")	
private WebElement Selectdress;
@FindBy(xpath = "(//div[contains(@class,'button-container')]//span)[4]")
private WebElement addtocartbtn;

@FindBy(xpath = "//span[text()='Faded Short Sleeve T-shirts']")
private WebElement checkcasualdress;

public WebElement getCheckcasualdress() {
	return checkcasualdress;
}

}
