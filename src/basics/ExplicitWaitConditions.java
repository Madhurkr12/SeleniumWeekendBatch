package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConditions {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.shoppersstack.com/");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(44));
	WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("loginBtn")));
	login.click();
	WebElement create_account = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='MuiButton-label'])[2]")));
	create_account.click();
	
}
}
