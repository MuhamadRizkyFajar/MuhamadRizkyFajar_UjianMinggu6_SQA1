package com.juaracoding.shop_demoqa.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.shop_demoqa.driver.DriverSingleton;

public class LoginPageWP {
	
	private WebDriver driver;
	
	public LoginPageWP () {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#user_login")
	private WebElement inputusername;
	
	@FindBy(css = "#user_pass")
	private WebElement inputpassword;
	
	@FindBy(css = "#wp-submit")
	private WebElement btnloginwp;
	
	public void loginWordPress(String username, String password) {
		inputusername.sendKeys(username);
		inputpassword.sendKeys(password);
		btnloginwp.click();
	}

}
