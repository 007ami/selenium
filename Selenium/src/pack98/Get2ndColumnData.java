package pack98;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Get2ndColumnData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis =new FileInputStream("C:\\Users\\Amit pachaury\\workspace1\\Selenium\\TestData\\RowData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		
		for (int i=0; i <=sh.getLastRowNum(); i++) {
			Row r = sh.getRow(i);
			Cell c = r.getCell(1);
			String data = c.getStringCellValue();
			System.out.println(data);
		}
		

	}

}
