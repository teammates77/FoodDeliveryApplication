package Alchemy.FoodAggregator;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Merchantlogin {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200/login");
	 driver.findElement(By.id("email")).sendKeys("Praneetha@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("Praneeth@455");
	  driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/button")).click();
	  		
	    
	}
}

		
	
