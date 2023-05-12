package Automtn1;

//write script to get the url of netflix application nd print on the console

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {
public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver= new ChromeDriver(option);
		
		
	    driver.get("https://www.netflix.com/in/");  // for navigate/ reach the destination 
	    String url = driver.getCurrentUrl();   //  get n copy url m store in tnhe variable 
	    System.out.println(url);	      	    // for printing url in console
	    Thread.sleep(5000);
	    
	    driver.close();
}}