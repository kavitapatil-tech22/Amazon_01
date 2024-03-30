package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.ExcelUtilities;
import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Amz_Login;
/**
 * 
 * @author Kavita K
 *
 */
/* TestCase 3 : Ensure login fails with incorrect email or password.  */
@Listeners(ListenerClass.class)
public class TestCase_03 extends LaunchandQuit
{
	@Test(dataProvider="InCorrectLoginData",dataProviderClass=ExcelUtilities.class)
	public void testcase_03(String UN,String PWD) throws InterruptedException {
		
		Amz_Login amzlogin_obj=new Amz_Login(driver); 
		amzlogin_obj.userName(UN);
		amzlogin_obj.un_submit();
		amzlogin_obj.password(PWD);
		
		amzlogin_obj.validate_InCorrectEmailPwd(UN,PWD);
		amzlogin_obj.signin();	
		
	}

}
