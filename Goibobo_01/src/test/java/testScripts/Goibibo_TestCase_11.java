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
/*TestCase 11 :Validate if after clicking on book button in the search page user is able to enter every 
 test fields present like pincode, state, radio button, firstname, lastname, email id, mobile number, promo code etc */
@Listeners(ListenerClass.class)
public class Goibibo_TestCase_11 extends LaunchandQuit
{
	@Test
	public void testcase_11() throws InterruptedException
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
		//g_home.adultTraveller();
		//g_home.childrenTraveller();
		//g_home.infantsTraveller();		
		g_home.travelClass();
		g_home.doneTravellers();
		g_home.searchFlights();
		
		Goibibo_Search g_search=new Goibibo_Search(driver);
		g_search.viewFares();
		g_search.book(driver);		
		
		Goibibo_ReviewYourBooking g_reviewbook=new Goibibo_ReviewYourBooking(driver);
		g_reviewbook.billing_address();
		g_reviewbook.pincode();
		//Thread.sleep(1000);
		g_reviewbook.state_selection();		
		g_reviewbook.billing_info_save();		
		g_reviewbook.gender();
		g_reviewbook.first_name();
		g_reviewbook.last_name();
		g_reviewbook.email_id();
		g_reviewbook.mobile_number();
		g_reviewbook.select_promoCode();			
		g_reviewbook.validation_allfields();
			
	}
}
