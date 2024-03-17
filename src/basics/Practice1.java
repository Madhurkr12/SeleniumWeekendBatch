package basics;

import org.openqa.selenium.By;

public class Practice1 extends ClassForRemovingRepeat{

	public static void main(String[] args) {

		precondition();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("pollanswers-1")).click();
		driver.findElement(By.id("pollanswers-2")).click();
		driver.findElement(By.id("pollanswers-3")).click();
		driver.findElement(By.id("pollanswers-4")).click();
		postcondition1();

			}
}
