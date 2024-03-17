package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Entervalue {
	

		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			//driver.findElement(By.name("search-box")).sendKeys("Books");
			driver.findElement(By.id("small-searchterms")).sendKeys("Books");
			driver.wait(10);
			driver.close();
	       
			

		}

	}
