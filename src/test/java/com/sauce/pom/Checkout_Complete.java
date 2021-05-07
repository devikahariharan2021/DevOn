package com.sauce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Complete {

	public static WebDriver driver;

	@FindBy(xpath = "//h2[text()='THANK YOU FOR YOUR ORDER']")
	private WebElement order_Confirmation;

	public WebElement getOrder_Confirmation() {
		return order_Confirmation;
	}

	public void setOrder_Confirmation(WebElement order_Confirmation) {
		this.order_Confirmation = order_Confirmation;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Checkout_Complete.driver = driver;
	}

	public Checkout_Complete(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

}
