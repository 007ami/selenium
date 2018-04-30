package pack98;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonCapture {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x", Keys.ENTER);
		// String x =
		// driver.findElement(By.xpath("//div[@id='resultsCol']/div/div/ul/li[2]/div/div[5]/div[1]/a")).getText();
		String x = "//h2[text()='Apple iPhone X (Silver, 256GB)']/../../../following-sibling::div[2]/div[1]/a";
		String iphonePrice = driver.findElement(By.xpath(x)).getText();
		System.out.println("Apple iPhone X (Silver, 256GB) price is =" + iphonePrice);

		String rating = "//h2[text()='Apple iPhone X (Silver, 256GB)']/../../../following-sibling::div[3]/span/span[@class='a-declarative']";
		WebElement wb = driver.findElement(By.xpath(rating));

		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();

		driver.findElement(By.xpath("//table[@id='histogramTable']/tbody/tr[1]/td[2]/a/div")).click();

		String Creview = "//h1[text()='Customer reviews']/../../div[4]/div/span/table/tbody[*]";

		String rGraph = driver.findElement(By.xpath(Creview)).getText();
		System.out.println("Apple iPhone X (Silver, 256GB) Ratings " +rGraph);

		driver.close();

	}

}
