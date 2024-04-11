package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Luma_yoga_collection 
{
	    //*****************************Locators*****************************//
	
    private By banner  = By.xpath("//span[text()='Shop New Yoga']");
    private By verify_page = By.xpath("//span[text()='New Luma Yoga Collection']");
    
    private By pro1 = By.xpath("//img[@alt='Echo Fit Compression Short']");
	private By size = By.id("option-label-size-143-item-172");
	private By colour = By.id("option-label-color-93-item-57");
	private By quantity = By.id("qty");
	private By atc = By.id("product-addtocart-button");	
	
	private By pro2 = By.xpath("//img[@alt='Gwen Drawstring Bike Short']");
	private By size2 = By.id("option-label-size-143-item-173");
	private By colour2 = By.id("option-label-color-93-item-56");
	private By quantity2 = By.id("qty");
	private By atc2 = By.id("product-addtocart-button");
	private By checkout_btn = By.id("top-cart-btn-checkout");
	  
	private By view_cart_btn = By.xpath("//a[@class='action showcart']");
	private By cart_verify = By.id("minicart-content-wrapper");
    
	private By signin = By.xpath("//*[@id=\"checkout\"]/div[1]/button");
	private By email = By.id("login-email");
	private By pass = By.id("login-password");
	private By signup = By.xpath("//button[@class='action action-login secondary']//child::span[1]");
	
	private By hpage = By.xpath("/html/body/div[2]/header/div/a/img");
	private By removepro1 = By.xpath("//div[@class='secondary']//child::a[1]");
	private By okbtn = By.xpath("//button[@class='action-primary action-accept']");
	private By removepro2 = By.xpath("//div[@class='secondary']//child::a[1]");
	private By okbtn2 = By.xpath("//button[@class='action-primary action-accept']");
	private By no_itm = By.xpath("//strong[@class='subtitle empty']");
	
	    //*****************************Methods*****************************//
	
	public void add_pro1(WebDriver driver) {
		driver.findElement(banner).click();
		WebElement page = driver.findElement(verify_page);
		Assert.assertTrue(page.isDisplayed(), "yoga collection page is not displayed");
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,400)", "");
		driver.findElement(pro1).click();
		jss.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(size).click();
		driver.findElement(colour).click();
		driver.findElement(quantity).clear();
		driver.findElement(quantity).sendKeys("3");
		driver.findElement(atc).click();
		driver.navigate().back();
	}
	public void add_pro2(WebDriver driver) throws InterruptedException {
		driver.findElement(pro2).click();
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(size2).click();
		driver.findElement(colour2).click();
		driver.findElement(quantity2).clear();
		driver.findElement(quantity2).sendKeys("5");
		driver.findElement(atc2).click();
		Thread.sleep(3000);
	}
	public void view_cart(WebDriver driver) throws InterruptedException {
		driver.findElement(view_cart_btn).click();
		Thread.sleep(2000);
		WebElement viewc = driver.findElement(cart_verify);
		Assert.assertTrue(viewc.isDisplayed(), "cart page is not displayed");
		driver.findElement(checkout_btn).click();
	}
	public void signin(WebDriver driver) {
		driver.findElement(signin).click();
		driver.findElement(email).sendKeys("aju1@gmail.com");
		driver.findElement(pass).sendKeys("Aju@12345");
		driver.findElement(signup).click();
	}
	public void Remove_pro_from_cart(WebDriver driver)throws InterruptedException {
		driver.findElement(hpage).click();
		driver.findElement(view_cart_btn).click();
		driver.findElement(removepro1).click();
		driver.findElement(okbtn).click();
		Thread.sleep(3000);
	    driver.findElement(removepro2).click();
	    driver.findElement(okbtn2).click();
	}
	public void Verify_no_item_in_cart_txt_displayed(WebDriver driver) {
		WebElement no_item_txt = driver.findElement(no_itm);
		Assert.assertTrue(no_item_txt.isDisplayed(), "No item in cart txt is not displayed");
	}
 }