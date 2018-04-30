package pack98;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver" ,"C:\\Selenium\\chromedriver.exe" );	
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://amazon.com");
	
	WebElement wb = driver.findElement(By.xpath("//span[text()='Departments']"));
	
	Actions act= new Actions(driver);
	act.moveToElement(wb).perform();
	
	
	
	
	
	
	}

}
