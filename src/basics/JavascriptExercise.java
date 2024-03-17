package basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavascriptExercise {

	public static void main(String[] args) throws InterruptedException {
		String given_url = "https://demoapp.skillrary.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.skillrary.com/");
		WebElement D = driver.findElement(By.xpath("//span[text()='GEARS']"));
		new Actions(driver).moveToElement(D).build().perform();
		driver.findElement(By.xpath("//a[text()=' SkillRary Demo APP']")).click();
		
		Set<String> de = driver.getWindowHandles();
		System.out.println(de);
		for (String str : de) {
			driver.switchTo().window(str);
			if (driver.getCurrentUrl().equalsIgnoreCase(given_url)) {
				System.out.println("We are in the new website");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement given = driver.findElement(By.xpath("(//div[@class='input-group'])[2]/input"));
			if (given.isDisplayed()) {
				js.executeScript("arguments[0].value='newspaper'", given);
			}
			else {
                System.out.println("Input element is not displayed.");
            }
			}
		}
	}
}
