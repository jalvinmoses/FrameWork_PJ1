package TestNG_Script;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FaceBook_Mon_Asc_Dsc {
	
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement mon = driver.findElement(By.id("month"));
		Select sel =new Select(mon);
		ArrayList<String> list = new ArrayList<String>();
		for(WebElement opt:sel.getOptions())
		{
			
			list.add(opt.getText());
		}
		ArrayList<String> tempList = list;
		Collections.sort(tempList);
		System.out.println(tempList);	
		for(String temp:tempList)
		{
			System.out.println(temp);
		}
		//Collections.reverseOrder(tempList)
		System.out.println();
		//Collections.reverse(tempList);
		Collections.sort(tempList, Collections.reverseOrder());
		for(String rev:tempList)
		{
			System.out.println(rev);
		}
		Thread.sleep(2000);
		driver.close();
	}

}
