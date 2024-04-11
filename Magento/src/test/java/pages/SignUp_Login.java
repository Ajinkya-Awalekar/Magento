package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignUp_Login 
{
	      //*****************************Locators*****************************//
	
		private By singn_in_btn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
		private By email_btn = By.id("email");
		private By pass_btn = By.id("pass");
		private By signup_btn = By.id("send2");
		private By dropdown = By.xpath("//button[@class='action switch']");
		private By signOut_btn = By.linkText("Sign Out");
		
		private By logged_as_user = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span");
		private By error_msg = By.xpath("//div[text()='The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.']");
		
		private By myacc_btn = By.linkText("My Account");
		private By acc_info_btn = By.xpath("//ul[@class='nav items']//child::li[7]");
		private By first_name = By.id("firstname");
		private By save_btn = By.xpath("//button[@title='Save']");
		private By Usname_msg = By.xpath("//div[text()='You saved the account information.']");

		 //*****************************Methods*****************************//

		public void Verify_logged_as_username_txt(WebDriver driver) {
			WebElement loginUsername = driver.findElement(logged_as_user);
			Assert.assertTrue(loginUsername.isDisplayed(), "logged as username not displayed");
		}
		
		public void enter_correct_cred(WebDriver driver) {
            driver.findElement(singn_in_btn).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scrollBy(0,350)", "");   		
            driver.findElement(email_btn).sendKeys("aju1@gmail.com");
            driver.findElement(pass_btn).sendKeys("Aju@12345");
            driver.findElement(signup_btn).click();
		}
		public void logout(WebDriver driver){
			driver.findElement(dropdown).click();
			driver.findElement(signOut_btn).click();
		}
		public void enter_Incorrect_cred(WebDriver driver) {
            driver.findElement(singn_in_btn).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scrollBy(0,350)", "");   		
            driver.findElement(email_btn).sendKeys("aju1@gmail.com");
            driver.findElement(pass_btn).sendKeys("Aju");
            driver.findElement(signup_btn).click();
		}
		public void Verify_invalid_pass_txt(WebDriver driver) {
			WebElement error_txt = driver.findElement(error_msg);
			Assert.assertTrue(error_txt.isDisplayed(), "Invalid error msg is not viisible");
		}
		
		public void Update_username(WebDriver driver) {
			driver.findElement(dropdown).click();
			driver.findElement(myacc_btn).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scrollBy(0,200)", "");   		
    		driver.findElement(acc_info_btn).click();
            driver.findElement(first_name).clear();
            driver.findElement(first_name).sendKeys("AJ");
            driver.findElement(save_btn).click();
		}
		public void Username_update_successful_msg_visible(WebDriver driver) {
			WebElement successful_msg = driver.findElement(Usname_msg);
			Assert.assertTrue(successful_msg.isDisplayed(), "username updated successful msg is not viisible");
		}
		
	
  }