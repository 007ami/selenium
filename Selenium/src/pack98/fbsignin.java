package pack98;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class fbsignin {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("Atharv");
		driver.findElement(By.id("u_0_n")).sendKeys("Sharma");
		driver.findElement(By.id("u_0_q")).sendKeys("pachauryamit007@gmail.com");
		driver.findElement(By.id("u_0_t")).sendKeys("pachauryamit007@gmail.com");
		driver.findElement(By.id("u_0_x")).sendKeys("Amit@321");
		
		WebElement day= driver.findElement(By.id("day"));
		Select dayd= new Select(day);
		dayd.selectByVisibleText("19");
		
		WebElement mwb= driver.findElement(By.id("month"));
		Select msel = new Select(mwb);
		msel.selectByVisibleText("Sept");
		
		WebElement ysel= driver.findElement(By.id("year"));
		Select year= new Select(ysel);
		year.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
		String x = driver.getTitle();
		System.out.println(x);
		if(x.contains("Facebook")){
			System.out.println("Account Created");
		}else
		{
			System.out.println("Account Creation Failed");
		}
		driver.close();

	}

}
