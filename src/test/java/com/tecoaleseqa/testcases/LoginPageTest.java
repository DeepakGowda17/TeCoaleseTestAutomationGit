package com.tecoaleseqa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tecoalese.qa.base.TestBase;
import com.tecoalese.qa.pages.HomePage;
import com.tecoalese.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	private LoginPageTest() {
		super(); // before initialize the browser we have to initialize the TestBase constructor
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();   // this will initialize the browser part
		// create the object of login page class
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validationOfPageTitle();
		Assert.assertEquals(title, "TE-COALESCE");
	}
	
	@Test(priority=2)
	private void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
