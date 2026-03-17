package selenium_Auto62;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class FetchingValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1= new FileInputStream("/Users/ankita/eclipse-workspace/Automation/ExcelSheet/Book 1.xlsx");
		Workbook ws=  WorkbookFactory.create(f1);
		Sheet s1=ws.getSheet("sheet1");
		Row r1=s1.getRow(0);
		Cell c1= r1.getCell(0);
		
		String username1= ws.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		String password1= ws.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		
	    String username2= NumberToTextConverter.toText(ws.getSheet("sheet1").getRow(1).getCell(0).getNumericCellValue());
		String password2= ws.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		//ws.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue()
		System.out.println(username1);
		System.out.println(password1);
		System.out.println(username2);
		System.out.println(password2);
	}

}
