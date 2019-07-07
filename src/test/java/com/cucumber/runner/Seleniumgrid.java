package com.cucumber.runner;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Seleniumgrid {

	
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		chrome.setPlatform(Platform.WIN10);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.43.143:4444/wd/hub"), chrome);
		driver.get("http://www.google.com");
	}
}
