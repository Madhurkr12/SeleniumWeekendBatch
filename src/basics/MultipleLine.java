package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLine {

	public static void main(String[] args) {
	
	
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://demowebshop.tricentis.com/");
				//	driver.findElement(By.linkText("Register")).click();
					driver.findElement(By.className("ico-register")).click();
					driver.findElement(By.id("gender-male")).click();

	}

}
