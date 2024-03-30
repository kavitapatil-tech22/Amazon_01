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
 * @author Kavita K
 *
 */
/* TestCase 12 : Check if user is able to select each payment method  */
@Listeners(ListenerClass.class)
public class TestCase_12 extends LaunchandQuit 
{
	@Test(dataProvider="LoginData",dataProviderClass=ExcelUtilities.class)
	public void testcase_12(String UN,String PWD) throws InterruptedException {
		
		Amz_Login amzlogin_obj=new Amz_Login(driver); //remember scanner and actions class
		amzlogin_obj.userName(UN);
		amzlogin_obj.un_submit();
		amzlogin_obj.password(PWD);
		amzlogin_obj.signin();	
		
		Amz_Home amzhome=new Amz_Home(driver);
		amzhome.serachingtheProduct();
		amzhome.clickOnFirstProduct(driver);
		
		Amz_AddCart amz_addtocart=new Amz_AddCart(driver);				
		amz_addtocart.quantity_selection();		
		amz_addtocart.addtocart(driver);		
		amz_addtocart.validate_addedtoCart();	
		
		Amz_Navigation navigation=new Amz_Navigation(driver);
		navigation.get_title("title");
		
		amz_addtocart.proceed_to_checkout();		
		amz_addtocart.usethisaddress();
		
		amz_addtocart.creditcard();
		amz_addtocart.ValidateCraditCard();
				
		amz_addtocart.netbanking_payment();
		amz_addtocart.ValidateNetBanking();
		
		amz_addtocart.others_UPI_payment();
		amz_addtocart.ValidateOthersUPIPayment();
		
		amz_addtocart.emi_payment();
		amz_addtocart.ValidateEmiPayment();
		
		amz_addtocart.cashondelivery();
		amz_addtocart.ValidateCashOnDelivery();
		
//		Amz_Navigation navigation=new Amz_Navigation(driver);
		navigation.checkout_page();
			
		amzhome.mouseOver_account(driver);
		amzhome.logout();
		
	}
}
