package Automtn1;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();	
		driver.get("https://www.bbc.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor J=(JavascriptExecutor)driver;   // Type casting
		J.executeScript("window,scrollBy(0,2000)"); 
		Thread.sleep(3000);
		
		J.executeScript("window,scrollBy(0,-1000)"); 
		driver.quit();
}
}