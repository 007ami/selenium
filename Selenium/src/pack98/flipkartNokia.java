package pack98;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartNokia {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("nokia", Keys.ENTER);
		
		String x= "//span[contains(text(),'Showing')]";
		String uiText = driver.findElement(By.xpath(x)).getText();
		
		String [] arr= uiText.split(" ");
		
		String count= arr[5];
		
		int acount= Integer.parseInt(count);
		
		System.out.println(acount);
		
		driver.close();
	}

}
