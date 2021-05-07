package com.sauce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Information {

	public static WebDriver driver;

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(WebElement postalCode) {
		this.postalCode = postalCode;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

	public void setContinue_Btn(WebElement continue_Btn) {
		this.continue_Btn = continue_Btn;
	}

	@FindBy(id = "first-name")
	private WebElement firstName;

	@FindBy(id = "last-name")
	private WebElement lastName;
	
	@FindBy(id = "postal-code")
	private WebElement postalCode;
	
	@FindBy(id = "continue")
	private WebElement continue_Btn;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Checkout_Information.driver = driver;
	}

	public Checkout_Information(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

}
