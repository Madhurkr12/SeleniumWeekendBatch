package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		Actions acts= new Actions(driver);
		WebElement click1 = driver.findElement(By.xpath("//button[text() = 'Double-Click Me To See Alert']"));
		Thread.sleep(1000);
		acts.doubleClick(click1).build().perform();

	}

}
