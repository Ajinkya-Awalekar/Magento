package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Products 
{
	   //*****************************Locators*****************************//
	
	private By pro1 = By.xpath("//img[@alt='Argus All-Weather Tank']");
	private By size = By.id("option-label-size-143-item-169");
	private By colour = By.id("option-label-color-93-item-52");
	private By quantity = By.id("qty");
	private By atc = By.id("product-addtocart-button");	
	
	private By pro2 = By.xpath("//img[@alt='Hero Hoodie']");
	private By size2 = By.id("option-label-size-143-item-168");
	private By colour2 = By.id("option-label-color-93-item-49");
	private By quantity2 = By.id("qty");
	private By atc2 = By.id("product-addtocart-button");
	
	private By view_cart_btn = By.xpath("//a[@class='action showcart']");
	private By cart_verify = By.id("minicart-content-wrapper");
	
	private By remove_pro = By.xpath("//span[text()='View and Edit Cart']");
	private By bin_logo1 = By.xpath("//*[@id=\"shopping-cart-table\"]/tbody[1]/tr[2]/td/div/a[2]");
	private By bin_logo2 = By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[2]");
	private By removed_item_txt = By.xpath("//p[text()='You have no items in your shopping cart.']");
	
	   //*****************************Methods*****************************//
	
	public void pro1_atc(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1900)", "");
		Thread.sleep(3000);
		
		driver.findElement(pro1).click();
		js.executeScript("window.scrollBy(0,400)", "");
		driver.findElement(size).click();
		driver.findElement(colour).click();
		driver.findElement(quantity).click();
		driver.findElement(atc).click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	public void pro2_atc(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(pro2).click();
		js.executeScript("window.scrollBy(0,400)", "");
		driver.findElement(size2).click();
		driver.findElement(colour2).click();
		driver.findElement(quantity2).click();
		driver.findElement(atc2).click();
		Thread.sleep(5000);	
	}
	public void View_cart(WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,0)", "");
		driver.findElement(view_cart_btn).click();
	}
	public void pro_added_cart_successfully(WebDriver driver) {
		WebElement cart_pro_verify = driver.findElement(cart_verify);
		Assert.assertTrue(cart_pro_verify.isDisplayed(), "Added product in cart page is not dispalyed");
	}
	
	public void Remove_pro_from_cart(WebDriver driver) throws InterruptedException {
		driver.findElement(remove_pro).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(bin_logo1).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)", "");
		driver.findElement(bin_logo2).click();
	}
	public void Verify_removed_item_txt_displayed(WebDriver driver) {
		WebElement remov_txt = driver.findElement(removed_item_txt);
		Assert.assertTrue(remov_txt.isDisplayed(), "Removed item msg is not visible");
	}
 }