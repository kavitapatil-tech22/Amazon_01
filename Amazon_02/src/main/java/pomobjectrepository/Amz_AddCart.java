package pomobjectrepository;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generics.PageUtility;

/**
 * 
 * @author Kavita
 *
 */
public class Amz_AddCart extends PageUtility {
	// WebDriver driver;

	// @FindBy(id="add-to-cart-button")
	// @FindBy(xpath="//i[@class='a-icon a-icon-cart']")
	@FindBy(xpath = "//span[@id='submit.add-to-cart']")
	WebElement addtocart;
	// 1. locating each components using @FindBy annotation

	// locating proceed to checkout button
	// @FindBy(xpath="//input[@value='Proceed to checkout']")
	// @FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	//@FindBy(id = "sw-ptc-form")
	//@FindBy(xpath="//form[@id='sw-ptc-form']")
	@FindBy(xpath="//span[@id='sc-buy-box-ptc-button']")
	WebElement proceed_to_buy;

	@FindBy(xpath = "//span[@id='orderSummaryPrimaryActionBtn']")
	WebElement use_this_address;

	// cash on delivery
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement cash_on_delivery_radio_btn;
	
	@FindBy(xpath="(//span[text()='Cash on Delivery/Pay on Delivery'])[2]")
	WebElement CashOnDelivery_text;

	// credit card
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement cradit_card_radio_btn;
	
	@FindBy(xpath="//span[text()='Credit or debit card']")
	WebElement CreditCard_text;

	// click on enter credit card details
	// @FindBy(xpath="//div[@class='a-row pmts-add-cc-default-trigger']")
	@FindBy(xpath = "//span[@data-action='add-credit-card-action-name-pp-Xtepqm-25']")
	WebElement enter_card_details;

	// emi
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement emi_radio_btn;
	
	@FindBy(xpath="(//span[text()='EMI'])[2]")
	WebElement EMI_text;

	// netbanking
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement netbanking_radio_btn;
	
	@FindBy(xpath="(//span[text()='Net Banking'])[2]")
	WebElement netbanking_text;

	// others upi
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement othersUPI_radio_btn;
	
	@FindBy(xpath="//span[text()='Other UPI Apps']")
	WebElement OtherUPIApps_text;

	/* card number */
	@FindBy(xpath = "//input[@class='a-input-text a-form-normal pmts-account-Number']")
	WebElement card_num;

	/* UseThisPayment method button */
	@FindBy(xpath = "//span[@id='orderSummaryPrimaryActionBtn']")
	WebElement UseThisPayment_btn;

	@FindBy(xpath = "(//div[@class='a-row a-spacing-small'])[11]")
	WebElement review_the_process;

	/* month list */
	@FindBy(xpath = "//select[@name='ppw-expirationDate_month']")
	WebElement month_list;

	/* year list */
	@FindBy(xpath = "//select[@name='ppw-expirationDate_year']")
	WebElement year_list;

	/* enter card details button */
	@FindBy(xpath = "//span[@class='a-button a-button-primary pmts-button-input']")
	WebElement entercarddetails_btn;

	/* cancel button */
	@FindBy(xpath = "//span[@class='a-button a-button-base pmts-button-input']")
	WebElement cancel_btn;

	/* iframe entercard details */
	@FindBy(xpath = "//iframe[@id='pp-Xtepqm-101']")
	WebElement iframe_card;

