package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Goibibo_Home;
import pomobjectrepository.Goibibo_Login;
import pomobjectrepository.Goibibo_ReviewYourBooking;
import pomobjectrepository.Goibibo_Search;

/**
 * 
 * @author Kavita K
 *
 */
/* TestCase 13 : Check if user is able to apply for coupon code while ordering the product */
@Listeners(ListenerClass.class)
public class Goibibo_TestCase_13 extends LaunchandQuit
{
	@Test
	public void testcase_13() throws InterruptedException 
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

		Goibibo_Search g_search=new Goibibo_Search(driver);
		g_search.viewFares();
		g_search.book(driver);		
		
		Goibibo_ReviewYourBooking g_reviewbook=new Goibibo_ReviewYourBooking(driver);
		g_reviewbook.select_promoCode();				
		g_reviewbook.validation_CouponCode();
		
	}	
}
