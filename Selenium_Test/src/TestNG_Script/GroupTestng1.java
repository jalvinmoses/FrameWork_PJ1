package TestNG_Script;

import org.testng.annotations.Test;

@Test(groups = {"g1"})
public class GroupTestng1 {
	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("Hello World");
	}

}



