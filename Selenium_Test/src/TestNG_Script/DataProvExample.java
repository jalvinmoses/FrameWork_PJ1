package TestNG_Script;

import org.testng.annotations.Test;

public class DataProvExample {
	@Test(dataProvider = "Logincredential", dataProviderClass = CustomDataProv.class)
	public void loginTest(String un, String pwd)
	{
		System.out.println(un + " " +pwd);
	}

}
