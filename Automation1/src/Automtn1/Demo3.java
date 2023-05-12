package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/spawa/OneDrive/Desktop/Demo.html");
		
		driver.findElement(By.id("shaadi")).click();
		
	}

}
