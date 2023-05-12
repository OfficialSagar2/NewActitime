package Automtn1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_Options {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/spawa/OneDrive/Desktop/Hotel.html");
		WebElement menu = driver.findElement(By.id("hotelmenu"));
        Select s=new Select(menu);
       
       List<WebElement> text = s.getOptions();
       for (int i = 0; i < text.size(); i++) {
    	   String option = text.get(i).getText();
    	   System.out.println(option);	
	   }                 
        Thread.sleep(3000);
        driver.close();

	}
}
