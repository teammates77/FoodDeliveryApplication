package Users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class Dashboardfooter extends BaseTest{
	

   
@Test

	
	public void VerfiyFoodfun() throws InterruptedException {
	 webDriver.get("http://localhost:4200/dashboard");
	 WebElement elements=webDriver.findElement(By.xpath("/html/body/app-root/app-footer/div/div[1]"));
	String textContents=elements.getText();
	System.out.println("captured text content: "+ textContents);
	Thread.sleep(2000);
}

@Test(priority=1)
public void VerifyCompany() throws InterruptedException {
	// webDriver.get("http://localhost:4200/dashboard");
	 WebElement elements=webDriver.findElement(By.xpath("/html/body/app-root/app-footer/div/div[2]"));
	String textContents=elements.getText();
	System.out.println("captured text content: "+ textContents);
	Thread.sleep(2000);
}
@Test(priority=2)
public void VerifycontactLegal() throws InterruptedException {
	// webDriver.get("http://localhost:4200/dashboard");
	 WebElement elements=webDriver.findElement(By.xpath("/html/body/app-root/app-footer/div/div[3]"));
	String textContents=elements.getText();
	System.out.println("captured text content: "+ textContents);
	Thread.sleep(2000);
}
@Test(priority=3)
public void Verifylegal() throws InterruptedException {
	// webDriver.get("http://localhost:4200/dashboard");
	 WebElement elements=webDriver.findElement(By.xpath("/html/body/app-root/app-footer/div/div[4]"));
	String textContents=elements.getText();
	System.out.println("captured text content: "+ textContents);
	Thread.sleep(2000);
}
}
