package pomobjectrepository;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import generics.PageUtility;

public class Goibibo_Search extends PageUtility
{
	WebDriver driver;
	// 1. initilizaing each component using page factory class

	public Goibibo_Search(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// 2. locating each components using @FindBy annotation
	
	
	@FindBy(xpath = "//div[6]/input[@type='text']")
	WebElement input_PassengerClass;
	
	/*Travell class  */
	  @FindBy(xpath="//ul[@class='sc-12foipm-58 juWqGL']/li[1]")
	  WebElement Travel_Class;
	  
	  @FindBy(xpath="//div[4]//select")
	  List <WebElement> dropdown_TravelClass;
	  
	//  @FindBy(xpath="//span[text()='Round Trip']")
	//  @FindBy(xpath="(//input[@name='flt-class-group'])[2]")
	 // @FindBy(xpath="(//label[@for='radio-1'])[2]")
	  @FindBy(xpath="//section[@class='search-widget-uistyles__OuterWrapDiv-sc-f6e3g4-0 djUYgM']//div//div[2]//input[1]")
	  WebElement roundTrip_searchpage;
	  
	  
	  /* one way trip radio button in the search result page */
	  //@FindBy(xpath="(//label[@class='search-widget-uistyles__RadioLabel-sc-f6e3g4-3 ijwIlZ'])[1]")
	  @FindBy(xpath="//section[@class='search-widget-uistyles__OuterWrapDiv-sc-f6e3g4-0 djUYgM']//div//div//input[1]")
	  WebElement oneWayTrip;
	  
	  // 
	  @FindBy(xpath="")
	  WebElement passengers;
	  
	  
	// first home page Traveller and class
	@FindBy(xpath="(//p[@class='sc-12foipm-18 cTPYom fswWidgetTitle'])[5]")
	WebElement TravellerClass;
			
			
	//  Book button
	@FindBy(xpath="//input[@value='Book']")
	WebElement Book;
	
	// click on view fares button
	@FindBy(xpath="(//button[text()='VIEW FARES'])[2]")
	WebElement viewFares;
	
	@FindBy(xpath="(//span[text()='1 Stop'])")
	WebElement oneStop;

	// 3 creating the method for each componenet to perform its action
	
	public void viewFares() {
		
		viewFares.click();
	}
	
	public void oneStop()
	{
		oneStop.click();
	}
	
	public void book(WebDriver driver) {
		
		Book.click();		
		switchtochildWindow(driver);
	}
	
	public void switchwindow(WebDriver driver)
	{
	//	String parentid = driver.getWindowHandle();
		Set<String> childid = driver.getWindowHandles();
		
	//	System.out.println(parentid);
	//	System.out.println(childid);
		
		Iterator<String> childid1 = childid.iterator();
		
//		String firstwindow= childid1.next();
		String secondwindow = childid1.next();
		
	//	System.out.println(firstwindow);
		System.out.println(secondwindow);
		
		driver.switchTo().window(secondwindow);
		
	}

//	public void validate_PassengerClass() 
//	{
//		  
//		//String Expected_name;
//		String value=input_PassengerClass.getAttribute("value");
//		//String expected_value="4 Traveller(s), Economy";	
//		
//		String actual_value=value.substring(16,23);
//		String expected_value=Travel_Class.getAttribute(value);
//		
//		System.out.println("Actual value :  " +actual_value);
//		System.out.println("Expected value : " +Travel_Class.getAttribute(value));
//		//Assert.assertEquals(actual_value, expected_value);
//		
//		if(expected_value.equalsIgnoreCase(actual_value)) 
//		{		
//		   if(actual_value != expected_value) 
//		   {			
//			   Assert.assertFalse(false, "value not matched");
//		   }		
//		}
//	}
//	
	  
	  
	  
	  
	public void Validate_roundTrip() {
			
			Assert.assertEquals(roundTrip_searchpage.isSelected(), true,"based on round trip selection search result is not displayed ");
			System.out.println("based on round trip selection search result is displayed" +roundTrip_searchpage.getText());
		}
	  
	 public void passengerClass() {		 
		 input_PassengerClass.click();	 
	 }
	 
	 public void oneWayTrip() {
		 
		   Assert.assertEquals(oneWayTrip.isSelected(),true,"one way trip radio button is not selected");
	 }
	 
	 
	 /*  validating the in single booking the system having ability to handle multiple passengers or not  */
	 public void validate_numberOfPassengers() {
		
		    String value=input_PassengerClass.getAttribute("value");		
			String actual_value=value.substring(0,1);
			int val=0;
			val = Integer.valueOf(actual_value);
			System.out.println("number of passengers are  :  " +val);
		
			if(val<=1)
			{				
				Assert.assertEquals(val>=2,true,"the systems ablity not handling the multiple passenger in single booking");				
			}
	 }

	 /* validating the traveller class   */
	public void validate_PassengerClass() 
	 {
			  
			//String Expected_name;
			String value=input_PassengerClass.getAttribute("value");		
			String actual_value=value.substring(16,23);
			String expected_value=dropdown_TravelClass.get(0).getText();
			
			System.out.println("Actual value :  " +actual_value);
			System.out.println("Expected value : " +expected_value);
			//Assert.assertEquals(actual_value, expected_value);
			
			if(expected_value.equalsIgnoreCase(actual_value)) 
			{		
			   if(actual_value != expected_value) 
			   {			
				   Assert.assertTrue(false, "value not matched");
			   }		
			}
		}

	
	public void validate_view_fares()
	{
		
		System.out.println(viewFares.getText());
		Assert.assertEquals(viewFares.getText(),"VIEW ", "check_in baggage is not charged");//VIEW FARES
	}	
	    
}
