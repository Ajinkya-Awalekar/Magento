package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Sort_By 
{  
	     //*****************************Locators*****************************//
	
	  private By training_btn = By.xpath("//span[text()='Training']");
	  private By erin_pro = By.xpath("//a[@class='block-promo training-erin']");
	  private By sort_btn = By.id("sorter");
	  private By sort_txt = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/div[4]/label");
		
	     //*****************************Methods*****************************//
	  
	  public void navigate_to_magento_link(WebDriver driver) {
		 driver.findElement(training_btn).click();
		 driver.findElement(erin_pro).click();
		 driver.findElement(sort_btn).sendKeys("Price ");	
		}
	  public void Verify_sortBy_txt_displayed(WebDriver driver) {
		 WebElement txt = driver.findElement(sort_txt);
		 Assert.assertTrue(txt.isDisplayed(), "Sort by txt is not displayed");
		}	
  }