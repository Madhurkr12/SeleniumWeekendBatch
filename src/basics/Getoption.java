package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Madhur/Downloads/demo.html");
		WebElement single_dropdown = driver.findElement(By.id("standard_cars"));
		Select s_ref = new Select(single_dropdown);
		List<WebElement> cars = s_ref.getOptions();
		System.out.println(cars);
		int i =0;
		for (WebElement web : cars) {
			s_ref.selectByIndex(i++);
			Thread.sleep(1000);
		}
		
		
	}

}
