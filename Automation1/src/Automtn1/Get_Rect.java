package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Rect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		
		 int Height = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).getRect().getHeight();
         System.out.println("Height :" + Height +" pixel");
         
         int Width = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).getRect().getWidth();
         System.out.println("Width :" + Width +" pixel");
		
         int Xaxis = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).getRect().getX();
         System.out.println("x axis :" + Xaxis +" pixel");
         
         int Yaxis = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).getRect().getY();
         System.out.println("y axis :" + Yaxis +" pixel");
         
		 Thread.sleep(2000);
		 driver.close();
	}

}

