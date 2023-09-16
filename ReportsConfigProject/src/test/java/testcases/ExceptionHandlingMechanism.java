package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionHandlingMechanism {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		//NoSuchElementException:
		// It is an event which will cause program termination
		
		// Exceptions can be handled using try - catch block 
		
	
	     driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();		
		driver.manage().window().maximize();
		
		driver.get("https://instagram.com");

		try
		{
		   driver.findElement(By.name("username")).sendKeys("testuser@gmail.com"); // NoSuchElementException
		}
		catch(NoSuchElementException ex)
		{
			System.out.println("it entered in to no such element exception block");
			Thread.sleep(2000);
			driver.findElement(By.name("username")).sendKeys("testuser@gmail.com");
		}
		
		
		driver.findElement(By.name("password")).sendKeys("testpassword");
		
		}
        
		
		
	
		

	}


