package DXC.Alchemy;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Adminlogin {

		
	    public static void main(String[] args) {
	        // Initialize ChromeDriver                     
	        WebDriver driver = new ChromeDriver();
	        // Open Website
	        driver.get("http://localhost:4200/login");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("email")).sendKeys("Raj@gmail.com");
	        driver.findElement(By.id("password")).sendKeys("Raj12#");
	        driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/form/br")).click();
	       
	    }
}
