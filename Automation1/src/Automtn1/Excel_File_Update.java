package Automtn1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_File_Update {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    	//FileInputStream F=new FileInputStream("./Test Data/testData.xlsx");
		    //Workbook Book = WorkbookFactory.create(F);
			
			Workbook Book = WorkbookFactory.create(new FileInputStream("./Test Data/testData.xlsx"));
//			String Data = Book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//			System.out.println(Data);	
			
			Book.getSheet("Sheet1").getRow(3).getCell(1).setCellValue("Virat Kohli");
			FileOutputStream FO= new FileOutputStream("./Test Data/testData.xlsx");
			Book.write(FO);
			
		}
	}