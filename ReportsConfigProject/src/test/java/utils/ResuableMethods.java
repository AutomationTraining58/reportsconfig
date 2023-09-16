package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ResuableMethods {
	
	
	public static ExtentReports setExtentReportsConfiguration()
	{
		
      String path=  System.getProperty("user.dir")+"\\reports2\\report2.html";
		
		ExtentSparkReporter  reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Test Report");
		
		ExtentReports  extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;
		
		
	}

}
