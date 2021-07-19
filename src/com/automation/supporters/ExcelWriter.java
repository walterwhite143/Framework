package com.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWriter {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream  fileinputStream2 = new FileInputStream("C:\\Users\\harish\\Documents\\Excelfolder\\testdata.xlsx");
		   Workbook  workbook =        WorkbookFactory.create(fileinputStream2);
		           Sheet sheet2 =       workbook.getSheet("sheet2");
		             Row row1 =    sheet2.getRow(0);
		                 Cell  cell =     row1.createCell(1);
		                       cell.setCellValue("buddy");
		                    Row row2 =  sheet2.getRow(1);
		                      Cell cell2=     row2.createCell(3);
		                         cell2.setCellValue("ashnamisra");
		                         Row row3 =sheet2.getRow(2);
		                               // Cell cell3     = row3.createCell(4);
		                               //     cell3.setCellValue("bindas");     
		                  FileOutputStream fop = new FileOutputStream("C:\\Users\\harish\\Documents\\Excelfolder\\testdata.xlsx");
		                   workbook.write(fop);	                   

	}

}
