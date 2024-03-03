package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPageObjects {
	
	@FindBy(xpath = "/html/body/div/div/section/div/div/article/div[2]/div/div/div/a")
	public  static WebElement logout;
		
	
	/*
	 * public static WebElement logout(WebDriver driver) {
	 * 
	 * return driver.findElement
	 * (By.xpath("/html/body/div/div/section/div/div/article/div[2]/div/div/div/a"))
	 * ; }
	 */

}
