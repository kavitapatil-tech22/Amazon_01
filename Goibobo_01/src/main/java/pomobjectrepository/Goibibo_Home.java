package pomobjectrepository;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generics.PageUtility;

public class Goibibo_Home extends PageUtility
{
	WebDriver driver;
	 //1. initilizaing each component using page factory class
	  
	  public Goibibo_Home(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }
	//2. locating each components using @FindBy annotation
	  
	  @FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]")
	  WebElement From_City;
	  
	 // @FindBy(xpath="//div[@class='sc-12foipm-38 dAUhfz']//input[1]")
	  @FindBy(xpath="//div[@class='sc-12foipm-35 kdxZzw']")
	  WebElement Click_On_FromCity;
	  
	  @FindBy(xpath="//input[@type='text']")
	  WebElement input_FromCity;
	  
	  @FindBy(xpath="//ul[@id='autoSuggest-list']/li")
	  List<WebElement> fromCity_value;
	  
	  /* not required this path bcz it will automatically open when fromcity gt selected  */
//	  @FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[2]")
//	  WebElement ToCity;
	  
	  @FindBy(xpath="//input[@type='text']")
	  WebElement input_ToCity;
	  
	  @FindBy(xpath="//ul[@id='autoSuggest-list']/li")
	  List<WebElement> toCityvalue;	  
	  
	  /* select date from calendar  */
	  @FindBy(xpath="//div[4]//div[@class='DayPicker-Day']/p[1]")	  
	  WebElement dayPicker;
	  
	  /* select departure date */
	 // @FindBy(xpath="//div[4]//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected']/p[1]")
	  @FindBy(xpath="(//p[@class='fsw__date'])[27]")
	  WebElement depart_datepicker;
	  
	  /* click on done btn from calendar */
	 @FindBy(xpath="//span[@class='fswTrvl__done']")
	 WebElement done_btn_Calendar;
	 
	  /* for 7th assignment using click on done btn from calendar */
		 @FindBy(xpath="//*[.='Done']")
		 WebElement done_btn_Calendar_1;
	  
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
	  
	  /*  selecting fare type-> regular */
	  @FindBy(xpath="//ul[@class='sc-12foipm-8 bKIRNu']/li[1]")
	  WebElement fare_Type;
	  
	  /* click one search for flights button */
	  @FindBy(xpath="//span[@class='sc-12foipm-85 fUaVPB']")
	  WebElement serach_btn_Flights;
	  
	  /* selecting round trip radio button */
	  @FindBy(xpath="//p[text()='Round-trip']")
	  WebElement roundTrip_radiobtn;
	  
	  
	  /* selecting multi trip radio button */
	  @FindBy(xpath="//p[text()='Multi-city']")
	  WebElement multiTrip_radiobtn;
	  
	  /* Return calendar*/
	  @FindBy(xpath="(//span[@class='sc-12foipm-22 cUvQPq fswDownArrow'])[2]")
	  WebElement return_calendar;
	  
	  /*  */
	 // @FindBy(xpath="//p[@class='fsw__date'])[27]")
	 // @FindBy(xpath="(//div[@class='DayPicker-Day'][3]/p[@class='fsw__date'])[1]")
	  @FindBy(xpath="(//div[@class='DayPicker-Week'][5]/div[3]//p[@class='fsw__date'])[1]")
	 // @FindBy(xpath="(//div[@class='DayPicker-Week'])[5]/div[3]/p[1]")	  
	  WebElement return_dayPicker_date;
	  
	 
