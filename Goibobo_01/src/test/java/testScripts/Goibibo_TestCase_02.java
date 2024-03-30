package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Goibibo_Login;
import pomobjectrepository.Goibobo_RegistrationPage;

/**
 * 
 * @author Kavita
 *
 */
/* TestCase 02 : Validate the login functionality with valid credentials. */
@Listeners(ListenerClass.class)
public class Goibibo_TestCase_02 extends LaunchandQuit
{
		@Test
		public void testcase_02() throws InterruptedException 
		{

			Goibobo_RegistrationPage g_registration=new Goibobo_RegistrationPage(driver);	
			
			g_registration.txtbox_InputPhoneNum();	
			g_registration.btnContinue();							
			g_registration.wait_until_homepage_load(driver);			
			g_registration.validateUserLogin();	
			//Thread.sleep(1000);	
			
		}

}
