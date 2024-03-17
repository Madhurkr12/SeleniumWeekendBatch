package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependant2 {

	public static void main(String[] args) throws InterruptedException {
		String title_1 = "Demo Web Shop";
		String title_2 = "Demo Web Shop. $25 Virtual Gift Card";
		String [] values = {"madhur", "mk09767@gmail.com", "Saksham", "Saksham98@gmail.com"};
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		if(title_1.equalsIgnoreCase(driver.getTitle())) {
			System.out.println("The title is correct");
		}
		else {
			System.out.println("The title is wrong");
		}
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
     	if(title_2.contains(driver.getTitle())) {
			System.out.println("The title is correct");	
			Thread.sleep(2000);
			List <WebElement> g = driver.findElements(By.xpath("//div[@class ='giftcard']/div/input"));
			Thread.sleep(2000);
			System.out.println(g.size());
			int i = 0;
			for(WebElement e : g ) {
				e.sendKeys(values[i++]);
			}}
		else {
			System.out.println("The title is wrong");
		}
     	
     	String d=driver.findElement(By.xpath("//span[@itemprop='price']")).getText();
     	driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']")).clear();
     	driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']")).sendKeys("5");
     	
	}

}
