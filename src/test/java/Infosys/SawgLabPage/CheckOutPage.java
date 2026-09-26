package Infosys.SawgLabPage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

public class CheckOutPage {
	private WebDriver driver;
	private WebDriverWait wait;
	private SoftAssert s;
	private By FNameField = By.id("first-name");
	private By LNameField = By.id("last-name");
	private By PincodeField = By.id("postal-code");
	By ContinueButton = By.id("continue");
	private String ExpectedText = "Thank you for your order!";

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
		s = new SoftAssert();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	}

	public void checkOutPage(HashMap<String, String> data) throws InterruptedException, IOException {
		wait.until(ExpectedConditions.elementToBeClickable(FNameField)).sendKeys(data.get("FirstName"));
		wait.until(ExpectedConditions.elementToBeClickable(LNameField)).sendKeys(data.get("LastName"));
		wait.until(ExpectedConditions.elementToBeClickable(PincodeField)).sendKeys(data.get("Pincode"));
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton)).click();
		System.out.println("Finish");

		TakesScreenshot s = (TakesScreenshot) driver;
		File Src = s.getScreenshotAs(OutputType.FILE);
		File trg = new File("./FinishPage/Fullscreenshot.png");
		FileUtils.copyFile(Src, trg);
		driver.findElement(By.id("finish")).click();
		String ActualText = driver.findElement(By.cssSelector(".complete-header")).getText();
		if (ExpectedText.equals(ActualText)) {
			System.out.println("Happy shopping");
		}

	}

	@DataProvider(name = "getData")
	public static Object[][] getData() {
		{
			HashMap<String, String> Map1 = new HashMap<String, String>();
			Map1.put("FirstName", "King");
			Map1.put("LastName", "Thor");
			Map1.put("Pincode", "786868");
			
		
			HashMap<String, String> Map2 = new HashMap<String, String>();
			Map2.put("FirstName", "Rajesh");
			Map2.put("LastName", "Prince");
			Map2.put("Pincode", "754018");
	
			return new Object[][] { { Map1 }, { Map2 } };
		}
		
}
}

//		@DataProvider
//		public Object [][]getData(){ 

//			{
//			return new Object[][]{{"King","Thor","6796797"},{"Rajesh","King","6967877"}};
//		}
//				}
//}


