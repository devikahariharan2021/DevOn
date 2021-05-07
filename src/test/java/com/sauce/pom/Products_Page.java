package com.sauce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products_Page {
	
	public static WebDriver driver;

	@FindBy(xpath = "//span[@class='title']")
	private WebElement categoryTitle;

	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement addToKart_Btn;
	
	@FindBy(id = "shopping_cart_container")
	private WebElement kart_Btn;
	
	public WebElement getKart_Btn() {
		return kart_Btn;
	}

	public void setKart_Btn(WebElement kart_Btn) {
		this.kart_Btn = kart_Btn;
	}

	public WebElement getAddToKart_Btn() {
		return addToKart_Btn;
	}

	public void setAddToKart_Btn(WebElement addToKart_Btn) {
		this.addToKart_Btn = addToKart_Btn;
	}

	public void setCategoryTitle(WebElement categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	public Products_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Products_Page.driver = driver;
	}
	
	public WebElement getCategoryTitle() {
		return categoryTitle;
	}
	
	public void setCategroryTitle(WebElement categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
}
