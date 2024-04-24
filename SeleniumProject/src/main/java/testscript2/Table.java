package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class Table extends Base{
	
	public void tablePrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	public void singleRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement rowdisplay=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[5]"));
		System.out.println(rowdisplay.getText());
		
	}
	public void elementDisplay()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement elementdisplay=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[5]/td[3]"));
		System.out.println(elementdisplay.getText());
	}
	public void columnDisplay()
	{

			driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
			List<WebElement> col1=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
			for(WebElement option:col1)
			{
				System.out.println(option.getText());
			}
	}
	public static void main(String[] args) {
		Table table=new Table ();
		table.initializeBrowser();
		table.tablePrinting();
		System.out.println("***************************************");
		table.singleRow();
		System.out.println("***************************************");
		table.elementDisplay();
		System.out.println("***************************************");
		table.columnDisplay();
		//table.driverQuitAndCle();
		
	}

}
