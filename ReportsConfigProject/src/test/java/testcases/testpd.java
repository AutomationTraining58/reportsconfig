package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testpd {

	public static void main(String[] args) {
	
		WebDriver driver = new EdgeDriver();
		WebDriverManager.edgedriver().setup();		
		driver.manage().window().maximize();
		
		driver.get("https://instagram.com");
		driver.findElement(By.name("username")).sendKeys("testuser@gmail.com");

	}

}
