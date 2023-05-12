package Automtn1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_All_Selecteced_Option {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
        s.selectByVisibleText("Poha");
        
       // String text = s.getFirstSelectedOption().getText();
       List<WebElement> text1 = s.getAllSelectedOptions();
       for (int i = 0; i < text1.size(); i++) {
    	   String option = text1.get(i).getText();
    	   System.out.println(option);
		
	}
                    
        Thread.sleep(6000);
        driver.close();

	}

}
