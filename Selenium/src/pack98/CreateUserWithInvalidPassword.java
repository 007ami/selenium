package pack98;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserWithInvalidPassword {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://amit:8080/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInLabel")).click();
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//div[text()='Users']/../img")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		
		driver.findElement(By.name("username")).sendKeys("Amit34");
		driver.findElement(By.name("firstName")).sendKeys("l");
		driver.findElement(By.name("lastName")).sendKeys("N");
		driver.findElement(By.name("passwordText")).sendKeys("ab");
		driver.findElement(By.name("passwordTextRetype")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String expEMsg= "Entered password values differ";
		WebElement actEmsg = driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
		System.out.println(actEmsg);
		if(expEMsg.contains("Entered password values differ")){
			System.out.println("Invalid Password");
			
		}
		else{
			System.out.println("User Create Successffuly");
		}
		
		String expColor ="rgba(206, 1, 0, 1)";
		
		String actColor = driver.findElement(By.xpath("//span[@id='passwordFieldLabel']")).getCssValue("color");
		//System.out.println(actColor);
		if(expColor.equals(actColor)){
			System.out.println("password text color is matched");
		}else
		{
			System.out.println("password text color is not matched");
		}
		
		String expRPColor ="rgba(206, 1, 0, 1)";
		
		String actRPColor = driver.findElement(By.xpath("//span[@id='passwordRetypeFieldLabel']")).getCssValue("color");
		if(expRPColor.equals(actRPColor)){
			System.out.println("Retype Password color is matched");
		}
		else
		{
			System.out.println("Reptype Password color is not matched");
		}
		
		driver.findElement(By.name("passwordText")).sendKeys("abc");
		driver.findElement(By.name("passwordTextRetype")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String scMsg= "successfully created.";
		
		WebElement actSmsg = driver.findElement(By.xpath("//span[@class='successmsg"));
		if(scMsg.contains("successfully created.")){
			System.out.println("User Created");
		}
		else
		{
		System.out.println("Try Again");	
		}
	}

}
