package pack98;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateTaskActiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://amit:8080/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInLabel")).click();
		driver.findElement(By.id("loginButton")).click();
		
		String name = "Vikram";
		String project = "Red Blue";

		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("createCustomerSubmit")).click();

		driver.findElement(By.xpath("//input[@value='Create New Project']")).click();

		WebElement wb = driver.findElement(By.name("customerId"));

		Select sel = new Select(wb);
		sel.selectByVisibleText(name);

		driver.findElement(By.name("name")).sendKeys(project);
		driver.findElement(By.name("createProjectSubmit")).click();

		driver.findElement(By.xpath("//table[@id='topnav']/tbody/tr/td[3]/a")).click();

		driver.findElement(By.xpath("//a[text()='Create new tasks']")).click();

		Set<String> set = driver.getWindowHandles();
		// System.out.println(set.size());

		Iterator<String> it = set.iterator();
		String parentId = it.next();
		String childId = it.next();

		driver.switchTo().window(childId);

		WebElement wbC = driver.findElement(By.name("customerId"));

		Select cus = new Select(wbC);
		cus.selectByVisibleText(name);

		WebElement wbP = driver.findElement(By.name("projectId"));

		Select proj = new Select(wbP);
		proj.selectByVisibleText(project);

		driver.findElement(By
				.xpath("//form[@name='AddNewTasksForm']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[8]/td/table/tbody/tr[2]/td[1]/input"))
				.sendKeys("S_1");
		driver.findElement(By
				.xpath("//form[@name='AddNewTasksForm']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[8]/td/table/tbody/tr[3]/td[1]/input"))
				.sendKeys("S_2");
		driver.findElement(By
				.xpath("//form[@name='AddNewTasksForm']/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[8]/td/table/tbody/tr[4]/td[1]/input"))
				.sendKeys("S_3");

		driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();

		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();

		driver.findElement(By.xpath("//table[@id='cpSelector.cpButton']/tbody/tr[2]")).click();

		String x = "//div[@id='cpSelector.cpPopup.cpListbox.contentsContainer']/table/tbody/tr[*]/td/label/span[text()='Vikram']/../preceding-sibling::input";
		driver.findElement(By.xpath(x)).click();

		driver.findElement(By.id("closeButton")).click();

		driver.findElement(By.id("tasksFilterSubmitButton")).click();

		String cusName = driver
				.findElement(By
						.xpath("//form[@id='tasksListForm']/table/tbody/tr[2]/td/table/tbody/tr[*]/td[text()='Vikram']"))
				.getText();
		System.out.println("Customer name is " + cusName);

		List<WebElement> tasks = driver.findElements(By.xpath(
				"//form[@id='tasksListForm']/table/tbody/tr[2]/td/table/tbody/tr[*]/td[text()='Vikram']/following-sibling::td/a"));

		for (WebElement Nt : tasks) {
			String tName = Nt.getText();
			System.out.println("Assigned tasks are : " + tName);
		}

		driver.close();

	}

}
