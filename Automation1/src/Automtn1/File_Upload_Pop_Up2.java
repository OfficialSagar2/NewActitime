package Automtn1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Pop_Up2 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();	
		driver.get("https://www.foundit.in/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(.,'Upload Resume')])[5]")).click();
		File f=new File("./Test Data/SP.pdf");
		String path = f.getAbsolutePath();
		Thread.sleep(4000);
		driver.findElement(By.id("file-upload")).sendKeys(path);
		Thread.sleep(4000);
		driver.close();
	}

}
