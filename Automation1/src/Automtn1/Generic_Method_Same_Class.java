package Automtn1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

class Generic_Method_Same_Class {
	//Notepad or Property file
	public String Read_Data_From_Property (String key) throws IOException {
	   FileInputStream F=new FileInputStream("./Test Data/NewData.property");
	   Properties P=new Properties();
	   P.load(F);
	   String Value = P.getProperty(key);   
	   return Value;
	}
	
	//Read Excel file 
	public String Read_Data_From_Excel_File (String SheetName,int a,int b) throws EncryptedDocumentException, IOException {
		Workbook Book = WorkbookFactory.create(new FileInputStream("./Test Data/testData.xlsx"));	
		String Data = Book.getSheet(SheetName).getRow(a).getCell(b).getStringCellValue();
		return Data;			
	}
	
	//Update Excel file
	 public String Update_Excel (String SheetName,int c,int d,String Name) throws EncryptedDocumentException, IOException {	
		Workbook Book = WorkbookFactory.create(new FileInputStream("./Test Data/testData.xlsx"));
		Book.getSheet(SheetName).getRow(c).getCell(d).setCellValue(Name);
		FileOutputStream FO= new FileOutputStream("./Test Data/testData.xlsx");
		Book.write(FO);
		return SheetName;		
	}
	
	//Main method
	public static void main(String[] args) throws IOException {
		
		Generic_Method_Same_Class GM= new Generic_Method_Same_Class();
			
		//Notepad or Property file
		String Value = GM.Read_Data_From_Property("url");	
		System.out.println(Value);
		
		//Read Excel file
		String Read_Excel_Data = GM.Read_Data_From_Excel_File("Sheet1",3,1);
	    System.out.println(Read_Excel_Data);
	   
	    //Update Excel file
	    String Update_Excel_Data = GM.Update_Excel("Sheet1",3,1,"Pratik");	    
	}
}
