package exerciseselenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestLink {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
	driver.get("http://testlink.intermesh.net/login.php");
	driver.findElement(By.id("tl_login")).sendKeys("madhur.kumar@indiamart.com");
	driver.findElement(By.id("tl_password")).sendKeys("123456");
	driver.findElement(By.cssSelector("[value='Log in']")).click();
	Thread.sleep(5000);
//	WebElement element = driver.findElement(By.xpath("//select[@name='testproject']"));
//	Select s=new Select(element);
//	s.selectByIndex(4);
	
}
}
