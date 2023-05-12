package Automtn1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Authentication_Pop_up {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth/");
}
}

//Authentication_Pop_up
// we cant move this pop up
// we cant inspect this pop up
// this pop up will be having username and password text field along with sign and cancel button 
// this pop up will be present below the address bar and at the center section of the page 

// test data 
// Url- https://the-internet.herokuapp.com/basic_auth
// username - admin
// pwd - admin

// solution 
// In order to handle authentication pop up, we need to enter username and password in the url itself
// Syntax : https://username : password@the-internet.herokuapp.com/basic_auth
//Example : https://admin : admin@the-internet.herokuapp.com/basic_auth