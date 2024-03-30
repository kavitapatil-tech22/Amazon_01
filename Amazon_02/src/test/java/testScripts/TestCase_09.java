package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.ExcelUtilities;
import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Amz_AddCart;
import pomobjectrepository.Amz_Home;
import pomobjectrepository.Amz_Login;
/**
 * 
 * @author Kavita K
 *
 */
/*  TestCase 09 : Verify that items can be added to the shopping cart from product pages. */
@Listeners(ListenerClass.class)
public class TestCase_09 extends LaunchandQuit
{
	@Test(dataProvider="LoginData",dataProviderClass=ExcelUtilities.class)
	public void testcase_09(String UN,String PWD) throws InterruptedException {
		
		Amz_Login amzlogin_obj=new Amz_Login(driver); //remember scanner and actions class
		amzlogin_obj.userName(UN);
		amzlogin_obj.un_submit();
		amzlogin_obj.password(PWD);
		amzlogin_obj.signin();	
		
		Amz_Home amzhome=new Amz_Home(driver);
		amzhome.Validate_HomePage();		
		amzhome.serachingtheProduct();
		amzhome.clickOnFirstProduct(driver);
		
		Amz_AddCart amz_addtocart=new Amz_AddCart(driver);
		amz_addtocart.addtocart(driver);		
		amz_addtocart.validate_addedtoCart();
		
		amzhome.mouseOver_account(driver);
		amzhome.logout();
					
	}
}
