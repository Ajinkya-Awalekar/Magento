package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Product_page
{
	       //*****************************Locators*****************************//
	
		private By pro = By.xpath("//img[@alt='Radiant Tee']");
		private By pro_name = By.xpath("//span[text()='Radiant Tee']");
		private By pro_price = By.id("product-price-1556");
		private By pro_size = By.id("option-label-size-143");
		private By pro_colr = By.id("option-label-color-93");
		private By pro_quantity = By.xpath("//span[text()='Qty']");
		
		private By size = By.id("option-label-size-143-item-168");
		private By colr = By.id("option-label-color-93-item-50");
		private By quantity = By.id("qty");
		private By atc = By.id("product-addtocart-button");
		
		private By view_cart_btn = By.xpath("//a[@class='action showcart']");
		private By cart_qty = By.xpath("//input[@data-item-qty='5']");
		
		    //*****************************Methods*****************************//
		
		public void prod_details(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1200)", "");  
	    	driver.findElement(pro).click(); 
	  	
	    	js.executeScript("window.scrollBy(0,350)", "");
	    	WebElement prod_name = driver.findElement(pro_name);
			Assert.assertTrue(prod_name.isDisplayed(), "Product name not displayed");			
			WebElement price = driver.findElement(pro_price);
			Assert.assertTrue(price.isDisplayed(), "Price not displayed");			
			WebElement size = driver.findElement(pro_size);
			Assert.assertTrue(size.isDisplayed(), "size not displayed");		
			WebElement colour = driver.findElement(pro_colr);
			Assert.assertTrue(colour.isDisplayed(), "colour is not displayed");			
			WebElement quantity = driver.findElement(pro_quantity);
			Assert.assertTrue(quantity.isDisplayed(), "quantity is not displayed");
			System.out.println("Product details mentioned completely");
		}	
		
		public void add_pro_qty(WebDriver driver) throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1200)", "");  
	    	driver.findElement(pro).click(); 
	    	js.executeScript("window.scrollBy(0,400)", "");
	    	driver.findElement(size).click();
	    	driver.findElement(colr).click();
	    	driver.findElement(quantity).clear();
	    	driver.findElement(quantity).sendKeys("5");
	    	driver.findElement(atc).click();
	    	Thread.sleep(3000);
	    	js.executeScript("window.scrollBy(0,0)", ""); 
		}
		public void View_cart(WebDriver driver){
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,0)", "");
			driver.findElement(view_cart_btn).click();
		}
		public void Verify_cart_quantity_(WebDriver driver) {
			WebElement cart_quantity = driver.findElement(cart_qty);
			Assert.assertTrue(cart_quantity.isDisplayed(), "Added product quantity is not exact dispalyed");
		}
  }
