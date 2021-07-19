package com.createquote.pagetest;

import org.testng.annotations.Test;

import com.createquote.pageobject.HomePage;

public class HomePageTest {
	@Test
	public void validateHomePage() throws InterruptedException {
		 
		HomePage hm = new HomePage();
	   hm.manageQuote();
	hm.createnewQuote();
		hm.chooseProduct();
		hm.unitLinked();	
	}

}
