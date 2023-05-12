package Automtn1;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//was to close only child browser 
public class All_Child_Window_Pop_Up2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();		
		driver.get("https://demoqa.com/browser-windows");
		String Pwin=driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(3000);
	    driver.findElement(By.id("windowButton")).click();	
		Thread.sleep(3000);
		Set<String> allwin = driver.getWindowHandles();
		//System.out.println(allwin);
		
		for (String win : allwin) {
			driver.switchTo().window(win);
			if(!Pwin.equals(win)) 
		  { 
			Thread.sleep(3000);
			driver.close();
			}
}
}
}