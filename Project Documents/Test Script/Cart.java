package Users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class Cart extends BaseTest {
@Test

	
	public void VerfiyAddcart() throws InterruptedException {
	webDriver.manage().window().maximize();
    webDriver.get("http://localhost:4200/dashboard");
    webDriver.findElement(By.xpath("/html/body/app-root/app-header/div/div[2]/ul/li[4]")).click();
    Thread.sleep(2000);
    webDriver.findElement(By.xpath("/html/body/app-root/app-cart/body")).isDisplayed();
    Thread.sleep(2000);
    webDriver.findElement(By.xpath("/html/body/app-root/app-cart/body/div/div/div/button")).click();
	Thread.sleep(2000);
	webDriver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[1]/div[1]/a/img")).click();
	webDriver.findElement(By.xpath("/html/body/app-root/app-items/main/main/div[2]/div/div[1]/div[1]/button")).click();
	Thread.sleep(2000);
	//WebElement element=webDriver.findElement(By.xpath("/html/body/app-root/app-items/main/main/div[1]"));
	//String textContent=element.getText();
	//System.out.println("captured text content: "+ textContent);
	webDriver.findElement(By.xpath("/html/body/app-root/app-header/div/div[2]/ul/li[4]")).click();

}

}
