package testscript2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

	public static void main(String[] args) throws AWTException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement span=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		span.click();
		StringSelection ss=new StringSelection("/Users/vishnubrahmaputran/Desktop/PDF//Assignment Writing Guidelines.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot r=new Robot();
		r.delay(250);
		r.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      r.keyRelease(KeyEvent.VK_ENTER);
	      //pressing command+v(for Mac)
	      r.keyPress(KeyEvent.VK_META);
	      r.keyPress(KeyEvent.VK_V);
	      //releasing command+v(for Mac)
	      r.keyRelease(KeyEvent.VK_META);
	      r.keyRelease(KeyEvent.VK_V);
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      r.delay(90);
	      r.keyRelease(KeyEvent.VK_ENTER);
	
	}

}
