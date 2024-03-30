package pomobjectrepository;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generics.PageUtility;

/**
 * 
 * @author Kavita
 *
 */
public class Amz_Home extends PageUtility {

	//WebDriver driver;
	// 1. locating each components using @FindBy annotation
	/* search input box */
	@FindBy(id = "twotabsearchtextbox")
	WebElement serach_inputbox;

	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement account;

	/* sign out link */
	// @FindBy(id="nav-item-signout")
	@FindBy(xpath = "//a[@id='nav-item-signout']")
	WebElement signout;

	// click on first product
	// @FindBy(xpath="(//span[@class='a-size-base-plus a-color-base
	// a-text-normal'])[1]")
	@FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	WebElement first_product;
	
	 /* click on first product that is shoes  */
	  @FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	  WebElement first_shoes;
	  
	  /* buy now button    */
	  @FindBy(id="submit.buy-now")
	  WebElement buy_now;

	/*  */
	@FindBy(xpath = "(//span[@id='acrPopover'])[1]")
	WebElement star_rating;

	@FindBy(xpath = "(//span[@id='acrCustomerReviewText'])[1]")
	WebElement rating_link;

	@FindBy(xpath = "//h2[text()='Customer reviews']")
	WebElement customer_reviews;

	//@FindBy(xpath = "//a[@id='seeMoreDetailsLink']")
	@FindBy(xpath="(//i[@class='a-icon a-icon-extender-expand'])[2]")
	WebElement seeMoreproductDetailsLink;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-none aok-align-center aok-relative']/span[3]")
	WebElement price;
	
	/* after searching product shoe dispayed shoe text word on the top verifying */
	@FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']//span[3]")
	WebElement shoes_textdispalyed;
	
	 /*   */
	  @FindBy(xpath="//span[text()='Your Account']")
	  WebElement your_account;
	 
	//2. intilaizing each component using page factory class
		public Amz_Home(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	// 3. creating the method for each component to perform its action
	
	
	
	// search any product - shoes for women
	public void serachingtheProduct() {
		serach_inputbox.sendKeys("shoe");
		serach_inputbox.sendKeys(Keys.ENTER);
	}

	/* click on your account link  */
	  public void yourAccount() {
		  your_account.click();
	  }
	  
	// mouse over on the account
	public void mouseOver_account(WebDriver driver2) {
		Actions actions = new Actions(driver2);
		actions.moveToElement(account).perform();
	}

	// click on first product
	public void clickOnFirstProduct(WebDriver driver) {
		first_product.click();
		switchtochildWindow(driver);//
	}

	public void startRating(WebDriver driver) {
		star_rating.click();

	}
	

	public void ratingLink(WebDriver driver) {
		clickabilityOfElement(driver, rating_link);
		mousehoverOver(driver, rating_link);
		rating_link.click();
	}

	public void seemoreProductDetailsLink(WebDriver driver) {

		clickabilityOfElement(driver, seeMoreproductDetailsLink);

		seeMoreproductDetailsLink.click();
	}

	public int scrollbar(WebDriver driver) {

		Point p1 = seeMoreproductDetailsLink.getLocation();
		// int x= p1.getX();
		int y = p1.getY();
		// System.out.println(y);
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0," + y + ")");
		// Thread.sleep(3000);

		j1.executeScript("window.scrollBy(0,-400)");

		return y;
	}
	public void validatedprice() {
		Assert.assertEquals(price.isDisplayed(), true,"Price is not displayed");
	
	}
	public void validateCustomerReview() {
		Assert.assertEquals(customer_reviews.isDisplayed(), true, "Customer review is not dispalyed");
	}
	public void validateProductDescription() {
		Assert.assertEquals(seeMoreproductDetailsLink.isDisplayed(), true, "Product description is not dispalyed");
	}

	
	public void validate_product_shoe() {
		String pname="shoe";
		String productname=shoes_textdispalyed.getText();
		System.out.println("search product name :  " + productname);
	
		Assert.assertEquals(shoes_textdispalyed.isDisplayed(),true,"search product is not matched");
	}
	public void Validate_HomePage() {
		Assert.assertEquals(serach_inputbox.isDisplayed(),true,"Login is unsuccessful");
	}

	
	// click on logout
	public void logout() {
		signout.click();
	}



}
