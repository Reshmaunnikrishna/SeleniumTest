package seleniumproject;
//dependency added in pom.xml
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	// driver is declared as global
	public WebDriver driver;
	
	public void initializeBrowser()
	{
		//load driver for chrome,variable 'driver' has the browser
		driver=new ChromeDriver();
		//launching the url
		driver.get("https://selenium.qabible.in/");
		//command to maximize window
		driver.manage().window().maximize();
	}
	
	public void driverQuitAndClose()
	{
		//to close the parent window only
		//driver.close();
		//to close all associated opened windows
		driver.quit(); 
	}

	public static void main(String[] args) {
		//object named base created
		Base base=new Base();
		base.initializeBrowser();
		base.driverQuitAndClose();
		
	}
	
	
	

}
