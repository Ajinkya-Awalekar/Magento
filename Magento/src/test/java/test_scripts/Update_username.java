package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignUp_Login;
import utils.Driver_setup;

public class Update_username 
 {
	WebDriver driver;
	@Test
	public void Updating_username_and_verify_successful_msg ()
	  {
		driver = Driver_setup.launch_Browser();
		HomePage hp = new HomePage();
		hp.navigate_to_magento_link(driver);
		hp.homepage_displayed(driver);
		
		SignUp_Login sl = new SignUp_Login();
		sl.enter_correct_cred(driver);
		sl.Verify_logged_as_username_txt(driver);
		sl.Update_username(driver);
		sl.Username_update_successful_msg_visible(driver);
		sl.logout(driver);	
      }
 }