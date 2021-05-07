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

	public static void quit_BC() {
		driver.quit();
	}

	public static void navigateTo_BC(String navigate_url) {
		driver.navigate().to(navigate_url);
	}

	public static void navigateBack_BC() {
		driver.navigate().back();
	}

	public static void navigateForward_BC() {
		driver.navigate().forward();
	}

	public static void navigateRefresh_BC() {
		driver.navigate().refresh();
	}

	public static void get_BC(String get_url) {
		driver.get(get_url);
	}
	
	public static void getCurrentURL_BC() {
		driver.getCurrentUrl();
	}

	public static void alert_BC(String alert_Type, String alert_Message) {
		Alert alerts = driver.switchTo().alert();
		if (alert_Type.equalsIgnoreCase("simplealert")) {
			alerts.accept();
		} else if (alert_Type.equalsIgnoreCase("confirmalert")) {
			alerts.dismiss();
		} else if (alert_Type.equalsIgnoreCase("promptalert")) {
			alerts.sendKeys(alert_Message);
			alerts.accept();
		}

	}

	public static void actions_BC(String actionName, WebElement sourceElement, WebElement targetElement) {

		Actions act = new Actions(driver);

		if (actionName.equalsIgnoreCase("click")) {
			act.click(sourceElement).build().perform();
		} else if (actionName.equalsIgnoreCase("clickandhold")) {
			act.clickAndHold(sourceElement).build().perform();
		} else if (actionName.equalsIgnoreCase("contextclick")) {
			act.contextClick(sourceElement).build().perform();
		} else if (actionName.equalsIgnoreCase("doubleclick")) {
			act.doubleClick(sourceElement).build().perform();
		} else if (actionName.equalsIgnoreCase("draganddrop")) {
			act.dragAndDrop(sourceElement, targetElement).build().perform();
		} else if (actionName.equalsIgnoreCase("movetoelement")) {
			act.moveToElement(sourceElement).build().perform();
		} else {
			System.out.println("invalid action");
		}
	}

	public static void sendKeys_BC(WebElement element, String message) {
		element.clear();
		element.sendKeys(message);
	}

	public static void frames_BC(String iframeType, String parameterType, int index, String name, WebElement element) {
		if (iframeType.equalsIgnoreCase("singleiframe")) {
			if (parameterType.equalsIgnoreCase("index")) {
				driver.switchTo().frame(index);
			} else if (parameterType.equalsIgnoreCase("string")) {
				driver.switchTo().frame(name);
			} else if (parameterType.equalsIgnoreCase("webelement")) {
				driver.switchTo().frame(element);
			}
		} else if (iframeType.equalsIgnoreCase("multipleiframe")) {
			if (parameterType.equalsIgnoreCase("index")) {
				driver.switchTo().frame(index);
			} else if (parameterType.equalsIgnoreCase("string")) {
				driver.switchTo().frame(name);
			} else if (parameterType.equalsIgnoreCase("webelement")) {
				driver.switchTo().frame(element);
			}
		} else {
			System.out.println("you selected an invalid iframetype");
		}
	}

	public static void robot_BC() throws AWTException {
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void dropDownSingle_BC(WebElement element, String parameterType, int index, String value,
			String text) {
		Select s = new Select(element);
		if (parameterType.equalsIgnoreCase("index")) {
			s.selectByIndex(index);
		} else if (parameterType.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (parameterType.equalsIgnoreCase("visibletext")) {
			s.selectByValue(text);
		}
	}

	public static void dropDownMultiple_BC(WebElement element, List<String> input, String parameterType) {
		Select s = new Select(element);
		for (int i = 1; i <= input.size(); i++) {
			if (parameterType.equalsIgnoreCase("SelectByIndex")) {
				int index = Integer.parseInt(input.get(i));
				s.selectByIndex(index);
			} else if (parameterType.equalsIgnoreCase("SelectByValue")) {
				s.selectByValue(input.get(i));
			} else if (parameterType.equalsIgnoreCase("SelectByVisibleText")) {
				s.selectByValue(input.get(i));
			} else {
				System.out.println("Invalid parameter selection");
			}
		}
	}

	public static void checkBox_BC(WebElement element) {
		element.click();
	}

	public static boolean isDisplayed_BC(WebElement element) {
		boolean result = element.isDisplayed();
		return result;
	}

	public static boolean isEnable_BC(WebElement element) {
		boolean a = element.isEnabled();
		return a;
	}

	public static boolean isSelected_BC(WebElement element) {
		boolean result = element.isSelected();
		return result;
	}

	public static List<WebElement> getOptions_BC(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}

	// To get Attribute values
	public static String getAttributeValue_BC(WebElement element, String attributeName) {
		String attributeValue = element.getAttribute(attributeName);
		return attributeValue;
	}

	// To get AttributeInputvalues
	public static String getAttributeInputValue_BC(WebElement element) {
		String attributeValue = element.getAttribute("value");
		return attributeValue;
	}

	public static String getTitle_BC() {
		String title = driver.getTitle();
		return title;
	}

	public static String getCurrentUrl_BC() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String getText_BC(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static void takeScreenshot_BC(String filePath) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(filePath);
			FileUtils.copyFile(source, dest);
		} catch (WebDriverException e) {
			e.printStackTrace();
		}

	}

	public static void scrollUp_BC(WebElement elementName) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", elementName);
	}

	public static void scrollDown_BC(WebElement elementName) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", elementName);
	}

	public static WebElement getFirstSelectedOption_BC(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public static WebElement getAllSelectedOption_BC(WebElement element) {
		Select s = new Select(element);
		WebElement AllSelectedOption = s.getFirstSelectedOption();
		return AllSelectedOption;
	}

	public static boolean isMultiple_BC(WebElement element) {
		Select s = new Select(element);
		boolean result = s.isMultiple();
		return result;
	}

	public static void click_BC(WebElement element) {
		element.click();
	}

	// implicity wait
	public static void implicitWait_BC(int timeSeconds) {
		driver.manage().timeouts().implicitlyWait(timeSeconds, TimeUnit.SECONDS);
	}

	// Explicity wait
	public static void explicitWait_BC(WebElement element, int timeSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// Fluent wait
	public static void fluentWait_BC(int timeSeconds, int timeSeconds1) {
		try {
			@SuppressWarnings({ "deprecation", "unused" })
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeSeconds, TimeUnit.SECONDS).pollingEvery(timeSeconds1, TimeUnit.SECONDS)
					.ignoring(Exception.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//To handle all opened windows
	public static Set<String> windowHandles_BC() {
		Set<String> allWindows = driver.getWindowHandles();
		return allWindows;
	}
	
	//To handle parentwindow
		public static String windowHandle_BC() {
			String mainWindows = driver.getWindowHandle();
			return mainWindows;
		}
}
