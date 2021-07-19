package com.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.autoamation.testbase.BaseTest;
import com.automation.customizedexceptions.FrameworkException;

public class PropertiesReader  extends BaseTest{
  private String filepath ;
  private FileInputStream fileInputStream ;
    private Properties properties ;
  public PropertiesReader(String filepath) throws IOException, FrameworkException {
	  this.filepath = filepath;
	   fileInputStream = new FileInputStream(filepath);  
	   properties = new Properties();
	//Optional<Properties> optional =   Optional.of(properties);
	   java.util.Optional<Properties> optional =java.util.Optional.ofNullable(properties);
	 if(optional.isPresent()) {
	  properties.load(fileInputStream);
	}
	 else {
		System.out.println("property object pointing to null");
		FrameworkException  frameworkException =  new FrameworkException("property object pointing to null");
		throw frameworkException;
		// By using throw  i can my own exception s
		//check exceptions 
	}
  }
  public String  getPropertyValue(String key) {
	 String value = properties.getProperty(key);
	 java.util.Optional<String> optional =java.util.Optional.ofNullable(key);
	 if(optional.isPresent()) {
	 }
	 else {
		 System.out.println("value is not avilable for the the key"+key);
	 }
	return value;   
  }
  public String  getPropertyValue(String key,String defaultValue) {
		 String value = properties.getProperty(key);
		 java.util.Optional<String> optional =java.util.Optional.ofNullable(key);
		 if(optional.isPresent()) {		      
		 }
		 else {
			 System.out.println("value is not avilable for the the key"+key);
		 }
		 value = defaultValue ;
		return value; 
}
  public String  getPropertyValue(Object key) {
		 String value = properties.getProperty((String) key);
		 java.util.Optional<String> optional =java.util.Optional.ofNullable(value);
		 if(optional.isPresent()) {
			 
		 }
		 else {
			 System.out.println("value is not avilable for the the key"+key);
		 }
		return value;   
	  }
	  public String  getPropertyValue(Object key,Object defaultValue) {
			 String value = (String) properties.getOrDefault(key, defaultValue);
			 java.util.Optional<String> optional =java.util.Optional.ofNullable(value);
			 if(optional.isPresent()) {		      
			 }
			 else {
				 System.out.println("value is not avilable for the the key"+key);
			 }
			 value = (String) defaultValue ;
			return value; 
	}
	  public void writeDataToProperty(String key,String value ) throws IOException {
		  properties.setProperty(key, value);
		  FileOutputStream  fileOutputStream = new FileOutputStream(filepath) ;
		  properties.store(fileOutputStream, "File is saved sucessfully");		  
	  }
	  public void writeDataToProperty(Object key,Object value ) throws IOException {
	//	  properties.setProperty(key, value);
		  properties.put(key, value);
		  FileOutputStream  fileOutputStream = new FileOutputStream(filepath) ;
		  properties.store(fileOutputStream, "File is saved sucessfully");		  
	  }
	  public Map<String ,String>  getTotalData() throws IOException {
	    Map<String ,String>  mapData = new LinkedHashMap<String ,String>();
	    Set keys =  properties.keySet();
	    for(Object obj :keys) {
	    	String key = (String)obj ;
		String value = properties.getProperty(key);
	    }
		return mapData;
	  }
	  public Set<String> getKeys() {
		  Set keys =  properties.keySet();
		  Set<String> keys1 =  new HashSet<String>();
		  for(Object obj :keys) {
			  String  key = (String) obj ;
			  keys1.add(key) ;
		  }
		return keys1;		
	  }
	  public Set<String> getValues() {
		  Set keys =  properties.keySet();
		  Set<String> values =  new HashSet<String>();
		  for(Object obj :keys) {
			  String  key = (String) obj ;           
			  String value =  properties.getProperty(key);	                 
			  values.add(key) ;
		  }
		return values;	     
	  }
	  public void removeProperty(Object key) throws IOException {
		  properties.remove(key) ;
		  FileOutputStream  fileoutputStream = new FileOutputStream(filepath);
		  properties.store(fileoutputStream, "file saved sucessfully");		  
	 }
	  public void removeProperty(Object key,Object value) throws IOException {
		  properties.remove(key,value) ;
		  FileOutputStream  fileoutputStream = new FileOutputStream(filepath);
		  properties.store(fileoutputStream, "file saved sucessfully");		  
	 }
	  
}
