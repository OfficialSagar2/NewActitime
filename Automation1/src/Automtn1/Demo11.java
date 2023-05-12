package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo11 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='Order Online']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='https://b.zmtcdn.com/data/o2_assets/8dc39742916ddc369ebeb91928391b931632716660.png']")).click();
		Thread.sleep(5000);
		
       driver.quit();
	}

}
