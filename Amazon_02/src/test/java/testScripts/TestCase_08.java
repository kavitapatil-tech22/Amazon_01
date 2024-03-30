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
 * @author Kavita K
 *
 */
/* TestCase 8: Check if products can be sorted by relevance, price, rating, etc.  */
@Listeners(ListenerClass.class)
public class TestCase_08 extends LaunchandQuit
{
	@Test(dataProvider="LoginData",dataProviderClass=ExcelUtilities.class)
	public void testcase_08(String UN,String PWD) throws InterruptedException {
		
		Amz_Login amzlogin_obj=new Amz_Login(driver); 
		amzlogin_obj.userName(UN);
		amzlogin_obj.un_submit();
		amzlogin_obj.password(PWD);
		amzlogin_obj.signin();	
		
		Amz_Home amzhome=new Amz_Home(driver);
		amzhome.Validate_HomePage();
		
		amzhome.serachingtheProduct();
		
		Amz_SearchingCategory amz_searchCategory=new Amz_SearchingCategory(driver);
		amz_searchCategory.second_view_the_reviews();
		
		Thread.sleep(4000);
		amz_searchCategory.price_filter();
		amz_searchCategory.validate_price_filter();  //assert
		Thread.sleep(2000);
				
		amzhome.mouseOver_account(driver);
		amzhome.logout();
	}
}
