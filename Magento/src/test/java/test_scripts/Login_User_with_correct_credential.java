package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignUp_Login;
import utils.Driver_setup;

public class Login_User_with_correct_credential 
{
	WebDriver driver;
	@Test
	public void Login_with_correct_mail_and_pass() 
	  {
		driver = Driver_setup.launch_Browser();
		HomePage hp = new HomePage();
		hp.navigate_to_magento_link(driver);
		hp.homepage_displayed(driver);
		
		SignUp_Login sl = new SignUp_Login();
		sl.enter_correct_cred(driver);
		sl.Verify_logged_as_username_txt(driver);
		sl.logout(driver);
      }
}