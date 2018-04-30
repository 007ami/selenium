package pack98;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Shahrukh khan", Keys.ENTER);

		while (true) {
			try {
			     driver.findElement(By.xpath("//a[@id='pnnext']/span[2]")).click();
			} catch (Throwable t) {
				
				String page= driver.findElement(By.xpath("//div[@id='resultStats']")).getText();
				String arr[]=page.split(" ");
				String count = arr[1];
				System.out.println("Total No. of pages on Google are = " +count);
				break;
				
			}
		}

	}

}
