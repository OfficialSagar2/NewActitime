package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Stale_Element_Reference_Exception {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		
	@Test
	public void launch() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://demo.actitime.com/");
		
		WebElement user = driver.findElement(By.id("username"));	
		driver.navigate().refresh();
		user.sendKeys("abcd");	
		Thread.sleep(5000);
		
		
}
}
