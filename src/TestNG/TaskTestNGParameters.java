package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TaskTestNGParameters {
	
@Test(dataProvider = "Login")
public void meth1(String email, String password) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.cssSelector("[class='ico-login']")).click();
	driver.findElement(By.cssSelector("[name='Email']")).sendKeys(email);
	driver.findElement(By.cssSelector("[name='Password']")).sendKeys(password);
	driver.findElement(By.cssSelector("[value='Log in']")).click();
	driver.close();
	
}
	
	@DataProvider(name = "Login")
	public Object[][] sender(){
		Object[][] obj = new Object[2][2];
		obj[0][0] = "admin01@gmail.com";
		obj[0][1] = "admin01";
		obj[1][0] = "admin01@gmail.com";
		obj[1][1] = "admin01";
		return obj;
		
		
	}
}
