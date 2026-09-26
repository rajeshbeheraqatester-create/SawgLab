package Infosys.SawgLabPage;

import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Page {

    private WebDriver driver;
    private WebDriverWait wait;
    private SoftAssert s;

//    String Expectedpn="Sauce Labs Fleece Jacket";
//    private By products=By.cssSelector(".inventory_item_name");
//    private By favProd=By.id("add-to-cart");
//    private By AvailableCP=(By.cssSelector(".cart_item_label a div"));
           
    // Constructor
//    public Page(WebDriver driver) {
//
//        this.driver = driver;
//        s=new SoftAssert();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    }

//    // SauceDemo locators
//    private By usernameField = By.id("user-name");
//    private By passwordField = By.id("password");
//            By loginButton = By.id("login-button");
            
//           
//    private By FNameField=By.id("first-name");
//    private By LNameField=By.id("last-name");
//    private By PincodeField=By.id("postal-code");
//    	    By ContinueButton=By.id("continue");
   
    // Login method
//    public void loginPage(String username, String password) {
//
//        wait.until(ExpectedConditions
//                .elementToBeClickable(usernameField))
//                .sendKeys(username);
//
//        wait.until(ExpectedConditions
//                .elementToBeClickable(passwordField))
//                .sendKeys(password);
//
//        wait.until(ExpectedConditions
//                .elementToBeClickable(loginButton))
//                .click();
//       
//        
//    }
    
//    public void verifyLoginAction()
//    {
//    	String expectedLogo = "Swag Labs";
//    	String actualLogoValue = wait.until(ExpectedConditions.visibilityOfElementLocated(Actuallogo)).getText();
////    	Reporter.log(actualLogoValue);
////    	Reporter.log(expectedLogo);
//        s.assertEquals(expectedLogo,actualLogoValue);
//        s.assertAll();
//        System.out.println("Logo verification pass");
//    }
//    public void HomePageProducts()
//    {
//    	
//		List<WebElement>productlist=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(products));
//		for(WebElement product:productlist)	
//		{
//			String Actualpn=product.getText();
////			String Expectedpn="Sauce Labs Fleece Jacket";
//			System.out.println(Actualpn);
//			
//			if(Actualpn.equals(Expectedpn)) {
//				product.click();	
//				break;
//				}
//			
//			
//			}
	
			
			
//		}
//    
//    public void addToCart() {
//    	
//   wait.until(ExpectedConditions.elementToBeClickable(favProd)).click();
//	System.out.println("Product added");	
//    }
//    public void openAddCart() throws InterruptedException
//    {
//     driver.findElement(By.id("shopping_cart_container")).click();	
//    Thread.sleep(4000);
//    
//    List<WebElement> AP = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AvailableCP));
//    for (WebElement product : AP) {
//		String productsname = product.getText();
//		if (Expectedpn.equals(productsname)) {
//			System.out.println("Successful verified product is available");
//			break;
//		}
//	}
//    
//   }
//    public void ClickCheckout() throws InterruptedException
//    {
//    	
//    	driver.findElement(By.id("checkout")).click();
//    	System.out.println("Add details then continue");
//    	Thread.sleep(4000);
//    	    }

    
//   public void CheckOutPage(String FirstName,String LastName,String pincode) throws InterruptedException {
//    wait.until(ExpectedConditions.elementToBeClickable(FNameField)).sendKeys(FirstName);	 
//    wait.until(ExpectedConditions.elementToBeClickable(LNameField)).sendKeys(LastName);	 
//    wait.until(ExpectedConditions.elementToBeClickable(PincodeField)).sendKeys(pincode);	
//    Thread.sleep(4000);
//    wait.until(ExpectedConditions.elementToBeClickable(ContinueButton)).click();	
//    
//    System.out.println("Finish");
//
//}


}



