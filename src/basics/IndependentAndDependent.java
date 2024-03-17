package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependent {

	public static void main(String[] args) {
	String given_url = "https://demowebshop.tricentis.com/digital-downloads";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/digital-downloads");
	if(given_url.equalsIgnoreCase(driver.getCurrentUrl())) {
		System.out.println("Working fine");
		WebElement price = driver.findElement(By.xpath("(//h2[@class='product-title'])[3]/../div[3]/div/span"));
		System.out.println(price.getText());
	}
	else {
		System.out.println("Not working");
	}

	}

}
