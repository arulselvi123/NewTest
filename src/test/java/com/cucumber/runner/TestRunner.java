package com.cucumber.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;
import com.cucumber.listener.Reporter;
import com.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
/*
 * @CucumberOptions(features = "src\\test\\java\\com\\cucumber\\feature\\", glue
 * = "com.cucumber.stepdefinition", tags = {"@smoke", "~@ignore"},
 * dryRun=false,strict=true, monochrome=true)
 */
@CucumberOptions(plugin= {"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\selenium\\reports\\extentreport.html",
		"pretty",
		"html:src\\test\\resource\\com\\selenium\\reports\\",
		"json:src\\test\\resource\\com\\selenium\\reports\\report.json",
		"junit:src\\test\\resource\\com\\selenium\\reports\\report.xml"
},
	features = "src\\test\\java\\com\\cucumber\\feature\\",tags = {"@smoke"},
	glue ="com.cucumber.stepdefinition", dryRun = false, strict = true, monochrome = true)
public class TestRunner {

	public static WebDriver driver;
	/*
	 * @BeforeClass public static void setup() throws Throwable { String browser =
	 * FileReaderManager.getInstance().getCr().getBrowser(); driver =
	 * Baseclass.getBrowser(browser); }
	 * 
	 * @AfterClass public static void testdone() { driver.quit(); }
	 */
	@BeforeClass
	public static void setup() throws Exception {
		driver = Baseclass.getBrowser("gridchrome");
		
	}
	@AfterClass
	public static void tearDown() {
		driver.quit();
		Reporter.loadXMLConfig(new File("C:\\Users\\arul\\eclipse-workspace\\CucumberSelenium\\src\\test\\resource\\com\\resource\\extent-config.xml"));
	}
	
	
	
	
	
	
	
	
	
}
