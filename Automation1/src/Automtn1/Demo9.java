package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("ganesh");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("kale");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("9887654125");
		Thread.sleep(3000);
		driver.quit();

	}

}
