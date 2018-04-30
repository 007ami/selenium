package com.actitime.customertest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.FileDataLib;



@Listeners(com.actitime.genericlib.SampleListener.class)

public class CustomerTest extends BaseClass {
   
	FileDataLib file= new FileDataLib();

   
	@Test
   
   public void createCustomerTest() throws Throwable{
	
		String CustomerName= file.getExcelData("Sheet1", 1, 2);
		//String expVal= file.getExcelData("Sheet1", 1, 4);
		
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys(CustomerName);
		driver.findElement(By.name("createCustomerSubmit")).click();
		
		String actVal= driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
		boolean stat= actVal.contains("successfully created.");
		Assert.assertTrue(stat, "User is successfully Created");
		
	}
		
	@Test
	public void createCustomerWithDescriptionTest() throws Throwable{
		String CustomerName= file.getExcelData("Sheet1", 2, 2);
		String CustomerDescp= file.getExcelData("Sheet1", 2, 3);
		
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys(CustomerName);
		driver.findElement(By.name("description")).sendKeys(CustomerDescp);
		driver.findElement(By.name("createCustomerSubmit")).click();
		
		String actVal= driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
		boolean stat= actVal.contains("successfully created.");
		Assert.assertTrue(stat, "User is successfully Created");
		
		
		
	}

	
}
