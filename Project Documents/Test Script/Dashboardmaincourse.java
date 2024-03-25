package DXC.Food;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboardmaincourse {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:4200/dashboard");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[1]/div[2]/a/img")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-brass/main/main/div[2]/div/div[1]/div[1]/button")).click();
	}

}
