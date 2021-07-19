package com.automation.businessscripts;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


import com.autoamation.testbase.BaseTest;

public class Amazon extends BaseTest{
   @Test
	public void validate() {
	   getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url = "https://developer.salesforce.com/signup?d=70130000000td6N";
	  getDriver().get(url);
	  
	 	
}
}