	/* after adding to the cart - Added To Cart message is validating */
	@FindBy(xpath = "//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
	WebElement addedtoCart_SuccessMesg;

	/* quantity to select from dropdown */
	@FindBy(xpath = "//select[@name='quantity']")
	WebElement quantity_selection;

	@FindBy(xpath = "//span[@id='sw-gtc']")
	WebElement Goto_Cart;

	@FindBy(xpath = "(//input[@value='Delete'])[1]")
	WebElement delete_cart;

	// @FindBy(xpath="(//a[@class='a-link-normal sc-product-link'])[1]")
	@FindBy(xpath = "(//a[@class='a-link-normal sc-product-link'])[1]/text()[1]")
	// @FindBy(xpath="(//div//span[@class='a-size-base']/text())[2]")
	WebElement DeleteFromCart_Mesg1;

	@FindBy(xpath = "//span[text()=' was removed from Shopping Cart. ']")
	WebElement DeletedFromcart_SuccessMesg;

	@FindBy(xpath = "//h1[@class='a-spacing-mini a-spacing-top-base']")
	WebElement deleteFromCart_Mesg2;

	// 2. intilaizing each component using page factory class
	public void addtocart(WebDriver driver) {
		visibilityOfElement(addtocart);
		addtocart.click();
	}

	public void UsethisPaymentMethod() {
		UseThisPayment_btn.click();
	}

	public void Validate_ReviewCartTillEnd() {
		Assert.assertEquals(review_the_process.isDisplayed(), true, "Review items and delivery is not shown");
	}

	public void quantity_selection() {

		selectbyindex(quantity_selection, 02);
	}

	public void gotoCart() {
		Goto_Cart.click();
	}

	public void delete_cart() {
		delete_cart.click();

	}

	public void validate_deletingCart() {
		//System.out.println("after deleting the items from cart Message" +delete_cart.getText());
		
		//System.out.println("after deleting the items from cart Message  " +delete_cart.getAttribute("value"));
		//Assert.assertEquals(delete_cart.isDisplayed(),true,"Cart quantity is not deleted");

		// (//div//span[@class='a-size-base']/text())[2]

		// String Mesg1 =DeleteFromCart_Mesg1.getText();
		
		/* below 3 line code of validation is working */
		 String Mesg2=DeletedFromcart_SuccessMesg.getText();		
		 System.out.println("after deleting the items from cart Message: "+ Mesg2);
		 
		 Reporter.log("after deleting the items from cart Message : "+Mesg2);
		Assert.assertEquals(DeletedFromcart_SuccessMesg.isDisplayed(), true, "Cart quantity is not deleted"); 
		
	/*	String Mesg3 = deleteFromCart_Mesg2.getText();
		// System.out.println("after deleting the items from cart Message: " +Mesg1);
		System.out.println("after deleting the items from cart Message:   " + Mesg3);
		Assert.assertEquals(deleteFromCart_Mesg2.isDisplayed(), true, "Cart quantity is not deleted");    */
	}

	// click on proceed to buy
	public void proceed_to_checkout() {
		proceed_to_buy.click();
	}

	// click on use this address button
	public void usethisaddress() {
		use_this_address.click();
		// clickabilityOfElement(driver, enter_card_details);
		clickabilityOfElement(driver, use_this_address);

	}

	// selecting cash on delivery
	public void cashondelivery() {
		cash_on_delivery_radio_btn.click();
	}

	// selecting cradit card
	public void creditcard() {
		// cradit_card_radio_btn.click();
		// clickabilityOfElement(cradit_card_radio_btn);

		cradit_card_radio_btn.click();
	}

	public void ValidateCraditCard() {
		
		String mesg1=CreditCard_text.getText();
		System.out.println("credit card selected:  " +mesg1);

		Assert.assertEquals(cradit_card_radio_btn.isSelected(), true, "Credit card is not selected");
	}

	public void ValidateNetBanking() {
				
		String mesg1=netbanking_text.getText();
		System.out.println("NetBanking selected:  " +mesg1);

		Assert.assertEquals(netbanking_radio_btn.isSelected(), true, "NetBanking is not selected");
	}

	public void ValidateOthersUPIPayment() {
		
		String mesg1=OtherUPIApps_text.getText();
		System.out.println("others UPI Apps selected:  " +mesg1);
		
		Assert.assertEquals(othersUPI_radio_btn.isSelected(), true, "Others UPI Payment is not selected");
	}

	public void ValidateEmiPayment() {
		String mesg1=EMI_text.getText();
		System.out.println("EMI Payment selected:  " +mesg1);

		Assert.assertEquals(emi_radio_btn.isSelected(), true, "EMI is not selected");
	}
	public void ValidateCashOnDelivery() {
		String mesg1=CashOnDelivery_text.getText();
		System.out.println("Cash On Delivery selected:  " +mesg1);

		Assert.assertEquals(cash_on_delivery_radio_btn.isSelected(), true, "Cash on delivery is not selected");
	}

	public void entercard_details(WebDriver driver) {
		visibilityOfElement(enter_card_details);
		enter_card_details.click();

		clickabilityOfElement(driver, enter_card_details);
		// switch to frame
		// driver.switchTo().frame(0);

		switchFrame(driver, iframe_card);
		visibilityOfElement(iframe_card);

		carddetails_entering();
	}

	public void carddetails_entering() {
		card_num.sendKeys("4725 2589 6325 4152");
		selectbyindex(month_list, 04);
		selectbyValue(year_list, "2026");
		// entercarddetails_btn.click();
		cancel_btn.click();
	}

	// selecting EMI
	public void emi_payment() {
		emi_radio_btn.click();
	}

	// selecting netbanking
	public void netbanking_payment() {
		netbanking_radio_btn.click();
	}

	// selecting others UPI
	public void others_UPI_payment() {
		othersUPI_radio_btn.click();
		// switchtoparentwindow(driver);
	}

	//
	public void validate_addedtoCart() {
		String mesg = addedtoCart_SuccessMesg.getText();
		System.out.println("after adding to the cart the message is Dispalyed as :  " + mesg);

		Assert.assertEquals(addedtoCart_SuccessMesg.isDisplayed(), true, "not dispalyed");
	}

	// 3. intilaizing each component using page factory class

	public Amz_AddCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
