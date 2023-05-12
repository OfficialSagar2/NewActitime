package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_by_indepedent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		Thread.sleep(3000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		
		String product=driver.findElement(By.xpath("(//span[.='Apple iPhone 14 (128 GB) - Yellow'])[1]/../../../../../../../div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[2]")).getText();
		System.out.println(product);
		
		
		driver.close();

	}

}
