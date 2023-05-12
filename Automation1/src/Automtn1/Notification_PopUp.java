package Automtn1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//was to handle notification pop up
public class Notification_PopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");	
		
		Thread.sleep(3000);
		driver.close();
	}
}
//Notification pop-up

// Characterstics of Notification pop-up
// we cant move this pop up
// we cant inspect this pop up
// This pop up will be having allow and block button 
// This pop up will be present below the address bar and at the front section of the page

// Solution:
// In order to handle notification pop up, we need to creat object of chromeoptions class
// ChromeOptions option = new ChromeOptions();