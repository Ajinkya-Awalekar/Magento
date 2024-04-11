package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Search_product 
{
	    //*****************************Locators*****************************//
	
	private By search_btn = By.id("search");
	private By search_logo_btn = By.xpath("//button[@title='Search']");
	private By related_item = By.xpath("//dt[text()='Related search terms']");
	
	     //*****************************Methods*****************************//
	
	public void seach_pro(WebDriver driver) {
		driver.findElement(search_btn).sendKeys("men t-shirt");
		driver.findElement(search_logo_btn).click();	
	}
    public void Verify_allPro_related_searched_visible(WebDriver driver) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,500)", "");  
    	WebElement re_pro = driver.findElement(related_item);
    	Assert.assertTrue(re_pro.isDisplayed(), "all the products related to search are not visible");			
    }
}