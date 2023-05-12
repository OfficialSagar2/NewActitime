package Automtn1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Pop_Up_NaukriApp {
	public static void main(String[] args) throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	driver.manage().window().maximize();	
	driver.get("https://www.naukri.com/");
	Thread.sleep(4000);
	driver.findElement(By.id("register_Layer")).click();
	
	driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']")).click();
	File f=new File("./Test Data/SP.pdf");
	String path = f.getAbsolutePath();
	Thread.sleep(4000);
	driver.findElement(By.id("file-upload")).sendKeys(path);

	}
}
