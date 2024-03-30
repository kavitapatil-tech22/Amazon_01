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
 * @author Kavita K
 *
 */
/* TestCase 04: Test the search functionality for one-way flights. */
@Listeners(ListenerClass.class)
public class Goibibo_TestCase_04 extends LaunchandQuit 
{	
	@Test
	public void testcase_04() throws InterruptedException {
		
		 
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
		
		//Goibibo_Search g_search=new Goibibo_Search(driver);
		//g_search.oneWayTrip();
	}
}
