package basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutePathMultipleElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    List<WebElement> links = driver.findElements(By.xpath("html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li/a"));
         
	    for(WebElement web : links) {
	    	web.click();
	    	Thread.sleep(2000);
	    	driver.navigate().back();
	    }
	    
//	    for (int i = 0; i <links.size(); i++) {
//	    	links.get(i).click();
//	    	driver.navigate().back();
//	    }
	    
//	    Iterator<WebElement> li = links.iterator();
//	    while(li.hasNext()) {
//	    	li.next().click();
//	    	driver.navigate().back();
	  //  }
	}

}
