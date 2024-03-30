package testScripts;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generics.ExcelUtilities;
import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Amz_AddCart;
import pomobjectrepository.Amz_Coupon;
import pomobjectrepository.Amz_Home;
import pomobjectrepository.Amz_Login;
import pomobjectrepository.Amz_Navigation;

/**
 * 
 * @author Kavita
 *
 */
/*  TestCase 13: 1Check if user is able to apply for coupon code while ordering the product */
@Listeners(ListenerClass.class)
public class TestCase_13 extends LaunchandQuit
{
	@Test(dataProvider="LoginData",dataProviderClass=ExcelUtilities.class)
	public void testcase_13(String UN,String PWD) throws InterruptedException {
		
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
		
		Amz_Coupon c2=new Amz_Coupon(driver);
		c2.coupon_data();
		c2.apply_this_coupon();
		c2.apply_coupon_verifed();	//assert
		
		Amz_Navigation navigation=new Amz_Navigation(driver);
		navigation.checkout_page();
			
		amzhome.mouseOver_account(driver);
		amzhome.logout();		
		
	}
}
