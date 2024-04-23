package testscript1;

public class NavigationCommands extends Base{
	
	public void navigationCommands()
	{
		//driver.navigate().to(); will navigate to another page
		driver.navigate().to("https://www.amazon.in/");
		// navigate back to first page
		driver.navigate().back();
		// navigate again to amazon
		driver.navigate().forward();
		//refresh current page
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		NavigationCommands navigationcommands=new NavigationCommands();
		navigationcommands.initializeBrowser();
		navigationcommands.navigationCommands();
		//navigationcommands.driverQuitAndClose();
		
		

	}

}
