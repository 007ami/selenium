package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	
	@FindBy(xpath="//div[text()='Tasks']/following-sibling::img")
	WebElement Taskimg;
	

	@FindBy(xpath="//div[text()='Reports']/following-sibling::img")
	WebElement Reportimg;
	

	@FindBy(xpath="//div[text()='Users']/following-sibling::img")
	WebElement Usersimg;

	
	public void navigateToTaskPage(){
		Taskimg.click();	
	}
	
	public void navigateToUserPage(){
		Usersimg.click();
	}
	
	public void navigateToReportPage(){
		Reportimg.click();
	}
}
