package pack98;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbLogin {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("pachauryamit007@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Amit@321");
		driver.findElement(By.id("loginbutton")).click();

		driver.findElement(By.xpath("//div[@class='innerWrap']/div/input[@name='q']")).sendKeys("Shiwani gupta",
				Keys.ENTER);
		// Thread.sleep(10000);
		// String jsScroll = "window.scrollBy(0,2500)";
		// JavascriptExecutor jobj= (JavascriptExecutor)driver;
		// jobj.executeScript(jsScroll);

		String SeeAll = "//span[text()='People']/../following-sibling::span/a[text()='See all']";

		// WebDriverWait wait= new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SeeAll)));

		driver.findElement(By.xpath(SeeAll)).click();

		// String x =
		// "//div[@id='initial_browse_result']/div/div/div/div[@id='BrowseResultsContainer']/*/div/div/div/div/div/div[1]/div[2]/*/div/div/a/span";
		String x = "//div[@id='initial_browse_result']/div/div/div[*]/div[*]/div[*]/div[*]/div[*]/div[*]/div[*]/div[*]/div[1][*]/div[2]";

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(x)));
		
		Thread.sleep(5000);
		 String jsScroll = "window.scrollBy(0,1500)";
		 JavascriptExecutor jobj= (JavascriptExecutor)driver;
		 jobj.executeScript(jsScroll);

		 WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(x)));
			
			Thread.sleep(5000);
			 String jsScroll1 = "window.scrollBy(0,2000)";
			 JavascriptExecutor jobj1= (JavascriptExecutor)driver;
			 jobj1.executeScript(jsScroll1);

			 WebDriverWait wait2 = new WebDriverWait(driver, 20);
				wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(x)));
		 
		List<WebElement> lst = driver.findElements(By.xpath(x));

		System.out.println(lst.size());

		for (WebElement wb : lst) {
			String name = wb.getText();
			System.out.println(name);
		}

		//driver.close();
	}

}
