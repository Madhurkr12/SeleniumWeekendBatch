package basics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionClassSendKeys {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			WebElement Web1 = driver.findElement(By.id("small-searchterms"));
			Actions act = new Actions(driver);
			act.moveToElement(Web1).click().sendKeys("Shirts").build().perform();
			act.keyDown(Keys.TAB).keyDown(Keys.ENTER).build().perform();
	
		
		
		}
		}