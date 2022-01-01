package com.juaracoding.shop_demoqa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.shop_demoqa.driver.DriverSingleton;

public class HomePage {
	
	private WebDriver driver;
	
	
	public HomePage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "body > p > a")
	private WebElement btnclosealert;
	
	@FindBy(css = "#noo-site > header > div.noo-topbar > div > ul.pull-right.noo-topbar-right > li")
	private List<WebElement> listmainmenu;
	
	public void toMyaccount() {
		btnclosealert.click();
		listmainmenu.get(1).click();
	}
}
