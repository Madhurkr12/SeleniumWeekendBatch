package exerciseselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase6 {
	public static void main(String[] args) {
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
				driver.findElement(By.id("loginBtn")).click();
				driver.findElement(By.xpath("//span[text()='Create Account']")).click();
				WebElement new_element = driver.findElement(By.id("signIn"));
				
				if(new_element.isEnabled()) {
					System.out.println("The link is enabled");
				}
				else {
					System.out.println("The link is not enabled");
				}
			}
			else {
				System.out.println("The url is wrong");
		
	}
	
	
		}
		}
	
}
