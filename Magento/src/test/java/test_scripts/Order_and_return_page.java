package test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import utils.Driver_setup;

public class Order_and_return_page 
{
	WebDriver driver;
    @Test
    public void order_return_page() 
        {
        driver = Driver_setup.launch_Browser();
        HomePage hp = new HomePage();
	    hp.navigate_to_magento_link(driver);
        hp.homepage_displayed(driver);  
        hp.Orders_and_Returns(driver);
        hp.error_msg_visible(driver);
       }
 }    