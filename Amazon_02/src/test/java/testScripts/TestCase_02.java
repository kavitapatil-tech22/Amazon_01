package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.ExcelUtilities;
import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Amz_Home;
import pomobjectrepository.Amz_Login;
/**
 * 
 * @author Kavita K
 *
 */
/* Testcase 02 : 2 Verify login is successful with correct email and password. */
@Listeners(ListenerClass.class)
public class TestCase_02 extends LaunchandQuit
{
	@Test(dataProvider="LoginData",dataProviderClass=ExcelUtilities.class)
	public void testcase_02(String UN,String PWD) throws InterruptedException {
		
		Amz_Login amzlogin_obj=new Amz_Login(driver); 
		amzlogin_obj.userName(UN);
		amzlogin_obj.un_submit();
		amzlogin_obj.password(PWD);
		amzlogin_obj.validate_correctEmailPwd(UN,PWD);
		
		amzlogin_obj.signin();	    
		
	}
}
