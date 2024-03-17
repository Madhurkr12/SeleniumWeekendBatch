package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
//	WebElement search_field = driver.findElement(By.tagName("input"));
//	search_field.click();
	driver.findElement(By.className("ico-login")).click();
	driver.close();
			

	}

}
