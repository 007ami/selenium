package net.phptravels.objectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {

	@FindBy(xpath= "//div[@id='sidebar_left']/following-sibling::div[2]/div/div/div[2]/ul/li[1]/ul/li[2]/a")
	WebElement logoutdrpdwn;

	public WebElement getLogoutdrpdwn() {
		return logoutdrpdwn;
	}
}
