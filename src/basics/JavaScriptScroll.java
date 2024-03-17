package basics;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScroll {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.skillrary.com/");
			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,1200);"); //
//			js.executeScript("window.scrollBy(0,-1200);");
//			js.executeAsyncScript("window.scrollTo(0,1200);"); // 
//			js.executeAsyncScript("window.scrollTo(0,-1200);");
			
			WebElement target = driver.findElement(By.xpath("//a[text()='COMMUNICATE WITH PEOPLE']"));
			js.executeScript("arguments[0].scrollIntoView(false);", target); //when false it would make the target at the bottom and navigate to the lower page till webelement is visible at bottom  
			//js.executeScript("argument[0].scrollIntoView(true);",target); //when true it would make the target at the upper and navigate to the upper page till webelement is visible at top 
			
			

	}

}
