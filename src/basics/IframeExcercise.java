package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExcercise {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Madhur/Downloads/iframe.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text() = 'Google']")).click();
		driver.navigate().back();
		driver.switchTo().frame(0);
		driver.findElement(By.id("small-searchterms")).sendKeys("Pen");
		driver.findElement(By.cssSelector("[class='button-1 search-box-button']")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text() = 'Google']")).click();
	}

}
