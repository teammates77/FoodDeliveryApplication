package DXC.Alchemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginregisterpage {

	public static void main(String[] args) {
		// Initialize ChromeDriver                     
        WebDriver driver = new ChromeDriver();
        // Open Website
        driver.get("http://localhost:4200/login");
        driver.manage().window().maximize();
        driver.get("http://localhost:4200/register");
        driver.findElement(By.id("firstName")).sendKeys("Rajath");
        driver.findElement(By.id("lastName")).sendKeys("kumari");
        driver.findElement(By.id("email")).sendKeys("Raj@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Raja@#");
        driver.findElement(By.id("phNumber")).sendKeys("7545654509");
        driver.findElement(By.xpath("/html/body/app-root/app-register/div/div/form/button")).click();

	}

}
