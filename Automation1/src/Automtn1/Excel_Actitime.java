package Automtn1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Actitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream F=new FileInputStream("./Test Data/NewData.property");
	    Properties P=new Properties();
	    P.load(F);
	   
	    String URL = P.getProperty("url");	
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(URL);
	    
	    String name = P.getProperty("Username");
	    driver.findElement(By.name("username")).sendKeys(name);
	    
	    String pass = P.getProperty("Password");    
	    driver.findElement(By.name("pwd")).sendKeys(pass);
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[.='Login ']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.id("container_tasks")).click();
	    
	    driver.findElement(By.xpath("//div[text()='Add New']")).click();
	    driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
	    
        FileInputStream F1=new FileInputStream("./Test Data/testData.xlsx");
		
		Workbook Book = WorkbookFactory.create(F1);
		String Data = Book.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();  
		Thread.sleep(4000);
	    driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(Data);
	    System.out.println(Data);
	        
	    String Description = Book.getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();   
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(Description);
	    System.out.println(Description);
	    
	    driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	    
	    driver.findElement(By.id("logoutLink")).click();       
	}
}
