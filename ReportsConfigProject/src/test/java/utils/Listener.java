package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

import testcases.LoginFunctionality;

//ITestListener  > Interface


public class Listener extends LoginFunctionality implements  ITestListener {
	
	ExtentReports extent;

	@Override
	public void onTestStart(ITestResult result) {
		
		// it will execute before start of each and every testcase
	if(extent==null)
	{
	extent=	ResuableMethods.setExtentReportsConfiguration();
	}
	
	extent.createTest(result.getMethod().getMethodName());
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		// it will invoke only if testcase fails
		
		// screenshot code
		
		TakesScreenshot tks = (TakesScreenshot)driver;
		
		File sourceLocation=   tks.getScreenshotAs(OutputType.FILE);
		
	String screenshotPath=	System.getProperty("user.dir")+"//FailedScreenshot//"+result.getMethod().getMethodName()+".png";
		
		File destinationLocation = new File(screenshotPath);
		
		try {
			FileUtils.copyFile(sourceLocation, destinationLocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	@Override
	public void onStart(ITestContext context) {
		// this will execute at first before all testcases
		
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		// this will execute at last after executing all testcases
		
		extent.flush();
		
	}
	
	
	
	
	
	
	
	
	

}
