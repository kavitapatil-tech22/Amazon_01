package testScripts;
import org.openqa.selenium.WebDriver;
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
/*
 * TestCase 01 : Verify that users can successfully register for a new account.
 */
@Listeners(ListenerClass.class)
public class Goibibo_TestCase_01 extends LaunchandQuit {
	@Test
	public void testcase_01() throws InterruptedException {

		Goibibo_Login g_login = new Goibibo_Login(driver);
		g_login.closePopUpLoginWindow();

		Goibobo_RegistrationPage g_registration = new Goibobo_RegistrationPage(driver);
		g_registration.mouseOver_LoginSugnUp(driver);
		g_registration.btn_loginSignup();
		g_registration.txtbox_InputPhoneNum();
		g_registration.btnContinue();

		/* enter fullname,emaild and click on LetsGo btn */
		// g_registration.enter_AllDetails();

		g_registration.ClickOnWillDoLater();

		// g_registration.UserInfo_dropdown();
		g_registration.mouseOver_Hey(driver);
		g_registration.viewyourprofile();
		g_registration.inputFirstName();
		g_registration.inputEmailId();
		g_registration.inputLastName();
		g_registration.radiobtnFemale();
		
		g_registration.verifyLink();
		g_registration.validateRegisterEmail();	
		g_registration.closeX_verifyemailPopUp();
		g_registration.savebtn();	

	}
}
