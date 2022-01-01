package com.juaracoding.shop_demoqa.pages.checkout;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.shop_demoqa.driver.DriverSingleton;

public class CheckoutPage {
	
	private WebDriver driver;
	
	public CheckoutPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#billing_first_name")
	private WebElement inputfirstname;
	
	@FindBy(css = "#billing_last_name")
	private WebElement inputlastname;
	
	@FindBy(css = "#select2-billing_country-container")
	private WebElement btninputcountry;
	
	@FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
	private WebElement inputcountry;
	
	@FindBy(css = "#billing_address_1")
	private WebElement inputaddress;
	
	@FindBy(css = "#billing_city")
	private WebElement inputcity;
	
	@FindBy(css = "#select2-billing_state-container")
	private WebElement btninputprovince;
	
	@FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
	private WebElement inputprovince;
	
	@FindBy(css = "#billing_postcode")
	private WebElement inputpostcode;
	
	@FindBy(css = "#billing_phone")
	private WebElement inputphone;
	
	@FindBy(css = "#terms")
	private WebElement btnagreement;
	
	@FindBy(css = "#place_order")
	private WebElement btnplaceorder;
	
	public void CheckOut(String firstname, String lastname, String country, 
			String address, String city, String province, String postcode, 
			String phone) {
		inputfirstname.sendKeys(firstname);
		inputlastname.sendKeys(lastname);
		btninputcountry.click();
		inputcountry.sendKeys(country);
		inputcountry.sendKeys(Keys.ENTER);
		inputaddress.sendKeys(address);
		inputcity.sendKeys(city);
		btninputprovince.click();
		inputprovince.sendKeys(province);
		inputprovince.sendKeys(Keys.ENTER);
		inputpostcode.sendKeys(postcode);
		inputphone.sendKeys(phone);
		btnagreement.click();
		btnplaceorder.click();
	}
	
	@FindBy(css = "#post-7 > div > div > div > ul > li.order")
	private WebElement textorder;
	
	public WebElement getTextOrder() {
		return textorder;
	}
	
}
