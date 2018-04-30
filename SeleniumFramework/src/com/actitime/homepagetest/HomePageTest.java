package com.actitime.homepagetest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;

public class HomePageTest extends BaseClass {
	
	@Test
	public void homePageTest(){
		
	boolean stat = driver.findElement(By.xpath("//div[@style='position: relative']/div[3]/img")).isDisplayed();
	Assert.assertTrue(stat, "HomePage logo is verified");
		
	}
	
//	@Test
//	public void homePageLogoTest(){
//		
//		
//	}

}
