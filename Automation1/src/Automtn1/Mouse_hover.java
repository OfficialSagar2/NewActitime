package Automtn1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();	
		driver.get("https://www.vtiger.com/");
		Thread.sleep(4000);
     
		WebElement dropdown = driver.findElement(By.partialLinkText("Resources"));	
		Actions act= new Actions(driver);
		act.moveToElement(dropdown).perform();
		Thread.sleep(4000);
		
		driver.findElement(By.partialLinkText("Contact Us")).click();
		
		String number= driver.findElement(By.xpath("(//p[contains(.,'+91 80 23501152')]")).getText();
		System.out.println(number);
		Thread.sleep(4000);
		driver.close();		
	}
}
