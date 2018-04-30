package net.phptravels.userTest;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import net.phptravels.genericLib.BaseClass;
import net.phptravels.genericLib.FileData;
import net.phptravels.objectRepositoryLib.Registration;

public class UserSignUp extends BaseClass {
	FileData fLib= new FileData();
	
	@Test
	public void CreateUserTest() throws Throwable{
		Registration register = PageFactory.initElements(driver, Registration.class);
		register.getMyAccountBtn().click();
		register.getSignUpBtn().click();
//		String fName= fLib.getExcelData("Sheet1", 1, 1);
//		String lName= fLib.getExcelData("Sheet1", 1, 2);
//		String phone= fLib.getExcelData("Sheet1", 1, 3);
//		String email= fLib.getExcelData("Sheet1", 1, 4);
//		String pswrd= fLib.getExcelData("Sheet1", 1, 5);
//		String conpswrd= fLib.getExcelData("Sheet1", 1, 6);
//		
//		register.getFirstNameEdt().sendKeys(fName);
//		register.getLastNameEdt().sendKeys(lName);
//		register.getPhoneEdt().sendKeys(phone);
//		register.getEmailEdt().sendKeys(email);
//		register.getPasswordEdt().sendKeys(pswrd);
//		register.getConPasswordEdt().sendKeys(conpswrd);
	}

}
