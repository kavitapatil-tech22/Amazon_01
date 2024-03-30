package testScripts;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generics.ExcelUtilities;
import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Amz_Home;
import pomobjectrepository.Amz_Login;
import pomobjectrepository.Amz_NewUserAccount_Register;
/**
 * 
 * @author Kavita K
 *
 */
/* TestCase 1: Test if a new user can successfully register. */
@Listeners(ListenerClass.class)
public class TestCase_01 extends LaunchandQuit
{
	@Test
	public void Amz_NewUserAccount_Register() 
	{
		Amz_Home amzhome=new Amz_Home(driver);
		amzhome.mouseOver_account(driver);
		
		Amz_NewUserAccount_Register amz_newUserAcc = new Amz_NewUserAccount_Register(driver);
		amz_newUserAcc.start_here();
		amz_newUserAcc.appCustomerName();
		amz_newUserAcc.mobileNumber();
		amz_newUserAcc.password();
		amz_newUserAcc.verifiyMobileNumber();

	}
	
}
