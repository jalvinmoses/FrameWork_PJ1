package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Generic.BasePage;

public class FlipKart_Aircooler extends BasePage{
	
	@FindBy(name = "q")
	private WebElement s_txt;
	@FindBy(xpath = "(//a[@class='s1Q9rs'])[1]")
	private WebElement F_Prod;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']/..")
	private WebElement AddCart;
	
	public FlipKart_Aircooler(WebDriver driver)
	{
		super(driver);
		//PageFactory.initElements(driver, this);
	}
	
	public void Stxt_PassData()
	{
		s_txt.sendKeys("Aircooler");
		s_txt.submit();
	}
	public void Fprod_Click()
	{
		F_Prod.click();
	}
	public void AddCart_Click()
	{
		AddCart.click();
	}

}
