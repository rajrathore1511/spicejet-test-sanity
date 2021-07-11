package TestNG_package;

import org.testng.Assert;
import org.testng.annotations.Test;

public class First_testNG_class {
	
	@Test(priority=3,description = "testcase1")
	public void gmaillogin()
	
	{
		System.out.println("testng");
		
	}

	@Test(priority=-2)
	public void registration()
	
	{
		System.out.println("testng1");
	   Assert.assertEquals(15, 15);	
	}
	
	@Test(priority=1)
	public void logout()
	
	{
		System.out.println("testng1");
		
	}
}
