import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class WebElementPractice extends Base{
	
	public void display()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msg=driver.findElement(By.xpath("//input[@class=\'form-control\' and @id=\'single-input-field\']"));
		msg.sendKeys("Hello");
		WebElement button=driver.findElement(By.xpath("//button[@id=\"button-one\" and @type=\"button\"]"));
		button.click();
		
	}

	public static void main(String[] args) {
		WebElementPractice w=new WebElementPractice();
		w.initializeBrowser();
		w.display();
		
		

	}

}
