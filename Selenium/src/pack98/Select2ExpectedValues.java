package pack98;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select2ExpectedValues {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Amit%20pachaury/Desktop/new%201.html");

		WebElement wb = driver.findElement(By.xpath("//select[@multiple='true']"));
		String expVal = "Java";
		String expVal1= "Python";
		Select sel = new Select(wb);
		java.util.List<WebElement> lst = sel.getOptions();
		System.out.println(lst.size());
		for(int i = 0; i < lst.size(); i++) {
			String actVal = lst.get(i).getText();
			System.out.println(actVal);

			if (expVal.contains("Java")|| expVal1.contains("Python")) {
				sel.selectByVisibleText(expVal);
				sel.selectByVisibleText(expVal1);
				System.out.println(expVal + "= value is available");
				System.out.println( expVal1+ "= value is available");
				break;
			}
			
		}
		driver.close();


	}

}
