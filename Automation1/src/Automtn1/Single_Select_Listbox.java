package Automtn1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_Listbox {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(3000);

WebElement day = driver.findElement(By.id("day"));
Select s=new Select(day);
s.selectByIndex(6);

WebElement month = driver.findElement(By.id("month"));
Select m=new Select(month);
m.selectByValue("5");

WebElement year = driver.findElement(By.id("year"));
Select y=new Select(year);
y.selectByVisibleText("2023");

Thread.sleep(5000);
driver.close();
}
}
