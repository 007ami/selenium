package pack98;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class captureSubject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://gmail.com");
		driver.findElement(By.xpath("//input[@id='identifierId']")).clear();
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("amittester007@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		driver.findElement(By.name("password")).sendKeys("brsoftech");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		String x = "//table[@class='F cf zt']/tbody//tr[*]/td[6]";
		
		List<WebElement> lst= driver.findElements(By.xpath(x));
		
		for(WebElement wb : lst){
		String	subject = wb.getText();
		System.out.println(subject);
		}
       
		driver.close();
	}

}
