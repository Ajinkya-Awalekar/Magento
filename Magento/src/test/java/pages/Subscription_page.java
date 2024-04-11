package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Subscription_page 
{
	  //*****************************Locators*****************************//
	
  private By notes_btn = By.xpath("//div[@class='footer content']//child::ul[1]//child::li[1]//child::a[1]");
  private By subscribe_page_btn = By.linkText("//span[text()='Subscribe']");
  private By email_id = By.id("mce-EMAIL");
  private By first_name = By.id("mce-FNAME");
  private By last_name = By.id("mce-LNAME");
  private By company_name = By.id("mce-COMPANY");
  private By position_name = By.id("mce-POSITION");
  private By sub_bn = By.id("mc-embedded-subscribe");

  private By success_msg = By.id("mce-success-response");

      //*****************************Methods*****************************//
  
  public void subscription_page_process(WebDriver driver){
	
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,8500)", "");      
      driver.findElement(notes_btn).click();  
     
      driver.findElement(subscribe_page_btn).click();  
      js.executeScript("window.scrollBy(0,500)", "");
       
      driver.findElement(email_id).sendKeys("abc@gmail.com");
      driver.findElement(first_name).sendKeys("Aju");
      driver.findElement(last_name).sendKeys("Patil");
      driver.findElement(company_name).sendKeys("Infosys");
      driver.findElement(position_name).sendKeys("QA");
      driver.findElement(sub_bn).click();
	}
    public void Verify_success_msg_display(WebDriver driver) {
    	WebElement success_txt = driver.findElement(success_msg);
    	Assert.assertTrue(success_txt.isDisplayed(), "Successfully subscribed msg not displayed");
    }
 }
