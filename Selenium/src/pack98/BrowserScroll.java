package pack98;

import javax.swing.JScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserScroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
		
		String jsType="document.getElementById('email').value='selenium'";
		String jsClick = "doument.getElementById('u_0_a').click()";
		String jsScroll = "window.scrollBy(0,500)";
		JavascriptExecutor jobj= (JavascriptExecutor)driver;
        jobj.executeScript(jsScroll,"");
	}

}
