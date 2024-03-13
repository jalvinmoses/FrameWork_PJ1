package TestNG_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.GenericScript;

public class FlipKart_Product extends GenericScript{
	
	@Test
	void ValidLogin()
	{
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("refrigerator");
		search.click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();

	}

}
