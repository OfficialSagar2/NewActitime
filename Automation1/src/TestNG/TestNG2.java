package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG2 {
	 @Test(priority = 3,invocationCount=3)
	  public void CustomerCreate(){	  
		  Reporter.log("Customer Created Succefully",true);
	  }
	 @Test(priority = 2)
	 public void CustomerEdit(){	  
		  Reporter.log("Customer Edited Succefully",true);
	  }
	 @Test(priority = 1)
	 public void CustomertDelete(){	  	  
		// Assert.fail(); // Intentionally fail the test script
		 Reporter.log("Customer Deleted Succefully",true); 
	  }
}