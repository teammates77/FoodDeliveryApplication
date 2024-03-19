package Alchemy.Food_delivery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Launchbrowser {
	//public static String url="http://localhost:55637/";
	
	public static void main(String[] args) throws InterruptedException {
		
	
			WebDriver webdriver=new ChromeDriver();
			webdriver.get("http://localhost:4200/login");
			webdriver.manage().window().maximize();
			
			
			
			

		}

	}


