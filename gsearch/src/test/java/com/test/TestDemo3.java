package com.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.test.gsearch.BaseTest;
import com.pom.SearchGoogle;

public class TestDemo3 extends BaseTest{
	
	@Test(groups= {"user"})
	public void test() throws InterruptedException {
		SearchGoogle a3=new SearchGoogle(driver);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs("Google"));
		Assert.assertEquals(driver.getTitle(), "Google");
//		SoftAssert s=new SoftAssert();
//		s.assertEquals(driver.getTitle(), "Google");
//		s.assertAll();
	    a3.setSbox("qspider");
		a3.list();
		}
	

}