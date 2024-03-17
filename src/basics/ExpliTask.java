package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpliTask {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Madhur");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kumar");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("B2B 214 Block");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("madhurkumar@indiamart.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9872538392");
		driver.findElement(By.xpath("//input[@ng-model='radiovalue']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		WebElement se2 = driver.findElement(By.xpath("//select[@ng-model='Skill']"));
		Select sel = new Select(se2);
		sel.selectByValue("Android");
		
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("India");
//		Thread.sleep(2000);
//		Select sel1 = new Select(se3);
//		Thread.sleep(2000);
//		sel1.selectByVisibleText("South Africa");
		Robot rn =new Robot();
		rn.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		WebElement se3 = driver.findElement(By.xpath("//select[@ng-model='yearbox']"))	;
		Select sel2 = new Select(se3);
		sel2.selectByValue("1999");
		
		WebElement se4 = driver.findElement(By.xpath("//select[@ng-model='monthbox']"))	;
		Select sel3 = new Select(se4);
		sel3.selectByValue("May");
		
		WebElement se5 = driver.findElement(By.xpath("//select[@ng-model='daybox']"))	;
		Select sel4 = new Select(se5);
		sel4.selectByValue("10");
		
		driver.findElement(By.id("firstpassword")).sendKeys("MadhurKK12@");
		driver.findElement(By.id("secondpassword")).sendKeys("MadhurKK12@");
		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\Madhur\\Downloads\\sh.png");
		
	}

}
