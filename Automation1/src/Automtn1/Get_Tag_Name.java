package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Tag_Name {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

ChromeOptions option =new ChromeOptions();
option.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(option);
		
driver.manage().window().maximize();
		
driver.get("https://www.zomato.com/");
String Tag = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).getTagName();
System.out.println("Tag:" + Tag );

Thread.sleep(2000);
driver.close();
	}
}
