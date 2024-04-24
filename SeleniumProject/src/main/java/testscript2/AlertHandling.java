package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class AlertHandling extends Base{
	
	public void alert1()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert1=driver.findElement(By.xpath("//button[@onclick=\'jsAlert()\']"));
		alert1.click();
		driver.switchTo().alert().accept();	
	}
	
	public void alert2()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert2=driver.findElement(By.xpath("//button[@onclick=\'jsConfirm()\']"));
		alert2.click();
		driver.switchTo().alert().accept();
		WebElement txt=driver.findElement(By.xpath("//p[@id='confirm-demo']"));
		System.out.println(txt.getText());
	    //driver.switchTo().alert().dismiss();
	}
	
	public void alert3()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert3=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		alert3.click();
		//driver.switchTo().alert().accept(); we can use accept or dismiss
		driver.switchTo().alert().sendKeys("test");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}
	
	public static void main(String[] args) {
		
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.initializeBrowser();
		alerthandling.alert1();
		//alerthandling.alert2();
		//alerthandling.alert3();
		//alerthandling.driverQuitAndClose();
	}

}
