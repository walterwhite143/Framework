package com.automation.businessscripts;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.autoamation.testbase.BaseTest;
import com.automation.Utility.PojoUtility;
import com.automation.customizedexceptions.FrameworkException;
import com.automation.supporters.PropertiesReader;
import com.automation.supporters.PropertyReader2;
import com.relevantcodes.extentreports.LogStatus;

public class FipkartValidation  extends BaseTest  {
	@Test
	    
		public void ManageQuote() throws InterruptedException, IOException, FrameworkException {
		    
			PropertiesReader  prConfig = new PropertiesReader("C:\\Users\\harish\\Downloads\\java folder\\Framework\\src\\com\\automation\\businessscripts\\config.values");
			  String url =    prConfig.getPropertyValue("fP_url");
			 getDriver().get(url);	
			 getDriver().
			 //getExtentTest().log(LogStatus.INFO, "url entred scucessfully");
			PropertiesReader prOR  = new PropertiesReader("C:\\Users\\harish\\Downloads\\java folder\\Framework\\src\\com\\automation\\objectrepository\\config.properties");	  
			 Thread.sleep(4000);	
			 Thread.sleep(3000);
			String popu = PojoUtility.getconfigproperties().getPropertyValue("popu");		               
		                PojoUtility.getconfigproperties().getPropertyValue(popu);			                
			  WebElement popup =  getDriver().findElement(By.xpath(popu));
			 popup.click();
			  getExtentTest().log(LogStatus.INFO, "User able to click popup sucessfully");
			 Thread.sleep(4000);
			                 
			 String Fash= PojoUtility.getconfigproperties().getPropertyValue("Fash");
		      WebElement Fashion = getDriver().findElement(By.xpath(Fash));
		      Actions a = new Actions(getDriver());
	   			 a.moveToElement(Fashion).build().perform();
		                 Fashion.click();
		                  String MenTo= PojoUtility.getconfigproperties().getPropertyValue("MenTo");
		    		      WebElement MenTop = getDriver().findElement(By.xpath(MenTo));
		    		     Actions a1 = new Actions(getDriver());
		   			  a1.moveToElement(MenTop).build().perform();	
		    		                 MenTop.click();
		    		                  Thread.sleep(3000);		                  
			  String Me = PojoUtility.getconfigproperties().getPropertyValue("Me");
			 WebElement Men  = getDriver().findElement(By.xpath(Me));
			    List<  WebElement > Men2  =  getDriver().findElements(By.xpath("Me"));			                      
			// span[@class='_2I9KP_'][text()='Men']
			  Actions a2 = new Actions(getDriver());
			   a2.moveToElement(Men).build().perform();	
			   getExtentTest().log(LogStatus.INFO, "User able to move  men sucessfully");			   
			   Thread.sleep(2000);
			   String Clothin  = PojoUtility.getconfigproperties().getPropertyValue("Clothin");
			   WebElement Clothing  =    getDriver().findElement(By.xpath(Clothin));		   
			  // a[@title='Clothing'][@class='_3QN6WI _1MMnri _32YDvl']
			   if(Clothing.isDisplayed()&&Clothing.isEnabled()) {
			Clothing.click();
			   }
			   getExtentTest().log(LogStatus.INFO, "Clothing clicked sucessfully");
			System.out.println("Clothing  clicked sucessfully");
			Thread.sleep(4000);
			Thread.sleep(2000);
			String min_Pric = PojoUtility.getconfigproperties().getPropertyValue("min_Pric");
			WebElement min_Price = getDriver().findElement(By.xpath(min_Pric));
			//select[@class='_2YxCDZ'])[1]
			Select select = new Select(min_Price);		
			 select.selectByIndex(2);
			// getExtentTest().log(LogStatus.INFO ""+select);
			 getExtentTest().log(LogStatus.INFO, "selected minimum price ");
			 System.out.println("the value selected is "+select);
			 Thread.sleep(6000);		 
			 String max_Pric = PojoUtility.getconfigproperties().getPropertyValue("max_Pric");
			 WebElement max_Price = getDriver().findElement(By.xpath(max_Pric));
			// select[@class='_2YxCDZ'])[2]
			Select select2= new Select(max_Price);
			select2.selectByIndex(2);
			System.out.println("value selected  is "+select2);
			getExtentTest().log(LogStatus.INFO, "selected maximum price is");	
			Thread.sleep(3000);				
	}
}
		
		

	
		
	
		
