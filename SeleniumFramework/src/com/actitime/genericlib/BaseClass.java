package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectrepositorylib.Login;
import com.actitime.objectrepositorylib.common;

public class BaseClass {
	public  static WebDriver driver;
	FileDataLib fileLib = new FileDataLib();
	Properties pObj;
	
	@BeforeClass
	public void configBC() throws Throwable{
		 pObj = fileLib.getPropertyObj();
		String browserNAme = pObj.getProperty("browser");
		if(browserNAme.equals("firefox")){
		        driver = new FirefoxDriver();
		}else if(browserNAme.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	
	@BeforeMethod
	public void configBM() throws IOException{
	
		String url = pObj.getProperty("url");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Login lpage = PageFactory.initElements(driver, Login.class);
		lpage.login("admin", "manager");
	}
	
	@AfterMethod
	public void configAm(){
		common cpage = PageFactory.initElements(driver, common.class);
		cpage.logout();
	}
	
	@AfterClass
	public void configAC(){
		driver.close();
	}
  
}
