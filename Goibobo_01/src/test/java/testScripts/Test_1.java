package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_1 {
	
	
	@Test
	public void loginflights() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		driver.manage().window().maximize();
		
		
		WebElement elemnt1=driver.findElement(By.xpath("@FindBy(xpath=\"/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]\")"));		
		elemnt1.sendKeys("Bengaluru (BLR)");
		elemnt1.sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		
	}

}
