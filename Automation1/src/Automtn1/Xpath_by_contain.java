package Automtn1;

// write a script to automate the amazon

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_by_contain {
	
	public static void main(String[] args) throws InterruptedException {	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s22 ultra");
		Thread.sleep(3000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		
		String product=driver.findElement(By.xpath("(//span[contains(.,'Samsung Galaxy S22 5G (Phantom Black')])[2]")).getText();
		System.out.println(product);
		
		driver.close();

	}

}
