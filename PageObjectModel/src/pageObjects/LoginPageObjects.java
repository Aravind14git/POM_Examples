package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	
	//Scenario2:
	
	@FindBy(how = How.ID, using = "username")
	public static WebElement userName;
	@FindBy(id = "password")
	public static WebElement password;
	@FindBy(id = "submit")
	public static WebElement submitButton;
	
	}
	
		

	//Username, password, submit button, finding the elements here we by creating methods in 1 class
	//Sc 1: To find username one method creating it
	// we will write code in iterative(step by step) mode for knowing it
	
	
	/* Scenario 1 simplified
	 * public static WebElement userName(WebDriver driver) { return
	 * driver.findElement(By.id("username")); } public static WebElement
	 * password(WebDriver driver) { return driver.findElement(By.id("password")); }
	 * 
	 * public static WebElement loginButton(WebDriver driver) { return
	 * driver.findElement(By.id("submit")); }
	 */
	
	
	

