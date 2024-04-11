package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Products;
import utils.Driver_setup;

public class Remove_products_from_cart 
{
WebDriver driver;
@Test
public void remove_pro_from_cart() throws InterruptedException 
    {
	  driver = Driver_setup.launch_Browser();
	  HomePage hp = new HomePage();
	  hp.navigate_to_magento_link(driver);
	  hp.homepage_displayed(driver);
	
	  Products p = new Products();
	  p.pro1_atc(driver);
	  p.pro2_atc(driver);
	  p.View_cart(driver);
	  p.pro_added_cart_successfully(driver);
	  p.Remove_pro_from_cart(driver);
	  p.Verify_removed_item_txt_displayed(driver);
    }
 }
