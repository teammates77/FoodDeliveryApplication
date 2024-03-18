package DXC.Alchemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class offerpage {
	public static void main(String[] args) {
        // Initialize ChromeDriver                     
        WebDriver driver = new ChromeDriver();
        // Open Website
        driver.get("http://localhost:4200/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/app-root/app-landing/div[1]/div[2]/ul/li[2]/button")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-offer/div/div[1]/div[2]/ul/input")).sendKeys("chicken");
}
}