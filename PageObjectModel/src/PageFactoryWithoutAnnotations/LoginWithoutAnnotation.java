package PageFactoryWithoutAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutAnnotation {
	
	public static WebElement username;
	public static WebElement password;

	@Test
	public void login() {
		System.setProperty
		("webdriver.gecko.driver", "C:\\Users\\rzaravin\\Pictures\\Gecko\\geckodriver.exe");
		WebDriver driver  = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		PageFactory.initElements(driver, LoginWithoutAnnotation.class);
	
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		
		
		
	}
	
	
	
}
