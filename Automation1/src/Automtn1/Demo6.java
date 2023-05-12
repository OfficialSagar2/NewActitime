package Automtn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("natu natu");
		
    	driver.findElement(By.id("search-icon-legacy")).click();
    	
    	
    	driver.findElement(By.xpath("<yt-formatted-string class=\"style-scope ytd-video-renderer\" aria-label=\"Naacho Naacho (Full Video) RRR - NTR, Ram Charan | M M Kreem | SS Rajamouli | Vishal Mishra &amp; Rahul by T-Series 11 months ago 4 minutes, 35 seconds 281,231,555 views\">Naacho Naacho (Full Video) RRR - NTR, Ram Charan | M M Kreem | SS Rajamouli | Vishal Mishra &amp; Rahul</yt-formatted-string>"));
	}

}
