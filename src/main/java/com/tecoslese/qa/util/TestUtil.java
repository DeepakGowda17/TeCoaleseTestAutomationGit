package com.tecoslese.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.tecoalese.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long Page_Load_TimeOut = 20;
	public static long Implicit_Wait = 5;
	
	public void switchToFrame(String frameName) {
		driver.switchTo().frame(frameName);
	}
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
}
