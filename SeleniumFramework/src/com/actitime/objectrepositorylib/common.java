package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class common {

	@FindBy(linkText="Logout")
	WebElement logoutLnk;


	public void logout()
	{
		logoutLnk.click();
	}

}