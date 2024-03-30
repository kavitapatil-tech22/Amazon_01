package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.ExcelUtilities;
import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Amz_Home;
import pomobjectrepository.Amz_Login;
import pomobjectrepository.Amz_YourOrders;

/**
 * 
 * @author Kavita
 *
 */
/* TestCase 14 : 14 Go to orders page and click on your last ordered product and give 5 star ratings*/
@Listeners(ListenerClass.class)
public class TestCase_14 extends LaunchandQuit 
{
	
	@Test 
	public void testcase_14() throws InterruptedException {
		
		Amz_YourOrders amz_yourOrders=new Amz_YourOrders(driver); //remember scanner and actions class
		amz_yourOrders.userName();
		amz_yourOrders.un_submit();
		amz_yourOrders.password();
		amz_yourOrders.signin();
		

		Amz_Home amzhome=new Amz_Home(driver);
		amzhome.Validate_HomePage();	
		amzhome.mouseOver_account(driver);
		
		
	//	Amz_YourOrders amz_yourOrders=new Amz_YourOrders(driver);
		
		amz_yourOrders.your_order();
		amz_yourOrders.previous_order();
		amz_yourOrders.prd_review();
		
		amz_yourOrders.give_Stars();
		
		amz_yourOrders.submit();
		Thread.sleep(2000);
		amz_yourOrders.validate_submit_reviews();
		
		amzhome.mouseOver_account(driver);
		amzhome.logout();	
		
	}

}
