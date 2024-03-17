package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealtiveXpathEXcercise {

	public static void main(String[] args) throws InterruptedException {
		String url_stored ="https://demowebshop.tricentis.com/digital-downloads";
		String url_storedf2 = "https://demowebshop.tricentis.com/cart";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//div[@class = 'header-menu']/ul[1]/li[5]")).click();
		
		String current_url = driver.getCurrentUrl();
		if (url_stored.equalsIgnoreCase(current_url)) {
			System.out.println("The webdriver is okay");
		}
		else {
			System.out.println("Thw webdriver is wrong");
		}
	
		List<WebElement> links = driver.findElements(By.xpath("//input[@value=\"Add to cart\"]"));
		for(WebElement web : links) {
	    	web.click();
	        Thread.sleep(2000);
	    //driver.navigate().back();
		}
	    	driver.findElement(By.xpath("//span[@class = 'cart-label']")).click();
	    	
		String current_url2 = driver.getCurrentUrl();
		
		if(url_storedf2.equalsIgnoreCase(current_url2)) {
			
			System.out.println("The webdriver is okay");
		}
		else {
			System.out.println("The webdrive is wrong");
		}
	
		List<WebElement> links1 = driver.findElements(By.xpath("//input[@name='removefromcart']"));
		for(WebElement web2 : links1) {
	    	web2.click();
	       Thread.sleep(2000);
	    //	driver.navigate().back();
	       }
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		driver.close();
	}
}
