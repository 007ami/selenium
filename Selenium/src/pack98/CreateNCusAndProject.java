package pack98;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNCusAndProject {

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
		driver.findElement(By.name("name")).sendKeys("Ak0002");
		driver.findElement(By.id("add_project_action")).click();
		driver.findElement(By.name("createCustomerSubmit")).click();
		
		String expTitle= "actiTIME - Create New Project";
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		if(expTitle.equals(actTitle)){
			System.out.println("Paga title is verified");
		}else{
			System.out.println("page title is not verified");
		}
		String expMsg = "successfully created";
		String actMsg = driver.findElement(By.xpath("//span[contains(text(),'successfully created')]")).getText();
		System.out.println(actMsg);
		if(expMsg.contains(actMsg)){
			System.out.println(actMsg);
		}
       driver.findElement(By.name("name")).sendKeys("Orange");
       driver.findElement(By.name("createProjectSubmit")).click();
      
       driver.close();
	}

}
