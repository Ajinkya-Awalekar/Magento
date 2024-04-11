package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Registration;
import utils.Driver_setup;

public class Register_user_with_existing_mail 
{
	WebDriver driver;
	@Test
	public void register_user_with_existing_mail() throws InterruptedException 	
	  {
		driver = Driver_setup.launch_Browser();
		HomePage hp = new HomePage();
		hp.navigate_to_magento_link(driver);
		hp.homepage_displayed(driver);
		hp.Create_Acc_btn_Click(driver);
		
		Registration r = new Registration();
        r.Entering_existing_email(driver);
        r.Verify_existing_email_txt_displayed(driver);
      }
 }