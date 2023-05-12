package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG1 {
  @Test 
  public void g(){
	  
	  Reporter.log("sagar",true);
  }
  @Test 
  public void k(){
	  int a=1;
  Reporter.log("sagarp",a);;
	  
  }
}					 
