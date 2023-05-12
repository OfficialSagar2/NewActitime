package JForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();

		driver.get("http://www.saucedemo.com/");		
//		driver.findElement(By.id("details-button")).click();
//		driver.findElement(By.id("proceed-link")).click();
//		Thread.sleep(2000);	

// Positive Scenario	
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@data-test='product_sort_container']")).click();
		driver.findElement(By.xpath("//option[@value='az']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.id("item_5_img_link")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();	
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();		
		Thread.sleep(1000);
		driver.findElement(By.name("checkout")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sagar");	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Pawar");	
		Thread.sleep(1000);
		driver.findElement(By.id("postal-code")).sendKeys("400708");	
		Thread.sleep(1000);
		driver.findElement(By.name("continue")).click();	
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();		
		Thread.sleep(1000);
		driver.findElement(By.id("back-to-products")).click();		
		
		String Expected_URL="https://www.saucedemo.com";
		String Actual_URL = driver.getCurrentUrl();
		//System.out.println(Actual_URL);
		if (Expected_URL.equals(Actual_URL)) {
			System.out.println("Url validation is right");
		} else {
			System.out.println("Url validation is not right");
		} 
		
		String Expected_Title="Swag Labs";
		String Actual_Title = driver.getTitle();
		System.out.println(Actual_Title);
		if (Expected_Title.equals(Actual_Title)) {
			System.out.println("Title validation is right");
		} else {
			System.out.println("Title validation is not right");
		} 
			
		boolean Enabled = driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).isEnabled();    
		if (Enabled==true) {
	    System.out.println("Add to cart is enabled");
        } else {
	    System.out.println("Add to cart is not enabled");
        }    
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();	
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();	

		
// Positive Scenario
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("problem_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
// Negative Scenario					
        driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();	
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
		driver.findElement(By.id("react-burger-menu-btn")).click();	
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
			

	}

}
