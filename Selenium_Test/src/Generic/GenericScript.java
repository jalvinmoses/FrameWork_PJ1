package Generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PropertyFile.FetchProperty;

public class GenericScript implements FWK_constants {
	
	public WebDriver driver;
	@BeforeMethod
	public void OpenAppln() throws FileNotFoundException, IOException
	{
		System.setProperty(C_key,C_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.flipkart.com/");
		driver.get(FetchProperty.getprop());
		
	}
	@AfterMethod
	public void CloseAppln(ITestResult res)
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Generic_Page_Photo.get_photo(driver);
		}
		driver.close();
	}

}
