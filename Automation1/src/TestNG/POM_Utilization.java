package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM_Utilization {

	@Test
	public void pom() throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");

	Login_Page lp=new Login_Page(driver);
	WebElement ele1 = lp.getUserbx();
	driver.navigate().refresh();
	ele1.sendKeys("admin");
	Thread.sleep(3000);
	
	WebElement ele2 = lp.getPwdbx();
	ele1.sendKeys("manager");
	Thread.sleep(3000);
	WebElement ele3 = lp.getLoginbox();
	ele1.click();
	
	}	
}
