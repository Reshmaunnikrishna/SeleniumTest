package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
	public void locatorId()
	{
		//WebElement elementname=driver.findElement(By.locator("locatorvalue"));
		WebElement showmessagebutton=driver.findElement(By.id("button-one"));
		WebElement entermessagefield=driver.findElement(By.id("single-input-field"));
		WebElement entervaluefield=driver.findElement(By.id("value-a"));
		WebElement selectedcolorfield=driver.findElement(By.id("message-one"));
		WebElement getfirstselectedfield=driver.findElement(By.id("button-first"));

		
		
		
	}
	
	public void locatorClassName()
	{
		WebElement headertopname =driver.findElement(By.className("header-top"));
		WebElement clearfixfield =driver.findElement(By.className("clearfix"));
		WebElement formchecklabel =driver.findElement(By.className("form-check-label"));
		WebElement datepicker =driver.findElement(By.className("form-control datepicker"));
		WebElement formcheckinput =driver.findElement(By.className("form-check-input"));
		
	}

	public static void main(String[] args) {
		

	}

}
