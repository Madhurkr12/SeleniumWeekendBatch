package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String  m = "Madhur";
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert at = driver.switchTo().alert();
		Thread.sleep(1000);

		at.accept();
		driver.findElement(By.xpath("//a[text()= 'Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class ='btn btn-primary']")).click();
		Thread.sleep(1000);
		Alert at1 = driver.switchTo().alert();
		Thread.sleep(1000);
		at1.accept();
		
		driver.findElement(By.xpath("//a[text()= 'Alert with Textbox ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(1000);
		Alert at2 = driver.switchTo().alert();
		at2.getText();
		at2.sendKeys(m);
		at2.accept();
		String g = driver.findElement(By.id("demo1")).getText();
		if(g.contains(m)) {
			System.out.println("the text is okay");
		}
		else {
			System.out.println("Text is wrong");
		}
			driver.quit();

	}

}
