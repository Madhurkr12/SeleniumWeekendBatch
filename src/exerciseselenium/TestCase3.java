package exerciseselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class TestCase3 extends Testcase2{
		
		public static WebDriver precondition3()
		{
			WebDriver driver = precondition2();
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()= 'Create Account']")).click();
			//WebElement d = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()= 'Create Account']")));
			//d.click();
			
			///System.out.println("It should be working");x
			return driver;
		}
		public static void main(String[] args) {
		precondition3();
		}
		
}
