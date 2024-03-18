package DXC.Alchemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adminlanding {

	public static void main(String[] args) {
		// Initialize ChromeDriver                     
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:4200/");
        driver.manage().window().maximize();

	}

}
