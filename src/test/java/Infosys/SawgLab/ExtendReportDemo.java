package Infosys.SawgLab;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportDemo {

	ExtentReports Extents;

	@BeforeTest
	public void Cofig() {
		// ExtentSparkReporter //ExtentReport

		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter ESR = new ExtentSparkReporter(path);
		ESR.config().setReportName("Automation web Test");
		ESR.config().setDocumentTitle("Test Report");

		Extents = new ExtentReports();
		Extents.attachReporter(ESR);
		Extents.setSystemInfo("Tester", "Rajesh");

	}

	@Test
	public void initialTest() {
		ExtentTest test = Extents.createTest("InitialTestDemo");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.getTitle());
		test.pass("Title successfully Fetched");
		driver.close();
		test.fail("Invalid test report");
		Extents.flush();

	}

}
