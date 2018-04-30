package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask {

	@FindBy(xpath="//a[text()='Completed Tasks']")
	WebElement completeTasklnk;
	
	@FindBy(xpath="//a[text()='Projects & Customers']")
	WebElement ProjAndCustomerlnk;
	
	@FindBy(xpath="//a[text()='Archives']")
	WebElement Archiveslnk;
	
	@FindBy(xpath="//input[@value='Create New Tasks']")
	WebElement CreateNewTasksBtn;
	
	
	public void navigateToCompleteTaskPage(){
		completeTasklnk.click();
	}
	public void navigateToProjectAndCustomerPage(){
		ProjAndCustomerlnk.click();
	}
	public void navigateToArchivesPage(){
		Archiveslnk.click();
	}
	public void navigateToCreateNewTaskPage(){
		CreateNewTasksBtn.click();
	}
}
