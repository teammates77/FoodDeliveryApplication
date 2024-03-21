package DXC.Alchemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Droptest {
	public static void main(String[] args) {
	
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://localhost:4200/");
			
			WebElement dropdownElement=driver.findElement(By.name("cities list"));
			
			Select dropdown=new Select(dropdownElement);
		
			dropdown.selectByVisibleText("Gurugram");
		
			String selectedOption=dropdown.getFirstSelectedOption().getText();
			if
			(selectedOption.equals("Gurugram")) {
			System.out.println("Gurugram is selected"); }
			else
			{ System.out.println("Gurugram is not selected");
			dropdown.selectByIndex(1);
			selectedOption = dropdown.getFirstSelectedOption().getText();
			if
			(selectedOption.equals("Delhi"));
			{
			System.out.println("Delhi is selected");
			 }
			dropdown.selectByIndex(2);
			
			selectedOption = dropdown.getFirstSelectedOption().getText();
		if
		(selectedOption.equals("Bangalore"));
			{
			System.out.println("Bangalore is selected");
			 }
}
}
}


