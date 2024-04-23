package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class SelectAllAssignment extends Base{
	
	public void selectAll()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement select=driver.findElement(By.xpath("//input[@id='button-two' and @type='button']"));
		select.click();
	}

	public static void main(String[] args) {
		
		SelectAllAssignment s1=new SelectAllAssignment();
		s1.initializeBrowser();
		s1.selectAll();
		//s1.driverQuitAndClose();
	}

}
