package Automtn1;

//was to close all the browser without using quit() 
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Child_Window_Pop_Up {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();		
		driver.get("https://demoqa.com/browser-windows");
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
			System.out.println(win);
			driver.switchTo().window(win);
			//driver.close();
		}
	}
}
