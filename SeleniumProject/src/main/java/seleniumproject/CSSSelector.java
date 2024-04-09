package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CSSSelector extends Base{
	
	public void tagAndId()
	{
		//Syntax: CSS=tag#id
		WebElement buttoncheck =driver.findElement(By.cssSelector("button#button-one"));
		WebElement entermessage =driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement entervaluea =driver.findElement(By.cssSelector("input#value-a"));
		WebElement entervalueb =driver.findElement(By.cssSelector("input#value-b"));
			
	}
	
	public void tagAndClass()
	{
		//Syntax: CSS=tag.class
		WebElement formcheck =driver.findElement(By.cssSelector("input.form-check-input"));
		WebElement inputgrp =driver.findElement(By.cssSelector("span.input-group-text"));
		WebElement sectioncheck =driver.findElement(By.cssSelector("section.clearfix"));
		//WebElement formcheck =driver.findElement(By.cssSelector(""));
	}
	public void tagAndAttribute()
	{
		//Syntax: CSS=tag[attribute=value]
		WebElement tagbutton =driver.findElement(By.cssSelector("button [id='button-one']"));
		WebElement tagbutton2 =driver.findElement(By.cssSelector("button [id='button-two']"));
		WebElement tagbutton3 =driver.findElement(By.cssSelector("input[id='single-input-field']"));
		WebElement tagbutton4 =driver.findElement(By.cssSelector("input[id=\'gridCheck']"));
		WebElement tagbutton5 =driver.findElement(By.cssSelector(""));
		
	}
	public void tagClassAndAttribute()
	{
		//Syntax: CSS=tag.classname[attribute="value"]
		WebElement tagclassatr1 =driver.findElement(By.cssSelector("input.form-check-input[id=\'invalidCheck\']"));
		WebElement tagclassatr2 =driver.findElement(By.cssSelector("span.input-group-text[id=\'inputGroupPrepend\']"));
		WebElement tagclassatr3 =driver.findElement(By.cssSelector("input.form-check-input[id=\'gridCheck\']"));
	}

	public static void main(String[] args) {
		
		CSSSelector cssselector=new CSSSelector();
		cssselector.initializeBrowser();
		cssselector.tagAndId();
		cssselector.tagAndClass();
		cssselector.tagAndAttribute();
		cssselector.tagClassAndAttribute();
		cssselector.driverQuitAndClose();
		

	}

}
