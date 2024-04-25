package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript1.Base;

public class ActionTest extends Base {
	
	public void actionTest()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement d1=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		WebElement d2=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action=new Actions(driver);
		action.moveToElement(d1).build().perform();
		action.doubleClick(d1).build().perform();
		action.dragAndDrop(d1, d2).build().perform();	
	}

	public static void main(String[] args) {
		ActionTest actiontest=new ActionTest();
		actiontest.initializeBrowser();
		actiontest.actionTest();
		//actiontest.driverQuitAndClose();
	
	}

}
