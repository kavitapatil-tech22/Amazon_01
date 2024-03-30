package testScripts;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.LaunchandQuit;

import generics.ListenerClass;
import pomobjectrepository.Amz_AddCart;
import pomobjectrepository.Amz_Home;
import pomobjectrepository.Amz_Navigation;
/**
 * 
 * @author saanv
 *
 */
/* Assignment -15 Reach till cart page without login in amazon application */
@Listeners(ListenerClass.class)
public class TestCase_15 extends LaunchandQuit
{
   @Test
   public void testcase_15() throws InterruptedException {
		
		Amz_Home amzhome=new Amz_Home(driver);
		amzhome.serachingtheProduct();
		
		amzhome.validate_product_shoe();
		amzhome.clickOnFirstProduct(driver);
		
//		Amz_Navigation navigation=new Amz_Navigation(driver);
//		navigation.get_title("title");
//		
		Amz_AddCart amz_addtocart=new Amz_AddCart(driver);					
		amz_addtocart.addtocart(driver);
		amz_addtocart.gotoCart();
		
		//amzhome.Validate_HomePage();
		
		amz_addtocart.proceed_to_checkout();	
		Thread.sleep(1000);	
	
   }
	
}
