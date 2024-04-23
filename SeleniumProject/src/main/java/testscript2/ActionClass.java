package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript1.Base;
//Action class is used to perform keyboard and mouse actions

public class ActionClass extends Base{
	
	public void actionClass()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drag2=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action=new Actions(driver);
		action.moveToElement(drag1).build().perform();//select element to be moved
		action.doubleClick(drag1).build().perform();
		action.contextClick(drag1).build().perform();//right click
		action.dragAndDrop(drag1, drag2).build().perform();//drag 1 to be dropped to drag2
		
	}

	public static void main(String[] args) {
		
		ActionClass actionclass=new ActionClass();
		actionclass.initializeBrowser();
		actionclass.actionClass();
		//actionclass.driverQuitAndClose();
	}

}
