package Automtn1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.bbc.com/");
		Thread.sleep(3000);
		List<WebElement> News = driver.findElements(By.xpath("//a[@class='media__link']"));
		
		for (int i = 0; i<=5; i++) {		
		String name=News.get(i).getText();	
    	System.out.println(i+1 +". "+ name);
    	}	
		Thread.sleep(3000);
		driver.close();
	}
}
