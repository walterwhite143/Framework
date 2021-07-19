package com.automation.businessscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.autoamation.testbase.BaseTest;
import com.autoamation.testbase.BaseTest2;
import com.relevantcodes.extentreports.LogStatus;

public class Project  extends BaseTest2 {
	static String url;
	@Test
	public void  getTest() throws InterruptedException {
	//	DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome();
	//	handlSSLErr.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//WebDriver driver = new ChromeDriver(handlSSLErr);	
		getDriver2().manage().window().maximize();
		getDriver2().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// WebDriver driver = new ChromeDriver();
	   url = "https://52.163.62.118/";
		getDriver2().get(url);
		//driver.get("https://imarketxceed.b2clogin.com/imarketxceed.onmicrosoft.com/b2c_1_susi/oauth2/v2.0/authorize?response_type=id_token&scope=https%3A%2F%2Fimarketxceed.onmicrosoft.com%2F1abfb036-afb3-4027-a1ec-90c2205e67c6%2Fread%20openid%20profile&client_id=1abfb036-afb3-4027-a1ec-90c2205e67c6&redirect_uri=https%3A%2F%2F52.163.62.118%2Fredirect&state=eyJpZCI6IjYyNmQ0ZGMzLWZkMWItNGJiMC1iOGRlLTExNDgyODgwZDk0YiIsInRzIjoxNjE4NDg0MDg2LCJtZXRob2QiOiJyZWRpcmVjdEludGVyYWN0aW9uIn0%3D&nonce=0b4d36bd-d6ec-43f5-996e-f9264a7c2942&client_info=1&x-client-SKU=MSAL.JS&x-client-Ver=1.4.3&ui_locales=en&client-request-id=d893c09d-ef71-4f5e-b29e-5b72dc3ebe6e&response_mode=fragment);");
		Thread.sleep(1000);
		getDriver2().findElement(By.xpath("//button[@id='details-button']")).click();
		getExtentTest2().log(LogStatus.INFO, "url entred scucessfully");
		Thread.sleep(500);
		getDriver2().findElement(By.xpath("//a[@id='proceed-link']")).click();
		getExtentTest2().log(LogStatus.INFO, "url entred scucessfully");
		Thread.sleep(5000);	
		WebElement username = getDriver2().findElement(By.xpath("//input[@id='email' and @name ='Email Address']"));
		 getExtentTest2().log(LogStatus.INFO, "url entred scucessfully");
		username.sendKeys("2235@xceedance.com");
		WebElement password = getDriver2().findElement(By.xpath("//input[@name='Password']"));
		getExtentTest2().log(LogStatus.INFO, "url entred scucessfully");
		password.sendKeys("Pass@12345");
		// Thread.setDefaultUncaughtExceptionHandler(eh);
		WebElement login = getDriver2().findElement(By.xpath("//button[@type='submit']"));
		getExtentTest2().log(LogStatus.INFO, "url entred scucessfully");
		login.click();
		Thread.sleep(7000);

				Thread.sleep(10000);
		WebElement quote = getDriver2().findElement(By.xpath("//li[@class='nav-item xceed-hasmenu ng-star-inserted'][4]"));
		getExtentTest2().log(LogStatus.INFO, "url entred scucessfully");
			//Thread.sleep(5000);
		System.out.println("text    :" + quote.getText());
		Thread.sleep(5000);
		if (quote.isDisplayed()) {
			quote.click();
		} else {
			System.out.println("quote text is not visible");
		}
		Thread.sleep(2000);
		WebElement Quote_Number =   getDriver2().findElement(By.xpath("//input[@formcontrolname ='QuoteNo']"));
		getExtentTest2().log(LogStatus.INFO, "url entred scucessfully");
		            Quote_Number.sendKeys("94560");
	//	Quote_Number.click();
		            Thread.sleep(2000);
		     WebElement Client_Name =        getDriver2().findElement(By.xpath("//input[@formcontrolname ='ClientDisplayName']"));
		     Client_Name .sendKeys("dell");	
		     getExtentTest2().log(LogStatus.INFO, "url entred scucessfully");
		     Thread.sleep(2000);
		    // WebElement  planname = driver.findElement(By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c64-4 ng-star-inserted']"));
		     WebElement  planname =      getDriver2().findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c64-4']"));
		       planname.click();
		       getExtentTest2().log(LogStatus.INFO, "url entred scucessfully");
		         Thread.sleep(500);
		       WebElement iMarketVita = getDriver2().findElement(By.xpath("//*[contains(text(),' iMarket Vita ')]"));
		       iMarketVita.click();
		       getExtentTest2().log(LogStatus.INFO, "url entred scucessfully");
}
}
