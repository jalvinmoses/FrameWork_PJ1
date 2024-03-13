package Selenium_Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("puma");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("span[class='a-size-base-plus a-color-base a-text-normal']")).click();
		Thread.sleep(5000);
		//driver.close();
		driver.quit();

	}

}
