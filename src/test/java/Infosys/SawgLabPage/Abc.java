package Infosys.SawgLabPage;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Abc {

	
	@Test(dataProvider="getData")
	public void CheckOutPage(HashMap<String, String>data){
System.out.println(data.get("FirstName"));
System.out.println(data.get("LastName"));
System.out.println(data.get("Pincode"));
	
	
	}

	
	
	
	
	
	@DataProvider(name="getData")
	public Object[][] getData() {
		
			HashMap<String,String> Map1=new HashMap<String,String>();
			Map1.put("FirstName", "King");
			Map1.put("LastName", "Thor");
			Map1.put("Pincode", "786868");
			
			HashMap<String,String> Map2=new HashMap<String,String>();
			Map2.put("FirstName", "Rajesh");
			Map2.put("LastName", "Prince");
			Map2.put("Pincode", "754018");
			return new Object[][] {{Map1},{Map2}};
			
		}
	
	
}
