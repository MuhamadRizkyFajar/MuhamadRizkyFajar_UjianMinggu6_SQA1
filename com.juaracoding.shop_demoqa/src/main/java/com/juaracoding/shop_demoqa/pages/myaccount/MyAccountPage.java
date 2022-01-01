package com.juaracoding.shop_demoqa.pages.myaccount;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.shop_demoqa.driver.DriverSingleton;

public class MyAccountPage {
	
	private WebDriver driver;
	
	public MyAccountPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#reg_username")
	private WebElement inputnewusername;
	
	@FindBy(css = "#reg_email")
	private WebElement inputnewemail;
	
	@FindBy(css = "#reg_password")
	private WebElement inputnewpassword;
	
	@FindBy(css= "#customer_login > div.u-column2.col-2 > form > p:nth-child(5) > button")
	private WebElement btnregister;
	
	public void creatingAccount(String username, String email, String password) {
		inputnewusername.sendKeys(username);
		inputnewemail.sendKeys(email);
		inputnewpassword.sendKeys(password);
		btnregister.click();
	}
	
	@FindBy(css = "#post-8 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--customer-logout > a")
	private WebElement btnlogout;
	
	public void Logout() {
		btnlogout.click();
	}
	
	@FindBy(css = "#username")
	private WebElement inputusername;
	
	@FindBy(css = "#password")
	private WebElement inputpassword;
	
	@FindBy(css = "#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")
	private WebElement btnlogin;
	
	public void Login(String username, String password) {
		inputusername.sendKeys(username);
		inputpassword.sendKeys(password);
		btnlogin.click();
	}
	
	@FindBy(css = "#post-8 > div > div > div > p:nth-child(2)")
	private WebElement textcontent;
	
	public WebElement textDisplayed() {
		return textcontent;
	}
	
	@FindBy(css = "#nav-menu-item-cart > a")
	private WebElement btntocart;
	
	public void toCart() {
		btntocart.click();
	}
	
}
