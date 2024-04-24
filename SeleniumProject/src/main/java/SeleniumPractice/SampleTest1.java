package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class SampleTest1 extends Base{
	
	public void getTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement col2=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[2]"));
		//System.out.println(col2.getText());
		List<WebElement> col3=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement col:col3)
		{
			System.out.println(col.getText());
		}
		
		
	}

	public static void main(String[] args) {
		SampleTest1 sampletest= new SampleTest1();
		sampletest.initializeBrowser();
		 sampletest.getTable();
		// sampletest.driverQuitAndClose();
		
		

	}

}
