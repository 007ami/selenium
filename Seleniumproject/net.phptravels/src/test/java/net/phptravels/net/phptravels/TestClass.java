package net.phptravels.net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.phptravels.net/");
        driver.findElement(By.xpath("//div[@id='sidebar_left']/following-sibling::div[2]/div/div/div[2]/ul/li[1]/a")).click();
	}
	
}
