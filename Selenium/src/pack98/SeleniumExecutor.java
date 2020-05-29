package pack98;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class SeleniumExecutor {

	static ChromeDriver driver = new ChromeDriver();
	public static void extractHeader() 
	{
		
		String text= driver.findElement(By.xpath("//div[@clase='.container']/h1")).getText();
		System.out.print(text);
	}
	public static void clickTheButtonAndExtractLink()
	
	{
		driver.findElement(By.xpath("//div[@clase='.container']")).click();
		List<WebElement> lst = driver.findElements(By.xpath("//a"));
		System.out.println(lst.size());
		for(WebElement wb:lst)
		{
			String linkName=wb.getText();
			System.out.println(linkName);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SeleniumExecutor se = new SeleniumExecutor();
      se.extractHeader();
      se.clickTheButtonAndExtractLink();
	}

}
