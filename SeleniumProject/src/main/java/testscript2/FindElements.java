package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class FindElements extends Base{
	
	public void findElementsTest()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> list1=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement option:list1)
		{
			option.sendKeys("Hello");
		}
	}

	public static void main(String[] args) {
		FindElements findelements= new FindElements();
		findelements.initializeBrowser();
		findelements.findElementsTest();
		//findelements.driverQuitAndClose();
		
		

	}

}
