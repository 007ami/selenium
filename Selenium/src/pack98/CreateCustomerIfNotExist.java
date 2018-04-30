package pack98;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateCustomerIfNotExist {

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

		WebElement wb = driver.findElement(By.name("selectedCustomer"));
		String expCus = "Amit008";
		// String expCus1= "Amit007";
		Select sel = new Select(wb);
		List<WebElement> lst = sel.getOptions();
		System.out.println(lst.size());
		for (int i = 0; i < lst.size(); i++) {
			String actCus = lst.get(i).getText();
			// System.out.println(actCus);
			if (expCus.equals(actCus)) {
				System.out.println("Customer Already Exist");
				break;

			} else {
				driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
				driver.findElement(By.name("name")).sendKeys("Amit008");
				driver.findElement(By.name("createCustomerSubmit")).click();
			}
		}
		driver.close();
	}

}
