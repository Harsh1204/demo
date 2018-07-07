package com.google.test.gsearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver.exe");
	}
	@BeforeMethod
	
	public void appOpen() {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
