package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMoveToElement {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dir.indiamart.com/");
	Thread.sleep(10000);
	WebElement drive_1 = driver.findElement(By.id("user_sign_in"));
	Thread.sleep(1000);
	new Actions(driver).moveToElement(drive_1).build().perform();

	}

}
