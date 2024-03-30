package pomobjectrepository;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import generics.LaunchandQuit;

public class Goibobo_RegistrationPage extends LaunchandQuit {

	WebDriver driver;
	// 1. initilizaing each component using page factory class

	public Goibobo_RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// 2. locating each components using @FindBy annotation
	@FindBy(xpath = "//span[@class='logSprite icClose']")
	WebElement close_pop_window;

	@FindBy(xpath = "(//p[text()='LOGIN / SIGNUP'])[2]")
	WebElement LoginSignUp;

	@FindBy(xpath = "//button[text()='Login/Sign Up']")
	WebElement btn_LoginSignUp;

	@FindBy(xpath = "//input[@class='loginCont__input']")
	WebElement txtbox_inputPhoneNum;

	@FindBy(xpath = "//button[text()='Continue']")
	WebElement btn_Continue;

	/* textbox full name */
	@FindBy(xpath = "//input[@placeholder='Enter your full name']")
	WebElement txt_fullName;

	/* textbox enter email id */
	@FindBy(xpath = "//input[@placeholder='Enter your email address']")
	WebElement txt_emailID;

	/* Lets Go button */
	@FindBy(xpath = "//button[text()='Lets Go']")
	WebElement btn_LetsGo;

	/* click on hey */
	@FindBy(xpath = "//span[text()='Hey']")
	// @FindBy(xpath="//div[@data-id='user-info-tab']")
	WebElement clickOn_Hey;

	@FindBy(xpath = "//div[@class='sc-1f95z5i-58 eDeLap down']")
	WebElement User_Info_dropdown;

	/*  */
	@FindBy(xpath = "//button[text()='I’ll do it later']")
	WebElement ClickOn_WillDoLater;
	/* */
	@FindBy(xpath = "//p[text()='View your profile']")
	WebElement viewYour_Profile;
	

	@FindBy(xpath=" //div[@data-id='user-info-tab']")
	//@FindBy(xpath="(//div[@class='sc-1f95z5i-46 eysNXF']//div)[4]")
	//div[@class='sc-fifgRP iKzBkA']
	WebElement hover_ProfileName;
	
	@FindBy(xpath="//div[@data-id='header-dropdown']/li")
	//@FindBy(xpath="(//div[@class='sc-1f95z5i-26 lkHhCD'])/li")
	WebElement viewYourProfile;

	/*  */
	@FindBy(xpath = "//input[@id='Mobile Number']")
	WebElement Mobile_num;
	/* view Profile - input box first name */
	@FindBy(xpath = "//input[@id='First Name']")
	WebElement input_FirstName;

	/* view Profile - input box email id */
	@FindBy(xpath = "//input[@id='Email ID']")
	WebElement input_EmailID;

	/* view Profile - input box last name */
	@FindBy(xpath = "//input[@id='Last Name']")
	WebElement input_LastName;

	/* view Profile - selecting female radio btn */
	// @FindBy(xpath="//span[@class='radioOuter']//input[2]")
	@FindBy(xpath = "//label[@for='female']")
	WebElement radiobtn_female;

	/* view Profile - click on Save button */
	@FindBy(xpath = "(//button[text()='Save'])[1]")
	WebElement btn_Save;

	/* view Profile - verify the email id */
	@FindBy(xpath = "//span[text()='verify']")
	WebElement verify_link;

	@FindBy(xpath = "//div//h2[text()='Verify your email']")
	WebElement verfiy_Youremail;

	@FindBy(xpath = "//div[@class='sc-fXSgeo fclkTx']")
	WebElement closeX_verifyemail_PopUp;

	/* click on button logout */
	@FindBy(xpath = "//span[text()='LOGOUT']")
	WebElement btn_LogOut;

	/* click on button YesLogOut */
	@FindBy(xpath = "//button[text()='Yes, Log out']")
	WebElement btn_YesLogOut;
	
	@FindBy(xpath="//p[text()='You have successfully logged in']")
	WebElement successful_LoginMesg;
	
