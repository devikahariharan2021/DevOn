package com.runner.org;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.org.BaseClass;
import com.helper.org.FileRead_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//sauce//featurefile", glue = "com.sauce.stepdefinition",
monochrome = true, 
strict = true, 
plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extentreport.html", 
		"html:Report/htmlreport.html",
		"pretty", 
		"json:Reports/jsonReport.json" 
		})

public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() throws Throwable {
		String browser = FileRead_Manager.getInstance().getInstanceCR().getBrowser();
		driver = BaseClass.browserLaunch_BC(browser);
	}

	@AfterClass
	public static void tear_Down() {
		BaseClass.close_BC();
	}

}
