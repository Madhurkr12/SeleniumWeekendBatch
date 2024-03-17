package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement drive_1 = driver.findElement(By.cssSelector("a[data-group='men']"));
		Thread.sleep(1000);
		new Actions(driver).moveToElement(drive_1).build().perform();
		driver.findElement(By.cssSelector("a[data-reactid='37']")).click();
		
		

	}

}
