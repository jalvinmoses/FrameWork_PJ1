package TestNG_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBook_Runner1 {
	
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		FaceBook_POM_Script fb = new FaceBook_POM_Script(driver);
		fb.Uname_PassData();
		Thread.sleep(2000);
		fb.Pwd_PassData();
		Thread.sleep(5000);
		fb.Lbtn_Click();
		Thread.sleep(3000);
		driver.close();
	}

}
