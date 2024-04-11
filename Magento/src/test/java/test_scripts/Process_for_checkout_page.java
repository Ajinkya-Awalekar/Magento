package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Checkout_page;
import pages.HomePage;
import pages.Product_page;
import utils.Driver_setup;

public class Process_for_checkout_page 
 {
	WebDriver driver;
	@Test
	public void checkout_process() throws InterruptedException 	
	  {
		driver = Driver_setup.launch_Browser();
		HomePage hp = new HomePage();
		hp.navigate_to_magento_link(driver);
		hp.homepage_displayed(driver);
		
		Product_page pp = new Product_page();
		pp.add_pro_qty(driver);
		pp.View_cart(driver);
		
		Checkout_page cp = new Checkout_page();
		cp.Shipping_Address(driver);
		cp.Review_Payments(driver);
		cp.verify_purchase_success_msg(driver);
      }
 }