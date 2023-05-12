 package Automtn1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allerin_Child_window_Pop_Up {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();		
		driver.get("https://www.jotform.com/?utm_source=formquota-new-guest&utm_term=over-quota-upload&utm_content=41582375744966&utm_campaign=form_quota_new");
		Thread.sleep(3000);
		String Pwin=driver.getWindowHandle();
		
		driver.findElement(By.name("google-homepage_homepage_2021")).click();
		Thread.sleep(2000);
			
		Set<String> allwin = driver.getWindowHandles();
		
		//System.out.println(allwin);
		for (String win : allwin) {
			driver.switchTo().window(win);
			if(!Pwin.equals(win)) 
			  { 
				Thread.sleep(3000);
				driver.close();
			  }
			Thread.sleep(7000);
			driver.close();
		}			
    }
}
