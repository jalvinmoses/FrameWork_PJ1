package TestNG_Script;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Demo4 {
	@Test(enabled = false, priority = 0)
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
