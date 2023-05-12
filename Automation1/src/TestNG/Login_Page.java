
package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	//declaration
	@FindBy(id="username")
	private WebElement userbx;
	
	
	@FindBy(name="pwd")
	private WebElement pwdbx;
	
	@FindBy(xpath="//div[.='Login']")
	private WebElement Loginbox;
//	
	
	//initialization
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	//utilization
	public WebElement getUserbx() {
		return userbx;
	}
	public WebElement getPwdbx() {
		return pwdbx;
	}
	public WebElement getLoginbox() {
		return Loginbox;
	}

}
