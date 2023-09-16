package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunctionality {
	
 public static	WebDriver driver;
	
	@BeforeSuite
	public void login()
	{
		
		driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		
	}
	
	
	@AfterSuite
	public void logout()
	{
		driver.quit();
	}

}
