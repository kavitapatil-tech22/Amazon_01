package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.ExcelUtilities;
import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Amz_AddCart;
import pomobjectrepository.Amz_Home;
import pomobjectrepository.Amz_Login;
import pomobjectrepository.Amz_Navigation;
/**
 * 
 * @author Kavita 
 *
 */
/*  TestCase 11 : 11 Validate the entire checkout process, including address selection, payment method selection, and order review. */
@Listeners(ListenerClass.class)
public class TestCase_11 extends LaunchandQuit
{
	@Test(dataProvider="LoginData",dataProviderClass=ExcelUtilities.class)
	public void testcase_11(String UN,String PWD) throws InterruptedException {
		
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
		
		amz_addtocart.proceed_to_checkout();		
		amz_addtocart.usethisaddress();
		amz_addtocart.cashondelivery();
		amz_addtocart.UsethisPaymentMethod();
		
		amz_addtocart.Validate_ReviewCartTillEnd();
		
		Amz_Navigation navigation=new Amz_Navigation(driver);
		navigation.navigate_back();
		navigation.navigate_back();
		
		amzhome.mouseOver_account(driver);
		amzhome.logout();
		
	}
}
