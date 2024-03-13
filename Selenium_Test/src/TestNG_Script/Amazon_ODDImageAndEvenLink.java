package TestNG_Script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_ODDImageAndEvenLink {
	
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.xpath("//a[position()mod 2=0]"));
		for(WebElement link:links)
		{
			
			String url = link.getAttribute("href");
			System.out.println(url);
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
	
		List<WebElement> img = driver.findElements(By.xpath("//img[position()mod 2=1]"));
		for(WebElement imags:img)
		{
			String image = imags.getAttribute("src");
			
			System.out.println(image);
		}
		Thread.sleep(5000);
		driver.close();
	}

}
