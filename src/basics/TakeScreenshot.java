package basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		TakesScreenshot sc = (TakesScreenshot) driver; // downcasting as the TakesScreenshot
		File from = sc.getScreenshotAs(OutputType.FILE);  /// taking screenshot of webpage
		File to = new File("C:\\Users\\Madhur\\Selenium Screenshots\\digitalDownload.jpeg");
		FileHandler.copy(from, to);
		
	}

}
