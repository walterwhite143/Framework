package com.autoamation.reports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harish\\Downloads\\software\\chromedriver\\89version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		 driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");
			driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);	
		 driver.manage().window().maximize();
		 Thread.sleep(500);
		 WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='country']"));
			
		
}
	
}
