package basics;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Popup {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.agoda.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text() = 'No thanks']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//button[@data-element-name='prominent-app-download-floating-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-element-name='check-in-box']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-selenium-date='2024-03-23']")).click();
		Thread.sleep(2000);
		for(;;) {
			try {
				driver.findElement(By.xpath("//span[@data-selenium-date='2024-11-21']")).click();
				break;
			}
			catch (Exception e){
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
				
			}
			
		}
		

	}

}
