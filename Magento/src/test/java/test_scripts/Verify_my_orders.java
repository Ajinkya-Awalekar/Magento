package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Orders;
import pages.HomePage;
import pages.SignUp_Login;
import utils.Driver_setup;

public class Verify_my_orders 
{
	WebDriver driver;
	@Test
	public void my_orders()
	    {
		  driver = Driver_setup.launch_Browser();
		  HomePage hp = new HomePage();
		  hp.navigate_to_magento_link(driver);
		  hp.homepage_displayed(driver);
		  
		  SignUp_Login sll = new SignUp_Login();
		  sll.enter_correct_cred(driver);
		  
		  Orders o = new Orders();
		  o.Check_order(driver);
		  o.Order_history(driver);	  
		  o.Veify_order_page_displayed(driver);
		  o.View_Order_details(driver);
        }
  }