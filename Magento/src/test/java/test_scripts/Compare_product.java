package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Compare_products;
import pages.HomePage;
import utils.Driver_setup;

public class Compare_product
{
	WebDriver driver;
	@Test
	public void comparison_in_products() 
	    {
		  driver = Driver_setup.launch_Browser();
		  HomePage hp = new HomePage();
		  hp.navigate_to_magento_link(driver);
		  hp.homepage_displayed(driver);
		  
		  Compare_products cp = new Compare_products();
		  cp.Add_to_compare_products(driver); 
		  cp.Verify_pro_added_in_compare_list(driver);
		  cp.Add_to_compare_products2(driver);
		  cp.Verify_pro2_added_in_compare_list(driver);
		  cp.Comparison_list(driver);
	   }
  }