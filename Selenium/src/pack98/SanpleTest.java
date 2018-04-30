package pack98;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SanpleTest {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("‪C:\\Users\\Amit pachaury\\Desktop\\input.xlsx");
		// Create Workbook
		Workbook wb = WorkbookFactory.create(fis);

		// Get the Sheet
		Sheet sh = wb.getSheet("Sheet1");

		// Get the Row

		Row r = sh.getRow(0);

		// Get the cell
		Cell c = r.getCell(0);

		// get the data

		String data = c.getStringCellValue();

		System.out.println(data);

	}

}
