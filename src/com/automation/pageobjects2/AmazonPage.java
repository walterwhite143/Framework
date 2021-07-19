package com.automation.pageobjects2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonPage {
	WebDriver driver ;
	AmazonPage( WebDriver driver) {
		this.driver = driver ;		
	}
	@FindBy(how =How.XPATH,using="//a[@data-nav-role='signin' and @data-nav-ref='nav_ya_signin']")
	 WebElement sign_up;
	@FindBy(how =How.XPATH,using="//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	 WebElement username;
	@FindBy(how =How.XPATH,using="// //input[@id='continue']")
	 WebElement Continue;	
	@FindBy(how =How.XPATH,using="//input[@type='password' and @name='password']")
	 WebElement password;
	@FindBy(how =How.XPATH,using="//input[@id='signInSubmit']")
	 WebElement LoginButton;
	@FindBy(how =How.XPATH,using="//input[@id='twotabsearchtextbox' and @aria-label='Search']")
	 WebElement SearchBar ;
	@FindBy(how =How.XPATH,using="//div[@class='nav-search-submit nav-sprite']")
	 WebElement SearchElement ;
	@FindBy(how =How.XPATH,using="(//span[@class='a-size-medium a-color-base a-text-normal' ])[3]")
	 WebElement Search_4Product ;
	@FindBy(how =How.XPATH,using="(//span[@class='a-declarative']/a[@class='a-popover-trigger a-declarative']/i[@class='a-icon a-icon-star-small a-star-small-4-5 aok-align-bottom'])[3]\")")
	 WebElement StarElement ;
	// //input[@id='add-to-cart-button']
	@FindBy(how =How.XPATH,using="//input[@id='add-to-cart-button']")
	 WebElement AddCart ;	
	@FindBy(how =How.XPATH,using="//a[@id='hlb-ptc-btn-native' and @role='button']")
	 WebElement ProceedToBuy ;

	public void enter_ElementSearchBar(String element) throws InterruptedException {
		Thread.sleep(2000);		
		SearchBar.sendKeys(element);
	}
	public void search_ElementClick()throws InterruptedException {
		Thread.sleep(2000);
		SearchElement.click();
	}
	public void search_4_Element() throws InterruptedException {
		Thread.sleep(2000);
		String element = Search_4Product.getText();	
		System.out.println("the text of a element is "+element);
	}
	public void  clickStarElement(WebDriver driver ) throws InterruptedException {
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		Thread.sleep(4000);
		
     a.moveToElement(StarElement).build().perform();			 
	}
	public void  Add_Cart() throws InterruptedException {
		Thread.sleep(3000);
		AddCart.click();		
	}
	public void Procced_Buy() throws InterruptedException {
		Thread.sleep(3000);
		ProceedToBuy.click();		
	}
	public void UserName() throws InterruptedException {
		Thread.sleep(3000);
		username.click();		
	}
	public void Continue() {
		Continue.click();		
	}
	public void password() {
		password.click();	
	}
	
	 
}


	

