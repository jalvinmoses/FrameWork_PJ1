package TestNG_Script;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic.GenericScript;

public class Runner1 extends GenericScript{
	
	@Test
	void ValidLogin()
	{
		driver.findElement(By.id("email")).sendKeys("Moses@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("manage456@");
		driver.findElement(By.name("login")).click();
	}

}
