package com.automation.supporters;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {                                                                              	
			public static void main(String[] args) throws EncryptedDocumentException, IOException  {
					
		//FileInputStream  fileinputStream = new FileInputStream("C:\\Users\\harish\\Documents\\Excelfolder\\testdata.xlsx");
	//	FileInputStream fileinputStream2 = new FileInputStream("C:\\Users\\harish\\Documents\\Excelfolder\\Experiment.xlsx");
		FileInputStream fileinputStream2 = new FileInputStream("C:\\Users\\harish\\Documents\\Excelfolder\\Something.xlsx");
	
		Workbook  workbook =WorkbookFactory.create(fileinputStream2);
		                      
		                 
		    Sheet sheet1 =     workbook.getSheet("Sheet1");                       
		    // Cell cell = row1.getCell(0);
		    //	    
		    //   WorkBook  workbbok = WorkBookFactory.create("");
		    // Shhet sheet1  = workbook.create("Sheet1");
		                       
		  //  int  totalrows =  sheet1.getLastRowNum();
		  // Row row1 =    sheet1.getRow(0);
		                                     
		     //                                          Iterator<Cell>    cells = row1.cellIterator();
		        // Cell cello =  row1.getCell(0);
		         // String cellooValue = cello.getStringCellValue();
		        //       System.out.println("o row  o cell "+cellooValue);
		         //          Cell cell01 =   row1.getCell(1);
		          //      System.out.println("o row 1 cell"+cell01);
		          //      Cell cell02 =  row1.getCell(2);            
		           //    String cell01Value = cell02.getStringCellValue(); 
		           //    System.out.println(" o  row 2 cell"+cell01Value);	                 
		           //    Row row2  = sheet1.getRow(1);
		            //        Cell cell10=  row2.getCell(0);
		             //         String cell10Value = cell10.getStringCellValue();
		              //       System.out.println("1 row  0cell "+cell10);
		              //         Cell cell11 =   row2.getCell(1);
		                //          if(cell11.getCellType() == CellType.STRING) {
		                 //          String cell11Value =cell11.getStringCellValue();
		                 //        System.out.println("1 row 2 cell"+cell11);
		                     //    }
		                    //      else if(cell11.getCellType()== CellType.NUMERIC) {
		                     //    	  double Value =cell11.getNumericCellValue();
				              //          System.out.println("1 row 2 cell"+cell11);
		                            	 
		                       //    }
		    //  how 2 for loops works is a question ?
		                //  i<10 ;i++;
		               //    condition true 
		    // 2 
		    // o and 1 and 2 and 3 values it will compare	
		    // 1 value will be for row  and 2 one is for column data 
		                         for(int i = 0;i<sheet1.getLastRowNum();i++) 
		                          {
		                      		   	Row row = sheet1.getRow(i);			                      		   	             
		                      		    	for(int j=0;j<row.getLastCellNum();j++) 
		                      		    	{
		                      		    		Cell cell = row.getCell(j);
		                      		    		//Cell cell = row.getCell(j);
		                      		    		// if(cell.getecEllType()==CellType.Strinhg		                      		    		
		  
		                      		    		if(cell.getCellType() == CellType.STRING)
		                      		    		 {
		                      		    		System.out.println(cell.getStringCellValue());
		                      		    	    }
		                      		   	     else if(cell.getCellType() == CellType.NUMERIC) 
		                      		   	     	{
		                      		        	System.out.println(cell.getNumericCellValue());
		                      		        	}
		                      		    		else if(cell.getCellType() == CellType.BOOLEAN) 
		                      		    		{
		                      		    			System.out.println(cell.getBooleanCellValue());
		                      		   		     }
	                      		    			
		                      		    	}		                          
			}
			}
}







