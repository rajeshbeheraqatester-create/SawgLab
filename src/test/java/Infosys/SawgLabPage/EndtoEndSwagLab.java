package Infosys.SawgLabPage;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EndtoEndSwagLab {

	public static void main(String[] args) throws IOException, InterruptedException {
		String Expectedlogo = "Swag Labs";
		String productname = "Sauce Labs Fleece Jacket";
		String ExpectedText = "Thank you for your order!";
//		// Login page
		Map<String, Object> pref = new HashedMap<String, Object>();
		pref.put("profile.password_manager_leak_detection", false);
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("pref", pref);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		

//		// HomePage
//		// Verify Logo name
//		String Actuallogo = driver.findElement(By.cssSelector(".app_logo")).getText();
//		if (Expectedlogo.equals(Actuallogo)) {
//			System.out.println("Actuallogo is showing");
//		}
		// Check productList and verify
//		List<WebElement> Products = driver.findElements(By.cssSelector(".inventory_item_name"));
//		for (WebElement product : Products) {
//			String productsname = product.getText();
//			if (productname.equals(productsname)) {
//				product.click();
//				break;
//			}
//		}
		// Add to cart and Verify cartList
//		driver.findElement(By.id("add-to-cart")).click();
//		driver.findElement(By.id("shopping_cart_container")).click();
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cart_item_label a div"));
		for (WebElement product : cartProducts) {
			String productsname = product.getText();
			if (productname.equals(productsname)) {
				System.out.println("Successful verified product is available");
				break;
			}
		}
		// Customer details
//		driver.findElement(By.id("checkout")).click();
//		driver.findElement(By.id("first-name")).sendKeys("King");
//		driver.findElement(By.id("last-name")).sendKeys(" Thar");
//		driver.findElement(By.id("postal-code")).sendKeys("999090");
//		driver.findElement(By.id("continue")).click();
		// Screenshot before FinishPage
//		TakesScreenshot s = (TakesScreenshot) driver;
//		File Src = s.getScreenshotAs(OutputType.FILE);
//		File trg = new File("./FinishPage/Fullscreenshot.png");
//		FileUtils.copyFile(Src, trg);
//		driver.findElement(By.id("finish")).click();
//		String ActualText = driver.findElement(By.cssSelector(".complete-header")).getText();
//		if (ExpectedText.equals(ActualText)) {
//			System.out.println("Happy shopping");
//		}
		// back and logout

		driver.findElement(By.id("back-to-products")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-menu-btn")));
		// wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
		// Thread.sleep(5000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();

		driver.close();
		System.out.println("Yes it is");

	}
}
