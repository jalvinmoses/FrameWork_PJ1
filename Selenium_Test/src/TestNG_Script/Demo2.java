package TestNG_Script;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Demo2 {
	@Test(priority = 1)
	public void test1()
	{
		Reporter.log("Asia",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("India",true);
	}

}
