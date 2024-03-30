package generics;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
/**
 * 
 * @author Kavita
 *
 */
/*  Launch and quit browser  */
public class LaunchandQuit
{
	public static WebDriver driver;
	FileUtility file=new FileUtility();
	
	@BeforeMethod
	public void precondition() throws IOException
	{
//		if (nameofBrowser.equals("Chrome")) {
//			driver=new ChromeDriver();			
//		}
//		if (nameofBrowser.equals("Firefox")) {
//			driver = new FirefoxDriver();
//		}	
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		driver.navigate().to(file.getPropertyData("url"));
	}
	
	@AfterMethod
	public void quit() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
}
