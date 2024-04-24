package testscript3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import testscript1.Base;
//Assignment 
public class ScriptExecutorTest extends Base{
	
	public void execute()
	{
		driver.navigate().to("https://www.firstcry.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,2000)","");
		//jse.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		WebElement search=driver.findElement(By.xpath("//span[@class='search-button']"));
		jse.executeScript("arguments[0].click();",search);
		search.click();
	}

	public static void main(String[] args) {
		ScriptExecutorTest scriptexecutortest= new ScriptExecutorTest();
		scriptexecutortest.initializeBrowser();
		scriptexecutortest.execute();
		//scriptexecutortest.driverQuitAndClose();
		
		

	}

}
