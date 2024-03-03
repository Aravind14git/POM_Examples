package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects2;

public class LoginTestcase2 {

	@Test
	public void loginTest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rzaravin\\Pictures\\Gecko\\geckodriver.exe");
		WebDriver driver  = new FirefoxDriver();
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(5000);
		
		
		//Scenario 2 using POM
		PageFactory.initElements(driver, LoginPageObjects2.class);
		
		LoginPageObjects2.userName.sendKeys("user@phptravels.com");
		LoginPageObjects2.password.sendKeys("demouser");
		LoginPageObjects2.login.click();
		
		
		
		/*
		 * Scenario 1 using POM 1 simplified 
		 * LoginPageObjects2.username(driver).sendKeys("user@phptravels.com");
		 * LoginPageObjects2.password(driver).sendKeys("demouser");
		 * LoginPageObjects2.login(driver).click();
		 */

		//Scenario changes with object to define it - POM1
		//LoginPageObjects2 loginPageObjects2 = new LoginPageObjects2();
		//loginPageObjects2.username(driver).sendKeys("user@phptravels.com");

	
		
		/* Actual before POM1:
		 * WebElement userName = driver.findElement(By.name("email"));
		 * userName.sendKeys("user@phptravels.com");
		 * 
		 * WebElement password = driver.findElement(By.name("password"));
		 * password.sendKeys("demouser");
		 * 
		 * WebElement login = driver.findElement(By.id("submitBTN")); login.click();
		 * Thread.sleep(5000);
		 * 
		 * WebElement myprofile =driver.findElement
		 * (By.xpath("//*[@id=\"fadein\"]/div[2]/div/div/div[2]/ul/li[3]/a"));
		 * myprofile.click(); Thread.sleep(5000);
		 */

		
		


	}

}
