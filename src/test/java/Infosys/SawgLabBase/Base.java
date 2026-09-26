package Infosys.SawgLabBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base {

    protected WebDriver driver;
    public Properties p;

    @BeforeSuite
    public void loadProperties() throws IOException {

        FileInputStream fis = new FileInputStream("C:\\\\Users\\\\rajes\\\\eclipse-workspace\\\\SawgLab\\\\src\\\\test\\\\java\\\\SwagLAb.properties");

        p = new Properties();
        p.load(fis);

        fis.close();

        System.out.println("Properties file loaded");
    }

    @BeforeMethod
    public void openBrowser() {

        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();

        // Disable Chrome password popup
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);

        options.addArguments("--disable-features=PasswordLeakDetection");

        // Start Chrome
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.get(getUrl());

        System.out.println("Browser opened");
    }

    @AfterMethod
    public void closeBrowser() {

        if (driver != null) {
            driver.quit();
        }
    }

    public String getUrl() {

        return p.getProperty("url");
    }

    public String getUsername() {

        return p.getProperty("username");
    }

    public String getPassword() {

        return p.getProperty("password");
    }
    public String getScreenshot(String testCaseName) throws IOException
	  {
		TakesScreenshot ts=  (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./AddToCartfull.png");
		FileUtils.copyFile(src, trg);
		return System.getProperty("./AddToCartfull.png");
		
	  }
//    public String getFName() {
//    return p.getProperty("FirstName");
//    }
//    public String getLName()
//    {
//		return p.getProperty("LastName");
//    	
//    }
//    public String getPin() {
//    	return p.getProperty("pincode");
//    }
}









