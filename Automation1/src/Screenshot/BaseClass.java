package Screenshot;

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

import TestNG.Login_Page;

public class BaseClass {
	public static WebDriver driver;
@BeforeSuite
	public void DatabaseConnection() {
		Reporter.log("Database Connection Succefully",true);
	}

@BeforeTest
public void LaunchBrowser() {
	driver = new ChromeDriver();		
	driver.manage().window().maximize();	
	driver.get("https://demo.actitime.com/");
	Reporter.log("Launched Browser Succefully",true);
	}	
	
@BeforeMethod
public void Login() throws InterruptedException {
	driver.findElement(By.name("username")).sendKeys("admin");     
    driver.findElement(By.name("pwd")).sendKeys("manager");  
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[.='Login ']")).click();
    Reporter.log("Login Succefully",true);	
	}

@AfterMethod
public void LogOut() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.id("logoutLink")).click();
	Reporter.log("LogOut Succefully",true);
}	

@AfterTest
public void AfterTest() {
	driver.close();
	Reporter.log("AfterTest Succefully",true);
}

@AfterSuite
public void DatabaseClose() {
	Reporter.log("Close Succefully",true);	
}
}
