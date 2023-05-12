package Automtn1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Property_File {
	public String Read_Data_From_Property_File1 (String key) throws IOException {
		// FileInputStream F=new FileInputStream("./Test Data/NewData.property");
		   Properties P=new Properties();
		   P.load(new FileInputStream("./Test Data/NewData.property"));
		   String Value = P.getProperty(key);
		   return Value;
		}
}
class Excel_File{
	  public String Read_Data_From_Excel_File (String SheetName,int a,int b) throws EncryptedDocumentException, IOException {
  
		Workbook Book = WorkbookFactory.create(new FileInputStream("./Test Data/testData.xlsx"));	
		String Data = Book.getSheet(SheetName).getRow(a).getCell(b).getStringCellValue();
		return Data;	
	}
}

class Update_Excel{	
	public String Update_Excel (String SheetName,int c,int d) throws EncryptedDocumentException, IOException {
		
		Workbook Book = WorkbookFactory.create(new FileInputStream("./Test Data/testData.xlsx"));
		Book.getSheet(SheetName).getRow(c).getCell(d).setCellValue("Ms Dhoni");
		FileOutputStream FO= new FileOutputStream("./Test Data/testData.xlsx");
		Book.write(FO);
		return SheetName;
		
	}
}
	class Generic_Method_Diff_Class{
		public static void main(String[] args) throws IOException, InterruptedException {
			//Read Excel file
			Excel_File EF=new Excel_File();
			String Data = EF.Read_Data_From_Excel_File("Sheet1",2,1);
			System.out.println(Data);
			
			//Update Excel file
			Update_Excel UE= new Update_Excel();
			UE.Update_Excel("Sheet1", 3, 1);
			
			//Notepad or Property file
			Property_File PF= new Property_File();
			String URL = PF.Read_Data_From_Property_File1("url");
			
			WebDriver driver=new ChromeDriver();
			driver.get(URL);		
			String name = PF.Read_Data_From_Property_File1("Username");
		    driver.findElement(By.name("username")).sendKeys(name);
		    
//		    String pass = PF.Read_Data_From_Property_File("Password");    
//		    driver.findElement(By.name("pwd")).sendKeys(pass);
//		    
//		    Thread.sleep(2000);
//		    driver.findElement(By.xpath("//div[.='Login ']")).click();
		}
}
