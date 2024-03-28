package Userdetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseTest;

public class Dropdown extends BaseTest {
	
	@Test
	public void Droptest() throws InterruptedException { 
				
				
				
				webDriver.get("http://localhost:4200/");
				
				WebElement dropdownElement=webDriver.findElement(By.name("course list"));
				
				Select dropdown=new Select(dropdownElement);
			
				dropdown.selectByVisibleText("589 cities");
			
				String selectedOption=dropdown.getFirstSelectedOption().getText();
				if
				(selectedOption.equals("Patna")) 
				{
				System.out.println("Patna is selected"); }
				//else
				//{ 
				//System.out.println("Patna is not selected");
				dropdown.selectByIndex(1);
				selectedOption = dropdown.getFirstSelectedOption().getText();
				if
				(selectedOption.equals("Ranchi"));
				{
				System.out.println("Ranchi is selected");
				 }
				dropdown.selectByIndex(2);
				
				selectedOption = dropdown.getFirstSelectedOption().getText();
			if
			(selectedOption.equals("Bhubaneswar"));
				{
				System.out.println("Bhubaneswar is selected");
				 }
	}
	}
	

