package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Is_Selected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
			
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("remember")).click();
		boolean Selected = driver.findElement(By.name("remember")).isSelected();		
		
		if (Selected==true) {
	    System.out.println("checkbox is selected");
        } else {
	    System.out.println("checkbox is not selected");
        }    
		
		Thread.sleep(3000);
		driver.close();
	}

}
