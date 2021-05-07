package com.sauce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public static WebDriver driver;

	@FindBy(id = "user-name")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login-button")
	private WebElement login_Btn;
	
	@FindBy(xpath = "//h3[contains(text(),'locked out.')]")
	private WebElement error_Message;

	public Login_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Login_Page.driver = driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}

	public void setLogin_Btn(WebElement login_Btn) {
		this.login_Btn = login_Btn;
	}

	public WebElement getError_Msg() {
		return error_Message;
	}

	public void setError_Msg(WebElement errorMessage) {
		this.error_Message = error_Message;
	}

}
