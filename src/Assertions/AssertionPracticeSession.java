package Assertions;

import static org.testng.Assert.assertEquals;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPracticeSession {
	@Test
	public void dws() {
WebDriver driver = new ChromeDriver();
String expected_url = "https://demowebshop.tricentis.com/";
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://demowebshop.tricentis.com/");
String actual_result = driver.getCurrentUrl();
assertEquals(expected_url, actual_result);
WebElement d = driver.findElement(By.id("small-searchterms"));
d.click();
SoftAssert sa = new SoftAssert();
sa.assertTrue(d.isEnabled(), "The search bar is functional");
d.sendKeys("shoes");
WebElement e = driver.findElement(By.cssSelector("[class='button-1 search-box-button']"));
sa.assertTrue(e.isEnabled(),"the submit buttom is working");
e.click();
sa.assertAll();
driver.close();



}
}