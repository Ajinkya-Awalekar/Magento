package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage 
{	
	     //*****************************Locators*****************************//
	
	private By create_Acc_btn = By.linkText("Create an Account");
	private By ordr_and_return_page = By.xpath("//a[text()='Orders and Returns']");
	private By order_id = By.id("oar-order-id");
	private By order_last_name = By.id("oar-billing-lastname");
	private By find_order_opt = By.xpath("//option[text()='ZIP Code']");
	private By zip_code = By.id("oar_zip");
	private By continue_btn = By.xpath("//button[@title='Continue']");
	private By error_msg = By.xpath("//div[text()='You entered incorrect data. Please try again.']");
	
	     //*****************************Methods*****************************//
	
	public void navigate_to_magento_link(WebDriver driver) {
	  driver.manage().window().maximize();
	  driver.get("https://magento.softwaretestingboard.com");
	}
	public void homepage_displayed(WebDriver driver) {
	  String homepage_act = driver.getTitle();
	  String homepage_exp = "Home Page";
	  Assert.assertEquals(homepage_act, homepage_exp,"Homepage not displayed correctly");
	}
	public void Create_Acc_btn_Click(WebDriver driver) throws InterruptedException {
	  WebElement Createacc_btn = driver.findElement(create_Acc_btn);
	  Createacc_btn.click();
	  Thread.sleep(3000);
	}
	public void Orders_and_Returns(WebDriver driver) {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,8500)", "");   
      driver.findElement(ordr_and_return_page).click();
      js.executeScript("window.scrollBy(0,400)", "");  
      driver.findElement(order_id).sendKeys("12345");
      driver.findElement(order_last_name).sendKeys("Awalekar");
      driver.findElement(find_order_opt).click();
      driver.findElement(zip_code).sendKeys("321654");
      driver.findElement(continue_btn).click();
	}
	public void error_msg_visible(WebDriver driver) {
	  WebElement error_txt = driver.findElement(error_msg);
	  Assert.assertTrue(error_txt.isDisplayed(), "Error msg is not displayed");
	}
 }