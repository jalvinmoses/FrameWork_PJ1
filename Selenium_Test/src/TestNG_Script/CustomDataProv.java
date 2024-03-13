package TestNG_Script;

import org.testng.annotations.DataProvider;

public class CustomDataProv {
	@DataProvider(name="Logincredential")
	public Object[][] getdata()
	{
		Object [][] data = {{"Santhosh@gmail.com","123"},{"rahul@gmial.com","456"},{"mos@gmail.con","7810"}};
		return data;
	}

}
