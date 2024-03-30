package generics;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
/**
 * 
 * @author Kavita
 *
 */
public class PageUtility extends LaunchandQuit
{
	//public static WebDriver driver=null;
	
	/**
	 * to wait implicitly
	 */
//	public void implicitwait(WebDriver driver) {		
//		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//	}
	/**
	 * to wait till element is clickable
	 * @param element
	 */
	public void clickabilityOfElement(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
//	public void clickabilityOfElement_1(WebElement element) {
//		WebDriverWait wait=new WebDriverWait(driver, Auto_Constant.explicitlywaitwait);
//		wait.until(ExpectedConditions.visibilityOf(element));
//	}
	/**
	 * to wait till element is visible
	 * @param element
	 */
	public void visibilityOfElement(WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(element));
}
	public void visibilityOfElement(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
//	public void visibilityOfElement(WebElement element) {
//		WebDriverWait wait=new WebDriverWait(driver, Auto_Constant.explicitlywaitwait);
//		wait.until(ExpectedConditions.visibilityOf(element));
//	}
	/**
	 * Used to take screenshot
	 * @param driver
	 * @param methodName
	 * @throws IOException
	 */
	
	public String takeScreenShot(String methodName,boolean status) throws IOException  {
		//TakesScreenshot ts = (TakesScreenshot) this.driver;
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		//String path=AutoConstant.Pass_screenshotpath+methodName+"+Math.random()+"+".PNG";
		//String path=AutoConstant.screenshotpath+methodName+"+Math.random()+"+".PNG";
		String path;
		if(status==true)
		{
		    path=".//ScreenShot-All//Pass_ScreenShot//"+methodName+"-"+Math.random()+".PNG" ;
		}
		else {
			 path=".//ScreenShot-All//Fail_ScreenShot//"+methodName+"-"+Math.random()+".PNG" ;
		}
		File dest=new File(path);
		Files.copy(src, dest);
		return path;
	}
	/**
	 * to select from drop down by visible Text
	 * @param element
	 * @param text
	 */
	public void selectbyvisibletext(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	/**
	 * to select from drop dowm by value
	 * @param element
	 * @param text
	 */
	public void selectbyValue(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByValue(text);
	}
	/**
	 * to select from drop down by index
	 * @param element
	 * @param index
	 */
	public void selectbyindex(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	/**
	 * to switch to child window
	 * @param driver
	 * @param sessionid
	 */
	public void switchtochildWindow(WebDriver driver) {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> winpop = windows.iterator();
		String parentid = winpop.next();
		String childid = winpop.next();
		driver.switchTo().window(childid);
	}
	/**
	 * to switch to parent window
	 * @param driver
	 */
	public void switchtoparentwindow(WebDriver driver) {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> winpop = windows.iterator();
		String parentid = winpop.next();
		driver.switchTo().window(parentid);
	}
	/**
	 * to switch frame by name
	 * @param driver
	 * @param nameorid
	 */
	public void switchFrame(WebDriver driver,String nameorid) {
		driver.switchTo().frame(nameorid);
	}
	/**
	 * to switch to frame by index
	 * @param driver
	 * @param index
	 */
	public void switchFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/**
	 * To switch back to parent frame
	 * @param driver
	 */
	
	public void switchtodefaultcontain(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	/**
	 * to scroll till element is visible
	 * @param driver
	 * @param element
	 */
	public void scrollBar(WebDriver driver, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void scrollBar_1(WebDriver driver, int y) 
	{
		
		JavascriptExecutor j1=(JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0,"+y+")");
		//Thread.sleep(3000);
		
		j1.executeScript("window.scrollBy(0,-500)");
	}
	/**
	 * Action class mouse over
	 */
	 public void mousehoverOver(WebDriver driver,WebElement element) 
	  {		
			 Actions actions=new Actions(driver);		
			 actions.moveToElement(element).perform();
	  }

}
