package TestNG_Script;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram_logi {
	
		@Test
		public void login() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys("Moses");
			Thread.sleep(5000);
			driver.close();
			
			
		}

}
