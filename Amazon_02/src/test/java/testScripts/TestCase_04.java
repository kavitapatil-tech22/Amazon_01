package testScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.ExcelUtilities;
import generics.LaunchandQuit;
import generics.ListenerClass;
import pomobjectrepository.Amz_Home;
import pomobjectrepository.Amz_Login;
import pomobjectrepository.Amz_YourAccount;
/**
 * 
 * @author Kavita K
 *
 */
/* TestCase 04 : Check if a user can successfully edit their profile information. */
@Listeners(ListenerClass.class)
public class TestCase_04 extends LaunchandQuit
{
	@Test(dataProvider="EditProfileData",dataProviderClass=ExcelUtilities.class)
	public void smoke_testcase_04(String UN,String PWD,String Country,String FN,String MNum,String PC,String Flat_HN,String Area_streat,String LM,String City,String State) throws IOException, InterruptedException 
	{
		Amz_Login amzlogin_obj=new Amz_Login(driver); 		
		amzlogin_obj.userName(UN);
		amzlogin_obj.un_submit();
		amzlogin_obj.password(PWD);
		amzlogin_obj.signin();		
		
		Amz_Home amzHome=new Amz_Home(driver);
		amzHome.mouseOver_account(driver);
		amzHome.yourAccount();
		
		Amz_YourAccount amz_youraccount=new Amz_YourAccount(driver);
		amz_youraccount.yourAddress();
		amz_youraccount.editAddress();
		//amz_youraccount.update_address();
		amz_youraccount.update_adressdetails(FN,MNum,PC,Flat_HN,Area_streat,LM,City,State);
		
		amz_youraccount.validate_UserEditedProfile();
		
		
		
	}
}
