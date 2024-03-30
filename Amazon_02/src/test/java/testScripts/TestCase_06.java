package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.ExcelUtilities;
import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Amz_Home;
import pomobjectrepository.Amz_Login;
import pomobjectrepository.Amz_SearchingCategory;
/**
 * 
 * @author Kavita
 *
 */
/* 6 Verify that searching with filters (e.g., category, price range) yields accurate results.  */
@Listeners(ListenerClass.class)
public class TestCase_06 extends LaunchandQuit
{
	@Test(dataProvider="LoginData",dataProviderClass=ExcelUtilities.class)
	public void testcase_06(String UN,String PWD) throws InterruptedException {
		
		Amz_Login amzlogin_obj=new Amz_Login(driver); //remember scanner and actions class
		amzlogin_obj.userName(UN);
		amzlogin_obj.un_submit();
		amzlogin_obj.password(PWD);
		amzlogin_obj.signin();	
				
		Amz_Home amzhome=new Amz_Home(driver);
		amzhome.Validate_HomePage();
		
		amzhome.serachingtheProduct();	
		
		Amz_SearchingCategory amz_searchCategoty=new Amz_SearchingCategory(driver);
		amz_searchCategoty.product();
		amz_searchCategoty.price_filter();		
		//Thread.sleep(2000);		
		amz_searchCategoty.validate_price_filter();
		
		amzhome.mouseOver_account(driver);
		amzhome.logout();
	}		
}
