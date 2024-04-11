package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Product_page;
import utils.Driver_setup;

public class Verify_product_detail_page 
{
	WebDriver driver;
	@Test
	public void pro_deatils_page()  	
	  {
		driver = Driver_setup.launch_Browser();
		HomePage hp = new HomePage();
		hp.navigate_to_magento_link(driver);
		hp.homepage_displayed(driver);
	  
		Product_page pp =new Product_page();
		pp.prod_details(driver);
	  }	
 }