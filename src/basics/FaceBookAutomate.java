package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAutomate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Madhur");
		driver.findElement(By.xpath("//input[@name=\'lastname\']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Maddy&890");
		WebElement sel_1 = driver.findElement(By.id("day"));
		Select Opt1 = new Select(sel_1);
		Opt1.selectByValue("10");
		Thread.sleep(1000);
		WebElement sel_2 = driver.findElement(By.id("month"));
		Select Opt2 = new Select(sel_2);
		Opt2.selectByValue("9");
		Thread.sleep(1000);
		WebElement sel_3 = driver.findElement(By.name("birthday_year"));
		Select Opt3 = new Select(sel_3);
		Opt3.selectByVisibleText("1998");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value = '2']")).click();
		driver.findElement(By.name("websubmit")).click();


	}

}
