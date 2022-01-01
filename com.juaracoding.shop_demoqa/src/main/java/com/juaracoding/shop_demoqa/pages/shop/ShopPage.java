package com.juaracoding.shop_demoqa.pages.shop;

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

public class ShopPage {
	
	private WebDriver driver;
	
	public ShopPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1281.product.type-product.status-publish.has-post-thumbnail.product_cat-shoes.product_tag-shoes.product_tag-women.has-featured.instock.sale.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-slider.owl-carousel.owl-theme > div.owl-wrapper-outer.autoHeight > div > div.owl-item.active")
	private WebElement item1;
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1281.product.type-product.status-publish.has-post-thumbnail.product_cat-shoes.product_tag-shoes.product_tag-women.has-featured.instock.sale.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-meta > div.woocommerce.product.compare-button > a")
	private WebElement btncompare;
	
	@FindBy(xpath = "//a[@aria-label='Select options for “black pointed toe barely there patent heels”']")
	private WebElement btnselecttooption;
	
	public void addItem1() {
		Actions act = new Actions(driver);
		act.moveToElement(item1).perform();
		btncompare.click();
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(btnselecttooption));
		btnselecttooption.click();
	}
	
	@FindBy(css = "#pa_color")
	private WebElement btncolour;
	
	@FindBy(css = "#pa_size")
	 private WebElement btnsize;
	
	@FindBy(css= "#product-1281 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
	private WebElement btnadd1;
	
	public void Item1() {
		lstColour(2);
		lstSize(2);
		btnadd1.click();
	}
	
	public void lstColour (int selection) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(btncolour));
		
		btncolour.click();
		
		
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void lstSize (int selection) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(btncolour));
		
		btnsize.click();
		
		
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	@FindBy(css = "#noo-site > header > div.navbar-wrapper > div > div > div > a")
	private WebElement btnsearch;
	
	@FindBy(css = "#noo-site > header > div.search-header.search-header-eff > div.noo-container > form > input.form-control")
	private WebElement inputsearchitem;
	
	public void SearchItem(String item) {
		btnsearch.click();
		inputsearchitem.sendKeys(item);
		inputsearchitem.sendKeys(Keys.ENTER);
	}
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1342.product.type-product.status-publish.has-post-thumbnail.product_cat-sun-glasses.product_tag-sun-glasses.product_tag-women.has-featured.instock.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-slider.owl-carousel.owl-theme > div.owl-wrapper-outer.autoHeight > div > div.owl-item.active > a")
	private WebElement item2;
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1342.product.type-product.status-publish.has-post-thumbnail.product_cat-sun-glasses.product_tag-sun-glasses.product_tag-women.has-featured.instock.shipping-taxable.purchasable.product-type-variable > div > div.noo-loop-cart > a")
	private WebElement btntooptions;
	
	public void addItem2() {
		Actions act = new Actions(driver);
		act.moveToElement(item2).perform();
		btntooptions.click();
	}
	
	@FindBy(css= "#product-1342 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
	private WebElement btnadd2;
	
	public void Item2() {
		lstColour(2);
		lstSize(2);
		btnadd2.click();
	}
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap.noo-shop-single-fullwidth > div > div > div.woocommerce-notices-wrapper > div")
	private WebElement textitem;
	
	public WebElement textItem() {
		return textitem;
	}
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap.noo-shop-single-fullwidth > div > div > div.woocommerce-notices-wrapper > div > a")
	private WebElement btntocart;
	
	public void toCart() {
		btntocart.click();
	}

}
