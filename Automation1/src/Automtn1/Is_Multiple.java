package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_Multiple {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/spawa/OneDrive/Desktop/Hotel.html");
		WebElement menu = driver.findElement(By.id("hotelmenu"));
        Select s=new Select(menu);
       
        if(s.isMultiple()==true) {
        	System.out.println("Multiple selected"); 
        }
        else {
        	System.out.println("Single selected"); 
        }
          
        Thread.sleep(3000);
        driver.close();
}
}
