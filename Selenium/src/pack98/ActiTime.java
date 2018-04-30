package pack98;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://amit:8080/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInLabel")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("Amit6");
		driver.findElement(By.name("createCustomerSubmit")).click();

		String expColor = "rgba(80, 109, 0, 1)";
		String expMsg = "successfully created";
		
		String actColor = driver.findElement(By.xpath("//span[@class='successmsg']")).getCssValue("color");
		System.out.println(actColor);
		if (expColor.equals(actColor)) {
			System.out.println("Account Created color is matched");
		} else {
			System.out.println("Color is not matched");
		}
		
		
		String actMsg = driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
		//System.out.println(actMsg);
		if(expMsg.equals(actMsg)){
			System.out.println("Account is successfully Created");
		}
		else{
			System.out.println("Account is not successfully created");
		}
		
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("Amit6");
		driver.findElement(By.name("createCustomerSubmit")).click();
		
	    String expEmsg = "already exists"; 
	    
		String actEmsg= driver.findElement(By.xpath("//span[@class='errormsg']")).getText();
		//System.out.println(actEmsg);
		if(expEmsg.contains(actEmsg)){
			System.out.println("User is already exist");
		}
		else{
			System.out.println("User is successfully created");
		}
		
		String actEcolor = driver.findElement(By.xpath("//span[@class='errormsg']")).getCssValue("color");
		System.out.println(actEcolor);

		driver.close();
	}

}
