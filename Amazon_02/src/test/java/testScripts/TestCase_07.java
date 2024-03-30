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
/* TestCase 07 : 7 Ensure that the product detail page displays all necessary information (price, reviews, description)   */
@Listeners(ListenerClass.class)
public class TestCase_07 extends LaunchandQuit
{
	
	@Test(dataProvider="LoginData",dataProviderClass=ExcelUtilities.class)
	public void testcase_07(String UN,String PWD) throws InterruptedException {
		
		Amz_Login amzlogin_obj=new Amz_Login(driver); //remember scanner and actions class
		amzlogin_obj.userName(UN);
		amzlogin_obj.un_submit();
		amzlogin_obj.password(PWD);
		amzlogin_obj.signin();	
		
		Amz_Home amzhome=new Amz_Home(driver);
		amzhome.serachingtheProduct();
		amzhome.clickOnFirstProduct(driver);
		
		//amzhome.startRating(driver);
		amzhome.ratingLink(driver);		
		Thread.sleep(2000);		
		
		amzhome.scrollbar(driver);
		Thread.sleep(1000);	
		
		amzhome.seemoreProductDetailsLink(driver);
		amzhome.validateCustomerReview();
		amzhome.validatedprice();		
		amzhome.validateProductDescription();
		
		
		amzhome.mouseOver_account(driver);
		amzhome.logout();	
		
	}

}
