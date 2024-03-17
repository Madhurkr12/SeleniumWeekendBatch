package TestNG;
package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	
public class HomeWork {
	@Parameters("url")
	@Test
	public void meth1(String url1, String url2, String url3, String url4, String url5, String url6, String url7) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url1);
		driver.findElement(By.cssSelector(url2)).click();//[class='ico-login']
		driver.findElement(By.cssSelector(url3)).sendKeys(url4); //[name='Email'] , "admin01@gmail.com"
		driver.findElement(By.cssSelector(url5)).sendKeys(url6); //"[name='Password']", "admin01"
		driver.findElement(By.cssSelector(url7)).click();//"admin01"    Ghar pr kro using parameters
		driver.close();
		
	}
	}

}
