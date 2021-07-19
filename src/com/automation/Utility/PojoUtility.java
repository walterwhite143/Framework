package com.automation.Utility;

import java.io.IOException;
import java.util.Optional;

import com.automation.customizedexceptions.FrameworkException;
import com.automation.supporters.PropertiesReader;

public class PojoUtility {

	public  static PropertiesReader getconfigproperties() throws IOException, FrameworkException {
		PropertiesReader prOR  = new PropertiesReader(FilePaths.objectrepository);
		    // object repository path will be set for it 
		//   here i have give path dynamically it will acesss through it 
		//   total  that class creating object thats why iam passing 
		     Optional<PropertiesReader> optional = Optional.of(prOR);
		     if(optional.isPresent()) 		    	 ;
		     else
		    		 System.out.println("prOR is pointing to null ");	     
			return prOR;
			
	}
	//public static PropertiesReader  getconfigValues() throws IOException {
		//PropertiesReader prOR  = new PropertiesReader(FilePaths.valuesrepository);
		// /Optional<PropertiesReader> optional = Optional.of();
	   //  if(optional.isPresent()) 
	    	 ;
	  //   else 
	    	//	 System.out.println("prOR is pointing to null ");		
		//return null;
	}	 