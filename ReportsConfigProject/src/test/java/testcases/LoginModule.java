package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginModule extends LoginFunctionality {

	ExtentReports extent;
	
	
	
	// ExtentReports > it will generate reports
	//ExtentSparkReporter- setting reports path , reports name
	
	
	
	@Test
	public void enterUsername()
	{
	  
		driver.findElement(By.id("email")).sendKeys("testemail@gmail.com");
		
	}
	
	
	@Test
	public void enterPassword()
	{
		
		driver.findElement(By.id("passid")).sendKeys("testpassword");
	}
	
	
	@Test
	public void testcase3()
	{
	
		System.out.println("testcase 3 is executed");
		
	}
	
	
	
	
}
