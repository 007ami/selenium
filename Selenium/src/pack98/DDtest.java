package pack98;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDtest {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis =new FileInputStream("./TestData/input.xlsx");
		FileInputStream fis1 = new FileInputStream("C:\\Users\\Amit pachaury\\workspace1\\Selenium\\TestData\\Common.properties");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(0);
		Cell c = r.getCell(0);
		String data = c.getStringCellValue();
		
		Properties pobj= new Properties();
		pobj.load(fis1);
		
		String urlVal= pobj.getProperty("url");
		String UnVal= pobj.getProperty("username");
		String PwdVal= pobj.getProperty("password");
		String BrwVal= pobj.getProperty("browser");
		
		System.out.println(urlVal);
		System.out.println(UnVal);
		System.out.println(PwdVal);
		System.out.println(BrwVal);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(urlVal);
		
		driver.findElement(By.name("username")).sendKeys(UnVal);
		driver.findElement(By.name("pwd")).sendKeys(PwdVal);
		driver.findElement(By.id("keepLoggedInLabel")).click();
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys(data);
		driver.findElement(By.name("createCustomerSubmit")).click();
	}

}
