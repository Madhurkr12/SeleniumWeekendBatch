package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
	
		  WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   
		   driver.get("file:///C:/Users/Madhur/Downloads/demo.html");
			WebElement s_ref1  = driver.findElement(By.id("standard_cars"));
			WebElement s_ref2  = driver.findElement(By.id("multiple_cars"));
			
             Select single = new Select(s_ref1);
             Select multi = new Select(s_ref2);
           
             if (single.isMultiple()) {
            	 System.out.println("THis is a Multi select Dropdown");
            	 single.deselectByIndex(5);
             }
             else if (multi.isMultiple()){
            	 System.out.println("THis is a Multi select Dropdown");
            List<WebElement> brands= multi.getOptions();
            for (WebElement select : brands) {
				select.click();
				Thread.sleep(1000);
				
			}
            System.out.println("Now We are Deslecting all");
           
            multi.deselectAll();
             }
             
	}

}
