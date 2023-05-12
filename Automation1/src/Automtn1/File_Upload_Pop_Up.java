package Automtn1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Pop_Up {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/spawa/OneDrive/Desktop/fileUpload_pop_up.html");
		driver.findElement(By.id("d1")).sendKeys("C:\\Users\\spawa\\eclipse-workspace\\Automation\\Automation1\\Test Data\\SP.pdf");	
	}
}

