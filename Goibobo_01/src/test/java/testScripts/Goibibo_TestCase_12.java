package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Goibibo_Home;
import pomobjectrepository.Goibibo_Login;
import pomobjectrepository.Goibobo_RegistrationPage;
/**
 * 
 * @author Kavita
 *
 */
/* TestCase 12: Login to page, search the flight and logout  */
@Listeners(ListenerClass.class)
public class Goibibo_TestCase_12 extends LaunchandQuit
{
	@Test
	public void testcase_12() throws InterruptedException 
	{		
		Goibibo_Login g_login=new Goibibo_Login(driver);		
		g_login.closePopUpLoginWindow();
				
		Goibobo_RegistrationPage g_registration=new Goibobo_RegistrationPage(driver);
		g_registration.mouseOver_LoginSugnUp(driver);
		g_registration.btn_loginSignup();
		g_registration.txtbox_InputPhoneNum();
		g_registration.btnContinue();
		g_registration.wait_until_homepage_load(driver);
		
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
		
		
		g_registration.hoverProfileName(driver);
		g_registration.viewYourProfile();
		
		g_registration.btnLogOut();
		g_registration.btnYesLogOut();
		
	}
}
