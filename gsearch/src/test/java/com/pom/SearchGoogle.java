package com.pom;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SearchGoogle {
	
	@FindBy(xpath="//*[@id='lst-ib']")
	WebElement sbox;
	@FindBy(xpath="//*[@id='tsf']/div[2]/div[3]/center/input[1]")
	
     WebElement btn;
	@FindBy(xpath="//li")
	List<WebElement> list;
		
	public SearchGoogle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	public void setSbox(String s){
		sbox.sendKeys(s);
	}
	public void list() throws InterruptedException {
		String text="";
		list.size();
		for(int i=0; i<list.size();i++) {
		 text = list.get(i).getText();
		 System.out.println(text);
		 if(text.equals("qspiders")) {
			 list.get(i).click();
			 Thread.sleep(3000);
		 }
		
		}
		
	}
	public void clkbtn() {
		btn.click();
	}
	
}
