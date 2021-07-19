package com.createquote.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Createnewquote {
	
	WebDriver driver ;

	@FindBy(how =How.XPATH,using="//mat-select[@id='mat-select-4']")
	 WebElement occupation;
	@FindBy(how =How.XPATH,using="//mat-select[@id='mat-select-4']")
	 WebElement myntra ;
	
	 //WebElement occupation =    getDriver().findElement(By.xpath("//mat-select[@id='mat-select-4']"));

}
