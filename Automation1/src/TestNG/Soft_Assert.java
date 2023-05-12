package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test
	public void LaunchBrowser() {
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();	
		driver.get("https://www.google.com/");
		
		String Expected_Title="Soogle";
		String Actual_Title=driver.getTitle();
		SoftAssert A=new SoftAssert();	
		A.assertEquals(Expected_Title, Actual_Title);
		driver.close();
		}
}
