package pack98;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailSignUp {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		 driver.get("https://accounts.google.com/SignUp");
		 //String x= "//a[@class='gmail-nav__nav-link gmail-nav__nav-link__create-account']";
		 //driver.findElement(By.xpath(x)).click();
		 driver.findElement(By.id("FirstName")).sendKeys("Atharv");
		 driver.findElement(By.id("LastName")).sendKeys("Sharma");
		 driver.findElement(By.id("GmailAddress")).sendKeys("athravsharma007");
		 driver.findElement(By.id("Passwd")).sendKeys("RamtaJogi");
		 driver.findElement(By.id("PasswdAgain")).sendKeys("RamtaJogi");
		 
		 WebElement mwb = driver.findElement(By.xpath("//div[text()='Month']"));
		 Select sel= new Select(mwb);
		 sel.selectByVisibleText("June");

	}

}
