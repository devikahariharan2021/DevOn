package com.helper.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sauce.pom.Checkout_Complete;
import com.sauce.pom.Checkout_Information;
import com.sauce.pom.Checkout_Overview;
import com.sauce.pom.Kart_Page;
import com.sauce.pom.Login_Page;
import com.sauce.pom.Products_Page;

public class PageObjectManager {
	public WebDriver driver;

	private Checkout_Complete checkoutComplete;
	private Checkout_Information checkoutInfo;
	private Checkout_Overview checkoutView;
	private Kart_Page kartPage;
	private Login_Page login;
	private Products_Page product;

	public Checkout_Complete getCheckoutComplete() {
		checkoutComplete = new Checkout_Complete(driver);
		return checkoutComplete;
	}

	public Checkout_Information getCheckoutInfo() {
		checkoutInfo = new Checkout_Information(driver);
		return checkoutInfo;
	}

	public Checkout_Overview getCheckoutView() {
		checkoutView = new Checkout_Overview(driver);
		return checkoutView;
	}

	public Kart_Page getKartPage() {
		kartPage = new Kart_Page(driver);
		return kartPage;
	}

	public Products_Page getProduct() {
		product = new Products_Page(driver);
		return product;
	}
	
	public Login_Page getLogin() {
		login = new Login_Page(driver);
		return login;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}
}
