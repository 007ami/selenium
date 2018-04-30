package com.actitime.customertest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.FileDataLib;
import com.actitime.objectrepositorylib.ActiveProjectandCustomer;
import com.actitime.objectrepositorylib.CreateNewCustomer;
import com.actitime.objectrepositorylib.Home;
import com.actitime.objectrepositorylib.OpenTask;

public class CreateCustomerTest extends BaseClass {

	FileDataLib fLib = new FileDataLib();
	
	@Test
	public void createCustomerTest() throws Throwable{
		String cName = fLib.getExcelData("Sheet2", 1, 2);
		
		Home hpage= PageFactory.initElements(driver, Home.class);
		hpage.navigateToTaskPage();
		
		OpenTask taskPage = PageFactory.initElements(driver, OpenTask.class);
		taskPage.navigateToProjectAndCustomerPage();
		
		ActiveProjectandCustomer aCustPage = PageFactory.initElements(driver, ActiveProjectandCustomer.class);
		aCustPage.navigateToCreateCustomerPage();
		
		CreateNewCustomer cPage = PageFactory.initElements(driver, CreateNewCustomer.class);
		cPage.createCustomer(cName);
	}
}
