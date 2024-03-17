package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptClick {

	public static void main(String[] args) {
		String url_given = "https://login.oracle.com/mysso/signon.jsp";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		WebElement windows64 = driver.findElement(By.linkText("jdk-11.0.21_windows-x64_bin.exe"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", windows64);
		windows64.click();
		WebElement disable = driver.findElement(By.linkText("Download jdk-11.0.21_windows-x64_bin.exe"));
		js.executeScript("arguments[0].click();", disable);
		String Current_url = driver.getCurrentUrl();
		if(url_given.equalsIgnoreCase(Current_url)) {
			System.out.println("Script is working");
			driver.close();
			
		} /// Socket exception is a very boring exception, it is just that internal issue is there.
		
		else {
			System.out.println("Lag gye");
		}

	}

}
