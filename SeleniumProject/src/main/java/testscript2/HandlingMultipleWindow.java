package testscript2;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testscript1.Base;

public class HandlingMultipleWindow extends Base{
	
	public void multipleWindow()
	{
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement window=driver.findElement(By.xpath("//a[@href=\'https://www.facebook.com/obsqurazone/\']"));
		window.click();
		String parentwindow=driver.getWindowHandle(); //to get only parent window
		Set<String> child=driver.getWindowHandles(); //to get both parent and child
		Iterator<String> li =child.iterator(); 
		while(li.hasNext())
		{
			String childwindow=li.next();
			if(!parentwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				WebElement login=driver.findElement(By.xpath("//div[@class='x1c436fg']//child::div[@role='button']"));
				login.click();	
			}
		}
	}

	public static void main(String[] args) {
		HandlingMultipleWindow handlingmultiplewindow=new HandlingMultipleWindow();
		handlingmultiplewindow.initializeBrowser();
		handlingmultiplewindow.multipleWindow();
		//handlingmultiplewindow.driverQuitAndClose();
	}

}
