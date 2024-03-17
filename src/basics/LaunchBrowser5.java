package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser5 {
	
		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.dominos.co.in/");
			driver.manage().window().minimize();
			driver.close();
		}

	}

