package testscript1;

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
	public void locatorName()
	{
		WebElement nameviewport =driver.findElement(By.name("viewport"));
		WebElement namedesciption =driver.findElement(By.name("description"));
		WebElement namekeywords =driver.findElement(By.name("keywords"));
	}
	public void locatorLinkText()
	{
		WebElement linktextsimpleform =driver.findElement(By.linkText("Simple Form Demo"));
		WebElement linktextcheckbox =driver.findElement(By.linkText("Checkbox Demo"));
		WebElement linktextradiobutton =driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement linktextselectinput =driver.findElement(By.linkText("Select Input"));		
	}
	public void locatorPartialLinkText()
	{
		WebElement partialsimpleform =driver.findElement(By.partialLinkText("Simple Form"));
		WebElement partialcheckbox =driver.findElement(By.partialLinkText("Checkbox"));
		WebElement partialradiobutton =driver.findElement(By.partialLinkText("Radio Buttons"));
		WebElement partialajaxform =driver.findElement(By.partialLinkText("Ajax Form"));
	}
	

	public static void main(String[] args) {
		Locators locators=new Locators();
		locators.initializeBrowser(); 
		locators.locatorId();
		locators.locatorClassName();
		locators.driverQuitAndClose();
		
	}

}
