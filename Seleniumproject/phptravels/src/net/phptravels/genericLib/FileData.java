package net.phptravels.genericLib;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileData {

	public String getExcelData(String SheetName, int rowNum, int ColNum) throws Throwable, InvalidFormatException, IOException{
		FileInputStream fis=  new FileInputStream("./TestData/input.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row r = sh.getRow(rowNum);
		Cell ch = r.getCell(ColNum);
		String data= ch.getStringCellValue();
		return data;	
	}
	
	public Properties getPropertyObject() throws Throwable{
		FileInputStream fis= new FileInputStream("./TestData/common.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		return pObj;
	}
	
}
