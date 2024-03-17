package Assertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertionsMethods {
	@Test
	public void dws() {
		
	
WebDriver driver = new ChromeDriver();
String expected_url = "https://demowebshop.tricentis.com/";
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://demowebshop.tricentis.com/");
String actual_result = driver.getCurrentUrl();
//assertEquals(expected_url, actual_result); // checks results is equals
//assertNotEquals(actual_result, expected_url); //check results is not equal
WebElement d = driver.findElement(By.id("pollanswers-1"));
d.click();
assertTrue(d.isSelected()); //the value would return true in case of selected and if we get true we would execute else in case of false it would stop the code.
//assertFalse(d.isSelected()); //the value would return true in case of selected and if we get false we would execute else in case of true it would stop the code.
System.out.println("The script is successful");
driver.close();


}
}