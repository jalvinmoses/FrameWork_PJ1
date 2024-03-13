package TestNG_Script;

import java.util.Set;

import org.testng.annotations.Test;

import Generic.GenericScript;
import POM_Script.FlipKart_Aircooler;

public class Flipkart_Runner extends GenericScript {
	
	@Test
	public void Flipkart_AddCart() throws InterruptedException
	{	
		
		FlipKart_Aircooler fa = new FlipKart_Aircooler(driver);
		fa.Stxt_PassData();
		Thread.sleep(2000);
		fa.Fprod_Click();
		Thread.sleep(2000);
		Set<String> all_id = driver.getWindowHandles();
		for(String id:all_id)
		{
			driver.switchTo().window(id);
		}
		Thread.sleep(3000);
		fa.AddCart_Click();
		
	}
	
}
