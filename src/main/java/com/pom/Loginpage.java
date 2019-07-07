package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;

	public Loginpage(WebDriver ldriver) {
		
		this.driver=ldriver;
		PageFactory.initElements(driver, this);}
		
		public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSigninbutn() {
		return signinbutn;
	}

		@FindBy(id = "email")
		private WebElement emailid;
		
		
		@FindBy(id="passwd")
		private WebElement password;
		
		@FindBy(xpath = "//button[@type='submit']")
		private WebElement signinbutn;
		
		
		@FindBy(xpath = "//a[@title='Women']")
		private WebElement womenbtn;
		
		public WebElement getWomenbtn() {
			return womenbtn;
		}

		public WebElement getSelectcasualdressdropdown() {
			return selectcasualdressdropdown;
		}

		@FindBy(xpath = "(//a[@title='Casual Dresses'])[1]")
		private WebElement selectcasualdressdropdown;
		
		
	}
	
	
	

