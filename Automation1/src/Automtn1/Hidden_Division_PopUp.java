package Automtn1;

//Hidden division on calender pop up
// launch the browser
//maximize the browser 
//navigate to www.careinsurance.com application
//enter policynumber as 123 in policy number text field 
//Select the date as jan 2,1994
//enter contact number in number text field
//close the browser

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hidden_Division_PopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");	
		
		driver.findElement(By.name("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		
		WebElement Month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select M= new Select(Month);
		M.selectByValue("0");
		
		WebElement Year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select Y= new Select(Year);
		Y.selectByValue("1994");
		
		driver.findElement(By.linkText("2")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("1236789978");
		Thread.sleep(3000);				
	}
}

//Characterstics of pop-ups:
//we can not move this pop up
//we can inspect this pop up
//
//
//Solution:
//in order to handle hidden division pop up, we can use findElement or findElements method

