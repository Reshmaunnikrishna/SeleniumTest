package testscript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{
	
	public void contains()   //Syntax: //tag[contains(@attribute,'value')]
	{
		WebElement contains1 =driver.findElement(By.xpath("//button[contains(@id,'one')]"));
		WebElement contains2 =driver.findElement(By.xpath("//button[contains(@id,'two')]"));
		WebElement contains3 =driver.findElement(By.xpath("//input[contains(@id,'single')]"));
		WebElement contains4 =driver.findElement(By.xpath("//input[contains(@id,'grid')]"));
		WebElement contains5 =driver.findElement(By.xpath("//button[contains(@id,'first')]"));	 
	}
	
	public void text()    //Syntax: //tag[text()=value]

	{
		WebElement text1 =driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement text2 =driver.findElement(By.xpath("//label[text()= 'Enter Message']"));
		WebElement text3 =driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement text4 =driver.findElement(By.xpath("//label[text()='Enter value A']"));
		WebElement text5 =driver.findElement(By.xpath("//label[text()='Enter value B']"));
	}
	public void startsWith() //Syntax: //tag[starts-with(@attribute,value)]
	{
		WebElement startswith1 =driver.findElement(By.xpath("//button[starts-with(@id,'button')]"));
		WebElement startswith2 =driver.findElement(By.xpath("//input[starts-with(@id,'single')]"));
		WebElement startswith3 =driver.findElement(By.xpath("//input[starts-with(@id,'value')]"));
		WebElement startswith4 =driver.findElement(By.xpath("//input[starts-with(@id,'grid')]"));
		WebElement startswith5 =driver.findElement(By.xpath(""));
	}
	public void or() //Syntax: //tag[@attrubute=value or @attrubute=value]
	{
		WebElement or1 =driver.findElement(By.xpath("//input[@id='single-input-field' or @class='form-control']"));
		WebElement or2 =driver.findElement(By.xpath("//input[@id='value-a' or @type='text']"));
		WebElement or3 =driver.findElement(By.xpath("//input[@id='gridCheck' or @type='checkbox']"));
		WebElement or4 =driver.findElement(By.xpath("//button[@id='button-one' or @type='button']"));
	}
	public void and() //Syntax: //tag[@attrubute=value and @attrubute=value]
	{
		WebElement and1 =driver.findElement(By.xpath("//input[@id='value-a' and @type='text']"));
		WebElement and2 =driver.findElement(By.xpath("//input[@id='single-input-field' and @type='text']"));
		WebElement and3 =driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		WebElement and4 =driver.findElement(By.xpath("//input[@id='gridCheck' and @type='checkbox']"));
	}
	
	public void basicXpath() //Syntax: //tag[@attribute='value']
	{
		
		WebElement basic1 =driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement basic2 =driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement basic3 =driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement basic4 =driver.findElement(By.xpath("//input[@id='value-a']"));
	}

	public static void main(String[] args) {
		Xpath xpath=new Xpath();
		xpath.initializeBrowser();
		xpath.contains();
		xpath.text();
		xpath.startsWith();
		xpath.or();
		xpath.and();
		xpath.driverQuitAndClose();
		

	}

}
