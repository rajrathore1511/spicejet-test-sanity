package TestNG_package;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_hard_assertion {

	@Test(priority=1)
	public void softassertio()
	{
		SoftAssert assertion=new SoftAssert();
		
		System.out.println("Test started ");
		assertion.assertEquals(12, 13, "count doesnt match hench varification 1 failed");
		System.out.println("test completed1");
		assertion.assertAll();
	}

	@Test(priority=2)
	public void Hardassertion()
	{
		
		System.out.println("Test started ");
		Assert.assertEquals(12, 13, "count doesnt match hench varification failed");
		System.out.println("test completed2");
		
	}

}
