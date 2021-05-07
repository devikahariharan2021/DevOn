package com.sauce.stepdefinition;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.org.BaseClass;
import com.helper.org.FileRead_Manager;
import com.helper.org.PageObjectManager;
import com.runner.org.Test_Runner;
import com.sauce.pom.Checkout_Complete;
import com.sauce.pom.Checkout_Information;
import com.sauce.pom.Checkout_Overview;
import com.sauce.pom.Kart_Page;
import com.sauce.pom.Login_Page;
import com.sauce.pom.Products_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = Test_Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user Login The Application$")
	public void user_Login_The_Application() throws Throwable {
		String url = FileRead_Manager.getInstance().getInstanceCR().getUrl();
		get_BC(url);
	}

	@When("^user Enter The Locked User Name \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_Locked_User_Name_In_Username_Field(String arg1) throws Throwable {
		sendKeys_BC(pom.getLogin().getUsername(), arg1);
	}

	@When("^user Enter The Password for Locked User \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_Password_for_Locked_User_In_Password_Field(String arg1) throws Throwable {
		sendKeys_BC(pom.getLogin().getPassword(), arg1);
	}

	@When("^user Click The Login Button for Locked User$")
	public void user_Click_The_Login_Button_for_Locked_User() throws Throwable {
		click_BC(pom.getLogin().getLogin_Btn());
	}

	@Then("^Verify The locked_out_user havent logged in successfully$")
	public void verify_The_locked_out_user_havent_logged_in_successfully() throws Throwable {
		String actualErrorMessage = getText_BC(pom.getLogin().getError_Msg());
		Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", actualErrorMessage);
	}

	@Given("^user Enter The Standard User Name \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_Standard_User_Name_In_Username_Field(String arg1) throws Throwable {
		sendKeys_BC(pom.getLogin().getUsername(), arg1);
	}

	@When("^user Enter The Password for Standard User \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_Password_for_Standard_User_In_Password_Field(String arg1) throws Throwable {
		sendKeys_BC(pom.getLogin().getPassword(), arg1);
	}

	@When("^user Click The Login Button for Standard User$")
	public void user_Click_The_Login_Button_for_Standard_User() throws Throwable {
		click_BC(pom.getLogin().getLogin_Btn());
	}

	@Then("^Verify The standard_user has logged in successfully$")
	public void verify_The_standard_user_has_logged_in_successfully() throws Throwable {
		String actualCategoryTitle = getText_BC(pom.getProduct().getCategoryTitle());
		Assert.assertEquals("PRODUCTS", actualCategoryTitle);
	}

	@Given("^user add the Fleece Jacket product to Kart by clicking Add To Kart button$")
	public void user_add_the_Fleece_Jacket_product_to_Kart_by_clicking_Add_To_Kart_button() throws Throwable {
		click_BC(pom.getProduct().getAddToKart_Btn());
	}

	@When("^user open the Kart by clicking the kart$")
	public void user_open_the_Kart_by_clicking_the_kart() throws Throwable {
		click_BC(pom.getProduct().getKart_Btn());
	}

	@Then("^Verify The presence of Fleece Jacket product in Kart$")
	public void verify_The_presence_of_Fleece_Jacket_product_in_Kart() throws Throwable {
		String actualProductName = getText_BC(pom.getKartPage().getKartProduct());
		Assert.assertEquals("Sauce Labs Fleece Jacket", actualProductName);
	}

	@Given("^user click the continue button to checout the product in kart$")
	public void user_click_the_continue_button_to_checout_the_product_in_kart() throws Throwable {
		click_BC(pom.getKartPage().getCheckout_Btn());
	}

	@When("^user Enter The Firstname \"([^\"]*)\" In Firstname Field$")
	public void user_Enter_The_Firstname_In_Firstname_Field(String arg1) throws Throwable {
		sendKeys_BC(pom.getCheckoutInfo().getFirstName(), arg1);
	}

	@When("^user Enter The Lastname \"([^\"]*)\" In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field(String arg1) throws Throwable {
		sendKeys_BC(pom.getCheckoutInfo().getLastName(), arg1);
	}

	@When("^user Enter The Postal code \"([^\"]*)\" In Postalcode Field$")
	public void user_Enter_The_Postal_code_In_Postalcode_Field(String arg1) throws Throwable {
		sendKeys_BC(pom.getCheckoutInfo().getPostalCode(), arg1);
	}

	@When("^user click on the continue button to checkout the product$")
	public void user_click_on_the_continue_button_to_checkout_the_product() throws Throwable {
		click_BC(pom.getCheckoutInfo().getContinue_Btn());
	}

	@Then("^Verify the presence of checkout product in Checkout Overview$")
	public void verify_the_presence_of_checkout_product_in_Checkout_Overview() throws Throwable {
		String actualProductName = getText_BC(pom.getCheckoutView().getProduct());
		Assert.assertEquals("Sauce Labs Fleece Jacket", actualProductName);
	}

	@Given("^user click on the Finish button to proceed the checkout$")
	public void user_click_on_the_Finish_button_to_proceed_the_checkout() throws Throwable {
		click_BC(pom.getCheckoutView().getFinish_Btn());
	}

	@Then("^Verify The order confirmation$")
	public void verify_The_order_confirmation() throws Throwable {
		String actualConfiramatonMsg = getText_BC(pom.getCheckoutComplete().getOrder_Confirmation());
		Assert.assertEquals("THANK YOU FOR YOUR ORDER", actualConfiramatonMsg);
	}

	@Then("^Verify The kart quantity$")
	public void verify_The_kart_quantity() throws Throwable {
		click_BC(pom.getProduct().getKart_Btn());
		boolean productPresence;
		try {
			productPresence = isDisplayed_BC(pom.getKartPage().getCart_Item());
		} catch (NoSuchElementException e) {
			productPresence = false;
		}
		Assert.assertEquals(false, productPresence);
	}
}