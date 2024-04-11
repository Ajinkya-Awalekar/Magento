package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Wishlist
{
	   //*****************************Locators*****************************//
	
	private By hoverOn_pro1 = By.xpath("//img[@alt='Argus All-Weather Tank']");
	private By add_pro1 = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[3]/div/div/ol/li[3]/div/div/div[3]/div/div[2]/a[1]");
	private By clkHere = By.xpath("//a[text()='here']");
	private By pro1_Added_wishlist = By.xpath("//div[@class='page messages']//child::div[2]");
	
	private By hoverOn_pro2 = By.xpath("//img[@alt='Hero Hoodie']");
	private By add_pro2 = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[3]/div/div/ol/li[4]/div/div/div[3]/div/div[2]/a[1]");
	private By clkHere2 = By.xpath("//a[text()='here']");
	private By pro2_Added_wishlist = By.xpath("//div[@class='page messages']//child::div[2]");
	
	   //*****************************Methods*****************************//
	
	public void add_pro1(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
 		js.executeScript("window.scrollBy(0,1900)", "");
 		Thread.sleep(2000);
 		Actions action = new Actions(driver);
		WebElement hover1 = driver.findElement(hoverOn_pro1);
		action.moveToElement(hover1).perform();
 		driver.findElement(hoverOn_pro1);
 		driver.findElement(add_pro1).click();
 		Thread.sleep(2000);
 		driver.findElement(clkHere).click();
	}
	public void Verify_pro1_added_wishlist_msg_displayed(WebDriver driver) {
		WebElement msg = driver.findElement(pro1_Added_wishlist);
		Assert.assertTrue(msg.isDisplayed(), "pro added in wishlist msg is not displayed");		
	}
	public void add_pro2(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
 		js.executeScript("window.scrollBy(0,1900)", "");
 		Thread.sleep(2000);
 		Actions action = new Actions(driver);
		WebElement hover2 = driver.findElement(hoverOn_pro2);
		action.moveToElement(hover2).perform();
 		driver.findElement(hoverOn_pro2);
 		driver.findElement(add_pro2).click();
 		Thread.sleep(2000);
 		driver.findElement(clkHere2).click();
	}
	public void Verify_pro2_added_wishlist_msg_displayed(WebDriver driver) {
		WebElement msg = driver.findElement(pro2_Added_wishlist);
		Assert.assertTrue(msg.isDisplayed(), "pro added in wishlist msg is not displayed");		
	}	
}