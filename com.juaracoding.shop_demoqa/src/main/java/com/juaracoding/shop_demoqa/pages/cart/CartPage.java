package com.juaracoding.shop_demoqa.pages.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.shop_demoqa.driver.DriverSingleton;

public class CartPage {
	
	private WebDriver driver;
	
	public CartPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#post-6 > div > div > p.return-to-shop > a")
	private WebElement btntoshop;
	
	public void toShop() {
		btntoshop.click();
	}
	
	@FindBy(css = "#post-6 > div > div > div.cart-collaterals > div.cart_totals > div > a")
	private WebElement btntocheckout;
	
	public void toCheckout() {
		btntocheckout.click();
	}
}
