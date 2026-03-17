package selenium_Auto62;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_ExcelSheetProgram {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		 FileInputStream f1= new FileInputStream("/Users/ankita/eclipse-workspace/Automation/ExcelSheet/Book 1.xlsx");
	     Workbook wb=WorkbookFactory.create(f1);
	 Sheet s1= wb.getSheet("Sheet1");
	 Row r1= s1.getRow(0);
	Cell c1= r1.getCell(0);
    String username=c1.getStringCellValue();
      System.out.println(username);
      
    String password=  wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
    System.out.println(password);
    

	}

}
