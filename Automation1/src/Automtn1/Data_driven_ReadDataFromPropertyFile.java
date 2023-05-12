package Automtn1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_driven_ReadDataFromPropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
		FileInputStream F=new FileInputStream("./Test Data/NewData.property");
	    Properties P=new Properties();
	    P.load(F);
	   
	    String URL = P.getProperty("url");	    
	    driver.get(URL);
	    
	    String name = P.getProperty("Username");
	    driver.findElement(By.name("username")).sendKeys(name);
	    
	    String pass = P.getProperty("Password");    
	    driver.findElement(By.name("pwd")).sendKeys(pass);
	    
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[.='Login ']")).click();
	    
	    Thread.sleep(4000);	        
//	    String data = P.getProperty("browser");	
//	    System.out.println(data);
//	    
//	    String URL = P.getProperty("url");	
//	    System.out.println(URL);
//	   
//	    String name = P.getProperty("username");
//	    System.out.println(name);
//	   
//	    String pass = P.getProperty("password");	  
//	    System.out.println(pass);
	}
}
