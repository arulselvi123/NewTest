package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.Homepage;
import com.pom.Loginpage;

public class PageObjectManager {
	public WebDriver driver;
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	public Loginpage lp;
	
	public Loginpage getLp() {
		if (lp==null) {
			lp = new Loginpage(driver);
		}
		return lp;
	}

	public Homepage hp;
	
	public Homepage getHp() {
		if (hp==null) {
			hp = new Homepage(driver);
					
		}
		return hp;
	}
}
