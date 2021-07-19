
package com.automation.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.autoamation.testbase.ActionEngine;
import com.autoamation.testbase.BaseTest;

public class FlipkartPage extends ActionEngine  {
	
	WebDriver driver ;	
	// 
public FlipkartPage(WebDriver driver) {
		this.driver = driver ;		
	}
@FindBy(how=How.XPATH,using ="(//div[@class='xtXmba'][text()='Fashion']")
//

private WebElement Fashion ;
@FindBy(how=How.XPATH,using ="//a[@class='_6WOcW9 _2-k99T']")
private WebElement Topwear;
	@FindBy(how =How.XPATH,using="//button[@class='_2KpZ6l _2doB4z']")
	  private WebElement pop_up;
	@FindBy(how =How.XPATH,using = "//span[@class='_2I9KP_'][text()='Men']")
     private   WebElement Men ;	
	@FindBy(how=How.XPATH,using = "MenTo = //a[@class='_6WOcW9 _2-k99T']")
	  private WebElement mento ;
	@FindBy(how = How.XPATH ,using = "//a[@title='Clothing'][@class='_3QN6WI _1MMnri _32YDvl']") WebElement Clothin ;
	// //*[@class='_3QN6WI _1MMnri _32YDvl' and @title='Clothing']
	@FindBy(how = How.XPATH ,using = " (//select[@class='_2YxCDZ'])[1]") 
	 private WebElement min_Pric ;
	@FindBy(how = How.XPATH ,using = " (//select[@class='_2YxCDZ'])[2]") 
	private WebElement  max_Pric ;
	public void Fashion() {
		Fashion.click();
	}
	public  void popUp() throws InterruptedException {
		Thread.sleep(500);		
		pop_up.click();	
	
	}
     public  void   Men() throws InterruptedException {
    	 Thread.sleep(1000);
    	 Men.click();   
   	 
     }
     
     public  void Clothing() {
    	 Clothin.click();  	 
    }
     public void Max_Price() { 
    	 max_Pric .click();
    	 }
 
     public void Min_Price() {
    	 min_Pric.click();    	 
     }
     public void Topwear() {
    	 Topwear.click();
    	 
     }
}
