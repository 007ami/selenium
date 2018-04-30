package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomer {
	@FindBy(name="name")
	WebElement customerNameEdt;
	
	@FindBy(name="description")
	WebElement customerDescriptionEdt;
	
	@FindBy(name="createCustomerSubmit")
	WebElement createCustomerBtn;
	
	public void createCustomer(String customerName)
	{
		customerNameEdt.sendKeys(customerName);
		createCustomerBtn.click();
	}
	
	public void createCustomer(String customerName, String descp)
	{
		customerNameEdt.sendKeys(customerName);
		customerDescriptionEdt.sendKeys(descp);
		createCustomerBtn.click();
	}
}
