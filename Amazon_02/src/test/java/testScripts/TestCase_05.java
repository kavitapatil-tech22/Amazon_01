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
/* TestCase 05 :  Test searching for products using its name like shoe    */
@Listeners(ListenerClass.class)
public class TestCase_05 extends LaunchandQuit
{
	@Test(dataProvider="LoginData",dataProviderClass=ExcelUtilities.class)
	public void testcase_05(String UN,String PWD) throws InterruptedException {
		
		Amz_Login amzlogin_obj=new Amz_Login(driver); //remember scanner and actions class
		amzlogin_obj.userName(UN);
		amzlogin_obj.un_submit();
		amzlogin_obj.password(PWD);
		amzlogin_obj.signin();	
		
		Amz_Home amzhome=new Amz_Home(driver);
		amzhome.serachingtheProduct();
		
		amzhome.validate_product_shoe();
		
		amzhome.mouseOver_account(driver);
		amzhome.logout();
			
	}
	
}
