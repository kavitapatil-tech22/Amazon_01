package pomobjectrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class Goibibo_ReviewYourBooking
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='mobile']")
	WebElement mobile_number;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email_address;
	
	/*first name  */

	@FindBy(xpath="//input[@name='givenname']")
	WebElement first_name;
	
	/* lastname */
	@FindBy(xpath="//input[@name='lastname']")
	WebElement last_name;
	
	/* select gender */
	@FindBy(xpath="//select[@class='common-elementsstyles__CustSelectTrvl-sc-ilw4bs-9 lpjPee']")
	WebElement gender;
	
	//@FindBy(xpath="(//div[@class='sc-1v8myus-2 eYa-DOi'][1]/button)[1]")
	//WebElement personal_info_save;
	
	@FindBy(xpath="//input[@id='Billing Address']")
	WebElement billing_address;
	
	@FindBy(xpath="//input[@id='Pincode']")
	WebElement pincode;
	
	@FindBy(xpath="//ul[@class='sc-iapWAC bPcczV']//li")
	List<WebElement> state;
	
	//checkbox to select billing info save your profile
	//@FindBy(xpath="//input[@id='confirm_check']")
	
	@FindBy(xpath="//span[@class='sc-ktPPKK hKXtqD']")
	WebElement billing_info_save;
	
	@FindBy(name="confirm_check")
	WebElement billingInfo_Chkbx;

	@FindBy(xpath="(//div[@class='flexCol padL10 width100'])[2]")
	WebElement select_promoCode;
	
	@FindBy(xpath="//div[text()='Awesome! Promo discount applied']")
	WebElement validate_discount;
	
	@FindBy(xpath="//span[text()='VIEW ALL COUPONS']")
	WebElement view_all_coupon;
	
	
	@FindBy(xpath="//div//p[@class='sc-dExYaf fFgTQr']")
	WebElement state_arrowdown;
	
	@FindBy(xpath="//button[@value='OK']")
	WebElement Coupon_PopUp_OK;
	
	/*   //div[@class='dweb-commonstyles__Modal-sc-13fxsy5-9 hNuQkP posRel']//button[@value='OK']    */
	
	//driver.findElement(By.xpath("//div//p[@class='sc-dExYaf fFgTQr']")).click();
	
	//List<WebElement> autoelements=driver.findElements(By.xpath("//ul[@class='sc-iapWAC bPcczV']//li"));
	
	//int count=autoelements.size();
	//System.out.println("Count of the product : "+count);		
	//System.out.println(autoelements.size());		
	//autoelements.get(18).click();
	
	
	public void mobile_number()
	{
		mobile_number.sendKeys("8884431316");
	}
	public void email_id()
	{
		email_address.sendKeys("kavitapatil.tech22@gmail.com");
		
	}
	public void first_name()
	{
		first_name.clear();
		first_name.sendKeys("Kavita");
	}
	public void last_name()
	{
		last_name.clear();
		last_name.sendKeys("Anoor");
	}
	public void gender()
	{
		Select select_gender=new Select(gender);
		select_gender.selectByVisibleText("Female");		
		
	}
	
	
//	public void personal_info_save()
//	{
//		personal_info_save.click();		
//	}
	public void billing_address()
	{
		billing_address.sendKeys("GF 06,Everest Enclave,5th stage RR Nagar,Banglore,Karnataka");
		
		
	}
	
	public void validate_billingcheckbox() {
		
		if(billingInfo_Chkbx.isSelected())
		{
			boolean mesg=billingInfo_Chkbx.isSelected();
			System.out.println("billing checkbox is selected : " +mesg);
			Assert.assertEquals(billingInfo_Chkbx.isSelected(),true,"not selected");
			
		}
	}
	
	
	public void pincode()
	{
		//pincode.clear();
		pincode.sendKeys("560098");
	}
	
	public void state_arrowdown() {
		state_arrowdown.click();
	}
	
	public void state_selection() {
		state_arrowdown();
		int count=state.size();	
		System.out.println("state count : "+ count);
		state.get(16).click();
				
	}
	public void billing_info_save()
	{
		billing_info_save.click();		
	}
	
//	public void billingInfoSave() {
//		
//		Assert.assertEquals(billing_info_save.isSelected(),true," billing checkbox not selected");
//	}
	
	public void select_promoCode()
	{
		viewallCoupon();
		select_promoCode.click();
		CouponPopUpOK();
	}
	public void validate_discount()
	{
		Assert.assertEquals(validate_discount.isDisplayed(),true, "coupon is not applied");
	}
	public void viewallCoupon()
	{
		view_all_coupon.click();
	}
	public void CouponPopUpOK() {
		Coupon_PopUp_OK.click();
	}

	public Goibibo_ReviewYourBooking(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void validation_allfields() 
	{
		//Assert.assertEquals(billingInfo_Chkbx.isSelected(),true," billing checkbox not selected");
		validate_billingcheckbox();
		
		Assert.assertEquals(billing_address.isDisplayed(),true, "gender is not selected");
		Assert.assertEquals(pincode.isDisplayed(),true, "pincode is not entered");
	//	Assert.assertEquals(state_arrowdown.isDisplayed(),true, "state is not clicked");
	//	Assert.assertEquals(state "state having list");
		Assert.assertEquals(gender.isSelected(),true,"gender is not selected");
		Assert.assertEquals(first_name.isDisplayed(),true,"first name is not entered");
		Assert.assertEquals(last_name.isDisplayed(),true,"last name is not entered");
		
		Assert.assertEquals(email_address.isDisplayed(),true,"email id is not entered");
		Assert.assertEquals(mobile_number.isDisplayed(),true,"mobile number is not entered");
		
		Assert.assertEquals(validate_discount.isDisplayed(),true,"coupon is not applied");
	}
	
	public void validation_CouponCode() 
	{
		
		//Assert.assertEquals(select_promoCode.isSelected(),true, "coupon is not applied");
		if(select_promoCode.isSelected()==true) {
					
			Assert.assertEquals(validate_discount.isDisplayed(),true, "coupon is not applied");
		
		}
	}

}
