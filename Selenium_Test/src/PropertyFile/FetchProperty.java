package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;


/*
public class Properties1 {
	@Test
	public void FetchProp() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./moses.properties"));
		String val = p.getProperty("BaseURL");
		System.out.println(val);
	}

}
*/

public class FetchProperty {
	@Test
	public static String getprop() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./moses.properties"));
		String val = p.getProperty("Base_FBURL");
		//String val = p.getProperty("BaseURL");
		return val;
		//System.out.println(val);
	}

}