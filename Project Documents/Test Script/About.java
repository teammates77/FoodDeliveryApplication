package DXC.Alchemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class About {
	public static void main(String[] args) {
		// Initialize ChromeDriver                     
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:4200/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/app-root/app-footer/div/div[2]/a[1]")).click();

	}

}
