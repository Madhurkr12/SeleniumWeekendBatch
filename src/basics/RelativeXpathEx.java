package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id  ='FirstName']")).sendKeys("Madhur");
		driver.findElement(By.xpath("//input[@id  ='LastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id  ='Email']")).sendKeys("mk2334@gmail.com");
		driver.findElement(By.xpath("//input[@id  ='Password']")).sendKeys("mk233@uuu");
		driver.findElement(By.xpath("//input[@id  ='ConfirmPassword']")).sendKeys("mk233@uuu");
		driver.findElement(By.xpath("//input[@id  ='register-button']")).click();
		

	}

}
