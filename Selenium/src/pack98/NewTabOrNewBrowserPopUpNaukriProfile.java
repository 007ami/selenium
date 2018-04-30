package pack98;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTabOrNewBrowserPopUpNaukriProfile {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		
		Set<String> set = driver.getWindowHandles();
		System.out.println(set.size());
		Iterator<String> it= set.iterator();
		String parentId= it.next();
		String ChildId= it.next();
		String Child2Id= it.next();
		String Child3Id= it.next();
		
		driver.switchTo().window(ChildId);
		driver.close();

		driver.switchTo().window(Child2Id);
		driver.close();
		
		driver.switchTo().window(Child3Id);
		driver.close();
		
		driver.switchTo().window(parentId);
		
		driver.findElement(By.id("login_Layer")).click();
		
		
		driver.findElement(By.xpath("//input[@id='eLoginNew']")).sendKeys("amitpachaury@gmail.com");
		driver.findElement(By.xpath("//input[@id='pLogin']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//div[@id='compDetail']/div[4]/div[1]")).click();
		driver.findElement(By.xpath("//a[@href='/Profile/editSummary?id=&altresid=']")).click();
		driver.findElement(By.xpath("//button[@value='Save Changes']")).click();
		
		driver.close();
	}

}
