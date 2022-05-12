package com.HrmProject.utility;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider  { 
	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
	String path=System.getProperty("user.dir")+"\\TestData\\testdata.xlsx";
	
	File src= new File(path);
	FileInputStream file=new FileInputStream(src);
	wb=new XSSFWorkbook(file);
	}
	public String getStringData(String sheet, int row,int cell) {
		return wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		
	}
	public double getNumericData(String sheet, int row,int cell) {
		return wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		
	}
	
}
