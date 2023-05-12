package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Is_enabled {

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver1=new ChromeDriver();
			
		driver1.manage().window().maximize();
		
		driver1.get("https://www.facebook.com/");
		Thread.sleep(3000);	
		boolean Enabled = driver1.findElement(By.xpath("//button[@type='submit']")).isEnabled();    
		if (Enabled==true) {
	    System.out.println("login is enabled");
        } else {
	    System.out.println("login is not enabled");
        }    
		
		Thread.sleep(3000);
		driver1.close();
}

}
