package Automtn1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone13");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
//		List<WebElement> product = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
//		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
//		int c=product.size();
//		for (int i = 0; i < c; i++) {
//			
//			String name=product.get(i).getText();	
//			String price1=price.get(i).getText();
//			System.out.print(name +"  ");
//			System.out.println(" "+price1);
//		
		driver.findElement(By.xpath("//img[@class='_396cs4']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		Thread.sleep(3000);
		driver.close();
		}
}
