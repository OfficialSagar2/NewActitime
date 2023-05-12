package Automtn1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google_Suggestion_List {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Chennai");
		Thread.sleep(5000);	
		List<WebElement> Lava = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		for (int i = 1; i < Lava.size(); i++) {
			String Suggestion =Lava.get(i).getText();
			System.out.println((i)+" "+Suggestion);
		}
	   driver.close();

	}

}
