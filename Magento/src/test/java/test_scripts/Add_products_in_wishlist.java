package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignUp_Login;
import pages.Wishlist;
import utils.Driver_setup;

public class Add_products_in_wishlist 
{
	WebDriver driver;
	@Test
	public void wishlist() throws InterruptedException 
	  {
		driver = Driver_setup.launch_Browser();
		HomePage hp = new HomePage();
		hp.navigate_to_magento_link(driver);
		hp.homepage_displayed(driver);
		
		SignUp_Login sl = new SignUp_Login ();
		sl.enter_correct_cred(driver);		
		
		Wishlist w = new Wishlist();
		w.add_pro1(driver);
		w.Verify_pro1_added_wishlist_msg_displayed(driver);
		w.add_pro2(driver);
		w.Verify_pro2_added_wishlist_msg_displayed(driver);
		
		SignUp_Login slog = new SignUp_Login();
		slog.logout(driver);
      }
 }