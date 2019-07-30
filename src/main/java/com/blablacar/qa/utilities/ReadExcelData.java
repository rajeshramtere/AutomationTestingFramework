package com.blablacar.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ReadExcelData(String excelPath) throws InvalidFormatException, IOException
	{
		File srcFile = new File(excelPath);
		FileInputStream fis = new FileInputStream(srcFile);
		//Read excel file - entry
		wb = new XSSFWorkbook(fis); //xlsx
		
		//get sheet
		sheet = wb.getSheetAt(0);
		wb.close();	
	}
	
	public String getCellData(int sheetNumber, int row, int column)
	{
		String data;
		try
		{
			data = sheet.getRow(row).getCell(column).getStringCellValue();
		}
		catch(Exception e){
			data = "";
		}
		return data;
	}
	
	public int getRowCount(int sheetIndex)
	{	
		int rowCount = wb.getSheetAt(sheetIndex).getLastRowNum() + 1;
		return rowCount;		
	}
		
	public int getColumnCount(int sheetIndex)
	{
		int noOfColumns = sheet.getRow(0).getLastCellNum();
		return noOfColumns;
	}
}
