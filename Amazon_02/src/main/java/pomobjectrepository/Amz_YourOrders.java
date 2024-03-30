package pomobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Amz_YourOrders 
{
	WebDriver driver;
	@FindBy(linkText="Your Orders")
	WebElement your_order;
	
	@FindBy(id="time-filter")
	WebElement prevoius_order;
	
	@FindBy(linkText="Write a product review")
	WebElement product_review;
	
	//@FindBy(xpath="(//div[@class='a-section a-spacing-top-micro ryp__interval-product-attribute-input'][1]//button[@type='button'][4])[1]")
	@FindBy(xpath="//div[@class='a-section a-spacing-top-micro']//button[@type='button'][5]")
	WebElement give_stars;
	
	@FindBy(xpath="//span[text()='Submitted']")
	WebElement submit;
	
	
	
	/*  for login below code*/
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement username;

	// @FindBy(id="continue")
	@FindBy(xpath = "//input[@id='continue']")
	WebElement username_submit;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signin_button;
	
	public void userName() {
		// username.sendKeys(ex1.getusername(username1)); // getting data from
		// data.properties file - its working

		username.sendKeys("9036589651");
	}
	public void un_submit() {
		username_submit.click();
	}

	public void password() {
		password.sendKeys("@@@@@@");
	}

	public void signin() {
		signin_button.click();
	}
	
	public void your_order()
	{
		your_order.click();
	}
	public void previous_order()
	{
		Select s1=new Select(prevoius_order);
		
		s1.selectByVisibleText("2023");
		}
	public void prd_review()
	{
		product_review.click();
	}
	public void give_Stars()
	{
		give_stars.click();
	}
	public void submit()
	{
		submit.click();
	}
	public void validate_submit_reviews()
	{
		String mesg1=submit.getText();
		System.out.println(" reviews submitted : " +mesg1);
		Assert.assertEquals(submit.isDisplayed(),true,"reviews not submitted");
	}
	public Amz_YourOrders(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
}
