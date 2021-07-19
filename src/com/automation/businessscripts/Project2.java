package com.automation.businessscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.autoamation.testbase.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class Project2 extends BaseTest{
 @Test
	public void  validatemanageQuote() throws InterruptedException {
		// TODO Auto-generated method stub	
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// WebDriver driver = new ChromeDriver();
	   String url = "https://52.163.62.118/";
	  // getExtentTest().log(LogStatus.INFO, "user abble to navigate url sucessfully");
		getDriver().get(url);
		//driver.get("https://imarketxceed.b2clogin.com/imarketxceed.onmicrosoft.com/b2c_1_susi/oauth2/v2.0/authorize?response_type=id_token&scope=https%3A%2F%2Fimarketxceed.onmicrosoft.com%2F1abfb036-afb3-4027-a1ec-90c2205e67c6%2Fread%20openid%20profile&client_id=1abfb036-afb3-4027-a1ec-90c2205e67c6&redirect_uri=https%3A%2F%2F52.163.62.118%2Fredirect&state=eyJpZCI6IjYyNmQ0ZGMzLWZkMWItNGJiMC1iOGRlLTExNDgyODgwZDk0YiIsInRzIjoxNjE4NDg0MDg2LCJtZXRob2QiOiJyZWRpcmVjdEludGVyYWN0aW9uIn0%3D&nonce=0b4d36bd-d6ec-43f5-996e-f9264a7c2942&client_info=1&x-client-SKU=MSAL.JS&x-client-Ver=1.4.3&ui_locales=en&client-request-id=d893c09d-ef71-4f5e-b29e-5b72dc3ebe6e&response_mode=fragment);");
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//button[@id='details-button']")).click();
		getExtentTest().log(LogStatus.INFO, "able to click advanced link");	
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//a[@id='proceed-link']")).click();
		getExtentTest().log(LogStatus.INFO, "able to click proceed link");
		Thread.sleep(5000);
		WebElement username = getDriver().findElement(By.xpath("//input[@type='email']"));
		 getExtentTest().log(LogStatus.INFO, "user able to enter broker name credentails as  ");
		username.sendKeys("vineet.k3892@gmail.com");
		Thread.sleep(1000);
		// vineet.k3892@gmail.com
		WebElement password = getDriver().findElement(By.xpath("//input[@name='Password']"));
		getExtentTest().log(LogStatus.INFO, "user able to enter  broker password credentails as admin");
		password.sendKeys("Pass@12345");
		Thread.sleep(2000);
		// Thread.setDefaultUncaughtExceptionHandler(eh);
		WebElement login = getDriver().findElement(By.xpath("//button[@type='submit']"));
		login.click();
		getExtentTest().log(LogStatus.INFO, "user able to click  submit button");
		Thread.sleep(7000);
				Thread.sleep(10000);
				WebElement quote = getDriver().findElement(By.xpath("//li[@class='nav-item xceed-hasmenu ng-star-inserted'][4]"));
				           quote.click();
				           getExtentTest().log(LogStatus.INFO, "user able to click  Manage Quota link");
				           Thread.sleep(2000);
				           Actions a = new Actions(getDriver());
				           WebElement  CreateNewQuote =getDriver().findElement(By.xpath("//*[contains(text(),'Create New Quote ')]"));
				          a.moveToElement(CreateNewQuote).click().perform();
				      	getExtentTest().log(LogStatus.INFO, "user able to click  Create New Quote link");
	  
				      	//	WebElement quote = getDriver().findElement(By.xpath("//li[@class='nav-item xceed-hasmenu ng-star-inserted'][4]"));
		
		
		          Thread.sleep(4000);
		          
		     WebElement  chooseaproduct = getDriver().findElement(By.xpath("(//li[@class='col-sm-4 d-flex align-items-stretch'])[3]"));
		    chooseaproduct.click();
		    getExtentTest().log(LogStatus.INFO, "user able to  click  Choose a Product radio button");
		    Thread.sleep(2000);
		  
		      WebElement  Terminsurance =  getDriver().findElement(By.xpath("//li[@formarrayname='ProductTypes']/input[@value='Term']"));
		      Terminsurance.click();
		      getExtentTest().log(LogStatus.INFO, "user able to click  Terminsurance radio button ");
		      Thread.sleep(2000);
		          WebElement UnitLinked =  getDriver().findElement(By.xpath("//li[@formarrayname='ProductTypes']/input[@value='ULIP']"));
		          UnitLinked .click();
		          getExtentTest().log(LogStatus.INFO, "user able to click  UnitLinked radiobutton ");
		          Thread.sleep(2000);
		       WebElement  customercheckbox1 =    getDriver().findElement(By.xpath("//input[@id='exampleCheck1'and @type='checkbox']"));
		       customercheckbox1.click();
		       getExtentTest().log(LogStatus.INFO, "user able to click  mandatory fields checkbox ");
		       Thread.sleep(2000);
		         WebElement  customercheckbox2 =  getDriver().findElement(By.xpath("//input[ @type='checkbox' and @id='exampleCheck2']"));
		         customercheckbox2.click();
		         getExtentTest().log(LogStatus.INFO, "user able to click  mandatory fields checkbox ");
		          Thread.sleep(3000);		          
		           
		           Thread.sleep(200);
		          JavascriptExecutor js = (JavascriptExecutor) getDriver();
		          js.executeScript("window.scrollBy(0,800)");
		        Thread.sleep(9000);
		        WebElement First_Nametitle =    getDriver().findElement(By.xpath("//mat-select[@id='mat-select-0']"));
		        ////mat-select[@id='mat-select-56']
		       if (First_Nametitle .isDisplayed()) {
		    	   First_Nametitle.click();
		    	     Thread.sleep(2000);
		    	    // getDriver().findElement(By.xpath("//span[@class='mat-option-text'][text()=' Mr.']")).click();
		    	   getDriver().findElement(By.xpath("//mat-option[@id='mat-option-2']")).click();
		    	     getExtentTest().log(LogStatus.INFO, "user able to select mr from the list");
		    	   //mat-option[@id='mat-option-426']
		       }
		                    else {
		    	System.out.println("element is not visible");
		                    }  
		   
		       WebElement   input = getDriver().findElement(By.xpath("//input[@formcontrolname='FirstName']"));
		       input.sendKeys("Test");
		       getExtentTest().log(LogStatus.INFO, "user able to enter firstname user details" );
		          Thread.sleep(2000);
		       WebElement middlename = getDriver().findElement(By.xpath("//input[@formcontrolname='MiddleName']"));
		         //  WebElement middlename =      getDriver().findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c59-4']"));           
		        middlename.sendKeys("Tester");	
		        getExtentTest().log(LogStatus.INFO, "user able to enter middle name details  " );		        
		     WebElement LastName =    getDriver().findElement(By.xpath("//input[@formcontrolname='LastName']"));
		     LastName.sendKeys("user22April");
		     getExtentTest().log(LogStatus.INFO, "user able to enter lastname details " );	     
		       WebElement Email =  getDriver().findElement(By.xpath("//input[@formcontrolname='Email']"));
		       Email.sendKeys("test14@gmail.com");	       
		       getExtentTest().log(LogStatus.INFO, "user able to enter email credentails details " );
		              WebElement Mobile_isd =      getDriver().findElement(By.xpath("//mat-select[@id='mat-select-2']")) ;
		              if(Mobile_isd.isDisplayed()) {
		            	  Mobile_isd.click();  
		            	  getExtentTest().log(LogStatus.INFO, "user  able to click mobile number field " );
		            	  Thread.sleep(2000);
		            	  getDriver().findElement(By.xpath("//span[@class='mat-option-text'][text()=' +49 '] ")).click();
		            	  getExtentTest().log(LogStatus.INFO, "user  able to select text  ISD  code "+49 );
		              }
		              else {
		            	  System.out.println("element is not visible ");
		              }		              
		         WebElement Mobile_number =     getDriver().findElement(By.xpath("//input[@formcontrolname='Mobile']"));
		         Mobile_number.sendKeys("2423535353");
		         getExtentTest().log(LogStatus.INFO, "user able to enter mobile number details " );
		         Thread.sleep(2000);	         
		        WebElement calender_widget =  getDriver().findElement(By.xpath("//button[@aria-label='Open calendar']"));
		        calender_widget.click();
		        getExtentTest().log(LogStatus.INFO, "user able to click calender widget " );
		        Thread.sleep(2000);
		      //   WebElement year =   getDriver().findElement(By.xpath("//td[@class='mat-calendar-body-cell ng-star-inserted']/div[@class='mat-calendar-body-cell-content mat-focus-indicator'][text()=' 1980 ']"));
		               WebElement year =    getDriver().findElement(By.xpath("//td[@aria-label='1980']"));
		         year.click();
		         getExtentTest().log(LogStatus.INFO, "user able to select 1980 year" );
		         Thread.sleep(2000);
		       WebElement month = getDriver().findElement(By.xpath("//td[@aria-label='Tue Jan 01 1980']"));
		       month.click();
		       getExtentTest().log(LogStatus.INFO, "user able to select january month" );
		       WebElement  date = getDriver().findElement(By.xpath("//td[@aria-label='Tue Jan 01 1980']"));
		                       date .click();
		                       getExtentTest().log(LogStatus.INFO, "user able to select 1 st date" );
		                       Thread.sleep(2000);
		            WebElement gender = getDriver().findElement(By.xpath("//label[@for='male_']"));
		                         gender.click();
		                         getExtentTest().log(LogStatus.INFO, "user able to click male  gender button" );		                         
		                WebElement next_button = getDriver().findElement(By.xpath("//a[@class='btn btn-primary nxt-btn-prod ng-star-inserted']"));
		                next_button.click();
		                getExtentTest().log(LogStatus.INFO, "user able to click next button  will navigate to create quote screen" );
		                Thread.sleep(4000);	   
		                
		              //  String value = " Head of technical";
		           //   List<WebElement>     occupation_1 =   getDriver().findElements(By.xpath("//div[@id='mat-select-4-panel']/mat-option"));
		           //  for(int i =0;i<occupation_1.size();i++) {
		           //   getExtentTest().log(LogStatus.INFO, occupation_1.get(i).getText());
		             //   	if(occupation_1.get(i).getText().equals(value)) {
		             //  		occupation_1.get(i).click();
		              // 		break ;
		                //	}                        	                	
		               // }	                
		              //mat-select[@id='mat-select-4']	                    
		          WebElement occupation =    getDriver().findElement(By.xpath("//mat-select[@id='mat-select-4']"));
		         getExtentTest().log(LogStatus.INFO, "user able to click occupation field  ");
		           if(occupation.isDisplayed()) {	                
		          occupation.click();
		         getDriver().findElement(By.xpath("//mat-option[@id='mat-option-13']")).click();
		        getExtentTest().log(LogStatus.INFO, "user able to select head of technical value  from dropdownlist  ");
		          }
		          else {
		           	getExtentTest().log(LogStatus.INFO, "element is not visible ");	            	
		        }	               
		           Thread.sleep(2000);		         
		           WebElement  select_smoking_habits = getDriver().findElement(By.xpath("//mat-select[@id='mat-select-6']"));	      
		             getExtentTest().log(LogStatus.INFO, "user able to click  smoking habits field  ");
		             if(select_smoking_habits.isDisplayed()) {
		            	select_smoking_habits.click();
		            	  // WebDriverWait  wait = new WebDriverWait(getDriver() ,30);
				         //  wait.until(ExpectedConditions.elementToBeClickable(select_smoking_habits));
		            	  getDriver().findElement(By.xpath("//mat-option[@id='mat-option-61']")).click(); 
		            	  ////mat-option[@id='mat-option-66']
		            	 getExtentTest().log(LogStatus.INFO, "user able to select  non smoker for atleast one year value from dropdown list ");
		            }
		            else {
		              getExtentTest().log(LogStatus.INFO, "element is not visible ");		            	  
		           }		
		          Thread.sleep(2000);	              
		           WebElement  ecnomic =  getDriver().findElement(By.xpath("//button[@class='counter-plus btn btn-on-focus btn-primary']"));
		           ecnomic.click();
		            getExtentTest().log(LogStatus.INFO, "user able to click plus button ");
		            Thread.sleep(2000);
		         WebElement  personal_status =  getDriver().findElement(By.xpath("//mat-select[@id='mat-select-8']"));
		           if(personal_status .isDisplayed()) {
		           	personal_status.click();
		             getExtentTest().log(LogStatus.INFO, "user able to click personalstatus field ");
		           	getDriver().findElement(By.xpath("//mat-option[@id='mat-option-66']")).click();
		             getDriver().findElement(By.xpath("//mat-option[@id='mat-option-67']/span[text()=' Married with Children ']")).click();
		            	getExtentTest().log(LogStatus.INFO, "user able to select married with children  value from a list ");
		           }
		           else {
		        	   getExtentTest().log(LogStatus.INFO, "element is not visible ");	            	
		            }
		            Thread.sleep(4000);			            
		           WebElement  country =     getDriver().findElement(By.xpath("//mat-select[@id='mat-select-10']"));
		                  if(country.isDisplayed()) {
		                	  country.click();
		                	 getExtentTest().log(LogStatus.INFO, "user able to country field ");
		                	  getDriver().findElement(By.xpath("//span[contains( text(),' Germany ')]")).click();
		                	   getExtentTest().log(LogStatus.INFO, "user able to select  germany country value from dropdown");
		                   }
		                  else {		                	   
		                 getExtentTest().log(LogStatus.INFO, "element is not visible ");
		                  }	                 
		                  Thread.sleep(2000);
		                  WebElement postalcode =  getDriver().findElement(By.xpath("//input[@id='mat-input-11']")); 		 		  
					         postalcode.sendKeys("94560");
					     getExtentTest().log(LogStatus.INFO, "user able to enter postal code 94560");		                   	             
		          Thread.sleep(2000);
		      WebElement  street =   getDriver().findElement(By.xpath("//input[@id='mat-input-16']"));
		      getExtentTest().log(LogStatus.INFO, "user able to click street field");
		      street.sendKeys(" Am Geigenbüchel");
		         //  getDriver().findElement(By.xpath("//mat-option[@id='mat-option-108']")).click();
		        // getExtentTest().log(LogStatus.INFO, "user able to select  Am Geigenbüchel value  from dropdown");
		           Thread.sleep(3000);	           
		       WebElement  flatname = getDriver().findElement(By.xpath("//input[@formcontrolname='FlatNo']"));
		                flatname.sendKeys("1111");		                  
		        //          WebElement yes =  getDriver().findElement(By.xpath("//button[@id='mat-button-toggle-1-button']"));
		          //        yes.click();
		           //       Thread.sleep(1000); 
		                  
		             //   WebElement question1 =  getDriver().findElement(By.xpath("//input[@type='radio' and @value='2']"));
		             //   question1 .click();	                
		              //    Thread.sleep(1000);
		            //   WebElement next_icon1 =   getDriver().findElement(By.xpath("//span[@class='carousel-control-next-icon']"));
		             //  next_icon1.click();
		                 //  Thread.sleep(1000);
		                  //     WebElement question2 = getDriver().findElement(By.xpath("//input[@name='2' and @value='6']"));
		                  //     question2.click();
		                  //     Thread.sleep(2000);
		                   //         WebElement next_icon2 =   getDriver().findElement(By.xpath("//span[@class='carousel-control-next-icon']"));
		                  //          next_icon2.click();
		                  //          Thread.sleep(1000);
		                   //  WebElement  question3 =       getDriver().findElement(By.xpath("//input[@name='3' and @value='12']"));
		                   //  question3.click();
		                   //  WebElement next_icon3 =   getDriver().findElement(By.xpath("//span[@class='carousel-control-next-icon']"));
	                       //     next_icon3.click();
	                      //      Thread.sleep(2000);
	                      //   WebElement question4 =   getDriver().findElement(By.xpath("//input[@name='4' and @value='16']"));
	                       //  question4.click();
	                       //  Thread.sleep(2000);
	                       //  WebElement next_icon4 =   getDriver().findElement(By.xpath("//span[@class='carousel-control-next-icon']"));
	                          // next_icon4.click();
	                        //    WebElement          question5  = getDriver().findElement(By.xpath("//input[@name='5' and @value='20']"));
	                        //     question5.click(); 
		         //mat-slider[@formcontrolname='InsuranceSum']/div[@class='mat-slider-wrapper'];
		                 JavascriptExecutor js2 = (JavascriptExecutor)getDriver();
		                js2.executeScript("window.scrollBy(0,700)");
		                Thread.sleep(3000);
		                  
	                             //	WebElement  insurance = getDriver().findElement(By.xpath("//mat-slider[@formcontrolname='InsuranceSum']/div[@class='mat-slider-wrapper']"));	
		                WebElement  insurance =  getDriver().findElement(By.xpath("//mat-slider[@formcontrolname='InsuranceSum']"));
	                             	for(int i = 1 ;i<=20;i++) {
	                             	 insurance .sendKeys(Keys.ARROW_RIGHT);                          		                              		 
	                             	 }  

	                             //
	                           // Actions action = new Actions(getDriver());
	                              //      action.moveToElement(insurance, 200, 300);
	                                  //  action.release().perform();
	                                    //  action.build().perform();
	                                    //  action.click();	                                       
	                                     //action.clickAndHold();
	                                     //action.moveByOffset(100, 150);
	                                    // action.build().perform();
	                                   //  Thread.sleep(1000);	                                     
	                                    // a2.moveToElement(toElement)
	                                    // a2.moveToElement(toElement, xOffset, yOffset)    ;                             	
}
 
}

