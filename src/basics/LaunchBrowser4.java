package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser4 {
	
		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.cardekho.com/");
			driver.close();
			
		}

	}
