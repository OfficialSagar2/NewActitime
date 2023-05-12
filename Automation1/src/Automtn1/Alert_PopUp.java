package Automtn1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.navigate().to("https://demo.actitime.com/");	
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");		
		driver.findElement(By.id("loginButton")).click();	
		Thread.sleep(3000);
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
		
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		//Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("sagar");

		driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		String print =a.getText();
		System.out.println(print);
		//a.accept();
		a.dismiss();
				
	}

}
