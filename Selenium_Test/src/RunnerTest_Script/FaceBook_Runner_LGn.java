package RunnerTest_Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Excel_FB_Login;
import Generic.GenericScript;
import POM_Script.FaceBook_LGn;

public class FaceBook_Runner_LGn extends GenericScript {
	
	@Test
	public void FaceBook_Login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FaceBook_LGn fb=new FaceBook_LGn(driver);
		fb.Uname_txt(Excel_FB_Login.getdata("Sheet1", 0, 0));
		Thread.sleep(1000);
		fb.Pwd_txt(Excel_FB_Login.getdata("Sheet1", 1, 0));
		Thread.sleep(1000);
		fb.Lbtn_btn();
		Thread.sleep(1000);
		Assert.fail();
	}

}
