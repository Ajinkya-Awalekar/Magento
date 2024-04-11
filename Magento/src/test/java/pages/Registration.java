package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Registration {
	
	    //*****************************Locators*****************************//
	
	private By f_name = By.id("firstname");
	private By l_name = By.id("lastname");
	private By email = By.id("email_address");
	private By pass = By.id("password");
	private By cpass = By.id("password-confirmation");
	private By submit = By.xpath("//button[@title='Create an Account']");
	
	private By acc_conifrm_txt = By.xpath("//div[text()='Thank you for registering with Main Website Store.']");
    private By existing_mail = By.xpath("//div[text()='There is already an account with this email address. If you are sure that it is your email address, ']");

        //*****************************Methods*****************************//
    
	public void verify_acc_created_txt(WebDriver driver) {
		String createAcc_txt_act = driver.getTitle();
		String createAcc_txt_exp = "Create New Customer Account";
		Assert.assertEquals(createAcc_txt_act, createAcc_txt_exp, "Create New Customer Account is not displayed");
	}

	public void Entering_Personal_Info(WebDriver driver) {
		driver.findElement(f_name).sendKeys("Ajinkya");
		driver.findElement(l_name).sendKeys("Awalekar");
		driver.findElement(email).sendKeys("aju11@gmail.com");
		driver.findElement(pass).sendKeys("Aju@12345");
		driver.findElement(cpass).sendKeys("Aju@12345");
		driver.findElement(submit).click();
	}
	public void acc_created_confirmation_display(WebDriver driver) {
		WebElement acc_created_txt = driver.findElement(acc_conifrm_txt);
		Assert.assertTrue(acc_created_txt.isDisplayed(),"Verify error 'Email Address already exist!'is not displayed");	
	}
	
	public void Entering_existing_email(WebDriver driver) {
		driver.findElement(f_name).sendKeys("Abhi");
		driver.findElement(l_name).sendKeys("Awalekar");
		driver.findElement(email).sendKeys("aju11@gmail.com");
		driver.findElement(pass).sendKeys("Aju@123456");
		driver.findElement(cpass).sendKeys("Aju@123456");
		driver.findElement(submit).click();
	}
	public void Verify_existing_email_txt_displayed(WebDriver driver) {
		WebElement exist_mail_txt = driver.findElement(existing_mail);
		Assert.assertTrue(exist_mail_txt.isDisplayed(),"Thank you for registering with Main Website Store is not displayed");	
	}
}
