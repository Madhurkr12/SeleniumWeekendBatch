package exerciseselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	WebDriver driver;
	public static WebDriver precondition1() {
		String given_url = "https://shoppersstack.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.navigate().to("https://shoppersstack.com/");
		if(driver.getCurrentUrl().isEmpty()) {                         // internet checking
			System.out.println("The URL is not vertified");
		}
		else{
			System.out.println("The URL is verified and internet is working fine");
			
			if(given_url.equalsIgnoreCase(driver.getCurrentUrl()))
			{
				System.out.println("The Login URL is correct");
			}
			else {
				System.out.println("The url is wrong");
	}}
		return driver;}

	public static void main(String[] args) {
		
		String given_url = "https://shoppersstack.com/user-signin";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://shoppersstack.com/");
		if(driver.getCurrentUrl().isEmpty()) {                         // internet checking
			System.out.println("The URL is not vertified");
		}
		else{
			System.out.println("The URL is verified and internet is working fine");
			driver.findElement(By.xpath("//button[@name='loginBtn']")).click();
			
			if(given_url.equalsIgnoreCase(driver.getCurrentUrl()))
			{
				System.out.println("The Login URL is correct");
			}
			else {
				System.out.println("The url is wrong");
			}
		}
		
	}

}
