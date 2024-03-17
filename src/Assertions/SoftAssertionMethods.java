package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionMethods {
		@Test
		public void dws() {
	WebDriver driver = new ChromeDriver();
	String expected_url = "https://demowebshop.tricentis.com/";
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String actual_result = driver.getCurrentUrl();
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(expected_url, actual_result, "its not matching");
	System.out.println("The script is running");
	sa.assertAll();
	sa.assertEquals(actual_result, expected_url);
	
	}

}
