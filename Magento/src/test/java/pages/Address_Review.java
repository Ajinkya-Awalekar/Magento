package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class Address_Review 
{
          //*****************************Locators*****************************//
	
      private By hover_on_gear = By.xpath("//span[text()='Gear']");
      private By fitness_btn = By.xpath("//span[text()='Fitness Equipment']");
      private By select_equip = By.xpath("//img[@alt='Sprite Yoga Companion Kit']");
      private By add_revw = By.xpath("//a[@id='tab-label-reviews-title']");
     
      private By rating = By.xpath("//label[@class='rating-1']");        
      private By nick_name = By.id("nickname_field");
      private By summary_field = By.id("summary_field");
      private By review = By.id("review_field");
      private By submit = By.xpath("//span[text()='Submit Review']");
      private By vtxt = By.xpath("//div[text()='You submitted your review for moderation.']");
      
         //*****************************Methods*****************************//
      
      public void Fitness_equipment_btn_click(WebDriver driver) throws InterruptedException  {
	      Actions ac = new Actions(driver);
	      WebElement hoveron = driver.findElement(hover_on_gear);
    	  ac.moveToElement(hoveron).perform();	
    	  Thread.sleep(1000);
	      driver.findElement(fitness_btn).click();	
      }
      public void Verify_equipment_page_visible(WebDriver driver) {
  		  String exp_title = "Fitness Equipment - Gear";
  		  String act_title = driver.getTitle();
  		  System.out.println(act_title);
    	  Assert.assertTrue(act_title.contains(exp_title),"exp title not displayed");
  	  }
      public void select_equipment(WebDriver driver) throws InterruptedException{
    	  JavascriptExecutor js = (JavascriptExecutor)driver;
    	  js.executeScript("window.scrollBy(0,150)", "");
    	  driver.findElement(select_equip).click();
    	  js.executeScript("window.scrollBy(0,800)", "");
    	  driver.findElement(add_revw).click();
    	  Thread.sleep(1000); 
    	  driver.findElement(rating).click();
    	  driver.findElement(nick_name).clear();
    	  driver.findElement(nick_name).sendKeys("ajinkya");
    	  driver.findElement(summary_field).sendKeys("about product");
    	  driver.findElement(review).sendKeys("good product");
    	  driver.findElement(submit).click();
    	  Thread.sleep(1000);
      }
      public void Verify_review_submitted_text_displayed(WebDriver driver) {
    	  WebElement txt = driver.findElement(vtxt);
    	  Assert.assertTrue(txt.isDisplayed(), "sumbitted txt is not displayed");
      }  
}