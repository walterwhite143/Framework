package com.automation.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil {
	static Workbook book ;
	static Sheet sheet ;
    public static String TESTDATA_SHEET_PATH = "C:\\Users\\harish\\Documents\\Excelfolder\\Dataprovider.xlsx";
	public static Object[][] getTestData(String sheetname) throws EncryptedDocumentException, IOException {	
		//  object array return type 
		FileInputStream file = null ;
		try {
			 file = new FileInputStream(TESTDATA_SHEET_PATH);		 
		} catch(FileNotFoundException e) {
			 e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
			//  path 
			// book
		} catch(InvalidFormatException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}	
	  sheet = book.getSheet(sheetname);
		Object[][]  data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		//  first  all rows 
		//  1,0 ,11 // each row and column 
		  for(int i =0;i<sheet.getLastRowNum();i++) {
			  for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
				  data[i][k] = sheet.getRow(i+1).getCell(k).toString();
				  // ik = 1,0  1,1
				  //  2,0 , 2,2
			  }
		  }
		  return data ;		
	}
}

