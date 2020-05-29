package pack98;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AmazonIphonePrice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//options.addExtensions(new File("C:\\Selenium\\extension_4_6_0_0.crx")); 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone x");
		WebElement wb= driver.findElement(By.xpath("//form[contains(@class,'header-form-search')]/ul/li[1]"));
		 Actions act = new Actions(driver);
		 act.moveToElement(wb).click().perform();
		 String str =driver.findElement(By.xpath("//div[text()='Apple iPhone X (Space Gray, 256 GB)']/../../div[2]/div[1]/div/div[1]")).getText();
		 System.out.println(str);
		

	}
}


