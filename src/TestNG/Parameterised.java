package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterised {
 @Parameters({"url", "url1"})
	@Test
	public void navigate(String durl, String durl1) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(durl);
		driver.navigate().to(durl1);
		driver.quit();
	}
 @Parameters({"url", "url1"})
	@Test
	public void navigate1(String durl, String durl1) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(durl);
		driver.navigate().to(durl1);
		driver.quit();
	
	}
 @Parameters({"url", "url1"})
 @Test
	public void navigate2(String durl, String durl1) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(durl);
		driver.navigate().to(durl1);
		driver.quit();
		
	}

}
