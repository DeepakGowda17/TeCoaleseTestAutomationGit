package com.tecoalese.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tecoalese.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[@class = 'active' and text() = 'Home']")
	WebElement homeTab;
	
	@FindBy(linkText = "Users")
	WebElement usersTab;
	
	@FindBy(partialLinkText = "Roles & Permissions")
	WebElement rolesAndPermissionTab;
	
	@FindBy(linkText = "Devices")
	WebElement devicesTab;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	} 	
	
	public boolean verifyHomePageRediection() {
		return homeTab.isEnabled();
	}
	
	public UsersPage clickOnUsersTab() {
		usersTab.click();
		
		return new UsersPage();
	}
}
