package com.createquote.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.autoamation.testbase.BaseTest;
public class HomePage extends BaseTest{	
WebDriver driver ;

	@FindBy(how =How.XPATH,using="//li[@class='nav-item xceed-hasmenu ng-star-inserted'][4]")
	 WebElement Manage_Quote;
	@FindBy(how =How.XPATH,using = ("//*[contains(text(),'Create New Quote ')]"))
			WebElement Create_NewQuote;
	@FindBy(how=How.XPATH,using = ("//li[@class='col-sm-4 d-flex align-items-stretch'])[3]"))
	WebElement Choose_a_product;	
	@FindBy(how=How.XPATH,using =("li[@formarrayname='ProductTypes']/input[@value='Term']"))
	WebElement Terminsurance ;
			
	@FindBy(how=How.XPATH,using =("//li[@formarrayname='ProductTypes']/input[@value='ULIP']"))
	WebElement unitlinked;
	@FindBy(how=How.XPATH,using =("//input[@id='exampleCheck1'and @type='checkbox']"))
	WebElement checkbox1;
	@FindBy(how=How.XPATH,using = ("//input[ @type='checkbox' and @id='exampleCheck2']"))
	WebElement checkbox2;
	public HomePage() {
		//this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	public void manageQuote() throws InterruptedException {
		Thread.sleep(10000);
		 Manage_Quote.click();	
	}
	public void createnewQuote() throws InterruptedException {
		Thread.sleep(2000);
		 Actions a = new Actions(getDriver());
		 a.moveToElement(Create_NewQuote).click().perform();		
	}
	public void chooseProduct() throws InterruptedException {
		  Thread.sleep(4000);
		  Choose_a_product.click();
		  Choose_a_product.sendKeys();	  
	}
	public void unitLinked() throws InterruptedException {
		Thread.sleep(2000);
		unitlinked.click();
	}		
}
