package pack98;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fbsignin {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("Atharv");
		//WebDriverWait wait= new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("u_0_n"))));
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		driver.findElement(By.name("reg_email__")).sendKeys("pachauryamit007@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pachauryamit007@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Amit@321");
		
		WebElement day= driver.findElement(By.id("day"));
		Select dayd= new Select(day);
		dayd.selectByVisibleText("19");
		
		WebElement mwb= driver.findElement(By.xpath("//select[@id='month']"));
		Select msel = new Select(mwb);
		msel.selectByVisibleText("Sep");
		
		WebElement ysel= driver.findElement(By.xpath("//select[@id='year']"));
		Select year= new Select(ysel);
		year.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
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
