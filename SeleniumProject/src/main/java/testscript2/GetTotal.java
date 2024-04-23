package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class GetTotal extends Base{
	
	public void getTotal()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement val1=driver.findElement(By.id("value-a"));
		val1.sendKeys("10");
		WebElement val2=driver.findElement(By.id("value-b"));
		val2.sendKeys("5");
		WebElement total=driver.findElement(By.id("button-two"));
		total.click();
	}

	public static void main(String[] args) {
		
	GetTotal gettotal=new GetTotal();
	gettotal.initializeBrowser();
	gettotal.getTotal();
	gettotal.driverQuitAndClose();
	
		
	}

}
