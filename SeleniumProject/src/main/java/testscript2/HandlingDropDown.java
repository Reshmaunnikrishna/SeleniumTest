package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testscript1.Base;

public class HandlingDropDown extends Base {
	
	public void dropdown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdwn =driver.findElement(By.xpath("//select[@id='single-input-field' and @class='form-control']"));
		//syntax: Select select=new Select(WebElement);
		Select select=new Select(dropdwn);
		// first method is selectbyvisibletext();
		select.selectByVisibleText("Red");
		select.selectByIndex(3);
		select.selectByValue("Yellow");
		
	}

	public static void main(String[] args) {
		HandlingDropDown handlingdropdown= new HandlingDropDown();
		handlingdropdown.initializeBrowser();
		handlingdropdown.dropdown();
		//handlingdropdown.driverQuitAndClose();
		


	}

}
