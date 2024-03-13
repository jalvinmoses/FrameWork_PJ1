package TestNG_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomScript1 {
	
	//Declaration
	@FindBy(id="email")
	private WebElement UName;
	
	//Initialization
	public PomScript1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void PassData()
	{
		UName.sendKeys("Selenium");
	}
	
	
	
}
