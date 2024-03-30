package pomobjectrepository;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Goibibo_Login
{
	WebDriver driver;
	 //1. initilizaing each component using page factory class
	  
	  public Goibibo_Login(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }
	  
	  //2. locating each components using @FindBy annotation
	  
	  @FindBy(xpath="//input[@class='loginCont__input']")
	  WebElement txtbox_inputPhoneNum ;
	  
	  @FindBy(xpath="//button[text()='Continue']")
	  WebElement btn_Continue;
	  
	  @FindBy(xpath="//h3[text()='Congratulations']")
	  WebElement Congratulation;
	  
	  @FindBy(xpath="//p[text()='You have successfully logged in']")
	  WebElement Successfully_Login;
	  
	  /* textbox  full name  */
	  @FindBy(xpath="//input[@placeholder='Enter your full name']")
	  WebElement txt_fullName;	  
	  
	  /* textbox enter email id  */
	  @FindBy(xpath="//input[@placeholder='Enter your email address']")
	  WebElement txt_emailID ;
	  
	  /*  Lets Go button */
	  @FindBy(xpath="//button[text()='Lets Go']")
	  WebElement btn_LetsGo;
	  
	  @FindBy(xpath="//span[@class='logSprite icClose']")
	  WebElement close_pop_window;
	  
	  @FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]")
	  WebElement From_City;
	  
	  @FindBy(xpath="//input[@type='text']")
	  WebElement input_FromCity;
	  
	  @FindBy(xpath="//ul[@id='autoSuggest-list']/li")
	  List<WebElement> fromCity_value;
	  
	  @FindBy(xpath="//input[@type='text']")
	  WebElement ToCity;
	  
	  @FindBy(xpath="//ul[@id='autoSuggest-list']/li")
	  List<WebElement> toCityvalue;	  
	  
	  /* select date from calendar  */
	  @FindBy(xpath="//div[4]//div[@class='DayPicker-Day']/p[1]")
	  WebElement dayPicker;
	  
	  /* click on done btn from calendar */
	 @FindBy(xpath="//span[@class='fswTrvl__done']")
	 WebElement done_btn_Calendar;
	  
	  /* cancel button from the calendar */
	  @FindBy(xpath="//*[.='Cancel']")
	  WebElement cancel_btn_Calendar;
	  
	  /* selecting adult   */
	 // @FindBy(xpath="(//span[@class='sc-12foipm-64 dGRyPm'])[2]/*[name()='svg'][1]")
	  @FindBy(xpath="(//*[name()='svg'])[3]")
	  WebElement adult_Traveller;
	  
	  /* selecting children  */
	  @FindBy(xpath="(//*[name()='svg'])[5]")
	  WebElement children_Traveller;
	  
	  /* selecting infants  */
	  @FindBy(xpath="(//*[name()='svg'])[7]")
	  WebElement infants_Traveller;
	  
	  /*Travell class  */
	  @FindBy(xpath="//ul[@class='sc-12foipm-58 juWqGL']/li[1]")
	  WebElement Travel_Class;
	  
	  /* click on Done btn  */
	  @FindBy(xpath="//a[@class='sc-12foipm-77 jYnAuG']")
	  WebElement done_btn_Travellers;
	  
	  /* click on cancel button  */
	  @FindBy(xpath="//a[@class='sc-12foipm-76 iSiiFc']")
	  WebElement Cancel_btn_Travellers;
	  
	  /*  selecting fare type  */
	  @FindBy(xpath="//ul[@class='sc-12foipm-8 bKIRNu']/li[1]")
	  WebElement fare_Type;
	  
	  /* click one search for flights button */
	  @FindBy(xpath="//span[@class='sc-12foipm-85 fUaVPB']")
	  WebElement serach_btn_Flights;
	  
	  //3 creating the method for each componenet to perform its action
	  
	  public void txtbox_InputPhoneNum() {
			 // txtbox_inputPhoneNum.sendKeys("8884431316");
			  txtbox_inputPhoneNum.sendKeys("9742941739");
		  }
	 public void btnContinue()
		  {
			  btn_Continue.click();
		  }
	 
	 public void validate_validCredential() {
		// 
		 System.out.println("valid " +Congratulation.getText());
		 System.out.println("valid Credential " +Successfully_Login.getText());
		 Assert.assertEquals(Successfully_Login.isDisplayed(), true,"Invalid Credential");
	 }
	  
	  public void closePopUpLoginWindow() {
		  close_pop_window.click();
	  }
	  //click on Form City
	  public void fromCity() {
		  From_City.click();
		  
	  }	 
	  // inputting the Form City
	  public void inputFromCity() {
		  input_FromCity.sendKeys("Bengaluru");		  
	  }
	  // selecting 0th index of form city value
	  public void fromCityValue() {
		  fromCity_value.get(0).click();
	  }
	  
	  // input to the to city
	  public void toCity() {
		  ToCity.sendKeys("Kalaburagi");
	  }
	  // selecting 0th index from Tocity value
	  public void toCityValue() {
		   toCityvalue.get(0).click();
	  }
	  
	  public void dayPicker() {
		  dayPicker.click();
	  }
	  
	  public void doneCalendar() {
		  done_btn_Calendar.click();
	  }
	  
	  public void cancelCalendar() {
		  cancel_btn_Calendar.click();
	  }
	  
	  public void adultTraveller() {
		  adult_Traveller.click();
	  }
	  public void childrenTraveller() {
		  children_Traveller.click();
	  }
	  public void infantsTraveller() {
		  infants_Traveller.click();
	  }
	  public void travelClass() {
		  Travel_Class.click();
	  }
	  
	  public void doneTravellers() {
		  done_btn_Travellers.click();
	  }
	  public void cancelTravellers() {
		  Cancel_btn_Travellers.click();
	  }
	  
	  public void fareType() {
		  fare_Type.click();
	  }
	  
	  public void searchFlights() {
		  
		  serach_btn_Flights.click();
	  }
	  
}
