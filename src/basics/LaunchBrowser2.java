package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser2 {
	
		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://online.kfc.co.in/");
			driver.close();
			
		}

	}
