package Infosys.SawgLabPage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CartPage {
	
	private WebDriver driver;
    private WebDriverWait wait;
    private SoftAssert s;
    String Expectedpn="Sauce Labs Fleece Jacket";
     private By AvailableCP=(By.cssSelector(".cart_item_label a div"));
    
    public CartPage(WebDriver driver) {

        this.driver = driver;
        s=new SoftAssert();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
	  public void openAddCart() throws InterruptedException
	    {
	     driver.findElement(By.id("shopping_cart_container")).click();	
	    Thread.sleep(4000);
	    
	    List<WebElement> AP = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AvailableCP));
	    for (WebElement product : AP) {
			String productsname = product.getText();
			if (Expectedpn.equals(productsname)) {
				System.out.println("Successful verified product is available");
				break;
			}
		}
	    
	   }
	  
	  public String getScreenshot() throws IOException
	  {
		TakesScreenshot ts=  (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./AddToCartfull.png");
		FileUtils.copyFile(src, trg);
		return System.getProperty("./AddToCartfull.png");
		
	  }
	  //Extend Report
	  
	  
	  
	  
	  public void ClickCheckout() throws InterruptedException
	    {
	    	
	    	driver.findElement(By.id("checkout")).click();
	    	System.out.println("Add details then continue");
	    	Thread.sleep(4000);
	    	    }

}
