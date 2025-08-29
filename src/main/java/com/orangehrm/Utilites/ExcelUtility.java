package com.orangehrm.Utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility 
{

	public static Object[][] testData(String excelPath,String sheetName) throws IOException
	{
		File file = new File(excelPath);
		FileInputStream fs = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet worksheet = workbook.getSheet(sheetName);
		int rowLength =  worksheet.getPhysicalNumberOfRows();
		String[][] data = new String[rowLength][2];
		for(int i=0;i<rowLength;i++)
		{
			 data[i][0] = worksheet.getRow(i).getCell(0).getStringCellValue();
	         data[i][1] = worksheet.getRow(i).getCell(1).getStringCellValue();
		}
		return data;
	}
}
