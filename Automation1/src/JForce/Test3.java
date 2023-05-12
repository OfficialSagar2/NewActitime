package JForce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");	
		
		String Expected_URL="https://www.saucedemo.com/";
		String Actual_URL = driver.getCurrentUrl();
		System.out.println(Actual_URL);
		
		if (Expected_URL.equals(Actual_URL)) {
			System.out.println("Url validation is right");
		} else {
			System.out.println("Url validation is not right");
		} 
	}

}
