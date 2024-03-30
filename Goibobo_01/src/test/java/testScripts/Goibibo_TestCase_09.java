package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Goibibo_Home;
import pomobjectrepository.Goibibo_Login;
import pomobjectrepository.Goibibo_Search;
/**
 * 
 * @author Kavita K A
 *
 */
/* TestCase 09 : Validate the system’s ability to handle multiple passengers in a single booking.  */
@Listeners(ListenerClass.class)
public class Goibibo_TestCase_09 extends LaunchandQuit
{
	@Test
	public void testcase_09() throws InterruptedException 
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
		
		// validating the in single booking the system having ability to handle multiple passengers or not 
	    Goibibo_Search g_search=new Goibibo_Search(driver);
	    g_search.validate_numberOfPassengers();
		
	}
}
