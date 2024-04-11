package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Search_product;
import utils.Driver_setup;

public class Products_visibility 
{
     WebDriver driver;
     @Test
     public void search_product() {
         driver = Driver_setup.launch_Browser();
         HomePage hp = new HomePage();
	     hp.navigate_to_magento_link(driver);
	     hp.homepage_displayed(driver);
	
	     Search_product sp = new Search_product();
	     sp.seach_pro(driver);
	     sp.Verify_allPro_related_searched_visible(driver);   
        }
 }