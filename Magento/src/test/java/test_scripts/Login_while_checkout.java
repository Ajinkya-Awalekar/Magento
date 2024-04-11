package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Checkout_page;
import pages.HomePage;
import pages.Product_page;
import utils.Driver_setup;

public class Login_while_checkout 
{
	WebDriver driver;
	@Test
	public void login_while_chkout() throws InterruptedException 	
	  {
		driver = Driver_setup.launch_Browser();
		HomePage hp = new HomePage();
		hp.navigate_to_magento_link(driver);
		hp.homepage_displayed(driver);
		
		Product_page pp = new Product_page();
		pp.add_pro_qty(driver);
		pp.View_cart(driver);
		
		Checkout_page cp = new Checkout_page();
		cp.signin(driver);
      }
 }