package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PomCallingHomepage {
	@Test
	public void dws() {
		
	
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://demowebshop.tricentis.com/");
POMexcerciseHomepage data = new POMexcerciseHomepage(driver);
data.books.click();

data.Apparel_Shoes.click();





}
	}
