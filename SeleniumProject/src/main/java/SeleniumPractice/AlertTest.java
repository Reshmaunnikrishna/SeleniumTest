package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class AlertTest extends Base{
	
	public void alertTest()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement a1=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		a1.click();
		driver.switchTo().alert().dismiss();
		WebElement a2=driver.findElement(By.xpath("//p[@id='confirm-demo']"));
		driver.switchTo().alert().sendKeys("Hi");
		//driver.switchTo().alert().accept();

	}

	
	public static void main(String[] args) {
		AlertTest alerttest=new AlertTest();
		alerttest.initializeBrowser();
		alerttest.alertTest();
		//alerttest.driverQuitAndClose();
	
	}

}
