package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects2 {

	//username, password , submit

	
	//Scenario2 using POM 2:
	
		@FindBy(how = How.NAME, using = "email")
		public static WebElement userName;
		@FindBy(name  = "password")
		public static WebElement password;
		@FindBy(id = "submitBTN")
		public static WebElement login;
		
	
	
	
	
	/* Scenario 1 using POM 1 simplified  -
	 *  To find username one method creating it
	 we will write code in iterative(step by step) mode for knowing it
	 -- 
	 * public static WebElement username(WebDriver driver) { return
	 * driver.findElement(By.name("email")); }
	 * 
	 * public static WebElement password(WebDriver driver) {
	 * 
	 * return driver.findElement(By.name("password")); }
	 * 
	 * public static WebElement login(WebDriver driver) { return
	 * driver.findElement(By.id("submitBTN")); }
	 */

}
