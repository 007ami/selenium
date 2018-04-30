package pack98;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsLinkElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.thehindu.com/");
		
		driver.findElement(By.id("close")).click();
		List<WebElement> lst = driver.findElements(By.xpath("//a"));
		System.out.println(lst.size());
 
		for(WebElement wb: lst){
			String linkText = wb.getText();
			System.out.println(linkText);
		}
		driver.close();
	}

}
