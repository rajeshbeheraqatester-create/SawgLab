package Infosys.SawgLabPage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class HomePage {
	
		    private WebDriver driver;
		    private WebDriverWait wait;
		    private SoftAssert s;
		    String Expectedpn="Sauce Labs Fleece Jacket";
		    private By products=By.cssSelector(".inventory_item_name");
		    private By favProd=By.id("add-to-cart");
		    
		    
		    
		    
		    public HomePage(WebDriver driver) {

		        this.driver = driver;
		        s=new SoftAssert();
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    }
		    

	    

public void HomePageProducts()
   {
	    	
			List<WebElement>productlist=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(products));
			for(WebElement product:productlist)	
			{
				String Actualpn=product.getText();
//				String Expectedpn="Sauce Labs Fleece Jacket";
				System.out.println(Actualpn);
				
				if(Actualpn.equals(Expectedpn)) {
					product.click();	
					break;
					}
				
				
				}

   }

public void addToCart() {
	
	   wait.until(ExpectedConditions.elementToBeClickable(favProd)).click();
		System.out.println("Product added");	
	    }
}
