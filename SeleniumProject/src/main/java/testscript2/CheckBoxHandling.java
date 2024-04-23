package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class CheckBoxHandling extends Base{
	
	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement check1=driver.findElement(By.xpath("//input[@id='gridCheck' and @type='checkbox']"));
		check1.click();
		System.out.println(check1.isSelected());
	}

	public static void main(String[] args) {
    CheckBoxHandling checkbox=new  CheckBoxHandling();
    checkbox.initializeBrowser();
    checkbox.checkBox();
    //checkbox.driverQuitAndClose();
    
		

	}

}
