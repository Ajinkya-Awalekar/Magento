package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Subscription_page;
import utils.Driver_setup;

public class Subscribed_page 
{
	 WebDriver driver;
     @Test
     public void subscribe_page() {
         driver = Driver_setup.launch_Browser();
         HomePage hp = new HomePage();
	     hp.navigate_to_magento_link(driver);
	     hp.homepage_displayed(driver);
    
	     Subscription_page sp = new Subscription_page();
	     sp.subscription_page_process(driver);
	     sp.Verify_success_msg_display(driver);
   }
 }