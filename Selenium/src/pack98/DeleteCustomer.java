package pack98;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteCustomer {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://amit:8080/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInLabel")).click();
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("Zakir Khan");
		driver.findElement(By.name("createCustomerSubmit")).click();
		
		WebElement wb = driver.findElement(By.name("selectedCustomer"));
		
		Select sel = new Select(wb);
		sel.selectByVisibleText("Zakir Khan");
		driver.findElement(By.xpath("//input[contains(@value,'Show')]")).click();
		
		driver.findElement(By.xpath("//form[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[2]/td[6]/input")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Delete Sel')]")).click();
		
		driver.findElement(By.id("deleteButton")).click();
		
		driver.close();
	}
	

}
