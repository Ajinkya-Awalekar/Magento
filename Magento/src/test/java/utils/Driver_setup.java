package utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver_setup
{
	public static WebDriver launch_Browser() {
		WebDriver driver;
		System.setProperty("webdriver.chromedriver", "D:\\Selenium Download.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;	
	  }
}