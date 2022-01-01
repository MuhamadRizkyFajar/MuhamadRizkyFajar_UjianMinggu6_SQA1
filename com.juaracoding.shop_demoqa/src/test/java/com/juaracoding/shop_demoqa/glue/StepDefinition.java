package com.juaracoding.shop_demoqa.glue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


import com.juaracoding.shop_demoqa.config.AutomationFrameworkConfiguration;
import com.juaracoding.shop_demoqa.driver.DriverSingleton;
import com.juaracoding.shop_demoqa.pages.HomePage;
import com.juaracoding.shop_demoqa.pages.cart.CartPage;
import com.juaracoding.shop_demoqa.pages.login.LoginPageWP;
import com.juaracoding.shop_demoqa.pages.myaccount.MyAccountPage;
import com.juaracoding.shop_demoqa.pages.shop.ShopPage;
import com.juaracoding.shop_demoqa.utils.ConfigurationProperties;
import com.juaracoding.shop_demoqa.utils.Constants;
import com.juaracoding.shop_demoqa.utils.TestCase;
import com.juaracoding.shop_demoqa.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {
	private WebDriver driver;
	private HomePage homepage;
	private MyAccountPage myaccountpage;
	private LoginPageWP loginpagewp;
	private CartPage cartpage;
	private ShopPage shoppage;
	ExtentTest test;
	static ExtentReports report = new ExtentReports("src/main/resources/reporttest.html");
	
	@Autowired
	ConfigurationProperties configuration;
	
	@Before
	public void initializeObject() {
		DriverSingleton.getInstance(configuration.getBrowser());
		homepage = new HomePage();
		myaccountpage = new MyAccountPage();
		loginpagewp = new LoginPageWP();
		cartpage = new CartPage();
		shoppage = new ShopPage();
		TestCase[] tests = TestCase.values();
		test = report.startTest(tests[Utils.testcount].getTestname());
		Utils.testcount++;
	}
	
	@Given("^user go to th website")
	public void toWebsite() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		test.log(LogStatus.PASS, "Navigation to : "+Constants.URL);
	}
	
	@When("^user create account with input new username email and password")
	public void isCreateAccount() {
		homepage.toMyaccount();
		myaccountpage.creatingAccount(configuration.getUsername(), configuration.getEmail(), 
				configuration.getPassword());
		test.log(LogStatus.PASS, "user create account with input new username email and password");
	}
	
	@When("^user must login wordpress")
	public void loginWp() {
		loginpagewp.loginWordPress(configuration.getUsername(), configuration.getPassword());
		test.log(LogStatus.PASS, "user must login wordpress");
	}
	
	@Then("^user finnish create account")
	public void AccountCreated() {
		if (driver.getCurrentUrl().equalsIgnoreCase(
				"https://shop.demoqa.com/my-account/")) {
			System.out.println("scenario passed");
			test.log(LogStatus.PASS, "user finnish create account");
		}else {
			System.out.println("scenario failed");
			test.log(LogStatus.ERROR, "user finnish create account");
		}
	}
	
	@When("^user login account")
	public void isLogin() {
		myaccountpage.Logout();
		myaccountpage.Login(configuration.getUsername(), configuration.getPassword());
		test.log(LogStatus.PASS, "user login account");
	}
	
	@Then("^user has logged into the website")
	public void loggedInto() {
		if (myaccountpage.textDisplayed().isDisplayed()) {
			System.out.println("scenario passed");
			System.out.println(myaccountpage.textDisplayed().getText());
			test.log(LogStatus.PASS, "user has logged into the website");
		}else {
			System.out.println("scenario failed");
			test.log(LogStatus.ERROR, "user has logged into the website");
		}
	}
	
	@When("^user go to shop")
	public void intoShop() {
		myaccountpage.toCart();
		cartpage.toShop();
		test.log(LogStatus.PASS, "user go to shop");
	}
	
	@When("^user add first item from compare product")
	public void isAddItem1() {
		shoppage.addItem1();
		shoppage.Item1();
		test.log(LogStatus.PASS, "user add first item from compare product");
	}
	
	@When("^user add second item from search product")
	public void isAddItem2() {
		shoppage.SearchItem(configuration.getItemsearch());
		shoppage.addItem2();
		shoppage.Item2();
		test.log(LogStatus.PASS, "user add second item from search product");
	}
	
	@Then("^user has added item to cart")
	public void newCart() {
		if (shoppage.textItem().isDisplayed()) {
			System.out.println("scenario passed");
			System.out.println(shoppage.textItem().getText());
			test.log(LogStatus.PASS, "user has added item to cart");
		}else {
			System.out.println("scenario failed");
			test.log(LogStatus.ERROR, "user has added item to cart");
		}
	}
	
	@After
	public void closeObject(Scenario scenario) {
		report.endTest(test);
		report.flush();
//		DriverSingleton.closeObjectInstance();
	}
}
