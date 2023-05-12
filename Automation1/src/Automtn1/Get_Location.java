package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Location {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		 int Location = driver.findElement(By.id("email")).getLocation().getX();
         System.out.println("x axis :" + Location +" pixel");
         
         int Location1 = driver.findElement(By.id("email")).getLocation().getY();
         System.out.println("y axis :" + Location1 +" pixel");
		
		 Thread.sleep(2000);
		 driver.close();
	}

}
