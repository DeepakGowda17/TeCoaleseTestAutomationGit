package com.tecoalese.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tecoalese.qa.base.TestBase;

public class UsersPage extends TestBase{
	
	@FindBy(xpath="//a[@class = 'active' and text() = 'Users']")
	WebElement usersTab;
	
	public UsersPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean uersTabRedirection() {
		return usersTab.isEnabled();
		
	}

}
