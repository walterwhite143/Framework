package com.automation.businessscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.automation.Utility.TestUtil;

public class PracticeTest {
	WebDriver driver;
     @BeforeMethod
	 public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harish\\Downloads\\software\\chromedriver\\91 version\\chromedriver.exe");	
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");
	}
	@DataProvider
	public Object[][]  getloginData() throws EncryptedDocumentException, IOException {
		Object data [][] = TestUtil.getTestData("Values");
		return data ;	
	 }
   	@Test(dataProvider = "getloginData")
	// these values iam getting from excel 
	//firstname,lastname
	   public void validatedataProvider (String firstname ,String lastname) throws InterruptedException {
		//getDriver().get("https://developer.salesforce.com/signup?d=70130000000td6N");		
		// getDriver().findElement(By.xpath("//*[@id="first_name"]"));
		Thread.sleep(1000);
		 WebElement f_name =  driver.findElement(By.xpath("//input[@id='first_name']"));		
		 f_name.sendKeys(firstname);
		 //   excel  
		  String value1 =f_name.getText();
		  System.out.println("the firstname text is "+value1);
		 WebElement la_name = driver.findElement(By.xpath("//input[@id='last_name']"));
		 la_name.sendKeys(lastname);
		 Thread.sleep(1000);
		 String value = la_name.getText();
		 System.out.println("the value of lastname is "+value);
		 //  WebElement emailaddress =    driver.findElement(By.xpath("//input[@id='email']")); 
		 //  WebElement company =    driver.findElement(By.xpath("//input[@id='company']"));
	 }
	 @AfterMethod
	 public void teardown() {
		driver.quit();	
	  }
}
