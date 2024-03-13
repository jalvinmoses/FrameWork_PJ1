package TestNG_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidLogin1 {
	
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		PomScript1 p = new PomScript1(driver);
		p.PassData();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.PassData();
		driver.close();
	}

}
