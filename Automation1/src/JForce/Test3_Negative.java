package JForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3_Negative {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Positive Scenario	
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("performance_glitch_user");
				Thread.sleep(1000);
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				Thread.sleep(1000);
				driver.findElement(By.name("login-button")).click();
				Thread.sleep(2000);
				
		// Negative Scenario	
				driver.findElement(By.id("item_3_img_link")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();	
				Thread.sleep(2000);
				driver.findElement(By.className("shopping_cart_link")).click();		
				Thread.sleep(1000);
				driver.findElement(By.name("checkout")).click();	
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("sagar");	
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("sawant");	
				Thread.sleep(1000);
				driver.findElement(By.id("postal-code")).sendKeys("400709");	
				Thread.sleep(1000);
				driver.findElement(By.name("continue")).click();	
				Thread.sleep(2000);
				driver.findElement(By.id("finish")).click();		
				Thread.sleep(1000);
				driver.findElement(By.id("back-to-products")).click();	
				Thread.sleep(2000);
				driver.findElement(By.id("react-burger-menu-btn")).click();	
				Thread.sleep(2000);
				driver.findElement(By.linkText("Logout")).click();
				
				// Negative Scenario
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("locked_out_user");
				Thread.sleep(1000);
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				Thread.sleep(1000);
				driver.findElement(By.name("login-button")).click();
				Thread.sleep(2000);		
	}

}
