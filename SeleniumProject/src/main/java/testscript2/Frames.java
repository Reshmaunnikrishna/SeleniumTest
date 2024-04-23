package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript1.Base;

public class Frames extends Base {
	
	public void frame()
	{
		driver.navigate().to("https://demoqa.com/frames");
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		WebElement frame2=driver.findElement(By.id("sampleHeading"));
		System.out.println(frame2.getText());
	}
	//on clicking one frame it will navigate to another page
	public void nestedFrame()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframe=driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(iframe);
		WebElement frame3=driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		frame3.click();
		
	}

	public static void main(String[] args) {
		Frames frames= new Frames();
		frames.initializeBrowser();
		//frames.frame();
		frames.nestedFrame();
		//frames.driverQuitAndClose();
		
		

	}

}
