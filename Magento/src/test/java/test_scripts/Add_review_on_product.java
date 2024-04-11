package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Address_Review;
import pages.HomePage;
import pages.SignUp_Login;
import utils.Driver_setup;

public class Add_review_on_product 
{
	WebDriver driver;
	@Test
	public void review() throws InterruptedException 
	    {
		  driver = Driver_setup.launch_Browser();
		  HomePage hp = new HomePage();
		  hp.navigate_to_magento_link(driver);
		  hp.homepage_displayed(driver);
		  
		  SignUp_Login sln = new SignUp_Login();
		  sln.enter_correct_cred(driver);
		  
		  Address_Review ar = new Address_Review();
		  ar.Fitness_equipment_btn_click(driver);
		  ar.Verify_equipment_page_visible(driver);
		  ar.select_equipment(driver);
		  ar.Verify_review_submitted_text_displayed(driver);
	    }
 }