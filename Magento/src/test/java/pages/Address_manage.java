package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Address_manage 
{ 
	    //*****************************Locators*****************************//
	
	private By dropdown = By.xpath("//button[@class='action switch']");  
	private By myacc_btn = By.linkText("My Account");
	private By addBook = By.xpath("//a[text()='Address Book']");
	
	private By company_name = By.id("company");
	private By phoneNo = By.id("telephone");
	private By cname = By.id("country");
	private By sadd1 = By.id("street_1");
	private By sadd2 = By.id("street_2");
	private By sadd3 = By.id("street_3");
	private By city_name = By.id("city");
	private By state = By.id("region_id");
	private By zipcode = By.id("zip");
	private By save_add = By.xpath("//button[@title='Save Address']");
	private By saved_msg = By.xpath("//div[text()='You saved the address.']");	
	private By add_new_add = By.xpath("//button[@title='Add New Address']");
	                
	    //*****************************Methods*****************************//
	
	public void Add_billing_address(WebDriver driver) {
		driver.findElement(dropdown).click();
		driver.findElement(myacc_btn).click(); 		
		driver.findElement(addBook).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", ""); 
		driver.findElement(add_new_add).click();
	}
	public void Verify_add_new_add_Page_displayed(WebDriver driver) {
		 String addpage_act = driver.getTitle();
		 String addpage_exp = "Add New Address";
		 Assert.assertEquals(addpage_act, addpage_exp,"Add New Address page not displayed correctly");
	}
	public void New_add_details(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");	
		driver.findElement(company_name).sendKeys("Atos");
		driver.findElement(phoneNo).sendKeys("9146612776");
		driver.findElement(cname).sendKeys("India");
		driver.findElement(sadd1).sendKeys("flat no A-8,Sunflower society");
		driver.findElement(sadd2).sendKeys("Pune-banglore highway");
		driver.findElement(sadd3).sendKeys("Near VTP township");
		driver.findElement(city_name).sendKeys("Pune");
		driver.findElement(state).sendKeys("Maharashtra");
		driver.findElement(zipcode).sendKeys("415263");
		driver.findElement(save_add).click();
	}
	public void Verify_add_saved_msg_displayed(WebDriver driver) {
		WebElement saved_add_msg = driver.findElement(saved_msg);
		Assert.assertTrue(saved_add_msg.isDisplayed(), "Address saved successfully msg is not displayed");		
	}	
 }