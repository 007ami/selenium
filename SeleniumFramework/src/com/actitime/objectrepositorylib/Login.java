package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	@FindBy(name="username")
	WebElement usernameEdt;
	
	@FindBy(name="pwd")
	WebElement passwordEdt;
	

	@FindBy(id="loginButton")
	WebElement loginBtn;

	public void login(String username, String password){
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
		
	}
	
	public void login(){
		usernameEdt.sendKeys("admin");
		passwordEdt.sendKeys("manager");
		loginBtn.click();
		
	}
	
}
