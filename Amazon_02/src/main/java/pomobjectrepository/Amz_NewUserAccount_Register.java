package pomobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_NewUserAccount_Register {

	@FindBy(linkText="Start here.")
	WebElement start_here;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement create_amazon;
	
	@FindBy(name="customerName")
	WebElement app_CustomerName;
	
	@FindBy(id="ap_phone_number")
	WebElement mobileNum;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement verify_MobileNum;
	
	public void start_here()
	{
		start_here.click();
	}
	public void create_amazon()
	{
		create_amazon.click();
	}
	public void appCustomerName()
	{
		app_CustomerName.sendKeys("Sanvi");
	}
	public void mobileNumber()
	{
		mobileNum.sendKeys("9742941739");
	}
	public void password()
	{
		password.sendKeys("Aayanshpatil@2023");
	}
	public void verifiyMobileNumber()
	{
		verify_MobileNum.click();
	}
	public Amz_NewUserAccount_Register(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
