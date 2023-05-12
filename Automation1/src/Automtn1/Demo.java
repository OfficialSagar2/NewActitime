package Automtn1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		//ChromeDriver driver=new ChromeDriver();
		
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver= new ChromeDriver(option);
		
			
		
	    driver.get("https://www.youtube.com/");
        driver.close();
        Thread.sleep(5000);
   
	}

}

