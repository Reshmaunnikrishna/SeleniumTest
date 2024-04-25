package testscript1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElements extends Base {
	public void sendkeys()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msg =driver.findElement(By.xpath("//input[@id='single-input-field' and @type='text']"));
		msg.sendKeys("Test");
		//implicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement entrbutton =driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		wait.until(ExpectedConditions.elementToBeClickable(entrbutton));
		entrbutton.click();
	}

	public static void main(String[] args) {
		WebElements webelements=new WebElements();
		webelements.initializeBrowser();
		webelements.sendkeys();
		//webelements.driverQuitAndClose();
	

	}

}
