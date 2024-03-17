package basics;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {
	private static WebDriver driver;
	
	public static void precondition(){
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
}
	public static void currenturl() {
	String url = driver.getCurrentUrl();
	}
	
	public static Object internetconnection() {
	driver.navigate().to("https://www.google.com/");
		return true;
	}
}
