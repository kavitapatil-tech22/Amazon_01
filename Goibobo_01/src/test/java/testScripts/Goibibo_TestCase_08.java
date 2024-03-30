package testScripts;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Goibibo_FlightPassenger;
import pomobjectrepository.Goibibo_Home;
import pomobjectrepository.Goibibo_Login;
import pomobjectrepository.Goibibo_Search;
/**
 * 
 * @author Kavita K
 *
 */
/*  TestCase08 : Verify that the user is presented with additional options like-luggage, 
extra legroom, food/beverages, etc and selecting the same results in additional cost with the booking amount. */
@Listeners(ListenerClass.class)
public class Goibibo_TestCase_08 extends LaunchandQuit
{
	@Test
	public void testcase_08() throws InterruptedException 
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
		//Thread.sleep(10000);		
		Goibibo_Search g_search=new Goibibo_Search(driver);		
		g_search.oneStop();
		g_search.viewFares();
		
		Goibibo_FlightPassenger g_flightPassenger=new Goibibo_FlightPassenger(driver);		
		g_flightPassenger.paid_seat();
		g_flightPassenger.chargable_meal();
		g_flightPassenger.check_in_baggage();
		g_flightPassenger.validate_chargable_meal();
		g_flightPassenger.validate_check_in_baggage();
		
		//Thread.sleep(5000);
				
	}
	
}
