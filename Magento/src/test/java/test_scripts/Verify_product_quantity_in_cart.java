package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Product_page;
import utils.Driver_setup;

public class Verify_product_quantity_in_cart
{
	WebDriver driver;
	@Test
	public void pro_quantity() throws InterruptedException 	
	  {
		driver = Driver_setup.launch_Browser();
		HomePage hp = new HomePage();
		hp.navigate_to_magento_link(driver);
		hp.homepage_displayed(driver);
		
		Product_page pp = new Product_page();
		pp.add_pro_qty(driver);
		pp.View_cart(driver);
		pp.Verify_cart_quantity_(driver);
      }
  }