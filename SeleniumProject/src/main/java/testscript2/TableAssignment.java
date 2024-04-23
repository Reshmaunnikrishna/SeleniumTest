package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class TableAssignment extends Base{
	
	public void rowCheck()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tabcheck=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[10]"));
		System.out.println(tabcheck.getText());
	}
	
	public void columnCheck()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List <WebElement> col=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[5]"));
		for(WebElement value:col)
		{
		System.out.println(value.getText());
		}
	}
	
	public void selectItem()
	{
			driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
			WebElement item=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[9]/td[2]"));
			System.out.println(item.getText());	
	}
	
	public void elementSearch() 
	{
	String input="Ashton Cox";
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	List <WebElement> col=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
	for(WebElement element:col)
	{
		if(input.equals(element.getText()))
		{
			System.out.println(element.getText());
		}
	
	}
	}

	public static void main(String[] args) {
		
		TableAssignment tableassignment=new TableAssignment();
		tableassignment.initializeBrowser();
		tableassignment.rowCheck();
		System.out.println("***************************************");
		tableassignment.columnCheck();
		System.out.println("***************************************");
		tableassignment.selectItem();
		tableassignment.elementSearch();
		//tableassignment.driverQuitAndClose();
		
		
		

	}

}
