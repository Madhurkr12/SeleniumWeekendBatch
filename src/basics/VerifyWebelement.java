package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyWebelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement div = driver.findElement(By.xpath("//a[contains(text(), 'Digital downloads')]"));
		if(div.isDisplayed()) {
			System.out.println("The element is okay");
		}
		else {
			System.out.println("The element is wrong");
			
		}
		div.click();
		WebElement web2 = driver.findElement(By.name("products-orderby"));
		Thread.sleep(1000);
		Select web3 = new Select(web2);
		List<WebElement> option = web3.getOptions();
		int i =0;
		for ( WebElement web : option) {
			web2 = driver.findElement(By.name("products-orderby"));
			web3 = new Select(web2);
			web3.selectByIndex(i++);
			Thread.sleep(1000);
		}
		}
	}


