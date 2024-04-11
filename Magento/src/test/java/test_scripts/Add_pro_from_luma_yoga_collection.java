package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Luma_yoga_collection;
import pages.HomePage;
import utils.Driver_setup;

public class Add_pro_from_luma_yoga_collection 
{
	WebDriver driver;
	@Test
	public void luma_collection() throws InterruptedException 
	    {
		  driver = Driver_setup.launch_Browser();
		  HomePage hp = new HomePage();
		  hp.navigate_to_magento_link(driver);
		  hp.homepage_displayed(driver);
        
		  Luma_yoga_collection lyc = new Luma_yoga_collection();
		  lyc.add_pro1(driver);
		  lyc.add_pro2(driver);
		  lyc.view_cart(driver);
		  lyc.signin(driver);
		  lyc.Remove_pro_from_cart(driver);
		  lyc.Verify_no_item_in_cart_txt_displayed(driver);
	    }
 }