package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Flipkart {
	
	public WebDriver driver;
	@BeforeMethod
	public void OpenAppln()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares1/Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
	}
	@AfterMethod
	public void CloseAppln()
	{
		driver.close();
	}

}
