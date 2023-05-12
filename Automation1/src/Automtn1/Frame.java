package Automtn1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();		
		driver.get("file:///C:/Users/spawa/OneDrive/Desktop/T1.html");
        driver.findElement(By.id("abc1")).sendKeys("sagar ");
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        driver.findElement(By.id("abc")).sendKeys("abc123 ");
        driver.switchTo().parentFrame();
        Thread.sleep(5000);
        driver.findElement(By.id("abc1")).sendKeys("pawar");
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        driver.findElement(By.id("abc")).sendKeys("def456");
	    Thread.sleep(5000);
	    driver.close();      
	}
}
