package com.sauce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Overview {

	public static WebDriver driver;

	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement product;

	@FindBy(id = "finish")
	private WebElement finish_Btn;
	
	public WebElement getFinish_Btn() {
		return finish_Btn;
	}

	public void setFinish_Btn(WebElement finish_Btn) {
		this.finish_Btn = finish_Btn;
	}

	public WebElement getProduct() {
		return product;
	}

	public void setProduct(WebElement product) {
		this.product = product;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Checkout_Overview.driver = driver;
	}

	public Checkout_Overview(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

}
