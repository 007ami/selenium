package pack98;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://irctc.co.in");
		driver.findElement(By.xpath("//input[@id='loginbutton']")).click();
		
        Alert alt= driver.switchTo().alert();
        alt.accept();
        
        driver.findElement(By.id("usernameId")).sendKeys("Amit");
		driver.findElement(By.xpath("//input[@id='loginbutton']")).click();
		alt.accept();
		
		driver.findElement(By.name("j_password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='loginbutton']")).click();
		
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		alt.accept();
		
		driver.findElement(By.name("password")).sendKeys("123654");
		
		driver.close();
		
		
	}

}
