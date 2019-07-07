package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authenticationpage {

	public WebDriver driver;
	
	public Authenticationpage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h1[text()=\"Authentication\"]")
	private WebElement Authenticationpage;
	public WebElement getAuthenticationpage() {
		return Authenticationpage;
	}
	public void setAuthenticationpage(WebElement authenticationpage) {
		Authenticationpage = authenticationpage;
	}
	public WebElement getEmailid() {
		return emailid;
	}
	public void setEmailid(WebElement emailid) {
		this.emailid = emailid;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getSignin() {
		return signin;
	}
	public void setSignin(WebElement signin) {
		this.signin = signin;
	}
	@FindBy(id = "email")
	private WebElement emailid;
	@FindBy(id="passwd")
	private WebElement password;
	@FindBy(xpath = "//p[@class='submit']//span")
	private WebElement signin;
	
	
}
