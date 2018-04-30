package net.phptravels.objectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {
	
	@FindBy(xpath="//div[@class='modal-header']/following-sibling::ul/li[1]/a")
	WebElement myAccountBtn;
	
	@FindBy(xpath="//div[@class='modal-header']/following-sibling::ul/li[1]/ul/li[2]/a")
	WebElement signUpdrpdwn;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstNameEdt;
	
	public WebElement getMyAccountBtn() {
		return myAccountBtn;
	}

	public WebElement getSignUpdrpdwn() {
		return signUpdrpdwn;
	}

	public WebElement getFirstNameEdt() {
		return firstNameEdt;
	}

	public WebElement getLastNameEdt() {
		return lastNameEdt;
	}

	public WebElement getPhoneEdt() {
		return phoneEdt;
	}

	public WebElement getEmailEdt() {
		return emailEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getConPasswordEdt() {
		return conPasswordEdt;
	}

	public WebElement getSignUpBtn() {
		return signUpBtn;
	}

	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastNameEdt;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phoneEdt;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailEdt;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordEdt;
	
	@FindBy(xpath="//input[@name='confirmpassword']")
	WebElement conPasswordEdt;
	
	@FindBy(xpath="//button[text()=' Sign Up']")
	WebElement signUpBtn;
	
	/*public void SignUpUser(){
		myAccountBtn.click();
		signUpdrpdwn.click();
		
		
		
	}
	*/
	

}