	@FindBy(xpath="//p[text()='Please enter a valid OTP']")
	WebElement invalid_OTP;

	/* 3 creating the method for each componenet to perform its action */

	// mouse over on the account
	public void mouseOver_LoginSugnUp(WebDriver driver2) {
		Actions actions = new Actions(driver2);
		actions.moveToElement(LoginSignUp).perform();
	}

	public void btn_loginSignup() {

		btn_LoginSignUp.click();
	}

	public void txtbox_InputPhoneNum() {
		// txtbox_inputPhoneNum.sendKeys("8884431316");
		txtbox_inputPhoneNum.sendKeys("9742941739");
	}

	public void btnContinue() {
		btn_Continue.click();
	}

	

	/* enter fullname,emaildid,and click on btn letsGo */
	public void enter_AllDetails() {
		txt_fullName.sendKeys("Kavita K");
		// txt_emailID.sendKeys("kavitapatil.tech22@gmail.com");
		txt_emailID.sendKeys("kavitha.09anoor@gmail.com");
		btn_LetsGo.click();
	}

	public void ClickOnWillDoLater() {
		ClickOn_WillDoLater.click();

	}

	/* UserInfo_dropdown */
	public void mouseOver_Hey(WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(clickOn_Hey).perform();

	}

	/* UserInfo_dropdown */
	public void UserInfo_dropdown() {
		User_Info_dropdown.click();
	}

	public void input_EmailId() {
		txt_emailID.sendKeys("kavitha.09anoor@gmail.com");
	}

	public void viewyourprofile() {
		viewYour_Profile.click();
	}

	/* view profile input first name */
	public void inputFirstName() {
		input_FirstName.clear();
		input_FirstName.sendKeys("Kavita");
	}

	/* view profile - input email id */
	public void inputEmailId() {
		input_EmailID.sendKeys("kavitha.09anoor@gmail.com");
	}

	/* view profile lastname */
	public void inputLastName() {
		input_LastName.sendKeys("Anoor");
	}

	/* view profile radio btn female */
	public void radiobtnFemale() {
		radiobtn_female.click();
	}

	public void savebtn() {
		btn_Save.click();
	}

	public void verifyLink() {
		verify_link.click();
	}
	
	public void hoverProfileName(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(hover_ProfileName).perform();
	}
	public void viewYourProfile()
	{
		viewYour_Profile.click();
	}

	public void btnLogOut() {
		btn_LogOut.click();
	}

	public void btnYesLogOut() {
		btn_YesLogOut.click();
	}

	public void closeX_verifyemailPopUp() {
		closeX_verifyemail_PopUp.click();
	}

	
	public void wait_until_homepage_load(WebDriver driver) {
		// Thread.sleep(5000);
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		w1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h3[.='Congratulations']")));
	}
	
	public void validateUserLogin() {
		
		//String success_login_message=successful_LoginMesg.getText();
		
		Assert.assertEquals(successful_LoginMesg.isDisplayed(),true, "You have not successfully logged in");
	}

	public void validateRegisterEmail() {

		System.out.println("Verify your email " + verfiy_Youremail);
		Assert.assertEquals(verfiy_Youremail.isDisplayed(), true, "email id is not displayed");
	}

	/* testcase 2- validating login with valid credentail or not */
	public void validate_validCredential_1() {
		String actual = txtbox_inputPhoneNum.getText();
		String value = Mobile_num.getAttribute("value");
		String expected = value;
		System.out.println("text box input mobile num" + txtbox_inputPhoneNum);
		System.out.println("from view profile page - textbox mobile num " + Mobile_num);

		if (actual == expected) {
			Assert.assertEquals(actual == expected, true, "Invalid credentail");
		}

	}
	public String invalid_OTP()
	{
		String invalid_otp1=invalid_OTP.getText();
		return invalid_otp1;
	}
	
	public void Validate_invalidOTP()
	{
		Assert.assertEquals(invalid_OTP(),"Please enter a valid OTP");
	}
}
