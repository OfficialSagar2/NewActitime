package Automtn1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class Print_Excel_Row_Data {

	public static void main(String[] args) throws InterruptedException, IOException {
		FileInputStream F=new FileInputStream("./Test Data/testData.xlsx");	
		Workbook Book = WorkbookFactory.create(F);
		int LastRow = Book.getSheet("Sheet1").getLastRowNum();
		int Lastcol= Book.getSheet("Sheet1").getRow(1).getLastCellNum();
		
//		for (int i = 0; i <= LastRow ; i++) {		
//			String data = Book.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
//			System.out.println(data);				
//		}
//		System.out.println(Lastcol);	
		for (int i = 0; i <= Lastcol ; i++) {		
			String data = Book.getSheet("Sheet1").getRow(1).getCell(i+1).getStringCellValue();
			System.out.print(data+" ");				
		}
		
//		for (int i = 1; i <= LastRow ; i++) {				
//			Book.getSheet("Sheet1").getRow(i).getCell(1).setCellValue("m dhoni");
//			FileOutputStream FO= new FileOutputStream("./Test Data/testData.xlsx");
//			Book.write(FO);
//		
		   
//			Book.getSheet("Sheet1").getRow(i).getCell(1).setCellValue("Ganesh ");
//			Book.getSheet("Sheet1").getRow(i).getCell(1).setCellValue("pratik");
//			Book.getSheet("Sheet1").getRow(i).getCell(1).setCellValue("sagar");		
//		}
	}
}										