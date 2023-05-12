package Automtn1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class_Notepad {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	
		Runtime.getRuntime().exec("Notepad");
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		r.keyRelease(KeyEvent.VK_SHIFT);
		
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_P);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_3);
	}
}
                          