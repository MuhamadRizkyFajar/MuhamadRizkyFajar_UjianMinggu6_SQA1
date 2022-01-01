package com.juaracoding.shop_demoqa.driver.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox implements DriverStrategy {

	public WebDriver setStrategy() {
		System.setProperty("webdriver.chrome.driver", "D:/DriverFirefox/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
