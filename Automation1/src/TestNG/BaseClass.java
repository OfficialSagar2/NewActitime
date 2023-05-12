package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	//WebDriver driver = new ChromeDriver();
	public static WebDriver driver;
@BeforeSuite
	public void DatabaseConnection() {
		Reporter.log("Database Connection Succefully",true);
	}

@BeforeTest
public void LaunchBrowser() {
	driver = new ChromeDriver();
	Reporter.log("Launched Browser Succefully",true);		
	driver.manage().window().maximize();	
	driver.get("https://demo.actitime.com/");
	}	

@BeforeClass
public void BeforeClass() {
	Reporter.log("Before Class Succefully",true);
	
	}
	
@BeforeMethod
public void Login() throws InterruptedException {
	Reporter.log("Login Succefully",true);		
	driver.findElement(By.name("username")).sendKeys("admin");     
    driver.findElement(By.name("pwd")).sendKeys("manager");  
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[.='Login ']")).click();
	}


@AfterMethod
public void LogOut() throws InterruptedException {
	Reporter.log("LogOut Succefully",true);
	Thread.sleep(2000);
	driver.findElement(By.id("logoutLink")).click();
}	


@AfterTest
public void AfterTest() {
	Reporter.log("AfterTest Succefully",true);
	driver.close();
}

@AfterSuite
public void Close() {
	Reporter.log("Close Succefully",true);	
}
}
