package com.baseclass.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	static WebDriver driver;

	public static WebDriver browserLaunch_BC(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "//Driver//chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "//Driver//geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "//Driver//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("The browsername entered by you is " + browserName
						+ ". But, the available browsers are chrome,ie and firefox");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.manage().window().maximize();

		return driver;
	}

	public static void close_BC() {
		driver.close();
	}

	public static void get_BC(String get_url) {
		driver.get(get_url);
	}

	public static void getCurrentURL_BC() {
		driver.getCurrentUrl();
	}

	public static void sendKeys_BC(WebElement element, String message) {
		element.clear();
		element.sendKeys(message);
	}

	public static boolean isDisplayed_BC(WebElement element) {
		boolean result = element.isDisplayed();
		return result;
	}

	public static String getCurrentUrl_BC() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String getText_BC(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static void click_BC(WebElement element) {
		element.click();
	}
}
