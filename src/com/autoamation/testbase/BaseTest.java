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
import org.openqa.selenium.support.ui.WebDriverWait;
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

public class BaseTest   {
	 private static  WebDriver driver;
	 private static String tcname ;
	 private static ExtentReports  extentReports;
	private static  ExtentTest  extentest;
	 @Parameters("browser")
	 @BeforeSuite
	public  void openBrowser(@Optional("chrome") String browser) {
		if(browser.equalsIgnoreCase("chrome"))  {
			
		//String  curDir = System.getProperty("user.dir");
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harish\\Downloads\\software\\chromedriver\\91 version\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\harish\\Downloads\\software\\chromedriver\\89version\\chromedriver.exe");		
			DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome();
			handlSSLErr.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			 driver = new ChromeDriver(handlSSLErr);
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
		 //before test 
		                            
		 //  Method refelex ap i have parameters  method.getName ()  mis method 
		  tcname = method.getName();  
		  //  method.getname
		 System.out.println("current execution of tc is "+tcname);	
		                //extentReports.start
		 // 
		 extentest = extentReports.startTest(tcname);
		            // extentReports.start
		 getExtentTest().log(LogStatus.INFO, "Current Execution TC is "+tcname);	 
		// 1. This method executed 1 st 	 
	 }
	 @AfterMethod
	
	 public void afterTestExecution(ITestResult result) throws IOException {
		//  public void after TestExecution(ITestResult  result)
		// ITestResult	 
		long l = result.getEndMillis();	
		String host = result.getHost();
		//1 ,2 ,3
		// name
		String tcname = result.getName();
		    int count =   result.getStatus();
		       
		    // int count = result .getStataus();
		    //if(result.getStatus()==ITestResult.SUCESS)
		    //if(result.getStatus() ==ITestResult.SUCESS
	    		System.out.println(tcname+ "status = "+result.getStatus());
		if(result.getStatus() == ITestResult.SUCCESS) {
			System.out.println("tc is passed "+tcname);
			 ScreenshotUtility.takeScreenshot();
			 getExtentTest().log(LogStatus.PASS, tcname+"TC IS PASSED");
			//  getExtentTest().log(LogStatus.PASS, details);
			 getExtentTest().addScreenCapture(extentest.addScreenCapture(getImagePath()));
		TakesScreenshot  takesScreenshot =(TakesScreenshot)driver;
			File f = takesScreenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\harish\\Documents\\Screenshotfolder"+tcname+".jpg"));			
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
    	///
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
	  extentReports = new ExtentReports("C:\\Users\\harish\\Documents\\Reportfolder\\report.html");
	  //
	  
	 //  extentReports = new ExtentReports("");
	  //C:\Users\harish\Documents\Reportfolder	
}
@AfterTest
public void closeReports() {
	extentReports .flush();
	//extentReports.close();
	
}
public static  WebDriver getDriver() {
	// WebElement value = driver.findElement
	
	return driver;
}
public static String  getTcName() {	
	return tcname;	
}
public static String getImagePath() {
	//String path = "C:\\Users\\harish\\Documents"+tcname+".jpg";
	String path = "C:\\Users\\harish\\Documents\\Reportfolder\\report.html"+tcname+".jpg";
	return path;	
}
  public static  ExtentTest  getExtentTest() {
	return   extentest;	
}

public static String getObjectRepositoryPath() {
	  String path ="C:\\Users\\harish\\Downloads\\java folder\\Framework\\src\\com\\automation\\objectrepository\\config.properties";
	return path;	
}
public static String getValue() {
	String path = "C:\\Users\\harish\\Downloads\\java folder\\Framework\\src\\com\\automation\\businessscripts\\config.values";
	return path;
}
}