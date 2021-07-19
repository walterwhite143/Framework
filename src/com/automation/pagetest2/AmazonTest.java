package com.automation.pagetest2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.pageobjects2.AmazonPage;



public class AmazonTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harish\\Downloads\\driver\\chromedriver.exe");;
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
@Test
public  void testApp() throws InterruptedException {		
		//AmazonPage	am  = PageFactory.initElements(driver, AmazonPage.class);
	          AmazonPage am  = PageFactory.initElements(driver, AmazonPage.class);
	                                    //     WebDriver driver = new Chrome Driver
	                                   //  driver.findElement(By.xpath("");
	                                  //   whole class driver will be provided 
	                                  // this keyword to provide value dynamically 
	                                 //
	                     am.enter_ElementSearchBar("iphone 12 phone");
	                     //am.search_ElementClick();
	                     am.search_4_Element();
	                     am.clickStarElement(driver);
	                     am.Add_Cart();
	                     am.Procced_Buy();
	                     am.UserName();
	                     am.Continue();
	                     am.password();            
	            // am.enter_ElementSearchBar("iphone 12 phone");
	            // am.search_ElementClick();
	           // am.search_4_Element();
	            // am.clickStarElement(driver);
	            // am.Add_Cart();
	            // am.Procced_Buy();
	            // am.UserName();
	           //  am.Continue();
	           //  am.password();
}
@AfterMethod
public void tearTown() {
driver.quit();
}
}



