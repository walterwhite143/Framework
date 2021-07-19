
package com.automation.pagetest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autoamation.testbase.BaseTest;
import com.automation.pageobjects.FlipkartPage;

public class VerifyFlipkart {
	 	
	WebDriver driver;
	@BeforeMethod
public void setUp() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\harish\\Downloads\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harish\\Downloads\\software\\chromedriver\\89version\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}	
@Test
public  void testFilpkartPage() throws InterruptedException {
	 FlipkartPage  flipkart = PageFactory.initElements(driver, FlipkartPage.class);
	 //                      
	 
	        //     PageFactory.initElements(factory, page);
	 //          object create  acesss 
	 
	 Thread.sleep(2000);
	          flipkart.popUp();
	          Thread.sleep(3000);
	          //fashion
	          // mento
	          flipkart.Fashion();
	          flipkart.Men();
	          flipkart .Clothing();          
	          flipkart.Min_Price();
	          flipkart.Max_Price();
	  Thread.sleep(2000);
}
@AfterMethod
public void tearTown() {
driver.quit();
}
}



