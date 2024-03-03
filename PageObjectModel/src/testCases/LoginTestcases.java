package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginTestcases {
	
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty
		("webdriver.gecko.driver", "C:\\Users\\rzaravin\\Pictures\\Gecko\\geckodriver.exe");
		WebDriver driver  = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(3000);
		
		
		//Scenrios 2
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userName.sendKeys("student");
		 LoginPageObjects.password.sendKeys("Password123");
		 LoginPageObjects.submitButton.click();
		
		
		
		
		
		/*
		 * Scenario 1 simplified: 
		 * LoginPageObjects.userName(driver).sendKeys("student");
		 * 
		 * LoginPageObjects.password(driver).sendKeys("Password123");
		 * LoginPageObjects.loginButton(driver).click();
		 */
		
		/* Before static method creation in antoher class for :
		 * LoginPageObjects loginPageObjects = new LoginPageObjects();
		 * loginPageObjects.userName(driver).sendKeys("student");
		 */
		
		/* Above using POM scenario for this concept:
		 * WebElement userName = driver.findElement(By.id("username"));
		 * userName.sendKeys("student");
		 * 
		 * WebElement password = driver.findElement(By.id("password"));
		 * password.sendKeys("Password123");
		 * 
		 * WebElement submit =driver.findElement(By.id("submit")); submit.click();
		 */
		
		;
	}

}
