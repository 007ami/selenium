package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectandCustomer {

	@FindBy(xpath="//input[@value='Create New Customer']")
	WebElement CreateNewCustomerBtn;
	
	@FindBy(xpath="//input[@value='Create New Project']")
	WebElement CreateNewProjectBtn;
	
	public void navigateToCreateCustomerPage(){
		CreateNewCustomerBtn.click();	
	}
	public void navigateToCreateProjectPage(){
		CreateNewProjectBtn.click();	
	}
}
