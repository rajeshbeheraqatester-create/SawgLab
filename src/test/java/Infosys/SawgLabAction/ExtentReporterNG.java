package Infosys.SawgLabAction;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {


public  static ExtentReports getReportObject()
{
	String path = System.getProperty("user.dir") + "\\reports\\index.html";
	ExtentSparkReporter ESR = new ExtentSparkReporter(path);
	ESR.config().setReportName("Automation web Test");
	ESR.config().setDocumentTitle("Test Report");

	ExtentReports Extents = new ExtentReports();
	Extents.attachReporter(ESR);
	Extents.setSystemInfo("Tester", "Rajesh");
	Extents.createTest(path);
	return Extents ;
}
}