package Automtn1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Suggestion_List {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("lava");
		Thread.sleep(5000);	
		List<WebElement> Lava = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		
		for (int i = 1; i < Lava.size(); i++) {
			String Suggestion =Lava.get(i).getText();
			System.out.println((i)+" "+Suggestion);
		}
	   driver.close();
	}
}
