package org.testleaf.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public  String[][] ReadExcel(String excelFilename) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook book = new XSSFWorkbook("./data/" +excelFilename+".xlsx");
		 
		 XSSFSheet sheet = book.getSheet("USERS");
		 int lastRowNum = sheet.getLastRowNum();
		 short lastCellNum = sheet.getRow(0).getLastCellNum();
		 System.out.println("Last row number" +lastRowNum);
		 System.out.println("Last cell number" +lastCellNum);
		 String[][] data = new String[lastRowNum][lastCellNum];
		 
		 for (int i =1 ; i<=lastRowNum; i++) {
			 XSSFRow row = sheet.getRow(i);
			for(int j= 0; j<lastCellNum;j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				//System.out.println(stringCellValue);
				data[i-1][j] = stringCellValue;
				System.out.println("the name is" +data[0][1]);
			}
		 }
		 return data;
	}

}
