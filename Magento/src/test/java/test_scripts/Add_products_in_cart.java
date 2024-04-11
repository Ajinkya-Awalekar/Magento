package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Products;
import pages.Search_product;
import utils.Driver_setup;

public class Add_products_in_cart 
{
	WebDriver driver;
	@Test
	public void add_pro_in_cart() throws InterruptedException 	
	  {
		driver = Driver_setup.launch_Browser();
		HomePage hp = new HomePage();
		hp.navigate_to_magento_link(driver);
		hp.homepage_displayed(driver);
        
		Search_product spr = new Search_product();
	    spr.seach_pro(driver);
	  
	    Products p = new Products();
	    p.pro1_atc(driver);
	    p.pro2_atc(driver);
	    p.View_cart(driver);
	    p.pro_added_cart_successfully(driver);
	  }
 }