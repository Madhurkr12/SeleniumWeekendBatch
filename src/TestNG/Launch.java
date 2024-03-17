package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch {
@Test
public void indiamart() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://dir.indiamart.com/");
	driver.close();
	Reporter.log("Indiamart", true);
	
}
@Test
public void redbus() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.redbus.in/");
	driver.close();
	Reporter.log("Redbus", true);
	
}
@Test
public void indimart1() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://dir.indiamart.com/");
	driver.close();
	Reporter.log("Hi hello", true);
	
}

@Test
public void easemytrip() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.easemytrip.com/");
	driver.close();
	Reporter.log("easemytrip", true);
	
}

	}
