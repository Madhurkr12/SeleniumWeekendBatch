package exerciseselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testcase2 extends TestCase1{
	public static WebDriver precondition2(){
		WebDriver driver = precondition1();
		driver.findElement(By.xpath("//button[@name='loginBtn']")).click();
		driver.findElement(By.cssSelector("[id='vertical-tab-0']")).click();
		return driver;
	}

	public static void main(String[] args) {
		
		precondition2();
	}
	
}
