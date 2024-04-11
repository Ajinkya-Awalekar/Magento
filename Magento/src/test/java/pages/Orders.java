package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Orders 
{
	    //*****************************Locators*****************************//
	
	private By dropdown = By.xpath("//button[@class='action switch']");
	private By myacc_btn = By.linkText("My Account");
	
	private By myorder  = By.xpath("//ul[@class='nav items']//child::li[2]");
    private By ordr_histry = By.xpath("//div[@class='table-wrapper orders-history']");
    private By order_page = By.xpath("//span[text()='View Order']");
    
    private By reorder_pro = By.xpath("//span[text()='Reorder']");
    private By checkout_btn = By.xpath("//li[@class='item']//child::button[1]");
    private By select_add = By.xpath("//button[@class='action action-select-shipping-item']//child::span[1]");
    private By nxt_btn = By.xpath("//span[text()='Next']");
    
    private By add_checkbox = By.xpath("//div[@class='billing-address-same-as-shipping-block field choice']");
    private By place_order = By.xpath("//span[text()='Place Order']");   
    private By success_msg = By.xpath("//span[text()='Thank you for your purchase!']");  
    
       //*****************************Methods*****************************//
    
    public void Check_order(WebDriver driver) {
    	driver.findElement(dropdown).click();
		driver.findElement(myacc_btn).click();
		driver.findElement(myorder).click();
	}
    public void Order_history(WebDriver driver) {
    	WebElement ordr = driver.findElement(ordr_histry);
    	Assert.assertTrue(ordr.isDisplayed(), "Order history is not displayed");
    }
    public void Veify_order_page_displayed(WebDriver driver) {
    	WebElement order = driver.findElement(order_page);
    	Assert.assertTrue(order.isDisplayed(), "Order page is not displayed");
    	driver.findElement(order_page).click();
    }
    public void View_Order_details(WebDriver driver) {
    	String order_id = driver.getTitle();
    	System.out.println(order_id);
    } 
    
    public void Reorder_pro_with_different_add(WebDriver driver) {
    	driver.findElement(reorder_pro).click();
    	JavascriptExecutor jss = (JavascriptExecutor)driver;
    	jss.executeScript("window.scrollBy(0,300)", "");
    	driver.findElement(checkout_btn).click();
    	jss.executeScript("window.scrollBy(0,300)", "");
    	driver.findElement(select_add).click();
    	driver.findElement(nxt_btn).click();
    	driver.findElement(add_checkbox).click();
    	driver.findElement(place_order).click();
    }
    public void verify_purchase_success_msg(WebDriver driver) {
   	 WebElement success_txt = driver.findElement(success_msg);
   	 Assert.assertTrue(success_txt.isDisplayed(), "Order success msg is not displayed");
    }  
 } 