package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Goibibo_FlightInformation;
import pomobjectrepository.Goibibo_Home;
import pomobjectrepository.Goibibo_Login;

/**
 * 
 * @author Kavita K

 *
 */
/* TestCase 10 : Validate the flight information, Fare details, Baggage Rules and cancellation Rules link has the details in the search result page.  */
@Listeners(ListenerClass.class)
public class Goibibo_TestCase_10 extends LaunchandQuit
{
	@Test
	public void testCase_10() throws InterruptedException 
	{
		
		Goibibo_Login g_login=new Goibibo_Login(driver);		
		g_login.closePopUpLoginWindow();
		
		Goibibo_Home g_home=new Goibibo_Home(driver);
		g_home.fromCity();
		g_home.inputFromCity();
		g_home.fromCityValue();
		g_home.toCity();
		g_home.toCityValue();
		g_home.dayPicker();		
		g_home.doneCalendar();				
		g_home.cancelTravellers();
		g_home.fareType();	
		g_home.adultTraveller();
		g_home.childrenTraveller();
		g_home.infantsTraveller();		
		g_home.travelClass();
		g_home.doneTravellers();
		g_home.searchFlights();
		
		Thread.sleep(10000);
		
		Goibibo_FlightInformation g_flightInfo=new Goibibo_FlightInformation(driver);
		
		g_flightInfo.flightDetails();
		g_flightInfo.flightInfo();
		g_flightInfo.Validate_flightInfo();
		
		g_flightInfo.fareDetails();
		g_flightInfo.Validate_fareDeatils();
//		
		g_flightInfo.baggageDeatils();
		g_flightInfo.Validate_baggageDeatils();
//		
//		
		g_flightInfo.cancellationRules();
		g_flightInfo.Validate_cancellationRules();
		
		
		
	
	}
}
