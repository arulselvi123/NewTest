package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) throws Exception {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resource\\com\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")
						+ "\\src\\test\\resource\\com\\selenium\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")
						+ "\\src\\test\\resource\\com\\selenium\\drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("gridchrome")) {
				DesiredCapabilities chrome = DesiredCapabilities.chrome();
				chrome.setPlatform(Platform.WIN10);
				driver = new RemoteWebDriver(new URL("http://192.168.43.143:4444/wd/hub"), chrome);
			} else {
				throw new Exception("Invalid browser Name");
			}
			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	public static void waitforElementVisiblity(WebElement element) {
		try {
			WebDriverWait wd = new WebDriverWait(driver, 70);
			wd.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static boolean elementDisplayed(WebElement element) {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static boolean elementEnabled(WebElement element) {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void inputValuestoElement(WebElement element, String value) {
		try {
			waitforElementVisiblity(element);
			if (elementDisplayed(element) && elementEnabled(element)) {
				element.sendKeys(value);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void clickOnElement(WebElement element) {
		try {
			waitforElementVisiblity(element);
			if (elementDisplayed(element)) {
				element.click();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void selectOptionFromDropDown(WebElement element, String value, String options) throws Exception {
		try {
			waitforElementVisiblity(element);
			Select sc = new Select(element);
			if (options.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
			} else if (options.equalsIgnoreCase("visibleText")) {
				sc.selectByVisibleText(value);
			} else if (options.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(value));
			} else {
				throw new Exception("Not a valid option");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}

	}

	public static void scrollbyUsingElements(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void scrollByCoordinates(int width, int height) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// js.executeScript("window.scrollBy(200,500)");
			js.executeScript("window.scrollBy(" + width + "," + height + ")");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void toelementHighlight(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;' );",
					element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void sendkeysUsingActions(WebElement element, String value) {
		try {
			Actions ac = new Actions(driver);
			ac.sendKeys(element, value).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void clickUsingActions(WebElement element) {
		try {
			waitforElementVisiblity(element);
			Actions ac = new Actions(driver);
			ac.click(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public static void mouseHoverUsingActions(WebElement element) {
		try {
			// waitforElementVisiblity(element);
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void dragAndDropusingActions(WebElement src, WebElement tar) {

		try {
			waitforElementVisiblity(src);
			Actions ac = new Actions(driver);
			ac.dragAndDrop(src, tar).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	public static void takeScreenShotonthePage(String fileName) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(System.getProperty("user.dir")
					+ "\\src\\test\\resource\\com\\selenium\\report\\screeshot\\" + fileName + ".png");
			FileUtils.copyFile(temp, des);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getTextofTheElement(WebElement element) {
		String getTextvalue = element.getText();
		System.out.println(getTextvalue);
		return getTextvalue;

	}

	public static String getAttributeValue(WebElement element) {
		String getTextvalue = element.getAttribute("value");
		// System.out.println(getTextvalue);
		return getTextvalue;

	}
}
