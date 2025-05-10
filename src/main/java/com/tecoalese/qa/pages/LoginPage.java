package com.tecoalese.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tecoalese.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//page factory - object repository
	
	@FindBy(id = "UserName")
	WebElement emailId;
	
	@FindBy(xpath = "//input[@type = 'password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement signBtn;
	
	// initialize the all object repositories
	
	public LoginPage() {
		PageFactory.initElements(driver, this);	
	}

	public String validationOfPageTitle()
	{
		return driver.getTitle();	
	}
	
	public HomePage login(String un, String pwd)
	{
		emailId.sendKeys(un);
		password.sendKeys(pwd);
		signBtn.click();
		
		return new HomePage();
	}
}
