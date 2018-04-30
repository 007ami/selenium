package pack99;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstproject {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		if (actTitle.equals("Gmail")) {
			System.out.println("Navigate to Gmail App==> Pass");
		} else {
			System.out.println("Gmail App is not available==> Fail");
		}
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);

		// String pageHTMLCode = driver.getPageSource();
		// System.out.println(pageHTMLCode);

		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("amittester004@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("brsoftech");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		Thread.sleep(2000);
		String expval = "Gmail";
		String actUITitle = driver.getTitle();
		if (actUITitle.contains(expval)) {
			System.out.println("Home Page is verified ==> Pass");
		} else {
			System.out.println("Home Page is not verified ==> Fail");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Sign out")).click();

		// driver.findElement(By.name("password")).sendKeys("brsoftech");
		// driver.findElement(By.xpath("//span[text()='Next']")).click();
		// driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();

		// driver.close();

	}

}
