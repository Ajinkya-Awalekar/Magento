package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Address_manage;
import pages.HomePage;
import pages.SignUp_Login;
import utils.Driver_setup;

public class Add_new_address 
{
	WebDriver driver;
	@Test
	public void new_address() 	
	  {
		driver = Driver_setup.launch_Browser();
		HomePage hp = new HomePage();
		hp.navigate_to_magento_link(driver);
		hp.homepage_displayed(driver);
		
		SignUp_Login sl = new SignUp_Login ();
		sl.enter_correct_cred(driver);
		
		Address_manage am = new Address_manage();
		am.Add_billing_address(driver);
		am.Verify_add_new_add_Page_displayed(driver);
		am.New_add_details(driver);
		am.Verify_add_saved_msg_displayed(driver);	
		
		sl.logout(driver);
      }
 }