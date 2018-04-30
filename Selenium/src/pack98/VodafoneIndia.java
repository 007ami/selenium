package pack98;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VodafoneIndia {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.vodafone.in/home-karnataka");
		driver.findElement(By.xpath("//a[@class='closeBtn mv_closeBtn']")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'Prepaid Offers')]/following-sibling::a[text()='Shop Now']")).click();
		driver.findElement(By.id("mobileNum")).sendKeys("9782313286");
		
		List<WebElement> lst =driver.findElements(By.xpath("//div[@id='madeForYouOffers']/div[*]"));
		System.out.println(lst.size());
		
		for(WebElement wb: lst){
			String ofrName = wb.getText();
			System.out.println(ofrName);
		}

	}

}
