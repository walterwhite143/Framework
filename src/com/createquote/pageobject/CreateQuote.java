package com.createquote.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.autoamation.testbase.BaseTest;

public class CreateQuote extends BaseTest {
	WebDriver driver ;
	@FindBy(how =How.XPATH,using="//input[@id='password']")
	 WebElement password;
	@FindBy(how =How.XPATH,using="//input[@id='email' and @name ='Email Address']")
	 WebElement username;
	@FindBy(how=How.XPATH,using ="//button[@type='submit']")
	WebElement loginbutton ;
	@FindBy(how =How.XPATH,using ="//button[@id='details-button']")
	WebElement AdvanceLink;
	@FindBy(how=How.XPATH,using = "//a[@id='proceed-link']")
	WebElement proceedLink ;
	//
	public CreateQuote( WebDriver driver) {
		this.driver = driver ;
		PageFactory.initElements(driver, this);
		//PageFactory.initElements(driver,CreateQuote.java
	}
	//Actions 
	public void ProccedLink() throws InterruptedException {
		Thread.sleep(2000);
		 proceedLink .click();	
	}
	public void AdvanceLink() throws InterruptedException {
		Thread.sleep(2000);
		AdvanceLink.click();	
	}
	public void Username() throws InterruptedException {
		Thread.sleep(5000);
		username.sendKeys("vineet.k3892@gmail.com");		
	}
	public void Password() throws InterruptedException {
		password.sendKeys("Pass@12345");		
	}
	public void Submit() {
		loginbutton.click();
	}
	// public String  getTitle() return driver.getTitle();
	// public boolean validateimage	
	public HomePage login() throws InterruptedException {
		Thread.sleep(2000);
		AdvanceLink.click();	
		Thread.sleep(2000);
		 proceedLink .click();	
		username.sendKeys("vineet.k3892@gmail.com");
		password.sendKeys("Pass@12345");
		loginbutton.click();
	   	return new HomePage();
	}
}
