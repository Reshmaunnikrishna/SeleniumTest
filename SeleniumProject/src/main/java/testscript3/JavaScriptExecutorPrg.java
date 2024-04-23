package testscript3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class JavaScriptExecutorPrg extends Base {
	
	public void javaScriptExecutor()
	
	{   
		driver.navigate().to("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;// built in class
		//js.executeScript("window.scrollBy(0,5000)",""); //x and y axis
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)", ""); //automatically move to bottom of the page
		WebElement searchbutton=driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		js.executeScript("arguments[0].click();",searchbutton);
		searchbutton.click();
	}

	public static void main(String[] args) {
		JavaScriptExecutorPrg javascriptexecutor=new JavaScriptExecutorPrg();
		javascriptexecutor.initializeBrowser();
		javascriptexecutor.javaScriptExecutor();
		//javascriptexecutor.driverQuitAndClose();
		
	}

}
