package exerciseselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestCase5 extends TestCase3{
	static WebElement d;

	public static WebDriver precondition5() throws InterruptedException {
		WebDriver driver = precondition3();
		Thread.sleep(2000);
		
		WebElement d = driver.findElement(By.id("signIn"));
		new Actions(driver).moveToElement(d).build().perform();
		return driver;
	}
	public static void main(String[] args) {
		try {
			precondition5();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
