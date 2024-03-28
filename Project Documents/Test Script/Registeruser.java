package Users;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class Registeruser extends BaseTest {
	@Test(priority=3)

	
	public void VerfiyValid() throws InterruptedException {
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");*/
		
			
		
		webDriver.manage().window().maximize();
		 webDriver.findElement(By.xpath("/html/body/app-root/app-header/div/div[2]/ul/li[3]/a")).click();
		 webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div/a[2]")).click();
		 
		    webDriver.findElement(By.id("firstName")).sendKeys("Praneetha");
			  webDriver.findElement(By.id("lastName")).sendKeys("Shetty");
			  webDriver.findElement(By.id("email")).sendKeys("Shetty@gmail.com");
			  webDriver.findElement(By.id("password")).sendKeys("Pshetty@34");
			  webDriver.findElement(By.id("phNumber")).sendKeys("9677575753");
			  webDriver.findElement(By.xpath("/html/body/app-root/app-register/div/div/form/button")).click();
			 WebElement button= webDriver.findElement(By.className("swal2-popup swal2-modal swal2-icon-success swal2-show"));
			  button.click();
			  Thread.sleep(2000);
			 
			  Alert alert=webDriver.switchTo().alert();
			  String alertMessage = webDriver.switchTo().alert().getText();
		       // System.out.println(alertMessage);
		      alert.accept();
			  		 
		}
	
@Test(priority=1)

	
	public void VerfiyInvalid() throws InterruptedException {
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");*/
		
			
		
		webDriver.manage().window().maximize();
		 webDriver.findElement(By.xpath("/html/body/app-root/app-header/div/div[2]/ul/li[3]/a")).click();
		 webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div/a[2]")).click();
		 
		    webDriver.findElement(By.id("firstName")).sendKeys("234");
			  webDriver.findElement(By.id("lastName")).sendKeys("6");
			  webDriver.findElement(By.id("email")).sendKeys("Shetty@.com");
			  webDriver.findElement(By.id("password")).sendKeys("tt34");
			  webDriver.findElement(By.id("phNumber")).sendKeys("96775753");
			  webDriver.findElement(By.xpath("/html/body/app-root/app-register/div/div/form/button")).click();
			  
			  		 
}
@Test(priority=2)


public void Verfiyempty() throws InterruptedException {
	/*ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");*/
	
		
	
	webDriver.manage().window().maximize();
	 webDriver.findElement(By.xpath("/html/body/app-root/app-header/div/div[2]/ul/li[3]/a")).click();
	 webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/div/a[2]")).click();
	 
	    webDriver.findElement(By.id("firstName")).sendKeys("");
		  webDriver.findElement(By.id("lastName")).sendKeys("");
		  webDriver.findElement(By.id("email")).sendKeys("");
		  webDriver.findElement(By.id("password")).sendKeys("");
		  webDriver.findElement(By.id("phNumber")).sendKeys("");
		  webDriver.findElement(By.xpath("/html/body/app-root/app-register/div/div/form/button")).click();
		  Thread.sleep(5000);
		  		 
}

}



			
			



