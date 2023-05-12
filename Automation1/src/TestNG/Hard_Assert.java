package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hard_Assert {
	
	@Test
	public void LaunchBrowser() {
		WebDriver driver = new ChromeDriver();
		Reporter.log("Launched Browser Succefully",true);		
		driver.manage().window().maximize();	
		driver.get("https://www.google.com/");
		String Expected_Title="Google";
		String Actual_Title=driver.getTitle();
		
		Assert.assertEquals(Expected_Title,Actual_Title);
		driver.close();
		}
}
