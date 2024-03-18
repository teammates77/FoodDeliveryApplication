package Alchemy.FoodAggregator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helppage {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://localhost:4200/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/app-root/app-landing/div[1]/div[2]/ul/li[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-help-support/div/div[2]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-help-support/div/div[2]/div[3]/div/ul/li[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-help-support/div/div[2]/div[3]/div/ul/li[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-help-support/div/div[2]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-help-support/div/div[2]/div[3]/div/ul/li[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-help-support/div/div[2]/div[3]/div/ul/li[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-help-support/div/div[2]/div[3]/div/ul/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-help-support/div/div[1]/div[1]/ul/a/li/img")).click();
		driver.close();
		
		
}
}