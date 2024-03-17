package TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;
  @Parameters("browser")
	@Test
	public void navigate1(String brw) {
		if(brw.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.get("https://dir.indiamart.com/");
		}
		else if(brw.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			driver.get("https://dir.indiamart.com/");
		}
		else {
			driver = new FirefoxDriver();
			driver.get("https://dir.indiamart.com/");
		}
		
	}
}
