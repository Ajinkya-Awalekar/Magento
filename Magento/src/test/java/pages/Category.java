package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Category 
{
	//*****************************Locators*****************************//
	
	private By women_btn = By.xpath("//span[text()='Women']");
	private By top_btn = By.xpath("//ol[@class='items']//child::li[1]//child::a");
	
	private By men_btn = By.xpath("//span[text()='Men']");
	private By jacket_btn = By.xpath("//a[text()='Jackets']");
	
	 //*****************************Methods*****************************//
	
	public void W_cat_click(WebDriver driver)  {
		driver.findElement(women_btn).click();
		driver.findElement(top_btn).click();	
	}
	public void Verify_women_category_page_visible(WebDriver driver) {
		String exp_title = "Tops - Women";
		String act_title = driver.getTitle();
		Assert.assertTrue(act_title.contains(exp_title), "exp title not displayed");
	}
	
	public void M_cat_click(WebDriver driver)  {
		driver.findElement(men_btn).click();
		driver.findElement(jacket_btn).click();	
	}
	public void Verify_men_category_page_visible(WebDriver driver) {
		String exp_title = "Jackets - Tops - Men";
		String act_title = driver.getTitle();
		Assert.assertTrue(act_title.contains(exp_title), "exp title not displayed");
	}
}