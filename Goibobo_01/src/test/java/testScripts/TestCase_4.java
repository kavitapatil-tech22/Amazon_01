package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_4 
{	
	@Test
	public void testcase4() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.goibibo.com/profile/");
		driver.get("https://www.goibibo.com/flights/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		WebElement loginbtn=driver.findElement(By.xpath("//button[@class='sc-19vq0g0-6 gvmlSY']"));		
//		loginbtn.click();
//		driver.findElement(By.xpath("//div[@data-id='dweb-modal']"));		
//		WebElement emailid=driver.findElement(By.xpath("//input[@class='loginCont__input']"));
//		emailid.sendKeys("8884431316");
//		emailid.click();
		
		WebElement close=driver.findElement(By.xpath("//span[@class='logSprite icClose']"));	
		close.click();
		Thread.sleep(2000);
		//WebElement fromcity=driver.findElement(By.xpath("//div[@class='sc-12foipm-35 kdxZzw']//p[@class='sc-12foipm-20 bhnHeQ'][normalize-space()='Enter city or airport']"));		
		
		WebElement fromcity=driver.findElement(By.xpath("(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]"));
		fromcity.click();
		
		//WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bengaluru");
		
		List<WebElement> fromCity_value = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));
		fromCity_value.get(0).click();
			
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Kalaburagi");
		List<WebElement> toCityvalue = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));
		toCityvalue.get(0).click();
		
		//input.sendKeys(Keys.ENTER);
		
//		WebElement tocity=driver.findElement(By.xpath("(//div[@class='sc-12foipm-16 wRKJm fswFld '])[2]"));
//		tocity.click();
//		WebElement input1=driver.findElement(By.xpath("//input[@type='text']"));
//		input1.sendKeys("Kalaburagi (GBI)");
//		input1.sendKeys(Keys.ENTER);
		
		//WebElement svgele=driver.findElement(By.xpath("//span[@class='sc-12foipm-51 foqjOL']"));		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[.='Cancel']")).click();
		
		
		//driver.findElement(By.xpath("//span[@class='sc-12foipm-51 foqjOL']")).click();
		
		
		driver.findElement(By.xpath("//*[name()='svg']")).click();
		
		Thread.sleep(5000);
		//driver.quit();
		
	}
	
}
