package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Goibibo_Home;
import pomobjectrepository.Goibibo_Login;

/**
 * 
 * @author Kavita K
 *
 */
/*  TestCase 07 : Test for multi-city flight search. */
@Listeners(ListenerClass.class)
public class Goibibo_TestCase_07 extends LaunchandQuit
{
	@Test
	public void testCase_07() throws InterruptedException 
	{		
		Goibibo_Login g_login = new Goibibo_Login(driver);
		g_login.closePopUpLoginWindow();

		Goibibo_Home g_home = new Goibibo_Home(driver);
		g_home.multiTrip();		
		g_home.fromCity();
		g_home.inputFromCity();
		g_home.fromCityValue();		
		g_home.toCity();
		g_home.toCityValue();		
		g_home.depart_datepicker();
		//Thread.sleep(4000);
		g_home.doneCalendar();			
		//Thread.sleep(2000);
		g_home.cancelTravellers();  // cancel traveler class bcz selecting fare type		
		g_home.fareType();	
		g_home.adultTraveller();
		g_home.childrenTraveller();
		g_home.infantsTraveller();		
		g_home.travelClass();
		g_home.doneTravellers();			
		g_home.multiCity_fromCity();
		g_home.multiCity_InputFromCity();
		g_home.Multicity_fromCityValue();		
		g_home.MultiCity_toCity();
		g_home.MultiCity_toCityValue();				
		g_home.MultiCity_DepartDatePicker();
		//Thread.sleep(5000);
		//g_home.doneCalendar_1(driver);	
		g_home.doneCalendar_1();
		g_home.cancelCalendar();
		g_home.searchFlights();
		Thread.sleep(10000);
		
	}
}
