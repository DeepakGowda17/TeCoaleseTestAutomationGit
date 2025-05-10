package com.tecoaleseqa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tecoalese.qa.base.TestBase;
import com.tecoalese.qa.pages.HomePage;
import com.tecoalese.qa.pages.LoginPage;
import com.tecoalese.qa.pages.UsersPage;
import com.tecoslese.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	UsersPage usersPage;
	
	public HomePageTest()
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
	}

	@Test(priority=1)
	public void verifyHomePage() {
		boolean value = homePage.verifyHomePageRediection();
		Assert.assertEquals(value, true, "Not redicted to home page");
		// testUtil.switchToFrame("value");
	}
	
	@Test(priority=2)
	public void verifyUsersTabRedirection() {
		usersPage = homePage.clickOnUsersTab();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
