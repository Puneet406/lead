package generic_scripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Excel {

	
	public static String getdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./excel/Test.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		
		Stel.toString();
		return value;
	}
	
	    
}
