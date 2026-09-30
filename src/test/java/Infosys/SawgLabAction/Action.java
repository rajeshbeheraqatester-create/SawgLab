package Infosys.SawgLabAction ;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.Test;

import Infosys.SawgLabBase.Base;
import Infosys.SawgLabPage.CartPage;
import Infosys.SawgLabPage.CheckOutPage;
import Infosys.SawgLabPage.FinishPage;
import Infosys.SawgLabPage.HomePage;
import Infosys.SawgLabPage.LogInPage;
import Infosys.SawgLabPage.Page;

public class Action extends Base  {

    @Test(dataProvider="getData",dataProviderClass = CheckOutPage.class, groups="Purches")
    public void Execute(HashMap<String, String>data) throws InterruptedException, IOException {

    	LogInPage LIP= new LogInPage (driver);
        LIP.loginPage(getUsername(),getPassword());
        System.out.println("sucessfully login ");
    	LIP.verifyLoginAction();
    	HomePage HP= new HomePage(driver);
    	HP.HomePageProducts();
    	HP.addToCart();
    	CartPage CP= new CartPage(driver);
    	CP.openAddCart();
        CP.ClickCheckout();
        CheckOutPage COP=new CheckOutPage(driver);
        COP.checkOutPage(data);
        FinishPage FP=new FinishPage(driver);
        FP.LogOutProcess();
        
        System.out.println("Execution Done");
    }


}