package Automtn1;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Darg_n_Drop {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    }
	  public static void main(String[] args) throws InterruptedException, AWTException {	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();	
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Thread.sleep(3000);
		
		WebElement Drag_Drop1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement Drag_Drop2 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(Drag_Drop1,Drag_Drop2 ).perform();
		Thread.sleep(3000);
		driver.close();
}
}
