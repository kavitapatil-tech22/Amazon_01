package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Goibobo_RegistrationPage;

/**
 * 
 * @author Kavita
 *
 */
/* Testcase 03 : Test login with invalid credentials and ensure proper error messages are displayed. */
@Listeners(ListenerClass.class)
public class Goibibo_TestCase_03 extends LaunchandQuit
{
	@Test
	public void testcase_03() throws InterruptedException 
	{

		Goibobo_RegistrationPage g_registration=new Goibobo_RegistrationPage(driver);	
		
		g_registration.txtbox_InputPhoneNum();	
		g_registration.btnContinue();							
		g_registration.wait_until_homepage_load(driver);			
		g_registration.Validate_invalidOTP(); //Assert			
		
	}
}
