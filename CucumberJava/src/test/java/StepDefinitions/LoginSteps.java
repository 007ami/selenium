package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		

		
		//System.out.println("Inside Step- user is on login page");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		//System.out.println("Inside Step- user enters username and password");
		driver.findElement(By.id("email")).sendKeys("pachauryamit007@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Amit@321");

	}

	@And("Click Login button")
	public void click_Login_button() {
		//System.out.println("Inside Step- user click on the login button");
		driver.findElement(By.id("loginbutton")).click();

	}

	@Then("user is navigated to the Home Page")
	public void user_is_navigated_to_the_Home_Page() {
		//System.out.println("Inside Step- user navigate to Home page");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actTitle = driver.getTitle();
		String expTitle= "Facebook";
		Assert.assertEquals(expTitle, actTitle);
			
	}
	@And("close browser")
	public void close_browser() {
		//System.out.println("Inside Step- user navigate to Home page");
		driver.quit();
			
	}

}
