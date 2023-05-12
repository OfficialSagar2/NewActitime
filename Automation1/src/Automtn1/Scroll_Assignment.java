package Automtn1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Assignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();	
		driver.get("https://www.bbc.com/");
		Thread.sleep(3000);
		
		WebElement planet = driver.findElement(By.xpath("//span[text()='Future Planet']"));
		int location = planet.getLocation().getY();
		
		JavascriptExecutor J=(JavascriptExecutor)driver;   // Type casting
		J.executeScript("window,scrollBy(0,"+location+")"); 
		Thread.sleep(3000);		
		driver.quit();
	}
}
