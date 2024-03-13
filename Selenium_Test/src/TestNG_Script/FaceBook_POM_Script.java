package TestNG_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook_POM_Script {
	
	@FindBy(id="email")
	private WebElement UName;
	@FindBy(id = "pass")
	private WebElement Pwd;
	@FindBy(name ="login")
	private WebElement LBtn;
	
	public FaceBook_POM_Script(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Uname_PassData()
	{
		UName.sendKeys("Selenium");
	}
	public void Pwd_PassData()
	{
		Pwd.sendKeys("123456789!Af");
	}
	public void Lbtn_Click()
	{
		LBtn.click();
	}

}
