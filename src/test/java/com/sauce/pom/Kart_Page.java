package com.sauce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kart_Page {

	public static WebDriver driver;

	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement kartProduct;

	@FindBy(id = "checkout")
	private WebElement checkout_Btn;
	
	@FindBy(xpath = "//div[@class='cart_item']")
	private WebElement cart_Item;
	
	public WebElement getCart_Item() {
		return cart_Item;
	}

	public void setCart_Item(WebElement cart_Item) {
		this.cart_Item = cart_Item;
	}

	public WebElement getCheckout_Btn() {
		return checkout_Btn;
	}

	public void setCheckout_Btn(WebElement checkout_Btn) {
		this.checkout_Btn = checkout_Btn;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Kart_Page.driver = driver;
	}

	public WebElement getKartProduct() {
		return kartProduct;
	}

	public void setKartProduct(WebElement kartProduct) {
		this.kartProduct = kartProduct;
	}

	public Kart_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

}
