package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchUsingPom {
	@Test
	public void dws() {
		
	
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://demowebshop.tricentis.com/");
DWSHomepage data = new DWSHomepage(driver);
data.search_box.sendKeys("Nickle");
data.submit_cta.click();
driver.close();

}
}