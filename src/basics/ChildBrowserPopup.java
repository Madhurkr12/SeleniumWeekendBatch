package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
public static void main(String[] args) throws InterruptedException {
	String given_data = "https://www.facebook.com/nopCommerce";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String parent = driver.getWindowHandle();
	driver.findElement(By.xpath("//a[text() = 'Twitter']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text() = 'Facebook']")).click();
	Thread.sleep(1000);
	Set<String> childs = driver.getWindowHandles();
	System.out.println(childs);
	for (String str : childs) {
		driver.switchTo().window(str);
		Thread.sleep(1000);
		String current_data = driver.getCurrentUrl();
		if(given_data.equalsIgnoreCase(current_data) ) {
			Thread.sleep(3000);
			driver.findElement(By.name("email")).sendKeys("HowAreYou@gmail.com");// it is working but not doing rn as id and name is being changed, trty using xpath.
			
		}
		Thread.sleep(1000);
	}
	
}
}
