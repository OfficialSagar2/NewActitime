package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("oneplus 10r");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//div[.='OnePlus 10R (Forest Green, 256 GB)']")).getText();
		System.out.println(text);
		
		String text1 = driver.findElement(By.xpath("//div[.='₹31,950']")).getText();
		System.out.println(text1);
		
		Thread.sleep(3000);
		//OnePlus 10R (Forest Green, 256 GB)
		

	}

}
