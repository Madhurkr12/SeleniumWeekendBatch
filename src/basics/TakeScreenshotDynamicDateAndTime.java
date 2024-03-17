package basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotDynamicDateAndTime {

	public static void main(String[] args) throws IOException {
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(":", "-");
		System.out.println(date + "   " +time);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		TakesScreenshot sc = (TakesScreenshot) driver;
		File from = sc.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\Madhur\\Selenium Screenshots\\Screen"+time+".png");
		FileHandler.copy(from, to);
		

	}

}
