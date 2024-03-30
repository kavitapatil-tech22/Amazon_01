package testScripts;

import org.testng.Reporter;
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
/*  TestCase 10: 0 Test updating item quantities and removing items from the cart. */
@Listeners(ListenerClass.class)
public class TestCase_10 extends LaunchandQuit
{
	@Test(dataProvider="LoginData",dataProviderClass=ExcelUtilities.class)
	public void testcase_10(String UN,String PWD) throws InterruptedException {
		
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
		amz_addtocart.quantity_selection();		
		amz_addtocart.addtocart(driver);		
		amz_addtocart.validate_addedtoCart();		
		amz_addtocart.gotoCart();
		amz_addtocart.delete_cart();
		amz_addtocart.validate_deletingCart();
		
		amzhome.mouseOver_account(driver);
		amzhome.logout();
		
	}
}
