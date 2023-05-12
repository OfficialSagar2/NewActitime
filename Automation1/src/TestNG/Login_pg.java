package TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_pg {

	//declaration
	@FindBy(id="username")
	private WebElement userbx;
	
	@FindBy(name="pwd")
	private WebElement pwdbx;
	
	@FindBy(xpath="//div[.='Login']")
	private WebElement Loginbox;
}
