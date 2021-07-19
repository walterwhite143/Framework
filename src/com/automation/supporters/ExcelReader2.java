package com.automation.supporters;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader2 {
	private String  filepath;
	private  FileInputStream fileinputStream ;
	private Workbook workbook ;
	private Sheet sheet ;
	private Row row ;
	private Cell cell ;
	private String cellvalue ;
	public ExcelReader2(String filepath) throws EncryptedDocumentException, IOException {
		this.filepath = filepath;
		fileinputStream = new FileInputStream(filepath);
		workbook = WorkbookFactory.create(fileinputStream);
	}
	public Workbook isWorkBookNull() {
		Optional<Workbook> optional = Optional.ofNullable(workbook);
		if(optional.isPresent())  {
			System.out.println("workbook is avilable ");
		}
		else {
			System.out.println("workbook pointing to null");
		}
		return workbook ;
	}
	public Sheet getSheet(String sheetNameORIndex,String how) {
		if(how.equalsIgnoreCase("index")) {
			int sheetIndex = Integer.parseInt(sheetNameORIndex);
	           sheet =  workbook.getSheetAt(sheetIndex);
		}
		else if(how.equalsIgnoreCase("name")) {
			sheet =  workbook.getSheet(sheetNameORIndex);
		}
		return sheet ;	
		//  sheet object 
		//
	}
	public Row getRow(String sheetNameORIndex,String how,int rowNum) {
		sheet =getSheet( sheetNameORIndex,how);
		Optional<Sheet> optional = Optional.ofNullable(sheet);
		if(optional.isPresent()) {
		row =	sheet.getRow(rowNum);
		Optional<Row>  optional2 = Optional.ofNullable(row);	
		return null;
		}
		{
			//throw Exception
		}
		return row ;		
	}
	public Cell getCell(String sheetNameORIndex,String how,int rowNum,int cellNum) {
		 sheet = getSheet(sheetNameORIndex,how);
		Optional<Sheet> optional = Optional.ofNullable(sheet);
		if(optional.isPresent()) {
		    row =	sheet.getRow(rowNum);
		   Optional<Row> optional2   = Optional.ofNullable(row);
		   if(optional.isPresent()) {
		    cell =  row.getCell(cellNum);     
		}
		}
		else {
			//throw Exception
		}
		//return null;
		return cell ;		
	}
	public String getSingleCellData(String sheetNameORIndex,String how ,int rowNum,int CellNum) {
	cell =	getCell(sheetNameORIndex, how, rowNum, CellNum);
	if(cell.getCellType() == CellType.STRING) {
		cellvalue =cell.getStringCellValue();	
	}
else if (cell.getCellType()==CellType.NUMERIC) {
	           cellvalue =   cell.getNumericCellValue()+""	;
	}
	else if(cell.getCellType()==CellType.BOOLEAN) {
		  cellvalue =cell.getBooleanCellValue()+"";
	}
	return cellvalue;
	}
	
	public List<String> getTotalSheetData(String sheetName0RIndex,String how) {
		List<String> sheetData = new ArrayList<String>();	
		   sheet =  getSheet(sheetName0RIndex, how);
		   for(int i =0;i<sheet.getLastRowNum();i++) {
			  row =   sheet.getRow(i);
			  for(int j=0;j<row.getLastCellNum();j++) {
				    cell = row.getCell(j);
				    
				    if(cell.getCellType() == CellType.STRING) {
						cellvalue =cell.getStringCellValue();	
					}
				else if (cell.getCellType()==CellType.NUMERIC) {
					           cellvalue =   cell.getNumericCellValue()+""	;
					}
					else if(cell.getCellType()==CellType.BOOLEAN) {
						  cellvalue =cell.getBooleanCellValue()+"";
					}
					 sheetData.add(cellvalue);			    
			  }
		   }
		return sheetData;	
	}
	public static void main(String[]  args ) throws IOException 
	{		
		ExcelReader2  excelreader = new ExcelReader2("C:\\Users\\harish\\Documents\\Excelfolder\\Something.xlsx");
	   String data = 	excelreader.getSingleCellData("Sheet1", "name", 1, 0);
	   System.out.println(data);	
	  List<String> totaldata  =excelreader.getTotalSheetData("Sheet1", "name");
		                         
	  System.out.println(totaldata );
	}
}