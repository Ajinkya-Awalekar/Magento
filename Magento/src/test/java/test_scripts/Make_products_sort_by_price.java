package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignUp_Login;
import pages.Sort_By;
import utils.Driver_setup;

public class Make_products_sort_by_price 
{
	WebDriver driver;
	@Test
	public void sorting_poducts_list() 
	    {
		  driver = Driver_setup.launch_Browser();
		  HomePage hp = new HomePage();
		  hp.navigate_to_magento_link(driver);
		  hp.homepage_displayed(driver);
		  
		  SignUp_Login slog = new SignUp_Login();
		  slog.enter_correct_cred(driver);
		  
		  Sort_By sb = new Sort_By();
		  sb.navigate_to_magento_link(driver);
		  sb.Verify_sortBy_txt_displayed(driver);
	    }
 }