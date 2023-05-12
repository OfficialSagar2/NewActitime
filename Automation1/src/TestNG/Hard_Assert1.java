package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hard_Assert1 {
	public WebDriver driver;
	@BeforeSuite
		public void DatabaseConnection() {
			Reporter.log("Database Connection Succefully",true);
		}

	@BeforeTest
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		Reporter.log("Launched Browser Succefully",true);		
		driver.manage().window().maximize();	
		driver.get("https://www.google.com/");
		String Expected_Title="Google";
		String Actual_Title=driver.getTitle();
		Assert.assertEquals(Expected_Title,Actual_Title);
		
		}	

//	@BeforeClass
//	public void BeforeClass() {
//		Reporter.log("Before Class Succefully",true);
//		
//		
//		}
		
//	@BeforeMethod
//	public void Login() throws InterruptedException {
//		Reporter.log("Login Succefully",true);		
//		driver.findElement(By.name("username")).sendKeys("admin");     
//	    driver.findElement(By.name("pwd")).sendKeys("manager");  
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//div[.='Login ']")).click();
//		}
//
//	@Test
//	public void Test() {
//		Reporter.log("Test Succefully",true);
//	}
//
//	@AfterMethod
//	public void LogOut() throws InterruptedException {
//		Reporter.log("LogOut Succefully",true);
//		Thread.sleep(2000);
//		driver.findElement(By.id("logoutLink")).click();
//	}	

	//@AfterClass
	//public void CloseBrowser() {
//		Reporter.log("CloseBrowser Succefully",true);
	//	
	//}

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
