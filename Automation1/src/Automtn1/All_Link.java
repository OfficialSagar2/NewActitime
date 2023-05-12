package Automtn1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class All_Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		List<WebElement> Link = driver.findElements(By.xpath("//a"));    
		int count=Link.size();
		System.out.println(count);
		
		for (int i = 0; i < Link.size(); i++) {		
			String data = Link.get(i).getText();
			System.out.println(data);
		}	
        driver.close();
}
}
