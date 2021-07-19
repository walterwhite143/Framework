package com.autoamation.testbase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class  ActionEngine  extends BaseTest {
	private static  WebElement element ;
	private static  List<WebElement> elements ;
	 private  static Select select = new Select(element);
	private static Actions action = new Actions(getDriver());
	public static  WebElement identifyElement (String locMech ,String locValue ) {
		
		switch(locMech) {	   
		case "id " : element = getDriver().findElement(By.id(locValue));
		break ;
		case "name " : element = getDriver().findElement(By.name(locValue));
		break ;
		case "xpath " : element = getDriver().findElement(By.xpath(locValue));
		break ;
		case "classname " : element = getDriver().findElement(By.className(locValue));
		break ;
		case "css" : element = getDriver().findElement(By.cssSelector(locValue));
		break ;
		case "LinkText" : element = getDriver().findElement(By.linkText(locValue));
		break ;	
		case "partial" : element = getDriver().findElement(By.partialLinkText(locValue));
		break ;		
		}
		return element ;
	}	

	public  List<WebElement> identifyElements (String locMech ,String locValue ) {
		switch(locMech) {
		case "id " : elements =  getDriver().findElements(By.id(locValue));
		//driver.findElme(By.xp)
		      
		break ;
		case "name " : elements = getDriver().findElements(By.name(locValue));
		break ;
		//getDriver().getWindowHandle();
		case "xpath " : elements = getDriver().findElements(By.xpath(locValue));
		break ;
		case "classname " : elements = getDriver().findElements(By.className(locValue));
		break ;
		case "css" : elements= getDriver().findElements(By.cssSelector(locValue));
		break ;	
		case "LinkText" : elements = getDriver().findElements(By.linkText(locValue));
		break ;	
		case "partial" : elements = getDriver().findElements(By.partialLinkText(locValue));
		break ;		
		}
		return elements ;
	}
	public static void click(String locMech ,String locValue) {
		//  identifyElement(locMech,locValue);
		element = identifyElement(locMech,locValue);
				if(element.isDisplayed() && element.isEnabled()) {
					element.click();
				}
				else {
					//throw exceptions 
				}
	}
	public static void jsClick() {
	
	}
	public static void actionsClick(String locMech,String locValue) {
		element = identifyElement(locMech,locValue);
	//	Actions action = new Actions(getDriver());
		if(element.isDisplayed() && element.isEnabled()) {
		   action.click(element);	
		}
		else {
		  //	throw Exception 
		}
	}
	public static void doubleClick(String locMech,String locValue) {
		element = identifyElement(locMech,locValue);
	//	Actions action = new Actions(getDriver());
		if(element.isDisplayed() && element.isEnabled()) {
		   action.click(element);	
		}
		else {
		  //	throw Exception 
		}
	}
	public static void DTA(String locMech,String locValue,String testData) {
		element = identifyElement(locMech,locValue);
		if(element.isDisplayed() && element.isEnabled()) {
			element.clear();
			element.sendKeys(testData);
		}
		else {
			//throw exception 
		}		
	}
	public static void jsDTA() {
		
	}	
	public static  void  selectDropdown(String locMech,String locValue,String how,String value) {
		element = identifyElement(locMech,locValue);
		   String tagName =   element.getTagName();
		   if(tagName.equalsIgnoreCase("select")) {
			   Select select = new Select(element);
			   if(how.equalsIgnoreCase("index")) {
				   int val = Integer.parseInt(value);
				   select.selectByIndex(val);
			   }
			   else if(how.equalsIgnoreCase("value")) {
				   select.selectByValue(value);
			   }
			   else if(how.equalsIgnoreCase("text")) {
				   select.selectByVisibleText(value);
			   }
		   }
		   else {
			   //throw Exception 
		   }	  
	}
	public static List<WebElement>  getDropdownValues(String locMech ,String locValue,String how,String value ) {
		List<WebElement> elements = null;
		element = identifyElement(locMech,locValue);
		if(element.getTagName().equalsIgnoreCase("select")); {
		elements = select.getOptions();	
		}		
		return elements;	
	}
	public static  String handleWindows() {
		String Child_Window = " ";
		String  current_window = getDriver().getWindowHandle();
		Set<String>  all_window = getDriver().getWindowHandles();
		for( String window :all_window) 
		{
			if(window.equalsIgnoreCase(current_window )) {
					
			}
			else {
				TargetLocator  targetLocator = getDriver().switchTo();
				targetLocator.window(window);
				String Child_Window1 = getDriver().getWindowHandle();			
			}		
		}
		return current_window ;		
	}
	 public static  String  handleMultiWindows (int index) {
		 Set<String>  windows = getDriver().getWindowHandles();
		 List<String>  windows1 =  new ArrayList<String>(windows);
		 String name =   windows1.get(index);
		 TargetLocator  targetLocator =  getDriver().switchTo();
		 targetLocator.window(name);
		 String child_Window_Name = getDriver().getWindowHandle();
		 return  child_Window_Name ;
	 }	 
	 
	}


