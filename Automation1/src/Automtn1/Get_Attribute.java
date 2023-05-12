package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Attribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		String Attribute=driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).getAttribute("data-csa-c-content-id");
		System.out.println(Attribute);
		
		Thread.sleep(4000);
		driver.close();

	}

}
