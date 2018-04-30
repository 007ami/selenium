package pack98;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvisiblePopup {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Del");
		WebElement wb1 =driver.findElement(By.xpath("//li[text()='Delhi']"));
		Actions act1= new Actions(driver);
		act1.moveToElement(wb1).perform();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Chandigarh");
		WebElement wb =driver.findElement(By.xpath("//li[text()='Chandigarh']"));
		Actions act= new Actions(driver);
		act.moveToElement(wb).perform();
		
		Thread.sleep(10000);

		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		
		String Date= "//div[@id='rb-calendar_onward_cal']//td[text()='18']";
		//driver.findElement(By.xpath(Date)).click();
		
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		
		String next= "//div[@id='rb-calendar_onward_cal']//button[text()='>']";
		
		while(true){
			try{
				driver.findElement(By.xpath("//tr[@class='rb-monthHeader']/td[text()='May 2018']")).click();
				driver.findElement(By.xpath(Date)).click();
				break;
			}
			catch(Throwable t){
				driver.findElement(By.xpath(next)).click();
			}
	}
	
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		String ViewSeats ="//div[text()='Pal Travel Lines ']/../following-sibling::div[4]/div[2]/button";
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ViewSeats))).click();
		//driver.findElement(By.xpath(ViewSeats)).click();
		
		WebElement seats= driver.findElement(By.xpath("//canvas"));
		Point p = seats.getLocation();
		System.out.println("X-cordinate" +p.getX());
		System.out.println("Y-cordinate" +p.getY());
		
		Dimension d = seats.getSize();
		System.out.println("Height of the element" +d.getHeight());
		System.out.println("Width of the element" +d.getWidth());
		
		WebElement sMsg= driver.findElement(By.xpath("//div[@class='seatSelMsg']"));
		Actions act2= new Actions(driver);
		act2.moveToElement(seats).perform();

	}

}
