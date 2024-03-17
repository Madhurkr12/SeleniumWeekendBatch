package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Find_Elements extends ClassForRemovingRepeat{

	public static void main(String[] args) throws InterruptedException {
		precondition();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> community_poll = driver.findElements(By.cssSelector("input[type='radio']"));
		for (WebElement web : community_poll) {
			web.click();
			Thread.sleep(2000);
		}
		

	}

}
