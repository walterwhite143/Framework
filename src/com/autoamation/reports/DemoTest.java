package com.autoamation.reports;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ExtentReports  extentReports = new ExtentReports("C:\\Users\\harish\\Documents\\report.html");
		//  class 
		// ExtentReports  extentReports = new ExtentReports("C:\\Users\\harish\\Documents\\report.html");		 
		// ExtendReports  extendReports = new ExtentReports("");
		  //  extentReports.startTest("DropdownValidation");		                        
		  ExtentTest  extentTest =  extentReports.startTest("FlipkartValidation");
		 //  extentReports.start
	  //	 ExtentTest extentTest = extentReports.startTest("FlipkartValidation");	                         
		   // extentTest.log(logStatus, details);
		   //  extentTest.log(logStatus, details);		 		 
		      extentTest.log(LogStatus.INFO, "Browser is opened ");
		      // extentTest.log(LogStatus.INFO,"Browser is opened ");
		      
		      extentTest.log(LogStatus.INFO, "url in entred ");
		      extentTest.log(LogStatus.INFO, "entered  flipkart value ");
		   extentReports.endTest(extentTest); 
		  extentReports.flush();
		  extentReports.close();
	}
	

}
