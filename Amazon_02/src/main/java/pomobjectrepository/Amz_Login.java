package pomobjectrepository;

//import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generics.ExcelUtilities;

//import generics.LaunchandQuit;
public class Amz_Login 
{
	//WebDriver driver;
	ExcelUtilities ex1 = new ExcelUtilities();
	// String username1=null;
//	  String password1 = null;

	// 1. locating each components using @FindBy annotation
	// @FindBy(id="ap_email")
	@FindBy(xpath = "//input[@name='email']")
	WebElement username;

	// @FindBy(id="continue")
	@FindBy(xpath = "//input[@id='continue']")
	WebElement username_submit;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signin_button;

	// 2. creating the method for each componenet to perform its action

	public void userName(String un) {
		// username.sendKeys(ex1.getusername(username1)); // getting data from
		// data.properties file - its working

		username.sendKeys(un);
	}

	public void un_submit() {
		username_submit.click();
	}

	public void password(String pwd) {
		password.sendKeys(pwd);
	}

	public void signin() {
		signin_button.click();
	}
	
	  public void validate_correctEmailPwd(String UN,String PWD) 
	  {
		  String username1=username.getAttribute("value");
		  String actual_username=username1.substring(3,13);
		  String actual_pwd=password.getAttribute("value");
		  
		//  System.out.println(actual_username);
		 // System.out.println(actual_pwd);
		  
		  
		  Assert.assertEquals(actual_username==UN, actual_pwd==PWD);
		  
	  }

  public void validate_correctEmailPwd_1(String UN,String PWD) 
  {
	  //System.out.println(UN);
	 // System.out.println(PWD);
	 
	  String username1=username.getAttribute("value");
	  String actual_username=username1.substring(3,13);
	  String actual_pwd=password.getAttribute("value");
	  
	 // System.out.println(actual_username);
	 // System.out.println(actual_pwd);
	 
	  //Assert.assertEquals(username.isDisplayed(), true,"user name is invalid");
	 // Assert.assertEquals(password.isDisplayed(), true,"password is invalid");
	  
	  if(actual_username!= UN  && actual_pwd!= PWD)
	  {
	     Assert.assertEquals(actual_username, true,"user name is invalid");
	     Assert.assertEquals(actual_pwd, true,"password is invalid");
	  
	  }
	  else if(actual_username== UN  && actual_pwd!= PWD)
	  {
		   //  Assert.assertEquals(actual_username, true,"InCorrect Email id");
		     Assert.assertEquals(actual_pwd, true,"InCorrect Password");
	  }
	  
	 // Assert.assertEquals(PWD, true,"password is invalid");
  }
  
  public void validate_InCorrectEmailPwd(String UN,String PWD) 
  {
	  String username1=username.getAttribute("value");
	  String actual_username=username1.substring(3,13);
	  String actual_pwd=password.getAttribute("value");	
	
	  System.out.println(actual_username);
      System.out.println(actual_pwd);
      
	  System.out.println(UN);
	  System.out.println(PWD);
	  
//	  if(actual_username!= UN ) 	  {
//	     Assert.assertEquals(actual_username==UN, true,"user name is invalid");
//	     
//	  }
//	  if(actual_pwd!= PWD)
//	  {
//		  Assert.assertEquals(actual_pwd==PWD, true,"password is invalid");
//	  }
	  
	  
	  Assert.assertEquals(actual_username==UN, actual_pwd==PWD);
	
  }
	// 3. initilizaing each component using page factory class

	public Amz_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
