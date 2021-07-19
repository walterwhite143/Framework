package com.automation.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.autoamation.testbase.BaseTest;

import com.automation.supporters.PropertyReader2;
import com.relevantcodes.extentreports.LogStatus;

public class FlipkartVladiation2 extends BaseTest {
	private String cell11Value ;

	@Test
	public void validateFlipkart2() throws IOException, InterruptedException {	
		
		 getDriver().get("https://www.flipkart.com");
		 String popu = PropertyReader2.getValue("popu")	;	               
         //  PojoUtility.getconfigproperties().getPropertyValue(popu);			                
     WebElement popup =  getDriver().findElement(By.xpath(popu));
   popup.click();
   getExtentTest().log(LogStatus.INFO, "User able to click popup sucessfully");
//getExtentTest2().addScreenCapture(extentest.addScreenCapture(getImagePath()));
   Thread.sleep(4000);            
  String Fash= PropertyReader2.getValue("Fash");
  WebElement Fashion = getDriver().findElement(By.xpath(Fash));
                    //  getDriver().
   Actions a = new Actions(getDriver());
		 a.moveToElement(Fashion).build().perform();	
           // Fashion.click();
            String MenTo= PropertyReader2.getValue("MenTo");
		      WebElement MenTop = getDriver().findElement(By.xpath(MenTo));
		     // Actions a = new Actions(getDriver());
			 //  a.moveToElement(MenTop).build().perform();	
		                 MenTop.click();
		                  Thread.sleep(3000);		                  
  String Me = PropertyReader2.getValue("Me");
  WebElement Men  = getDriver().findElement(By.xpath(Me));			                      
//span[@class='_2I9KP_'][text()='Men']
 Actions a2 = new Actions(getDriver());
 a2.moveToElement(Men).build().perform();	
 getExtentTest().log(LogStatus.INFO, "User able to move  men sucessfully");	
 //getExtentTest().log
 Thread.sleep(4000);

 String Clothin  = PropertyReader2.getValue("Clothin");
   //  xpath values i kept  in a file  and read  those values  throught a paticular method 
 WebElement Clothing  =    getDriver().findElement(By.xpath(Clothin));	
 //getDEriver()
 FileInputStream fileinputStream2 = new FileInputStream("C:\\Users\\harish\\Documents\\Excelfolder\\Something.xlsx");
	Workbook  workbook =WorkbookFactory.create(fileinputStream2);
	    org.apache.poi.ss.usermodel.Sheet sheet =        workbook.getSheet("Sheet1");
	   Cell cell =   sheet.getRow(4).getCell(0);  
	       if(cell.getCellType() == CellType.STRING) {
               cell11Value =cell.getStringCellValue();
                System.out.println("1 row 2 cell"+cell11Value);
	        }
	                  String text =  Clothing.getText();
	                   // webelement clothing (selenium  xpath value) and excel lo clothing  value 
	                   //   simply i want  to print  the value  webelement  clthing = drive.finElement
	                  //  ( clothing i have taken from excel )
	                  // validation 
	                  if(text.contains(cell11Value) ){
	                	  System.out.println("it is clothing value");
	                  }
	                  else {
	                	  System.out.println("it is not clothing value ");
	                  }
 if(Clothing.isDisplayed()&&Clothing.isEnabled()) {
 Clothing.click();
 }
 //String s = "";
   //   s.rei
		
	}
}


//@Dataprovider
//harish  12345

