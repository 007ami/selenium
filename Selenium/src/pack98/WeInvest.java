package pack98;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WeInvest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://beta.weinvest.net/model-portfolio");
	
		//Select �Balanced� Portfolio by clicking on �Explore Investment Ideas�
		driver.findElement(By.xpath("//a[text()='Explore Investment Ideas']")).click();
		
		//Click on invest now button 
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-invest btn-md']")).click();
		 
		//changing the timeline slider 
		Actions act = new Actions(driver);

		act.dragAndDropBy(driver.findElement(By.xpath("//div[@class='rangeslider__handle']")), 153, 300).perform();
		
	//close the browser
		driver.close();
		
	}

}
