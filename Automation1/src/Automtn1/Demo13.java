package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.actitime.com/");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();	
				
		Thread.sleep(3000);
		driver.quit();

	}

}
