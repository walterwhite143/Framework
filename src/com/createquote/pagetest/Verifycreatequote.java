package com.createquote.pagetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autoamation.testbase.BaseTest;
import com.automation.pageobjects.FlipkartPage;
import com.createquote.pageobject.CreateQuote;

public class Verifycreatequote extends BaseTest {
	//public Verifycreatequote() {
	//	super();
	//}
//@BeforeMethod
//public void setUp() throws InterruptedException {
		//openBrowser("chrome");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\harish\\Downloads\\software\\chromedriver\\89version\\chromedriver.exe");
		//DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome();
		//handlSSLErr.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		// driver = new ChromeDriver(handlSSLErr);
	//	driver.get("https://52.163.62.118");
		//driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	//}	
@Test
public  void validateCreatequote() throws InterruptedException {
	                    getDriver().get("https://52.163.62.118");
	                    CreateQuote  cr = new CreateQuote(getDriver());
	                    cr.login();                    
	                    Thread.sleep(2000);
}
//@AfterMethod
//public void tearTown() {
//getDriver().quit();

}
//}