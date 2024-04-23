package testscript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccessMethods extends Base //Syntax://tagname[@attribute='value']//accessmethodname::tagname
{
	public void parentAccessMethods()
	{
		WebElement parent1 =driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
		WebElement parent2 =driver.findElement(By.xpath("//input[@id='value-a']//parent::div"));
		WebElement parent3 =driver.findElement(By.xpath("//input[@id='value-b']//parent::div"));
		WebElement parent4 =driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div"));
		WebElement parent5 =driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
	}
		public void childAccessMethods()
	{
		WebElement child1 =driver.findElement(By.xpath("//button[@class='navbar-toggler']//child::span"));
		WebElement child2 =driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img"));
		WebElement child3 =driver.findElement(By.xpath(""));
		WebElement child4 =driver.findElement(By.xpath(""));	
	}
	public void ancestorAccessMethods()
	{
		WebElement ancestor1 =driver.findElement(By.xpath("//input[@id='single-input-field']//ancestor::div"));
		WebElement ancestor2 =driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));	
	}
	public void descendentAccessMethods()
	//will select child of current node
	{
		WebElement descendent1 =driver.findElement(By.xpath("//select[@id='single-input-field']//descendant::option"));
		WebElement descendent2 =driver.findElement(By.xpath(""));
	}
	public void followingAccessMethods()
	//will select everything under current node
	{
		WebElement following1 =driver.findElement(By.xpath("//button[@id='button-first']//following::div"));
		WebElement following2 =driver.findElement(By.xpath(""));
	}
	public void followingSiblingsAccessMethods()
	{
		WebElement followsibling1 =driver.findElement(By.xpath(""));
	}
	public void precedingAccessMethods()
	//control will be on top
	{
		WebElement preceding1 =driver.findElement(By.xpath("//button[@id='button-all']//preceding::div"));
	}
	public void indexingAccessMethods()
	{
		WebElement indexing1 =driver.findElement(By.xpath("//select[@id='single-input-field']//descendant::option[2]"));
	}

	public static void main(String[] args) {
		

	}

}
