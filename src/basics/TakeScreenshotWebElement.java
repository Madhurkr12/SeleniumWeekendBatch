package basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotWebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		TakesScreenshot TS = (TakesScreenshot) driver;
		WebElement Electronic = driver.findElement(By.xpath("//a[contains(text() , 'Electronics')]"));
		File from = Electronic.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\Madhur\\Selenium Screenshots\\Electronic.png");
		FileHandler.copy(from, to);
		

	}

}
