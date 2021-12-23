package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG extends base {
	 static ExtentReports extent;
	
	public static ExtentReports getReportObject()
	{
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path+ "\\reports\\index.html");
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		 extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Priya");
		return extent;
		
	}
}
