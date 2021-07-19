package com.automation.supporters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

public class PropertyReader2  {	
	 public static String getValue(String  key) throws IOException {
		 Properties p = new Properties();
			FileInputStream fi = new FileInputStream("C:\\Users\\harish\\Downloads\\java folder\\Framework\\src\\com\\automation\\objectrepository\\\\config.properties");
			          //  Optional<T>.ofNullable(p)
			//Optional.of(value)
			  p.load(fi);	 
			  String value = p.getProperty(key);	
			  System.out.println("the value is "+value);	 
		return value;		 
	 }	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	Properties p = new Properties();
	FileInputStream fi = new FileInputStream("C:\\Users\\harish\\Downloads\\java folder\\Framework\\src\\com\\automation\\objectrepository\\\\config.properties");
	  p.load(fi);	 
	  String value = p.getProperty("popu");	
	  System.out.println("the value is "+value);
	
//	String filepath;
//	FileInputStream fileinputstream ;
	//static Properties properties  ;
	//public  void PropertiesReader(String filepath) throws IOException {
	//	this.filepath = filepath;
	//	    fileinputstream = new FileInputStream(filepath);
	//	properties = new Properties();	
	//	properties.load(fileinputstream);
		// String path ="C:\\Users\\harish\\Downloads\\java folder\\Framework\\src\\com\\automation\\objectrepository\\config.properties";
	//}
	//public static  String getPropertyValue(String key) {
	//	String value = properties.getProperty(key);		     
	//	return value ;		
	//}
	//public String getPropertyValue(Object key) {
	//	  String value2 = (String) sproperties.get(key);
	//	  return value2 ;
	//*}

}
}
