package Infosys.SawgLabPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class FinishPage {
	private WebDriver driver;
    private WebDriverWait wait;
    private SoftAssert s;
    
    public FinishPage(WebDriver driver)
    {
    this.driver=driver;
    s=new SoftAssert();
    wait=new WebDriverWait(driver,Duration.ofSeconds(5));
    
    }
    
   public void  LogOutProcess()
   {
	   driver.findElement(By.id("back-to-products")).click();
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-menu-btn")));
	   driver.findElement(By.id("react-burger-menu-btn")).click();
	   driver.findElement(By.id("logout_sidebar_link")).click();
	   System.out.println("Yes it is");
   }
    
    

}
