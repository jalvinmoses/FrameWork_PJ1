package TestNG_Script;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;

public class Demo1 {
	@Test
	public void compose()
	{
		Reporter.log("message created",true);
	}
	@Test(dependsOnMethods = "compose")
	public void SentItems()
	{
		AssertJUnit.fail();
		Reporter.log("message delivered",true);
		//Assert.fail();
	}
	@Test(dependsOnMethods = "SentItems")
	public void trash()
	{
		Reporter.log("message deleted",true);
	}
	@Test(dependsOnMethods = "compose")
	public void Draft()
	{
		Reporter.log("message Saved",true);
	}
	
}
