package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_class {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Robot rn =new Robot();
		rn.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rn.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rn.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rn.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rn.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rn.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rn.keyPress(KeyEvent.VK_M);
		rn.keyPress(KeyEvent.VK_A);
		rn.keyPress(KeyEvent.VK_T);
		Thread.sleep(1000);
		rn.keyPress(KeyEvent.VK_ENTER);
		rn.keyRelease(KeyEvent.VK_TAB);
		rn.keyRelease(KeyEvent.VK_ENTER);
	}

}
