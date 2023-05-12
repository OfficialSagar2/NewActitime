package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screenshot {

	@Test 
	public void Screenshots() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(3000);
		
		TakesScreenshot Screen= (TakesScreenshot) driver ;	
		File img = Screen.getScreenshotAs(OutputType.FILE);		
		File F=new File("./Screenshot/ss.png");		
		Files.copy(img , F);
	}

} 
