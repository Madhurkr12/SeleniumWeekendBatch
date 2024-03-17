package basics;

import org.openqa.selenium.By;


public class Logout_login extends ClassForRemovingRepeat {

	public static void main(String[] args) {
		precondition();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.cssSelector("[id='FirstName']")).sendKeys("Madhur");
		driver.findElement(By.cssSelector("[id='LastName']")).sendKeys("Kumar");
		driver.findElement(By.cssSelector("[id='Email']")).sendKeys("madhur.kumar110@indiamart.com");
		driver.findElement(By.cssSelector("[id='Password']")).sendKeys("M@dhur000");
		driver.findElement(By.cssSelector("[id='ConfirmPassword']")).sendKeys("M@dhur000");
		driver.findElement(By.cssSelector("[id='register-button']")).click();
		driver.findElement(By.cssSelector("[value='Continue']")).click();
		driver.findElement(By.className("ico-logout")).click();
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.cssSelector("[class='email']")).sendKeys("madhur.kumar110@indiamart.com");
		driver.findElement(By.cssSelector("[class='password']")).sendKeys("M@dhur000");
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		//driver.findElement(By.className("Digital downloads")).click();
		postcondition1();
		
		
		
		

	}

}
