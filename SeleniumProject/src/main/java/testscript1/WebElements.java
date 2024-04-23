package testscript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElements extends Base {
	public void sendkeys()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msg =driver.findElement(By.xpath("//input[@id='single-input-field' and @type='text']"));
		msg.sendKeys("Test");
		WebElement entrbutton =driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		entrbutton.click();
	}

	public static void main(String[] args) {
		WebElements webelements=new WebElements();
		webelements.initializeBrowser();
		webelements.sendkeys();
		//webelements.driverQuitAndClose();
	

	}

}
