package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class RadioButtonHandling extends Base{
	
	public void radioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio=driver.findElement(By.xpath("//input[ @id='inlineRadio1']"));
		radio.click();
		System.out.println(radio.isSelected());
		WebElement radio1=driver.findElement(By.xpath("//button[@class='btn btn-primary' and @id='button-one']"));
		radio1.click();
		WebElement radio3=driver.findElement(By.xpath("//div[ @id='message-one']"));
		String actualtext=radio3.getText();
		System.out.println(actualtext);
	}

	public static void main(String[] args) {
		RadioButtonHandling radiobutton=new RadioButtonHandling();
		radiobutton.initializeBrowser();
		radiobutton.radioButton();
		//radiobutton.driverQuitAndClose();
		
		

	}

}
