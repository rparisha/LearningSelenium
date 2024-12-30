package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	
	public static String  getTestData(int rownumber, int cellNumber) throws InvalidFormatException, IOException {
		
		
		File file = new File("C:\\Users\\HEMANTH\\OneDrive\\Desktop\\TestingData.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet =  book.getSheetAt(0);
		
		return sheet.getRow(rownumber).getCell(cellNumber).getStringCellValue();
		
		
		
		
		
		
		
		
		
	
		
		
	}
	

}
