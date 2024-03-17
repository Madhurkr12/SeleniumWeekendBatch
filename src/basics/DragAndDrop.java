package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act = new Actions(driver);
		WebElement web1 = driver.findElement(By.id("box6"));
		WebElement web2 = driver.findElement(By.id("box106"));
		Thread.sleep(1000);
		act.dragAndDrop(web1, web2).build().perform();
		WebElement web3 = driver.findElement(By.id("box2"));
		WebElement web4 = driver.findElement(By.id("box102"));
		Thread.sleep(1000);
		act.dragAndDrop(web3, web4).build().perform();
		WebElement web5 = driver.findElement(By.id("box3"));
		WebElement web6 = driver.findElement(By.id("box103"));
		Thread.sleep(1000);
		act.dragAndDrop(web5, web6).build().perform();
		WebElement web7 = driver.findElement(By.id("box5"));
		WebElement web8 = driver.findElement(By.id("box105"));
		Thread.sleep(1000);
		act.dragAndDrop(web7, web8).build().perform();
		WebElement web9 = driver.findElement(By.id("box4"));
		WebElement web10 = driver.findElement(By.id("box104"));
		Thread.sleep(1000);
		act.dragAndDrop(web9, web10).build().perform();
		WebElement web11 = driver.findElement(By.id("box1"));
		WebElement web12= driver.findElement(By.id("box101"));
		Thread.sleep(1000);
		act.dragAndDrop(web11, web12).build().perform();
		WebElement web13 = driver.findElement(By.id("box7"));
		WebElement web14 = driver.findElement(By.id("box107"));
		Thread.sleep(1000);
		act.dragAndDrop(web13, web14).build().perform();

	}

}
