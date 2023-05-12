package Automtn1;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_Listbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/spawa/OneDrive/Desktop/Hotel.html");
		
		WebElement menu = driver.findElement(By.id("hotelmenu"));
        Select s=new Select(menu);
        Thread.sleep(3000);
        s.selectByIndex(0);
        
        Thread.sleep(3000);
        s.selectByValue("V1");
        Thread.sleep(3000);
        s.deselectByValue("V1");
        
        Thread.sleep(3000);
        s.selectByVisibleText("Poha");
        Thread.sleep(3000);
        s.deselectByVisibleText("Poha");
        
        Thread.sleep(6000);
        driver.close();

	}

}
