package pomobjectrepository;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generics.PageUtility;

public class Goibibo_FlightInformation extends PageUtility
{
	WebDriver driver;
	 //1. initilizaing each component using page factory class
	  
	  public Goibibo_FlightInformation(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }
	//2. locating each components using @FindBy annotation
	  
	  @FindBy(xpath="//span[@class='curPointFlt switchAct']")	  
	  WebElement flight_info;
	  
	  @FindBy(xpath="(//a[@class='dF alignItemsCenter curPointFlt alignItemsCenter fr'])[1]")
	  WebElement flight_Details;
	  
	  @FindBy(xpath="//span[.='Fare Details']")
	  WebElement fare_Deatils;
	  
	  //@FindBy(xpath="//span[@class='curPointFlt switchAct']")
	  @FindBy(xpath="//span[.='Baggage Rules']")
	  WebElement baggage_Deatils;
	  
	  //@FindBy(xpath="//span[@class='curPointFlt switchAct']")
	  @FindBy(xpath="//span[.='Cancellation Rules']")
	  WebElement cancellation_Rules;
	  
	  // 3
	  public int scrollbar(WebDriver driver) {

			Point p1 = flight_info.getLocation();
			// int x= p1.getX();
			int y = p1.getY();
			// System.out.println(y);
			JavascriptExecutor j1 = (JavascriptExecutor) driver;
			j1.executeScript("window.scrollBy(0," + y + ")");
			// Thread.sleep(3000);

			j1.executeScript("window.scrollBy(0,-10)");

			return y;
		}
	  public void flightDetails() {
		  
		  flight_Details.click();
		 // scrollbar(driver);  
		  
	  }
	  public void flightInfo() {
		  flight_info.click();
	  }
	  public void fareDetails() {
		  fare_Deatils.click();
	  }
	  
	  public void baggageDeatils() {
		  baggage_Deatils.click();
	  }
	  public void cancellationRules() {
		  cancellation_Rules.click();
	  }
	  
	  public void Validate_flightInfo()
	  {
		  Assert.assertEquals(flight_info.isDisplayed(), true,"flight info link is not displayed");
		  
		  System.out.println("flight info link : " +flight_info.getText());
	  }
	  
	  public void Validate_fareDeatils()
	  {
		  Assert.assertEquals(fare_Deatils.isDisplayed(), true,"fare Deatils  link is not displayed");
		  
		  System.out.println("fare Deatils link : " +fare_Deatils.getText());
	  }
	  
	  public void Validate_baggageDeatils()
	  {
		  Assert.assertEquals(baggage_Deatils.isDisplayed(), true,"baggage Deatils  link is not displayed");
		  
		  System.out.println("baggage Deatils link : " +baggage_Deatils.getText());
	  }
	  
	  public void Validate_cancellationRules()
	  {
		  Assert.assertEquals(cancellation_Rules.isDisplayed(), true,"cancellation Rules  link is not displayed");
		  
		  System.out.println("cancellation Rules link : " +cancellation_Rules.getText());
	  }
	  
}
