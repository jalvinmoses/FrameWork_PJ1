package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.BasePage;

public class FaceBook_LGn extends BasePage {
	
	@FindBy(name = "email")
	private WebElement Uname;
	@FindBy(id = "pass")
	private WebElement Pwd;
	@FindBy(name = "login")
	private WebElement Lbtn;
	
	public FaceBook_LGn(WebDriver driver) {
		super(driver);
	}
	
	public void Uname_txt(String Username)
	{
		Uname.sendKeys(Username);
	}
	public void Pwd_txt(String Password)
	{
		Pwd.sendKeys(Password);
	}
	public void Lbtn_btn()
	{
		Lbtn.click();
	}
	
}
