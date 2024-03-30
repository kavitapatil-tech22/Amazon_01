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
/*  TestCase 05 : Test the search functionality for round-trip flights. */
@Listeners(ListenerClass.class)
public class Goibibo_TestCase_05 extends LaunchandQuit
{
	@Test
	public void testcase_05() throws InterruptedException {
			
		Goibibo_Login g_login=new Goibibo_Login(driver);		
		g_login.closePopUpLoginWindow();
		
		Goibibo_Home g_home=new Goibibo_Home(driver);
		g_home.roundTrip();
		
		g_home.fromCity();
		g_home.inputFromCity();
		g_home.fromCityValue();
		g_home.toCity();
		g_home.toCityValue();
		//g_home.dayPicker();		
		//g_home.doneCalendar();	
		g_home.depart_datepicker();
		g_home.doneCalendar();	
		
		//Thread.sleep(2000);
		g_home.cancelTravellers();
		
		g_home.roundTrip();
			
		//Thread.sleep(4000);
		g_home.returnCalendar();
		g_home._returndatePickerdate();
		g_home.doneCalendar();	
		
		
		g_home.fareType();	
		g_home.adultTraveller();
		g_home.childrenTraveller();
		g_home.infantsTraveller();		
		g_home.travelClass();
		g_home.doneTravellers();
		g_home.searchFlights();		
		
		//Thread.sleep(10000);		
	}
}
