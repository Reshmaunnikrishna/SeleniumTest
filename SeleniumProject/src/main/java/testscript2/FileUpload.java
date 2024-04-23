package testscript2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class FileUpload extends Base{
	
	public void sendKeyMethod()
	{
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement upload=driver.findElement(By.xpath("//input[@id='file-upload']"));
		upload.sendKeys("/Users/vishnubrahmaputran/Desktop/PDF//Assignment Writing Guidelines.pdf");
		
	}
	//if sendKey does not work use robot class
	

	public static void main(String[] args) {
		FileUpload fileupload=new FileUpload();
		fileupload.initializeBrowser();
		fileupload.sendKeyMethod();
		//fileupload.driverQuitAndClose();
		

	}

} 
