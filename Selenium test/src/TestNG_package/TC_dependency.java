package TestNG_package;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_dependency {
	
	@Test
	public void startapp()
	{
		System.out.println("app started");
			
		Assert.assertEquals(12,12);
		
	}
	
	@Test(dependsOnMethods ="startapp" )
	public void login()
	{
		System.out.println("app login");
				
	}
	
	@Test
	public void logout()
	{
		System.out.println("app logout");
				
	}

}
