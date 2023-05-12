package Screenshot;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Screenshot.BaseClass;
import Screenshot.Listener_Implementation;

@Listeners(Listener_Implementation.class)
public class Customer_Create extends BaseClass{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test
	public void Customer() {
		Reporter.log("cutomer created",true);
		Assert.fail();
	}
	
	@Test
	public void Customer1() {
		Reporter.log("cutomer created",true);
		Assert.fail();
	}
}
