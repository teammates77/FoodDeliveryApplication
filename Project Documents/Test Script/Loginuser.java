package Users;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;


public class Loginuser extends BaseTest{
@Test(priority=1)
	public void VerfiyInvalid() throws InterruptedException{
		webDriver.findElement(By.xpath("/html/body/app-root/app-header/div/div[2]/ul/li[3]/a")).click();
		 webDriver.findElement(By.id("email")).sendKeys("shweta");
		  webDriver.findElement(By.id("password")).sendKeys("Shw@21");
		  webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button")).click();
	}

	@Test(priority=3)
	public void Verfiyvalid() throws InterruptedException {
		webDriver.findElement(By.xpath("/html/body/app-root/app-header/div/div[2]/ul/li[3]/a")).click();
	 webDriver.findElement(By.id("email")).sendKeys("shweta@gmail.com");
	  webDriver.findElement(By.id("password")).sendKeys("Shweta@21");
	  webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button")).click();
	  
}

@Test(priority=2)
public void Verfiyempty() throws InterruptedException {
	webDriver.findElement(By.xpath("/html/body/app-root/app-header/div/div[2]/ul/li[3]/a")).click();
 webDriver.findElement(By.id("email")).sendKeys("shweta@gmail.com");
  webDriver.findElement(By.id("password")).sendKeys("Shweta@21");
  webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button")).click();
  
}
}