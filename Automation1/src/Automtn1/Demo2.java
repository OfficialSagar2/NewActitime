package Automtn1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo2 {
public static void main(String[] args) throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver= new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
	    driver.get("https://www.instagram.com/");  // for navigate/ reach the destination 
	    String url = driver.getCurrentUrl();       // get n copy url m store in the variable 	  
	    System.out.println(url);	                // for printing url in console
	  
	    String url1 = driver.getTitle();
	    System.out.println(url1);    
	    Thread.sleep(5000); 
	    
	    driver.close();
}}

