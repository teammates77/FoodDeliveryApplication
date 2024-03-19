package Alchemy.Food_delivery;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Least {
	WebDriver driver;
	 
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webDriver.chrome.driver","C:\\Web Drivers\\chromedriver-win64 (1)\\chromedriver-win64");
		driver=new ChromeDriver();
		driver.get("http://localhost:55637/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
	}
	 
@Test
	public void Username()
	{
		driver.findElement(By.id("userName")).sendKeys("gjhjssads");
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	 
	
}
