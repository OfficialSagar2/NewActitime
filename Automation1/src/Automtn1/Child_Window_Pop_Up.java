package Automtn1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Window_Pop_Up {
    static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {		
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String handle = driver.getWindowHandle();
	System.out.println(handle);
	driver.close();
	}
}
