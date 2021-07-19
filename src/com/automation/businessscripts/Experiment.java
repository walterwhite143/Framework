package com.automation.businessscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.autoamation.testbase.ActionEngine;

public class Experiment extends ActionEngine {
  @Test
	public void validatePage() {
	  getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		getDriver().get("https://developer.salesforce.com/signup?d=70130000000td6N");
		
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\harish\\Downloads\\software\\chromedriver\\91 version\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
	//	String url = "https://developer.salesforce.com/signup?d=70130000000td6N";
	 // getDriver().get(url);
		//driver.get(url);
	  DTA("xpath", "//input[@id='first_name']", "firstname");	  
	  actionsClick("", "");
	  // public static void DTA(String locMech,String locValue,String testData)
	  
		
	}
}
