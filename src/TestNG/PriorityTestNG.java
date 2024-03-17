package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityTestNG {

	@Test(priority = 3)
	public void indiamart() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dir.indiamart.com/");
		Thread.sleep(2000);
		driver.close();
		Reporter.log("Indiamart", true);
		
	}
	@Test(priority = -1)
	public void redbus() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		driver.close();
		Reporter.log("Redbus", true);
		
	}
	@Test(priority = 2)
	public void indimart1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dir.indiamart.com/");
		driver.close();
		Reporter.log("Indiamart", true);
		
	}

	@Test(priority = 0)
	public void easemytrip() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.easemytrip.com/");
		driver.close();
		Reporter.log("easemytrip", true);
		
	}

		}

