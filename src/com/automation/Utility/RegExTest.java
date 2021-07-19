package com.automation.Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// classname .methodname because it is static method 
		// i will get pattern object 
		  Pattern pattern = Pattern.compile("java");		                 
		  Matcher matcher =   pattern.matcher("abchello123java@abc java java ");
		  int acount = 0;
		           while(matcher.find()) {
		        	   acount++;
		        	  String value  =   matcher.group();
		        	  System.out.println(value);
		        	         int startindx =  matcher.start();
		        	          System.out.println(startindx);
		        	          int endinx = matcher.end();
		        	          System.out.println(endinx);
		           }
		           System.out.println("the number of occurance in a string is "+acount);
	}
}
