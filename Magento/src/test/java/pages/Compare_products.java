package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert; 

public class Compare_products 
{
	      //*****************************Locators*****************************//
	
	private By hoverOn_pro1 = By.xpath("//img[@alt='Argus All-Weather Tank']");
	private By add_to_compare = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[3]/div/div/ol/li[3]/div/div/div[3]/div/div[2]/a[2]");   
	private By compare_txt = By.xpath("//div[text()='You added product Argus All-Weather Tank to the ']");
	
	private By hoverOn_pro2 = By.xpath("//img[@alt='Hero Hoodie']");
	private By add_to_compare2 = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[3]/div/div/ol/li[4]/div/div/div[3]/div/div[2]/a[2]");
	private By compare_txt2 = By.xpath("//div[text()='You added product Hero Hoodie to the ']");
	
	private By comparison_btn = By.xpath("//a[@href='https://magento.softwaretestingboard.com/catalog/product_compare/']");
	
	       //*****************************Methods*****************************//
	
	   public void Add_to_compare_products(WebDriver driver) {
	      Actions action = new Actions(driver);
		  WebElement hover1 = driver.findElement(hoverOn_pro1);
		  action.moveToElement(hover1).perform();
	 	  driver.findElement(add_to_compare).click();
	   }
	   public void Verify_pro_added_in_compare_list(WebDriver driver) {
		  WebElement added_txt = driver.findElement(compare_txt);
		  Assert.assertTrue(added_txt.isDisplayed(), "Product added in compare list is not displayed");
	   }
	   public void Add_to_compare_products2(WebDriver driver) {
		  Actions action = new Actions(driver);
	      WebElement hover2 = driver.findElement(hoverOn_pro2);
		  action.moveToElement(hover2).perform();
		  driver.findElement(add_to_compare2).click();
	   }
	   public void Verify_pro2_added_in_compare_list(WebDriver driver) {
		  WebElement added_txt2 = driver.findElement(compare_txt2);
		  Assert.assertTrue(added_txt2.isDisplayed(), "Product added in compare list is not displayed");
	   }
	   public void Comparison_list(WebDriver driver) {
		  driver.findElement(comparison_btn).click();
		  JavascriptExecutor jss = (JavascriptExecutor)driver;
		  jss.executeScript("window.scrollBy(0,500)", "");
	   } 
  }