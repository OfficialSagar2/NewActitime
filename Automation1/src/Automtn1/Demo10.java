package Automtn1;

// write script to username n password in actitime application	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.actitime.com/");
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
				
		Thread.sleep(5000);
		driver.quit();

	}

}
