package basics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
 public static void main(String[] args) {
	
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");
	 Actions act = new Actions(driver);
//	 act.keyDown(Keys.TAB).build().perform();  //add sleep
//	 act.keyDown(Keys.TAB).build().perform();
//	 act.keyDown(Keys.ENTER).build().perform();
	 
	 act.keyDown(Keys.TAB).keyDown(Keys.TAB).keyDown(Keys.ENTER).build().perform(); //easy way
	 
//	 act.keyUp(Keys.TAB).build().perform();
//	 act.keyUp(Keys.TAB).build().perform();
//	 act.keyUp(Keys.ENTER).build().perform();
	 
	 
	 act.keyUp(Keys.TAB).keyUp(Keys.TAB).keyUp(Keys.ENTER).build().perform();
}
}
