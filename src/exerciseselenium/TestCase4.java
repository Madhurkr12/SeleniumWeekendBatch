package exerciseselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase4 extends TestCase3 {

	public static WebDriver precondition4() throws InterruptedException 
	{
	WebDriver driver = precondition3();
	Thread.sleep(2000);
	driver.findElement(By.id("signIn")).click();
	
	return driver;
	}
	public static void main(String[] args) {
		
		try {
			precondition4();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
