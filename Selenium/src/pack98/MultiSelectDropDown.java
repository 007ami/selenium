package pack98;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Amit%20pachaury/Desktop/new%201.html");
		WebElement wb = driver.findElement(By.xpath("//select[@multiple='true']"));
		Select sel = new Select(wb);
		boolean stat = sel.isMultiple();
		if (stat){
			for (int i=1; i<=7; i++) {
				sel.selectByIndex(i);
			}
		} else {
			System.out.println("It is not Multiselect Dropdown");
		}

	}

}
