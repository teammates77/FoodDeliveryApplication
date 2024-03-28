package Users;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Dashboard extends BaseTest {

@Test

	
	public void VerfiyStraters() throws InterruptedException {
	webDriver.manage().window().maximize();
    webDriver.get("http://localhost:4200/dashboard");
	webDriver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[1]/div[1]/a/img")).click();
	webDriver.findElement(By.xpath("/html/body/app-root/app-items/main/main/div[2]/div/div[1]")).isDisplayed();
	webDriver.findElement(By.xpath("/html/body/app-root/app-items/main/main/div[2]/div/div[2]")).isDisplayed();
	webDriver.findElement(By.xpath("/html/body/app-root/app-items/main/main/div[2]/div/div[1]/div[1]/button")).click();
	webDriver.findElement(By.xpath("/html/body/app-root/app-header/div/div[2]/ul/li[4]/span")).click();
	Thread.sleep(2000);
}

@Test(priority=1)


public void VerfiyMain() throws InterruptedException {
//webDriver.manage().window().maximize();
webDriver.get("http://localhost:4200/dashboard");
webDriver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[1]/div[2]/a/img")).click();
webDriver.findElement(By.xpath("/html/body/app-root/app-brass/main/main/div[2]/div/div[1]")).isDisplayed();
webDriver.findElement(By.xpath("/html/body/app-root/app-brass/main/main/div[2]/div/div[2]")).isDisplayed();
webDriver.findElement(By.xpath("/html/body/app-root/app-brass/main/main/div[2]/div/div[3]")).isDisplayed();
webDriver.findElement(By.xpath("/html/body/app-root/app-brass/main/main/div[2]/div/div[1]/div[1]/button")).click();
}

@Test(priority=2)


public void VerfiyDessert() throws InterruptedException {
//webDriver.manage().window().maximize();
webDriver.get("http://localhost:4200/dashboard");
webDriver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[1]/div[3]")).click();
webDriver.findElement(By.xpath("/html/body/app-root/app-baskin/main/main/div[2]/div/div[1]")).isDisplayed();
webDriver.findElement(By.xpath("/html/body/app-root/app-baskin/main/main/div[2]/div/div[2]")).isDisplayed();
webDriver.findElement(By.xpath("/html/body/app-root/app-baskin/main/main/div[2]/div/div[2]/div[2]/button")).click();
}

@Test(priority=3)


public void Verfiybeverages() throws InterruptedException {
//webDriver.manage().window().maximize();
webDriver.get("http://localhost:4200/dashboard");
webDriver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[1]/div[4]")).click();
webDriver.findElement(By.xpath("/html/body/app-root/app-toy/main/main/div[2]/div[1]")).isDisplayed();
webDriver.findElement(By.xpath("/html/body/app-root/app-toy/main/main/div[2]/div[2]")).isDisplayed();
webDriver.findElement(By.xpath("/html/body/app-root/app-toy/main/main/div[2]/div[3]")).isDisplayed();
webDriver.findElement(By.xpath("/html/body/app-root/app-toy/main/main/div[2]/div[2]/div[4]/button")).click();
}

}