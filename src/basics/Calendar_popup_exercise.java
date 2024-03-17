package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_popup_exercise {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("register_Layer")).click();
		Thread.sleep(1200);
		driver.findElement(By.className("textWrap")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='uploadAction']")).sendKeys("C:\\Users\\Madhur\\Downloads\\Slip.pdf");
	}

}
