package Infosys.SawgLabPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class LogInPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private SoftAssert s;
    public LogInPage(WebDriver driver) {

        this.driver = driver;
        s=new SoftAssert();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    

    // SauceDemo locators
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
            By loginButton = By.id("login-button");
            private By Actuallogo=By.cssSelector(".app_logo");      
            // Login method
            public void loginPage(String username, String password) {

                wait.until(ExpectedConditions
                        .elementToBeClickable(usernameField))
                        .sendKeys(username);

                wait.until(ExpectedConditions
                        .elementToBeClickable(passwordField))
                        .sendKeys(password);

                wait.until(ExpectedConditions
                        .elementToBeClickable(loginButton))
                        .click();
                
               
                
            }
            public void verifyLoginAction()
            {
            	String expectedLogo = "Swag Labs";
            	String actualLogoValue = wait.until(ExpectedConditions.visibilityOfElementLocated(Actuallogo)).getText();
//            	Reporter.log(actualLogoValue);
//            	Reporter.log(expectedLogo);
                s.assertEquals(expectedLogo,actualLogoValue);
                s.assertAll();
                System.out.println("Logo verification pass");
            }
}
