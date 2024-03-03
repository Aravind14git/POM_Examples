package PageFactoryWithoutAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutAnnotation2 {
	public static WebElement email;
	public static WebElement password;
	public static WebElement submitBTN;

	@Test
	public void login() throws InterruptedException {
		System.setProperty
		("webdriver.gecko.driver", "C:\\Users\\rzaravin\\Pictures\\Gecko\\geckodriver.exe");
		WebDriver driver  = new FirefoxDriver();
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(5000);
		
		PageFactory.initElements(driver, LoginWithoutAnnotation2.class);
		email.sendKeys("user@phptravels.com");
		password.sendKeys("demouser");
		submitBTN.click();
		
		
		
		
	}

}
