package com.tecoaleseqa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tecoalese.qa.base.TestBase;
import com.tecoalese.qa.pages.HomePage;
import com.tecoalese.qa.pages.LoginPage;
import com.tecoalese.qa.pages.UsersPage;
import com.tecoslese.qa.util.TestUtil;

public class UsersPageTest extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	UsersPage usersPage;
	TestUtil testUtil;
	
	public UsersPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		usersPage= new UsersPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.clickOnUsersTab();
	}
	
	@Test
	public void verifyUsersPageRedirection() {
		usersPage.uersTabRedirection();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
