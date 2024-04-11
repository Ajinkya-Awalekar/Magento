package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Registration;
import utils.Driver_setup;

public class Registration_user {
	
	WebDriver driver;
	@Test
	public void register_user() throws InterruptedException 	
	  {
		driver = Driver_setup.launch_Browser();
		HomePage hp = new HomePage();
		hp.navigate_to_magento_link(driver);
		hp.homepage_displayed(driver);
		hp.Create_Acc_btn_Click(driver);
		
		Registration r = new Registration();
		r.verify_acc_created_txt(driver);
		r.Entering_Personal_Info(driver);
		r.acc_created_confirmation_display(driver);
	  }

  }