package com.autoamation.testbase;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.automation.Utility.ScreenshotUtility;
import com.automation.customizedexceptions.FrameworkException;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest2 {
	 private static  WebDriver driver;
	 private static String tcname ;
	 private static ExtentReports  extentReports;
	private static  ExtentTest  extentest;
	 @Parameters("browser")
	 @BeforeSuite
	public  void openBrowser(@Optional("chrome") String browser) {
		if(browser.equalsIgnoreCase("chrome"))  {
		//String  curDir = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver",  "C:\\Users\\harish\\Downloads\\chromedriver85\\chromedriver.exe");
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\harish\\Downloads\\software\\chromedriver\\91 version\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver",  "C:\\Users\\harish\\Downloads\\chromedriver85\\chromedriver.exe");
		//	System.setProperty("C:\\Users\\harish\\Downloads\\Compressed\\chromedriver_win32.zip\\chromedriver.exe");
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harish\\Downloads\\driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\harish\\Downloads\\software\\chromedriver\\89version\\chromedriver.exe");
			DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome();
			handlSSLErr.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			 driver = new ChromeDriver(handlSSLErr);
		 driver = new ChromeDriver();
		 init();
		}
		else if(browser.equalsIgnoreCase("ie"))  {
			String  curDir = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",  "C:\\Users\\harish\\Downloads\\chromedriver85\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);	
		//	WnDriverwait wb = new WbDriverwait(0)
		//	WebDriverWait w = new WebDriverWait(null, 0);			            //   w.el
			}
}
	 @BeforeMethod
	 public void  beforeTestExecution(Method method ) {
		                            
		 //  Method refelex ap i have parameters  method.getName ()  mis method 
		  tcname = method.getName();           
		 System.out.println("current execution of tc is "+tcname);	
		 extentest = extentReports.startTest(tcname);
		 getExtentTest2().log(LogStatus.INFO, "Current Execution TC is "+tcname);	 
		// 1. This method executed 1 st 	 
	 }
	 @AfterMethod
	 public void afterTestExecution(ITestResult result) throws IOException {
		// ITestResult	 
		long l = result.getEndMillis();	
		String host = result.getHost();
		String tcname = result.getName();
		    int count =      result.getStatus();	
		    // int count = result .getStataus();
		    //if(result.getStatus()==ITestResult.SUCESS)
		    //if(result.getStatus() ==ITestResult.SUCESS
	    		System.out.println(tcname+ "status = "+result.getStatus());
		if(result.getStatus() == ITestResult.SUCCESS) {
			System.out.println("tc is passed "+tcname);
			 ScreenshotUtility.takeScreenshot();
			 getExtentTest2().log(LogStatus.PASS, tcname+"TC IS PASSED");
			 getExtentTest2().addScreenCapture(extentest.addScreenCapture(getImagePath()));
		TakesScreenshot  takesScreenshot =(TakesScreenshot)driver;
			File f = takesScreenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\harish\\Documents\\new reportfolder\\Screenshotfolder"+tcname+".jpg"));			
		}
		else if(result.getStatus() == ITestResult.FAILURE) {
			System.out.println("tc is failed "+tcname);	
			TakesScreenshot  takesScreenshot =(TakesScreenshot)driver;			
		File f = takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\harish\\Documents"+tcname+".jpg"));		
		}	
		else if(result.getStatus() == ITestResult.SKIP) {
			System.out.println("tc is skipped  "+tcname);	
			TakesScreenshot  takesScreenshot =(TakesScreenshot)driver;
			File f = takesScreenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\harish\\Documents"+tcname+".jpg"));	
			//FileUtils.cop
		}	
	//	extentReports.endTest(extentTest);		
	 }	 
public void init() {
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);	

}	
@AfterSuite
public void closeBrowser() throws FrameworkException {
    java.util.Optional<WebDriver> optional =java.util.Optional.ofNullable(driver); 
    if(optional.isPresent()) {
    	driver.close();
    }
    else {
    	System.out.println("driver pointing to null ");
    	FrameworkException  frameworkException = new FrameworkException("driver pointing to null ");
    	throw frameworkException;
    }
	
	//if(driver!=null) {
	//	driver.close();
	//}
	
}
// getter method to acess outside of the class 
// afterSuite
@BeforeTest
public void  initReports() {
	 // extentReports = new ExtentReports("C:\\Users\\harish\\\\report.html");
	  extentReports = new ExtentReports("C:\\Users\\harish\\Documents\\new reportfolder\\report.html");
	  //C:\Users\harish\Documents\Reportfolder	
}
@AfterTest
public void closeReports() {
	extentReports .flush();
	extentReports.close();
	
}
public static WebDriver getDriver2() {
	return driver;
}
public static String  getTcName() {	
	return tcname;	
}
public static String getImagePath() {
	//String path = "C:\\Users\\harish\\Documents"+tcname+".jpg";
	String path = "C:\\Users\\harish\\Documents\\new reportfolder\\report.html"+tcname+".jpg";
	return path;	
}
public static  ExtentTest  getExtentTest2() {
	return   extentest;
}
}
