package net.phptravels.genericLib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import net.phptravels.objectRepositoryLib.Common;
import net.phptravels.objectRepositoryLib.Registration;



public class BaseClass {
	public static WebDriver driver;
	FileData fLib = new FileData();
    Properties pObj;
    
	@BeforeClass
	public void configBC() throws Throwable{
		
		pObj= fLib.getPropertyObject();
		String bName= pObj.getProperty("browser");
		if(bName.equals("firefox")){
			driver = new FirefoxDriver();
		}else if(bName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
	}
	
	@BeforeMethod
	public void configBM(){
		driver.get(pObj.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Registration register = PageFactory.initElements(driver, Registration.class);
		
		
	}
	
//	@AfterMethod
//	public void configAm(){
//		
//		Common cPage = PageFactory.initElements(driver, Common.class);
//		cPage.getLogoutdrpdwn().click();
//	}
	
	@AfterClass
	public void ConfigAC(){
		driver.close();
	}
      
}
