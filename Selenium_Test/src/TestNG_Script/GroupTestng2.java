package TestNG_Script;

import org.testng.annotations.Test;

@Test(groups = {"g2"})
public class GroupTestng2 {
	@Test(groups = {"sanity","regression"})
	public void test2()
	{
		System.out.println("Hello asia");
	}
	
	@Test(groups = {"regression"})
	public void test3()
	{
		System.out.println("Hello London");
	}

}