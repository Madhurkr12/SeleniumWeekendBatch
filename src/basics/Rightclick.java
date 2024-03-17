package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Rightclick {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		Actions acts= new Actions(driver);
		WebElement right_click=driver.findElement(By.xpath("//span[text()='right click me']"));
		Thread.sleep(2000);
		acts.moveToElement(right_click).contextClick().build().perform();
		Thread.sleep(2000);
				        driver.findElement(By.xpath("//span[text()='Paste']")).click();
				        Thread.sleep(2000);
				        try {
				        	right_click.click();
				        	 System.out.print("MY PROG IS UN-SUCCESFUL");
				        }
				        catch(UnhandledAlertException e){
				        	 System.out.print("MY PROG IS SUCCESFUL");
				        }
				        catch(NoSuchElementException e){
				       	 System.out.print("MY PROG IS SUCCESFUL");
				       }
				        catch(Exception e){
				       	 System.out.print("MY PROG IS SUCCESFUL");
				       }
	}


}

