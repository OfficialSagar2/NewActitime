package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Is_displayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

	
		 boolean t = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		
		 if (t==true) {
			System.out.println("logo is displayed");
			 
		} else {
			System.out.println("logo is not displayed");
		}
		 
		 Thread.sleep(3000);
		 driver.close();
}

}
