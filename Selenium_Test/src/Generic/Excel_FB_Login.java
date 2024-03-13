package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;

public class Excel_FB_Login {
	public static String getdata(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		String Val="";
		try {
			FileInputStream fis=new FileInputStream("./excel/Seleniumtestdata.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Cell C = book.getSheet(sheet).getRow(row).getCell(cell);
			Val = C.getStringCellValue();
		} catch (Exception e) {
			System.out.println("Unable to fetch the data");
		}
		return Val;

	}

}
