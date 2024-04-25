package testNgPackage;

import org.testng.annotations.Test;

public class TestProgram {
  @Test(priority=2)
  public void testMethod() {
	  System.out.println("hello");
  }
  @Test(priority=1)
  public void show()
  {
	  System.out.println("Message from show method");
  }
  @Test(priority=3)
   public void display()
   {
	   System.out.println("Message from display method");
   }
}
