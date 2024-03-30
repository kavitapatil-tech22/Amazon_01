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
 * @author Kavita
 *
 */
/* Test Case 14 : Check if user is able to search the domestic round trip flight  */
@Listeners(ListenerClass.class)
public class Goibibo_TestCase_14 extends LaunchandQuit
{
	@Test
	public void testCase_14() throws InterruptedException 
	{		
		Goibibo_Login g_login=new Goibibo_Login(driver);		
		g_login.closePopUpLoginWindow();
		
		Goibibo_Home g_home=new Goibibo_Home(driver);
		g_home.roundTrip();
		
		g_home.fromCity();
		g_home.inputFromCity();
		g_home.fromCityValue();
		g_home.toCity();
		g_home.toCityValue();
		g_home.depart_datepicker();
		g_home.doneCalendar();		
		g_home.cancelTravellers();		
		g_home.roundTrip();
		g_home.returnCalendar();
		g_home._returndatePickerdate();
		g_home.doneCalendar();			
		//g_home.fareType();
		g_home.adultTraveller();
		g_home.childrenTraveller();
		g_home.infantsTraveller();		
		g_home.travelClass();
		g_home.doneTravellers();
		
		g_home.roundTrip();
        
		//Thread.sleep(3000);
		g_home.searchFlights();		

	    // checking the search result is given- round trip search result or not 
	    Goibibo_Search g_search=new Goibibo_Search(driver);
	    g_search.Validate_roundTrip();
	    	
	}	
}