//		/* search page- input box passenger class */
//	  @FindBy(xpath = "//div[6]/input[@type='text']")
//	  WebElement input_PassengerClass;
	  
	 
	  /* for 7th assignmnet using this webelement  */
	  @FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[5]")
	  WebElement Multicity_From_City;
	  
	  /* for 7th assisgnment using this web element */
	  @FindBy(xpath="//input[@type='text']")
	  WebElement MultiCity_input_FromCity;
	  
	  /* for 7th assignment to city value */
	  @FindBy(xpath="//ul[@id='autoSuggest-list']/li")
	  List<WebElement> MultiCity_fromCity_value;
			  
	  
	  
	  /*for 7th assignment taking second tocity filed  */
	  @FindBy(xpath="(//div[@class='sc-12foipm-16 wRKJm fswFld '])[6]")
	  WebElement MultiCity_toCity;
	  
	  /* for 7th assignment slecting date  */
	  //@FindBy(xpath="(//p[@class='fsw__date'])[28]")
	  //@FindBy(xpath="(//div/div[4]//p[@class='fsw__date'])[28]")
	  @FindBy(xpath="//*[@id=\"root\"]/div[4]/div/div/div[2]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[5]/div[4]/p[1]")
	  WebElement MultiCity_depart_DatePicker;
	  
	  
	  @FindBy(xpath="//p[@class='fswFld__title']")
	  WebElement dateEnabled;
	  
	  
//	// first home page Traveller and class
//		@FindBy(xpath="(//p[@class='sc-12foipm-18 cTPYom fswWidgetTitle'])[5]")
//		WebElement TravellerClass;
	  
	  //3 creating the method for each componenet to perform its action
	  
	  
	  /*  handle the alert popup */	  
	  public void CongratulationPoup(WebDriver driver) {
		  
		  Alert alert=driver.switchTo().alert();
		  alert.accept();
	  }
	  /*  */
	  public void clickOnFromCity(WebDriver driver)
	  {
		  clickabilityOfElement(driver,Click_On_FromCity);
		  Click_On_FromCity.click();
	  }
	  
	  //click on Form City
	  public void fromCity() {
		 
		  From_City.click();
		  
	  }	 
	  public void fromCity_1(WebDriver driver) {
		  clickabilityOfElement(driver,From_City);
		  From_City.click();
		  
	  }	 
	  
	  // inputting the Form City
	  public void inputFromCity() {
		  input_FromCity.sendKeys("New Delhi");		  
	  }
	  // selecting 0th index of form city value
	  public void fromCityValue() {
		  fromCity_value.get(0).click();
	  }
	  
	  // input to the to city
	  public void toCity() {
		  input_ToCity.sendKeys("Bengaluru (BLR)");
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
	  
	  /* click on raound trip radio button  */
	  public void roundTrip()
	  {
		  roundTrip_radiobtn.click();
	  }
	  /* return calendar  */
	  public void returnCalendar() {
		  return_calendar.click();
	  }
	  /* return date picker  */
	  public void _returndatePickerdate() {
		  return_dayPicker_date.click();
	  }
	  public void depart_datepicker()
	  {
		  depart_datepicker.click();
	  }
	  
	  /* selecting multiTrip_radiobtn*/
	  public void multiTrip() {
		  multiTrip_radiobtn.click();
	  }
	  
	  
	  //click on Form City
	  public void multiCity_fromCity() {
		  Multicity_From_City.click();
		  
	  }	 
	  // inputting the Form City
	  public void multiCity_InputFromCity() {
		  MultiCity_input_FromCity.sendKeys("Bengaluru");		  
	  }
	// selecting 0th index of form city value
		  public void Multicity_fromCityValue() {
			  MultiCity_fromCity_value.get(0).click();
		  }
		  
		// radiobtn multicity-> input to the  tocity field
		  public void MultiCity_toCity() {
			  input_ToCity.sendKeys("Kalaburagi");
		  }
		  // selecting 0th index from Tocity value
		  public void MultiCity_toCityValue() {
			   toCityvalue.get(0).click();
		  }
		  
		  public void MultiCity_DepartDatePicker() {
			  
			  MultiCity_depart_DatePicker.click();
		  }		  
		  public void doneCalendar_1() {
			 // visibilityOfElement(driver,done_btn_Calendar);
			  //clickabilityOfElement(driver,done_btn_Calendar_1);
			  done_btn_Calendar_1.click();
		  }	  
		  
//		  public int traveller(int actual_val) 
//		  {
//			  String Travellers=TravellerClass.getText();
//				 String digits=Travellers.replaceAll("[A-Z]","");
//				 int number=Integer.valueOf(digits);
//				 int digits_sum=0;
//				 for(digits_sum=0;number!=0;number=number/10) {
//					 digits_sum=digits_sum + number % 10;
//				 }
//				     actual_val=digits_sum;
//				    return actual_val;
//		  }
//		  
	
}
