package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Checkout_page
{
	      //*****************************Locators*****************************//
	
      private By checkout_btn = By.id("top-cart-btn-checkout");
      private By enter_email = By.xpath("//div[@class='control _with-tooltip']//child::input[1]");
      private By fname = By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input");
      private By lname = By.xpath("//input[@name='lastname']");
      private By company = By.xpath("//input[@name='company']");
      private By sadd1 = By.xpath("//input[@name='street[0]']");
      private By sadd2 = By.xpath("//input[@name='street[1]']");
      private By sadd3 = By.xpath("//input[@name='street[2]']");
      private By city =  By.xpath("//input[@name='city']");
      private By state = By.xpath("//select[@name='region_id']");
      private By zipcode = By.xpath("//input[@name='postcode']");
      private By country = By.xpath("//select[@name='country_id']");
      private By phn_number = By.xpath("//input[@name='telephone']");
      private By shipping_method = By.xpath("//input[@type='radio']");  
      private By nxt_btn = By.xpath("//span[text()='Next']");
      
      private By add_checkbox = By.xpath("//input[@type='checkbox']");
      private By place_order = By.xpath("//span[text()='Place Order']");   
      private By success_msg = By.xpath("//span[text()='Thank you for your purchase!']");   
      private By continue_btn = By.xpath("//span[text()='Continue Shopping']");
      
      private By signin = By.xpath("//*[@id=\"checkout\"]/div[1]/button");
  	  private By email = By.id("login-email");
  	  private By pass = By.id("login-password");
  	  private By signup = By.xpath("//button[@class='action action-login secondary']//child::span[1]");
  	  
        	//*****************************Methods*****************************//
  	  
     public void Shipping_Address(WebDriver driver) throws InterruptedException 
     {
    	driver.findElement(checkout_btn).click();
    	driver.findElement(enter_email).sendKeys("ajinkyaawalekar1@gmail.com");
    	driver.findElement(fname).sendKeys("ajinkya");
    	driver.findElement(lname).sendKeys("awalekar");
    	driver.findElement(company).sendKeys("TCS");	
    	driver.findElement(sadd1).sendKeys("flat no A-8,Sunflower society");
    	driver.findElement(sadd2).sendKeys("Pune-banglore highway");
    	driver.findElement(sadd3).sendKeys("Near VTP township");
    	driver.findElement(city).sendKeys("Pune");
    	driver.findElement(country).sendKeys("India");
    	Thread.sleep(3000);
    	driver.findElement(state).sendKeys("Maharashtra");
    	driver.findElement(zipcode).sendKeys("425631"); 	
    	driver.findElement(phn_number).sendKeys("9146612776");
    	driver.findElement(shipping_method).click();
    	driver.findElement(nxt_btn).click();
     }
     public void Review_Payments(WebDriver driver) {
		 driver.findElement(add_checkbox).click();
		 driver.findElement(place_order).click();
     }
     public void verify_purchase_success_msg(WebDriver driver) {
    	 WebElement success_txt = driver.findElement(success_msg);
    	 Assert.assertTrue(success_txt.isDisplayed(), "Order success msg is not displayed");
    	 driver.findElement(continue_btn).click();
     }
     public void signin(WebDriver driver) {
    	driver.findElement(checkout_btn).click();
    	driver.findElement(signin).click();
 		driver.findElement(email).sendKeys("aju1@gmail.com");
 		driver.findElement(pass).sendKeys("Aju@12345");
 		driver.findElement(signup).click();
 		driver.findElement(nxt_btn).click();
 		driver.findElement(place_order).click();
 	}
     public void placeOrder(WebDriver driver) {
  		driver.findElement(nxt_btn).click();
  		driver.findElement(place_order).click();
  	}
}