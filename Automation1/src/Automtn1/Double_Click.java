package Automtn1;
import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {
  static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    }
  public static void main(String[] args) throws InterruptedException, AWTException {	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	driver.manage().window().maximize();	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement D_Click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions act= new Actions(driver);
	act.doubleClick(D_Click).perform();
	Thread.sleep(3000);
			
	Alert a = driver.switchTo().alert();
	a.accept();
	Thread.sleep(3000);
	driver.close();
}
}
