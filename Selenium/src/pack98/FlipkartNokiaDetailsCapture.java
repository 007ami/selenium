package pack98;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNokiaDetailsCapture {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("nokia", Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Nokia 6 (Matte Black, 32 GB)']")).click();
		
		Set<String> set = driver.getWindowHandles();
		System.out.println(set.size());
		
		Iterator<String> it= set.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		String highlights = driver.findElement(By.xpath("//h1/../../../following-sibling::div[6]")).getText();
		System.out.println(highlights);
		
	}

}
