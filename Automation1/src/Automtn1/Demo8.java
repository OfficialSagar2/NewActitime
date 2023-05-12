package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("sagar");
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("ganesh");
		Thread.sleep(3000);
		
		driver.findElement(By.name("lastname")).sendKeys("pawar");
	
		driver.findElement(By.name("reg_email__")).sendKeys("9887654125");
		Thread.sleep(3000);
		driver.quit();
		
		
		//driver.findElement(By.name("pass")).sendKeys("abcd2@");
		
    	//driver.findElement(By.name("login")).click();

	}

}
