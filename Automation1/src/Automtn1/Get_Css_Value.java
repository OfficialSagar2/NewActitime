package Automtn1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Css_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		String Color = driver.findElement(By.id("nav-logo-sprites")).getCssValue("color");    
	    System.out.println(Color);  
	    driver.close();

}
}
