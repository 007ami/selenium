package pack98;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProject {
	public static void main(String[] args) throws InterruptedException {
		String expMsg = "Couldn't find your Google Account";
		String emailId = "ghantaaaaa56";
		String expColor = "rgba(213, 0, 0, 1)";
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://gmail.com");

		// Thread.sleep(3000);
		// driver.findElement(By.id("identifierLink")).click();

		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(emailId);
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		String x = "(//div[@class='dEOOab RxsGPe'][1])";
		String actMsg = driver.findElement(By.xpath(x)).getText();
		if (expMsg.equals(actMsg)) {
			System.out.println("Error message is verified==> Pass");
		} else {
			System.out.println("Error message is not verified==> Fail");
		}
		String actColor = driver.findElement(By.xpath(x)).getCssValue("color");
		System.out.println(actColor);
		if (expColor.equals(actColor)) {
			System.out.println("Color is verified ==> Pass");
		} else {
			System.out.println("Color is not verified ==> Fail");
		}

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
		driver.findElement(By.xpath("//input[@id='identifierId']")).clear();
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("amittester004@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		driver.findElement(By.name("password")).sendKeys("brsoftech");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		String expval = "Gmail";
		String actUITitle = driver.getTitle();
		if (actUITitle.contains(expval)) {
			System.out.println("Home Page is verified ==> Pass");
		} else {
			System.out.println("Home Page is not verified ==> Fail");
		}

		driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();

		driver.findElement(By.linkText("Sign out")).click();

		// driver.findElement(By.name("password")).sendKeys("brsoftech");
		// driver.findElement(By.xpath("//span[text()='Next']")).click();
		// driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();

		// driver.close();

		driver.findElement(By.xpath("//div[@class='mUbCce fKz7Od lfjjye']")).click();
		// Thread.sleep(5000);
		// driver.findElement(By.linkText("Remove an account")).click();
		// driver.manage().deleteAllCookies();
		driver.close();

	}

}
