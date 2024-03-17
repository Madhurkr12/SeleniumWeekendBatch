package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardClickPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> newLinks = driver.findElements(By.xpath("//div[@class = 'header-links']/ul/li/a"));
		Actions act = new Actions(driver);
		for (WebElement webs : newLinks) {
			act.keyDown(Keys.SHIFT).click(webs).build().perform();
			Thread.sleep(1000);
		}
		driver.quit();
	}

}
