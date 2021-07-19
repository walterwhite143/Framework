package com.automation.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.autoamation.testbase.BaseTest;
import com.autoamation.testbase.BaseTest2;

public interface ScreenshotUtility {
	
	public static String takeScreenshot() throws IOException {
	TakesScreenshot  takesScreenshot =(TakesScreenshot)BaseTest.getDriver();
	
	      // takesScreenshot.getScreenshotAs(arg0)
	File f = takesScreenshot.getScreenshotAs(OutputType.FILE);
	String imagePath =   BaseTest.getImagePath();
	//BaseTest.getTcName();
	FileUtils.copyFile(f, new File(imagePath));
	// C:\\Users\\harish\\Documents"+tcname+".jpg
	return imagePath;	
}
}
