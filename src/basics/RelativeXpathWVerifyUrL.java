package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathWVerifyUrL {

	public static void main(String[] args) throws InterruptedException {
		String url_stored ="https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String current_url = driver.getCurrentUrl();
		if (url_stored.equalsIgnoreCase(current_url)) {
			System.out.println("The webdriver is okay");
		}
		else {
			System.out.println("Thw webdriver is wrong");
		}
		
		List<WebElement> link = driver.findElements(By.xpath("//div[@class = 'header-menu']/ul[1]/li"));
		
		for(WebElement web : link) {
	    	web.click();
	    	Thread.sleep(2000);
	    	driver.navigate().back();
	    }
	}

}
