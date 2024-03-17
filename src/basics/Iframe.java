package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.dream11.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.switchTo().frame(0);   // By frame,, is starts from 0
		//driver.switchTo().frame("send-sms-iframe"); this is for string name
	//driver.findElement(By.cssSelector("[placeholder='Enter Mobile Number']")).sendKeys("9090000099");
		
		 WebElement d = driver.findElement(By.cssSelector("[id = 'send-sms-iframe']"));
		 driver.switchTo().frame(d);    // this is for frame webelement
		 driver.findElement(By.cssSelector("[placeholder='Enter Mobile Number']")).sendKeys("9090000099");
//		 driver.switchTo().defaultContent(); // this is one way of navigating back to the previous frame
//		 driver.findElement(By.cssSelector("[id='hamburger']")).click();
		
		driver.switchTo().parentFrame();   // this is another way of navigating to the adjacent parent just one frame to other immendiate parent
		driver.findElement(By.cssSelector("[id='hamburger']")).click();
		
	}

}
